package com.startapp.sdk.internal;

import E1.AbstractC0033i;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xf {
    public static final boolean o = MetaData.E().o0();

    /* renamed from: b, reason: collision with root package name */
    public final Context f4724b;

    /* renamed from: c, reason: collision with root package name */
    public final AdPreferences.Placement f4725c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f4726d;

    /* renamed from: e, reason: collision with root package name */
    public final TrackingParams f4727e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public long f4728g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4729h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4730i;

    /* renamed from: k, reason: collision with root package name */
    public final WeakReference f4732k;

    /* renamed from: l, reason: collision with root package name */
    public vf f4733l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4734m;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f4723a = new Handler(Looper.getMainLooper());

    /* renamed from: j, reason: collision with root package name */
    public final AtomicInteger f4731j = new AtomicInteger();

    /* renamed from: n, reason: collision with root package name */
    public final Object f4735n = new Object();

    public xf(Context context, AdPreferences.Placement placement, String[] strArr, TrackingParams trackingParams, long j3, boolean z, wf wfVar) {
        Context a3 = w0.a(context);
        this.f4724b = a3 != null ? a3 : context;
        this.f4725c = placement;
        this.f4726d = strArr;
        this.f4727e = trackingParams;
        this.f = j3;
        this.f4734m = z;
        this.f4732k = new WeakReference(wfVar);
    }

    public final void a() {
        if (this.f4729h && this.f4730i) {
            this.f4723a.removeCallbacksAndMessages(null);
            this.f -= System.currentTimeMillis() - this.f4728g;
            this.f4730i = false;
        }
    }

    public final void b(String str, JSONObject jSONObject) {
        boolean z;
        synchronized (this.f4735n) {
            try {
                z = this.f4734m;
                if (z) {
                    this.f4733l = new vf(this, str, jSONObject);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            c(str, jSONObject);
        } else if (a(4)) {
            d9 d9Var = new d9(e9.f3724d);
            d9Var.f3680d = "SI.defImp";
            d9Var.f3684i = AbstractC0033i.j("reason=", str);
            d9Var.a();
        }
    }

    public final void c() {
        if (this.f4731j.get() != 0) {
            return;
        }
        if (!o) {
            b(null, null);
            return;
        }
        long j3 = this.f;
        if (this.f4730i) {
            return;
        }
        this.f4730i = true;
        if (!this.f4729h) {
            this.f4729h = true;
        }
        this.f4728g = System.currentTimeMillis();
        this.f4723a.postDelayed(new uf(this), j3);
    }

    public final void a(String str, JSONObject jSONObject) {
        b(str, jSONObject);
        this.f4729h = false;
        this.f4723a.removeCallbacksAndMessages(null);
        this.f4730i = false;
        this.f4728g = 0L;
    }

    public static boolean a(int i3) {
        AnalyticsConfig h3 = MetaData.E().h();
        ComponentInfoEventConfig i4 = h3 != null ? h3.i() : null;
        return i4 != null && i4.a((long) i3);
    }

    public final void c(String str, JSONObject jSONObject) {
        if (!this.f4731j.compareAndSet(0, 1)) {
            int incrementAndGet = this.f4731j.incrementAndGet();
            if (a(str != null ? 2 : 1)) {
                d9 d9Var = new d9(e9.f3724d);
                d9Var.f3680d = "SI.repImp";
                d9Var.f3684i = AbstractC0033i.j("reason=", str);
                d9Var.f3681e = String.valueOf(incrementAndGet);
                d9Var.a();
                return;
            }
            return;
        }
        if (str == null) {
            Context context = this.f4724b;
            String[] strArr = this.f4726d;
            TrackingParams trackingParams = this.f4727e;
            if (context != null && strArr != null) {
                b9.a(context, Arrays.asList(strArr), trackingParams);
            }
            wf wfVar = (wf) this.f4732k.get();
            if (wfVar != null) {
                String[] strArr2 = this.f4726d;
                if (strArr2 != null && strArr2.length > 0) {
                    r0 = g0.a(strArr2[0], (String) null);
                }
                wfVar.a(r0);
            }
            try {
                u0 u0Var = (u0) com.startapp.sdk.components.a.a(this.f4724b).f3458Q.a();
                AdPreferences.Placement placement = this.f4725c;
                ConcurrentHashMap concurrentHashMap = u0Var.f4500c;
                Integer num = (Integer) concurrentHashMap.get(placement);
                concurrentHashMap.put(placement, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                return;
            } catch (Throwable th) {
                d9.a(th);
                return;
            }
        }
        String[] strArr3 = this.f4726d;
        TrackingParams trackingParams2 = this.f4727e;
        g0.a(strArr3, trackingParams2 != null ? trackingParams2.a() : null, 0, str, jSONObject);
    }

    public final void b() {
        vf vfVar;
        synchronized (this.f4735n) {
            vfVar = this.f4733l;
            this.f4734m = false;
            this.f4733l = null;
        }
        if (vfVar != null) {
            vfVar.run();
        }
        if (a(4)) {
            d9 d9Var = new d9(e9.f3724d);
            d9Var.f3680d = "SI.prcImp";
            StringBuilder sb = new StringBuilder("impr=");
            sb.append(vfVar != null);
            d9Var.f3684i = sb.toString();
            d9Var.a();
        }
    }
}
