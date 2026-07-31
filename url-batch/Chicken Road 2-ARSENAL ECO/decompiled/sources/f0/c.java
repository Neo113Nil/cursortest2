package f0;

import c0.C0269b;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final C0269b f4176a;

    /* renamed from: b, reason: collision with root package name */
    public final C0362b f4177b;

    /* renamed from: c, reason: collision with root package name */
    public final C0362b f4178c;

    public c(C0269b c0269b, C0362b c0362b, C0362b c0362b2) {
        int i7 = c0269b.f3752b;
        this.f4176a = c0269b;
        this.f4177b = c0362b;
        this.f4178c = c0362b2;
        int i8 = c0269b.f3753c;
        int i9 = c0269b.f3751a;
        if (i8 - i9 == 0 && c0269b.f3754d - i7 == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (i9 != 0 && i7 != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        c cVar = (c) obj;
        return kotlin.jvm.internal.i.a(this.f4176a, cVar.f4176a) && kotlin.jvm.internal.i.a(this.f4177b, cVar.f4177b) && kotlin.jvm.internal.i.a(this.f4178c, cVar.f4178c);
    }

    public final int hashCode() {
        return this.f4178c.hashCode() + ((this.f4177b.hashCode() + (this.f4176a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return c.class.getSimpleName() + " { " + this.f4176a + ", type=" + this.f4177b + ", state=" + this.f4178c + " }";
    }
}
