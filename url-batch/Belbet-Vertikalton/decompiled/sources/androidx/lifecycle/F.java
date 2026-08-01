package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class F extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1907b = 0;

    /* renamed from: a, reason: collision with root package name */
    public C1.d f1908a;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final E Companion = new E();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            j1.h.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            j1.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            j1.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            j1.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            j1.h.e(activity, "activity");
            int i = F.f1907b;
            D.a(activity, EnumC0077l.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            j1.h.e(activity, "activity");
            int i = F.f1907b;
            D.a(activity, EnumC0077l.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            j1.h.e(activity, "activity");
            int i = F.f1907b;
            D.a(activity, EnumC0077l.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            j1.h.e(activity, "activity");
            int i = F.f1907b;
            D.a(activity, EnumC0077l.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            j1.h.e(activity, "activity");
            int i = F.f1907b;
            D.a(activity, EnumC0077l.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            j1.h.e(activity, "activity");
            int i = F.f1907b;
            D.a(activity, EnumC0077l.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            j1.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            j1.h.e(activity, "activity");
            j1.h.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            j1.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            j1.h.e(activity, "activity");
        }
    }

    public final void a(EnumC0077l enumC0077l) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            j1.h.d(activity, "activity");
            D.a(activity, enumC0077l);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0077l.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0077l.ON_DESTROY);
        this.f1908a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0077l.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C1.d dVar = this.f1908a;
        if (dVar != null) {
            ((C) dVar.f145b).a();
        }
        a(EnumC0077l.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C1.d dVar = this.f1908a;
        if (dVar != null) {
            C c2 = (C) dVar.f145b;
            int i = c2.f1900a + 1;
            c2.f1900a = i;
            if (i == 1 && c2.f1903d) {
                c2.f1904f.d(EnumC0077l.ON_START);
                c2.f1903d = false;
            }
        }
        a(EnumC0077l.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0077l.ON_STOP);
    }
}
