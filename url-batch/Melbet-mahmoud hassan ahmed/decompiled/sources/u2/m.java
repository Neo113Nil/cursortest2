package u2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class m implements Parcelable.Creator<g> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ g createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        boolean z6 = false;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                z6 = s3.b.m(parcel, o7);
            } else if (l7 == 2) {
                iBinder = s3.b.p(parcel, o7);
            } else if (l7 != 3) {
                s3.b.t(parcel, o7);
            } else {
                iBinder2 = s3.b.p(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new g(z6, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g[] newArray(int i7) {
        return new g[i7];
    }
}
