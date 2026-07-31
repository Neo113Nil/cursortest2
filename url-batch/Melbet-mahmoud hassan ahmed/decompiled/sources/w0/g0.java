package w0;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f22913a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22914b;

    /* renamed from: c, reason: collision with root package name */
    private int f22915c;

    /* renamed from: d, reason: collision with root package name */
    private int f22916d;

    public g0(byte[] bArr) {
        this.f22913a = bArr;
        this.f22914b = bArr.length;
    }

    private void a() {
        int i7;
        int i8 = this.f22915c;
        o2.a.f(i8 >= 0 && (i8 < (i7 = this.f22914b) || (i8 == i7 && this.f22916d == 0)));
    }

    public int b() {
        return (this.f22915c * 8) + this.f22916d;
    }

    public boolean c() {
        boolean z6 = (((this.f22913a[this.f22915c] & 255) >> this.f22916d) & 1) == 1;
        e(1);
        return z6;
    }

    public int d(int i7) {
        int i8 = this.f22915c;
        int min = Math.min(i7, 8 - this.f22916d);
        int i9 = i8 + 1;
        int i10 = ((this.f22913a[i8] & 255) >> this.f22916d) & (255 >> (8 - min));
        while (min < i7) {
            i10 |= (this.f22913a[i9] & 255) << min;
            min += 8;
            i9++;
        }
        int i11 = i10 & ((-1) >>> (32 - i7));
        e(i7);
        return i11;
    }

    public void e(int i7) {
        int i8 = i7 / 8;
        int i9 = this.f22915c + i8;
        this.f22915c = i9;
        int i10 = this.f22916d + (i7 - (i8 * 8));
        this.f22916d = i10;
        if (i10 > 7) {
            this.f22915c = i9 + 1;
            this.f22916d = i10 - 8;
        }
        a();
    }
}
