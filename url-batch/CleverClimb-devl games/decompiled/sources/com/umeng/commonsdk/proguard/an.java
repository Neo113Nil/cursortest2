package com.umeng.commonsdk.proguard;

import java.util.BitSet;

/* compiled from: TTupleProtocol.java */
/* loaded from: classes2.dex */
public final class an extends ab {

    /* compiled from: TTupleProtocol.java */
    public static class a implements aj {
        @Override // com.umeng.commonsdk.proguard.aj
        public ah a(av avVar) {
            return new an(avVar);
        }
    }

    public an(av avVar) {
        super(avVar);
    }

    @Override // com.umeng.commonsdk.proguard.ah
    public Class<? extends ap> D() {
        return as.class;
    }

    public void a(BitSet bitSet, int i) throws o {
        for (byte b2 : b(bitSet, i)) {
            a(b2);
        }
    }

    public BitSet b(int i) throws o {
        double d2 = i;
        Double.isNaN(d2);
        int ceil = (int) Math.ceil(d2 / 8.0d);
        byte[] bArr = new byte[ceil];
        for (int i2 = 0; i2 < ceil; i2++) {
            bArr[i2] = u();
        }
        return a(bArr);
    }

    public static BitSet a(byte[] bArr) {
        BitSet bitSet = new BitSet();
        for (int i = 0; i < bArr.length * 8; i++) {
            if ((bArr[(bArr.length - (i / 8)) - 1] & (1 << (i % 8))) > 0) {
                bitSet.set(i);
            }
        }
        return bitSet;
    }

    public static byte[] b(BitSet bitSet, int i) {
        double d2 = i;
        Double.isNaN(d2);
        byte[] bArr = new byte[(int) Math.ceil(d2 / 8.0d)];
        for (int i2 = 0; i2 < bitSet.length(); i2++) {
            if (bitSet.get(i2)) {
                int length = (bArr.length - (i2 / 8)) - 1;
                bArr[length] = (byte) ((1 << (i2 % 8)) | bArr[length]);
            }
        }
        return bArr;
    }
}
