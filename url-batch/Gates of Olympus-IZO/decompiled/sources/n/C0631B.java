package n;

import b0.C0288u;
import d0.C0321b;
import d0.InterfaceC0323d;
import k2.AbstractC0552y;
import t0.InterfaceC0907o;

/* renamed from: n.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0631B extends U.k implements InterfaceC0907o {

    /* renamed from: q, reason: collision with root package name */
    public final q.i f5981q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5982r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5983s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f5984t;

    public C0631B(q.i iVar) {
        this.f5981q = iVar;
    }

    @Override // t0.InterfaceC0907o
    public final void d(t0.F f3) {
        f3.b();
        boolean z3 = this.f5982r;
        C0321b c0321b = f3.f7748d;
        if (z3) {
            InterfaceC0323d.s(f3, C0288u.b(C0288u.f4292b, 0.3f), 0L, c0321b.c(), null, 122);
        } else if (this.f5983s || this.f5984t) {
            InterfaceC0323d.s(f3, C0288u.b(C0288u.f4292b, 0.1f), 0L, c0321b.c(), null, 122);
        }
    }

    @Override // U.k
    public final void n0() {
        AbstractC0552y.q(j0(), null, null, new C0630A(this, null), 3);
    }
}
