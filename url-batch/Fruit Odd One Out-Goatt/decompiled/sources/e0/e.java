package e0;

import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class e implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f137a;

    public e(f fVar) {
        this.f137a = fVar;
    }

    public final void onBackCancelled() {
        f fVar = this.f137a;
        if (fVar.k("cancelBackGesture")) {
            i iVar = fVar.f144b;
            iVar.c();
            f0.c cVar = iVar.f155b;
            if (cVar != null) {
                cVar.f277j.f766a.d("cancelBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackInvoked() {
        f fVar = this.f137a;
        if (fVar.k("commitBackGesture")) {
            i iVar = fVar.f144b;
            iVar.c();
            f0.c cVar = iVar.f155b;
            if (cVar != null) {
                cVar.f277j.f766a.d("commitBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        f fVar = this.f137a;
        if (fVar.k("updateBackGestureProgress")) {
            i iVar = fVar.f144b;
            iVar.c();
            f0.c cVar = iVar.f155b;
            if (cVar != null) {
                cVar.f277j.f766a.d("updateBackGestureProgress", m0.a.a(backEvent), null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        f fVar = this.f137a;
        if (fVar.k("startBackGesture")) {
            i iVar = fVar.f144b;
            iVar.c();
            f0.c cVar = iVar.f155b;
            if (cVar != null) {
                cVar.f277j.f766a.d("startBackGesture", m0.a.a(backEvent), null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }
}
