package org.bouncycastle.pqc.crypto.lms;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.WeakHashMap;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.ExhaustedPrivateKeyException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes10.dex */
public class LMSPrivateKeyParameters extends LMSKeyParameters implements LMSContextBasedSigner {
    private static CacheKey T1;
    private static CacheKey[] internedKeys;
    private final byte[] I;
    private final byte[] masterSecret;
    private final int maxCacheR;
    private final int maxQ;
    private final LMOtsParameters otsParameters;
    private final LMSigParameters parameters;
    private LMSPublicKeyParameters publicKey;
    private int q;
    private final Map<CacheKey, byte[]> tCache;
    private final Digest tDigest;

    public static class CacheKey {
        private final int index;

        public CacheKey(int i) {
            this.index = i;
        }

        public boolean equals(Object obj) {
            return (obj instanceof CacheKey) && ((CacheKey) obj).index == this.index;
        }

        public int hashCode() {
            return this.index;
        }
    }

    static {
        CacheKey cacheKey = new CacheKey(1);
        T1 = cacheKey;
        CacheKey[] cacheKeyArr = new CacheKey[EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE];
        internedKeys = cacheKeyArr;
        cacheKeyArr[1] = cacheKey;
        int i = 2;
        while (true) {
            CacheKey[] cacheKeyArr2 = internedKeys;
            if (i >= cacheKeyArr2.length) {
                return;
            }
            cacheKeyArr2[i] = new CacheKey(i);
            i++;
        }
    }

    private LMSPrivateKeyParameters(LMSPrivateKeyParameters lMSPrivateKeyParameters, int i, int i2) {
        super(true);
        LMSigParameters lMSigParameters = lMSPrivateKeyParameters.parameters;
        this.parameters = lMSigParameters;
        this.otsParameters = lMSPrivateKeyParameters.otsParameters;
        this.q = i;
        this.I = lMSPrivateKeyParameters.I;
        this.maxQ = i2;
        this.masterSecret = lMSPrivateKeyParameters.masterSecret;
        this.maxCacheR = 1 << lMSigParameters.getH();
        this.tCache = lMSPrivateKeyParameters.tCache;
        this.tDigest = DigestUtil.getDigest(lMSigParameters);
        this.publicKey = lMSPrivateKeyParameters.publicKey;
    }

    private byte[] calcT(int i) {
        int h = 1 << getSigParameters().getH();
        if (i >= h) {
            LmsUtils.byteArray(getI(), this.tDigest);
            LmsUtils.u32str(i, this.tDigest);
            LmsUtils.u16str((short) -32126, this.tDigest);
            LmsUtils.byteArray(LM_OTS.lms_ots_generatePublicKey(getOtsParameters(), getI(), i - h, getMasterSecret()), this.tDigest);
            byte[] bArr = new byte[this.tDigest.getDigestSize()];
            this.tDigest.doFinal(bArr, 0);
            return bArr;
        }
        int i2 = i * 2;
        byte[] findT = findT(i2);
        byte[] findT2 = findT(i2 + 1);
        LmsUtils.byteArray(getI(), this.tDigest);
        LmsUtils.u32str(i, this.tDigest);
        LmsUtils.u16str((short) -31869, this.tDigest);
        LmsUtils.byteArray(findT, this.tDigest);
        LmsUtils.byteArray(findT2, this.tDigest);
        byte[] bArr2 = new byte[this.tDigest.getDigestSize()];
        this.tDigest.doFinal(bArr2, 0);
        return bArr2;
    }

