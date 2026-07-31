package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class s82 {

    /* renamed from: a, reason: collision with root package name */
    private final ws2 f11730a;

    /* renamed from: b, reason: collision with root package name */
    private final ot1 f11731b;

    /* renamed from: c, reason: collision with root package name */
    private final wv1 f11732c;

    /* renamed from: d, reason: collision with root package name */
    private final xw2 f11733d;

    public s82(ws2 ws2Var, ot1 ot1Var, wv1 wv1Var, xw2 xw2Var) {
        this.f11730a = ws2Var;
        this.f11731b = ot1Var;
        this.f11732c = wv1Var;
        this.f11733d = xw2Var;
    }

    public final void a(ur2 ur2Var, rr2 rr2Var, int i7, e52 e52Var, long j7) {
        if (((Boolean) sw.c().b(m10.f8287q6)).booleanValue()) {
            ww2 b7 = ww2.b("adapter_status");
            b7.g(ur2Var);
            b7.f(rr2Var);
            b7.a("adapter_l", String.valueOf(j7));
            b7.a("sc", Integer.toString(i7));
            if (e52Var != null) {
                b7.a("arec", Integer.toString(e52Var.b().f3954f));
                String a7 = this.f11730a.a(e52Var.getMessage());
                if (a7 != null) {
                    b7.a("areec", a7);
                }
            }
            nt1 b8 = this.f11731b.b(rr2Var.f11398u);
            if (b8 != null) {
                b7.a("ancn", b8.f9310a);
                qf0 qf0Var = b8.f9311b;
                if (qf0Var != null) {
                    b7.a("adapter_v", qf0Var.toString());
                }
                qf0 qf0Var2 = b8.f9312c;
                if (qf0Var2 != null) {
                    b7.a("adapter_sv", qf0Var2.toString());
                }
            }
            this.f11733d.a(b7);
            return;
        }
        vv1 a8 = this.f11732c.a();
        a8.d(ur2Var);
        a8.c(rr2Var);
        a8.b("action", "adapter_status");
        a8.b("adapter_l", String.valueOf(j7));
        a8.b("sc", Integer.toString(i7));
        if (e52Var != null) {
            a8.b("arec", Integer.toString(e52Var.b().f3954f));
            String a9 = this.f11730a.a(e52Var.getMessage());
            if (a9 != null) {
                a8.b("areec", a9);
            }
        }
        nt1 b9 = this.f11731b.b(rr2Var.f11398u);
        if (b9 != null) {
            a8.b("ancn", b9.f9310a);
            qf0 qf0Var3 = b9.f9311b;
            if (qf0Var3 != null) {
                a8.b("adapter_v", qf0Var3.toString());
            }
            qf0 qf0Var4 = b9.f9312c;
            if (qf0Var4 != null) {
                a8.b("adapter_sv", qf0Var4.toString());
            }
        }
        a8.f();
    }
}
