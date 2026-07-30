package defpackage;

import android.view.autofill.AutofillValue;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.internal.FeatureManager;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements FeatureManager.Callback {
    public static /* bridge */ /* synthetic */ AutofillValue a(Object obj) {
        return (AutofillValue) obj;
    }

    public static /* synthetic */ void b() {
        throw new bs1();
    }

    public static /* synthetic */ void c(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void d(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public void onCompleted(boolean z) {
        ActivityLifecycleTracker.startTracking$lambda$0(z);
    }
}
