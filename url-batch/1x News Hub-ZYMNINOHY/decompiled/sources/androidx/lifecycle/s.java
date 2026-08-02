package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class s extends AbstractC0159a {
    final /* synthetic */ t this$0;

    public static final class a extends AbstractC0159a {
        final /* synthetic */ t this$0;

        public a(t tVar) {
            this.this$0 = tVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.j.e(activity, "activity");
            this.this$0.c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.j.e(activity, "activity");
            t tVar = this.this$0;
            int i3 = tVar.f2401a + 1;
            tVar.f2401a = i3;
            if (i3 == 1 && tVar.f2404d) {
                tVar.f.e(EnumC0165g.ON_START);
                tVar.f2404d = false;
            }
        }
    }

    public s(t tVar) {
        this.this$0 = tVar;
    }

    @Override // androidx.lifecycle.AbstractC0159a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.j.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i3 = w.f2408b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.j.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((w) findFragmentByTag).f2409a = this.this$0.f2407h;
        }
    }

    @Override // androidx.lifecycle.AbstractC0159a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
        t tVar = this.this$0;
        int i3 = tVar.f2402b - 1;
        tVar.f2402b = i3;
        if (i3 == 0) {
            Handler handler = tVar.f2405e;
            kotlin.jvm.internal.j.b(handler);
            handler.postDelayed(tVar.f2406g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.j.e(activity, "activity");
        r.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0159a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
        t tVar = this.this$0;
        int i3 = tVar.f2401a - 1;
        tVar.f2401a = i3;
        if (i3 == 0 && tVar.f2403c) {
            tVar.f.e(EnumC0165g.ON_STOP);
            tVar.f2404d = true;
        }
    }
}
