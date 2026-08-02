package t0;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import v2.Z;

/* loaded from: classes.dex */
public final class m implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f15335a;

    public m(r rVar) {
        this.f15335a = rVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        Z z4 = r.f15365k;
        this.f15335a.e();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        Z z4 = r.f15365k;
        this.f15335a.e();
    }
}
