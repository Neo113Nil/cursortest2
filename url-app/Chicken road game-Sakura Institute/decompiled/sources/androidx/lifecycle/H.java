package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import w2.C1294c;

@Metadata
/* loaded from: classes.dex */
public class H extends Fragment {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f5429e = 0;

    /* renamed from: d, reason: collision with root package name */
    public C1294c f5430d;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final G Companion = new G();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int i2 = H.f5429e;
            F.a(activity, EnumC0474n.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int i2 = H.f5429e;
            F.a(activity, EnumC0474n.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int i2 = H.f5429e;
            F.a(activity, EnumC0474n.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int i2 = H.f5429e;
            F.a(activity, EnumC0474n.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int i2 = H.f5429e;
            F.a(activity, EnumC0474n.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int i2 = H.f5429e;
            F.a(activity, EnumC0474n.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    public final void a(EnumC0474n enumC0474n) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            Intrinsics.checkNotNullExpressionValue(activity, "activity");
            F.a(activity, enumC0474n);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0474n.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0474n.ON_DESTROY);
        this.f5430d = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0474n.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C1294c c1294c = this.f5430d;
        if (c1294c != null) {
            ((E) c1294c.f11388d).a();
        }
        a(EnumC0474n.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C1294c c1294c = this.f5430d;
        if (c1294c != null) {
            E e4 = (E) c1294c.f11388d;
            int i2 = e4.f5421d + 1;
            e4.f5421d = i2;
            if (i2 == 1 && e4.f5424j) {
                e4.f5426l.d(EnumC0474n.ON_START);
                e4.f5424j = false;
            }
        }
        a(EnumC0474n.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0474n.ON_STOP);
    }
}
