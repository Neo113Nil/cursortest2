package org.bouncycastle.pqc.crypto.lms;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class f extends o implements n {

    /* renamed from: l, reason: collision with root package name */
    private final int f17200l;
    private final r lmsPublicKey;

    public f(int i8, r rVar) {
        super(false);
        this.f17200l = i8;
        this.lmsPublicKey = rVar;
    }

    public static f getInstance(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj instanceof DataInputStream) {
            return new f(((DataInputStream) obj).readInt(), r.getInstance(obj));
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(j7.a.readAll((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
        DataInputStream dataInputStream = null;
        try {
            DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                f fVar = getInstance(dataInputStream2);
                dataInputStream2.close();
                return fVar;
            } catch (Throwable th) {
                th = th;
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f17200l != fVar.f17200l) {
            return false;
        }
        return this.lmsPublicKey.equals(fVar.lmsPublicKey);
    }

    @Override // org.bouncycastle.pqc.crypto.lms.n
    public l generateLMSContext(byte[] bArr) {
        try {
            g gVar = g.getInstance(bArr, getL());
            t[] signedPubKey = gVar.getSignedPubKey();
            return signedPubKey[signedPubKey.length - 1].getPublicKey().generateOtsContext(gVar.getSignature()).withSignedPublicKeys(signedPubKey);
        } catch (IOException e8) {
            throw new IllegalStateException("cannot parse signature: " + e8.getMessage());
        }
    }

    @Override // org.bouncycastle.pqc.crypto.lms.o, org.bouncycastle.util.c
    public byte[] getEncoded() {
        return a.compose().u32str(this.f17200l).bytes(this.lmsPublicKey.getEncoded()).build();
    }

    public int getL() {
        return this.f17200l;
    }

    public r getLMSPublicKey() {
        return this.lmsPublicKey;
    }

    public int hashCode() {
        return (this.f17200l * 31) + this.lmsPublicKey.hashCode();
    }

    @Override // org.bouncycastle.pqc.crypto.lms.n
    public boolean verify(l lVar) {
        t[] signedPubKeys = lVar.getSignedPubKeys();
        if (signedPubKeys.length != getL() - 1) {
            return false;
        }
        r lMSPublicKey = getLMSPublicKey();
        boolean z7 = false;
        for (int i8 = 0; i8 < signedPubKeys.length; i8++) {
            if (!k.verifySignature(lMSPublicKey, signedPubKeys[i8].getSignature(), signedPubKeys[i8].getPublicKey().toByteArray())) {
                z7 = true;
            }
            lMSPublicKey = signedPubKeys[i8].getPublicKey();
        }
        return lMSPublicKey.verify(lVar) & (!z7);
    }
}
