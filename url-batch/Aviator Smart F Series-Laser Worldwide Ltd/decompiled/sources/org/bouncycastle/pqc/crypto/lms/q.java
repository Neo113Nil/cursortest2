package org.bouncycastle.pqc.crypto.lms;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.WeakHashMap;
import org.bouncycastle.pqc.crypto.ExhaustedPrivateKeyException;

/* loaded from: classes5.dex */
public class q extends o implements m {
    private static a T1;
    private static a[] internedKeys;
    private final byte[] I;
    private final byte[] masterSecret;
    private final int maxCacheR;
    private final int maxQ;
    private final LMOtsParameters otsParameters;
    private final LMSigParameters parameters;
    private r publicKey;

    /* renamed from: q, reason: collision with root package name */
    private int f17204q;
    private final Map<a, byte[]> tCache;
    private final org.bouncycastle.crypto.e tDigest;

    private static class a {
        private final int index;

        a(int i8) {
            this.index = i8;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && ((a) obj).index == this.index;
        }

        public int hashCode() {
            return this.index;
        }
    }

    static {
        a aVar = new a(1);
        T1 = aVar;
        a[] aVarArr = new a[129];
        internedKeys = aVarArr;
        aVarArr[1] = aVar;
        int i8 = 2;
        while (true) {
            a[] aVarArr2 = internedKeys;
            if (i8 >= aVarArr2.length) {
                return;
            }
            aVarArr2[i8] = new a(i8);
            i8++;
        }
    }

    private q(q qVar, int i8, int i9) {
        super(true);
        LMSigParameters lMSigParameters = qVar.parameters;
        this.parameters = lMSigParameters;
        this.otsParameters = qVar.otsParameters;
        this.f17204q = i8;
        this.I = qVar.I;
        this.maxQ = i9;
        this.masterSecret = qVar.masterSecret;
        this.maxCacheR = 1 << lMSigParameters.getH();
        this.tCache = qVar.tCache;
        this.tDigest = b.getDigest(lMSigParameters.getDigestOID());
        this.publicKey = qVar.publicKey;
    }

    private byte[] calcT(int i8) {
        int h8 = 1 << getSigParameters().getH();
        if (i8 >= h8) {
            v.byteArray(getI(), this.tDigest);
            v.u32str(i8, this.tDigest);
            v.u16str((short) -32126, this.tDigest);
            v.byteArray(u.lms_ots_generatePublicKey(getOtsParameters(), getI(), i8 - h8, getMasterSecret()), this.tDigest);
            byte[] bArr = new byte[this.tDigest.getDigestSize()];
            this.tDigest.doFinal(bArr, 0);
            return bArr;
        }
        int i9 = i8 * 2;
        byte[] findT = findT(i9);
        byte[] findT2 = findT(i9 + 1);
        v.byteArray(getI(), this.tDigest);
        v.u32str(i8, this.tDigest);
        v.u16str((short) -31869, this.tDigest);
        v.byteArray(findT, this.tDigest);
        v.byteArray(findT2, this.tDigest);
        byte[] bArr2 = new byte[this.tDigest.getDigestSize()];
        this.tDigest.doFinal(bArr2, 0);
        return bArr2;
    }

