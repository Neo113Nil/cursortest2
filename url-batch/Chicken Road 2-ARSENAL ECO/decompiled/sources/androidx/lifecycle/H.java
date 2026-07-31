package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class H extends Fragment {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f3464g = 0;

    /* renamed from: f, reason: collision with root package name */
    public V5.g f3465f;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final G Companion = new G();

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
            int i7 = H.f3464g;
            F.a(activity, EnumC0246m.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.i.e(activity, "activity");
            int i7 = H.f3464g;
            F.a(activity, EnumC0246m.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.i.e(activity, "activity");
            int i7 = H.f3464g;
            F.a(activity, EnumC0246m.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            kotlin.jvm.internal.i.e(activity, "activity");
            int i7 = H.f3464g;
            F.a(activity, EnumC0246m.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            kotlin.jvm.internal.i.e(activity, "activity");
            int i7 = H.f3464g;
            F.a(activity, EnumC0246m.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            kotlin.jvm.internal.i.e(activity, "activity");
            int i7 = H.f3464g;
            F.a(activity, EnumC0246m.ON_STOP);
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

    public final void a(EnumC0246m enumC0246m) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            kotlin.jvm.internal.i.d(activity, "activity");
            F.a(activity, enumC0246m);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0246m.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0246m.ON_DESTROY);
        this.f3465f = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0246m.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        V5.g gVar = this.f3465f;
        if (gVar != null) {
            ((E) gVar.f2734g).a();
        }
        a(EnumC0246m.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        V5.g gVar = this.f3465f;
        if (gVar != null) {
            E e4 = (E) gVar.f2734g;
            int i7 = e4.f3456f + 1;
            e4.f3456f = i7;
            if (i7 == 1 && e4.f3459i) {
                e4.f3461k.e(EnumC0246m.ON_START);
                e4.f3459i = false;
            }
        }
        a(EnumC0246m.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0246m.ON_STOP);
    }
}
