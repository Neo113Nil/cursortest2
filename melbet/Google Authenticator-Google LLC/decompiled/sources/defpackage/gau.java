package defpackage;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.os.Build;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gau {
    public static final hkh a = hkh.l("com/google/apps/tiktok/concurrent/ForegroundServiceTracker");
    public final Object b = new Object();
    public final IdentityHashMap c = new IdentityHashMap(10);
    public final hdu d = new hdu(null);
    public final hic e = new hdv();
    public gat f;
    public Service g;
    public int h;
    public gar i;
    private final gap j;

    public gau(Context context, hvm hvmVar, gap gapVar) {
        new hvv(hvmVar);
        this.j = gapVar;
        this.f = gat.a;
    }

    public final void a(Service service, Notification notification) {
        int i;
        boolean z;
        if (Build.VERSION.SDK_INT < 29) {
            service.startForeground(174344743, notification);
            return;
        }
        hic hicVar = this.e;
        int i2 = 0;
        if (hicVar.isEmpty()) {
            gap gapVar = this.j;
            int i3 = Build.VERSION.SDK_INT;
            gzp gzpVar = gapVar.c;
            int a2 = gzpVar.f() ? ((gao) gzpVar.b()).a() : gapVar.b.getApplicationInfo().targetSdkVersion;
            if (a2 >= 34) {
                z = true;
            } else {
                ((hkf) gap.a.e().i("com/google/apps/tiktok/concurrent/DefaultForegroundServiceType", "isTargetSdkAtLeastU", 61, "DefaultForegroundServiceType.kt")).v("targetSdk (%d) >= VERSION_CODES.UPSIDE_DOWN_CAKE (%d) == false", a2, 34);
                z = false;
            }
            boolean z2 = i3 >= 34;
            if (!z2 || !z) {
                ((hkf) gap.a.e().i("com/google/apps/tiktok/concurrent/DefaultForegroundServiceType", "get", 33, "DefaultForegroundServiceType.kt")).H(z2, z);
            }
            i = (z2 && z) ? 2048 : 0;
        } else {
            Iterator it = hicVar.i().iterator();
            int i4 = 0;
            while (it.hasNext()) {
                i4 |= ((Integer) it.next()).intValue();
            }
            i = i4;
        }
        if (i == 0) {
            ((hkf) ((hkf) a.e()).i("com/google/apps/tiktok/concurrent/ForegroundServiceTracker", "startShortService", 364, "ForegroundServiceTracker.java")).s("starting foregroundService with type=none");
        } else {
            i2 = i;
        }
        service.startForeground(174344743, notification, i2);
    }

    public final void b() {
        gat gatVar = this.f;
        hoq.K(gatVar == gat.c, "Destroyed in wrong state %s", gatVar);
        this.f = gat.a;
        this.g.stopForeground(true);
        this.i = null;
        this.g.stopSelf(this.h);
        this.g = null;
    }
}
