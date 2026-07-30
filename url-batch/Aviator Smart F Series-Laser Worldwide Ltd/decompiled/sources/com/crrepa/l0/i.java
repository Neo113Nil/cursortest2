package com.crrepa.l0;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static final int f13192a = 165;

    /* renamed from: b, reason: collision with root package name */
    public static final int f13193b = 256;

    /* renamed from: c, reason: collision with root package name */
    public static final int f13194c = 64;

    private i() {
    }

    public static int a(String str) {
        return com.crrepa.l.a.b().h() ? com.crrepa.l.a.b().c() : f13192a <= com.crrepa.g1.i.b(str) ? 256 : 64;
    }

    private static byte[] b(byte[] bArr) {
        byte[] a8 = e.a(bArr, e.f13178a);
        byte[] bArr2 = new byte[(byte) (bArr.length + a8.length + 3)];
        bArr2[0] = -1;
        bArr2[1] = -1;
        System.arraycopy(a8, 0, bArr2, 2, a8.length);
        bArr2[a8.length + 2] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr2, a8.length + 3, bArr.length);
        return bArr2;
    }

    private static byte[] a(byte[] bArr) {
        byte[] a8 = e.a(bArr, e.f13178a);
        byte[] bArr2 = new byte[bArr.length + a8.length + 2];
        bArr2[0] = -2;
        System.arraycopy(a8, 0, bArr2, 1, a8.length);
        bArr2[a8.length + 1] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr2, a8.length + 2, bArr.length);
        return bArr2;
    }

    public static byte[] a(byte[] bArr, int i8) {
        return (com.crrepa.l.a.b().h() || com.crrepa.l.a.b().i()) ? bArr : i8 == 64 ? b(bArr) : a(bArr);
    }
}