    private byte[] findT(CacheKey cacheKey) {
        byte[] bArr;
        synchronized (this.tCache) {
            try {
                bArr = this.tCache.get(cacheKey);
                if (bArr == null) {
                    bArr = calcT(cacheKey.index);
                    this.tCache.put(cacheKey, bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }

    public static LMSPrivateKeyParameters getInstance(Object obj) {
        Throwable th;
        if (obj instanceof LMSPrivateKeyParameters) {
            return (LMSPrivateKeyParameters) obj;
        }
        DataInputStream dataInputStream = null;
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            if (dataInputStream2.readInt() != 0) {
                a$$ExternalSyntheticBUOutline0.m$1("expected version 0 lms private key");
                return null;
            }
            LMSigParameters parametersForType = LMSigParameters.getParametersForType(dataInputStream2.readInt());
            LMOtsParameters parametersForType2 = LMOtsParameters.getParametersForType(dataInputStream2.readInt());
            byte[] bArr = new byte[16];
            dataInputStream2.readFully(bArr);
            int readInt = dataInputStream2.readInt();
            int readInt2 = dataInputStream2.readInt();
            int readInt3 = dataInputStream2.readInt();
            if (readInt3 < 0) {
                a$$ExternalSyntheticBUOutline0.m$1("secret length less than zero");
                return null;
            }
            if (readInt3 > dataInputStream2.available()) {
                Path$$ExternalSyntheticBUOutline0.m$3(dataInputStream2.available(), "secret length exceeded ");
                return null;
            }
            byte[] bArr2 = new byte[readInt3];
            dataInputStream2.readFully(bArr2);
            return new LMSPrivateKeyParameters(parametersForType, parametersForType2, readInt, bArr, readInt2, bArr2);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj));
            }
            a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m("cannot parse ", obj));
            return null;
        }
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                LMSPrivateKeyParameters lMSPrivateKeyParameters = getInstance(dataInputStream3);
                dataInputStream3.close();
                return lMSPrivateKeyParameters;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream = dataInputStream3;
                if (dataInputStream == null) {
                    throw th;
                }
                dataInputStream.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LMSPrivateKeyParameters lMSPrivateKeyParameters = (LMSPrivateKeyParameters) obj;
        if (this.q != lMSPrivateKeyParameters.q || this.maxQ != lMSPrivateKeyParameters.maxQ || !Arrays.areEqual(this.I, lMSPrivateKeyParameters.I)) {
            return false;
        }
        LMSigParameters lMSigParameters = this.parameters;
        LMSigParameters lMSigParameters2 = lMSPrivateKeyParameters.parameters;
        if (lMSigParameters == null ? lMSigParameters2 != null : !lMSigParameters.equals(lMSigParameters2)) {
            return false;
        }
        LMOtsParameters lMOtsParameters = this.otsParameters;
        LMOtsParameters lMOtsParameters2 = lMSPrivateKeyParameters.otsParameters;
        if (lMOtsParameters == null ? lMOtsParameters2 == null : lMOtsParameters.equals(lMOtsParameters2)) {
            return Arrays.areEqual(this.masterSecret, lMSPrivateKeyParameters.masterSecret);
        }
        return false;
    }

    public LMSPrivateKeyParameters extractKeyShard(int i) {
        LMSPrivateKeyParameters lMSPrivateKeyParameters;
        synchronized (this) {
            try {
                int i2 = this.q;
                if (i2 + i >= this.maxQ) {
                    throw new IllegalArgumentException("usageCount exceeds usages remaining");
                }
                lMSPrivateKeyParameters = new LMSPrivateKeyParameters(this, i2, i2 + i);
                this.q += i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lMSPrivateKeyParameters;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public LMSContext generateLMSContext() {
        int h = getSigParameters().getH();
        int index = getIndex();
        LMOtsPrivateKey nextOtsPrivateKey = getNextOtsPrivateKey();
        int i = (1 << h) + index;
        byte[][] bArr = new byte[h][];
        for (int i2 = 0; i2 < h; i2++) {
            bArr[i2] = findT((i / (1 << i2)) ^ 1);
        }
        return nextOtsPrivateKey.getSignatureContext(getSigParameters(), bArr);
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public byte[] generateSignature(LMSContext lMSContext) {
        try {
            return LMS.generateSign(lMSContext).getEncoded();
        } catch (IOException e) {
            a$$ExternalSyntheticBUOutline0.m(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("unable to encode signature: ")), e);
            return null;
        }
    }

    public LMOtsPrivateKey getCurrentOTSKey() {
        LMOtsPrivateKey lMOtsPrivateKey;
        synchronized (this) {
            try {
                int i = this.q;
                if (i >= this.maxQ) {
                    throw new ExhaustedPrivateKeyException("ots private keys expired");
                }
                lMOtsPrivateKey = new LMOtsPrivateKey(this.otsParameters, this.I, i, this.masterSecret);
            } catch (Throwable th) {
                throw th;
            }
        }
        return lMOtsPrivateKey;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSKeyParameters, org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        return Composer.compose().u32str(0).u32str(this.parameters.getType()).u32str(this.otsParameters.getType()).bytes(this.I).u32str(this.q).u32str(this.maxQ).u32str(this.masterSecret.length).bytes(this.masterSecret).build();
    }

    public byte[] getI() {
        return Arrays.clone(this.I);
    }

    public synchronized int getIndex() {
        return this.q;
    }

    public byte[] getMasterSecret() {
        return Arrays.clone(this.masterSecret);
    }

    public LMOtsPrivateKey getNextOtsPrivateKey() {
        LMOtsPrivateKey lMOtsPrivateKey;
        synchronized (this) {
            try {
                int i = this.q;
                if (i >= this.maxQ) {
                    throw new ExhaustedPrivateKeyException("ots private key exhausted");
                }
                lMOtsPrivateKey = new LMOtsPrivateKey(this.otsParameters, this.I, i, this.masterSecret);
                incIndex();
            } catch (Throwable th) {
                throw th;
            }
        }
        return lMOtsPrivateKey;
    }

    public LMOtsParameters getOtsParameters() {
        return this.otsParameters;
    }

    public LMSPublicKeyParameters getPublicKey() {
        LMSPublicKeyParameters lMSPublicKeyParameters;
        synchronized (this) {
            try {
                if (this.publicKey == null) {
                    this.publicKey = new LMSPublicKeyParameters(this.parameters, this.otsParameters, findT(T1), this.I);
                }
                lMSPublicKeyParameters = this.publicKey;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lMSPublicKeyParameters;
    }

    public LMSigParameters getSigParameters() {
        return this.parameters;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public long getUsagesRemaining() {
        return this.maxQ - getIndex();
    }

    public int hashCode() {
        int hashCode = (Arrays.hashCode(this.I) + (this.q * 31)) * 31;
        LMSigParameters lMSigParameters = this.parameters;
        int hashCode2 = (hashCode + (lMSigParameters != null ? lMSigParameters.hashCode() : 0)) * 31;
        LMOtsParameters lMOtsParameters = this.otsParameters;
        return Arrays.hashCode(this.masterSecret) + ((((hashCode2 + (lMOtsParameters != null ? lMOtsParameters.hashCode() : 0)) * 31) + this.maxQ) * 31);
    }

    public synchronized void incIndex() {
        this.q++;
    }

    public byte[] findT(int i) {
        if (i >= this.maxCacheR) {
            return calcT(i);
        }
        CacheKey[] cacheKeyArr = internedKeys;
        return findT(i < cacheKeyArr.length ? cacheKeyArr[i] : new CacheKey(i));
    }

    public LMSPrivateKeyParameters(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters, int i, byte[] bArr, int i2, byte[] bArr2) {
        super(true);
        this.parameters = lMSigParameters;
        this.otsParameters = lMOtsParameters;
        this.q = i;
        this.I = Arrays.clone(bArr);
        this.maxQ = i2;
        this.masterSecret = Arrays.clone(bArr2);
        this.maxCacheR = 1 << (lMSigParameters.getH() + 1);
        this.tCache = new WeakHashMap();
        this.tDigest = DigestUtil.getDigest(lMSigParameters);
    }

    public static LMSPrivateKeyParameters getInstance(byte[] bArr, byte[] bArr2) {
        LMSPrivateKeyParameters lMSPrivateKeyParameters = getInstance(bArr);
        lMSPrivateKeyParameters.publicKey = LMSPublicKeyParameters.getInstance(bArr2);
        return lMSPrivateKeyParameters;
    }
}
