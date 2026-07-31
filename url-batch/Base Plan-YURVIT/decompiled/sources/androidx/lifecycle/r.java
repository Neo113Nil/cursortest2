package androidx.lifecycle;

import B0.E;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class r extends Fragment {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f1629f = 0;

    /* renamed from: e, reason: collision with root package name */
    public E f1630e;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final q Companion = new q();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            P0.h.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            P0.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            P0.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            P0.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            P0.h.e(activity, "activity");
            int i2 = r.f1629f;
            o.a(activity, d.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            P0.h.e(activity, "activity");
            int i2 = r.f1629f;
            o.a(activity, d.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            P0.h.e(activity, "activity");
            int i2 = r.f1629f;
            o.a(activity, d.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            P0.h.e(activity, "activity");
            int i2 = r.f1629f;
            o.a(activity, d.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            P0.h.e(activity, "activity");
            int i2 = r.f1629f;
            o.a(activity, d.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            P0.h.e(activity, "activity");
            int i2 = r.f1629f;
            o.a(activity, d.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            P0.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            P0.h.e(activity, "activity");
            P0.h.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            P0.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            P0.h.e(activity, "activity");
        }
    }

    public final void a(d dVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            P0.h.d(activity, "activity");
            o.a(activity, dVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(d.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(d.ON_DESTROY);
        this.f1630e = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(d.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        E e2 = this.f1630e;
        if (e2 != null) {
            ((n) e2.f20f).b();
        }
        a(d.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        E e2 = this.f1630e;
        if (e2 != null) {
            n nVar = (n) e2.f20f;
            int i2 = nVar.f1621e + 1;
            nVar.f1621e = i2;
            if (i2 == 1 && nVar.f1624h) {
                nVar.f1626j.a(d.ON_START);
                nVar.f1624h = false;
            }
        }
        a(d.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(d.ON_STOP);
    }
}
