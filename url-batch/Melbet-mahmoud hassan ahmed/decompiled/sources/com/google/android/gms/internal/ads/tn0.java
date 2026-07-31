package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class tn0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f12271a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final a3.w1 f12272b;

    /* renamed from: c, reason: collision with root package name */
    private final xn0 f12273c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12274d;

    /* renamed from: e, reason: collision with root package name */
    private Context f12275e;

    /* renamed from: f, reason: collision with root package name */
    private po0 f12276f;

    /* renamed from: g, reason: collision with root package name */
    private r10 f12277g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f12278h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicInteger f12279i;

    /* renamed from: j, reason: collision with root package name */
    private final sn0 f12280j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f12281k;

    /* renamed from: l, reason: collision with root package name */
    private cc3<ArrayList<String>> f12282l;

    public tn0() {
        a3.w1 w1Var = new a3.w1();
        this.f12272b = w1Var;
        this.f12273c = new xn0(qw.d(), w1Var);
        this.f12274d = false;
        this.f12277g = null;
        this.f12278h = null;
        this.f12279i = new AtomicInteger(0);
        this.f12280j = new sn0(null);
        this.f12281k = new Object();
    }

    public final int a() {
        return this.f12279i.get();
    }

    public final Context c() {
        return this.f12275e;
    }

    public final Resources d() {
        if (this.f12276f.f10304i) {
            return this.f12275e.getResources();
        }
        try {
            if (((Boolean) sw.c().b(m10.o7)).booleanValue()) {
                return no0.a(this.f12275e).getResources();
            }
            no0.a(this.f12275e).getResources();
            return null;
        } catch (mo0 e7) {
            io0.h("Cannot load resource from dynamite apk or local jar", e7);
            return null;
        }
    }

    public final r10 f() {
        r10 r10Var;
        synchronized (this.f12271a) {
            r10Var = this.f12277g;
        }
        return r10Var;
    }

    public final xn0 g() {
        return this.f12273c;
    }

    public final a3.t1 h() {
        a3.w1 w1Var;
        synchronized (this.f12271a) {
            w1Var = this.f12272b;
        }
        return w1Var;
    }

    public final cc3<ArrayList<String>> j() {
        if (v3.l.b() && this.f12275e != null) {
            if (!((Boolean) sw.c().b(m10.T1)).booleanValue()) {
                synchronized (this.f12281k) {
                    cc3<ArrayList<String>> cc3Var = this.f12282l;
                    if (cc3Var != null) {
                        return cc3Var;
                    }
                    cc3<ArrayList<String>> E = wo0.f13894a.E(new Callable() { // from class: com.google.android.gms.internal.ads.pn0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return tn0.this.m();
                        }
                    });
                    this.f12282l = E;
                    return E;
                }
            }
        }
        return rb3.i(new ArrayList());
    }

    public final Boolean k() {
        Boolean bool;
        synchronized (this.f12271a) {
            bool = this.f12278h;
        }
        return bool;
    }

    final /* synthetic */ ArrayList m() {
        Context a7 = kj0.a(this.f12275e);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo f7 = w3.c.a(a7).f(a7.getApplicationInfo().packageName, 4096);
            if (f7.requestedPermissions != null && f7.requestedPermissionsFlags != null) {
                int i7 = 0;
                while (true) {
                    String[] strArr = f7.requestedPermissions;
                    if (i7 >= strArr.length) {
                        break;
                    }
                    if ((f7.requestedPermissionsFlags[i7] & 2) != 0) {
                        arrayList.add(strArr[i7]);
                    }
                    i7++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void n() {
        this.f12280j.a();
    }

    public final void o() {
        this.f12279i.decrementAndGet();
    }

    public final void p() {
        this.f12279i.incrementAndGet();
    }

    @TargetApi(23)
    public final void q(Context context, po0 po0Var) {
        r10 r10Var;
        synchronized (this.f12271a) {
            if (!this.f12274d) {
                this.f12275e = context.getApplicationContext();
                this.f12276f = po0Var;
                y2.t.c().c(this.f12273c);
                this.f12272b.T(this.f12275e);
                xh0.d(this.f12275e, this.f12276f);
                y2.t.f();
                if (w20.f13666c.e().booleanValue()) {
                    r10Var = new r10();
                } else {
                    a3.r1.k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    r10Var = null;
                }
                this.f12277g = r10Var;
                if (r10Var != null) {
                    zo0.a(new qn0(this).b(), "AppState.registerCsiReporter");
                }
                this.f12274d = true;
                j();
            }
        }
        y2.t.q().L(context, po0Var.f10301f);
    }

    public final void r(Throwable th, String str) {
        xh0.d(this.f12275e, this.f12276f).b(th, str, j30.f6960g.e().floatValue());
    }

    public final void s(Throwable th, String str) {
        xh0.d(this.f12275e, this.f12276f).a(th, str);
    }

    public final void t(Boolean bool) {
        synchronized (this.f12271a) {
            this.f12278h = bool;
        }
    }
}
