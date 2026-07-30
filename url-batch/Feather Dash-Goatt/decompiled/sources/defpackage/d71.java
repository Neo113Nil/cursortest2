package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class d71 extends zl0 implements ad0, j81 {
    public h71 s;
    public boolean t;

    @Override // defpackage.ad0
    public final wk0 P(ej0 ej0Var, qk0 qk0Var, long j) {
        p4.s(j, this.t ? et0.d : et0.e);
        zw0 c = qk0Var.c(mm.a(j, 0, this.t ? mm.h(j) : Integer.MAX_VALUE, 0, this.t ? Integer.MAX_VALUE : mm.g(j), 5));
        int i = c.d;
        int h = mm.h(j);
        if (i > h) {
            i = h;
        }
        int i2 = c.e;
        int g = mm.g(j);
        if (i2 > g) {
            i2 = g;
        }
        int i3 = c.e - i2;
        int i4 = c.d - i;
        if (!this.t) {
            i3 = i4;
        }
        h71 h71Var = this.s;
        xu0 xu0Var = h71Var.e;
        xu0 xu0Var2 = h71Var.a;
        xu0Var.i(i3);
        ib1 n = ca0.n();
        Function1 e = n != null ? n.e() : null;
        ib1 s = ca0.s(n);
        try {
            if (xu0Var2.h() > i3) {
                xu0Var2.i(i3);
            }
            ca0.u(n, s, e);
            this.s.b.i(this.t ? i2 : i);
            this.s.c.i(this.t ? c.e : c.d);
            return xk0.q(ej0Var, i, i2, new h11(i3, 1, this, c));
        } catch (Throwable th) {
            ca0.u(n, s, e);
            throw th;
        }
    }

    @Override // defpackage.j81
    public final void W(u81 u81Var) {
        dc0[] dc0VarArr = s81.a;
        t81 t81Var = p81.m;
        dc0[] dc0VarArr2 = s81.a;
        dc0 dc0Var = dc0VarArr2[6];
        u81Var.a(t81Var, Boolean.TRUE);
        final int i = 0;
        final int i2 = 1;
        z61 z61Var = new z61(new Function0(this) { // from class: c71
            public final /* synthetic */ d71 e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int h;
                int i3 = i;
                d71 d71Var = this.e;
                switch (i3) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        h = d71Var.s.a.h();
                        break;
                    default:
                        h = d71Var.s.e.h();
                        break;
                }
                return Float.valueOf(h);
            }
        }, new Function0(this) { // from class: c71
            public final /* synthetic */ d71 e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int h;
                int i3 = i2;
                d71 d71Var = this.e;
                switch (i3) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        h = d71Var.s.a.h();
                        break;
                    default:
                        h = d71Var.s.e.h();
                        break;
                }
                return Float.valueOf(h);
            }
        });
        if (this.t) {
            t81 t81Var2 = p81.v;
            dc0 dc0Var2 = dc0VarArr2[13];
            u81Var.a(t81Var2, z61Var);
        } else {
            t81 t81Var3 = p81.u;
            dc0 dc0Var3 = dc0VarArr2[12];
            u81Var.a(t81Var3, z61Var);
        }
    }
}
