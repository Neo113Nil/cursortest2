package com.anythink.core.common.d;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import com.anythink.core.common.d.u;
import com.anythink.core.common.v.af;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12486a = "start_time";

    /* renamed from: b, reason: collision with root package name */
    public static final String f12487b = "end_time";

    /* renamed from: c, reason: collision with root package name */
    public static final String f12488c = "psid";

    /* renamed from: d, reason: collision with root package name */
    public static final String f12489d = "launch_mode";

    /* renamed from: e, reason: collision with root package name */
    public static final int f12490e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f12491f = 1;

    /* renamed from: g, reason: collision with root package name */
    long f12492g;
    JSONObject i;

    /* renamed from: k, reason: collision with root package name */
    private final String f12495k = "g";

    /* renamed from: j, reason: collision with root package name */
    Runnable f12494j = new Runnable() { // from class: com.anythink.core.common.d.g.1
        @Override // java.lang.Runnable
        public final void run() {
            g.a(g.this);
        }
    };

    /* renamed from: h, reason: collision with root package name */
    int f12493h = 0;

    /* renamed from: l, reason: collision with root package name */
    private final Handler f12496l = com.anythink.core.common.v.b.b.a().a(14);

    public g(long j9) {
        this.f12492g = j9;
    }

    private void a() {
        if (this.i != null) {
            af.b(t.b().g(), u.b.f13004a, t.b().p() + "playRecord", "");
            this.f12492g = 0L;
            JSONObject jSONObject = this.i;
            long optLong = jSONObject.optLong(f12486a);
            long optLong2 = jSONObject.optLong(f12487b);
            String optString = jSONObject.optString(f12488c);
            int optInt = jSONObject.optInt(f12489d);
            this.i = null;
            com.anythink.core.common.u.e.a(optInt == 1 ? 3 : 1, optLong, optLong2, optString);
        }
    }

    private void b(long j9) {
        String p6 = t.b().p();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f12488c, t.b().r());
            jSONObject.put(f12486a, this.f12492g);
            jSONObject.put(f12487b, System.currentTimeMillis());
            jSONObject.put(f12489d, this.f12493h);
            this.i = jSONObject;
            af.b(t.b().g(), u.b.f13004a, p6 + "playRecord", jSONObject.toString());
            jSONObject.toString();
        } catch (Exception unused) {
        }
        if (com.anythink.core.d.d.a(t.b().g()).b(p6).P() == 1) {
            this.f12496l.postDelayed(this.f12494j, r5.N());
        }
        System.currentTimeMillis();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        final long currentTimeMillis = System.currentTimeMillis();
        Handler handler = this.f12496l;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.anythink.core.common.d.g.3
                @Override // java.lang.Runnable
                public final void run() {
                    g.b(g.this, currentTimeMillis);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        activity.getClass();
        final long currentTimeMillis = System.currentTimeMillis();
        Handler handler = this.f12496l;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.anythink.core.common.d.g.2
                @Override // java.lang.Runnable
                public final void run() {
                    g.a(g.this, currentTimeMillis);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(long j9) {
        long j10;
        Handler handler = this.f12496l;
        if (handler != null) {
            handler.removeCallbacks(this.f12494j);
        }
        com.anythink.core.d.b k6 = com.anythink.basead.b.c.i.k(com.anythink.basead.b.c.i.l());
        JSONObject jSONObject = this.i;
        if (jSONObject != null) {
            long optLong = jSONObject.optLong(f12486a);
            long optLong2 = jSONObject.optLong(f12487b);
            String optString = jSONObject.optString(f12488c);
            int optInt = jSONObject.optInt(f12489d);
            if (System.currentTimeMillis() - optLong2 > k6.N()) {
                af.b(t.b().g(), u.b.f13004a, t.b().p() + "playRecord", "");
                com.anythink.core.common.u.e.a(optInt == 1 ? 3 : 1, optLong, optLong2, optString);
                j10 = 0;
                this.f12492g = 0L;
                this.i = null;
                if (this.f12492g != j10) {
                    this.f12493h = 1;
                    try {
                        this.f12492g = t.b().a(t.b().g(), t.b().p(), 1);
                    } catch (Exception unused) {
                    }
                } else {
                    String p6 = t.b().p();
                    af.b(t.b().g(), u.b.f13004a, p6 + "playRecord", "");
                }
                if (this.f12492g == 0) {
                    this.f12492g = System.currentTimeMillis();
                }
                System.currentTimeMillis();
            }
        }
        j10 = 0;
        this.i = null;
        if (this.f12492g != j10) {
        }
        if (this.f12492g == 0) {
        }
        System.currentTimeMillis();
    }

    public static /* synthetic */ void b(g gVar, long j9) {
        String p6 = t.b().p();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f12488c, t.b().r());
            jSONObject.put(f12486a, gVar.f12492g);
            jSONObject.put(f12487b, System.currentTimeMillis());
            jSONObject.put(f12489d, gVar.f12493h);
            gVar.i = jSONObject;
            af.b(t.b().g(), u.b.f13004a, p6 + "playRecord", jSONObject.toString());
            jSONObject.toString();
        } catch (Exception unused) {
        }
        if (com.anythink.core.d.d.a(t.b().g()).b(p6).P() == 1) {
            gVar.f12496l.postDelayed(gVar.f12494j, r5.N());
        }
        System.currentTimeMillis();
    }

    public static /* synthetic */ void a(g gVar) {
        if (gVar.i != null) {
            af.b(t.b().g(), u.b.f13004a, t.b().p() + "playRecord", "");
            gVar.f12492g = 0L;
            JSONObject jSONObject = gVar.i;
            long optLong = jSONObject.optLong(f12486a);
            long optLong2 = jSONObject.optLong(f12487b);
            String optString = jSONObject.optString(f12488c);
            int optInt = jSONObject.optInt(f12489d);
            gVar.i = null;
            com.anythink.core.common.u.e.a(optInt == 1 ? 3 : 1, optLong, optLong2, optString);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(g gVar, long j9) {
        long j10;
        Handler handler = gVar.f12496l;
        if (handler != null) {
            handler.removeCallbacks(gVar.f12494j);
        }
        com.anythink.core.d.b k6 = com.anythink.basead.b.c.i.k(com.anythink.basead.b.c.i.l());
        JSONObject jSONObject = gVar.i;
        if (jSONObject != null) {
            long optLong = jSONObject.optLong(f12486a);
            long optLong2 = jSONObject.optLong(f12487b);
            String optString = jSONObject.optString(f12488c);
            int optInt = jSONObject.optInt(f12489d);
            if (System.currentTimeMillis() - optLong2 > k6.N()) {
                af.b(t.b().g(), u.b.f13004a, t.b().p() + "playRecord", "");
                com.anythink.core.common.u.e.a(optInt == 1 ? 3 : 1, optLong, optLong2, optString);
                j10 = 0;
                gVar.f12492g = 0L;
                gVar.i = null;
                if (gVar.f12492g != j10) {
                    gVar.f12493h = 1;
                    try {
                        gVar.f12492g = t.b().a(t.b().g(), t.b().p(), 1);
                    } catch (Exception unused) {
                    }
                } else {
                    String p6 = t.b().p();
                    af.b(t.b().g(), u.b.f13004a, p6 + "playRecord", "");
                }
                if (gVar.f12492g == 0) {
                    gVar.f12492g = System.currentTimeMillis();
                }
                System.currentTimeMillis();
            }
        }
        j10 = 0;
        gVar.i = null;
        if (gVar.f12492g != j10) {
        }
        if (gVar.f12492g == 0) {
        }
        System.currentTimeMillis();
    }
}
