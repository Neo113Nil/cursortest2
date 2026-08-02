package t2;

import b2.C0192f;
import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import f2.AbstractC0324a;

/* renamed from: t2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1191a extends e0 implements InterfaceC0300c, InterfaceC1210u {

    /* renamed from: c, reason: collision with root package name */
    public final d2.h f10396c;

    public AbstractC1191a(d2.h hVar, boolean z) {
        super(z);
        G((U) hVar.h(C1209t.f10441b));
        this.f10396c = hVar.i(this);
    }

    @Override // t2.e0
    public final void F(O0.b bVar) {
        AbstractC1212w.e(this.f10396c, bVar);
    }

    @Override // t2.e0
    public final void N(Object obj) {
        if (!(obj instanceof C1204n)) {
            U(obj);
        } else {
            C1204n c1204n = (C1204n) obj;
            T(c1204n.f10431a, C1204n.f10430b.get(c1204n) != 0);
        }
    }

    public final void V(EnumC1211v enumC1211v, AbstractC1191a abstractC1191a, l2.p pVar) {
        Object invoke;
        int ordinal = enumC1211v.ordinal();
        if (ordinal == 0) {
            android.support.v4.media.session.a.S(pVar, abstractC1191a, this);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                kotlin.jvm.internal.j.e(pVar, "<this>");
                C2.b.x(C2.b.j(pVar, abstractC1191a, this)).f(C0195i.f2555a);
                return;
            }
            if (ordinal != 3) {
                throw new O0.b();
            }
            try {
                d2.h hVar = this.f10396c;
                Object l3 = y2.a.l(hVar, null);
                try {
                    if (pVar instanceof AbstractC0324a) {
                        kotlin.jvm.internal.t.b(2, pVar);
                        invoke = pVar.invoke(abstractC1191a, this);
                    } else {
                        invoke = C2.b.L(pVar, abstractC1191a, this);
                    }
                    y2.a.f(hVar, l3);
                    if (invoke != EnumC0317a.f4969a) {
                        f(invoke);
                    }
                } catch (Throwable th) {
                    y2.a.f(hVar, l3);
                    throw th;
                }
            } catch (Throwable th2) {
                f(android.support.v4.media.session.a.k(th2));
            }
        }
    }

    @Override // t2.InterfaceC1210u
    public final d2.h e() {
        return this.f10396c;
    }

    @Override // d2.InterfaceC0300c
    public final void f(Object obj) {
        Throwable a3 = C0192f.a(obj);
        if (a3 != null) {
            obj = new C1204n(a3, false);
        }
        Object K2 = K(obj);
        if (K2 == AbstractC1212w.f10448d) {
            return;
        }
        p(K2);
    }

    @Override // d2.InterfaceC0300c
    public final d2.h getContext() {
        return this.f10396c;
    }

    @Override // t2.e0
    public final String u() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void U(Object obj) {
    }

    public void T(Throwable th, boolean z) {
    }
}
