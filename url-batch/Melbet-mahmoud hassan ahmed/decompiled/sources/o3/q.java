package o3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class q implements Parcelable.Creator<d> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ d createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        String str = null;
        int i7 = 0;
        long j7 = -1;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                str = s3.b.f(parcel, o7);
            } else if (l7 == 2) {
                i7 = s3.b.q(parcel, o7);
            } else if (l7 != 3) {
                s3.b.t(parcel, o7);
            } else {
                j7 = s3.b.r(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new d(str, i7, j7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ d[] newArray(int i7) {
        return new d[i7];
    }
}
