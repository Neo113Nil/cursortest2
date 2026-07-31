package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class h0 extends Fragment {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f829e = 0;

    /* renamed from: d, reason: collision with root package name */
    public v0 f830d;

    /* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final g0 Companion = new g0();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            q6.i.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            q6.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            q6.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            q6.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            q6.i.e(activity, "activity");
            int i = h0.f829e;
            e0.a(activity, o.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            q6.i.e(activity, "activity");
            int i = h0.f829e;
            e0.a(activity, o.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            q6.i.e(activity, "activity");
            int i = h0.f829e;
            e0.a(activity, o.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            q6.i.e(activity, "activity");
            int i = h0.f829e;
            e0.a(activity, o.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            q6.i.e(activity, "activity");
            int i = h0.f829e;
            e0.a(activity, o.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            q6.i.e(activity, "activity");
            int i = h0.f829e;
            e0.a(activity, o.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            q6.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            q6.i.e(activity, "activity");
            q6.i.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            q6.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            q6.i.e(activity, "activity");
        }
    }

    public final void a(o oVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            q6.i.d(activity, "getActivity(...)");
            e0.a(activity, oVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(o.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(o.ON_DESTROY);
        this.f830d = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(o.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        v0 v0Var = this.f830d;
        if (v0Var != null) {
            ((d0) v0Var.f868a).c();
        }
        a(o.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        v0 v0Var = this.f830d;
        if (v0Var != null) {
            d0 d0Var = (d0) v0Var.f868a;
            int i = d0Var.f816d + 1;
            d0Var.f816d = i;
            if (i == 1 && d0Var.f819g) {
                d0Var.i.d(o.ON_START);
                d0Var.f819g = false;
            }
        }
        a(o.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(o.ON_STOP);
    }
}
