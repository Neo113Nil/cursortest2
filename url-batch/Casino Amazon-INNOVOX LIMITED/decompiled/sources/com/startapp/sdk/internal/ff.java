package com.startapp.sdk.internal;

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

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ff {
    public static final boolean o = MetaData.A().i0();
    public final Context b;
    public final AdPreferences.Placement c;
    public final String[] d;
    public final TrackingParams e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public final WeakReference k;
    public df l;
    public boolean m;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f238a = new Handler(Looper.getMainLooper());
    public final AtomicInteger j = new AtomicInteger();
    public final Object n = new Object();

    public ff(Context context, AdPreferences.Placement placement, String[] strArr, TrackingParams trackingParams, long j, boolean z, ef efVar) {
        Context a2 = t0.a(context);
        this.b = a2 != null ? a2 : context;
        this.c = placement;
        this.d = strArr;
        this.e = trackingParams;
        this.f = j;
        this.m = z;
        this.k = new WeakReference(efVar);
    }

    public final void a() {
        if (this.h && this.i) {
            this.f238a.removeCallbacksAndMessages(null);
            this.f -= System.currentTimeMillis() - this.g;
            this.i = false;
        }
    }

    public final void b(String str, JSONObject jSONObject) {
        boolean z;
        synchronized (this.n) {
            z = this.m;
            if (z) {
                this.l = new df(this, str, jSONObject);
            }
        }
        if (!z) {
            c(str, jSONObject);
        } else if (a(4)) {
            n8 n8Var = new n8(o8.d);
            n8Var.d = "SI.defImp";
            n8Var.i = "reason=" + str;
            n8Var.a();
        }
    }

    public final void c() {
        if (this.j.get() != 0) {
            return;
        }
        if (!o) {
            b(null, null);
            return;
        }
        long j = this.f;
        if (this.i) {
            return;
        }
        this.i = true;
        if (!this.h) {
            this.h = true;
        }
        this.g = System.currentTimeMillis();
        this.f238a.postDelayed(new cf(this), j);
    }

    public final void a(String str, JSONObject jSONObject) {
        b(str, jSONObject);
        this.h = false;
        this.f238a.removeCallbacksAndMessages(null);
        this.i = false;
        this.g = 0L;
    }

    public static boolean a(int i) {
        AnalyticsConfig g = MetaData.A().g();
        ComponentInfoEventConfig j = g != null ? g.j() : null;
        return j != null && j.a((long) i);
    }

    public final void c(String str, JSONObject jSONObject) {
        if (this.j.compareAndSet(0, 1)) {
            Context context = this.b;
            String[] strArr = this.d;
            if (str == null) {
                TrackingParams trackingParams = this.e;
                if (context != null && strArr != null) {
                    m8.a(context, Arrays.asList(strArr), trackingParams);
                }
                ef efVar = (ef) this.k.get();
                if (efVar != null) {
                    String[] strArr2 = this.d;
                    if (strArr2 != null && strArr2.length > 0) {
                        r4 = e0.a(strArr2[0], (String) null);
                    }
                    efVar.a(r4);
                }
                try {
                    r0 r0Var = (r0) com.startapp.sdk.components.a.a(this.b).P.a();
                    AdPreferences.Placement placement = this.c;
                    ConcurrentHashMap concurrentHashMap = r0Var.c;
                    Integer num = (Integer) concurrentHashMap.get(placement);
                    concurrentHashMap.put(placement, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                    return;
                } catch (Throwable th) {
                    n8.a(th);
                    return;
                }
            }
            TrackingParams trackingParams2 = this.e;
            e0.a(strArr, trackingParams2 != null ? trackingParams2.a() : null, 0, str, jSONObject);
            return;
        }
        int incrementAndGet = this.j.incrementAndGet();
        if (a(str != null ? 2 : 1)) {
            n8 n8Var = new n8(o8.d);
            n8Var.d = "SI.repImp";
            n8Var.i = "reason=" + str;
            n8Var.e = String.valueOf(incrementAndGet);
            n8Var.a();
        }
    }

    public final void b() {
        df dfVar;
        synchronized (this.n) {
            dfVar = this.l;
            this.m = false;
            this.l = null;
        }
        if (dfVar != null) {
            dfVar.c.c(dfVar.f215a, dfVar.b);
        }
        if (a(4)) {
            n8 n8Var = new n8(o8.d);
            n8Var.d = "SI.prcImp";
            n8Var.i = "impr=" + (dfVar != null);
            n8Var.a();
        }
    }
}
