package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class w extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2408b = 0;

    /* renamed from: a, reason: collision with root package name */
    public C0.e f2409a;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final v Companion = new v();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            kotlin.jvm.internal.j.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.j.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            kotlin.jvm.internal.j.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.j.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.j.e(activity, "activity");
            int i3 = w.f2408b;
            u.a(activity, EnumC0165g.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.j.e(activity, "activity");
            int i3 = w.f2408b;
            u.a(activity, EnumC0165g.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.j.e(activity, "activity");
            int i3 = w.f2408b;
            u.a(activity, EnumC0165g.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            kotlin.jvm.internal.j.e(activity, "activity");
            int i3 = w.f2408b;
            u.a(activity, EnumC0165g.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            kotlin.jvm.internal.j.e(activity, "activity");
            int i3 = w.f2408b;
            u.a(activity, EnumC0165g.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            kotlin.jvm.internal.j.e(activity, "activity");
            int i3 = w.f2408b;
            u.a(activity, EnumC0165g.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            kotlin.jvm.internal.j.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.j.e(activity, "activity");
            kotlin.jvm.internal.j.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            kotlin.jvm.internal.j.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.j.e(activity, "activity");
        }
    }

    public final void a(EnumC0165g enumC0165g) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            kotlin.jvm.internal.j.d(activity, "activity");
            u.a(activity, enumC0165g);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0165g.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0165g.ON_DESTROY);
        this.f2409a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0165g.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C0.e eVar = this.f2409a;
        if (eVar != null) {
            ((t) eVar.f201b).c();
        }
        a(EnumC0165g.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C0.e eVar = this.f2409a;
        if (eVar != null) {
            t tVar = (t) eVar.f201b;
            int i3 = tVar.f2401a + 1;
            tVar.f2401a = i3;
            if (i3 == 1 && tVar.f2404d) {
                tVar.f.e(EnumC0165g.ON_START);
                tVar.f2404d = false;
            }
        }
        a(EnumC0165g.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0165g.ON_STOP);
    }
}
