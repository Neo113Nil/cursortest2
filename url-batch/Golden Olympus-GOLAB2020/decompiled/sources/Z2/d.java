package Z2;

/* loaded from: classes3.dex */
public abstract class d {
    public static void a(int i4, byte[] bArr, int i5) {
        bArr[i5] = (byte) (i4 >>> 24);
        bArr[i5 + 1] = (byte) (i4 >>> 16);
        bArr[i5 + 2] = (byte) (i4 >>> 8);
        bArr[i5 + 3] = (byte) i4;
    }

    public static void b(long j4, byte[] bArr, int i4) {
        a((int) (j4 >>> 32), bArr, i4);
        a((int) (j4 & 4294967295L), bArr, i4 + 4);
    }
}
