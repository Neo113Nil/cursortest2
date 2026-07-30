package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import defpackage.al3;
import defpackage.b01;
import defpackage.bl3;
import defpackage.cg3;
import defpackage.dn3;
import defpackage.dq2;
import defpackage.fi3;
import defpackage.g10;
import defpackage.ge3;
import defpackage.gh3;
import defpackage.hi;
import defpackage.iu0;
import defpackage.jd3;
import defpackage.je3;
import defpackage.jl3;
import defpackage.jm3;
import defpackage.jr3;
import defpackage.kd3;
import defpackage.lh;
import defpackage.lj3;
import defpackage.ll3;
import defpackage.me3;
import defpackage.nj3;
import defpackage.np3;
import defpackage.om3;
import defpackage.pj3;
import defpackage.pl3;
import defpackage.qm3;
import defpackage.se3;
import defpackage.st1;
import defpackage.t13;
import defpackage.tm3;
import defpackage.tp3;
import defpackage.tt1;
import defpackage.ul3;
import defpackage.ve3;
import defpackage.vh3;
import defpackage.vl3;
import defpackage.xe3;
import defpackage.ye3;
import defpackage.ys;
import defpackage.ze3;
import defpackage.zh3;
import defpackage.zq3;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends ge3 {
    public pj3 g;
    public final hi h;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.g = null;
        this.h = new hi(0);
    }

    @Override // defpackage.he3
    public void beginAdUnitExposure(String str, long j) {
        c();
        se3 se3Var = this.g.z;
        pj3.j(se3Var);
        se3Var.x(j, str);
    }

    public final void c() {
        if (this.g != null) {
            return;
        }
        lh.g("Attempting to perform action before initialize.");
    }

    @Override // defpackage.he3
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        c();
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        jm3Var.K(str, str2, bundle);
    }

    @Override // defpackage.he3
    public void clearMeasurementEnabled(long j) {
        c();
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        jm3Var.x();
        lj3 lj3Var = ((pj3) jm3Var.m).s;
        pj3.m(lj3Var);
        lj3Var.F(new iu0(25, (Object) jm3Var, (Object) null, false));
    }

    public final void d(String str, je3 je3Var) {
        c();
        zq3 zq3Var = this.g.u;
        pj3.k(zq3Var);
        zq3Var.f0(str, je3Var);
    }

    @Override // defpackage.he3
    public void endAdUnitExposure(String str, long j) {
        c();
        se3 se3Var = this.g.z;
        pj3.j(se3Var);
        se3Var.y(j, str);
    }

    @Override // defpackage.he3
    public void generateEventId(je3 je3Var) {
        c();
        zq3 zq3Var = this.g.u;
        pj3.k(zq3Var);
        long t0 = zq3Var.t0();
        c();
        zq3 zq3Var2 = this.g.u;
        pj3.k(zq3Var2);
        zq3Var2.g0(je3Var, t0);
    }

    @Override // defpackage.he3
    public void getAppInstanceId(je3 je3Var) {
        c();
        lj3 lj3Var = this.g.s;
        pj3.m(lj3Var);
        lj3Var.F(new nj3(this, je3Var, 0));
    }

    @Override // defpackage.he3
    public void getCachedAppInstanceId(je3 je3Var) {
        c();
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        d((String) jm3Var.s.get(), je3Var);
    }

    @Override // defpackage.he3
    public void getConditionalUserProperties(String str, String str2, je3 je3Var) {
        c();
        lj3 lj3Var = this.g.s;
        pj3.m(lj3Var);
        lj3Var.F(new ys(this, je3Var, str, str2, 7));
    }

    @Override // defpackage.he3
    public void getCurrentScreenClass(je3 je3Var) {
        c();
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        dn3 dn3Var = ((pj3) jm3Var.m).x;
        pj3.l(dn3Var);
        tm3 tm3Var = dn3Var.o;
        d(tm3Var != null ? tm3Var.b : null, je3Var);
    }

    @Override // defpackage.he3
    public void getCurrentScreenName(je3 je3Var) {
        c();
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        dn3 dn3Var = ((pj3) jm3Var.m).x;
        pj3.l(dn3Var);
        tm3 tm3Var = dn3Var.o;
        d(tm3Var != null ? tm3Var.a : null, je3Var);
    }

    @Override // defpackage.he3
    public void getGmpAppId(je3 je3Var) {
        c();
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        d(jm3Var.L(), je3Var);
    }

    @Override // defpackage.he3
    public void getMaxUserProperties(String str, je3 je3Var) {
        c();
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        ll3.s(str);
        ((pj3) jm3Var.m).getClass();
        c();
        zq3 zq3Var = this.g.u;
        pj3.k(zq3Var);
        zq3Var.h0(je3Var, 25);
    }

    @Override // defpackage.he3
    public void getSessionId(je3 je3Var) {
        c();
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        lj3 lj3Var = ((pj3) jm3Var.m).s;
        pj3.m(lj3Var);
        lj3Var.F(new iu0(jm3Var, je3Var));
    }

    @Override // defpackage.he3
    public void getTestFlag(je3 je3Var, int i) {
        c();
        if (i == 0) {
            zq3 zq3Var = this.g.u;
            pj3.k(zq3Var);
            jm3 jm3Var = this.g.y;
            pj3.l(jm3Var);
            AtomicReference atomicReference = new AtomicReference();
            lj3 lj3Var = ((pj3) jm3Var.m).s;
            pj3.m(lj3Var);
            zq3Var.f0((String) lj3Var.G(atomicReference, 15000L, "String test flag value", new ul3(jm3Var, atomicReference, 1)), je3Var);
            return;
        }
        if (i == 1) {
            zq3 zq3Var2 = this.g.u;
            pj3.k(zq3Var2);
            jm3 jm3Var2 = this.g.y;
            pj3.l(jm3Var2);
            AtomicReference atomicReference2 = new AtomicReference();
            lj3 lj3Var2 = ((pj3) jm3Var2.m).s;
            pj3.m(lj3Var2);
            zq3Var2.g0(je3Var, ((Long) lj3Var2.G(atomicReference2, 15000L, "long test flag value", new ul3(jm3Var2, atomicReference2, 2))).longValue());
            return;
        }
        if (i == 2) {
            zq3 zq3Var3 = this.g.u;
            pj3.k(zq3Var3);
            jm3 jm3Var3 = this.g.y;
            pj3.l(jm3Var3);
            AtomicReference atomicReference3 = new AtomicReference();
            lj3 lj3Var3 = ((pj3) jm3Var3.m).s;
            pj3.m(lj3Var3);
            double doubleValue = ((Double) lj3Var3.G(atomicReference3, 15000L, "double test flag value", new ul3(jm3Var3, atomicReference3, 4))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                je3Var.m(bundle);
                return;
            } catch (RemoteException e) {
                vh3 vh3Var = ((pj3) zq3Var3.m).r;
                pj3.m(vh3Var);
                vh3Var.u.c(e, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            zq3 zq3Var4 = this.g.u;
            pj3.k(zq3Var4);
            jm3 jm3Var4 = this.g.y;
            pj3.l(jm3Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            lj3 lj3Var4 = ((pj3) jm3Var4.m).s;
            pj3.m(lj3Var4);
            zq3Var4.h0(je3Var, ((Integer) lj3Var4.G(atomicReference4, 15000L, "int test flag value", new ul3(jm3Var4, atomicReference4, 3))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        zq3 zq3Var5 = this.g.u;
        pj3.k(zq3Var5);
        jm3 jm3Var5 = this.g.y;
        pj3.l(jm3Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        lj3 lj3Var5 = ((pj3) jm3Var5.m).s;
        pj3.m(lj3Var5);
        zq3Var5.j0(je3Var, ((Boolean) lj3Var5.G(atomicReference5, 15000L, "boolean test flag value", new ul3(jm3Var5, atomicReference5, 0))).booleanValue());
    }

    @Override // defpackage.he3
    public void getUserProperties(String str, String str2, boolean z, je3 je3Var) {
        c();
        lj3 lj3Var = this.g.s;
        pj3.m(lj3Var);
        lj3Var.F(new fi3(this, je3Var, str, str2, z));
    }

    @Override // defpackage.he3
    public void initForTests(Map map) {
        c();
    }

    @Override // defpackage.he3
    public void initialize(b01 b01Var, ye3 ye3Var, long j) {
        pj3 pj3Var = this.g;
        if (pj3Var == null) {
            Context context = (Context) st1.J(b01Var);
            ll3.v(context);
            this.g = pj3.s(context, ye3Var, Long.valueOf(j));
        } else {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.u.b("Attempting to initialize multiple times");
        }
    }

    @Override // defpackage.he3
    public void isDataCollectionEnabled(je3 je3Var) {
        c();
        lj3 lj3Var = this.g.s;
        pj3.m(lj3Var);
        lj3Var.F(new nj3(this, je3Var, 1));
    }

    @Override // defpackage.he3
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        c();
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        jm3Var.B(str, str2, bundle, z, z2, j);
    }

    @Override // defpackage.he3
    public void logEventAndBundle(String str, String str2, Bundle bundle, je3 je3Var, long j) {
        c();
        ll3.s(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        kd3 kd3Var = new kd3(str2, new jd3(bundle), "app", j);
        lj3 lj3Var = this.g.s;
        pj3.m(lj3Var);
        lj3Var.F(new ys(this, je3Var, kd3Var, str, 4));
    }

    @Override // defpackage.he3
    public void logHealthData(int i, String str, b01 b01Var, b01 b01Var2, b01 b01Var3) {
        c();
        Object J = b01Var == null ? null : st1.J(b01Var);
        Object J2 = b01Var2 == null ? null : st1.J(b01Var2);
        Object J3 = b01Var3 != null ? st1.J(b01Var3) : null;
        vh3 vh3Var = this.g.r;
        pj3.m(vh3Var);
        vh3Var.F(i, true, false, str, J, J2, J3);
    }

    @Override // defpackage.he3
    public void onActivityCreated(b01 b01Var, Bundle bundle, long j) {
        c();
        Activity activity = (Activity) st1.J(b01Var);
        ll3.v(activity);
        onActivityCreatedByScionActivityInfo(ze3.a(activity), bundle, j);
    }

    @Override // defpackage.he3
    public void onActivityCreatedByScionActivityInfo(ze3 ze3Var, Bundle bundle, long j) {
        c();
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        cg3 cg3Var = jm3Var.o;
        if (cg3Var != null) {
            jm3 jm3Var2 = this.g.y;
            pj3.l(jm3Var2);
            jm3Var2.P();
            cg3Var.c(ze3Var, bundle);
        }
    }

    @Override // defpackage.he3
    public void onActivityDestroyed(b01 b01Var, long j) {
        c();
        Activity activity = (Activity) st1.J(b01Var);
        ll3.v(activity);
        onActivityDestroyedByScionActivityInfo(ze3.a(activity), j);
    }

    @Override // defpackage.he3
    public void onActivityDestroyedByScionActivityInfo(ze3 ze3Var, long j) {
        c();
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        cg3 cg3Var = jm3Var.o;
        if (cg3Var != null) {
            jm3 jm3Var2 = this.g.y;
            pj3.l(jm3Var2);
            jm3Var2.P();
            cg3Var.d(ze3Var);
        }
    }

    @Override // defpackage.he3
    public void onActivityPaused(b01 b01Var, long j) {
        c();
        Activity activity = (Activity) st1.J(b01Var);
        ll3.v(activity);
        onActivityPausedByScionActivityInfo(ze3.a(activity), j);
    }

    @Override // defpackage.he3
    public void onActivityPausedByScionActivityInfo(ze3 ze3Var, long j) {
        c();
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        cg3 cg3Var = jm3Var.o;
        if (cg3Var != null) {
            jm3 jm3Var2 = this.g.y;
            pj3.l(jm3Var2);
            jm3Var2.P();
            cg3Var.e(ze3Var);
        }
    }

    @Override // defpackage.he3
    public void onActivityResumed(b01 b01Var, long j) {
        c();
        Activity activity = (Activity) st1.J(b01Var);
        ll3.v(activity);
        onActivityResumedByScionActivityInfo(ze3.a(activity), j);
    }

    @Override // defpackage.he3
    public void onActivityResumedByScionActivityInfo(ze3 ze3Var, long j) {
        c();
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        cg3 cg3Var = jm3Var.o;
        if (cg3Var != null) {
            jm3 jm3Var2 = this.g.y;
            pj3.l(jm3Var2);
            jm3Var2.P();
            cg3Var.f(ze3Var);
        }
    }

    @Override // defpackage.he3
    public void onActivitySaveInstanceState(b01 b01Var, je3 je3Var, long j) {
        c();
        Activity activity = (Activity) st1.J(b01Var);
        ll3.v(activity);
        onActivitySaveInstanceStateByScionActivityInfo(ze3.a(activity), je3Var, j);
    }

    @Override // defpackage.he3
    public void onActivitySaveInstanceStateByScionActivityInfo(ze3 ze3Var, je3 je3Var, long j) {
        c();
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        cg3 cg3Var = jm3Var.o;
        Bundle bundle = new Bundle();
        if (cg3Var != null) {
            jm3 jm3Var2 = this.g.y;
            pj3.l(jm3Var2);
            jm3Var2.P();
            cg3Var.g(ze3Var, bundle);
        }
        try {
            je3Var.m(bundle);
        } catch (RemoteException e) {
            vh3 vh3Var = this.g.r;
            pj3.m(vh3Var);
            vh3Var.u.c(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // defpackage.he3
    public void onActivityStarted(b01 b01Var, long j) {
        c();
        Activity activity = (Activity) st1.J(b01Var);
        ll3.v(activity);
        onActivityStartedByScionActivityInfo(ze3.a(activity), j);
    }

    @Override // defpackage.he3
    public void onActivityStartedByScionActivityInfo(ze3 ze3Var, long j) {
        c();
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        if (jm3Var.o != null) {
            jm3 jm3Var2 = this.g.y;
            pj3.l(jm3Var2);
            jm3Var2.P();
        }
    }

    @Override // defpackage.he3
    public void onActivityStopped(b01 b01Var, long j) {
        c();
        Activity activity = (Activity) st1.J(b01Var);
        ll3.v(activity);
        onActivityStoppedByScionActivityInfo(ze3.a(activity), j);
    }

    @Override // defpackage.he3
    public void onActivityStoppedByScionActivityInfo(ze3 ze3Var, long j) {
        c();
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        if (jm3Var.o != null) {
            jm3 jm3Var2 = this.g.y;
            pj3.l(jm3Var2);
            jm3Var2.P();
        }
    }

    @Override // defpackage.he3
    public void performAction(Bundle bundle, je3 je3Var, long j) {
        c();
        je3Var.m(null);
    }

    @Override // defpackage.he3
    public void registerOnMeasurementEventListener(ve3 ve3Var) {
        Object obj;
        c();
        hi hiVar = this.h;
        synchronized (hiVar) {
            try {
                obj = (bl3) hiVar.get(Integer.valueOf(ve3Var.e()));
                if (obj == null) {
                    obj = new jr3(this, ve3Var);
                    hiVar.put(Integer.valueOf(ve3Var.e()), obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        jm3Var.x();
        if (jm3Var.q.add(obj)) {
            return;
        }
        vh3 vh3Var = ((pj3) jm3Var.m).r;
        pj3.m(vh3Var);
        vh3Var.u.b("OnEventListener already registered");
    }

    @Override // defpackage.he3
    public void resetAnalyticsData(long j) {
        c();
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        jm3Var.s.set(null);
        lj3 lj3Var = ((pj3) jm3Var.m).s;
        pj3.m(lj3Var);
        lj3Var.F(new pl3(jm3Var, j, 1));
    }

    @Override // defpackage.he3
    public void retrieveAndUploadBatches(me3 me3Var) {
        qm3 qm3Var;
        c();
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        jm3Var.x();
        pj3 pj3Var = (pj3) jm3Var.m;
        lj3 lj3Var = pj3Var.s;
        pj3.m(lj3Var);
        if (lj3Var.C()) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.r.b("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        lj3 lj3Var2 = pj3Var.s;
        pj3.m(lj3Var2);
        if (Thread.currentThread() == lj3Var2.p) {
            vh3 vh3Var2 = pj3Var.r;
            pj3.m(vh3Var2);
            vh3Var2.r.b("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        boolean j = dq2.j();
        vh3 vh3Var3 = pj3Var.r;
        if (j) {
            pj3.m(vh3Var3);
            vh3Var3.r.b("Cannot retrieve and upload batches from main thread");
            return;
        }
        pj3.m(vh3Var3);
        vh3Var3.z.b("[sgtm] Started client-side batch upload work.");
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        while (!z2) {
            vh3 vh3Var4 = pj3Var.r;
            pj3.m(vh3Var4);
            vh3Var4.z.b("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            lj3 lj3Var3 = pj3Var.s;
            pj3.m(lj3Var3);
            lj3Var3.G(atomicReference, 10000L, "[sgtm] Getting upload batches", new ul3(jm3Var, atomicReference, 6, z));
            tp3 tp3Var = (tp3) atomicReference.get();
            if (tp3Var == null) {
                break;
            }
            List list = tp3Var.m;
            if (list.isEmpty()) {
                break;
            }
            vh3 vh3Var5 = pj3Var.r;
            pj3.m(vh3Var5);
            vh3Var5.z.c(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            i += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                np3 np3Var = (np3) it.next();
                try {
                    URL url = new URI(np3Var.o).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    gh3 r = ((pj3) jm3Var.m).r();
                    r.x();
                    ll3.v(r.s);
                    String str = r.s;
                    pj3 pj3Var2 = (pj3) jm3Var.m;
                    vh3 vh3Var6 = pj3Var2.r;
                    pj3.m(vh3Var6);
                    g10 g10Var = vh3Var6.z;
                    Long valueOf = Long.valueOf(np3Var.m);
                    g10Var.e("[sgtm] Uploading data from app. row_id, url, uncompressed size", valueOf, np3Var.o, Integer.valueOf(np3Var.n.length));
                    if (!TextUtils.isEmpty(np3Var.s)) {
                        vh3 vh3Var7 = pj3Var2.r;
                        pj3.m(vh3Var7);
                        vh3Var7.z.d(valueOf, np3Var.s, "[sgtm] Uploading data from app. row_id");
                    }
                    HashMap hashMap = new HashMap();
                    Bundle bundle = np3Var.p;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(str2, string);
                        }
                    }
                    om3 om3Var = pj3Var2.A;
                    pj3.m(om3Var);
                    byte[] bArr = np3Var.n;
                    t13 t13Var = new t13(jm3Var, atomicReference2, np3Var, 5);
                    om3Var.y();
                    ll3.v(url);
                    ll3.v(bArr);
                    lj3 lj3Var4 = ((pj3) om3Var.m).s;
                    pj3.m(lj3Var4);
                    lj3Var4.I(new zh3(om3Var, str, url, bArr, hashMap, t13Var));
                    try {
                        zq3 zq3Var = pj3Var2.u;
                        pj3.k(zq3Var);
                        pj3 pj3Var3 = (pj3) zq3Var.m;
                        pj3Var3.w.getClass();
                        long currentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long j2 = 60000; atomicReference2.get() == null && j2 > 0; j2 = currentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(j2);
                                    pj3Var3.w.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        vh3 vh3Var8 = ((pj3) jm3Var.m).r;
                        pj3.m(vh3Var8);
                        vh3Var8.u.b("[sgtm] Interrupted waiting for uploading batch");
                    }
                    qm3Var = atomicReference2.get() == null ? qm3.UNKNOWN : (qm3) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e) {
                    vh3 vh3Var9 = ((pj3) jm3Var.m).r;
                    pj3.m(vh3Var9);
                    vh3Var9.r.e("[sgtm] Bad upload url for row_id", np3Var.o, Long.valueOf(np3Var.m), e);
                    qm3Var = qm3.FAILURE;
                }
                if (qm3Var != qm3.SUCCESS) {
                    if (qm3Var == qm3.BACKOFF) {
                        z2 = true;
                        break;
                    }
                } else {
                    i2++;
                }
            }
            z = false;
        }
        vh3 vh3Var10 = pj3Var.r;
        pj3.m(vh3Var10);
        vh3Var10.z.d(Integer.valueOf(i), Integer.valueOf(i2), "[sgtm] Completed client-side batch upload work. total, success");
        try {
            me3Var.a();
        } catch (RemoteException e2) {
            pj3 pj3Var4 = this.g;
            ll3.v(pj3Var4);
            vh3 vh3Var11 = pj3Var4.r;
            pj3.m(vh3Var11);
            vh3Var11.u.c(e2, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    @Override // defpackage.he3
    public void setConditionalUserProperty(Bundle bundle, long j) {
        c();
        pj3 pj3Var = this.g;
        if (bundle == null) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.r.b("Conditional user property must not be null");
        } else {
            jm3 jm3Var = pj3Var.y;
            pj3.l(jm3Var);
            jm3Var.J(bundle, j);
        }
    }

    @Override // defpackage.he3
    public void setConsentThirdParty(Bundle bundle, long j) {
        c();
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        jm3Var.Q(bundle, -20, j);
    }

    @Override // defpackage.he3
    public void setCurrentScreen(b01 b01Var, String str, String str2, long j) {
        c();
        Activity activity = (Activity) st1.J(b01Var);
        ll3.v(activity);
        setCurrentScreenByScionActivityInfo(ze3.a(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r2 <= 500) goto L31;
     */
    @Override // defpackage.he3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setCurrentScreenByScionActivityInfo(ze3 ze3Var, String str, String str2, long j) {
        c();
        dn3 dn3Var = this.g.x;
        pj3.l(dn3Var);
        pj3 pj3Var = (pj3) dn3Var.m;
        if (!pj3Var.p.K()) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.w.b("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        tm3 tm3Var = dn3Var.o;
        if (tm3Var == null) {
            vh3 vh3Var2 = pj3Var.r;
            pj3.m(vh3Var2);
            vh3Var2.w.b("setCurrentScreen cannot be called while no activity active");
            return;
        }
        ConcurrentHashMap concurrentHashMap = dn3Var.r;
        Integer valueOf = Integer.valueOf(ze3Var.m);
        if (concurrentHashMap.get(valueOf) == null) {
            vh3 vh3Var3 = pj3Var.r;
            pj3.m(vh3Var3);
            vh3Var3.w.b("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = dn3Var.D(ze3Var.n);
        }
        String str3 = tm3Var.b;
        String str4 = tm3Var.a;
        boolean equals = Objects.equals(str3, str2);
        boolean equals2 = Objects.equals(str4, str);
        if (equals && equals2) {
            vh3 vh3Var4 = pj3Var.r;
            pj3.m(vh3Var4);
            vh3Var4.w.b("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null) {
            if (str.length() > 0) {
                int length = str.length();
                pj3Var.p.getClass();
            }
            vh3 vh3Var5 = pj3Var.r;
            pj3.m(vh3Var5);
            vh3Var5.w.c(Integer.valueOf(str.length()), "Invalid screen name length in setCurrentScreen. Length");
            return;
        }
        if (str2.length() > 0) {
            int length2 = str2.length();
            pj3Var.p.getClass();
            if (length2 <= 500) {
                vh3 vh3Var6 = pj3Var.r;
                pj3.m(vh3Var6);
                vh3Var6.z.d(str == null ? "null" : str, str2, "Setting current screen to name, class");
                zq3 zq3Var = pj3Var.u;
                pj3.k(zq3Var);
                tm3 tm3Var2 = new tm3(str, str2, zq3Var.t0());
                concurrentHashMap.put(valueOf, tm3Var2);
                dn3Var.F(ze3Var.n, tm3Var2, true);
                return;
            }
        }
        vh3 vh3Var7 = pj3Var.r;
        pj3.m(vh3Var7);
        vh3Var7.w.c(Integer.valueOf(str2.length()), "Invalid class name length in setCurrentScreen. Length");
    }

    @Override // defpackage.he3
    public void setDataCollectionEnabled(boolean z) {
        c();
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        jm3Var.x();
        lj3 lj3Var = ((pj3) jm3Var.m).s;
        pj3.m(lj3Var);
        lj3Var.F(new jl3(jm3Var, z));
    }

    @Override // defpackage.he3
    public void setDefaultEventParameters(Bundle bundle) {
        c();
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        lj3 lj3Var = ((pj3) jm3Var.m).s;
        pj3.m(lj3Var);
        lj3Var.F(new vl3(jm3Var, bundle2, 2));
    }

    @Override // defpackage.he3
    public void setEventInterceptor(ve3 ve3Var) {
        c();
        tt1 tt1Var = new tt1(28, this, ve3Var, r2);
        lj3 lj3Var = this.g.s;
        pj3.m(lj3Var);
        boolean C = lj3Var.C();
        pj3 pj3Var = this.g;
        if (!C) {
            lj3 lj3Var2 = pj3Var.s;
            pj3.m(lj3Var2);
            lj3Var2.F(new iu0(27, this, tt1Var, r2));
            return;
        }
        jm3 jm3Var = pj3Var.y;
        pj3.l(jm3Var);
        jm3Var.v();
        jm3Var.x();
        al3 al3Var = jm3Var.p;
        if (tt1Var != al3Var) {
            ll3.x(al3Var == null, "EventInterceptor already set.");
        }
        jm3Var.p = tt1Var;
    }

    @Override // defpackage.he3
    public void setInstanceIdProvider(xe3 xe3Var) {
        c();
    }

    @Override // defpackage.he3
    public void setMeasurementEnabled(boolean z, long j) {
        c();
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        Boolean valueOf = Boolean.valueOf(z);
        jm3Var.x();
        lj3 lj3Var = ((pj3) jm3Var.m).s;
        pj3.m(lj3Var);
        lj3Var.F(new iu0(25, (Object) jm3Var, (Object) valueOf, false));
    }

    @Override // defpackage.he3
    public void setMinimumSessionDuration(long j) {
        c();
    }

    @Override // defpackage.he3
    public void setSessionTimeoutDuration(long j) {
        c();
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        lj3 lj3Var = ((pj3) jm3Var.m).s;
        pj3.m(lj3Var);
        lj3Var.F(new pl3(jm3Var, j, 0));
    }

    @Override // defpackage.he3
    public void setSgtmDebugInfo(Intent intent) {
        c();
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        pj3 pj3Var = (pj3) jm3Var.m;
        Uri data = intent.getData();
        if (data == null) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.x.b("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals(AppEventsConstants.EVENT_PARAM_VALUE_YES)) {
            vh3 vh3Var2 = pj3Var.r;
            pj3.m(vh3Var2);
            vh3Var2.x.b("[sgtm] Preview Mode was not enabled.");
            pj3Var.p.o = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        vh3 vh3Var3 = pj3Var.r;
        pj3.m(vh3Var3);
        vh3Var3.x.c(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        pj3Var.p.o = queryParameter2;
    }

    @Override // defpackage.he3
    public void setUserId(String str, long j) {
        c();
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        pj3 pj3Var = (pj3) jm3Var.m;
        if (str != null && TextUtils.isEmpty(str)) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.u.b("User ID must be non-empty or null");
        } else {
            lj3 lj3Var = pj3Var.s;
            pj3.m(lj3Var);
            lj3Var.F(new iu0(28, jm3Var, str));
            jm3Var.G(null, "_id", str, true, j);
        }
    }

    @Override // defpackage.he3
    public void setUserProperty(String str, String str2, b01 b01Var, boolean z, long j) {
        c();
        Object J = st1.J(b01Var);
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        jm3Var.G(str, str2, J, z, j);
    }

    @Override // defpackage.he3
    public void unregisterOnMeasurementEventListener(ve3 ve3Var) {
        Object obj;
        c();
        hi hiVar = this.h;
        synchronized (hiVar) {
            obj = (bl3) hiVar.remove(Integer.valueOf(ve3Var.e()));
        }
        if (obj == null) {
            obj = new jr3(this, ve3Var);
        }
        jm3 jm3Var = this.g.y;
        pj3.l(jm3Var);
        jm3Var.x();
        if (jm3Var.q.remove(obj)) {
            return;
        }
        vh3 vh3Var = ((pj3) jm3Var.m).r;
        pj3.m(vh3Var);
        vh3Var.u.b("OnEventListener had not been registered");
    }

    @Override // defpackage.he3
    public void setConsent(Bundle bundle, long j) {
    }
}
