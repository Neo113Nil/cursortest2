package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class u extends Fragment {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f1795f = 0;

    /* renamed from: e, reason: collision with root package name */
    public B.m f1796e;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final t Companion = new t();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            Q0.h.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Q0.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Q0.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Q0.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            Q0.h.e(activity, "activity");
            int i2 = u.f1795f;
            s.a(activity, f.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            Q0.h.e(activity, "activity");
            int i2 = u.f1795f;
            s.a(activity, f.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            Q0.h.e(activity, "activity");
            int i2 = u.f1795f;
            s.a(activity, f.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            Q0.h.e(activity, "activity");
            int i2 = u.f1795f;
            s.a(activity, f.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            Q0.h.e(activity, "activity");
            int i2 = u.f1795f;
            s.a(activity, f.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            Q0.h.e(activity, "activity");
            int i2 = u.f1795f;
            s.a(activity, f.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Q0.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Q0.h.e(activity, "activity");
            Q0.h.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Q0.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Q0.h.e(activity, "activity");
        }
    }

    public final void a(f fVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            Q0.h.d(activity, "activity");
            s.a(activity, fVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(f.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(f.ON_DESTROY);
        this.f1796e = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(f.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        B.m mVar = this.f1796e;
        if (mVar != null) {
            ((r) mVar.f78f).b();
        }
        a(f.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        B.m mVar = this.f1796e;
        if (mVar != null) {
            r rVar = (r) mVar.f78f;
            int i2 = rVar.f1787e + 1;
            rVar.f1787e = i2;
            if (i2 == 1 && rVar.f1790h) {
                rVar.f1792j.c(f.ON_START);
                rVar.f1790h = false;
            }
        }
        a(f.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(f.ON_STOP);
    }
}
