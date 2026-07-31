package e2;

/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0377a {

    /* renamed from: a, reason: collision with root package name */
    public final float f4766a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4767b;

    public C0377a(float f3, float f4) {
        this.f4766a = f3;
        this.f4767b = f4;
    }

    public static boolean b(Float f3, Float f4) {
        return f3.floatValue() <= f4.floatValue();
    }

    public final boolean a() {
        return this.f4766a > this.f4767b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0377a) {
            if (!a() || !((C0377a) obj).a()) {
                C0377a c0377a = (C0377a) obj;
                if (this.f4766a != c0377a.f4766a || this.f4767b != c0377a.f4767b) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return (Float.hashCode(this.f4766a) * 31) + Float.hashCode(this.f4767b);
    }

    public final String toString() {
        return this.f4766a + ".." + this.f4767b;
    }
}
