package k0;

import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import u0.C0230b;

/* renamed from: k0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0186c implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0187d f2670a;

    public C0186c(AbstractActivityC0187d abstractActivityC0187d) {
        this.f2670a = abstractActivityC0187d;
    }

    public final void onBackCancelled() {
        AbstractActivityC0187d abstractActivityC0187d = this.f2670a;
        if (abstractActivityC0187d.k("cancelBackGesture")) {
            C0190g c0190g = abstractActivityC0187d.f2673f;
            c0190g.c();
            l0.c cVar = c0190g.f2679b;
            if (cVar != null) {
                cVar.f2784j.f2986a.B("cancelBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackInvoked() {
        AbstractActivityC0187d abstractActivityC0187d = this.f2670a;
        if (abstractActivityC0187d.k("commitBackGesture")) {
            C0190g c0190g = abstractActivityC0187d.f2673f;
            c0190g.c();
            l0.c cVar = c0190g.f2679b;
            if (cVar != null) {
                cVar.f2784j.f2986a.B("commitBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractActivityC0187d abstractActivityC0187d = this.f2670a;
        if (abstractActivityC0187d.k("updateBackGestureProgress")) {
            C0190g c0190g = abstractActivityC0187d.f2673f;
            c0190g.c();
            l0.c cVar = c0190g.f2679b;
            if (cVar != null) {
                cVar.f2784j.f2986a.B("updateBackGestureProgress", C0230b.a(backEvent), null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractActivityC0187d abstractActivityC0187d = this.f2670a;
        if (abstractActivityC0187d.k("startBackGesture")) {
            C0190g c0190g = abstractActivityC0187d.f2673f;
            c0190g.c();
            l0.c cVar = c0190g.f2679b;
            if (cVar != null) {
                cVar.f2784j.f2986a.B("startBackGesture", C0230b.a(backEvent), null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }
}
