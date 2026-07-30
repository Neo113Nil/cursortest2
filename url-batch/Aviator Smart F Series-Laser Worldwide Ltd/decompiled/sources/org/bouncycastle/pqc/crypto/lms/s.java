package org.bouncycastle.pqc.crypto.lms;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes5.dex */
class s implements org.bouncycastle.util.c {
    private final j otsSignature;
    private final LMSigParameters parameter;

    /* renamed from: q, reason: collision with root package name */
    private final int f17205q;

    /* renamed from: y, reason: collision with root package name */
    private final byte[][] f17206y;

    public s(int i8, j jVar, LMSigParameters lMSigParameters, byte[][] bArr) {
        this.f17205q = i8;
        this.otsSignature = jVar;
        this.parameter = lMSigParameters;
        this.f17206y = bArr;
    }

    public static s getInstance(Object obj) {
        if (obj instanceof s) {
            return (s) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            int readInt = dataInputStream.readInt();
            j jVar = j.getInstance(obj);
            LMSigParameters parametersForType = LMSigParameters.getParametersForType(dataInputStream.readInt());
            int h8 = parametersForType.getH();
            byte[][] bArr = new byte[h8][];
            for (int i8 = 0; i8 < h8; i8++) {
                byte[] bArr2 = new byte[parametersForType.getM()];
                bArr[i8] = bArr2;
                dataInputStream.readFully(bArr2);
            }
            return new s(readInt, jVar, parametersForType, bArr);
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
                s sVar = getInstance(dataInputStream3);
                dataInputStream3.close();
                return sVar;
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f17205q != sVar.f17205q) {
            return false;
        }
        j jVar = this.otsSignature;
        if (jVar == null ? sVar.otsSignature != null : !jVar.equals(sVar.otsSignature)) {
            return false;
        }
        LMSigParameters lMSigParameters = this.parameter;
        if (lMSigParameters == null ? sVar.parameter == null : lMSigParameters.equals(sVar.parameter)) {
            return Arrays.deepEquals(this.f17206y, sVar.f17206y);
        }
        return false;
    }

    @Override // org.bouncycastle.util.c
    public byte[] getEncoded() {
        return a.compose().u32str(this.f17205q).bytes(this.otsSignature.getEncoded()).u32str(this.parameter.getType()).bytes(this.f17206y).build();
    }

    public j getOtsSignature() {
        return this.otsSignature;
    }

    public LMSigParameters getParameter() {
        return this.parameter;
    }

    public int getQ() {
        return this.f17205q;
    }

    public byte[][] getY() {
        return this.f17206y;
    }

    public int hashCode() {
        int i8 = this.f17205q * 31;
        j jVar = this.otsSignature;
        int hashCode = (i8 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        LMSigParameters lMSigParameters = this.parameter;
        return ((hashCode + (lMSigParameters != null ? lMSigParameters.hashCode() : 0)) * 31) + Arrays.deepHashCode(this.f17206y);
    }
}
