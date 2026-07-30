package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cg3 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ cg3(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[Catch: all -> 0x0028, RuntimeException -> 0x002c, TryCatch #1 {RuntimeException -> 0x002c, blocks: (B:3:0x0005, B:5:0x0019, B:7:0x001f, B:12:0x004b, B:15:0x0052, B:17:0x0065, B:19:0x006d, B:24:0x007d, B:28:0x008a, B:36:0x0030, B:38:0x0037, B:40:0x0043), top: B:2:0x0005, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(ze3 ze3Var, Bundle bundle) {
        pj3 pj3Var;
        pj3 pj3Var2;
        Intent intent;
        Uri uri;
        String stringExtra;
        String str;
        jm3 jm3Var = (jm3) this.n;
        try {
            try {
                pj3Var2 = (pj3) jm3Var.m;
                vh3 vh3Var = pj3Var2.r;
                pj3.m(vh3Var);
                vh3Var.z.b("onActivityCreated");
                intent = ze3Var.o;
            } catch (RuntimeException e) {
                vh3 vh3Var2 = ((pj3) jm3Var.m).r;
                pj3.m(vh3Var2);
                vh3Var2.r.c(e, "Throwable caught in onActivityCreated");
            }
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (!data.isHierarchical()) {
                    }
                    uri = data;
                    if (uri != null && uri.isHierarchical()) {
                        pj3.k(pj3Var2.u);
                        stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) && !"https://www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
                            str = "auto";
                            String str2 = str;
                            String queryParameter = uri.getQueryParameter("referrer");
                            boolean z = bundle != null;
                            lj3 lj3Var = pj3Var2.s;
                            pj3.m(lj3Var);
                            lj3Var.F(new fi3(this, z, uri, str2, queryParameter));
                            pj3Var = (pj3) jm3Var.m;
                            dn3 dn3Var = pj3Var.x;
                            pj3.l(dn3Var);
                            dn3Var.E(ze3Var, bundle);
                        }
                        str = "gs";
                        String str22 = str;
                        String queryParameter2 = uri.getQueryParameter("referrer");
                        boolean z2 = bundle != null;
                        lj3 lj3Var2 = pj3Var2.s;
                        pj3.m(lj3Var2);
                        lj3Var2.F(new fi3(this, z2, uri, str22, queryParameter2));
                        pj3Var = (pj3) jm3Var.m;
                        dn3 dn3Var2 = pj3Var.x;
                        pj3.l(dn3Var2);
                        dn3Var2.E(ze3Var, bundle);
                    }
                }
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString("com.android.vending.referral_url");
                    if (!TextUtils.isEmpty(string)) {
                        data = Uri.parse(string);
                        uri = data;
                        if (uri != null) {
                            pj3.k(pj3Var2.u);
                            stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                            if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra)) {
                                str = "auto";
                                String str222 = str;
                                String queryParameter22 = uri.getQueryParameter("referrer");
                                boolean z22 = bundle != null;
                                lj3 lj3Var22 = pj3Var2.s;
                                pj3.m(lj3Var22);
                                lj3Var22.F(new fi3(this, z22, uri, str222, queryParameter22));
                                pj3Var = (pj3) jm3Var.m;
                                dn3 dn3Var22 = pj3Var.x;
                                pj3.l(dn3Var22);
                                dn3Var22.E(ze3Var, bundle);
                            }
                            str = "gs";
                            String str2222 = str;
                            String queryParameter222 = uri.getQueryParameter("referrer");
                            boolean z222 = bundle != null;
                            lj3 lj3Var222 = pj3Var2.s;
                            pj3.m(lj3Var222);
                            lj3Var222.F(new fi3(this, z222, uri, str2222, queryParameter222));
                            pj3Var = (pj3) jm3Var.m;
                            dn3 dn3Var222 = pj3Var.x;
                            pj3.l(dn3Var222);
                            dn3Var222.E(ze3Var, bundle);
                        }
                    }
                }
                uri = null;
                if (uri != null) {
                }
            }
            pj3Var = (pj3) jm3Var.m;
            dn3 dn3Var2222 = pj3Var.x;
            pj3.l(dn3Var2222);
            dn3Var2222.E(ze3Var, bundle);
        } catch (Throwable th) {
            dn3 dn3Var3 = ((pj3) jm3Var.m).x;
            pj3.l(dn3Var3);
            dn3Var3.E(ze3Var, bundle);
            throw th;
        }
    }

    public void d(ze3 ze3Var) {
        dn3 dn3Var = ((pj3) ((jm3) this.n).m).x;
        pj3.l(dn3Var);
        synchronized (dn3Var.x) {
            try {
                if (Objects.equals(dn3Var.s, ze3Var)) {
                    dn3Var.s = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((pj3) dn3Var.m).p.K()) {
            dn3Var.r.remove(Integer.valueOf(ze3Var.m));
        }
    }

    public void e(ze3 ze3Var) {
        pj3 pj3Var = (pj3) ((jm3) this.n).m;
        dn3 dn3Var = pj3Var.x;
        pj3.l(dn3Var);
        synchronized (dn3Var.x) {
            dn3Var.w = false;
            dn3Var.t = true;
        }
        pj3 pj3Var2 = (pj3) dn3Var.m;
        pj3Var2.w.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (pj3Var2.p.K()) {
            tm3 B = dn3Var.B(ze3Var);
            dn3Var.p = dn3Var.o;
            dn3Var.o = null;
            lj3 lj3Var = pj3Var2.s;
            pj3.m(lj3Var);
            lj3Var.F(new db3(dn3Var, B, elapsedRealtime));
        } else {
            dn3Var.o = null;
            lj3 lj3Var2 = pj3Var2.s;
            pj3.m(lj3Var2);
            lj3Var2.F(new zd3(dn3Var, elapsedRealtime));
        }
        ep3 ep3Var = pj3Var.t;
        pj3.l(ep3Var);
        pj3 pj3Var3 = (pj3) ep3Var.m;
        pj3Var3.w.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        lj3 lj3Var3 = pj3Var3.s;
        pj3.m(lj3Var3);
        lj3Var3.F(new to3(ep3Var, elapsedRealtime2, 1));
    }

    public void f(ze3 ze3Var) {
        pj3 pj3Var = (pj3) ((jm3) this.n).m;
        ep3 ep3Var = pj3Var.t;
        pj3.l(ep3Var);
        pj3 pj3Var2 = (pj3) ep3Var.m;
        pj3Var2.w.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        lj3 lj3Var = pj3Var2.s;
        pj3.m(lj3Var);
        lj3Var.F(new to3(ep3Var, elapsedRealtime, 0));
        dn3 dn3Var = pj3Var.x;
        pj3.l(dn3Var);
        Object obj = dn3Var.x;
        synchronized (obj) {
            dn3Var.w = true;
            if (!Objects.equals(ze3Var, dn3Var.s)) {
                synchronized (obj) {
                    dn3Var.s = ze3Var;
                    dn3Var.t = false;
                    pj3 pj3Var3 = (pj3) dn3Var.m;
                    if (pj3Var3.p.K()) {
                        dn3Var.u = null;
                        lj3 lj3Var2 = pj3Var3.s;
                        pj3.m(lj3Var2);
                        lj3Var2.F(new xm3(dn3Var, 1));
                    }
                }
            }
        }
        pj3 pj3Var4 = (pj3) dn3Var.m;
        if (!pj3Var4.p.K()) {
            dn3Var.o = dn3Var.u;
            lj3 lj3Var3 = pj3Var4.s;
            pj3.m(lj3Var3);
            lj3Var3.F(new xm3(dn3Var, 0));
            return;
        }
        dn3Var.F(ze3Var.n, dn3Var.B(ze3Var), false);
        se3 se3Var = ((pj3) dn3Var.m).z;
        pj3.j(se3Var);
        pj3 pj3Var5 = (pj3) se3Var.m;
        pj3Var5.w.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        lj3 lj3Var4 = pj3Var5.s;
        pj3.m(lj3Var4);
        lj3Var4.F(new zd3(se3Var, elapsedRealtime2));
    }

    public void g(ze3 ze3Var, Bundle bundle) {
        tm3 tm3Var;
        dn3 dn3Var = ((pj3) ((jm3) this.n).m).x;
        pj3.l(dn3Var);
        if (!((pj3) dn3Var.m).p.K() || bundle == null || (tm3Var = (tm3) dn3Var.r.get(Integer.valueOf(ze3Var.m))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", tm3Var.c);
        bundle2.putString("name", tm3Var.a);
        bundle2.putString("referrer_name", tm3Var.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.m) {
            case 0:
                ((dg3) this.n).c(new hf3(this, bundle, activity));
                break;
            default:
                c(ze3.a(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.m) {
            case 0:
                ((dg3) this.n).c(new xf3(this, activity, 4));
                break;
            default:
                d(ze3.a(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.m) {
            case 0:
                ((dg3) this.n).c(new xf3(this, activity, 2));
                break;
            default:
                e(ze3.a(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.m) {
            case 0:
                ((dg3) this.n).c(new xf3(this, activity, 1));
                break;
            default:
                f(ze3.a(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.m) {
            case 0:
                ee3 ee3Var = new ee3();
                ((dg3) this.n).c(new hf3(this, activity, ee3Var));
                Bundle d = ee3Var.d(50L);
                if (d != null) {
                    bundle.putAll(d);
                    break;
                }
                break;
            default:
                g(ze3.a(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.m) {
            case 0:
                ((dg3) this.n).c(new xf3(this, activity, 0));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.m) {
            case 0:
                ((dg3) this.n).c(new xf3(this, activity, 3));
                break;
        }
    }

    private final void a(Activity activity) {
    }

    private final void b(Activity activity) {
    }
}
