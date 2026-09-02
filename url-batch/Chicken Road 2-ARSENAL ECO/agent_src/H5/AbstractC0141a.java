package H5;

import k5.AbstractC0479i;
import o5.InterfaceC0564d;
import o5.InterfaceC0569i;
import p5.EnumC0580a;
import q5.AbstractC0605a;
import u0.AbstractC0676f;
import x5.InterfaceC0747p;

/* renamed from: H5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0141a extends g0 implements InterfaceC0564d, InterfaceC0163x {

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0569i f1053h;

    public AbstractC0141a(InterfaceC0569i interfaceC0569i, boolean z5) {
        super(z5);
        F((X) interfaceC0569i.m(C0162w.f1110g));
        this.f1053h = interfaceC0569i.v(this);
    }

    @Override // H5.g0
    public final void E(r rVar) {
        AbstractC0165z.i(this.f1053h, rVar);
    }

    @Override // H5.g0
    public final void N(Object obj) {
        if (!(obj instanceof C0156p)) {
            U(obj);
        } else {
            C0156p c0156p = (C0156p) obj;
            T(c0156p.f1093a, C0156p.f1092b.get(c0156p) != 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V(int i7, AbstractC0141a abstractC0141a, InterfaceC0747p interfaceC0747p) {
        int c7 = N.p.c(i7);
        if (c7 == 0) {
            AbstractC0676f.v(interfaceC0747p, abstractC0141a, this);
            return;
        }
        if (c7 != 1) {
            if (c7 == 2) {
                AbstractC0676f.m(((AbstractC0605a) interfaceC0747p).create(abstractC0141a, this)).resumeWith(k5.v.f5219a);
                return;
            }
            if (c7 != 3) {
                throw new r();
            }
            try {
                InterfaceC0569i interfaceC0569i = this.f1053h;
                Object m4 = M5.a.m(interfaceC0569i, null);
                try {
                    kotlin.jvm.internal.v.b(2, interfaceC0747p);
                    Object invoke = interfaceC0747p.invoke(abstractC0141a, this);
                    if (invoke != EnumC0580a.f5697f) {
                        resumeWith(invoke);
                    }
                } finally {
                    M5.a.g(interfaceC0569i, m4);
                }
            } catch (Throwable th) {
                resumeWith(AbstractC0676f.f(th));
            }
        }
    }

    @Override // H5.InterfaceC0163x
    public final InterfaceC0569i e() {
        return this.f1053h;
    }

    @Override // o5.InterfaceC0564d
    public final InterfaceC0569i getContext() {
        return this.f1053h;
    }

    @Override // H5.g0
    public final String q() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // o5.InterfaceC0564d
    public final void resumeWith(Object obj) {
        Throwable a7 = AbstractC0479i.a(obj);
        if (a7 != null) {
            obj = new C0156p(a7, false);
        }
        Object J3 = J(obj);
        if (J3 == AbstractC0165z.f1118e) {
            return;
        }
        l(J3);
    }

    public void U(Object obj) {
    }

    public void T(Throwable th, boolean z5) {
    }
}
