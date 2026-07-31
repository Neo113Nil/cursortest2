package i4;

import android.os.Parcel;
import android.os.Parcelable;
import r3.h0;

/* loaded from: classes.dex */
public final class m implements Parcelable.Creator<l> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ l createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        o3.b bVar = null;
        h0 h0Var = null;
        int i7 = 0;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                i7 = s3.b.q(parcel, o7);
            } else if (l7 == 2) {
                bVar = (o3.b) s3.b.e(parcel, o7, o3.b.CREATOR);
            } else if (l7 != 3) {
                s3.b.t(parcel, o7);
            } else {
                h0Var = (h0) s3.b.e(parcel, o7, h0.CREATOR);
            }
        }
        s3.b.k(parcel, u6);
        return new l(i7, bVar, h0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ l[] newArray(int i7) {
        return new l[i7];
    }
}
