package o2;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f19692a;

    /* renamed from: b, reason: collision with root package name */
    private int f19693b;

    /* renamed from: c, reason: collision with root package name */
    private int f19694c;

    /* renamed from: d, reason: collision with root package name */
    private int f19695d;

    public b0(byte[] bArr, int i7, int i8) {
        i(bArr, i7, i8);
    }

    private void a() {
        int i7;
        int i8 = this.f19694c;
        a.f(i8 >= 0 && (i8 < (i7 = this.f19693b) || (i8 == i7 && this.f19695d == 0)));
    }

    private int f() {
        int i7 = 0;
        while (!d()) {
            i7++;
        }
        return ((1 << i7) - 1) + (i7 > 0 ? e(i7) : 0);
    }

    private boolean j(int i7) {
        if (2 <= i7 && i7 < this.f19693b) {
            byte[] bArr = this.f19692a;
            if (bArr[i7] == 3 && bArr[i7 - 2] == 0 && bArr[i7 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean b(int i7) {
        int i8 = this.f19694c;
        int i9 = i7 / 8;
        int i10 = i8 + i9;
        int i11 = (this.f19695d + i7) - (i9 * 8);
        if (i11 > 7) {
            i10++;
            i11 -= 8;
        }
        while (true) {
            i8++;
            if (i8 > i10 || i10 >= this.f19693b) {
                break;
            }
            if (j(i8)) {
                i10++;
                i8 += 2;
            }
        }
        int i12 = this.f19693b;
        if (i10 >= i12) {
            return i10 == i12 && i11 == 0;
        }
        return true;
    }

    public boolean c() {
        int i7 = this.f19694c;
        int i8 = this.f19695d;
        int i9 = 0;
        while (this.f19694c < this.f19693b && !d()) {
            i9++;
        }
        boolean z6 = this.f19694c == this.f19693b;
        this.f19694c = i7;
        this.f19695d = i8;
        return !z6 && b((i9 * 2) + 1);
    }

    public boolean d() {
        boolean z6 = (this.f19692a[this.f19694c] & (128 >> this.f19695d)) != 0;
        k();
        return z6;
    }

    public int e(int i7) {
        int i8;
        this.f19695d += i7;
        int i9 = 0;
        while (true) {
            i8 = this.f19695d;
            if (i8 <= 8) {
                break;
            }
            int i10 = i8 - 8;
            this.f19695d = i10;
            byte[] bArr = this.f19692a;
            int i11 = this.f19694c;
            i9 |= (bArr[i11] & 255) << i10;
            if (!j(i11 + 1)) {
                r3 = 1;
            }
            this.f19694c = i11 + r3;
        }
        byte[] bArr2 = this.f19692a;
        int i12 = this.f19694c;
        int i13 = ((-1) >>> (32 - i7)) & (i9 | ((bArr2[i12] & 255) >> (8 - i8)));
        if (i8 == 8) {
            this.f19695d = 0;
            this.f19694c = i12 + (j(i12 + 1) ? 2 : 1);
        }
        a();
        return i13;
    }

    public int g() {
        int f7 = f();
        return (f7 % 2 == 0 ? -1 : 1) * ((f7 + 1) / 2);
    }

    public int h() {
        return f();
    }

    public void i(byte[] bArr, int i7, int i8) {
        this.f19692a = bArr;
        this.f19694c = i7;
        this.f19693b = i8;
        this.f19695d = 0;
        a();
    }

    public void k() {
        int i7 = this.f19695d + 1;
        this.f19695d = i7;
        if (i7 == 8) {
            this.f19695d = 0;
            int i8 = this.f19694c;
            this.f19694c = i8 + (j(i8 + 1) ? 2 : 1);
        }
        a();
    }

    public void l(int i7) {
        int i8 = this.f19694c;
        int i9 = i7 / 8;
        int i10 = i8 + i9;
        this.f19694c = i10;
        int i11 = this.f19695d + (i7 - (i9 * 8));
        this.f19695d = i11;
        if (i11 > 7) {
            this.f19694c = i10 + 1;
            this.f19695d = i11 - 8;
        }
        while (true) {
            i8++;
            if (i8 > this.f19694c) {
                a();
                return;
            } else if (j(i8)) {
                this.f19694c++;
                i8 += 2;
            }
        }
    }
}