    public static q getInstance(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof q) {
            return (q) obj;
        }
        if (!(obj instanceof DataInputStream)) {
            if (!(obj instanceof byte[])) {
                if (obj instanceof InputStream) {
                    return getInstance(j7.a.readAll((InputStream) obj));
                }
                throw new IllegalArgumentException("cannot parse " + obj);
            }
            DataInputStream dataInputStream2 = null;
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            } catch (Throwable th) {
                th = th;
            }
            try {
                q qVar = getInstance(dataInputStream);
                dataInputStream.close();
                return qVar;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    dataInputStream2.close();
                }
                throw th;
            }
        }
        DataInputStream dataInputStream3 = (DataInputStream) obj;
        if (dataInputStream3.readInt() != 0) {
            throw new IllegalStateException("expected version 0 lms private key");
        }
        LMSigParameters parametersForType = LMSigParameters.getParametersForType(dataInputStream3.readInt());
        LMOtsParameters parametersForType2 = LMOtsParameters.getParametersForType(dataInputStream3.readInt());
        byte[] bArr = new byte[16];
        dataInputStream3.readFully(bArr);
        int readInt = dataInputStream3.readInt();
        int readInt2 = dataInputStream3.readInt();
        int readInt3 = dataInputStream3.readInt();
        if (readInt3 < 0) {
            throw new IllegalStateException("secret length less than zero");
        }
        if (readInt3 <= dataInputStream3.available()) {
            byte[] bArr2 = new byte[readInt3];
            dataInputStream3.readFully(bArr2);
            return new q(parametersForType, parametersForType2, readInt, bArr, readInt2, bArr2);
        }
        throw new IOException("secret length exceeded " + dataInputStream3.available());
    }

    public boolean equals(Object obj) {
        r rVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f17204q != qVar.f17204q || this.maxQ != qVar.maxQ || !org.bouncycastle.util.a.areEqual(this.I, qVar.I)) {
            return false;
        }
        LMSigParameters lMSigParameters = this.parameters;
        if (lMSigParameters == null ? qVar.parameters != null : !lMSigParameters.equals(qVar.parameters)) {
            return false;
        }
        LMOtsParameters lMOtsParameters = this.otsParameters;
        if (lMOtsParameters == null ? qVar.otsParameters != null : !lMOtsParameters.equals(qVar.otsParameters)) {
            return false;
        }
        if (!org.bouncycastle.util.a.areEqual(this.masterSecret, qVar.masterSecret)) {
            return false;
        }
        r rVar2 = this.publicKey;
        if (rVar2 == null || (rVar = qVar.publicKey) == null) {
            return true;
        }
        return rVar2.equals(rVar);
    }

    public q extractKeyShard(int i8) {
        q qVar;
        synchronized (this) {
            try {
                int i9 = this.f17204q;
                if (i9 + i8 >= this.maxQ) {
                    throw new IllegalArgumentException("usageCount exceeds usages remaining");
                }
                qVar = new q(this, i9, i9 + i8);
                this.f17204q += i8;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    byte[] findT(int i8) {
        if (i8 >= this.maxCacheR) {
            return calcT(i8);
        }
        a[] aVarArr = internedKeys;
        return findT(i8 < aVarArr.length ? aVarArr[i8] : new a(i8));
    }

    @Override // org.bouncycastle.pqc.crypto.lms.m
    public l generateLMSContext() {
        int h8 = getSigParameters().getH();
        int index = getIndex();
        h nextOtsPrivateKey = getNextOtsPrivateKey();
        int i8 = (1 << h8) + index;
        byte[][] bArr = new byte[h8][];
        for (int i9 = 0; i9 < h8; i9++) {
            bArr[i9] = findT((i8 / (1 << i9)) ^ 1);
        }
        return nextOtsPrivateKey.getSignatureContext(getSigParameters(), bArr);
    }

    @Override // org.bouncycastle.pqc.crypto.lms.m
    public byte[] generateSignature(l lVar) {
        try {
            return k.generateSign(lVar).getEncoded();
        } catch (IOException e8) {
            throw new IllegalStateException("unable to encode signature: " + e8.getMessage(), e8);
        }
    }

    h getCurrentOTSKey() {
        h hVar;
        synchronized (this) {
            try {
                int i8 = this.f17204q;
                if (i8 >= this.maxQ) {
                    throw new ExhaustedPrivateKeyException("ots private keys expired");
                }
                hVar = new h(this.otsParameters, this.I, i8, this.masterSecret);
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.o, org.bouncycastle.util.c
    public byte[] getEncoded() {
        return org.bouncycastle.pqc.crypto.lms.a.compose().u32str(0).u32str(this.parameters.getType()).u32str(this.otsParameters.getType()).bytes(this.I).u32str(this.f17204q).u32str(this.maxQ).u32str(this.masterSecret.length).bytes(this.masterSecret).build();
    }

    public byte[] getI() {
        return org.bouncycastle.util.a.clone(this.I);
    }

    public synchronized int getIndex() {
        return this.f17204q;
    }

    public byte[] getMasterSecret() {
        return org.bouncycastle.util.a.clone(this.masterSecret);
    }

    h getNextOtsPrivateKey() {
        h hVar;
        synchronized (this) {
            try {
                int i8 = this.f17204q;
                if (i8 >= this.maxQ) {
                    throw new ExhaustedPrivateKeyException("ots private key exhausted");
                }
                hVar = new h(this.otsParameters, this.I, i8, this.masterSecret);
                incIndex();
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public LMOtsParameters getOtsParameters() {
        return this.otsParameters;
    }

    public r getPublicKey() {
        r rVar;
        synchronized (this) {
            try {
                if (this.publicKey == null) {
                    this.publicKey = new r(this.parameters, this.otsParameters, findT(T1), this.I);
                }
                rVar = this.publicKey;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    public LMSigParameters getSigParameters() {
        return this.parameters;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.m
    public long getUsagesRemaining() {
        return this.maxQ - this.f17204q;
    }

    public int hashCode() {
        int hashCode = ((this.f17204q * 31) + org.bouncycastle.util.a.hashCode(this.I)) * 31;
        LMSigParameters lMSigParameters = this.parameters;
        int hashCode2 = (hashCode + (lMSigParameters != null ? lMSigParameters.hashCode() : 0)) * 31;
        LMOtsParameters lMOtsParameters = this.otsParameters;
        int hashCode3 = (((((hashCode2 + (lMOtsParameters != null ? lMOtsParameters.hashCode() : 0)) * 31) + this.maxQ) * 31) + org.bouncycastle.util.a.hashCode(this.masterSecret)) * 31;
        r rVar = this.publicKey;
        return hashCode3 + (rVar != null ? rVar.hashCode() : 0);
    }

    synchronized void incIndex() {
        this.f17204q++;
    }

    public q(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters, int i8, byte[] bArr, int i9, byte[] bArr2) {
        super(true);
        this.parameters = lMSigParameters;
        this.otsParameters = lMOtsParameters;
        this.f17204q = i8;
        this.I = org.bouncycastle.util.a.clone(bArr);
        this.maxQ = i9;
        this.masterSecret = org.bouncycastle.util.a.clone(bArr2);
        this.maxCacheR = 1 << (lMSigParameters.getH() + 1);
        this.tCache = new WeakHashMap();
        this.tDigest = b.getDigest(lMSigParameters.getDigestOID());
    }

    private byte[] findT(a aVar) {
        synchronized (this.tCache) {
            try {
                byte[] bArr = this.tCache.get(aVar);
                if (bArr != null) {
                    return bArr;
                }
                byte[] calcT = calcT(aVar.index);
                this.tCache.put(aVar, calcT);
                return calcT;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static q getInstance(byte[] bArr, byte[] bArr2) {
        q qVar = getInstance(bArr);
        qVar.publicKey = r.getInstance(bArr2);
        return qVar;
    }
}
