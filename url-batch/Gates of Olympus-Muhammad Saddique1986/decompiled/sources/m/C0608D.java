package m;

/* renamed from: m.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0608D {

    /* renamed from: a, reason: collision with root package name */
    public final Float f6602a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0638x f6603b;

    /* renamed from: c, reason: collision with root package name */
    public int f6604c;

    public C0608D(Float f3, InterfaceC0638x interfaceC0638x) {
        this.f6602a = f3;
        this.f6603b = interfaceC0638x;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0608D)) {
            return false;
        }
        C0608D c0608d = (C0608D) obj;
        return c0608d.f6602a.equals(this.f6602a) && f2.j.a(c0608d.f6603b, this.f6603b) && c0608d.f6604c == this.f6604c;
    }

    public final int hashCode() {
        return this.f6603b.hashCode() + AbstractC0625j.a(this.f6604c, this.f6602a.hashCode() * 31, 31);
    }
}
