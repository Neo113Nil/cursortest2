package d6;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.f6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import s7.h0;
import s7.j0;
import s7.j4;
import s7.l3;
import s7.p4;
import s7.q1;
import s7.r4;
import s7.v0;
import s7.w1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3662e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3663i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f3664r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f3665s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3666t;

    public /* synthetic */ r(w1 w1Var, r4 r4Var, Bundle bundle, j0 j0Var, String str) {
        this.f3661d = 1;
        this.f3662e = w1Var;
        this.f3663i = r4Var;
        this.f3664r = bundle;
        this.f3665s = j0Var;
        this.f3666t = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        l3 l3Var;
        h0 h0Var;
        p4 p4Var;
        h0 h0Var2;
        switch (this.f3661d) {
            case 0:
                try {
                    if (!(((e6.j) this.f3662e).f3948d instanceof e6.a)) {
                        String uuid = ((UUID) this.f3663i).toString();
                        c6.p k10 = ((s) this.f3666t).f3669c.k(uuid);
                        if (k10 == null || n0.l.a(k10.f1840b)) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((s) this.f3666t).f3668b.g(uuid, (t5.g) this.f3664r);
                        ((Context) this.f3665s).startService(b6.a.a((Context) this.f3665s, g8.b.A(k10), (t5.g) this.f3664r));
                    }
                    ((e6.j) this.f3662e).i(null);
                    return;
                } catch (Throwable th) {
                    ((e6.j) this.f3662e).j(th);
                    return;
                }
            case 1:
                w1 w1Var = (w1) this.f3662e;
                r4 r4Var = (r4) this.f3663i;
                Bundle bundle = (Bundle) this.f3664r;
                j0 j0Var = (j0) this.f3665s;
                String str = (String) this.f3666t;
                j4 j4Var = w1Var.f9082d;
                j4Var.V();
                try {
                    j0Var.t(j4Var.d0(bundle, r4Var));
                    return;
                } catch (RemoteException e2) {
                    j4Var.b().f9050t.c(str, e2, "Failed to return trigger URIs for app");
                    return;
                }
            case 2:
                AtomicReference atomicReference2 = (AtomicReference) this.f3662e;
                synchronized (atomicReference2) {
                    try {
                        try {
                            l3Var = (l3) this.f3666t;
                            h0Var = l3Var.f8813r;
                        } catch (RemoteException e9) {
                            v0 v0Var = ((q1) ((l3) this.f3666t).f1478d).f8937t;
                            q1.l(v0Var);
                            v0Var.f9050t.d("(legacy) Failed to get conditional properties; remote exception", null, (String) this.f3663i, e9);
                            ((AtomicReference) this.f3662e).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f3662e;
                        }
                        if (h0Var == null) {
                            v0 v0Var2 = ((q1) l3Var.f1478d).f8937t;
                            q1.l(v0Var2);
                            v0Var2.f9050t.d("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.f3663i, (String) this.f3664r);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(h0Var.n((String) this.f3663i, (String) this.f3664r, (r4) this.f3665s));
                        } else {
                            atomicReference2.set(h0Var.r(null, (String) this.f3663i, (String) this.f3664r));
                        }
                        l3Var.F();
                        atomicReference = (AtomicReference) this.f3662e;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th2) {
                        ((AtomicReference) this.f3662e).notify();
                        throw th2;
                    }
                }
            default:
                f6 f6Var = (f6) this.f3665s;
                String str2 = (String) this.f3663i;
                String str3 = (String) this.f3662e;
                l3 l3Var2 = (l3) this.f3666t;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        h0Var2 = l3Var2.f8813r;
                    } catch (RemoteException e10) {
                        v0 v0Var3 = ((q1) l3Var2.f1478d).f8937t;
                        q1.l(v0Var3);
                        v0Var3.f9050t.d("Failed to get conditional properties; remote exception", str3, str2, e10);
                    }
                    if (h0Var2 != null) {
                        arrayList = p4.m0(h0Var2.n(str3, str2, (r4) this.f3664r));
                        l3Var2.F();
                        p4Var = ((q1) l3Var2.f1478d).f8940w;
                        q1.j(p4Var);
                        p4Var.l0(f6Var, arrayList);
                        return;
                    }
                    q1 q1Var = (q1) l3Var2.f1478d;
                    v0 v0Var4 = q1Var.f8937t;
                    q1.l(v0Var4);
                    v0Var4.f9050t.c(str3, str2, "Failed to get conditional properties; not connected to service");
                    p4Var = q1Var.f8940w;
                    q1.j(p4Var);
                    p4Var.l0(f6Var, arrayList);
                    return;
                } catch (Throwable th3) {
                    p4 p4Var2 = ((q1) l3Var2.f1478d).f8940w;
                    q1.j(p4Var2);
                    p4Var2.l0(f6Var, arrayList);
                    throw th3;
                }
        }
    }

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i3) {
        this.f3661d = i3;
        this.f3666t = obj;
        this.f3662e = obj2;
        this.f3663i = obj3;
        this.f3664r = obj4;
        this.f3665s = obj5;
    }
}
