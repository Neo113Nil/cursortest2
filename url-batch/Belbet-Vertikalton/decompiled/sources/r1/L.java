package r1;

import i1.InterfaceC0192l;

/* loaded from: classes.dex */
public final class L implements Y, InterfaceC0192l {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.room.g f4046a;

    public L(androidx.room.g gVar) {
        this.f4046a = gVar;
    }

    public final void a(Throwable th) {
        this.f4046a.g(th);
    }

    @Override // i1.InterfaceC0192l
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        a((Throwable) obj);
        return W0.i.f1345a;
    }

    public final String toString() {
        return "InvokeOnCancel[" + androidx.room.g.class.getSimpleName() + '@' + AbstractC0369t.c(this) + ']';
    }
}
