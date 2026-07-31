package r3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v implements Parcelable.Creator<r> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ r createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        int i7 = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                i7 = s3.b.q(parcel, o7);
            } else if (l7 != 2) {
                s3.b.t(parcel, o7);
            } else {
                arrayList = s3.b.j(parcel, o7, m.CREATOR);
            }
        }
        s3.b.k(parcel, u6);
        return new r(i7, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ r[] newArray(int i7) {
        return new r[i7];
    }
}
