package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class F extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1478b = 0;

    /* renamed from: a, reason: collision with root package name */
    public A0.h f1479a;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final E Companion = new E();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            g1.f.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            g1.f.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            g1.f.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            g1.f.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            g1.f.e(activity, "activity");
            int i = F.f1478b;
            D.a(activity, EnumC0071l.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            g1.f.e(activity, "activity");
            int i = F.f1478b;
            D.a(activity, EnumC0071l.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            g1.f.e(activity, "activity");
            int i = F.f1478b;
            D.a(activity, EnumC0071l.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            g1.f.e(activity, "activity");
            int i = F.f1478b;
            D.a(activity, EnumC0071l.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            g1.f.e(activity, "activity");
            int i = F.f1478b;
            D.a(activity, EnumC0071l.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            g1.f.e(activity, "activity");
            int i = F.f1478b;
            D.a(activity, EnumC0071l.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            g1.f.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            g1.f.e(activity, "activity");
            g1.f.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            g1.f.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            g1.f.e(activity, "activity");
        }
    }

    public final void a(EnumC0071l enumC0071l) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            g1.f.d(activity, "activity");
            D.a(activity, enumC0071l);
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
        this.f1479a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0071l.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        A0.h hVar = this.f1479a;
        if (hVar != null) {
            ((C) hVar.f30b).a();
        }
        a(EnumC0071l.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        A0.h hVar = this.f1479a;
        if (hVar != null) {
            C c2 = (C) hVar.f30b;
            int i = c2.f1472a + 1;
            c2.f1472a = i;
            if (i == 1 && c2.d) {
                c2.f1476f.d(EnumC0071l.ON_START);
                c2.d = false;
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
