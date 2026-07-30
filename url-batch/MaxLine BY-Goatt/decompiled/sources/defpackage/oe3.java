package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class oe3 extends md3 implements ve3 {
    public oe3() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // defpackage.md3
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int e = e();
            parcel2.writeNoException();
            parcel2.writeInt(e);
            return true;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Bundle bundle = (Bundle) od3.a(parcel, Bundle.CREATOR);
        long readLong = parcel.readLong();
        od3.d(parcel);
        i(readString, readString2, bundle, readLong);
        parcel2.writeNoException();
        return true;
    }
}
