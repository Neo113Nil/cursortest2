package N;

/* renamed from: N.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0045b {

    /* renamed from: a, reason: collision with root package name */
    public long f701a = 0;

    /* renamed from: b, reason: collision with root package name */
    public C0045b f702b;

    public final int a(int i2) {
        C0045b c0045b = this.f702b;
        if (c0045b == null) {
            return i2 >= 64 ? Long.bitCount(this.f701a) : Long.bitCount(this.f701a & ((1 << i2) - 1));
        }
        if (i2 < 64) {
            return Long.bitCount(this.f701a & ((1 << i2) - 1));
        }
        return Long.bitCount(this.f701a) + c0045b.a(i2 - 64);
    }

    public final boolean b(int i2) {
        if (i2 < 64) {
            return (this.f701a & (1 << i2)) != 0;
        }
        if (this.f702b == null) {
            this.f702b = new C0045b();
        }
        return this.f702b.b(i2 - 64);
    }

    public final void c() {
        this.f701a = 0L;
        C0045b c0045b = this.f702b;
        if (c0045b != null) {
            c0045b.c();
        }
    }

    public final String toString() {
        if (this.f702b == null) {
            return Long.toBinaryString(this.f701a);
        }
        return this.f702b.toString() + "xx" + Long.toBinaryString(this.f701a);
    }
}
