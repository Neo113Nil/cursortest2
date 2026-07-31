package l3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator<d> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ d createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                str = s3.b.f(parcel, o7);
            } else if (l7 != 2) {
                s3.b.t(parcel, o7);
            } else {
                str2 = s3.b.f(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new d(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d[] newArray(int i7) {
        return new d[i7];
    }
}
