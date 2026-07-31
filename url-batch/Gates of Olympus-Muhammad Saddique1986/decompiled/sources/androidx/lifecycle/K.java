package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class K extends Fragment {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f5174e = 0;

    /* renamed from: d, reason: collision with root package name */
    public B.Y f5175d;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final J Companion = new J();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            f2.j.f(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            f2.j.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            f2.j.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            f2.j.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            f2.j.f(activity, "activity");
            int i3 = K.f5174e;
            I.a(activity, EnumC0285n.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            f2.j.f(activity, "activity");
            int i3 = K.f5174e;
            I.a(activity, EnumC0285n.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            f2.j.f(activity, "activity");
            int i3 = K.f5174e;
            I.a(activity, EnumC0285n.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            f2.j.f(activity, "activity");
            int i3 = K.f5174e;
            I.a(activity, EnumC0285n.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            f2.j.f(activity, "activity");
            int i3 = K.f5174e;
            I.a(activity, EnumC0285n.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            f2.j.f(activity, "activity");
            int i3 = K.f5174e;
            I.a(activity, EnumC0285n.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            f2.j.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            f2.j.f(activity, "activity");
            f2.j.f(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            f2.j.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            f2.j.f(activity, "activity");
        }
    }

    public final void a(EnumC0285n enumC0285n) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            f2.j.e(activity, "activity");
            I.a(activity, enumC0285n);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0285n.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0285n.ON_DESTROY);
        this.f5175d = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0285n.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        B.Y y3 = this.f5175d;
        if (y3 != null) {
            ((C) y3.f334d).a();
        }
        a(EnumC0285n.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        B.Y y3 = this.f5175d;
        if (y3 != null) {
            C c2 = (C) y3.f334d;
            int i3 = c2.f5139d + 1;
            c2.f5139d = i3;
            if (i3 == 1 && c2.f5142g) {
                c2.f5144i.d(EnumC0285n.ON_START);
                c2.f5142g = false;
            }
        }
        a(EnumC0285n.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0285n.ON_STOP);
    }
}
