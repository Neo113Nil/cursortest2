package s7;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q0 extends c7.f {
    @Override // c7.f
    public final /* synthetic */ IInterface c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof h0 ? (h0) queryLocalInterface : new f0(iBinder);
    }

    @Override // c7.f
    public final int j() {
        return 12451000;
    }

    @Override // c7.f
    public final String n() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // c7.f
    public final String o() {
        return "com.google.android.gms.measurement.START";
    }
}
