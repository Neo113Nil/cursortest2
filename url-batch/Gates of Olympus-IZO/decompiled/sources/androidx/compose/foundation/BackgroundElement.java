package androidx.compose.foundation;

import H2.AbstractC0080b;
import U.k;
import Z1.i;
import b0.AbstractC0259J;
import b0.C0288u;
import b0.InterfaceC0263N;
import n.C0660o;
import t0.T;

/* loaded from: classes.dex */
final class BackgroundElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final long f3584a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0259J f3585b = null;

    /* renamed from: c, reason: collision with root package name */
    public final float f3586c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0263N f3587d;

    public BackgroundElement(long j3, InterfaceC0263N interfaceC0263N) {
        this.f3584a = j3;
        this.f3587d = interfaceC0263N;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && C0288u.c(this.f3584a, backgroundElement.f3584a) && i.a(this.f3585b, backgroundElement.f3585b) && this.f3586c == backgroundElement.f3586c && i.a(this.f3587d, backgroundElement.f3587d);
    }

    @Override // t0.T
    public final k h() {
        C0660o c0660o = new C0660o();
        c0660o.f6129q = this.f3584a;
        c0660o.f6130r = this.f3585b;
        c0660o.f6131s = this.f3586c;
        c0660o.f6132t = this.f3587d;
        c0660o.f6133u = 9205357640488583168L;
        return c0660o;
    }

    public final int hashCode() {
        int i3 = C0288u.f4297g;
        int hashCode = Long.hashCode(this.f3584a) * 31;
        AbstractC0259J abstractC0259J = this.f3585b;
        return this.f3587d.hashCode() + AbstractC0080b.a(this.f3586c, (hashCode + (abstractC0259J != null ? abstractC0259J.hashCode() : 0)) * 31, 31);
    }

    @Override // t0.T
    public final void i(k kVar) {
        C0660o c0660o = (C0660o) kVar;
        c0660o.f6129q = this.f3584a;
        c0660o.f6130r = this.f3585b;
        c0660o.f6131s = this.f3586c;
        c0660o.f6132t = this.f3587d;
    }
}
