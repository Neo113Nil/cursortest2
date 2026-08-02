package E1;

import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import io.flutter.embedding.engine.FlutterEngine;

/* renamed from: E1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0028d implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0029e f336a;

    public C0028d(AbstractActivityC0029e abstractActivityC0029e) {
        this.f336a = abstractActivityC0029e;
    }

    public final void onBackCancelled() {
        AbstractActivityC0029e abstractActivityC0029e = this.f336a;
        if (abstractActivityC0029e.m("cancelBackGesture")) {
            C0032h c0032h = abstractActivityC0029e.f339b;
            c0032h.c();
            FlutterEngine flutterEngine = c0032h.f347b;
            if (flutterEngine != null) {
                ((P1.o) flutterEngine.f9107j.f201b).a("cancelBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackInvoked() {
        AbstractActivityC0029e abstractActivityC0029e = this.f336a;
        if (abstractActivityC0029e.m("commitBackGesture")) {
            C0032h c0032h = abstractActivityC0029e.f339b;
            c0032h.c();
            FlutterEngine flutterEngine = c0032h.f347b;
            if (flutterEngine != null) {
                ((P1.o) flutterEngine.f9107j.f201b).a("commitBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractActivityC0029e abstractActivityC0029e = this.f336a;
        if (abstractActivityC0029e.m("updateBackGestureProgress")) {
            C0032h c0032h = abstractActivityC0029e.f339b;
            c0032h.c();
            FlutterEngine flutterEngine = c0032h.f347b;
            if (flutterEngine == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
                return;
            }
            C0.e eVar = flutterEngine.f9107j;
            eVar.getClass();
            ((P1.o) eVar.f201b).a("updateBackGestureProgress", C0.e.c(backEvent), null);
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractActivityC0029e abstractActivityC0029e = this.f336a;
        if (abstractActivityC0029e.m("startBackGesture")) {
            C0032h c0032h = abstractActivityC0029e.f339b;
            c0032h.c();
            FlutterEngine flutterEngine = c0032h.f347b;
            if (flutterEngine == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
                return;
            }
            C0.e eVar = flutterEngine.f9107j;
            eVar.getClass();
            ((P1.o) eVar.f201b).a("startBackGesture", C0.e.c(backEvent), null);
        }
    }
}
