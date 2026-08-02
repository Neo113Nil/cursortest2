package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gaj {
    public static final hkh a = hkh.l("com/google/apps/tiktok/concurrent/AndroidFutures");
    public final Context b;
    public final Map c;
    public final Map d;
    private final PowerManager e;
    private final hvl f;
    private final hvm g;
    private final hvm h;
    private boolean i;
    private final fwm j;

    public gaj(Context context, PowerManager powerManager, hvl hvlVar, Map map, Map map2, hvm hvmVar, hvm hvmVar2, fwm fwmVar) {
        hoq.v(new ewf(this, 3));
        hoq.v(new ewf(this, 4));
        this.i = false;
        this.b = context;
        this.e = powerManager;
        this.f = hvlVar;
        this.g = hvmVar;
        this.h = hvmVar2;
        this.c = map;
        this.d = map2;
        this.j = fwmVar;
    }

    public static void d(int i, hvi hviVar, String str, Object... objArr) {
        hviVar.c(gvx.h(new dpi(hviVar, i, str, objArr, 4)), huf.a);
    }

    public static /* synthetic */ void f(hvi hviVar, int i, String str, Object[] objArr) {
        try {
            hnu.aR(hviVar);
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            ((hkf) ((hkf) ((hkf) a.f()).h(e.getCause())).i("B", "a", i, null)).y(str, objArr);
        }
    }

    public final String a() {
        fwm fwmVar = this.j;
        String I = eos.I();
        return fwmVar.l() ? "main_process_service_key" : I.substring(I.lastIndexOf(":") + 1);
    }

    public final void b(hvi hviVar, String str) {
        if (hviVar.isDone()) {
            return;
        }
        try {
            PowerManager.WakeLock newWakeLock = this.e.newWakeLock(1, str);
            newWakeLock.acquire();
            hvi a2 = gwd.a(hnu.aK(hviVar), 45L, TimeUnit.SECONDS, this.g);
            hut f = gvx.f(new gai(str, 0));
            huf hufVar = huf.a;
            hnu.aS(a2, f, hufVar);
            hvi aQ = hnu.aQ(hnu.aK(hviVar), 3600L, TimeUnit.SECONDS, this.h);
            newWakeLock.getClass();
            aQ.c(new fnh(newWakeLock, 14), hufVar);
        } catch (SecurityException e) {
            if (this.i) {
                return;
            }
            try {
                Context context = this.b;
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                if (packageInfo.requestedPermissions != null) {
                    for (String str2 : packageInfo.requestedPermissions) {
                        if ("android.permission.WAKE_LOCK".equals(str2)) {
                            this.i = true;
                            ((hkf) ((hkf) ((hkf) a.f()).h(e)).i("com/google/apps/tiktok/concurrent/AndroidFutures", "checkPermissionRequested", 189, "AndroidFutures.java")).s("Failed to acquire wakelock");
                            return;
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    public final void c(hvi hviVar, long j, TimeUnit timeUnit) {
        hviVar.c(gvx.h(new evb(this.g.schedule(gvx.h(new kfw(hviVar, j, timeUnit, 1)), j, timeUnit), hviVar, 8, null)), this.f);
    }

    public final void e(hvi hviVar) {
        guq b = gta.b();
        b(hviVar, b == null ? "<no trace>" : gta.m(b));
    }
}
