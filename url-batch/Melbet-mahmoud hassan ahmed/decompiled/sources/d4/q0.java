package d4;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class q0 extends u implements r0 {
    public q0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // d4.u
    protected final boolean E(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        x2((Bundle) h0.b(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
