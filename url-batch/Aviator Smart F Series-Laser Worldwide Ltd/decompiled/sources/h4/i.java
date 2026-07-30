package h4;

/* loaded from: classes3.dex */
public class i {
    private i() {
    }

    public static int a(byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            return 0;
        }
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        return (int) (com.crrepa.g1.c.f(bArr2) / 1024);
    }

    public static int b(byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            return 0;
        }
        int f8 = (int) com.crrepa.g1.c.f(bArr);
        if (f8 <= 0) {
            return 1;
        }
        return f8;
    }
}
