package com.tapjoy.internal;

import android.content.Context;
import android.content.Intent;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tapjoy.TapjoyConstants;
import com.tapjoy.internal.ew;
import com.youappi.sdk.net.model.VideoEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class ha {
    private static final ha q;
    private static ha r;
    private static Handler w;
    private static File x;

    /* renamed from: b, reason: collision with root package name */
    public hj f8235b;
    public Context e;
    public hd f;
    public gz g;
    public hn h;
    public gy i;
    public String j;
    public boolean k;
    public String l;
    public String m;
    public String o;
    private String u;
    private String v;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8236c = false;
    private boolean s = false;

    /* renamed from: d, reason: collision with root package name */
    public String f8237d = null;
    private boolean t = false;
    public boolean n = false;
    public hb p = hb.a((gp) null);

    /* renamed from: a, reason: collision with root package name */
    public final hi f8234a = new hi(this);

    static {
        ha haVar = new ha();
        q = haVar;
        r = haVar;
    }

    public static ha a() {
        return r;
    }

    private ha() {
    }

    public final synchronized void b(Context context) {
        if (this.e == null) {
            Context applicationContext = context.getApplicationContext();
            this.e = applicationContext;
            gb.a().a(applicationContext);
            this.f = hd.a(applicationContext);
            File file = new File(c(applicationContext), "events2");
            if (this.i == null) {
                this.i = new gy(file);
            }
            this.g = new gz(this.f, this.i);
            this.h = new hn(this.g);
            this.f8235b = new hj(applicationContext);
            gg.a(new gi(new File(c(applicationContext), "usages"), this.g));
            hu huVar = hu.f8320a;
            huVar.f8321b = applicationContext.getApplicationContext();
            huVar.f8322c = applicationContext.getSharedPreferences("tapjoyCacheDataMMF2E", 0);
            huVar.f8323d = applicationContext.getSharedPreferences("tapjoyCacheDataMMF2U", 0);
            huVar.a();
        }
    }

    public final fc a(boolean z) {
        if (z) {
            this.f.a();
        }
        return this.f.b();
    }

    public final synchronized void b() {
        if (this.k) {
            hc.b(this.e).e(this.f8237d);
            a((String) null);
        }
    }

    public final synchronized void a(@Nullable final String str) {
        if (this.k) {
            if (str == null && this.o != null) {
                str = this.o;
            }
            this.o = null;
            if (str != null) {
                fc b2 = this.f.b();
                gx.a("GCM registration id of device {} updated for sender {}: {}", b2.f8070d.h, this.f8237d, str);
                new im(b2, str).a(new cf() { // from class: com.tapjoy.internal.ha.1
                    @Override // com.tapjoy.internal.cf
                    public final void a(ca caVar) {
                    }

                    @Override // com.tapjoy.internal.cf
                    public final /* synthetic */ void a(ca caVar, Object obj) {
                        hc b3 = hc.b(ha.this.e);
                        String str2 = str;
                        if (!str2.equals(b3.f8511b.b(b3.f8510a))) {
                            new Object[1][0] = str2;
                        } else {
                            b3.f8511b.b(b3.f8510a, true);
                            b3.f8511b.a(b3.f8510a, 0L);
                        }
                    }
                }, ca.f7878a);
            }
        } else if (str != null) {
            this.o = str;
        }
    }

    public final void b(String str) {
        gz gzVar = this.g;
        ew.a a2 = gzVar.a(ez.APP, "push_ignore");
        a2.s = new fd(null, null, str);
        gzVar.a(a2);
    }

    public final boolean a(Context context, String str, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        b(context);
        if (!this.f.a(str, currentTimeMillis, z)) {
            return false;
        }
        gz gzVar = this.g;
        ew.a a2 = gzVar.a(ez.APP, "push_show");
        a2.s = new fd(null, null, str);
        gzVar.a(a2);
        return true;
    }

    public static void a(GLSurfaceView gLSurfaceView) {
        if (gx.a(gLSurfaceView, "setGLSurfaceView: The given GLSurfaceView was null")) {
            gs.a(gLSurfaceView);
        }
    }

    public final Set c() {
        if (!d("getUserTags")) {
            return new HashSet();
        }
        return this.f.e();
    }

    public final void a(Set set) {
        if (d("setUserTags")) {
            if (set != null && !set.isEmpty()) {
                HashSet hashSet = new HashSet();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str != null) {
                        String trim = str.trim();
                        if (!trim.isEmpty() && trim.length() <= 200) {
                            hashSet.add(trim);
                            if (hashSet.size() >= 200) {
                                break;
                            }
                        }
                    }
                }
                set = hashSet;
            }
            hd hdVar = this.f;
            synchronized (hdVar) {
                if (set != null) {
                    try {
                        if (!set.isEmpty()) {
                            hdVar.f8262c.z.a(Base64.encodeToString(fh.f8088c.b(new fh(new ArrayList(set))), 2));
                            hdVar.f8261b.A.clear();
                            hdVar.f8261b.A.addAll(set);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hdVar.f8262c.z.c();
                hdVar.f8261b.A.clear();
            }
        }
    }

    public final synchronized void a(Context context, String str, String str2, String str3, String str4, String str5) {
        boolean z;
        boolean z2;
        if (this.k) {
            return;
        }
        b(context);
        boolean z3 = true;
        if (gx.a(this.e != null, "The given context was null")) {
            if (str4 != null && str4.length() == 24 && str4.matches("[0-9a-f]{24}")) {
                z = true;
            } else {
                gx.b("Invalid App ID: {}", str4);
                z = false;
            }
            if (z) {
                if (str5 != null && str5.length() == 20 && str5.matches("[0-9A-Za-z\\-_]{20}")) {
                    z2 = true;
                } else {
                    gx.b("Invalid App Key: {}", str5);
                    z2 = false;
                }
                if (z2) {
                    this.l = str;
                    this.m = str2;
                    this.u = str4;
                    this.v = str5;
                    try {
                        ce ceVar = new ce("TapjoySDK " + str2 + " (" + Build.MODEL + "; Android " + Build.VERSION.RELEASE + "; " + Locale.getDefault() + ")", new URL(str3));
                        ca.f7879b = ceVar;
                        ca.f7878a = Executors.newCachedThreadPool();
                        gy gyVar = this.i;
                        gyVar.f8225b = ceVar;
                        gyVar.a();
                        new Object[1][0] = str3;
                        this.k = true;
                        he heVar = new he(d(this.e));
                        if (heVar.b() == null) {
                            z3 = false;
                        }
                        if (!z3 && heVar.a()) {
                            gz gzVar = this.g;
                            gzVar.a(gzVar.a(ez.APP, "install"));
                        }
                        hd hdVar = this.f;
                        if (!jr.c(str4) && !str4.equals(hdVar.f8262c.D.a())) {
                            hdVar.f8262c.D.a(str4);
                            hdVar.f8262c.a(false);
                        }
                        b();
                    } catch (MalformedURLException e) {
                        throw new IllegalArgumentException(e);
                    }
                }
            }
        }
    }

    public final boolean c(String str) {
        if ((this.k || this.j != null) && this.e != null) {
            return true;
        }
        if (!gx.f8223a) {
            return false;
        }
        gx.b(str + ": Should be called after initializing the SDK");
        return false;
    }

    public final boolean d(String str) {
        if (this.e != null) {
            return true;
        }
        if (!gx.f8223a) {
            return false;
        }
        gx.b(str + ": Should be called after initializing the SDK");
        return false;
    }

    public final boolean d() {
        return this.h != null && this.h.f8301b.get();
    }

    public final boolean e() {
        boolean z;
        hn hnVar = this.h;
        if (hnVar.f8302c != null) {
            hnVar.f8302c.cancel(false);
            hnVar.f8302c = null;
        }
        if (hnVar.f8301b.compareAndSet(false, true)) {
            gx.a("New session started");
            gz gzVar = hnVar.f8300a;
            fd d2 = gzVar.f8229a.d();
            hd hdVar = gzVar.f8229a;
            synchronized (hdVar) {
                int b2 = hdVar.f8262c.h.b() + 1;
                hdVar.f8262c.h.a(b2);
                hdVar.f8261b.h = Integer.valueOf(b2);
            }
            ew.a a2 = gzVar.a(ez.APP, "bootup");
            gzVar.f8231c = SystemClock.elapsedRealtime();
            if (d2 != null) {
                a2.s = d2;
            }
            gzVar.a(a2);
            ft.f8130c.notifyObservers();
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        hi hiVar = this.f8234a;
        synchronized (hiVar) {
            hiVar.f8280b = null;
        }
        hu.f8320a.a();
        return true;
    }

    final void a(Map map) {
        gz gzVar = this.g;
        ew.a a2 = gzVar.a(ez.CAMPAIGN, VideoEvent.EVENT_IMPRESSION);
        if (map != null) {
            a2.r = bh.a((Object) map);
        }
        gzVar.a(a2);
    }

    final void a(Map map, long j) {
        gz gzVar = this.g;
        ew.a a2 = gzVar.a(ez.CAMPAIGN, Promotion.ACTION_VIEW);
        a2.i = Long.valueOf(j);
        if (map != null) {
            a2.r = bh.a((Object) map);
        }
        gzVar.a(a2);
    }

    final void a(Map map, String str) {
        gz gzVar = this.g;
        ew.a a2 = gzVar.a(ez.CAMPAIGN, "click");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("region", str);
        a2.r = bh.a((Object) linkedHashMap);
        gzVar.a(a2);
    }

    public static synchronized void a(Runnable runnable) {
        synchronized (ha.class) {
            if (w == null) {
                w = new Handler(Looper.getMainLooper());
            }
            w.post(runnable);
        }
    }

    public static synchronized File c(Context context) {
        File file;
        synchronized (ha.class) {
            if (x == null) {
                x = context.getDir("fiverocks", 0);
            }
            file = x;
        }
        return file;
    }

    static File d(Context context) {
        return new File(c(context), "install");
    }

    public static String a(Context context, Intent intent) {
        String a2 = d.a(intent);
        if (a2 != null) {
            ha haVar = r;
            haVar.b(context);
            if (jr.c(haVar.f.c()) || intent.getBooleanExtra("fiverocks:force", false)) {
                hd hdVar = haVar.f;
                synchronized (hdVar) {
                    hdVar.f8262c.f8289d.a(a2);
                    hdVar.f8261b.f8094d = a2;
                }
                if (a2.length() > 0) {
                    gz gzVar = haVar.g;
                    gzVar.a(gzVar.a(ez.APP, TapjoyConstants.TJC_REFERRER));
                }
            }
        }
        return a2;
    }

    public static ha a(Context context) {
        ha haVar = r;
        haVar.b(context);
        return haVar;
    }
}
