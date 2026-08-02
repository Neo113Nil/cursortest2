package org.bouncycastle.pqc.crypto.mldsa;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.IOException;
import java.security.SecureRandom;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.ParametersWithContext;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.DigestUtils;

/* loaded from: classes10.dex */
public class HashMLDSASigner implements Signer {
    private static final byte[] EMPTY_CONTEXT = new byte[0];
    private Digest digest;
    private byte[] digestOIDEncoding;
    private MLDSAEngine engine;
    private MLDSAPrivateKeyParameters privKey;
    private MLDSAPublicKeyParameters pubKey;
    private SecureRandom random;

    private static Digest createDigest(MLDSAParameters mLDSAParameters) {
        int type2 = mLDSAParameters.getType();
        if (type2 == 0 || type2 == 1) {
            return new SHA512Digest();
        }
        a$$ExternalSyntheticBUOutline0.m$3("unknown parameters type");
        return null;
    }

    private SHAKEDigest finishPreHash() {
        int digestSize = this.digest.getDigestSize();
        byte[] bArr = new byte[digestSize];
        this.digest.doFinal(bArr, 0);
        SHAKEDigest shake256Digest = this.engine.getShake256Digest();
        byte[] bArr2 = this.digestOIDEncoding;
        shake256Digest.update(bArr2, 0, bArr2.length);
        shake256Digest.update(bArr, 0, digestSize);
        return shake256Digest;
    }

    private void initDigest(MLDSAParameters mLDSAParameters) {
        Digest createDigest = createDigest(mLDSAParameters);
        this.digest = createDigest;
        try {
            this.digestOIDEncoding = DigestUtils.getDigestOid(createDigest.getAlgorithmName()).getEncoded(ASN1Encoding.DER);
        } catch (IOException e) {
            a$$ExternalSyntheticBUOutline0.m$1(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("oid encoding failed: ")));
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        SHAKEDigest finishPreHash = finishPreHash();
        byte[] bArr = new byte[32];
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr);
        }
        MLDSAEngine mLDSAEngine = this.engine;
        MLDSAPrivateKeyParameters mLDSAPrivateKeyParameters = this.privKey;
        return mLDSAEngine.generateSignature(finishPreHash, mLDSAPrivateKeyParameters.rho, mLDSAPrivateKeyParameters.k, mLDSAPrivateKeyParameters.t0, mLDSAPrivateKeyParameters.s1, mLDSAPrivateKeyParameters.s2, bArr);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, CipherParameters cipherParameters) {
        MLDSAParameters parameters;
        byte[] bArr = EMPTY_CONTEXT;
        if (cipherParameters instanceof ParametersWithContext) {
            ParametersWithContext parametersWithContext = (ParametersWithContext) cipherParameters;
            bArr = parametersWithContext.getContext();
            cipherParameters = parametersWithContext.getParameters();
            if (bArr.length > 255) {
                a$$ExternalSyntheticBUOutline0.m$3("context too long");
                return;
            }
        }
        if (z) {
            this.pubKey = null;
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.privKey = (MLDSAPrivateKeyParameters) parametersWithRandom.getParameters();
                this.random = parametersWithRandom.getRandom();
            } else {
                this.privKey = (MLDSAPrivateKeyParameters) cipherParameters;
                this.random = null;
            }
            parameters = this.privKey.getParameters();
            MLDSAEngine engine = parameters.getEngine(this.random);
            this.engine = engine;
            engine.initSign(this.privKey.tr, true, bArr);
        } else {
            MLDSAPublicKeyParameters mLDSAPublicKeyParameters = (MLDSAPublicKeyParameters) cipherParameters;
            this.pubKey = mLDSAPublicKeyParameters;
            this.privKey = null;
            this.random = null;
            parameters = mLDSAPublicKeyParameters.getParameters();
            MLDSAEngine engine2 = parameters.getEngine(null);
            this.engine = engine2;
            MLDSAPublicKeyParameters mLDSAPublicKeyParameters2 = this.pubKey;
            engine2.initVerify(mLDSAPublicKeyParameters2.rho, mLDSAPublicKeyParameters2.t1, true, bArr);
        }
        initDigest(parameters);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b) {
        this.digest.update(b);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        SHAKEDigest finishPreHash = finishPreHash();
        MLDSAEngine mLDSAEngine = this.engine;
        int length = bArr.length;
        MLDSAPublicKeyParameters mLDSAPublicKeyParameters = this.pubKey;
        return mLDSAEngine.verifyInternal(bArr, length, finishPreHash, mLDSAPublicKeyParameters.rho, mLDSAPublicKeyParameters.t1);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        this.digest.update(bArr, i, i2);
    }
}
