package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import c6.s;
import c7.c0;
import com.google.android.gms.internal.measurement.c6;
import com.google.android.gms.internal.measurement.f6;
import com.google.android.gms.internal.measurement.h6;
import com.google.android.gms.internal.measurement.i6;
import com.google.android.gms.internal.measurement.j6;
import com.google.android.gms.internal.measurement.m6;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.p6;
import com.google.firebase.messaging.k;
import d6.t;
import f8.j0;
import j7.a;
import j7.b;
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
import k5.c;
import kotlin.collections.i0;
import s.e;
import s7.a4;
import s7.b3;
import s7.c4;
import s7.e0;
import s7.h2;
import s7.i2;
import s7.j2;
import s7.l2;
import s7.m0;
import s7.m2;
import s7.o1;
import s7.p1;
import s7.p4;
import s7.q1;
import s7.q2;
import s7.q4;
import s7.t0;
import s7.u;
import s7.u2;
import s7.v0;
import s7.w2;
import s7.y0;
import s7.y2;
import s7.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends c6 {

    /* renamed from: d, reason: collision with root package name */
    public q1 f3062d;

    /* renamed from: e, reason: collision with root package name */
    public final e f3063e;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.f3062d = null;
        this.f3063e = new e(0);
    }

    public final void D() {
        if (this.f3062d != null) {
            return;
        }
        i0.l("Attempting to perform action before initialize.");
    }

    public final void E(String str, f6 f6Var) {
        D();
        p4 p4Var = this.f3062d.f8940w;
        q1.j(p4Var);
        p4Var.f0(str, f6Var);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void beginAdUnitExposure(String str, long j) {
        D();
        z zVar = this.f3062d.B;
        q1.i(zVar);
        zVar.t(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        D();
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        q2Var.G(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void clearMeasurementEnabled(long j) {
        D();
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        q2Var.t();
        o1 o1Var = ((q1) q2Var.f1478d).f8938u;
        q1.l(o1Var);
        o1Var.B(new j0(19, q2Var, null, false));
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void endAdUnitExposure(String str, long j) {
        D();
        z zVar = this.f3062d.B;
        q1.i(zVar);
        zVar.u(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void generateEventId(f6 f6Var) {
        D();
        p4 p4Var = this.f3062d.f8940w;
        q1.j(p4Var);
        long q02 = p4Var.q0();
        D();
        p4 p4Var2 = this.f3062d.f8940w;
        q1.j(p4Var2);
        p4Var2.g0(f6Var, q02);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void getAppInstanceId(f6 f6Var) {
        D();
        o1 o1Var = this.f3062d.f8938u;
        q1.l(o1Var);
        o1Var.B(new p1(this, f6Var, 0));
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void getCachedAppInstanceId(f6 f6Var) {
        D();
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        E((String) q2Var.f8948u.get(), f6Var);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void getConditionalUserProperties(String str, String str2, f6 f6Var) {
        D();
        o1 o1Var = this.f3062d.f8938u;
        q1.l(o1Var);
        o1Var.B(new t(this, f6Var, str, str2, 7));
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void getCurrentScreenClass(f6 f6Var) {
        D();
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        b3 b3Var = ((q1) q2Var.f1478d).f8943z;
        q1.k(b3Var);
        y2 y2Var = b3Var.f8522i;
        E(y2Var != null ? y2Var.f9127b : null, f6Var);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void getCurrentScreenName(f6 f6Var) {
        D();
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        b3 b3Var = ((q1) q2Var.f1478d).f8943z;
        q1.k(b3Var);
        y2 y2Var = b3Var.f8522i;
        E(y2Var != null ? y2Var.f9126a : null, f6Var);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void getGmpAppId(f6 f6Var) {
        D();
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        E(q2Var.H(), f6Var);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void getMaxUserProperties(String str, f6 f6Var) {
        D();
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        c0.d(str);
        ((q1) q2Var.f1478d).getClass();
        D();
        p4 p4Var = this.f3062d.f8940w;
        q1.j(p4Var);
        p4Var.h0(f6Var, 25);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void getSessionId(f6 f6Var) {
        D();
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        o1 o1Var = ((q1) q2Var.f1478d).f8938u;
        q1.l(o1Var);
        o1Var.B(new j0(q2Var, f6Var));
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void getTestFlag(f6 f6Var, int i3) {
        D();
        if (i3 == 0) {
            p4 p4Var = this.f3062d.f8940w;
            q1.j(p4Var);
            q2 q2Var = this.f3062d.A;
            q1.k(q2Var);
            AtomicReference atomicReference = new AtomicReference();
            o1 o1Var = ((q1) q2Var.f1478d).f8938u;
            q1.l(o1Var);
            p4Var.f0((String) o1Var.C(atomicReference, 15000L, "String test flag value", new l2(q2Var, atomicReference, 1)), f6Var);
            return;
        }
        if (i3 == 1) {
            p4 p4Var2 = this.f3062d.f8940w;
            q1.j(p4Var2);
            q2 q2Var2 = this.f3062d.A;
            q1.k(q2Var2);
            AtomicReference atomicReference2 = new AtomicReference();
            o1 o1Var2 = ((q1) q2Var2.f1478d).f8938u;
            q1.l(o1Var2);
            p4Var2.g0(f6Var, ((Long) o1Var2.C(atomicReference2, 15000L, "long test flag value", new l2(q2Var2, atomicReference2, 2))).longValue());
            return;
        }
        if (i3 == 2) {
            p4 p4Var3 = this.f3062d.f8940w;
            q1.j(p4Var3);
            q2 q2Var3 = this.f3062d.A;
            q1.k(q2Var3);
            AtomicReference atomicReference3 = new AtomicReference();
            o1 o1Var3 = ((q1) q2Var3.f1478d).f8938u;
            q1.l(o1Var3);
            double doubleValue = ((Double) o1Var3.C(atomicReference3, 15000L, "double test flag value", new l2(q2Var3, atomicReference3, 4))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                f6Var.j(bundle);
                return;
            } catch (RemoteException e2) {
                v0 v0Var = ((q1) p4Var3.f1478d).f8937t;
                q1.l(v0Var);
                v0Var.f9053w.b(e2, "Error returning double value to wrapper");
                return;
            }
        }
        if (i3 == 3) {
            p4 p4Var4 = this.f3062d.f8940w;
            q1.j(p4Var4);
            q2 q2Var4 = this.f3062d.A;
            q1.k(q2Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            o1 o1Var4 = ((q1) q2Var4.f1478d).f8938u;
            q1.l(o1Var4);
            p4Var4.h0(f6Var, ((Integer) o1Var4.C(atomicReference4, 15000L, "int test flag value", new l2(q2Var4, atomicReference4, 3))).intValue());
            return;
        }
        if (i3 != 4) {
            return;
        }
        p4 p4Var5 = this.f3062d.f8940w;
        q1.j(p4Var5);
        q2 q2Var5 = this.f3062d.A;
        q1.k(q2Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        o1 o1Var5 = ((q1) q2Var5.f1478d).f8938u;
        q1.l(o1Var5);
        p4Var5.j0(f6Var, ((Boolean) o1Var5.C(atomicReference5, 15000L, "boolean test flag value", new l2(q2Var5, atomicReference5, 0))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void getUserProperties(String str, String str2, boolean z10, f6 f6Var) {
        D();
        o1 o1Var = this.f3062d.f8938u;
        q1.l(o1Var);
        o1Var.B(new i2(this, f6Var, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void initForTests(Map map) {
        D();
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void initialize(a aVar, n6 n6Var, long j) {
        q1 q1Var = this.f3062d;
        if (q1Var == null) {
            Context context = (Context) b.F(aVar);
            c0.g(context);
            this.f3062d = q1.r(context, n6Var, Long.valueOf(j), null);
        } else {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9053w.a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void initializeWithElapsedTime(a aVar, n6 n6Var, long j, long j3) {
        q1 q1Var = this.f3062d;
        if (q1Var == null) {
            Context context = (Context) b.F(aVar);
            c0.g(context);
            this.f3062d = q1.r(context, n6Var, Long.valueOf(j), Long.valueOf(j3));
        } else {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9053w.a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void isDataCollectionEnabled(f6 f6Var) {
        D();
        o1 o1Var = this.f3062d.f8938u;
        q1.l(o1Var);
        o1Var.B(new p1(this, f6Var, 1));
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j) {
        D();
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        q2Var.x(str, str2, bundle, z10, z11, j, 0L);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void logEventAndBundle(String str, String str2, Bundle bundle, f6 f6Var, long j) {
        D();
        c0.d(str2);
        String str3 = true != this.f3062d.f8935r.D(null, e0.f8622f1) ? "app" : "auto";
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", str3);
        u uVar = new u(str2, new s7.t(bundle), str3, j, 0L);
        o1 o1Var = this.f3062d.f8938u;
        q1.l(o1Var);
        o1Var.B(new t(this, f6Var, uVar, str, 4));
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j, long j3) {
        D();
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        q2Var.x(str, str2, bundle, z10, z11, j, j3);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void logHealthData(int i3, String str, a aVar, a aVar2, a aVar3) {
        D();
        Object F = aVar == null ? null : b.F(aVar);
        Object F2 = aVar2 == null ? null : b.F(aVar2);
        Object F3 = aVar3 != null ? b.F(aVar3) : null;
        v0 v0Var = this.f3062d.f8937t;
        q1.l(v0Var);
        v0Var.B(i3, true, false, str, F, F2, F3);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void onActivityCreated(a aVar, Bundle bundle, long j) {
        D();
        Activity activity = (Activity) b.F(aVar);
        c0.g(activity);
        onActivityCreatedByScionActivityInfo(p6.b(activity), bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void onActivityCreatedByScionActivityInfo(p6 p6Var, Bundle bundle, long j) {
        D();
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        k kVar = q2Var.f8944i;
        if (kVar != null) {
            q2 q2Var2 = this.f3062d.A;
            q1.k(q2Var2);
            q2Var2.L();
            kVar.j(p6Var, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void onActivityDestroyed(a aVar, long j) {
        D();
        Activity activity = (Activity) b.F(aVar);
        c0.g(activity);
        onActivityDestroyedByScionActivityInfo(p6.b(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void onActivityDestroyedByScionActivityInfo(p6 p6Var, long j) {
        D();
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        k kVar = q2Var.f8944i;
        if (kVar != null) {
            q2 q2Var2 = this.f3062d.A;
            q1.k(q2Var2);
            q2Var2.L();
            kVar.k(p6Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void onActivityPaused(a aVar, long j) {
        D();
        Activity activity = (Activity) b.F(aVar);
        c0.g(activity);
        onActivityPausedByScionActivityInfo(p6.b(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void onActivityPausedByScionActivityInfo(p6 p6Var, long j) {
        D();
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        k kVar = q2Var.f8944i;
        if (kVar != null) {
            q2 q2Var2 = this.f3062d.A;
            q1.k(q2Var2);
            q2Var2.L();
            kVar.l(p6Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void onActivityResumed(a aVar, long j) {
        D();
        Activity activity = (Activity) b.F(aVar);
        c0.g(activity);
        onActivityResumedByScionActivityInfo(p6.b(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void onActivityResumedByScionActivityInfo(p6 p6Var, long j) {
        D();
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        k kVar = q2Var.f8944i;
        if (kVar != null) {
            q2 q2Var2 = this.f3062d.A;
            q1.k(q2Var2);
            q2Var2.L();
            kVar.m(p6Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void onActivitySaveInstanceState(a aVar, f6 f6Var, long j) {
        D();
        Activity activity = (Activity) b.F(aVar);
        c0.g(activity);
        onActivitySaveInstanceStateByScionActivityInfo(p6.b(activity), f6Var, j);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void onActivitySaveInstanceStateByScionActivityInfo(p6 p6Var, f6 f6Var, long j) {
        D();
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        k kVar = q2Var.f8944i;
        Bundle bundle = new Bundle();
        if (kVar != null) {
            q2 q2Var2 = this.f3062d.A;
            q1.k(q2Var2);
            q2Var2.L();
            kVar.n(p6Var, bundle);
        }
        try {
            f6Var.j(bundle);
        } catch (RemoteException e2) {
            v0 v0Var = this.f3062d.f8937t;
            q1.l(v0Var);
            v0Var.f9053w.b(e2, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void onActivityStarted(a aVar, long j) {
        D();
        Activity activity = (Activity) b.F(aVar);
        c0.g(activity);
        onActivityStartedByScionActivityInfo(p6.b(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void onActivityStartedByScionActivityInfo(p6 p6Var, long j) {
        D();
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        if (q2Var.f8944i != null) {
            q2 q2Var2 = this.f3062d.A;
            q1.k(q2Var2);
            q2Var2.L();
        }
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void onActivityStopped(a aVar, long j) {
        D();
        Activity activity = (Activity) b.F(aVar);
        c0.g(activity);
        onActivityStoppedByScionActivityInfo(p6.b(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void onActivityStoppedByScionActivityInfo(p6 p6Var, long j) {
        D();
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        if (q2Var.f8944i != null) {
            q2 q2Var2 = this.f3062d.A;
            q1.k(q2Var2);
            q2Var2.L();
        }
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void performAction(Bundle bundle, f6 f6Var, long j) {
        D();
        f6Var.j(null);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void registerOnMeasurementEventListener(j6 j6Var) {
        q4 q4Var;
        D();
        e eVar = this.f3063e;
        synchronized (eVar) {
            try {
                i6 i6Var = (i6) j6Var;
                Parcel E = i6Var.E(i6Var.F(), 2);
                int readInt = E.readInt();
                E.recycle();
                q4Var = (q4) eVar.get(Integer.valueOf(readInt));
                if (q4Var == null) {
                    q4Var = new q4(this, i6Var);
                    Parcel E2 = i6Var.E(i6Var.F(), 2);
                    int readInt2 = E2.readInt();
                    E2.recycle();
                    eVar.put(Integer.valueOf(readInt2), q4Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        q2Var.t();
        if (q2Var.f8946s.add(q4Var)) {
            return;
        }
        v0 v0Var = ((q1) q2Var.f1478d).f8937t;
        q1.l(v0Var);
        v0Var.f9053w.a("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.d6
    @Deprecated
    public void resetAnalyticsData(long j) {
        D();
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        q2Var.f8948u.set(null);
        o1 o1Var = ((q1) q2Var.f1478d).f8938u;
        q1.l(o1Var);
        o1Var.B(new j2(q2Var, j, 1));
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void resetAnalyticsDataWithElapsedTime(long j, long j3) {
        D();
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        q2Var.f8948u.set(null);
        o1 o1Var = ((q1) q2Var.f1478d).f8938u;
        q1.l(o1Var);
        o1Var.B(new j2(q2Var, j, 1));
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void retrieveAndUploadBatches(h6 h6Var) {
        w2 w2Var;
        D();
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        q2Var.t();
        q1 q1Var = (q1) q2Var.f1478d;
        o1 o1Var = q1Var.f8938u;
        q1.l(o1Var);
        if (o1Var.y()) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9050t.a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        o1 o1Var2 = q1Var.f8938u;
        q1.l(o1Var2);
        if (Thread.currentThread() == o1Var2.f8897r) {
            v0 v0Var2 = q1Var.f8937t;
            q1.l(v0Var2);
            v0Var2.f9050t.a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        boolean l10 = c.l();
        v0 v0Var3 = q1Var.f8937t;
        if (l10) {
            q1.l(v0Var3);
            v0Var3.f9050t.a("Cannot retrieve and upload batches from main thread");
            return;
        }
        q1.l(v0Var3);
        v0Var3.B.a("[sgtm] Started client-side batch upload work.");
        boolean z10 = false;
        int i3 = 0;
        int i10 = 0;
        while (!z10) {
            v0 v0Var4 = q1Var.f8937t;
            q1.l(v0Var4);
            v0Var4.B.a("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            o1 o1Var3 = q1Var.f8938u;
            q1.l(o1Var3);
            o1Var3.C(atomicReference, 10000L, "[sgtm] Getting upload batches", new l2(q2Var, atomicReference, 6, false));
            c4 c4Var = (c4) atomicReference.get();
            if (c4Var == null) {
                break;
            }
            List list = c4Var.f8565d;
            if (list.isEmpty()) {
                break;
            }
            v0 v0Var5 = q1Var.f8937t;
            q1.l(v0Var5);
            v0Var5.B.b(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            i3 += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                a4 a4Var = (a4) it.next();
                try {
                    URL url = new URI(a4Var.f8506i).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    m0 q3 = ((q1) q2Var.f1478d).q();
                    q3.t();
                    c0.g(q3.f8835u);
                    String str = q3.f8835u;
                    q1 q1Var2 = (q1) q2Var.f1478d;
                    v0 v0Var6 = q1Var2.f8937t;
                    q1.l(v0Var6);
                    t0 t0Var = v0Var6.B;
                    Long valueOf = Long.valueOf(a4Var.f8504d);
                    t0Var.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", valueOf, a4Var.f8506i, Integer.valueOf(a4Var.f8505e.length));
                    if (!TextUtils.isEmpty(a4Var.f8510u)) {
                        v0 v0Var7 = q1Var2.f8937t;
                        q1.l(v0Var7);
                        v0Var7.B.c(valueOf, a4Var.f8510u, "[sgtm] Uploading data from app. row_id");
                    }
                    HashMap hashMap = new HashMap();
                    Bundle bundle = a4Var.f8507r;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(str2, string);
                        }
                    }
                    u2 u2Var = q1Var2.C;
                    q1.l(u2Var);
                    byte[] bArr = a4Var.f8505e;
                    p.e eVar = new p.e(q2Var, atomicReference2, a4Var, 7);
                    u2Var.u();
                    c0.g(url);
                    c0.g(bArr);
                    o1 o1Var4 = ((q1) u2Var.f1478d).f8938u;
                    q1.l(o1Var4);
                    o1Var4.E(new y0(u2Var, str, url, bArr, hashMap, eVar));
                    try {
                        p4 p4Var = q1Var2.f8940w;
                        q1.j(p4Var);
                        q1 q1Var3 = (q1) p4Var.f1478d;
                        q1Var3.f8942y.getClass();
                        long currentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long j = 60000; atomicReference2.get() == null && j > 0; j = currentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(j);
                                    q1Var3.f8942y.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        v0 v0Var8 = ((q1) q2Var.f1478d).f8937t;
                        q1.l(v0Var8);
                        v0Var8.f9053w.a("[sgtm] Interrupted waiting for uploading batch");
                    }
                    w2Var = atomicReference2.get() == null ? w2.UNKNOWN : (w2) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e2) {
                    v0 v0Var9 = ((q1) q2Var.f1478d).f8937t;
                    q1.l(v0Var9);
                    v0Var9.f9050t.d("[sgtm] Bad upload url for row_id", a4Var.f8506i, Long.valueOf(a4Var.f8504d), e2);
                    w2Var = w2.FAILURE;
                }
                if (w2Var != w2.SUCCESS) {
                    if (w2Var == w2.BACKOFF) {
                        z10 = true;
                        break;
                    }
                } else {
                    i10++;
                }
            }
        }
        v0 v0Var10 = q1Var.f8937t;
        q1.l(v0Var10);
        v0Var10.B.c(Integer.valueOf(i3), Integer.valueOf(i10), "[sgtm] Completed client-side batch upload work. total, success");
        try {
            h6Var.b();
        } catch (RemoteException e9) {
            q1 q1Var4 = this.f3062d;
            c0.g(q1Var4);
            v0 v0Var11 = q1Var4.f8937t;
            q1.l(v0Var11);
            v0Var11.f9053w.b(e9, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void setConditionalUserProperty(Bundle bundle, long j) {
        D();
        q1 q1Var = this.f3062d;
        if (bundle == null) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9050t.a("Conditional user property must not be null");
        } else {
            q2 q2Var = q1Var.A;
            q1.k(q2Var);
            q2Var.F(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void setConsentThirdParty(Bundle bundle, long j) {
        D();
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        q2Var.M(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void setCurrentScreen(a aVar, String str, String str2, long j) {
        D();
        Activity activity = (Activity) b.F(aVar);
        c0.g(activity);
        setCurrentScreenByScionActivityInfo(p6.b(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if (r3 > 500) goto L27;
     */
    @Override // com.google.android.gms.internal.measurement.d6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setCurrentScreenByScionActivityInfo(p6 p6Var, String str, String str2, long j) {
        D();
        b3 b3Var = this.f3062d.f8943z;
        q1.k(b3Var);
        q1 q1Var = (q1) b3Var.f1478d;
        if (!q1Var.f8935r.H()) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9055y.a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        y2 y2Var = b3Var.f8522i;
        if (y2Var == null) {
            v0 v0Var2 = q1Var.f8937t;
            q1.l(v0Var2);
            v0Var2.f9055y.a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        ConcurrentHashMap concurrentHashMap = b3Var.f8525t;
        Integer valueOf = Integer.valueOf(p6Var.f2667d);
        if (concurrentHashMap.get(valueOf) == null) {
            v0 v0Var3 = q1Var.f8937t;
            q1.l(v0Var3);
            v0Var3.f9055y.a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = b3Var.x(p6Var.f2668e);
        }
        String str3 = y2Var.f9127b;
        String str4 = y2Var.f9126a;
        boolean equals = Objects.equals(str3, str2);
        boolean equals2 = Objects.equals(str4, str);
        if (equals && equals2) {
            v0 v0Var4 = q1Var.f8937t;
            q1.l(v0Var4);
            v0Var4.f9055y.a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null) {
            if (str.length() > 0) {
                int length = str.length();
                q1Var.f8935r.getClass();
            }
            v0 v0Var5 = q1Var.f8937t;
            q1.l(v0Var5);
            v0Var5.f9055y.b(Integer.valueOf(str.length()), "Invalid screen name length in setCurrentScreen. Length");
            return;
        }
        if (str2.length() > 0) {
            int length2 = str2.length();
            q1Var.f8935r.getClass();
            if (length2 <= 500) {
                v0 v0Var6 = q1Var.f8937t;
                q1.l(v0Var6);
                v0Var6.B.c(str == null ? "null" : str, str2, "Setting current screen to name, class");
                p4 p4Var = q1Var.f8940w;
                q1.j(p4Var);
                y2 y2Var2 = new y2(str, str2, p4Var.q0());
                concurrentHashMap.put(valueOf, y2Var2);
                b3Var.A(p6Var.f2668e, y2Var2, true);
                return;
            }
        }
        v0 v0Var7 = q1Var.f8937t;
        q1.l(v0Var7);
        v0Var7.f9055y.b(Integer.valueOf(str2.length()), "Invalid class name length in setCurrentScreen. Length");
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void setDataCollectionEnabled(boolean z10) {
        D();
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        q2Var.t();
        o1 o1Var = ((q1) q2Var.f1478d).f8938u;
        q1.l(o1Var);
        o1Var.B(new h2(q2Var, z10));
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void setDefaultEventParameters(Bundle bundle) {
        D();
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        o1 o1Var = ((q1) q2Var.f1478d).f8938u;
        q1.l(o1Var);
        o1Var.B(new m2(q2Var, bundle2, 2));
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void setEventInterceptor(j6 j6Var) {
        D();
        s sVar = new s();
        sVar.f1869e = this;
        sVar.f1868d = j6Var;
        o1 o1Var = this.f3062d.f8938u;
        q1.l(o1Var);
        boolean y3 = o1Var.y();
        q1 q1Var = this.f3062d;
        if (!y3) {
            o1 o1Var2 = q1Var.f8938u;
            q1.l(o1Var2);
            o1Var2.B(new j0(21, this, sVar, false));
            return;
        }
        q2 q2Var = q1Var.A;
        q1.k(q2Var);
        q2Var.s();
        q2Var.t();
        s sVar2 = q2Var.f8945r;
        if (sVar != sVar2) {
            c0.i("EventInterceptor already set.", sVar2 == null);
        }
        q2Var.f8945r = sVar;
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void setInstanceIdProvider(m6 m6Var) {
        D();
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void setMeasurementEnabled(boolean z10, long j) {
        D();
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        Boolean valueOf = Boolean.valueOf(z10);
        q2Var.t();
        o1 o1Var = ((q1) q2Var.f1478d).f8938u;
        q1.l(o1Var);
        o1Var.B(new j0(19, q2Var, valueOf, false));
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void setMinimumSessionDuration(long j) {
        D();
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void setSessionTimeoutDuration(long j) {
        D();
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        o1 o1Var = ((q1) q2Var.f1478d).f8938u;
        q1.l(o1Var);
        o1Var.B(new j2(q2Var, j, 0));
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void setSgtmDebugInfo(Intent intent) {
        D();
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        q1 q1Var = (q1) q2Var.f1478d;
        Uri data = intent.getData();
        if (data == null) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9056z.a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            v0 v0Var2 = q1Var.f8937t;
            q1.l(v0Var2);
            v0Var2.f9056z.a("[sgtm] Preview Mode was not enabled.");
            q1Var.f8935r.f8700i = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        v0 v0Var3 = q1Var.f8937t;
        q1.l(v0Var3);
        v0Var3.f9056z.b(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        q1Var.f8935r.f8700i = queryParameter2;
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void setUserId(String str, long j) {
        D();
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        q1 q1Var = (q1) q2Var.f1478d;
        if (str != null && TextUtils.isEmpty(str)) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9053w.a("User ID must be non-empty or null");
        } else {
            o1 o1Var = q1Var.f8938u;
            q1.l(o1Var);
            o1Var.B(new j0(23, q2Var, str));
            q2Var.C(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void setUserProperty(String str, String str2, a aVar, boolean z10, long j) {
        D();
        Object F = b.F(aVar);
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        q2Var.C(str, str2, F, z10, j);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void unregisterOnMeasurementEventListener(j6 j6Var) {
        i6 i6Var;
        q4 q4Var;
        D();
        e eVar = this.f3063e;
        synchronized (eVar) {
            i6Var = (i6) j6Var;
            Parcel E = i6Var.E(i6Var.F(), 2);
            int readInt = E.readInt();
            E.recycle();
            q4Var = (q4) eVar.remove(Integer.valueOf(readInt));
        }
        if (q4Var == null) {
            q4Var = new q4(this, i6Var);
        }
        q2 q2Var = this.f3062d.A;
        q1.k(q2Var);
        q2Var.t();
        if (q2Var.f8946s.remove(q4Var)) {
            return;
        }
        v0 v0Var = ((q1) q2Var.f1478d).f8937t;
        q1.l(v0Var);
        v0Var.f9053w.a("OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public void setConsent(Bundle bundle, long j) {
    }
}
