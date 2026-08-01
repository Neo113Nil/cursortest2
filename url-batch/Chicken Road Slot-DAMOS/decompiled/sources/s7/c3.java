package s7;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.f6;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c3 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8558d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f8559e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f8560i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r4 f8561r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f8562s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l3 f8563t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f8564u;

    public c3(l3 l3Var, String str, String str2, r4 r4Var, boolean z10, f6 f6Var) {
        this.f8559e = str;
        this.f8560i = str2;
        this.f8561r = r4Var;
        this.f8562s = z10;
        this.f8564u = f6Var;
        this.f8563t = l3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p4 p4Var;
        h0 h0Var;
        q1 q1Var;
        AtomicReference atomicReference;
        l3 l3Var;
        h0 h0Var2;
        switch (this.f8558d) {
            case 0:
                String str = this.f8560i;
                String str2 = this.f8559e;
                f6 f6Var = (f6) this.f8564u;
                l3 l3Var2 = this.f8563t;
                Bundle bundle = new Bundle();
                try {
                    try {
                        h0Var = l3Var2.f8813r;
                        q1Var = (q1) l3Var2.f1478d;
                    } catch (RemoteException e2) {
                        e = e2;
                    }
                    if (h0Var == null) {
                        v0 v0Var = q1Var.f8937t;
                        q1.l(v0Var);
                        v0Var.f9050t.c(str2, str, "Failed to get user properties; not connected to service");
                        p4Var = q1Var.f8940w;
                        q1.j(p4Var);
                        p4Var.k0(f6Var, bundle);
                        return;
                    }
                    List<m4> h10 = h0Var.h(str2, str, this.f8562s, this.f8561r);
                    Bundle bundle2 = new Bundle();
                    if (h10 != null) {
                        for (m4 m4Var : h10) {
                            String str3 = m4Var.f8855s;
                            String str4 = m4Var.f8852e;
                            if (str3 != null) {
                                bundle2.putString(str4, str3);
                            } else {
                                Long l10 = m4Var.f8854r;
                                if (l10 != null) {
                                    bundle2.putLong(str4, l10.longValue());
                                } else {
                                    Double d10 = m4Var.f8857u;
                                    if (d10 != null) {
                                        bundle2.putDouble(str4, d10.doubleValue());
                                    }
                                }
                            }
                        }
                    }
                    try {
                        l3Var2.F();
                        p4 p4Var2 = q1Var.f8940w;
                        q1.j(p4Var2);
                        p4Var2.k0(f6Var, bundle2);
                        return;
                    } catch (RemoteException e9) {
                        e = e9;
                        bundle = bundle2;
                        v0 v0Var2 = ((q1) l3Var2.f1478d).f8937t;
                        q1.l(v0Var2);
                        v0Var2.f9050t.c(str2, e, "Failed to get user properties; remote exception");
                        p4Var = ((q1) l3Var2.f1478d).f8940w;
                        q1.j(p4Var);
                        p4Var.k0(f6Var, bundle);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        bundle = bundle2;
                        p4 p4Var3 = ((q1) l3Var2.f1478d).f8940w;
                        q1.j(p4Var3);
                        p4Var3.k0(f6Var, bundle);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.f8564u;
                synchronized (atomicReference2) {
                    try {
                        try {
                            l3Var = this.f8563t;
                            h0Var2 = l3Var.f8813r;
                        } catch (RemoteException e10) {
                            v0 v0Var3 = ((q1) this.f8563t.f1478d).f8937t;
                            q1.l(v0Var3);
                            v0Var3.f9050t.d("(legacy) Failed to get user properties; remote exception", null, this.f8559e, e10);
                            ((AtomicReference) this.f8564u).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f8564u;
                        }
                        if (h0Var2 == null) {
                            v0 v0Var4 = ((q1) l3Var.f1478d).f8937t;
                            q1.l(v0Var4);
                            v0Var4.f9050t.d("(legacy) Failed to get user properties; not connected to service", null, this.f8559e, this.f8560i);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(h0Var2.h(this.f8559e, this.f8560i, this.f8562s, this.f8561r));
                        } else {
                            atomicReference2.set(h0Var2.c(null, this.f8559e, this.f8560i, this.f8562s));
                        }
                        l3Var.F();
                        atomicReference = (AtomicReference) this.f8564u;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th3) {
                        ((AtomicReference) this.f8564u).notify();
                        throw th3;
                    }
                }
        }
    }

    public c3(l3 l3Var, AtomicReference atomicReference, String str, String str2, r4 r4Var, boolean z10) {
        this.f8564u = atomicReference;
        this.f8559e = str;
        this.f8560i = str2;
        this.f8561r = r4Var;
        this.f8562s = z10;
        this.f8563t = l3Var;
    }
}
