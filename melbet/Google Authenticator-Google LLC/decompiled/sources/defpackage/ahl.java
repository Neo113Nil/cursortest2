package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahl implements OnBackAnimationCallback {
    final /* synthetic */ ahm a;

    public ahl(ahm ahmVar) {
        this.a = ahmVar;
    }

    public final void onBackCancelled() {
        ahm ahmVar = this.a;
        cfz cfzVar = ahmVar.d;
        if (cfzVar == null) {
            return;
        }
        if (!ahmVar.c) {
            cfzVar.d(ahmVar, null);
        }
        ahi ahiVar = (ahi) cfzVar.d;
        if (ksp.b(ahmVar, ahiVar.e) && ahiVar.d == -1) {
            ahe aheVar = ahiVar.c;
            if (aheVar == null) {
                aheVar = ahiVar.a(-1);
            }
            ahiVar.c = null;
            ahiVar.d = 0;
            ahiVar.e = null;
            if (aheVar != null) {
                aheVar.a();
            }
            ahiVar.f.d(ahj.a);
        }
        ahmVar.c = false;
    }

    public final void onBackInvoked() {
        this.a.b();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        ahd d = yo.d(backEvent);
        ahm ahmVar = this.a;
        cfz cfzVar = ahmVar.d;
        if (cfzVar != null && ahmVar.c) {
            ahi ahiVar = (ahi) cfzVar.d;
            if (ksp.b(ahmVar, ahiVar.e) && ahiVar.d == -1) {
                ahe aheVar = ahiVar.c;
                if (aheVar == null) {
                    aheVar = ahiVar.a(-1);
                }
                if (aheVar != null) {
                    aheVar.c(d);
                }
                ahiVar.f.d(new ahk(d));
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        ahm ahmVar = this.a;
        ahd d = yo.d(backEvent);
        cfz cfzVar = ahmVar.d;
        if (cfzVar == null || ahmVar.c) {
            return;
        }
        cfzVar.d(ahmVar, d);
        ahmVar.c = true;
    }
}
