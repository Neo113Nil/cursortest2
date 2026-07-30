package org.bouncycastle.pqc.crypto.lms;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class r extends o implements n {
    private final byte[] I;
    private final byte[] T1;
    private final LMOtsParameters lmOtsType;
    private final LMSigParameters parameterSet;

    public r(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters, byte[] bArr, byte[] bArr2) {
        super(false);
        this.parameterSet = lMSigParameters;
        this.lmOtsType = lMOtsParameters;
        this.I = org.bouncycastle.util.a.clone(bArr2);
        this.T1 = org.bouncycastle.util.a.clone(bArr);
    }

    public static r getInstance(Object obj) {
        if (obj instanceof r) {
            return (r) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            LMSigParameters parametersForType = LMSigParameters.getParametersForType(dataInputStream.readInt());
            LMOtsParameters parametersForType2 = LMOtsParameters.getParametersForType(dataInputStream.readInt());
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[parametersForType.getM()];
            dataInputStream.readFully(bArr2);
            return new r(parametersForType, parametersForType2, bArr2, bArr);
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
                r rVar = getInstance(dataInputStream3);
                dataInputStream3.close();
                return rVar;
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
        r rVar = (r) obj;
        if (this.parameterSet.equals(rVar.parameterSet) && this.lmOtsType.equals(rVar.lmOtsType) && org.bouncycastle.util.a.areEqual(this.I, rVar.I)) {
            return org.bouncycastle.util.a.areEqual(this.T1, rVar.T1);
        }
        return false;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.n
    public l generateLMSContext(byte[] bArr) {
        try {
            return generateOtsContext(s.getInstance(bArr));
        } catch (IOException e8) {
            throw new IllegalStateException("cannot parse signature: " + e8.getMessage());
        }
    }

    l generateOtsContext(s sVar) {
        int type = getOtsParameters().getType();
        if (sVar.getOtsSignature().getType().getType() == type) {
            return new i(LMOtsParameters.getParametersForType(type), this.I, sVar.getQ(), null).createOtsContext(sVar);
        }
        throw new IllegalArgumentException("ots type from lsm signature does not match ots signature type from embedded ots signature");
    }

    @Override // org.bouncycastle.pqc.crypto.lms.o, org.bouncycastle.util.c
    public byte[] getEncoded() {
        return toByteArray();
    }

    public byte[] getI() {
        return org.bouncycastle.util.a.clone(this.I);
    }

    public p getLMSParameters() {
        return new p(getSigParameters(), getOtsParameters());
    }

    public LMOtsParameters getOtsParameters() {
        return this.lmOtsType;
    }

    public LMSigParameters getSigParameters() {
        return this.parameterSet;
    }

    public byte[] getT1() {
        return org.bouncycastle.util.a.clone(this.T1);
    }

    public int hashCode() {
        return (((((this.parameterSet.hashCode() * 31) + this.lmOtsType.hashCode()) * 31) + org.bouncycastle.util.a.hashCode(this.I)) * 31) + org.bouncycastle.util.a.hashCode(this.T1);
    }

    boolean matchesT1(byte[] bArr) {
        return org.bouncycastle.util.a.constantTimeAreEqual(this.T1, bArr);
    }

    byte[] refI() {
        return this.I;
    }

    byte[] toByteArray() {
        return a.compose().u32str(this.parameterSet.getType()).u32str(this.lmOtsType.getType()).bytes(this.I).bytes(this.T1).build();
    }

    @Override // org.bouncycastle.pqc.crypto.lms.n
    public boolean verify(l lVar) {
        return k.verifySignature(this, lVar);
    }
}
