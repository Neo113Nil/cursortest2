package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gbn extends agd {
    public final Executor a;
    public final Set c;
    private final Context f;
    public final gbh b = new gbh("FuturesMixinRF");
    public boolean e = false;
    public final int d = Process.myPid();

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gbn(afr afrVar, Context context, Executor executor) {
        gzp gzpVar;
        int intValue;
        Throwable illegalStateException;
        ActivityManager activityManager;
        List historicalProcessExitReasons;
        int reason;
        this.a = executor;
        this.f = context;
        Bundle bundle = (Bundle) afrVar.b("future_saved_state");
        if (bundle != null) {
            int i = bundle.getInt("last_process_id");
            if (Build.VERSION.SDK_INT >= 30 && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
                historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(context.getPackageName(), i, 1);
                if (!historicalProcessExitReasons.isEmpty()) {
                    reason = it$$ExternalSyntheticApiModelOutline0.m(historicalProcessExitReasons.get(0)).getReason();
                    gzpVar = gzp.h(Integer.valueOf(reason));
                    Parcelable[] parcelableArray = bundle.getParcelableArray("future_wrappers");
                    this.c = new HashSet(parcelableArray.length);
                    for (Parcelable parcelable : parcelableArray) {
                        gbp gbpVar = (gbp) parcelable;
                        if (gbpVar.c.f() && (intValue = ((Integer) gbpVar.c.b()).intValue()) != 1) {
                            if (intValue == 2) {
                                StringBuilder sb = new StringBuilder("ParcelableFuture was Parceled by a lifecycle change before it completed.");
                                if (gzpVar.f()) {
                                    sb.append(" process exit reason code: ");
                                    sb.append(gzpVar.b());
                                }
                                illegalStateException = new gbq(sb.toString(), gzpVar);
                            } else {
                                illegalStateException = new IllegalStateException(a.Y(intValue, "ParcelableFuture read in unexpected value for hasResult: "));
                            }
                            gbpVar.b(illegalStateException);
                        }
                        this.c.add(gbpVar);
                    }
                }
            }
            gzpVar = gyf.a;
            Parcelable[] parcelableArray2 = bundle.getParcelableArray("future_wrappers");
            this.c = new HashSet(parcelableArray2.length);
            while (r0 < r5) {
            }
        } else {
            this.c = new HashSet(1);
        }
        this.b.e(bundle);
        afrVar.c("future_saved_state", new bn(this, 8));
    }

    public static void a(gbj gbjVar, gbp gbpVar) {
        gty aB = hoq.aB(124, "onPending FuturesMixin", gub.a, true);
        try {
            gaw a = gax.a();
            try {
                Object obj = gbpVar.d;
                gbjVar.c();
                a.close();
                aB.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                aB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    final void b(hvi hviVar, Object obj, gbj gbjVar) {
        fao.c();
        hoq.ay();
        gbp gbpVar = new gbp(this.b.a(gbjVar), obj, hviVar);
        this.c.add(gbpVar);
        if (this.e) {
            gbpVar.c(this);
            if (hviVar.isDone()) {
                return;
            }
            a(gbjVar, gbpVar);
        }
    }

    public final void d(gbj gbjVar) {
        this.b.d(gbjVar);
    }
}
