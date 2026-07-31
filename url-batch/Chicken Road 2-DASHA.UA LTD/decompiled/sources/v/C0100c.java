package v;

import s.C0094b;

/* renamed from: v.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0100c {

    /* renamed from: a, reason: collision with root package name */
    public final C0094b f1271a;

    /* renamed from: b, reason: collision with root package name */
    public final C0099b f1272b;

    /* renamed from: c, reason: collision with root package name */
    public final C0099b f1273c;

    public C0100c(C0094b c0094b, C0099b c0099b, C0099b c0099b2) {
        this.f1271a = c0094b;
        this.f1272b = c0099b;
        this.f1273c = c0099b2;
        if (c0094b.b() == 0 && c0094b.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (c0094b.f1236a != 0 && c0094b.f1237b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0100c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        e0.h.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        C0100c c0100c = (C0100c) obj;
        return e0.h.a(this.f1271a, c0100c.f1271a) && e0.h.a(this.f1272b, c0100c.f1272b) && e0.h.a(this.f1273c, c0100c.f1273c);
    }

    public final int hashCode() {
        return this.f1273c.hashCode() + ((this.f1272b.hashCode() + (this.f1271a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return C0100c.class.getSimpleName() + " { " + this.f1271a + ", type=" + this.f1272b + ", state=" + this.f1273c + " }";
    }
}
