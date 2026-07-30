package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class rg1 extends t0 {
    public static final Parcelable.Creator<rg1> CREATOR = new g2(8);
    public final int d;
    public List e;

    public rg1(int i, List list) {
        this.d = i;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int P = y90.P(parcel, 20293);
        y90.R(parcel, 1, 4);
        parcel.writeInt(this.d);
        y90.O(parcel, 2, this.e);
        y90.Q(parcel, P);
    }
}
