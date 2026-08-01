package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class e0 extends Fragment {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f604g = 0;

    /* renamed from: f, reason: collision with root package name */
    public a0.a f605f;

    /* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final d0 Companion = new d0();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            f3.d.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            f3.d.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            f3.d.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            f3.d.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            f3.d.e(activity, "activity");
            int i = e0.f604g;
            c0.a(activity, l.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            f3.d.e(activity, "activity");
            int i = e0.f604g;
            c0.a(activity, l.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            f3.d.e(activity, "activity");
            int i = e0.f604g;
            c0.a(activity, l.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            f3.d.e(activity, "activity");
            int i = e0.f604g;
            c0.a(activity, l.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            f3.d.e(activity, "activity");
            int i = e0.f604g;
            c0.a(activity, l.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            f3.d.e(activity, "activity");
            int i = e0.f604g;
            c0.a(activity, l.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            f3.d.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            f3.d.e(activity, "activity");
            f3.d.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            f3.d.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            f3.d.e(activity, "activity");
        }
    }

    public final void a(l lVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            f3.d.d(activity, "activity");
            c0.a(activity, lVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(l.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(l.ON_DESTROY);
        this.f605f = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(l.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        a0.a aVar = this.f605f;
        if (aVar != null) {
            ((b0) aVar.f81g).a();
        }
        a(l.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        a0.a aVar = this.f605f;
        if (aVar != null) {
            b0 b0Var = (b0) aVar.f81g;
            int i = b0Var.f593f + 1;
            b0Var.f593f = i;
            if (i == 1 && b0Var.i) {
                b0Var.f597k.d(l.ON_START);
                b0Var.i = false;
            }
        }
        a(l.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(l.ON_STOP);
    }
}
