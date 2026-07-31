package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class cy1 {

    /* renamed from: f, reason: collision with root package name */
    private final Context f3987f;

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference<Context> f3988g;

    /* renamed from: h, reason: collision with root package name */
    private final rt1 f3989h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f3990i;

    /* renamed from: j, reason: collision with root package name */
    private final Executor f3991j;

    /* renamed from: k, reason: collision with root package name */
    private final ScheduledExecutorService f3992k;

    /* renamed from: l, reason: collision with root package name */
    private final gw1 f3993l;

    /* renamed from: m, reason: collision with root package name */
    private final po0 f3994m;

    /* renamed from: o, reason: collision with root package name */
    private final th1 f3996o;

    /* renamed from: a, reason: collision with root package name */
    private boolean f3982a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3983b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3984c = false;

    /* renamed from: e, reason: collision with root package name */
    private final bp0<Boolean> f3986e = new bp0<>();

    /* renamed from: n, reason: collision with root package name */
    private final Map<String, f90> f3995n = new ConcurrentHashMap();

    /* renamed from: p, reason: collision with root package name */
    private boolean f3997p = true;

    /* renamed from: d, reason: collision with root package name */
    private final long f3985d = y2.t.a().a();

    public cy1(Executor executor, Context context, WeakReference<Context> weakReference, Executor executor2, rt1 rt1Var, ScheduledExecutorService scheduledExecutorService, gw1 gw1Var, po0 po0Var, th1 th1Var) {
        this.f3989h = rt1Var;
        this.f3987f = context;
        this.f3988g = weakReference;
        this.f3990i = executor2;
        this.f3992k = scheduledExecutorService;
        this.f3991j = executor;
        this.f3993l = gw1Var;
        this.f3994m = po0Var;
        this.f3996o = th1Var;
        u("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    static /* bridge */ /* synthetic */ void i(final cy1 cy1Var, String str) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final Object obj = new Object();
                final bp0 bp0Var = new bp0();
                cc3 o7 = rb3.o(bp0Var, ((Long) sw.c().b(m10.f8274p1)).longValue(), TimeUnit.SECONDS, cy1Var.f3992k);
                cy1Var.f3993l.b(next);
                cy1Var.f3996o.s(next);
                final long a7 = y2.t.a().a();
                Iterator<String> it = keys;
                o7.b(new Runnable() { // from class: com.google.android.gms.internal.ads.wx1
                    @Override // java.lang.Runnable
                    public final void run() {
                        cy1.this.p(obj, bp0Var, next, a7);
                    }
                }, cy1Var.f3990i);
                arrayList.add(o7);
                final by1 by1Var = new by1(cy1Var, obj, next, a7, bp0Var);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i7);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                }
                            }
                            arrayList2.add(new p90(optString, bundle));
                        }
                    } catch (JSONException unused) {
                    }
                }
                cy1Var.u(next, false, "", 0);
                try {
                    try {
                        final at2 b7 = cy1Var.f3989h.b(next, new JSONObject());
                        cy1Var.f3991j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.vx1
                            @Override // java.lang.Runnable
                            public final void run() {
                                cy1.this.m(b7, by1Var, arrayList2, next);
                            }
                        });
                    } catch (RemoteException e7) {
                        io0.e("", e7);
                    }
                } catch (ps2 unused2) {
                    by1Var.u("Failed to create Adapter.");
                }
                keys = it;
            }
            rb3.a(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.xx1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    cy1.this.e();
                    return null;
                }
            }, cy1Var.f3990i);
        } catch (JSONException e8) {
            a3.r1.l("Malformed CLD response", e8);
        }
    }

    private final synchronized cc3<String> t() {
        String c7 = y2.t.p().h().e().c();
        if (!TextUtils.isEmpty(c7)) {
            return rb3.i(c7);
        }
        final bp0 bp0Var = new bp0();
        y2.t.p().h().Z(new Runnable() { // from class: com.google.android.gms.internal.ads.ux1
            @Override // java.lang.Runnable
            public final void run() {
                cy1.this.n(bp0Var);
            }
        });
        return bp0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(String str, boolean z6, String str2, int i7) {
        this.f3995n.put(str, new f90(str, z6, i7, str2));
    }

    final /* synthetic */ Object e() {
        this.f3986e.e(Boolean.TRUE);
        return null;
    }

    public final List<f90> f() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f3995n.keySet()) {
            f90 f90Var = this.f3995n.get(str);
            arrayList.add(new f90(str, f90Var.f5046g, f90Var.f5047h, f90Var.f5048i));
        }
        return arrayList;
    }

    public final void k() {
        this.f3997p = false;
    }

    final /* synthetic */ void l() {
        synchronized (this) {
            if (this.f3984c) {
                return;
            }
            u("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (y2.t.a().a() - this.f3985d));
            this.f3986e.f(new Exception());
        }
    }

    final /* synthetic */ void m(at2 at2Var, j90 j90Var, List list, String str) {
        try {
            try {
                Context context = this.f3988g.get();
                if (context == null) {
                    context = this.f3987f;
                }
                at2Var.l(context, j90Var, list);
            } catch (ps2 unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
                sb.append("Failed to initialize adapter. ");
                sb.append(str);
                sb.append(" does not implement the initialize() method.");
                j90Var.u(sb.toString());
            }
        } catch (RemoteException e7) {
            io0.e("", e7);
        }
    }

    final /* synthetic */ void n(final bp0 bp0Var) {
        this.f3990i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.tx1
            @Override // java.lang.Runnable
            public final void run() {
                bp0 bp0Var2 = bp0Var;
                String c7 = y2.t.p().h().e().c();
                if (TextUtils.isEmpty(c7)) {
                    bp0Var2.f(new Exception());
                } else {
                    bp0Var2.e(c7);
                }
            }
        });
    }

    final /* synthetic */ void o() {
        this.f3993l.d();
        this.f3996o.g();
        this.f3983b = true;
    }

    final /* synthetic */ void p(Object obj, bp0 bp0Var, String str, long j7) {
        synchronized (obj) {
            if (!bp0Var.isDone()) {
                u(str, false, "Timeout.", (int) (y2.t.a().a() - j7));
                this.f3993l.a(str, "timeout");
                this.f3996o.z(str, "timeout");
                bp0Var.e(Boolean.FALSE);
            }
        }
    }

    public final void q() {
        if (!g30.f5437a.e().booleanValue()) {
            if (this.f3994m.f10303h >= ((Integer) sw.c().b(m10.f8266o1)).intValue() && this.f3997p) {
                if (this.f3982a) {
                    return;
                }
                synchronized (this) {
                    if (this.f3982a) {
                        return;
                    }
                    this.f3993l.e();
                    this.f3996o.b();
                    this.f3986e.b(new Runnable() { // from class: com.google.android.gms.internal.ads.rx1
                        @Override // java.lang.Runnable
                        public final void run() {
                            cy1.this.o();
                        }
                    }, this.f3990i);
                    this.f3982a = true;
                    cc3<String> t6 = t();
                    this.f3992k.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.qx1
                        @Override // java.lang.Runnable
                        public final void run() {
                            cy1.this.l();
                        }
                    }, ((Long) sw.c().b(m10.f8282q1)).longValue(), TimeUnit.SECONDS);
                    rb3.r(t6, new zx1(this), this.f3990i);
                    return;
                }
            }
        }
        if (this.f3982a) {
            return;
        }
        u("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.f3986e.e(Boolean.FALSE);
        this.f3982a = true;
        this.f3983b = true;
    }

    public final void r(final m90 m90Var) {
        this.f3986e.b(new Runnable() { // from class: com.google.android.gms.internal.ads.sx1
            @Override // java.lang.Runnable
            public final void run() {
                cy1 cy1Var = cy1.this;
                try {
                    m90Var.j3(cy1Var.f());
                } catch (RemoteException e7) {
                    io0.e("", e7);
                }
            }
        }, this.f3991j);
    }

    public final boolean s() {
        return this.f3983b;
    }
}
