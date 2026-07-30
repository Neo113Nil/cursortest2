package h4;

import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import i4.C0547c;

/* renamed from: h4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0487b implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0488c f5188a;

    public C0487b(AbstractActivityC0488c abstractActivityC0488c) {
        this.f5188a = abstractActivityC0488c;
    }

    public final void onBackCancelled() {
        AbstractActivityC0488c abstractActivityC0488c = this.f5188a;
        if (abstractActivityC0488c.j("cancelBackGesture")) {
            C0492g c0492g = abstractActivityC0488c.f5191e;
            c0492g.c();
            C0547c c0547c = c0492g.f5199b;
            if (c0547c != null) {
                c0547c.j.f7461a.a("cancelBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackInvoked() {
        AbstractActivityC0488c abstractActivityC0488c = this.f5188a;
        if (abstractActivityC0488c.j("commitBackGesture")) {
            C0492g c0492g = abstractActivityC0488c.f5191e;
            c0492g.c();
            C0547c c0547c = c0492g.f5199b;
            if (c0547c != null) {
                c0547c.j.f7461a.a("commitBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractActivityC0488c abstractActivityC0488c = this.f5188a;
        if (abstractActivityC0488c.j("updateBackGestureProgress")) {
            C0492g c0492g = abstractActivityC0488c.f5191e;
            c0492g.c();
            C0547c c0547c = c0492g.f5199b;
            if (c0547c != null) {
                c0547c.j.f7461a.a("updateBackGestureProgress", r4.a.a(backEvent), null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractActivityC0488c abstractActivityC0488c = this.f5188a;
        if (abstractActivityC0488c.j("startBackGesture")) {
            C0492g c0492g = abstractActivityC0488c.f5191e;
            c0492g.c();
            C0547c c0547c = c0492g.f5199b;
            if (c0547c != null) {
                c0547c.j.f7461a.a("startBackGesture", r4.a.a(backEvent), null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }
}
