package x3;

import c3.C0294f;
import c3.C0297i;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import f3.InterfaceC0425c;
import f3.InterfaceC0430h;
import g3.EnumC0441a;
import h3.AbstractC0448a;

/* renamed from: x3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1541a extends d0 implements InterfaceC0425c, InterfaceC1560u {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0430h f16012c;

    public AbstractC1541a(InterfaceC0430h interfaceC0430h, boolean z) {
        super(z);
        D((T) interfaceC0430h.n(C1559t.f16059b));
        this.f16012c = interfaceC0430h.f(this);
    }

    @Override // x3.d0
    public final void C(G1.a aVar) {
        AbstractC1562w.e(this.f16012c, aVar);
    }

    @Override // x3.d0
    public final void K(Object obj) {
        if (!(obj instanceof C1554n)) {
            R(obj);
        } else {
            C1554n c1554n = (C1554n) obj;
            Q(c1554n.f16048a, C1554n.f16047b.get(c1554n) != 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S(EnumC1561v enumC1561v, AbstractC1541a abstractC1541a, o3.p pVar) {
        int ordinal = enumC1561v.ordinal();
        if (ordinal == 0) {
            V3.b.y(pVar, abstractC1541a, this);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                AbstractC0347t0.m(((AbstractC0448a) pVar).create(abstractC1541a, this)).resumeWith(C0297i.f5732a);
                return;
            }
            if (ordinal != 3) {
                throw new G1.a();
            }
            try {
                InterfaceC0430h interfaceC0430h = this.f16012c;
                Object l4 = C3.a.l(interfaceC0430h, null);
                try {
                    kotlin.jvm.internal.s.a(2, pVar);
                    Object invoke = pVar.invoke(abstractC1541a, this);
                    if (invoke != EnumC0441a.f9038a) {
                        resumeWith(invoke);
                    }
                } finally {
                    C3.a.f(interfaceC0430h, l4);
                }
            } catch (Throwable th) {
                resumeWith(O3.l.h(th));
            }
        }
    }

    @Override // x3.InterfaceC1560u
    public final InterfaceC0430h g() {
        return this.f16012c;
    }

    @Override // f3.InterfaceC0425c
    public final InterfaceC0430h getContext() {
        return this.f16012c;
    }

    @Override // x3.d0
    public final String r() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // f3.InterfaceC0425c
    public final void resumeWith(Object obj) {
        Throwable a3 = C0294f.a(obj);
        if (a3 != null) {
            obj = new C1554n(a3, false);
        }
        Object H4 = H(obj);
        if (H4 == AbstractC1562w.f16066d) {
            return;
        }
        m(H4);
    }

    public void R(Object obj) {
    }

    public void Q(Throwable th, boolean z) {
    }
}
