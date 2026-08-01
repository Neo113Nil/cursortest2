package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class bz implements OnBackAnimationCallback {
    public final /* synthetic */ az a;

    public bz(az azVar) {
        this.a = azVar;
    }

    public final void onBackCancelled() {
        az azVar = this.a;
        rg rgVar = azVar.a;
        if (rgVar == null) {
            g9.s("This input is not added to any dispatcher.");
            return;
        }
        if (!azVar.b) {
            rgVar.g(azVar, null);
        }
        wx wxVar = (wx) rgVar.g;
        wxVar.getClass();
        if (azVar.equals(wxVar.h) && -1 == wxVar.g) {
            cz czVar = wxVar.f;
            if (czVar == null) {
                czVar = wxVar.c(-1);
            }
            wxVar.f = null;
            wxVar.g = 0;
            wxVar.h = null;
            if (czVar != null) {
                czVar.d.getClass();
            }
            wxVar.a.b(xx.r);
        }
        azVar.b = false;
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        tx a = b9.a(backEvent);
        az azVar = this.a;
        rg rgVar = azVar.a;
        if (rgVar == null) {
            g9.s("This input is not added to any dispatcher.");
            return;
        }
        if (azVar.b) {
            wx wxVar = (wx) rgVar.g;
            wxVar.getClass();
            if (azVar.equals(wxVar.h) && -1 == wxVar.g) {
                cz czVar = wxVar.f;
                if (czVar == null) {
                    czVar = wxVar.c(-1);
                }
                if (czVar != null) {
                    czVar.d.getClass();
                }
                wxVar.a.b(new yx(a));
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        tx a = b9.a(backEvent);
        az azVar = this.a;
        rg rgVar = azVar.a;
        if (rgVar == null) {
            g9.s("This input is not added to any dispatcher.");
        } else {
            if (azVar.b) {
                return;
            }
            rgVar.g(azVar, a);
            azVar.b = true;
        }
    }
}
