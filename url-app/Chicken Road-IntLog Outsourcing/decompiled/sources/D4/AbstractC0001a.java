package D4;

import f4.AbstractC0432i;
import k4.InterfaceC1218d;
import k4.InterfaceC1223i;
import l4.EnumC1260a;
import m4.AbstractC1293a;
import t4.InterfaceC1445p;

/* renamed from: D4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0001a extends g0 implements InterfaceC1218d, InterfaceC0022w {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1223i f486c;

    public AbstractC0001a(InterfaceC1223i interfaceC1223i, boolean z) {
        super(z);
        G((X) interfaceC1223i.o(C0021v.f545b));
        this.f486c = interfaceC1223i.A(this);
    }

    @Override // D4.g0
    public final void F(C1.b bVar) {
        AbstractC0024y.j(bVar, this.f486c);
    }

    @Override // D4.g0
    public final void Q(Object obj) {
        if (!(obj instanceof C0016p)) {
            X(obj);
            return;
        }
        C0016p c0016p = (C0016p) obj;
        Throwable th = c0016p.f526a;
        c0016p.getClass();
        W(th, C0016p.f525b.get(c0016p) != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y(int i2, AbstractC0001a abstractC0001a, InterfaceC1445p interfaceC1445p) {
        int b6 = O.j.b(i2);
        if (b6 == 0) {
            K1.b.p0(interfaceC1445p, abstractC0001a, this);
            return;
        }
        if (b6 != 1) {
            if (b6 == 2) {
                B0.f.F(((AbstractC1293a) interfaceC1445p).create(abstractC0001a, this)).resumeWith(f4.v.f5689a);
                return;
            }
            if (b6 != 3) {
                throw new C1.b();
            }
            try {
                InterfaceC1223i interfaceC1223i = this.f486c;
                Object n6 = I4.a.n(interfaceC1223i, null);
                try {
                    kotlin.jvm.internal.v.b(2, interfaceC1445p);
                    Object invoke = interfaceC1445p.invoke(abstractC0001a, this);
                    if (invoke != EnumC1260a.f11058a) {
                        resumeWith(invoke);
                    }
                } finally {
                    I4.a.h(interfaceC1223i, n6);
                }
            } catch (Throwable th) {
                resumeWith(e5.g.l(th));
            }
        }
    }

    @Override // D4.InterfaceC0022w
    public final InterfaceC1223i g() {
        return this.f486c;
    }

    @Override // k4.InterfaceC1218d
    public final InterfaceC1223i getContext() {
        return this.f486c;
    }

    @Override // k4.InterfaceC1218d
    public final void resumeWith(Object obj) {
        Throwable a6 = AbstractC0432i.a(obj);
        if (a6 != null) {
            obj = new C0016p(a6, false);
        }
        Object M5 = M(obj);
        if (M5 == AbstractC0024y.f552e) {
            return;
        }
        m(M5);
    }

    @Override // D4.g0
    public final String s() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void X(Object obj) {
    }

    public void W(Throwable th, boolean z) {
    }
}
