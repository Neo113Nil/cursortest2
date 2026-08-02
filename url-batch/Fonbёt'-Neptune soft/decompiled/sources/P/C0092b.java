package P;

/* renamed from: P.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0092b {

    /* renamed from: a, reason: collision with root package name */
    public long f878a = 0;

    /* renamed from: b, reason: collision with root package name */
    public C0092b f879b;

    public final int a(int i2) {
        C0092b c0092b = this.f879b;
        if (c0092b == null) {
            return i2 >= 64 ? Long.bitCount(this.f878a) : Long.bitCount(this.f878a & ((1 << i2) - 1));
        }
        if (i2 < 64) {
            return Long.bitCount(this.f878a & ((1 << i2) - 1));
        }
        return Long.bitCount(this.f878a) + c0092b.a(i2 - 64);
    }

    public final boolean b(int i2) {
        if (i2 < 64) {
            return (this.f878a & (1 << i2)) != 0;
        }
        if (this.f879b == null) {
            this.f879b = new C0092b();
        }
        return this.f879b.b(i2 - 64);
    }

    public final void c() {
        this.f878a = 0L;
        C0092b c0092b = this.f879b;
        if (c0092b != null) {
            c0092b.c();
        }
    }

    public final String toString() {
        if (this.f879b == null) {
            return Long.toBinaryString(this.f878a);
        }
        return this.f879b.toString() + "xx" + Long.toBinaryString(this.f878a);
    }
}
