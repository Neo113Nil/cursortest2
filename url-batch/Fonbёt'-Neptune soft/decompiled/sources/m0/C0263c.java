package m0;

import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import v0.C0311a;

/* renamed from: m0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0263c implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0264d f3141a;

    public C0263c(AbstractActivityC0264d abstractActivityC0264d) {
        this.f3141a = abstractActivityC0264d;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        AbstractActivityC0264d abstractActivityC0264d = this.f3141a;
        if (abstractActivityC0264d.k("cancelBackGesture")) {
            C0267g c0267g = abstractActivityC0264d.f3144f;
            c0267g.c();
            n0.c cVar = c0267g.f3152b;
            if (cVar != null) {
                cVar.f3272j.f3474a.f("cancelBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        AbstractActivityC0264d abstractActivityC0264d = this.f3141a;
        if (abstractActivityC0264d.k("commitBackGesture")) {
            C0267g c0267g = abstractActivityC0264d.f3144f;
            c0267g.c();
            n0.c cVar = c0267g.f3152b;
            if (cVar != null) {
                cVar.f3272j.f3474a.f("commitBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        AbstractActivityC0264d abstractActivityC0264d = this.f3141a;
        if (abstractActivityC0264d.k("updateBackGestureProgress")) {
            C0267g c0267g = abstractActivityC0264d.f3144f;
            c0267g.c();
            n0.c cVar = c0267g.f3152b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
                return;
            }
            C0311a c0311a = cVar.f3272j;
            c0311a.getClass();
            c0311a.f3474a.f("updateBackGestureProgress", C0311a.a(backEvent), null);
        }
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        AbstractActivityC0264d abstractActivityC0264d = this.f3141a;
        if (abstractActivityC0264d.k("startBackGesture")) {
            C0267g c0267g = abstractActivityC0264d.f3144f;
            c0267g.c();
            n0.c cVar = c0267g.f3152b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
                return;
            }
            C0311a c0311a = cVar.f3272j;
            c0311a.getClass();
            c0311a.f3474a.f("startBackGesture", C0311a.a(backEvent), null);
        }
    }
}
