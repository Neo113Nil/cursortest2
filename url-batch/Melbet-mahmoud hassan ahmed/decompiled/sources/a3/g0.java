package a3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g0 implements Parcelable.Creator<f0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ f0 createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        String str = null;
        int i7 = 0;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                str = s3.b.f(parcel, o7);
            } else if (l7 != 2) {
                s3.b.t(parcel, o7);
            } else {
                i7 = s3.b.q(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new f0(str, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f0[] newArray(int i7) {
        return new f0[i7];
    }
}
