package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gio implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public gio(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Set] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.b != 0) {
            return;
        }
        activity.getClass();
        ((giq) this.a).b.add(activity);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Set] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.b != 0) {
            return;
        }
        activity.getClass();
        ((giq) this.a).b.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.b != 0) {
            return;
        }
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (this.b != 0) {
            return;
        }
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (this.b != 0) {
            return;
        }
        activity.getClass();
        bundle.getClass();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Set] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.b == 0) {
            activity.getClass();
            ((giq) this.a).c.add(activity);
            return;
        }
        gam gamVar = (gam) this.a;
        int i = gamVar.b + 1;
        gamVar.b = i;
        if (i == 1) {
            gamVar.a(true);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Set] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = 0;
        if (this.b != 0) {
            gam gamVar = (gam) this.a;
            int i2 = gamVar.b - 1;
            gamVar.b = i2;
            if (i2 != 0 || activity.isChangingConfigurations()) {
                return;
            }
            gamVar.a(false);
            return;
        }
        activity.getClass();
        Object obj = this.a;
        giq giqVar = (giq) obj;
        ?? r2 = giqVar.c;
        r2.remove(activity);
        fao.c();
        if (!giqVar.a && r2.isEmpty() && giqVar.a()) {
            MessageQueue myQueue = Looper.myQueue();
            final gin ginVar = new gin(obj, i);
            long j = gvx.a;
            final guq d = gta.d(false);
            myQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: gvo
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    long j2 = gvx.a;
                    guq g = gta.g(gta.a(), guq.this);
                    try {
                        return ginVar.queueIdle();
                    } finally {
                    }
                }
            });
        }
    }
}
