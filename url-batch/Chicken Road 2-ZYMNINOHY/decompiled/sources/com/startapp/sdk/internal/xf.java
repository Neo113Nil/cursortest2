package com.startapp.sdk.internal;

import E.AbstractC0005f;
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
    public final Context f7870b;

    /* renamed from: c, reason: collision with root package name */
    public final AdPreferences.Placement f7871c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f7872d;

    /* renamed from: e, reason: collision with root package name */
    public final TrackingParams f7873e;

    /* renamed from: f, reason: collision with root package name */
    public long f7874f;

    /* renamed from: g, reason: collision with root package name */
    public long f7875g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7876h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7877i;

    /* renamed from: k, reason: collision with root package name */
    public final WeakReference f7879k;

    /* renamed from: l, reason: collision with root package name */
    public vf f7880l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7881m;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f7869a = new Handler(Looper.getMainLooper());

    /* renamed from: j, reason: collision with root package name */
    public final AtomicInteger f7878j = new AtomicInteger();
    public final Object n = new Object();

    public xf(Context context, AdPreferences.Placement placement, String[] strArr, TrackingParams trackingParams, long j4, boolean z, wf wfVar) {
        Context a3 = w0.a(context);
        this.f7870b = a3 != null ? a3 : context;
        this.f7871c = placement;
        this.f7872d = strArr;
        this.f7873e = trackingParams;
        this.f7874f = j4;
        this.f7881m = z;
        this.f7879k = new WeakReference(wfVar);
    }

    public final void a() {
        if (this.f7876h && this.f7877i) {
            this.f7869a.removeCallbacksAndMessages(null);
            this.f7874f -= System.currentTimeMillis() - this.f7875g;
            this.f7877i = false;
        }
    }

    public final void b(String str, JSONObject jSONObject) {
        boolean z;
        synchronized (this.n) {
            try {
                z = this.f7881m;
                if (z) {
                    this.f7880l = new vf(this, str, jSONObject);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            c(str, jSONObject);
        } else if (a(4)) {
            d9 d9Var = new d9(e9.f6838d);
            d9Var.f6792d = "SI.defImp";
            d9Var.f6797i = AbstractC0005f.n("reason=", str);
            d9Var.a();
        }
    }

    public final void c() {
        if (this.f7878j.get() != 0) {
            return;
        }
        if (!o) {
            b(null, null);
            return;
        }
        long j4 = this.f7874f;
        if (this.f7877i) {
            return;
        }
        this.f7877i = true;
        if (!this.f7876h) {
            this.f7876h = true;
        }
        this.f7875g = System.currentTimeMillis();
        this.f7869a.postDelayed(new uf(this), j4);
    }

    public final void a(String str, JSONObject jSONObject) {
        b(str, jSONObject);
        this.f7876h = false;
        this.f7869a.removeCallbacksAndMessages(null);
        this.f7877i = false;
        this.f7875g = 0L;
    }

    public static boolean a(int i4) {
        AnalyticsConfig h2 = MetaData.E().h();
        ComponentInfoEventConfig i5 = h2 != null ? h2.i() : null;
        return i5 != null && i5.a((long) i4);
    }

    public final void c(String str, JSONObject jSONObject) {
        if (!this.f7878j.compareAndSet(0, 1)) {
            int incrementAndGet = this.f7878j.incrementAndGet();
            if (a(str != null ? 2 : 1)) {
                d9 d9Var = new d9(e9.f6838d);
                d9Var.f6792d = "SI.repImp";
                d9Var.f6797i = AbstractC0005f.n("reason=", str);
                d9Var.f6793e = String.valueOf(incrementAndGet);
                d9Var.a();
                return;
            }
            return;
        }
        if (str == null) {
            Context context = this.f7870b;
            String[] strArr = this.f7872d;
            TrackingParams trackingParams = this.f7873e;
            if (context != null && strArr != null) {
                b9.a(context, Arrays.asList(strArr), trackingParams);
            }
            wf wfVar = (wf) this.f7879k.get();
            if (wfVar != null) {
                String[] strArr2 = this.f7872d;
                if (strArr2 != null && strArr2.length > 0) {
                    r0 = g0.a(strArr2[0], (String) null);
                }
                wfVar.a(r0);
            }
            try {
                u0 u0Var = (u0) com.startapp.sdk.components.a.a(this.f7870b).f6556Q.a();
                AdPreferences.Placement placement = this.f7871c;
                ConcurrentHashMap concurrentHashMap = u0Var.f7639c;
                Integer num = (Integer) concurrentHashMap.get(placement);
                concurrentHashMap.put(placement, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                return;
            } catch (Throwable th) {
                d9.a(th);
                return;
            }
        }
        String[] strArr3 = this.f7872d;
        TrackingParams trackingParams2 = this.f7873e;
        g0.a(strArr3, trackingParams2 != null ? trackingParams2.a() : null, 0, str, jSONObject);
    }

    public final void b() {
        vf vfVar;
        synchronized (this.n) {
            vfVar = this.f7880l;
            this.f7881m = false;
            this.f7880l = null;
        }
        if (vfVar != null) {
            vfVar.run();
        }
        if (a(4)) {
            d9 d9Var = new d9(e9.f6838d);
            d9Var.f6792d = "SI.prcImp";
            StringBuilder sb = new StringBuilder("impr=");
            sb.append(vfVar != null);
            d9Var.f6797i = sb.toString();
            d9Var.a();
        }
    }
}
