package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ul1 implements Runnable {
    public final /* synthetic */ ne0 d;
    public final /* synthetic */ cc e;
    public final /* synthetic */ int g;
    public final /* synthetic */ Runnable h;

    public /* synthetic */ ul1(ne0 ne0Var, cc ccVar, int i, Runnable runnable) {
        this.d = ne0Var;
        this.e = ccVar;
        this.g = i;
        this.h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final cc ccVar = this.e;
        final int i = this.g;
        Runnable runnable = this.h;
        final ne0 ne0Var = this.d;
        b51 b51Var = (b51) ne0Var.f;
        try {
            try {
                b51 b51Var2 = (b51) ne0Var.c;
                Objects.requireNonNull(b51Var2);
                b51Var.f(new vl1(b51Var2, 1));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) ne0Var.a).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    b51Var.f(new bg1() { // from class: wl1
                        @Override // defpackage.bg1
                        public final Object b() {
                            ((i8) ne0.this.d).o(ccVar, i + 1, false);
                            return null;
                        }
                    });
                } else {
                    ne0Var.b(ccVar, i);
                }
                runnable.run();
            } catch (ag1 unused) {
                ((i8) ne0Var.d).o(ccVar, i + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
