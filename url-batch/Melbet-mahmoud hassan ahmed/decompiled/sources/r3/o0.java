package r3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class o0 implements Parcelable.Creator<q> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ q createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = false;
        int i8 = 0;
        int i9 = 0;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                i7 = s3.b.q(parcel, o7);
            } else if (l7 == 2) {
                z6 = s3.b.m(parcel, o7);
            } else if (l7 == 3) {
                z7 = s3.b.m(parcel, o7);
            } else if (l7 == 4) {
                i8 = s3.b.q(parcel, o7);
            } else if (l7 != 5) {
                s3.b.t(parcel, o7);
            } else {
                i9 = s3.b.q(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new q(i7, z6, z7, i8, i9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ q[] newArray(int i7) {
        return new q[i7];
    }
}
