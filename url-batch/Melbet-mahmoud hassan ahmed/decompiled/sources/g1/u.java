package g1;

import java.util.Arrays;

/* loaded from: classes.dex */
final class u {

    /* renamed from: a, reason: collision with root package name */
    private final int f16562a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16563b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16564c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f16565d;

    /* renamed from: e, reason: collision with root package name */
    public int f16566e;

    public u(int i7, int i8) {
        this.f16562a = i7;
        byte[] bArr = new byte[i8 + 3];
        this.f16565d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i7, int i8) {
        if (this.f16563b) {
            int i9 = i8 - i7;
            byte[] bArr2 = this.f16565d;
            int length = bArr2.length;
            int i10 = this.f16566e;
            if (length < i10 + i9) {
                this.f16565d = Arrays.copyOf(bArr2, (i10 + i9) * 2);
            }
            System.arraycopy(bArr, i7, this.f16565d, this.f16566e, i9);
            this.f16566e += i9;
        }
    }

    public boolean b(int i7) {
        if (!this.f16563b) {
            return false;
        }
        this.f16566e -= i7;
        this.f16563b = false;
        this.f16564c = true;
        return true;
    }

    public boolean c() {
        return this.f16564c;
    }

    public void d() {
        this.f16563b = false;
        this.f16564c = false;
    }

    public void e(int i7) {
        o2.a.f(!this.f16563b);
        boolean z6 = i7 == this.f16562a;
        this.f16563b = z6;
        if (z6) {
            this.f16566e = 3;
            this.f16564c = false;
        }
    }
}
