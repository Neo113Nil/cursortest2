package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class K extends Fragment {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f3973e = 0;

    /* renamed from: d, reason: collision with root package name */
    public A2.g f3974d;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final J Companion = new J();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            Z1.i.f(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Z1.i.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Z1.i.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Z1.i.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            Z1.i.f(activity, "activity");
            int i3 = K.f3973e;
            I.a(activity, EnumC0229n.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            Z1.i.f(activity, "activity");
            int i3 = K.f3973e;
            I.a(activity, EnumC0229n.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            Z1.i.f(activity, "activity");
            int i3 = K.f3973e;
            I.a(activity, EnumC0229n.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            Z1.i.f(activity, "activity");
            int i3 = K.f3973e;
            I.a(activity, EnumC0229n.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            Z1.i.f(activity, "activity");
            int i3 = K.f3973e;
            I.a(activity, EnumC0229n.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            Z1.i.f(activity, "activity");
            int i3 = K.f3973e;
            I.a(activity, EnumC0229n.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Z1.i.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Z1.i.f(activity, "activity");
            Z1.i.f(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Z1.i.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Z1.i.f(activity, "activity");
        }
    }

    public final void a(EnumC0229n enumC0229n) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            Z1.i.e(activity, "activity");
            I.a(activity, enumC0229n);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0229n.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0229n.ON_DESTROY);
        this.f3974d = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0229n.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        A2.g gVar = this.f3974d;
        if (gVar != null) {
            ((C) gVar.f83b).a();
        }
        a(EnumC0229n.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        A2.g gVar = this.f3974d;
        if (gVar != null) {
            C c3 = (C) gVar.f83b;
            int i3 = c3.f3938d + 1;
            c3.f3938d = i3;
            if (i3 == 1 && c3.f3941g) {
                c3.f3943i.d(EnumC0229n.ON_START);
                c3.f3941g = false;
            }
        }
        a(EnumC0229n.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0229n.ON_STOP);
    }
}
