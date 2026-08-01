package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class yv implements OnBackAnimationCallback {
    public final /* synthetic */ xv a;

    public yv(xv xvVar) {
        this.a = xvVar;
    }

    public final void onBackCancelled() {
        xv xvVar = this.a;
        we weVar = xvVar.a;
        if (weVar == null) {
            t8.t("This input is not added to any dispatcher.");
            return;
        }
        if (!xvVar.b) {
            weVar.g(xvVar, null);
        }
        uu uuVar = (uu) weVar.g;
        uuVar.getClass();
        if (xvVar.equals(uuVar.h) && -1 == uuVar.g) {
            zv zvVar = uuVar.f;
            if (zvVar == null) {
                zvVar = uuVar.c(-1);
            }
            uuVar.f = null;
            uuVar.g = 0;
            uuVar.h = null;
            if (zvVar != null) {
                zvVar.d.getClass();
            }
            uuVar.a.b(vu.o);
        }
        xvVar.b = false;
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        ru a = e70.a(backEvent);
        xv xvVar = this.a;
        we weVar = xvVar.a;
        if (weVar == null) {
            t8.t("This input is not added to any dispatcher.");
            return;
        }
        if (xvVar.b) {
            uu uuVar = (uu) weVar.g;
            uuVar.getClass();
            if (xvVar.equals(uuVar.h) && -1 == uuVar.g) {
                zv zvVar = uuVar.f;
                if (zvVar == null) {
                    zvVar = uuVar.c(-1);
                }
                if (zvVar != null) {
                    zvVar.d.getClass();
                }
                uuVar.a.b(new wu(a));
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        ru a = e70.a(backEvent);
        xv xvVar = this.a;
        we weVar = xvVar.a;
        if (weVar == null) {
            t8.t("This input is not added to any dispatcher.");
        } else {
            if (xvVar.b) {
                return;
            }
            weVar.g(xvVar, a);
            xvVar.b = true;
        }
    }
}
