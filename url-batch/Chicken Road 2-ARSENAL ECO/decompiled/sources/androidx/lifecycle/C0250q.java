package androidx.lifecycle;

import H5.C0162w;
import H5.InterfaceC0163x;
import o5.InterfaceC0569i;

/* renamed from: androidx.lifecycle.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0250q implements InterfaceC0252t, InterfaceC0163x {

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0248o f3520f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0569i f3521g;

    public C0250q(AbstractC0248o abstractC0248o, InterfaceC0569i coroutineContext) {
        H5.X x6;
        kotlin.jvm.internal.i.e(coroutineContext, "coroutineContext");
        this.f3520f = abstractC0248o;
        this.f3521g = coroutineContext;
        if (((C0255w) abstractC0248o).f3527d != EnumC0247n.f3511f || (x6 = (H5.X) coroutineContext.m(C0162w.f1110g)) == null) {
            return;
        }
        x6.d(null);
    }

    @Override // androidx.lifecycle.InterfaceC0252t
    public final void a(InterfaceC0253u interfaceC0253u, EnumC0246m enumC0246m) {
        AbstractC0248o abstractC0248o = this.f3520f;
        if (((C0255w) abstractC0248o).f3527d.compareTo(EnumC0247n.f3511f) <= 0) {
            abstractC0248o.b(this);
            H5.X x6 = (H5.X) this.f3521g.m(C0162w.f1110g);
            if (x6 != null) {
                x6.d(null);
            }
        }
    }

    @Override // H5.InterfaceC0163x
    public final InterfaceC0569i e() {
        return this.f3521g;
    }
}
