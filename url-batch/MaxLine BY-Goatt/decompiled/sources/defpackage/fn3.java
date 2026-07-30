package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fn3 implements Runnable {
    public final /* synthetic */ int m = 0;
    public final /* synthetic */ String n;
    public final /* synthetic */ String o;
    public final /* synthetic */ cs3 p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ jo3 r;
    public final /* synthetic */ Object s;

    public fn3(jo3 jo3Var, String str, String str2, cs3 cs3Var, boolean z, je3 je3Var) {
        this.n = str;
        this.o = str2;
        this.p = cs3Var;
        this.q = z;
        this.s = je3Var;
        this.r = jo3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zq3 zq3Var;
        yg3 yg3Var;
        pj3 pj3Var;
        AtomicReference atomicReference;
        jo3 jo3Var;
        yg3 yg3Var2;
        switch (this.m) {
            case 0:
                String str = this.o;
                String str2 = this.n;
                je3 je3Var = (je3) this.s;
                jo3 jo3Var2 = this.r;
                Bundle bundle = new Bundle();
                try {
                    try {
                        yg3Var = jo3Var2.p;
                        pj3Var = (pj3) jo3Var2.m;
                    } catch (RemoteException e) {
                        e = e;
                    }
                    if (yg3Var == null) {
                        vh3 vh3Var = pj3Var.r;
                        pj3.m(vh3Var);
                        vh3Var.r.d(str2, str, "Failed to get user properties; not connected to service");
                        zq3Var = pj3Var.u;
                        pj3.k(zq3Var);
                        zq3Var.k0(je3Var, bundle);
                        return;
                    }
                    List<tq3> G = yg3Var.G(str2, str, this.q, this.p);
                    Bundle bundle2 = new Bundle();
                    if (G != null) {
                        for (tq3 tq3Var : G) {
                            String str3 = tq3Var.q;
                            String str4 = tq3Var.n;
                            if (str3 != null) {
                                bundle2.putString(str4, str3);
                            } else {
                                Long l = tq3Var.p;
                                if (l != null) {
                                    bundle2.putLong(str4, l.longValue());
                                } else {
                                    Double d = tq3Var.s;
                                    if (d != null) {
                                        bundle2.putDouble(str4, d.doubleValue());
                                    }
                                }
                            }
                        }
                    }
                    try {
                        jo3Var2.J();
                        zq3 zq3Var2 = pj3Var.u;
                        pj3.k(zq3Var2);
                        zq3Var2.k0(je3Var, bundle2);
                        return;
                    } catch (RemoteException e2) {
                        e = e2;
                        bundle = bundle2;
                        vh3 vh3Var2 = ((pj3) jo3Var2.m).r;
                        pj3.m(vh3Var2);
                        vh3Var2.r.d(str2, e, "Failed to get user properties; remote exception");
                        zq3Var = ((pj3) jo3Var2.m).u;
                        pj3.k(zq3Var);
                        zq3Var.k0(je3Var, bundle);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        bundle = bundle2;
                        zq3 zq3Var3 = ((pj3) jo3Var2.m).u;
                        pj3.k(zq3Var3);
                        zq3Var3.k0(je3Var, bundle);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.s;
                synchronized (atomicReference2) {
                    try {
                        try {
                            jo3Var = this.r;
                            yg3Var2 = jo3Var.p;
                        } catch (RemoteException e3) {
                            vh3 vh3Var3 = ((pj3) this.r.m).r;
                            pj3.m(vh3Var3);
                            vh3Var3.r.e("(legacy) Failed to get user properties; remote exception", null, this.n, e3);
                            ((AtomicReference) this.s).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.s;
                        }
                        if (yg3Var2 == null) {
                            vh3 vh3Var4 = ((pj3) jo3Var.m).r;
                            pj3.m(vh3Var4);
                            vh3Var4.r.e("(legacy) Failed to get user properties; not connected to service", null, this.n, this.o);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(yg3Var2.G(this.n, this.o, this.q, this.p));
                        } else {
                            atomicReference2.set(yg3Var2.h(null, this.n, this.o, this.q));
                        }
                        jo3Var.J();
                        atomicReference = (AtomicReference) this.s;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th3) {
                        ((AtomicReference) this.s).notify();
                        throw th3;
                    }
                }
        }
    }

    public fn3(jo3 jo3Var, AtomicReference atomicReference, String str, String str2, cs3 cs3Var, boolean z) {
        this.s = atomicReference;
        this.n = str;
        this.o = str2;
        this.p = cs3Var;
        this.q = z;
        this.r = jo3Var;
    }
}
