package org.bouncycastle.pqc.crypto.lms;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes5.dex */
class i implements org.bouncycastle.util.c {
    private final byte[] I;
    private final byte[] K;
    private final LMOtsParameters parameter;

    /* renamed from: q, reason: collision with root package name */
    private final int f17202q;

    public i(LMOtsParameters lMOtsParameters, byte[] bArr, int i8, byte[] bArr2) {
        this.parameter = lMOtsParameters;
        this.I = bArr;
        this.f17202q = i8;
        this.K = bArr2;
    }

    public static i getInstance(Object obj) {
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            LMOtsParameters parametersForType = LMOtsParameters.getParametersForType(dataInputStream.readInt());
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            int readInt = dataInputStream.readInt();
            byte[] bArr2 = new byte[parametersForType.getN()];
            dataInputStream.readFully(bArr2);
            return new i(parametersForType, bArr, readInt, bArr2);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(j7.a.readAll((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
        DataInputStream dataInputStream2 = null;
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                i iVar = getInstance(dataInputStream3);
                dataInputStream3.close();
                return iVar;
            } catch (Throwable th) {
                th = th;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 != null) {
                    dataInputStream2.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    l createOtsContext(j jVar) {
        org.bouncycastle.crypto.e digest = b.getDigest(this.parameter.getDigestOID());
        v.byteArray(this.I, digest);
        v.u32str(this.f17202q, digest);
        v.u16str((short) -32383, digest);
        v.byteArray(jVar.getC(), digest);
        return new l(this, jVar, digest);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f17202q != iVar.f17202q) {
            return false;
        }
        LMOtsParameters lMOtsParameters = this.parameter;
        if (lMOtsParameters == null ? iVar.parameter != null : !lMOtsParameters.equals(iVar.parameter)) {
            return false;
        }
        if (Arrays.equals(this.I, iVar.I)) {
            return Arrays.equals(this.K, iVar.K);
        }
        return false;
    }

    @Override // org.bouncycastle.util.c
    public byte[] getEncoded() {
        return a.compose().u32str(this.parameter.getType()).bytes(this.I).u32str(this.f17202q).bytes(this.K).build();
    }

    public byte[] getI() {
        return this.I;
    }

    public byte[] getK() {
        return this.K;
    }

    public LMOtsParameters getParameter() {
        return this.parameter;
    }

    public int getQ() {
        return this.f17202q;
    }

    public int hashCode() {
        LMOtsParameters lMOtsParameters = this.parameter;
        return ((((((lMOtsParameters != null ? lMOtsParameters.hashCode() : 0) * 31) + Arrays.hashCode(this.I)) * 31) + this.f17202q) * 31) + Arrays.hashCode(this.K);
    }

    l createOtsContext(s sVar) {
        org.bouncycastle.crypto.e digest = b.getDigest(this.parameter.getDigestOID());
        v.byteArray(this.I, digest);
        v.u32str(this.f17202q, digest);
        v.u16str((short) -32383, digest);
        v.byteArray(sVar.getOtsSignature().getC(), digest);
        return new l(this, sVar, digest);
    }
}
