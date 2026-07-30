package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class b33 implements Runnable {
    public final /* synthetic */ f33 m;
    public final /* synthetic */ gm n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Runnable p;

    public /* synthetic */ b33(f33 f33Var, gm gmVar, int i, Runnable runnable) {
        this.m = f33Var;
        this.n = gmVar;
        this.o = i;
        this.p = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gm gmVar = this.n;
        int i = this.o;
        Runnable runnable = this.p;
        f33 f33Var = this.m;
        tc2 tc2Var = f33Var.f;
        try {
            try {
                tc2 tc2Var2 = f33Var.c;
                Objects.requireNonNull(tc2Var2);
                tc2Var.p(new c33(tc2Var2, 1));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) f33Var.a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    tc2Var.p(new bb0(f33Var, gmVar, i));
                } else {
                    f33Var.a(gmVar, i);
                }
                runnable.run();
            } catch (bs2 unused) {
                f33Var.d.C(gmVar, i + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
