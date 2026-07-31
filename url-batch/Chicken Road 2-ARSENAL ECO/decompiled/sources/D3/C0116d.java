package D3;

import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* renamed from: D3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0116d implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0117e f415a;

    public C0116d(AbstractActivityC0117e abstractActivityC0117e) {
        this.f415a = abstractActivityC0117e;
    }

    public final void onBackCancelled() {
        AbstractActivityC0117e abstractActivityC0117e = this.f415a;
        if (abstractActivityC0117e.j("cancelBackGesture")) {
            C0121i c0121i = abstractActivityC0117e.f418g;
            c0121i.c();
            E3.c cVar = c0121i.f426b;
            if (cVar != null) {
                cVar.f609j.f1680a.q("cancelBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackInvoked() {
        AbstractActivityC0117e abstractActivityC0117e = this.f415a;
        if (abstractActivityC0117e.j("commitBackGesture")) {
            C0121i c0121i = abstractActivityC0117e.f418g;
            c0121i.c();
            E3.c cVar = c0121i.f426b;
            if (cVar != null) {
                cVar.f609j.f1680a.q("commitBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractActivityC0117e abstractActivityC0117e = this.f415a;
        if (abstractActivityC0117e.j("updateBackGestureProgress")) {
            C0121i c0121i = abstractActivityC0117e.f418g;
            c0121i.c();
            E3.c cVar = c0121i.f426b;
            if (cVar != null) {
                cVar.f609j.f1680a.q("updateBackGestureProgress", N3.b.a(backEvent), null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractActivityC0117e abstractActivityC0117e = this.f415a;
        if (abstractActivityC0117e.j("startBackGesture")) {
            C0121i c0121i = abstractActivityC0117e.f418g;
            c0121i.c();
            E3.c cVar = c0121i.f426b;
            if (cVar != null) {
                cVar.f609j.f1680a.q("startBackGesture", N3.b.a(backEvent), null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }
}
