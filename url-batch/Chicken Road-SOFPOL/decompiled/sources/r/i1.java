package r;

import m0.l2;
import m0.t2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i1 implements t2 {

    /* renamed from: d, reason: collision with root package name */
    public final r1 f6311d;

    /* renamed from: e, reason: collision with root package name */
    public final m0.h1 f6312e;

    /* renamed from: f, reason: collision with root package name */
    public final m0.h1 f6313f;

    /* renamed from: g, reason: collision with root package name */
    public final m0.h1 f6314g;

    /* renamed from: h, reason: collision with root package name */
    public l0 f6315h;
    public c1 i;

    /* renamed from: j, reason: collision with root package name */
    public final m0.h1 f6316j;

    /* renamed from: k, reason: collision with root package name */
    public final m0.d1 f6317k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6318l;

    /* renamed from: m, reason: collision with root package name */
    public final m0.h1 f6319m;

    /* renamed from: n, reason: collision with root package name */
    public p f6320n;

    /* renamed from: o, reason: collision with root package name */
    public final m0.f1 f6321o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6322p;

    /* renamed from: q, reason: collision with root package name */
    public final u0 f6323q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l1 f6324r;

    public i1(l1 l1Var, Object obj, p pVar, r1 r1Var) {
        this.f6324r = l1Var;
        this.f6311d = r1Var;
        m0.h1 q4 = m0.b.q(obj);
        this.f6312e = q4;
        Object obj2 = null;
        m0.h1 q7 = m0.b.q(d.l(0.0f, 0.0f, null, 7));
        this.f6313f = q7;
        this.f6314g = m0.b.q(new c1((v) q7.getValue(), r1Var, obj, q4.getValue(), pVar));
        this.f6316j = m0.b.q(Boolean.TRUE);
        this.f6317k = new m0.d1(-1.0f);
        this.f6319m = m0.b.q(obj);
        this.f6320n = pVar;
        this.f6321o = new m0.f1(a().c());
        Float f6 = (Float) x1.f6455a.get(r1Var);
        if (f6 != null) {
            float floatValue = f6.floatValue();
            p pVar2 = (p) r1Var.f6413a.i(obj);
            int b8 = pVar2.b();
            for (int i = 0; i < b8; i++) {
                pVar2.e(i, floatValue);
            }
            obj2 = this.f6311d.f6414b.i(pVar2);
        }
        this.f6323q = d.l(0.0f, 0.0f, obj2, 3);
    }

    public final c1 a() {
        return (c1) this.f6314g.getValue();
    }

    public final void b(long j7) {
        if (this.f6317k.g() == -1.0f) {
            this.f6322p = true;
            if (q6.i.a(a().f6248c, a().f6249d)) {
                c(a().f6248c);
            } else {
                c(a().b(j7));
                this.f6320n = a().f(j7);
            }
        }
    }

    public final void c(Object obj) {
        this.f6319m.setValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [r.v0] */
    public final void e(Object obj, boolean z3) {
        c1 c1Var = this.i;
        Object obj2 = c1Var != null ? c1Var.f6248c : null;
        m0.h1 h1Var = this.f6312e;
        boolean a8 = q6.i.a(obj2, h1Var.getValue());
        m0.f1 f1Var = this.f6321o;
        m0.h1 h1Var2 = this.f6314g;
        r1 r1Var = this.f6311d;
        v vVar = this.f6323q;
        if (a8) {
            h1Var2.setValue(new c1(vVar, r1Var, obj, obj, this.f6320n.c()));
            this.f6318l = true;
            f1Var.g(a().c());
            return;
        }
        m0.h1 h1Var3 = this.f6313f;
        if (!z3 || this.f6322p) {
            vVar = (v) h1Var3.getValue();
        } else if (((v) h1Var3.getValue()) instanceof u0) {
            vVar = (v) h1Var3.getValue();
        }
        l1 l1Var = this.f6324r;
        long e8 = l1Var.e();
        m0.h1 h1Var4 = l1Var.f6353h;
        if (e8 > 0) {
            vVar = new v0(vVar, l1Var.e());
        }
        h1Var2.setValue(new c1(vVar, r1Var, obj, h1Var.getValue(), this.f6320n));
        f1Var.g(a().c());
        this.f6318l = false;
        h1Var4.setValue(Boolean.TRUE);
        if (l1Var.g()) {
            w0.p pVar = l1Var.i;
            int size = pVar.size();
            long j7 = 0;
            for (int i = 0; i < size; i++) {
                i1 i1Var = (i1) pVar.get(i);
                m0.f1 f1Var2 = i1Var.f6321o;
                j7 = Math.max(j7, ((l2) w0.m.t(f1Var2.f4927e, f1Var2)).f5014c);
                i1Var.b(0L);
            }
            h1Var4.setValue(Boolean.FALSE);
        }
    }

    public final void f(Object obj, Object obj2, v vVar) {
        this.f6312e.setValue(obj2);
        this.f6313f.setValue(vVar);
        if (q6.i.a(a().f6249d, obj) && q6.i.a(a().f6248c, obj2)) {
            return;
        }
        e(obj, false);
    }

    @Override // m0.t2
    public final Object getValue() {
        return this.f6319m.getValue();
    }

    public final String toString() {
        return "current value: " + this.f6319m.getValue() + ", target: " + this.f6312e.getValue() + ", spec: " + ((v) this.f6313f.getValue());
    }
}
