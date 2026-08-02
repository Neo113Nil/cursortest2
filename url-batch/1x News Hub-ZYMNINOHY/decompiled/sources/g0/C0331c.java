package g0;

import d0.C0295b;

/* renamed from: g0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0331c {

    /* renamed from: a, reason: collision with root package name */
    public final C0295b f5017a;

    /* renamed from: b, reason: collision with root package name */
    public final C0330b f5018b;

    /* renamed from: c, reason: collision with root package name */
    public final C0330b f5019c;

    public C0331c(C0295b c0295b, C0330b c0330b, C0330b c0330b2) {
        this.f5017a = c0295b;
        this.f5018b = c0330b;
        this.f5019c = c0330b2;
        int i3 = c0295b.f4911c;
        int i4 = c0295b.f4909a;
        int i5 = i3 - i4;
        int i6 = c0295b.f4910b;
        if (i5 == 0 && c0295b.f4912d - i6 == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (i4 != 0 && i6 != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0331c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        C0331c c0331c = (C0331c) obj;
        return kotlin.jvm.internal.j.a(this.f5017a, c0331c.f5017a) && kotlin.jvm.internal.j.a(this.f5018b, c0331c.f5018b) && kotlin.jvm.internal.j.a(this.f5019c, c0331c.f5019c);
    }

    public final int hashCode() {
        return this.f5019c.hashCode() + ((this.f5018b.hashCode() + (this.f5017a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return C0331c.class.getSimpleName() + " { " + this.f5017a + ", type=" + this.f5018b + ", state=" + this.f5019c + " }";
    }
}
