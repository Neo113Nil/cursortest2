package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class fw implements OnBackAnimationCallback {
    public final /* synthetic */ ew a;

    public fw(ew ewVar) {
        this.a = ewVar;
    }

    public final void onBackCancelled() {
        ew ewVar = this.a;
        iv ivVar = ewVar.a;
        if (ivVar == null) {
            o8.t("This input is not added to any dispatcher.");
            return;
        }
        if (!ewVar.b) {
            ivVar.c(ewVar, null);
        }
        lv lvVar = ivVar.b;
        lvVar.getClass();
        if (ewVar.equals(lvVar.h) && -1 == lvVar.g) {
            gw gwVar = lvVar.f;
            if (gwVar == null) {
                gwVar = lvVar.c(-1);
            }
            lvVar.f = null;
            lvVar.g = 0;
            lvVar.h = null;
            if (gwVar != null) {
                gwVar.d.getClass();
            }
            lvVar.a.b(mv.k);
        }
        ewVar.b = false;
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        hv a = op.a(backEvent);
        ew ewVar = this.a;
        iv ivVar = ewVar.a;
        if (ivVar == null) {
            o8.t("This input is not added to any dispatcher.");
            return;
        }
        if (ewVar.b) {
            lv lvVar = ivVar.b;
            lvVar.getClass();
            if (ewVar.equals(lvVar.h) && -1 == lvVar.g) {
                gw gwVar = lvVar.f;
                if (gwVar == null) {
                    gwVar = lvVar.c(-1);
                }
                if (gwVar != null) {
                    gwVar.d.getClass();
                }
                lvVar.a.b(new nv(a));
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        hv a = op.a(backEvent);
        ew ewVar = this.a;
        iv ivVar = ewVar.a;
        if (ivVar == null) {
            o8.t("This input is not added to any dispatcher.");
        } else {
            if (ewVar.b) {
                return;
            }
            ivVar.c(ewVar, a);
            ewVar.b = true;
        }
    }
}
