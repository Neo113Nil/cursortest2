package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes5.dex */
class v {
    v() {
    }

    static void byteArray(byte[] bArr, int i8, int i9, org.bouncycastle.crypto.e eVar) {
        eVar.update(bArr, i8, i9);
    }

    static int calculateStrength(p pVar) {
        if (pVar == null) {
            throw new NullPointerException("lmsParameters cannot be null");
        }
        LMSigParameters lMSigParam = pVar.getLMSigParam();
        return (1 << lMSigParam.getH()) * lMSigParam.getM();
    }

    static void u16str(short s7, org.bouncycastle.crypto.e eVar) {
        eVar.update((byte) (s7 >>> 8));
        eVar.update((byte) s7);
    }

    static void u32str(int i8, org.bouncycastle.crypto.e eVar) {
        eVar.update((byte) (i8 >>> 24));
        eVar.update((byte) (i8 >>> 16));
        eVar.update((byte) (i8 >>> 8));
        eVar.update((byte) i8);
    }

    static void byteArray(byte[] bArr, org.bouncycastle.crypto.e eVar) {
        eVar.update(bArr, 0, bArr.length);
    }
}
