package q0;

import T.C0097o;
import T.InterfaceC0090h;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class P implements y0.F {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f14860a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f14861b;

    /* renamed from: c, reason: collision with root package name */
    public final y0.m f14862c = new y0.m();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f14863d = new AtomicReference(O.f14856a);

    public P(a0 a0Var) {
        this.f14860a = a0Var;
        this.f14861b = a0Var;
    }

    @Override // y0.F
    public final void a(int i4, W.u uVar) {
        h().a(i4, uVar);
    }

    @Override // y0.F
    public final void b(W.u uVar, int i4, int i5) {
        h().b(uVar, i4, i5);
    }

    @Override // y0.F
    public final void d(C0097o c0097o) {
        this.f14860a.d(c0097o);
    }

    @Override // y0.F
    public final void e(long j4, int i4, int i5, int i6, y0.E e4) {
        h().e(j4, i4, i5, i6, e4);
        AtomicReference atomicReference = this.f14863d;
        if (atomicReference.get() == O.f14857b) {
            this.f14861b.E(false);
            atomicReference.set(O.f14858c);
        }
    }

    @Override // y0.F
    public final int f(InterfaceC0090h interfaceC0090h, int i4, boolean z) {
        return h().f(interfaceC0090h, i4, z);
    }

    @Override // y0.F
    public final int g(InterfaceC0090h interfaceC0090h, int i4, boolean z) {
        return h().g(interfaceC0090h, i4, z);
    }

    public final y0.F h() {
        return this.f14863d.get() == O.f14858c ? this.f14862c : this.f14861b;
    }

    @Override // y0.F
    public final void c(long j4) {
    }
}
