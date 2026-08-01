package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class F extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1443b = 0;

    /* renamed from: a, reason: collision with root package name */
    public B0.d f1444a;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final E Companion = new E();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            X0.f.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            X0.f.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            X0.f.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            X0.f.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            X0.f.e(activity, "activity");
            int i = F.f1443b;
            D.a(activity, EnumC0080m.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            X0.f.e(activity, "activity");
            int i = F.f1443b;
            D.a(activity, EnumC0080m.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            X0.f.e(activity, "activity");
            int i = F.f1443b;
            D.a(activity, EnumC0080m.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            X0.f.e(activity, "activity");
            int i = F.f1443b;
            D.a(activity, EnumC0080m.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            X0.f.e(activity, "activity");
            int i = F.f1443b;
            D.a(activity, EnumC0080m.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            X0.f.e(activity, "activity");
            int i = F.f1443b;
            D.a(activity, EnumC0080m.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            X0.f.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            X0.f.e(activity, "activity");
            X0.f.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            X0.f.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            X0.f.e(activity, "activity");
        }
    }

    public final void a(EnumC0080m enumC0080m) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            X0.f.d(activity, "activity");
            D.a(activity, enumC0080m);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0080m.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0080m.ON_DESTROY);
        this.f1444a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0080m.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        B0.d dVar = this.f1444a;
        if (dVar != null) {
            ((C) dVar.f66b).a();
        }
        a(EnumC0080m.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        B0.d dVar = this.f1444a;
        if (dVar != null) {
            C c2 = (C) dVar.f66b;
            int i = c2.f1436a + 1;
            c2.f1436a = i;
            if (i == 1 && c2.f1439d) {
                c2.f1441f.e(EnumC0080m.ON_START);
                c2.f1439d = false;
            }
        }
        a(EnumC0080m.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0080m.ON_STOP);
    }
}
