package i4;

import android.os.Parcel;
import android.os.Parcelable;
import r3.f0;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator<j> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ j createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        int i7 = 0;
        f0 f0Var = null;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                i7 = s3.b.q(parcel, o7);
            } else if (l7 != 2) {
                s3.b.t(parcel, o7);
            } else {
                f0Var = (f0) s3.b.e(parcel, o7, f0.CREATOR);
            }
        }
        s3.b.k(parcel, u6);
        return new j(i7, f0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ j[] newArray(int i7) {
        return new j[i7];
    }
}
