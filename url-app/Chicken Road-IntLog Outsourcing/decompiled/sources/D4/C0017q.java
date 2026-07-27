package D4;

import t4.InterfaceC1441l;

/* renamed from: D4.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0017q {

    /* renamed from: a, reason: collision with root package name */
    public final Object f528a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1441l f529b;

    public C0017q(Object obj, InterfaceC1441l interfaceC1441l) {
        this.f528a = obj;
        this.f529b = interfaceC1441l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0017q)) {
            return false;
        }
        C0017q c0017q = (C0017q) obj;
        return kotlin.jvm.internal.i.a(this.f528a, c0017q.f528a) && kotlin.jvm.internal.i.a(this.f529b, c0017q.f529b);
    }

    public final int hashCode() {
        Object obj = this.f528a;
        return this.f529b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f528a + ", onCancellation=" + this.f529b + ')';
    }
}
