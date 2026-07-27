package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r extends AbstractC0468h {
    @Override // androidx.lifecycle.AbstractC0468h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i2 = H.f5429e;
        F.b(activity);
    }
}
