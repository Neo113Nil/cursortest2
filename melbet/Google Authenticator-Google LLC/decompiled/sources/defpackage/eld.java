package defpackage;

import android.app.Activity;
import android.os.Handler;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eld extends ele {
    final /* synthetic */ elf a;

    public eld(elf elfVar) {
        this.a = elfVar;
    }

    @Override // defpackage.ele, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        elf elfVar = this.a;
        int i = elfVar.b - 1;
        elfVar.b = i;
        if (i == 0) {
            elfVar.h = eik.c(activity.getClass());
            Handler handler = elfVar.e;
            hoq.u(handler);
            Runnable runnable = elfVar.f;
            hoq.u(runnable);
            handler.postDelayed(runnable, 700L);
        }
    }

    @Override // defpackage.ele, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        elf elfVar = this.a;
        int i = elfVar.b + 1;
        elfVar.b = i;
        if (i == 1) {
            if (elfVar.c) {
                Iterator it = elfVar.g.iterator();
                while (it.hasNext()) {
                    ((ekp) it.next()).l(eik.c(activity.getClass()));
                }
                elfVar.c = false;
                return;
            }
            Handler handler = elfVar.e;
            hoq.u(handler);
            Runnable runnable = elfVar.f;
            hoq.u(runnable);
            handler.removeCallbacks(runnable);
        }
    }

    @Override // defpackage.ele, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        elf elfVar = this.a;
        int i = elfVar.a + 1;
        elfVar.a = i;
        if (i == 1 && elfVar.d) {
            for (ekp ekpVar : elfVar.g) {
                eik.c(activity.getClass());
            }
            elfVar.d = false;
        }
    }

    @Override // defpackage.ele, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        elf elfVar = this.a;
        elfVar.a--;
        eik.c(activity.getClass());
        elfVar.a();
    }
}
