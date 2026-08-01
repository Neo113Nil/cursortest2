package r1;

import i1.InterfaceC0192l;

/* renamed from: r1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0362l {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4080a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0192l f4081b;

    public C0362l(Object obj, InterfaceC0192l interfaceC0192l) {
        this.f4080a = obj;
        this.f4081b = interfaceC0192l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0362l)) {
            return false;
        }
        C0362l c0362l = (C0362l) obj;
        return j1.h.a(this.f4080a, c0362l.f4080a) && j1.h.a(this.f4081b, c0362l.f4081b);
    }

    public final int hashCode() {
        Object obj = this.f4080a;
        return this.f4081b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f4080a + ", onCancellation=" + this.f4081b + ')';
    }
}
