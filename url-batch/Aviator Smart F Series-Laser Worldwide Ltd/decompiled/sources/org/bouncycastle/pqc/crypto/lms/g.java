package org.bouncycastle.pqc.crypto.lms;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes5.dex */
public class g implements org.bouncycastle.util.c {
    private final int lMinus1;
    private final s signature;
    private final t[] signedPubKey;

    public g(int i8, t[] tVarArr, s sVar) {
        this.lMinus1 = i8;
        this.signedPubKey = tVarArr;
        this.signature = sVar;
    }

    public static g getInstance(Object obj, int i8) {
        if (obj instanceof g) {
            return (g) obj;
        }
        if (obj instanceof DataInputStream) {
            int readInt = ((DataInputStream) obj).readInt();
            if (readInt != i8 - 1) {
                throw new IllegalStateException("nspk exceeded maxNspk");
            }
            t[] tVarArr = new t[readInt];
            if (readInt != 0) {
                for (int i9 = 0; i9 < readInt; i9++) {
                    tVarArr[i9] = new t(s.getInstance(obj), r.getInstance(obj));
                }
            }
            return new g(readInt, tVarArr, s.getInstance(obj));
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(j7.a.readAll((InputStream) obj), i8);
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
        DataInputStream dataInputStream = null;
        try {
            DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                g gVar = getInstance(dataInputStream2, i8);
                dataInputStream2.close();
                return gVar;
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
        g gVar = (g) obj;
        if (this.lMinus1 != gVar.lMinus1 || this.signedPubKey.length != gVar.signedPubKey.length) {
            return false;
        }
        int i8 = 0;
        while (true) {
            t[] tVarArr = this.signedPubKey;
            if (i8 >= tVarArr.length) {
                s sVar = this.signature;
                s sVar2 = gVar.signature;
                return sVar != null ? sVar.equals(sVar2) : sVar2 == null;
            }
            if (!tVarArr[i8].equals(gVar.signedPubKey[i8])) {
                return false;
            }
            i8++;
        }
    }

    @Override // org.bouncycastle.util.c
    public byte[] getEncoded() {
        a compose = a.compose();
        compose.u32str(this.lMinus1);
        t[] tVarArr = this.signedPubKey;
        if (tVarArr != null) {
            for (t tVar : tVarArr) {
                compose.bytes(tVar);
            }
        }
        compose.bytes(this.signature);
        return compose.build();
    }

    public s getSignature() {
        return this.signature;
    }

    public t[] getSignedPubKey() {
        return this.signedPubKey;
    }

    public int getlMinus1() {
        return this.lMinus1;
    }

    public int hashCode() {
        int hashCode = ((this.lMinus1 * 31) + Arrays.hashCode(this.signedPubKey)) * 31;
        s sVar = this.signature;
        return hashCode + (sVar != null ? sVar.hashCode() : 0);
    }
}
