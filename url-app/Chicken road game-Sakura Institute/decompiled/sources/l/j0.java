package l;

import G.AbstractC0188b;
import G.C0192d;
import G.C0197f0;
import G.C0201h0;
import G.C0205j0;
import G.K0;
import G.X0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j0 implements X0 {

    /* renamed from: d, reason: collision with root package name */
    public final v0 f7769d;

    /* renamed from: e, reason: collision with root package name */
    public final C0205j0 f7770e;

    /* renamed from: i, reason: collision with root package name */
    public final C0205j0 f7771i;

    /* renamed from: j, reason: collision with root package name */
    public final C0205j0 f7772j;

    /* renamed from: k, reason: collision with root package name */
    public C0765J f7773k;

    /* renamed from: l, reason: collision with root package name */
    public e0 f7774l;

    /* renamed from: m, reason: collision with root package name */
    public final C0205j0 f7775m;

    /* renamed from: n, reason: collision with root package name */
    public final C0197f0 f7776n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7777o;

    /* renamed from: p, reason: collision with root package name */
    public final C0205j0 f7778p;

    /* renamed from: q, reason: collision with root package name */
    public AbstractC0792s f7779q;

    /* renamed from: r, reason: collision with root package name */
    public final C0201h0 f7780r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7781s;

    /* renamed from: t, reason: collision with root package name */
    public final X f7782t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m0 f7783u;

    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, java.util.Map] */
    public j0(m0 m0Var, Object obj, AbstractC0792s abstractC0792s, v0 v0Var) {
        this.f7783u = m0Var;
        this.f7769d = v0Var;
        G.W w4 = G.W.f2779l;
        C0205j0 K3 = C0192d.K(obj, w4);
        this.f7770e = K3;
        Object obj2 = null;
        C0205j0 K4 = C0192d.K(AbstractC0779e.i(0.0f, null, 7), w4);
        this.f7771i = K4;
        this.f7772j = C0192d.K(new e0((InterfaceC0799z) K4.getValue(), v0Var, obj, K3.getValue(), abstractC0792s), w4);
        this.f7775m = C0192d.K(Boolean.TRUE, w4);
        this.f7776n = C0192d.I(-1.0f);
        this.f7778p = C0192d.K(obj, w4);
        this.f7779q = abstractC0792s;
        long c4 = b().c();
        int i2 = AbstractC0188b.f2789b;
        this.f7780r = new C0201h0(c4);
        Float f4 = (Float) C0.f7563a.get(v0Var);
        if (f4 != null) {
            float floatValue = f4.floatValue();
            AbstractC0792s abstractC0792s2 = (AbstractC0792s) v0Var.f7853a.invoke(obj);
            int b4 = abstractC0792s2.b();
            for (int i4 = 0; i4 < b4; i4++) {
                abstractC0792s2.e(floatValue, i4);
            }
            obj2 = this.f7769d.f7854b.invoke(abstractC0792s2);
        }
        this.f7782t = AbstractC0779e.i(0.0f, obj2, 3);
    }

    public final e0 b() {
        return (e0) this.f7772j.getValue();
    }

    public final void c(long j4) {
        if (this.f7776n.d() == -1.0f) {
            this.f7781s = true;
            if (Intrinsics.a(b().f7739c, b().f7740d)) {
                d(b().f7739c);
            } else {
                d(b().b(j4));
                this.f7779q = b().g(j4);
            }
        }
    }

    public final void d(Object obj) {
        this.f7778p.setValue(obj);
    }

    public final void e(Object obj, boolean z4) {
        e0 e0Var = this.f7774l;
        Object obj2 = e0Var != null ? e0Var.f7739c : null;
        C0205j0 c0205j0 = this.f7770e;
        boolean a4 = Intrinsics.a(obj2, c0205j0.getValue());
        C0201h0 c0201h0 = this.f7780r;
        C0205j0 c0205j02 = this.f7772j;
        if (a4) {
            c0205j02.setValue(new e0(this.f7782t, this.f7769d, obj, obj, this.f7779q.c()));
            this.f7777o = true;
            c0201h0.d(b().c());
            return;
        }
        C0205j0 c0205j03 = this.f7771i;
        InterfaceC0799z interfaceC0799z = (!z4 || this.f7781s) ? (InterfaceC0799z) c0205j03.getValue() : ((InterfaceC0799z) c0205j03.getValue()) instanceof X ? (InterfaceC0799z) c0205j03.getValue() : this.f7782t;
        m0 m0Var = this.f7783u;
        c0205j02.setValue(new e0(m0Var.e() <= 0 ? interfaceC0799z : new Y(interfaceC0799z, m0Var.e()), this.f7769d, obj, c0205j0.getValue(), this.f7779q));
        c0201h0.d(b().c());
        this.f7777o = false;
        Boolean bool = Boolean.TRUE;
        C0205j0 c0205j04 = m0Var.f7807h;
        c0205j04.setValue(bool);
        if (m0Var.g()) {
            Q.v vVar = m0Var.f7808i;
            int size = vVar.size();
            long j4 = 0;
            for (int i2 = 0; i2 < size; i2++) {
                j0 j0Var = (j0) vVar.get(i2);
                C0201h0 c0201h02 = j0Var.f7780r;
                j4 = Math.max(j4, ((K0) Q.q.t(c0201h02.f2815e, c0201h02)).f2715c);
                j0Var.c(0L);
            }
            c0205j04.setValue(Boolean.FALSE);
        }
    }

    public final void f(Object obj, Object obj2, InterfaceC0799z interfaceC0799z) {
        this.f7770e.setValue(obj2);
        this.f7771i.setValue(interfaceC0799z);
        if (Intrinsics.a(b().f7740d, obj) && Intrinsics.a(b().f7739c, obj2)) {
            return;
        }
        e(obj, false);
    }

    public final void g(Object obj, InterfaceC0799z interfaceC0799z) {
        if (this.f7777o) {
            e0 e0Var = this.f7774l;
            if (Intrinsics.a(obj, e0Var != null ? e0Var.f7739c : null)) {
                return;
            }
        }
        C0205j0 c0205j0 = this.f7770e;
        boolean a4 = Intrinsics.a(c0205j0.getValue(), obj);
        C0197f0 c0197f0 = this.f7776n;
        if (a4 && c0197f0.d() == -1.0f) {
            return;
        }
        c0205j0.setValue(obj);
        this.f7771i.setValue(interfaceC0799z);
        Object value = c0197f0.d() == -3.0f ? obj : this.f7778p.getValue();
        C0205j0 c0205j02 = this.f7775m;
        e(value, !((Boolean) c0205j02.getValue()).booleanValue());
        c0205j02.setValue(Boolean.valueOf(c0197f0.d() == -3.0f));
        if (c0197f0.d() >= 0.0f) {
            d(b().b((long) (c0197f0.d() * b().c())));
        } else if (c0197f0.d() == -3.0f) {
            d(obj);
        }
        this.f7777o = false;
        c0197f0.f(-1.0f);
    }

    @Override // G.X0
    public final Object getValue() {
        return this.f7778p.getValue();
    }

    public final String toString() {
        return "current value: " + this.f7778p.getValue() + ", target: " + this.f7770e.getValue() + ", spec: " + ((InterfaceC0799z) this.f7771i.getValue());
    }
}
