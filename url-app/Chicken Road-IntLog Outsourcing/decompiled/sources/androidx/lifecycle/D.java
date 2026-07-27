package androidx.lifecycle;

import android.app.Activity;

/* loaded from: classes.dex */
public final class D extends AbstractC0236f {
    final /* synthetic */ F this$0;

    public D(F f3) {
        this.this$0 = f3;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        this.this$0.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        F f3 = this.this$0;
        int i2 = f3.f4521a + 1;
        f3.f4521a = i2;
        if (i2 == 1 && f3.f4524d) {
            f3.f4526f.e(EnumC0243m.ON_START);
            f3.f4524d = false;
        }
    }
}
