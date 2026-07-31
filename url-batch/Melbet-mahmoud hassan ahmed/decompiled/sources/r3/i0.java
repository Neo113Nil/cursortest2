package r3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i0 implements Parcelable.Creator<h0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ h0 createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        IBinder iBinder = null;
        o3.b bVar = null;
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = false;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                i7 = s3.b.q(parcel, o7);
            } else if (l7 == 2) {
                iBinder = s3.b.p(parcel, o7);
            } else if (l7 == 3) {
                bVar = (o3.b) s3.b.e(parcel, o7, o3.b.CREATOR);
            } else if (l7 == 4) {
                z6 = s3.b.m(parcel, o7);
            } else if (l7 != 5) {
                s3.b.t(parcel, o7);
            } else {
                z7 = s3.b.m(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new h0(i7, iBinder, bVar, z6, z7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ h0[] newArray(int i7) {
        return new h0[i7];
    }
}
