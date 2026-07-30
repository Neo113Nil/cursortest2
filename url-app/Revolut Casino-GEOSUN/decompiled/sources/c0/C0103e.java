package c0;

import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import m0.C0191a;

/* renamed from: c0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0103e implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0104f f1691a;

    public C0103e(AbstractActivityC0104f abstractActivityC0104f) {
        this.f1691a = abstractActivityC0104f;
    }

    public final void onBackCancelled() {
        AbstractActivityC0104f abstractActivityC0104f = this.f1691a;
        if (abstractActivityC0104f.k("cancelBackGesture")) {
            C0107i c0107i = abstractActivityC0104f.f1694f;
            c0107i.c();
            d0.c cVar = c0107i.f1702b;
            if (cVar != null) {
                cVar.f1797j.f2703a.D("cancelBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackInvoked() {
        AbstractActivityC0104f abstractActivityC0104f = this.f1691a;
        if (abstractActivityC0104f.k("commitBackGesture")) {
            C0107i c0107i = abstractActivityC0104f.f1694f;
            c0107i.c();
            d0.c cVar = c0107i.f1702b;
            if (cVar != null) {
                cVar.f1797j.f2703a.D("commitBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractActivityC0104f abstractActivityC0104f = this.f1691a;
        if (abstractActivityC0104f.k("updateBackGestureProgress")) {
            C0107i c0107i = abstractActivityC0104f.f1694f;
            c0107i.c();
            d0.c cVar = c0107i.f1702b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
                return;
            }
            C0191a c0191a = cVar.f1797j;
            c0191a.getClass();
            c0191a.f2703a.D("updateBackGestureProgress", C0191a.a(backEvent), null);
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractActivityC0104f abstractActivityC0104f = this.f1691a;
        if (abstractActivityC0104f.k("startBackGesture")) {
            C0107i c0107i = abstractActivityC0104f.f1694f;
            c0107i.c();
            d0.c cVar = c0107i.f1702b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
                return;
            }
            C0191a c0191a = cVar.f1797j;
            c0191a.getClass();
            c0191a.f2703a.D("startBackGesture", C0191a.a(backEvent), null);
        }
    }
}
