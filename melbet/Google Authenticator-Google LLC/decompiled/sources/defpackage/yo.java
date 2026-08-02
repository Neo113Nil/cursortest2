package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.window.BackEvent;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class yo {
    static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    static CharSequence b(View view) {
        CharSequence stateDescription;
        stateDescription = view.getStateDescription();
        return stateDescription;
    }

    static void c(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }

    public static ahd d(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        return new ahd(swipeEdge, progress, touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static /* synthetic */ String e(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "TEMPORARILY_UNMETERED" : "METERED" : "NOT_ROAMING" : "UNMETERED" : "CONNECTED" : "NOT_REQUIRED";
    }

    public static asv f(yn ynVar, final String str, final Executor executor, final kri kriVar) {
        executor.getClass();
        final afc afcVar = new afc(asv.b);
        return new asw(ow.l(new ro() { // from class: asx
            @Override // defpackage.ro
            public final Object a(rm rmVar) {
                executor.execute(new fv(str, kriVar, afcVar, rmVar, 3));
                return kow.a;
            }
        }));
    }
}
