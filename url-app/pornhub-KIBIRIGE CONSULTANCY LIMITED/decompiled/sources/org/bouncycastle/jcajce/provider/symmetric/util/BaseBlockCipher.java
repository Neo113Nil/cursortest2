package org.bouncycastle.jcajce.provider.symmetric.util;

import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DefaultBufferedBlockCipher;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.engines.DSTU7624Engine;
import org.bouncycastle.crypto.fpe.FPEEngine;
import org.bouncycastle.crypto.fpe.FPEFF1Engine;
import org.bouncycastle.crypto.fpe.FPEFF3_1Engine;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CCMBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.CTSBlockCipher;
import org.bouncycastle.crypto.modes.EAXBlockCipher;
import org.bouncycastle.crypto.modes.GCFBBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.modes.GOFBBlockCipher;
import org.bouncycastle.crypto.modes.KCCMBlockCipher;
import org.bouncycastle.crypto.modes.KCTRBlockCipher;
import org.bouncycastle.crypto.modes.KGCMBlockCipher;
import org.bouncycastle.crypto.modes.OCBBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.crypto.modes.OpenPGPCFBBlockCipher;
import org.bouncycastle.crypto.modes.PGPCFBBlockCipher;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.paddings.BlockCipherPadding;
import org.bouncycastle.crypto.paddings.ISO10126d2Padding;
import org.bouncycastle.crypto.paddings.ISO7816d4Padding;
import org.bouncycastle.crypto.paddings.PKCS7Padding;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.paddings.TBCPadding;
import org.bouncycastle.crypto.paddings.X923Padding;
import org.bouncycastle.crypto.paddings.ZeroBytePadding;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.FPEParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.crypto.params.RC2Parameters;
import org.bouncycastle.crypto.params.RC5Parameters;
import org.bouncycastle.internal.asn1.cms.GCMParameters;
import org.bouncycastle.jcajce.PBKDF1Key;
import org.bouncycastle.jcajce.PBKDF1KeyWithParameters;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jcajce.PKCS12KeyWithParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.jcajce.spec.AEADParameterSpec;
import org.bouncycastle.jcajce.spec.FPEParameterSpec;
import org.bouncycastle.jcajce.spec.GOST28147ParameterSpec;
import org.bouncycastle.jcajce.spec.RepeatedSecretKeySpec;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: classes3.dex */
public class BaseBlockCipher extends BaseWrapCipher implements PBE {
    private static final int BUF_SIZE = 512;
    private static final Class[] availableSpecs = {RC2ParameterSpec.class, RC5ParameterSpec.class, GcmSpecUtil.gcmSpecClass, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
    private AEADParameters aeadParams;
    private BlockCipher baseEngine;
    private GenericBlockCipher cipher;
    private int digest;
    private BlockCipherProvider engineProvider;
    private boolean fixedIv;
    private int ivLength;
    private ParametersWithIV ivParam;
    private int keySizeInBits;
    private String modeName;
    private boolean padded;
    private String pbeAlgorithm;
    private PBEParameterSpec pbeSpec;
    private int scheme;

    private static class AEADGenericBlockCipher implements GenericBlockCipher {
        private static final Constructor aeadBadTagConstructor;
        private AEADCipher cipher;

        static {
            Class loadClass = ClassUtil.loadClass(BaseBlockCipher.class, "javax.crypto.AEADBadTagException");
            aeadBadTagConstructor = loadClass != null ? findExceptionConstructor(loadClass) : null;
        }

        AEADGenericBlockCipher(AEADCipher aEADCipher) {
            this.cipher = aEADCipher;
        }

        private static Constructor findExceptionConstructor(Class cls) {
            try {
                return cls.getConstructor(String.class);
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int doFinal(byte[] bArr, int i) throws IllegalStateException, BadPaddingException {
            BadPaddingException badPaddingException;
            try {
                return this.cipher.doFinal(bArr, i);
            } catch (InvalidCipherTextException e) {
                Constructor constructor = aeadBadTagConstructor;
                if (constructor != null) {
                    try {
                        badPaddingException = (BadPaddingException) constructor.newInstance(e.getMessage());
                    } catch (Exception unused) {
                        badPaddingException = null;
                    }
                    if (badPaddingException != null) {
                        throw badPaddingException;
                    }
                }
                throw new BadPaddingException(e.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public String getAlgorithmName() {
            AEADCipher aEADCipher = this.cipher;
            return aEADCipher instanceof AEADBlockCipher ? ((AEADBlockCipher) aEADCipher).getUnderlyingCipher().getAlgorithmName() : aEADCipher.getAlgorithmName();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getOutputSize(int i) {
            return this.cipher.getOutputSize(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public BlockCipher getUnderlyingCipher() {
            AEADCipher aEADCipher = this.cipher;
            if (aEADCipher instanceof AEADBlockCipher) {
                return ((AEADBlockCipher) aEADCipher).getUnderlyingCipher();
            }
            return null;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getUpdateOutputSize(int i) {
            return this.cipher.getUpdateOutputSize(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
            this.cipher.init(z, cipherParameters);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processByte(byte b, byte[] bArr, int i) throws DataLengthException {
            return this.cipher.processByte(b, bArr, i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
            return this.cipher.processBytes(bArr, i, i2, bArr2, i3);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void updateAAD(byte[] bArr, int i, int i2) {
            this.cipher.processAADBytes(bArr, i, i2);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public boolean wrapOnNoPadding() {
            return false;
        }
    }

    private static class BufferedFPEBlockCipher implements GenericBlockCipher {
        private FPEEngine cipher;
        private BaseWrapCipher.ErasableOutputStream eOut = new BaseWrapCipher.ErasableOutputStream();

        BufferedFPEBlockCipher(FPEEngine fPEEngine) {
            this.cipher = fPEEngine;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int doFinal(byte[] bArr, int i) throws IllegalStateException, BadPaddingException {
            try {
                return this.cipher.processBlock(this.eOut.getBuf(), 0, this.eOut.size(), bArr, i);
            } finally {
                this.eOut.erase();
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public String getAlgorithmName() {
            return this.cipher.getAlgorithmName();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getOutputSize(int i) {
            return this.eOut.size() + i;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public BlockCipher getUnderlyingCipher() {
            throw new IllegalStateException("not applicable for FPE");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getUpdateOutputSize(int i) {
            return 0;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
            this.cipher.init(z, cipherParameters);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processByte(byte b, byte[] bArr, int i) throws DataLengthException {
            this.eOut.write(b);
            return 0;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
            this.eOut.write(bArr, i, i2);
            return 0;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void updateAAD(byte[] bArr, int i, int i2) {
            throw new UnsupportedOperationException("AAD is not supported in the current mode.");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public boolean wrapOnNoPadding() {
            return false;
        }
    }

    private static class BufferedGenericBlockCipher implements GenericBlockCipher {
        private BufferedBlockCipher cipher;

        BufferedGenericBlockCipher(BlockCipher blockCipher) {
            this(blockCipher, new PKCS7Padding());
        }

        BufferedGenericBlockCipher(BlockCipher blockCipher, BlockCipherPadding blockCipherPadding) {
            this.cipher = new PaddedBufferedBlockCipher(blockCipher, blockCipherPadding);
        }

        BufferedGenericBlockCipher(BufferedBlockCipher bufferedBlockCipher) {
            this.cipher = bufferedBlockCipher;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int doFinal(byte[] bArr, int i) throws IllegalStateException, BadPaddingException {
            try {
                return this.cipher.doFinal(bArr, i);
            } catch (InvalidCipherTextException e) {
                throw new BadPaddingException(e.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public String getAlgorithmName() {
            return this.cipher.getUnderlyingCipher().getAlgorithmName();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getOutputSize(int i) {
            return this.cipher.getOutputSize(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public BlockCipher getUnderlyingCipher() {
            return this.cipher.getUnderlyingCipher();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getUpdateOutputSize(int i) {
            return this.cipher.getUpdateOutputSize(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
            this.cipher.init(z, cipherParameters);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processByte(byte b, byte[] bArr, int i) throws DataLengthException {
            return this.cipher.processByte(b, bArr, i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
            return this.cipher.processBytes(bArr, i, i2, bArr2, i3);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void updateAAD(byte[] bArr, int i, int i2) {
            throw new UnsupportedOperationException("AAD is not supported in the current mode.");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public boolean wrapOnNoPadding() {
            return !(this.cipher instanceof CTSBlockCipher);
        }
    }

    private interface GenericBlockCipher {
        int doFinal(byte[] bArr, int i) throws IllegalStateException, BadPaddingException;

        String getAlgorithmName();

        int getOutputSize(int i);

        BlockCipher getUnderlyingCipher();

        int getUpdateOutputSize(int i);

        void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException;

        int processByte(byte b, byte[] bArr, int i) throws DataLengthException;

        int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException;

        void updateAAD(byte[] bArr, int i, int i2);

        boolean wrapOnNoPadding();
    }

    protected BaseBlockCipher(BlockCipher blockCipher) {
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipher;
        this.cipher = new BufferedGenericBlockCipher(blockCipher);
    }

    protected BaseBlockCipher(BlockCipher blockCipher, int i) {
        this(blockCipher, true, i);
    }

    protected BaseBlockCipher(BlockCipher blockCipher, int i, int i2, int i3, int i4) {
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipher;
        this.scheme = i;
        this.digest = i2;
        this.keySizeInBits = i3;
        this.ivLength = i4;
        this.cipher = new BufferedGenericBlockCipher(blockCipher);
    }

    protected BaseBlockCipher(BlockCipher blockCipher, boolean z, int i) {
        this.scheme = -1;
        this.ivLength = 0;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipher;
        this.fixedIv = z;
        this.cipher = new BufferedGenericBlockCipher(blockCipher);
        this.ivLength = i / 8;
    }

    protected BaseBlockCipher(BufferedBlockCipher bufferedBlockCipher, int i) {
        this(bufferedBlockCipher, true, i);
    }

    protected BaseBlockCipher(BufferedBlockCipher bufferedBlockCipher, boolean z, int i) {
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = bufferedBlockCipher.getUnderlyingCipher();
        this.cipher = new BufferedGenericBlockCipher(bufferedBlockCipher);
        this.fixedIv = z;
        this.ivLength = i / 8;
    }

    protected BaseBlockCipher(AEADBlockCipher aEADBlockCipher) {
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = aEADBlockCipher.getUnderlyingCipher();
        this.ivLength = aEADBlockCipher.getAlgorithmName().indexOf("GCM") >= 0 ? 12 : this.baseEngine.getBlockSize();
        this.cipher = new AEADGenericBlockCipher(aEADBlockCipher);
    }

    protected BaseBlockCipher(AEADBlockCipher aEADBlockCipher, boolean z, int i) {
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = aEADBlockCipher.getUnderlyingCipher();
        this.fixedIv = z;
        this.ivLength = i;
        this.cipher = new AEADGenericBlockCipher(aEADBlockCipher);
    }

    protected BaseBlockCipher(AEADCipher aEADCipher, boolean z, int i) {
        this.scheme = -1;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = null;
        this.fixedIv = z;
        this.ivLength = i;
        this.cipher = new AEADGenericBlockCipher(aEADCipher);
    }

    protected BaseBlockCipher(BlockCipherProvider blockCipherProvider) {
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipherProvider.get();
        this.engineProvider = blockCipherProvider;
        this.cipher = new BufferedGenericBlockCipher(blockCipherProvider.get());
    }

    private CipherParameters adjustParameters(AlgorithmParameterSpec algorithmParameterSpec, CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithIV) {
            CipherParameters parameters = ((ParametersWithIV) cipherParameters).getParameters();
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                ParametersWithIV parametersWithIV = new ParametersWithIV(parameters, ((IvParameterSpec) algorithmParameterSpec).getIV());
                this.ivParam = parametersWithIV;
                return parametersWithIV;
            }
            if (algorithmParameterSpec instanceof GOST28147ParameterSpec) {
                GOST28147ParameterSpec gOST28147ParameterSpec = (GOST28147ParameterSpec) algorithmParameterSpec;
                ParametersWithSBox parametersWithSBox = new ParametersWithSBox(cipherParameters, gOST28147ParameterSpec.getSBox());
                if (gOST28147ParameterSpec.getIV() == null || this.ivLength == 0) {
                    return parametersWithSBox;
                }
                ParametersWithIV parametersWithIV2 = new ParametersWithIV(parameters, gOST28147ParameterSpec.getIV());
                this.ivParam = parametersWithIV2;
                return parametersWithIV2;
            }
        } else {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                ParametersWithIV parametersWithIV3 = new ParametersWithIV(cipherParameters, ((IvParameterSpec) algorithmParameterSpec).getIV());
                this.ivParam = parametersWithIV3;
                return parametersWithIV3;
            }
            if (algorithmParameterSpec instanceof GOST28147ParameterSpec) {
                GOST28147ParameterSpec gOST28147ParameterSpec2 = (GOST28147ParameterSpec) algorithmParameterSpec;
                ParametersWithSBox parametersWithSBox2 = new ParametersWithSBox(cipherParameters, gOST28147ParameterSpec2.getSBox());
                return (gOST28147ParameterSpec2.getIV() == null || this.ivLength == 0) ? parametersWithSBox2 : new ParametersWithIV(parametersWithSBox2, gOST28147ParameterSpec2.getIV());
            }
        }
        return cipherParameters;
    }

    private boolean isAEADModeName(String str) {
        return "CCM".equals(str) || "EAX".equals(str) || "GCM".equals(str) || "GCM-SIV".equals(str) || "OCB".equals(str);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException {
        byte[] bArr3;
        int i4;
        int processBytes;
        if (engineGetOutputSize(i2) + i3 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        if (i2 != 0) {
            try {
                bArr3 = bArr2;
                i4 = i3;
                processBytes = this.cipher.processBytes(bArr, i, i2, bArr3, i4);
            } catch (OutputLengthException e) {
                throw new IllegalBlockSizeException(e.getMessage());
            } catch (DataLengthException e2) {
                throw new IllegalBlockSizeException(e2.getMessage());
            }
        } else {
            bArr3 = bArr2;
            i4 = i3;
            processBytes = 0;
        }
        return processBytes + this.cipher.doFinal(bArr3, i4 + processBytes);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        int engineGetOutputSize = engineGetOutputSize(i2);
        byte[] bArr2 = new byte[engineGetOutputSize];
        int processBytes = i2 != 0 ? this.cipher.processBytes(bArr, i, i2, bArr2, 0) : 0;
        try {
            int doFinal = processBytes + this.cipher.doFinal(bArr2, processBytes);
            if (doFinal == engineGetOutputSize) {
                return bArr2;
            }
            if (doFinal > engineGetOutputSize) {
                throw new IllegalBlockSizeException("internal buffer overflow");
            }
            byte[] bArr3 = new byte[doFinal];
            System.arraycopy(bArr2, 0, bArr3, 0, doFinal);
            return bArr3;
        } catch (DataLengthException e) {
            throw new IllegalBlockSizeException(e.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        BlockCipher blockCipher = this.baseEngine;
        if (blockCipher == null) {
            return -1;
        }
        return blockCipher.getBlockSize();
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        AEADParameters aEADParameters = this.aeadParams;
        if (aEADParameters != null) {
            return aEADParameters.getNonce();
        }
        ParametersWithIV parametersWithIV = this.ivParam;
        if (parametersWithIV != null) {
            return parametersWithIV.getIV();
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i) {
        return this.cipher.getOutputSize(i);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null) {
            if (this.pbeSpec != null) {
                try {
                    this.engineParams = createParametersInstance(this.pbeAlgorithm);
                    this.engineParams.init(this.pbeSpec);
                } catch (Exception unused) {
                    return null;
                }
            } else if (this.aeadParams != null) {
                if (this.baseEngine == null) {
                    try {
                        this.engineParams = createParametersInstance(PKCSObjectIdentifiers.id_alg_AEADChaCha20Poly1305.getId());
                        this.engineParams.init(new DEROctetString(this.aeadParams.getNonce()).getEncoded());
                    } catch (Exception e) {
                        throw new RuntimeException(e.toString());
                    }
                } else {
                    try {
                        this.engineParams = createParametersInstance("GCM");
                        this.engineParams.init(new GCMParameters(this.aeadParams.getNonce(), this.aeadParams.getMacSize() / 8).getEncoded());
                    } catch (Exception e2) {
                        throw new RuntimeException(e2.toString());
                    }
                }
            } else if (this.ivParam != null) {
                String algorithmName = this.cipher.getUnderlyingCipher().getAlgorithmName();
                if (algorithmName.indexOf(47) >= 0) {
                    algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
                }
                try {
                    this.engineParams = createParametersInstance(algorithmName);
                    this.engineParams.init(new IvParameterSpec(this.ivParam.getIV()));
                } catch (Exception e3) {
                    throw new RuntimeException(e3.toString());
                }
            }
        }
        return this.engineParams;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec;
        if (algorithmParameters != null) {
            algorithmParameterSpec = SpecUtil.extractSpec(algorithmParameters, availableSpecs);
            if (algorithmParameterSpec == null) {
                throw new InvalidAlgorithmParameterException("can't handle parameter " + algorithmParameters.toString());
            }
        } else {
            algorithmParameterSpec = null;
        }
        engineInit(i, key, algorithmParameterSpec, secureRandom);
        this.engineParams = algorithmParameters;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x00fc, code lost:
    
        if (r8 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x014a, code lost:
    
        if (r8 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0206, code lost:
    
        if (r8 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        if (r8 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        r21.ivParam = (org.bouncycastle.crypto.params.ParametersWithIV) r6;
        r6 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04e6 A[Catch: Exception -> 0x050d, IllegalArgumentException -> 0x0518, TryCatch #3 {IllegalArgumentException -> 0x0518, Exception -> 0x050d, blocks: (B:72:0x04bb, B:73:0x04d3, B:74:0x04d4, B:75:0x04e0, B:77:0x04e6, B:79:0x04ea, B:83:0x04db), top: B:67:0x04b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        CipherParameters cipherParameters;
        CipherParameters fPEParameters;
        ParametersWithIV parametersWithIV;
        CipherParameters cipherParameters2;
        GenericBlockCipher genericBlockCipher;
        AEADParameters aEADParameters;
        CipherParameters cipherParameters3;
        CipherParameters cipherParameters4;
        BlockCipher blockCipher;
        CipherParameters cipherParameters5 = null;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.engineParams = null;
        this.aeadParams = null;
        if (!(key instanceof SecretKey)) {
            throw new InvalidKeyException("Key for algorithm " + (key != null ? key.getAlgorithm() : null) + " not suitable for symmetric enryption.");
        }
        if (algorithmParameterSpec == null && (blockCipher = this.baseEngine) != null && blockCipher.getAlgorithmName().startsWith("RC5-64")) {
            throw new InvalidAlgorithmParameterException("RC5 requires an RC5ParametersSpec to be passed in.");
        }
        int i2 = this.scheme;
        if (i2 == 2 || (key instanceof PKCS12Key)) {
            try {
                SecretKey secretKey = (SecretKey) key;
                if (algorithmParameterSpec instanceof PBEParameterSpec) {
                    this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
                }
                boolean z = secretKey instanceof PBEKey;
                if (z && this.pbeSpec == null) {
                    PBEKey pBEKey = (PBEKey) secretKey;
                    if (pBEKey.getSalt() == null) {
                        throw new InvalidAlgorithmParameterException("PBEKey requires parameters to specify salt");
                    }
                    this.pbeSpec = new PBEParameterSpec(pBEKey.getSalt(), pBEKey.getIterationCount());
                }
                if (this.pbeSpec == null && !z) {
                    throw new InvalidKeyException("Algorithm requires a PBE key");
                }
                if (key instanceof BCPBEKey) {
                    CipherParameters param = ((BCPBEKey) key).getParam();
                    if (!(param instanceof ParametersWithIV)) {
                        if (param != null) {
                            throw new InvalidKeyException("Algorithm requires a PBE key suitable for PKCS12");
                        }
                        param = PBE.Util.makePBEParameters(secretKey.getEncoded(), 2, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
                    }
                    cipherParameters = param;
                } else {
                    cipherParameters = PBE.Util.makePBEParameters(secretKey.getEncoded(), 2, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
                }
                boolean z2 = cipherParameters instanceof ParametersWithIV;
                cipherParameters3 = cipherParameters;
                cipherParameters5 = cipherParameters;
            } catch (Exception unused) {
                throw new InvalidKeyException("PKCS12 requires a SecretKey/PBEKey");
            }
        } else if (key instanceof PBKDF1Key) {
            PBKDF1Key pBKDF1Key = (PBKDF1Key) key;
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
            }
            if ((pBKDF1Key instanceof PBKDF1KeyWithParameters) && this.pbeSpec == null) {
                PBKDF1KeyWithParameters pBKDF1KeyWithParameters = (PBKDF1KeyWithParameters) pBKDF1Key;
                this.pbeSpec = new PBEParameterSpec(pBKDF1KeyWithParameters.getSalt(), pBKDF1KeyWithParameters.getIterationCount());
            }
            CipherParameters makePBEParameters = PBE.Util.makePBEParameters(pBKDF1Key.getEncoded(), 0, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
            boolean z3 = makePBEParameters instanceof ParametersWithIV;
            cipherParameters3 = makePBEParameters;
            cipherParameters5 = makePBEParameters;
        } else if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            this.pbeAlgorithm = bCPBEKey.getOID() != null ? bCPBEKey.getOID().getId() : bCPBEKey.getAlgorithm();
            if (bCPBEKey.getParam() != null) {
                cipherParameters4 = adjustParameters(algorithmParameterSpec, bCPBEKey.getParam());
            } else {
                if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                }
                this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
                cipherParameters4 = PBE.Util.makePBEParameters(bCPBEKey, algorithmParameterSpec, this.cipher.getUnderlyingCipher().getAlgorithmName());
            }
            boolean z4 = cipherParameters4 instanceof ParametersWithIV;
            cipherParameters3 = cipherParameters4;
            cipherParameters5 = cipherParameters4;
        } else {
            if (key instanceof PBEKey) {
                PBEKey pBEKey2 = (PBEKey) key;
                PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                this.pbeSpec = pBEParameterSpec;
                if ((pBEKey2 instanceof PKCS12KeyWithParameters) && pBEParameterSpec == null) {
                    this.pbeSpec = new PBEParameterSpec(pBEKey2.getSalt(), pBEKey2.getIterationCount());
                }
                CipherParameters makePBEParameters2 = PBE.Util.makePBEParameters(pBEKey2.getEncoded(), this.scheme, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
                boolean z5 = makePBEParameters2 instanceof ParametersWithIV;
                cipherParameters3 = makePBEParameters2;
                cipherParameters5 = makePBEParameters2;
            } else if (!(key instanceof RepeatedSecretKeySpec)) {
                if (i2 == 0 || i2 == 4 || i2 == 1 || i2 == 5) {
                    throw new InvalidKeyException("Algorithm requires a PBE key");
                }
                cipherParameters5 = new KeyParameter(key.getEncoded());
            }
            try {
                if (!(algorithmParameterSpec instanceof AEADParameterSpec)) {
                    if (algorithmParameterSpec instanceof IvParameterSpec) {
                        if (this.ivLength != 0) {
                            IvParameterSpec ivParameterSpec = (IvParameterSpec) algorithmParameterSpec;
                            if (ivParameterSpec.getIV().length != this.ivLength && !(this.cipher instanceof AEADGenericBlockCipher) && this.fixedIv) {
                                throw new InvalidAlgorithmParameterException("IV must be " + this.ivLength + " bytes long.");
                            }
                            ParametersWithIV parametersWithIV2 = cipherParameters5 instanceof ParametersWithIV ? new ParametersWithIV(((ParametersWithIV) cipherParameters5).getParameters(), ivParameterSpec.getIV()) : new ParametersWithIV(cipherParameters5, ivParameterSpec.getIV());
                            this.ivParam = parametersWithIV2;
                            fPEParameters = parametersWithIV2;
                        } else {
                            String str = this.modeName;
                            fPEParameters = cipherParameters5;
                            if (str != null) {
                                fPEParameters = cipherParameters5;
                                if (str.equals("ECB")) {
                                    throw new InvalidAlgorithmParameterException("ECB mode does not use an IV");
                                }
                            }
                        }
                    } else if (algorithmParameterSpec instanceof GOST28147ParameterSpec) {
                        GOST28147ParameterSpec gOST28147ParameterSpec = (GOST28147ParameterSpec) algorithmParameterSpec;
                        CipherParameters parametersWithSBox = new ParametersWithSBox(new KeyParameter(key.getEncoded()), gOST28147ParameterSpec.getSBox());
                        fPEParameters = parametersWithSBox;
                        if (gOST28147ParameterSpec.getIV() != null) {
                            fPEParameters = parametersWithSBox;
                            if (this.ivLength != 0) {
                                parametersWithIV = parametersWithSBox instanceof ParametersWithIV ? new ParametersWithIV(((ParametersWithIV) parametersWithSBox).getParameters(), gOST28147ParameterSpec.getIV()) : new ParametersWithIV(parametersWithSBox, gOST28147ParameterSpec.getIV());
                                this.ivParam = parametersWithIV;
                                fPEParameters = parametersWithIV;
                            }
                        }
                    } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
                        RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
                        CipherParameters rC2Parameters = new RC2Parameters(key.getEncoded(), rC2ParameterSpec.getEffectiveKeyBits());
                        fPEParameters = rC2Parameters;
                        if (rC2ParameterSpec.getIV() != null) {
                            fPEParameters = rC2Parameters;
                            if (this.ivLength != 0) {
                                parametersWithIV = rC2Parameters instanceof ParametersWithIV ? new ParametersWithIV(((ParametersWithIV) rC2Parameters).getParameters(), rC2ParameterSpec.getIV()) : new ParametersWithIV(rC2Parameters, rC2ParameterSpec.getIV());
                                this.ivParam = parametersWithIV;
                                fPEParameters = parametersWithIV;
                            }
                        }
                    } else if (algorithmParameterSpec instanceof RC5ParameterSpec) {
                        RC5ParameterSpec rC5ParameterSpec = (RC5ParameterSpec) algorithmParameterSpec;
                        CipherParameters rC5Parameters = new RC5Parameters(key.getEncoded(), rC5ParameterSpec.getRounds());
                        if (!this.baseEngine.getAlgorithmName().startsWith("RC5")) {
                            throw new InvalidAlgorithmParameterException("RC5 parameters passed to a cipher that is not RC5.");
                        }
                        if (this.baseEngine.getAlgorithmName().equals("RC5-32")) {
                            if (rC5ParameterSpec.getWordSize() != 32) {
                                throw new InvalidAlgorithmParameterException("RC5 already set up for a word size of 32 not " + rC5ParameterSpec.getWordSize() + ".");
                            }
                        } else if (this.baseEngine.getAlgorithmName().equals("RC5-64") && rC5ParameterSpec.getWordSize() != 64) {
                            throw new InvalidAlgorithmParameterException("RC5 already set up for a word size of 64 not " + rC5ParameterSpec.getWordSize() + ".");
                        }
                        fPEParameters = rC5Parameters;
                        if (rC5ParameterSpec.getIV() != null) {
                            fPEParameters = rC5Parameters;
                            if (this.ivLength != 0) {
                                parametersWithIV = rC5Parameters instanceof ParametersWithIV ? new ParametersWithIV(((ParametersWithIV) rC5Parameters).getParameters(), rC5ParameterSpec.getIV()) : new ParametersWithIV(rC5Parameters, rC5ParameterSpec.getIV());
                                this.ivParam = parametersWithIV;
                                fPEParameters = parametersWithIV;
                            }
                        }
                    } else if (algorithmParameterSpec instanceof FPEParameterSpec) {
                        FPEParameterSpec fPEParameterSpec = (FPEParameterSpec) algorithmParameterSpec;
                        fPEParameters = new FPEParameters((KeyParameter) cipherParameters5, fPEParameterSpec.getRadixConverter(), fPEParameterSpec.getTweak(), fPEParameterSpec.isUsingInverseFunction());
                    } else {
                        fPEParameters = cipherParameters5;
                        if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                            if (!isAEADModeName(this.modeName) && !(this.cipher instanceof AEADGenericBlockCipher)) {
                                throw new InvalidAlgorithmParameterException("GCMParameterSpec can only be used with AEAD modes.");
                            }
                            aEADParameters = GcmSpecUtil.extractAeadParameters(cipherParameters5 instanceof ParametersWithIV ? (KeyParameter) ((ParametersWithIV) cipherParameters5).getParameters() : (KeyParameter) cipherParameters5, algorithmParameterSpec);
                        } else if (algorithmParameterSpec != null) {
                            fPEParameters = cipherParameters5;
                            if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                                throw new InvalidAlgorithmParameterException("unknown parameter type.");
                            }
                        }
                    }
                    cipherParameters2 = fPEParameters;
                    if (this.ivLength != 0) {
                        boolean z6 = fPEParameters instanceof ParametersWithIV;
                        cipherParameters2 = fPEParameters;
                        if (!z6) {
                            boolean z7 = fPEParameters instanceof AEADParameters;
                            cipherParameters2 = fPEParameters;
                            if (!z7) {
                                SecureRandom secureRandom2 = secureRandom == null ? CryptoServicesRegistrar.getSecureRandom() : secureRandom;
                                if (i == 1 || i == 3) {
                                    byte[] bArr = new byte[this.ivLength];
                                    secureRandom2.nextBytes(bArr);
                                    ParametersWithIV parametersWithIV3 = new ParametersWithIV(fPEParameters, bArr);
                                    this.ivParam = parametersWithIV3;
                                    cipherParameters2 = parametersWithIV3;
                                } else {
                                    cipherParameters2 = fPEParameters;
                                    if (this.cipher.getUnderlyingCipher().getAlgorithmName().indexOf("PGPCFB") < 0) {
                                        throw new InvalidAlgorithmParameterException("no IV set when one expected");
                                    }
                                }
                            }
                        }
                    }
                    if (secureRandom != null && this.padded) {
                        cipherParameters2 = new ParametersWithRandom(cipherParameters2, secureRandom);
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    throw new InvalidParameterException("unknown opmode " + i + " passed");
                                }
                            }
                        }
                        this.cipher.init(false, cipherParameters2);
                        genericBlockCipher = this.cipher;
                        if ((genericBlockCipher instanceof AEADGenericBlockCipher) && this.aeadParams == null) {
                            this.aeadParams = new AEADParameters((KeyParameter) this.ivParam.getParameters(), ((AEADGenericBlockCipher) genericBlockCipher).cipher.getMac().length * 8, this.ivParam.getIV());
                            return;
                        }
                        return;
                    }
                    this.cipher.init(true, cipherParameters2);
                    genericBlockCipher = this.cipher;
                    if (genericBlockCipher instanceof AEADGenericBlockCipher) {
                        return;
                    } else {
                        return;
                    }
                }
                if (!isAEADModeName(this.modeName) && !(this.cipher instanceof AEADGenericBlockCipher)) {
                    throw new InvalidAlgorithmParameterException("AEADParameterSpec can only be used with AEAD modes.");
                }
                AEADParameterSpec aEADParameterSpec = (AEADParameterSpec) algorithmParameterSpec;
                aEADParameters = new AEADParameters(cipherParameters5 instanceof ParametersWithIV ? (KeyParameter) ((ParametersWithIV) cipherParameters5).getParameters() : (KeyParameter) cipherParameters5, aEADParameterSpec.getMacSizeInBits(), aEADParameterSpec.getNonce(), aEADParameterSpec.getAssociatedData());
                if (i != 1) {
                }
                this.cipher.init(true, cipherParameters2);
                genericBlockCipher = this.cipher;
                if (genericBlockCipher instanceof AEADGenericBlockCipher) {
                }
            } catch (IllegalArgumentException e) {
                throw new InvalidAlgorithmParameterException(e.getMessage(), e);
            } catch (Exception e2) {
                throw new BaseWrapCipher.InvalidKeyOrParametersException(e2.getMessage(), e2);
            }
            this.aeadParams = aEADParameters;
            fPEParameters = aEADParameters;
            cipherParameters2 = fPEParameters;
            if (this.ivLength != 0) {
            }
            if (secureRandom != null) {
                cipherParameters2 = new ParametersWithRandom(cipherParameters2, secureRandom);
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetMode(String str) throws NoSuchAlgorithmException {
        if (this.baseEngine == null) {
            throw new NoSuchAlgorithmException("no mode supported for this algorithm");
        }
        String upperCase = Strings.toUpperCase(str);
        this.modeName = upperCase;
        if (upperCase.equals("ECB")) {
            this.ivLength = 0;
            this.cipher = new BufferedGenericBlockCipher(this.baseEngine);
            return;
        }
        if (this.modeName.equals("CBC")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new BufferedGenericBlockCipher(CBCBlockCipher.newInstance(this.baseEngine));
            return;
        }
        if (this.modeName.startsWith("OFB")) {
            this.ivLength = this.baseEngine.getBlockSize();
            if (this.modeName.length() != 3) {
                this.cipher = new BufferedGenericBlockCipher(new OFBBlockCipher(this.baseEngine, Integer.parseInt(this.modeName.substring(3))));
                return;
            } else {
                BlockCipher blockCipher = this.baseEngine;
                this.cipher = new BufferedGenericBlockCipher(new OFBBlockCipher(blockCipher, blockCipher.getBlockSize() * 8));
                return;
            }
        }
        if (this.modeName.startsWith("CFB")) {
            this.ivLength = this.baseEngine.getBlockSize();
            if (this.modeName.length() != 3) {
                this.cipher = new BufferedGenericBlockCipher(CFBBlockCipher.newInstance(this.baseEngine, Integer.parseInt(this.modeName.substring(3))));
                return;
            } else {
                BlockCipher blockCipher2 = this.baseEngine;
                this.cipher = new BufferedGenericBlockCipher(CFBBlockCipher.newInstance(blockCipher2, blockCipher2.getBlockSize() * 8));
                return;
            }
        }
        if (this.modeName.startsWith("PGPCFB")) {
            boolean equals = this.modeName.equals("PGPCFBWITHIV");
            if (!equals && this.modeName.length() != 6) {
                throw new NoSuchAlgorithmException("no mode support for " + this.modeName);
            }
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new BufferedGenericBlockCipher(new PGPCFBBlockCipher(this.baseEngine, equals));
            return;
        }
        if (this.modeName.equals("OPENPGPCFB")) {
            this.ivLength = 0;
            this.cipher = new BufferedGenericBlockCipher(new OpenPGPCFBBlockCipher(this.baseEngine));
            return;
        }
        if (this.modeName.equals("FF1")) {
            this.ivLength = 0;
            this.cipher = new BufferedFPEBlockCipher(new FPEFF1Engine(this.baseEngine));
            return;
        }
        if (this.modeName.equals("FF3-1")) {
            this.ivLength = 0;
            this.cipher = new BufferedFPEBlockCipher(new FPEFF3_1Engine(this.baseEngine));
            return;
        }
        if (this.modeName.equals("SIC")) {
            int blockSize = this.baseEngine.getBlockSize();
            this.ivLength = blockSize;
            if (blockSize < 16) {
                throw new IllegalArgumentException("Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)");
            }
            this.fixedIv = false;
            this.cipher = new BufferedGenericBlockCipher(new DefaultBufferedBlockCipher(SICBlockCipher.newInstance(this.baseEngine)));
            return;
        }
        if (this.modeName.equals("CTR")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.fixedIv = false;
            if (this.baseEngine instanceof DSTU7624Engine) {
                this.cipher = new BufferedGenericBlockCipher(new DefaultBufferedBlockCipher(new KCTRBlockCipher(this.baseEngine)));
                return;
            } else {
                this.cipher = new BufferedGenericBlockCipher(new DefaultBufferedBlockCipher(SICBlockCipher.newInstance(this.baseEngine)));
                return;
            }
        }
        if (this.modeName.equals("GOFB")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new BufferedGenericBlockCipher(new DefaultBufferedBlockCipher(new GOFBBlockCipher(this.baseEngine)));
            return;
        }
        if (this.modeName.equals("GCFB")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new BufferedGenericBlockCipher(new DefaultBufferedBlockCipher(new GCFBBlockCipher(this.baseEngine)));
            return;
        }
        if (this.modeName.equals("CTS")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new BufferedGenericBlockCipher(new CTSBlockCipher(CBCBlockCipher.newInstance(this.baseEngine)));
            return;
        }
        if (this.modeName.equals("CCM")) {
            this.ivLength = 12;
            if (this.baseEngine instanceof DSTU7624Engine) {
                this.cipher = new AEADGenericBlockCipher(new KCCMBlockCipher(this.baseEngine));
                return;
            } else {
                this.cipher = new AEADGenericBlockCipher(CCMBlockCipher.newInstance(this.baseEngine));
                return;
            }
        }
        if (this.modeName.equals("OCB")) {
            if (this.engineProvider == null) {
                throw new NoSuchAlgorithmException("can't support mode " + str);
            }
            this.ivLength = 15;
            this.cipher = new AEADGenericBlockCipher(new OCBBlockCipher(this.baseEngine, this.engineProvider.get()));
            return;
        }
        if (this.modeName.equals("EAX")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new AEADGenericBlockCipher(new EAXBlockCipher(this.baseEngine));
            return;
        }
        if (this.modeName.equals("GCM-SIV")) {
            this.ivLength = 12;
            this.cipher = new AEADGenericBlockCipher(new GCMSIVBlockCipher(this.baseEngine));
        } else {
            if (!this.modeName.equals("GCM")) {
                throw new NoSuchAlgorithmException("can't support mode " + str);
            }
            BlockCipher blockCipher3 = this.baseEngine;
            if (blockCipher3 instanceof DSTU7624Engine) {
                this.ivLength = blockCipher3.getBlockSize();
                this.cipher = new AEADGenericBlockCipher(new KGCMBlockCipher(this.baseEngine));
            } else {
                this.ivLength = 12;
                this.cipher = new AEADGenericBlockCipher(GCMBlockCipher.newInstance(this.baseEngine));
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetPadding(String str) throws NoSuchPaddingException {
        BufferedGenericBlockCipher bufferedGenericBlockCipher;
        if (this.baseEngine == null) {
            throw new NoSuchPaddingException("no padding supported for this algorithm");
        }
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals("NOPADDING")) {
            if (!this.cipher.wrapOnNoPadding()) {
                return;
            } else {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(new DefaultBufferedBlockCipher(this.cipher.getUnderlyingCipher()));
            }
        } else if (upperCase.equals("WITHCTS") || upperCase.equals("CTSPADDING") || upperCase.equals("CS3PADDING")) {
            bufferedGenericBlockCipher = new BufferedGenericBlockCipher(new CTSBlockCipher(this.cipher.getUnderlyingCipher()));
        } else {
            this.padded = true;
            if (isAEADModeName(this.modeName)) {
                throw new NoSuchPaddingException("Only NoPadding can be used with AEAD modes.");
            }
            if (upperCase.equals("PKCS5PADDING") || upperCase.equals("PKCS7PADDING")) {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher());
            } else if (upperCase.equals("ZEROBYTEPADDING")) {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new ZeroBytePadding());
            } else if (upperCase.equals("ISO10126PADDING") || upperCase.equals("ISO10126-2PADDING")) {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new ISO10126d2Padding());
            } else if (upperCase.equals("X9.23PADDING") || upperCase.equals("X923PADDING")) {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new X923Padding());
            } else if (upperCase.equals("ISO7816-4PADDING") || upperCase.equals("ISO9797-1PADDING")) {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new ISO7816d4Padding());
            } else {
                if (!upperCase.equals("TBCPADDING")) {
                    throw new NoSuchPaddingException("Padding " + str + " unknown.");
                }
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new TBCPadding());
            }
        }
        this.cipher = bufferedGenericBlockCipher;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        if (this.cipher.getUpdateOutputSize(i2) + i3 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        try {
            return this.cipher.processBytes(bArr, i, i2, bArr2, i3);
        } catch (DataLengthException e) {
            throw new IllegalStateException(e.toString());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i, int i2) {
        int updateOutputSize = this.cipher.getUpdateOutputSize(i2);
        if (updateOutputSize <= 0) {
            this.cipher.processBytes(bArr, i, i2, null, 0);
            return null;
        }
        byte[] bArr2 = new byte[updateOutputSize];
        int processBytes = this.cipher.processBytes(bArr, i, i2, bArr2, 0);
        if (processBytes == 0) {
            return null;
        }
        if (processBytes == updateOutputSize) {
            return bArr2;
        }
        byte[] bArr3 = new byte[processBytes];
        System.arraycopy(bArr2, 0, bArr3, 0, processBytes);
        return bArr3;
    }

    @Override // javax.crypto.CipherSpi
    protected void engineUpdateAAD(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining < 1) {
            return;
        }
        if (byteBuffer.hasArray()) {
            engineUpdateAAD(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), remaining);
            byteBuffer.position(byteBuffer.limit());
            return;
        }
        if (remaining <= 512) {
            byte[] bArr = new byte[remaining];
            byteBuffer.get(bArr);
            engineUpdateAAD(bArr, 0, remaining);
            Arrays.fill(bArr, (byte) 0);
            return;
        }
        byte[] bArr2 = new byte[512];
        do {
            int min = Math.min(512, remaining);
            byteBuffer.get(bArr2, 0, min);
            engineUpdateAAD(bArr2, 0, min);
            remaining -= min;
        } while (remaining > 0);
        Arrays.fill(bArr2, (byte) 0);
    }

    @Override // javax.crypto.CipherSpi
    protected void engineUpdateAAD(byte[] bArr, int i, int i2) {
        this.cipher.updateAAD(bArr, i, i2);
    }
}
