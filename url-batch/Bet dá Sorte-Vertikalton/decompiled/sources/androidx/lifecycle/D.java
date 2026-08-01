package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class D extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1413b = 0;

    /* renamed from: a, reason: collision with root package name */
    public C.h f1414a;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final C Companion = new C();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            b1.d.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            b1.d.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            b1.d.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            b1.d.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            b1.d.e(activity, "activity");
            int i = D.f1413b;
            B.a(activity, EnumC0071l.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            b1.d.e(activity, "activity");
            int i = D.f1413b;
            B.a(activity, EnumC0071l.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            b1.d.e(activity, "activity");
            int i = D.f1413b;
            B.a(activity, EnumC0071l.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            b1.d.e(activity, "activity");
            int i = D.f1413b;
            B.a(activity, EnumC0071l.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            b1.d.e(activity, "activity");
            int i = D.f1413b;
            B.a(activity, EnumC0071l.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            b1.d.e(activity, "activity");
            int i = D.f1413b;
            B.a(activity, EnumC0071l.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            b1.d.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            b1.d.e(activity, "activity");
            b1.d.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            b1.d.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            b1.d.e(activity, "activity");
        }
    }

    public final void a(EnumC0071l enumC0071l) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            b1.d.d(activity, "activity");
            B.a(activity, enumC0071l);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0071l.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0071l.ON_DESTROY);
        this.f1414a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0071l.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C.h hVar = this.f1414a;
        if (hVar != null) {
            ((A) hVar.f150b).a();
        }
        a(EnumC0071l.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C.h hVar = this.f1414a;
        if (hVar != null) {
            A a2 = (A) hVar.f150b;
            int i = a2.f1407a + 1;
            a2.f1407a = i;
            if (i == 1 && a2.d) {
                a2.f1411f.d(EnumC0071l.ON_START);
                a2.d = false;
            }
        }
        a(EnumC0071l.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0071l.ON_STOP);
    }
}
