package U;

/* renamed from: U.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0066b {

    /* renamed from: a, reason: collision with root package name */
    public long f1389a = 0;

    /* renamed from: b, reason: collision with root package name */
    public C0066b f1390b;

    public final int a(int i3) {
        C0066b c0066b = this.f1390b;
        if (c0066b == null) {
            return i3 >= 64 ? Long.bitCount(this.f1389a) : Long.bitCount(this.f1389a & ((1 << i3) - 1));
        }
        if (i3 < 64) {
            return Long.bitCount(this.f1389a & ((1 << i3) - 1));
        }
        return Long.bitCount(this.f1389a) + c0066b.a(i3 - 64);
    }

    public final boolean b(int i3) {
        if (i3 < 64) {
            return (this.f1389a & (1 << i3)) != 0;
        }
        if (this.f1390b == null) {
            this.f1390b = new C0066b();
        }
        return this.f1390b.b(i3 - 64);
    }

    public final void c() {
        this.f1389a = 0L;
        C0066b c0066b = this.f1390b;
        if (c0066b != null) {
            c0066b.c();
        }
    }

    public final String toString() {
        if (this.f1390b == null) {
            return Long.toBinaryString(this.f1389a);
        }
        return this.f1390b.toString() + "xx" + Long.toBinaryString(this.f1389a);
    }
}
