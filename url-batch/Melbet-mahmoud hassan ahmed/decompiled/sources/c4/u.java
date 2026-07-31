package c4;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import k4.b;
import k4.f;

/* loaded from: classes.dex */
public final class u implements k4.b {

    /* renamed from: a, reason: collision with root package name */
    private final Application f2112a;

    /* renamed from: b, reason: collision with root package name */
    private final c f2113b;

    /* renamed from: c, reason: collision with root package name */
    private final j0 f2114c;

    /* renamed from: d, reason: collision with root package name */
    private final m f2115d;

    /* renamed from: e, reason: collision with root package name */
    private final d0 f2116e;

    /* renamed from: f, reason: collision with root package name */
    private final v1<g0> f2117f;

    /* renamed from: g, reason: collision with root package name */
    private Dialog f2118g;

    /* renamed from: h, reason: collision with root package name */
    private g0 f2119h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f2120i = new AtomicBoolean();

    /* renamed from: j, reason: collision with root package name */
    private final AtomicReference<y> f2121j = new AtomicReference<>();

    /* renamed from: k, reason: collision with root package name */
    private final AtomicReference<b.a> f2122k = new AtomicReference<>();

    /* renamed from: l, reason: collision with root package name */
    private final AtomicReference<z> f2123l = new AtomicReference<>();

    public u(Application application, c cVar, j0 j0Var, m mVar, d0 d0Var, v1<g0> v1Var) {
        this.f2112a = application;
        this.f2113b = cVar;
        this.f2114c = j0Var;
        this.f2115d = mVar;
        this.f2116e = d0Var;
        this.f2117f = v1Var;
    }

    private final void j() {
        Dialog dialog = this.f2118g;
        if (dialog != null) {
            dialog.dismiss();
            this.f2118g = null;
        }
        this.f2114c.a(null);
        z andSet = this.f2123l.getAndSet(null);
        if (andSet != null) {
            andSet.a();
        }
    }

    @Override // k4.b
    public final void a(Activity activity, b.a aVar) {
        g1.a();
        if (!this.f2120i.compareAndSet(false, true)) {
            aVar.a(new e2(3, "ConsentForm#show can only be invoked once.").a());
            return;
        }
        z zVar = new z(this, activity);
        this.f2112a.registerActivityLifecycleCallbacks(zVar);
        this.f2123l.set(zVar);
        this.f2114c.a(activity);
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.f2119h);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            aVar.a(new e2(3, "Activity with null windows is passed in.").a());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        this.f2122k.set(aVar);
        dialog.show();
        this.f2118g = dialog;
    }

    final g0 c() {
        return this.f2119h;
    }

    final void d(int i7, int i8) {
        j();
        b.a andSet = this.f2122k.getAndSet(null);
        if (andSet == null) {
            return;
        }
        this.f2115d.b(3);
        this.f2115d.d(i8);
        andSet.a(null);
    }

    final void e(e2 e2Var) {
        y andSet = this.f2121j.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.b(e2Var.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void f(f.b bVar, f.a aVar) {
        g0 zza = this.f2117f.zza();
        this.f2119h = zza;
        zza.setBackgroundColor(0);
        zza.getSettings().setJavaScriptEnabled(true);
        zza.setWebViewClient(new h0(zza));
        this.f2121j.set(new y(bVar, aVar));
        this.f2119h.loadDataWithBaseURL(this.f2116e.a(), this.f2116e.b(), "text/html", "UTF-8", null);
        g1.f1967a.postDelayed(new Runnable(this) { // from class: c4.x

            /* renamed from: f, reason: collision with root package name */
            private final u f2152f;

            {
                this.f2152f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f2152f.i();
            }
        }, 10000L);
    }

    final void g() {
        y andSet = this.f2121j.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.a(this);
    }

    final void h(e2 e2Var) {
        j();
        b.a andSet = this.f2122k.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.a(e2Var.a());
    }

    final /* synthetic */ void i() {
        e(new e2(4, "Web view timed out."));
    }
}
