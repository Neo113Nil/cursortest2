package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class iz {
    public final sm b;
    public final a50 c;
    public lq e;
    public jo2 f;
    public boolean g;
    public final tm a = new tm(0, this);
    public Function2 d = new ub(2, null, 1);

    public iz(a50 a50Var, x32 x32Var) {
        this.b = new sm(this, x32Var);
        this.c = a50Var;
    }

    public final boolean a() {
        return this.a.b && this.b.d;
    }

    public final void b() {
        lq lqVar = this.e;
        if (lqVar != null) {
            lqVar.k(new CancellationException("onBack cancelled"), true);
        }
        jo2 jo2Var = this.f;
        if (jo2Var != null) {
            jo2Var.f(null);
        }
        this.e = null;
        this.f = null;
        this.g = false;
    }

    public final void c() {
        if (this.e != null && !this.g) {
            b();
        }
        if (this.e == null) {
            this.g = false;
            this.e = s93.g(-2, 4, hq.m);
            this.f = z71.H(this.c, null, new v(12, null, this), 3);
        }
        lq lqVar = this.e;
        if (lqVar != null) {
            ti2.d(lqVar);
        }
        this.g = false;
    }

    public final void d() {
        b();
        if (a()) {
            this.g = true;
            this.e = s93.g(-2, 4, hq.m);
            this.f = z71.H(this.c, null, new v(12, null, this), 3);
        }
    }

    public final void e(boolean z) {
        jo2 jo2Var;
        if (!z && a() && (jo2Var = this.f) != null && !jo2Var.b()) {
            b();
        }
        this.a.e(z);
        this.b.f(z);
    }
}
