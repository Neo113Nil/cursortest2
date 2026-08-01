package E;

import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* renamed from: E.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0003d implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0004e f145a;

    public C0003d(AbstractActivityC0004e abstractActivityC0004e) {
        this.f145a = abstractActivityC0004e;
    }

    public final void onBackCancelled() {
        AbstractActivityC0004e abstractActivityC0004e = this.f145a;
        if (abstractActivityC0004e.k("cancelBackGesture")) {
            C0007h c0007h = abstractActivityC0004e.f148b;
            c0007h.c();
            F.c cVar = c0007h.f156b;
            if (cVar != null) {
                cVar.f232j.f331a.h("cancelBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackInvoked() {
        AbstractActivityC0004e abstractActivityC0004e = this.f145a;
        if (abstractActivityC0004e.k("commitBackGesture")) {
            C0007h c0007h = abstractActivityC0004e.f148b;
            c0007h.c();
            F.c cVar = c0007h.f156b;
            if (cVar != null) {
                cVar.f232j.f331a.h("commitBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractActivityC0004e abstractActivityC0004e = this.f145a;
        if (abstractActivityC0004e.k("updateBackGestureProgress")) {
            C0007h c0007h = abstractActivityC0004e.f148b;
            c0007h.c();
            F.c cVar = c0007h.f156b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
                return;
            }
            M.b bVar = cVar.f232j;
            bVar.getClass();
            bVar.f331a.h("updateBackGestureProgress", M.b.a(backEvent), null);
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractActivityC0004e abstractActivityC0004e = this.f145a;
        if (abstractActivityC0004e.k("startBackGesture")) {
            C0007h c0007h = abstractActivityC0004e.f148b;
            c0007h.c();
            F.c cVar = c0007h.f156b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
                return;
            }
            M.b bVar = cVar.f232j;
            bVar.getClass();
            bVar.f331a.h("startBackGesture", M.b.a(backEvent), null);
        }
    }
}
