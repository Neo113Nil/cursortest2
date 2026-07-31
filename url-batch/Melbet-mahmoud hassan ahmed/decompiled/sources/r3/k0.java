package r3;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class k0 extends b4.b implements k {
    public k0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // b4.b
    protected final boolean E(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            l6(parcel.readInt(), parcel.readStrongBinder(), (Bundle) b4.c.b(parcel, Bundle.CREATOR));
        } else if (i7 == 2) {
            U3(parcel.readInt(), (Bundle) b4.c.b(parcel, Bundle.CREATOR));
        } else {
            if (i7 != 3) {
                return false;
            }
            y5(parcel.readInt(), parcel.readStrongBinder(), (v0) b4.c.b(parcel, v0.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
