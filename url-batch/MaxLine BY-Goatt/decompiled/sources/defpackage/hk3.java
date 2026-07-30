package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class hk3 implements Runnable {
    public final /* synthetic */ int m = 2;
    public final /* synthetic */ String n;
    public final /* synthetic */ cs3 o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ hk3(mk3 mk3Var, cs3 cs3Var, Bundle bundle, bh3 bh3Var, String str) {
        this.p = mk3Var;
        this.o = cs3Var;
        this.q = bundle;
        this.r = bh3Var;
        this.n = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        jo3 jo3Var;
        yg3 yg3Var;
        zq3 zq3Var;
        yg3 yg3Var2;
        switch (this.m) {
            case 0:
                mk3 mk3Var = (mk3) this.p;
                cs3 cs3Var = this.o;
                Bundle bundle = (Bundle) this.q;
                bh3 bh3Var = (bh3) this.r;
                String str = this.n;
                oq3 oq3Var = mk3Var.g;
                oq3Var.B();
                try {
                    bh3Var.x(oq3Var.d0(bundle, cs3Var));
                    return;
                } catch (RemoteException e) {
                    oq3Var.a().r.d(str, e, "Failed to return trigger URIs for app");
                    return;
                }
            case 1:
                AtomicReference atomicReference2 = (AtomicReference) this.p;
                synchronized (atomicReference2) {
                    try {
                        try {
                            jo3Var = (jo3) this.r;
                            yg3Var = jo3Var.p;
                        } catch (RemoteException e2) {
                            vh3 vh3Var = ((pj3) ((jo3) this.r).m).r;
                            pj3.m(vh3Var);
                            vh3Var.r.e("(legacy) Failed to get conditional properties; remote exception", null, this.n, e2);
                            ((AtomicReference) this.p).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.p;
                        }
                        if (yg3Var == null) {
                            vh3 vh3Var2 = ((pj3) jo3Var.m).r;
                            pj3.m(vh3Var2);
                            vh3Var2.r.e("(legacy) Failed to get conditional properties; not connected to service", null, this.n, (String) this.q);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(yg3Var.w(this.n, (String) this.q, this.o));
                        } else {
                            atomicReference2.set(yg3Var.t(null, this.n, (String) this.q));
                        }
                        jo3Var.J();
                        atomicReference = (AtomicReference) this.p;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th) {
                        ((AtomicReference) this.p).notify();
                        throw th;
                    }
                }
            default:
                je3 je3Var = (je3) this.q;
                String str2 = (String) this.p;
                String str3 = this.n;
                jo3 jo3Var2 = (jo3) this.r;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        yg3Var2 = jo3Var2.p;
                    } catch (Throwable th2) {
                        zq3 zq3Var2 = ((pj3) jo3Var2.m).u;
                        pj3.k(zq3Var2);
                        zq3Var2.l0(je3Var, arrayList);
                        throw th2;
                    }
                } catch (RemoteException e3) {
                    vh3 vh3Var3 = ((pj3) jo3Var2.m).r;
                    pj3.m(vh3Var3);
                    vh3Var3.r.e("Failed to get conditional properties; remote exception", str3, str2, e3);
                }
                if (yg3Var2 != null) {
                    arrayList = zq3.m0(yg3Var2.w(str3, str2, this.o));
                    jo3Var2.J();
                    zq3Var = ((pj3) jo3Var2.m).u;
                    pj3.k(zq3Var);
                    zq3Var.l0(je3Var, arrayList);
                    return;
                }
                pj3 pj3Var = (pj3) jo3Var2.m;
                vh3 vh3Var4 = pj3Var.r;
                pj3.m(vh3Var4);
                vh3Var4.r.d(str3, str2, "Failed to get conditional properties; not connected to service");
                zq3Var = pj3Var.u;
                pj3.k(zq3Var);
                zq3Var.l0(je3Var, arrayList);
                return;
        }
    }

    public hk3(jo3 jo3Var, String str, String str2, cs3 cs3Var, je3 je3Var) {
        this.n = str;
        this.p = str2;
        this.o = cs3Var;
        this.q = je3Var;
        this.r = jo3Var;
    }

    public hk3(jo3 jo3Var, AtomicReference atomicReference, String str, String str2, cs3 cs3Var) {
        this.p = atomicReference;
        this.n = str;
        this.q = str2;
        this.o = cs3Var;
        this.r = jo3Var;
    }
}
