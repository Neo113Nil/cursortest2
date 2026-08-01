package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class D extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1486b = 0;

    /* renamed from: a, reason: collision with root package name */
    public C.g f1487a;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final C Companion = new C();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            g1.d.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            g1.d.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            g1.d.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            g1.d.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            g1.d.e(activity, "activity");
            int i = D.f1486b;
            B.a(activity, EnumC0072l.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            g1.d.e(activity, "activity");
            int i = D.f1486b;
            B.a(activity, EnumC0072l.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            g1.d.e(activity, "activity");
            int i = D.f1486b;
            B.a(activity, EnumC0072l.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            g1.d.e(activity, "activity");
            int i = D.f1486b;
            B.a(activity, EnumC0072l.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            g1.d.e(activity, "activity");
            int i = D.f1486b;
            B.a(activity, EnumC0072l.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            g1.d.e(activity, "activity");
            int i = D.f1486b;
            B.a(activity, EnumC0072l.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            g1.d.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            g1.d.e(activity, "activity");
            g1.d.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            g1.d.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            g1.d.e(activity, "activity");
        }
    }

    public final void a(EnumC0072l enumC0072l) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            g1.d.d(activity, "activity");
            B.a(activity, enumC0072l);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0072l.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0072l.ON_DESTROY);
        this.f1487a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0072l.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C.g gVar = this.f1487a;
        if (gVar != null) {
            ((A) gVar.f80b).a();
        }
        a(EnumC0072l.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C.g gVar = this.f1487a;
        if (gVar != null) {
            A a2 = (A) gVar.f80b;
            int i = a2.f1480a + 1;
            a2.f1480a = i;
            if (i == 1 && a2.d) {
                a2.f1484f.d(EnumC0072l.ON_START);
                a2.d = false;
            }
        }
        a(EnumC0072l.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0072l.ON_STOP);
    }
}
