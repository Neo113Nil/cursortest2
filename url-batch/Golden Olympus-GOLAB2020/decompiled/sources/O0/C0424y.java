package O0;

/* renamed from: O0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0424y {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f1282a;

    /* renamed from: b, reason: collision with root package name */
    private int f1283b = 0;

    public C0424y(int i4) {
        this.f1282a = null;
        this.f1282a = new byte[i4];
    }

    public void a(byte[] bArr, int i4) {
        if (i4 <= 0) {
            return;
        }
        byte[] bArr2 = this.f1282a;
        int length = bArr2.length;
        int i5 = this.f1283b;
        if (length - i5 >= i4) {
            System.arraycopy(bArr, 0, bArr2, i5, i4);
        } else {
            byte[] bArr3 = new byte[(bArr2.length + i4) << 1];
            System.arraycopy(bArr2, 0, bArr3, 0, i5);
            System.arraycopy(bArr, 0, bArr3, this.f1283b, i4);
            this.f1282a = bArr3;
        }
        this.f1283b += i4;
    }

    public byte[] b() {
        int i4 = this.f1283b;
        if (i4 <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i4];
        System.arraycopy(this.f1282a, 0, bArr, 0, i4);
        return bArr;
    }

    public int c() {
        return this.f1283b;
    }
}
