package androidx.lifecycle;

import android.app.Activity;

/* loaded from: classes.dex */
public final class l extends a {
    final /* synthetic */ n this$0;

    public l(n nVar) {
        this.this$0 = nVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        e0.h.e(activity, "activity");
        this.this$0.b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        e0.h.e(activity, "activity");
        n nVar = this.this$0;
        int i2 = nVar.f442a + 1;
        nVar.f442a = i2;
        if (i2 == 1 && nVar.f445d) {
            nVar.f447f.a(d.ON_START);
            nVar.f445d = false;
        }
    }
}
