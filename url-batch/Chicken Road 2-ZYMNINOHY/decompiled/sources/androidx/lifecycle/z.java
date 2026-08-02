package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class z extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f5083b = 0;

    /* renamed from: a, reason: collision with root package name */
    public t1.h f5084a;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final y Companion = new y();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            kotlin.jvm.internal.i.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            kotlin.jvm.internal.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.i.e(activity, "activity");
            int i4 = z.f5083b;
            x.a(activity, EnumC0229h.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.i.e(activity, "activity");
            int i4 = z.f5083b;
            x.a(activity, EnumC0229h.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.i.e(activity, "activity");
            int i4 = z.f5083b;
            x.a(activity, EnumC0229h.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            kotlin.jvm.internal.i.e(activity, "activity");
            int i4 = z.f5083b;
            x.a(activity, EnumC0229h.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            kotlin.jvm.internal.i.e(activity, "activity");
            int i4 = z.f5083b;
            x.a(activity, EnumC0229h.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            kotlin.jvm.internal.i.e(activity, "activity");
            int i4 = z.f5083b;
            x.a(activity, EnumC0229h.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            kotlin.jvm.internal.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.i.e(activity, "activity");
            kotlin.jvm.internal.i.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            kotlin.jvm.internal.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.i.e(activity, "activity");
        }
    }

    public final void a(EnumC0229h enumC0229h) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            kotlin.jvm.internal.i.d(activity, "activity");
            x.a(activity, enumC0229h);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0229h.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0229h.ON_DESTROY);
        this.f5084a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0229h.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        t1.h hVar = this.f5084a;
        if (hVar != null) {
            ((w) hVar.f15398b).a();
        }
        a(EnumC0229h.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        t1.h hVar = this.f5084a;
        if (hVar != null) {
            w wVar = (w) hVar.f15398b;
            int i4 = wVar.f5075a + 1;
            wVar.f5075a = i4;
            if (i4 == 1 && wVar.f5078d) {
                wVar.f5080f.e(EnumC0229h.ON_START);
                wVar.f5078d = false;
            }
        }
        a(EnumC0229h.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0229h.ON_STOP);
    }
}
