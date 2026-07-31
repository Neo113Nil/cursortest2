package d4;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class o0 extends u implements p0 {
    public static p0 q0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof p0 ? (p0) queryLocalInterface : new n0(iBinder);
    }
}
