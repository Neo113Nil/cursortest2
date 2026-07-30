package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ku1 implements OnBackAnimationCallback {
    public final /* synthetic */ lu1 a;

    public ku1(lu1 lu1Var) {
        this.a = lu1Var;
    }

    public final void onBackCancelled() {
        lu1 lu1Var = this.a;
        tq1 tq1Var = lu1Var.a;
        if (tq1Var == null) {
            lh.g("This input is not added to any dispatcher.");
            return;
        }
        if (!lu1Var.b) {
            tq1Var.d(lu1Var, null);
        }
        yq1 yq1Var = tq1Var.b;
        yq1Var.getClass();
        if (lu1Var.equals(yq1Var.h) && -1 == yq1Var.g) {
            vq1 vq1Var = yq1Var.f;
            if (vq1Var == null) {
                vq1Var = yq1Var.c(-1);
            }
            yq1Var.f = null;
            yq1Var.g = 0;
            yq1Var.h = null;
            if (vq1Var != null) {
                vq1Var.a();
            }
            vo2 vo2Var = yq1Var.a;
            zq1 zq1Var = zq1.s;
            vo2Var.getClass();
            vo2Var.j(null, zq1Var);
        }
        lu1Var.b = false;
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        sq1 a = e2.a(backEvent);
        lu1 lu1Var = this.a;
        tq1 tq1Var = lu1Var.a;
        if (tq1Var == null) {
            lh.g("This input is not added to any dispatcher.");
            return;
        }
        if (lu1Var.b) {
            yq1 yq1Var = tq1Var.b;
            yq1Var.getClass();
            if (lu1Var.equals(yq1Var.h) && -1 == yq1Var.g) {
                vq1 vq1Var = yq1Var.f;
                if (vq1Var == null) {
                    vq1Var = yq1Var.c(-1);
                }
                if (vq1Var != null) {
                    vq1Var.c(a);
                }
                vo2 vo2Var = yq1Var.a;
                ar1 ar1Var = new ar1(a);
                vo2Var.getClass();
                vo2Var.j(null, ar1Var);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        sq1 a = e2.a(backEvent);
        lu1 lu1Var = this.a;
        tq1 tq1Var = lu1Var.a;
        if (tq1Var == null) {
            lh.g("This input is not added to any dispatcher.");
        } else {
            if (lu1Var.b) {
                return;
            }
            tq1Var.d(lu1Var, a);
            lu1Var.b = true;
        }
    }
}
