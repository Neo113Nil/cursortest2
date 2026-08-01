package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class e0 extends Fragment {
    public static final /* synthetic */ int g = 0;

    /* renamed from: f, reason: collision with root package name */
    public a2.e f580f;

    /* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final d0 Companion = new d0();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            u2.c.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            u2.c.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            u2.c.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            u2.c.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            u2.c.e(activity, "activity");
            int i4 = e0.g;
            c0.a(activity, l.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            u2.c.e(activity, "activity");
            int i4 = e0.g;
            c0.a(activity, l.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            u2.c.e(activity, "activity");
            int i4 = e0.g;
            c0.a(activity, l.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            u2.c.e(activity, "activity");
            int i4 = e0.g;
            c0.a(activity, l.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            u2.c.e(activity, "activity");
            int i4 = e0.g;
            c0.a(activity, l.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            u2.c.e(activity, "activity");
            int i4 = e0.g;
            c0.a(activity, l.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            u2.c.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            u2.c.e(activity, "activity");
            u2.c.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            u2.c.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            u2.c.e(activity, "activity");
        }
    }

    public final void a(l lVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            u2.c.d(activity, "activity");
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
        this.f580f = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(l.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        a2.e eVar = this.f580f;
        if (eVar != null) {
            ((b0) eVar.g).b();
        }
        a(l.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        a2.e eVar = this.f580f;
        if (eVar != null) {
            b0 b0Var = (b0) eVar.g;
            int i4 = b0Var.f571f + 1;
            b0Var.f571f = i4;
            if (i4 == 1 && b0Var.f572i) {
                b0Var.f574k.d(l.ON_START);
                b0Var.f572i = false;
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
