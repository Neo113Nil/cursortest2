package i4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        int i7 = 0;
        Intent intent = null;
        int i8 = 0;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                i7 = s3.b.q(parcel, o7);
            } else if (l7 == 2) {
                i8 = s3.b.q(parcel, o7);
            } else if (l7 != 3) {
                s3.b.t(parcel, o7);
            } else {
                intent = (Intent) s3.b.e(parcel, o7, Intent.CREATOR);
            }
        }
        s3.b.k(parcel, u6);
        return new b(i7, i8, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b[] newArray(int i7) {
        return new b[i7];
    }
}
