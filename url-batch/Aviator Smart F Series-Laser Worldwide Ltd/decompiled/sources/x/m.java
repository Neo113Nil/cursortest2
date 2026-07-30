package x;

import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f17322a = {36, -80, 48, -109, -51, a4.a.P1, a4.a.I1, a4.a.f50j0, 43, a4.a.f19b1, -59, -8, a4.a.J1, 22, a4.a.W0, a4.a.M1, 52, a4.a.f51j1, -88, a4.a.f35f1, 91, a4.a.H1, 74, 19, 53, -3, -81, -36, -105, a4.a.X1, 51, 5, 73, -44, a4.a.I0, -9, -64};

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f17323b = {a4.a.f58l0, a4.a.f43h1, a4.a.K1, -4, -46, a4.a.Z0, 27, 122, a4.a.G, a4.a.U1, 49, 55, -106, -7, 0};

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f17324c = {47, 14, a4.a.f28d2, 79, 118, a4.a.f58l0, -29, 79, -88, UnsignedBytes.MAX_POWER_OF_TWO, 74, -47, 0};

    /* renamed from: d, reason: collision with root package name */
    public final char[] f17325d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: e, reason: collision with root package name */
    public final char[] f17326e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public String a() {
        byte[] bArr = (byte[]) b.f17274a.clone();
        for (int i8 = 0; i8 < bArr.length; i8++) {
            bArr[i8] = (byte) (bArr[i8] ^ 36);
        }
        byte[] bArr2 = (byte[]) b.f17275b.clone();
        for (int i9 = 0; i9 < bArr2.length; i9++) {
            bArr2[i9] = (byte) (bArr2[i9] ^ a4.a.S0);
        }
        byte[] bArr3 = (byte[]) b.f17276c.clone();
        for (int i10 = 0; i10 < bArr3.length; i10++) {
            bArr3[i10] = (byte) (bArr3[i10] ^ a4.a.f23c1);
        }
        return a(com.blankj.utilcode.util.e.add(com.blankj.utilcode.util.e.add(bArr, bArr2), bArr3));
    }

    public String b() {
        byte[] bArr = (byte[]) b.f17277d.clone();
        for (int i8 = 0; i8 < bArr.length; i8++) {
            bArr[i8] = (byte) (bArr[i8] ^ 36);
        }
        byte[] bArr2 = (byte[]) b.f17279f.clone();
        for (int i9 = 0; i9 < bArr2.length; i9++) {
            bArr2[i9] = (byte) (bArr2[i9] ^ a4.a.S0);
        }
        byte[] bArr3 = (byte[]) b.f17278e.clone();
        for (int i10 = 0; i10 < bArr3.length; i10++) {
            bArr3[i10] = (byte) (bArr3[i10] ^ a4.a.f23c1);
        }
        return a(com.blankj.utilcode.util.e.add(com.blankj.utilcode.util.e.add(bArr, bArr2), bArr3));
    }

    public String a(byte[] bArr) {
        return a(bArr, true);
    }

    public String a(byte[] bArr, boolean z7) {
        if (bArr == null) {
            return "";
        }
        char[] cArr = z7 ? this.f17325d : this.f17326e;
        int length = bArr.length;
        if (length <= 0) {
            return "";
        }
        char[] cArr2 = new char[length << 1];
        int i8 = 0;
        for (byte b8 : bArr) {
            int i9 = i8 + 1;
            cArr2[i8] = cArr[(b8 >> 4) & 15];
            i8 += 2;
            cArr2[i9] = cArr[b8 & 15];
        }
        return new String(cArr2);
    }
}
