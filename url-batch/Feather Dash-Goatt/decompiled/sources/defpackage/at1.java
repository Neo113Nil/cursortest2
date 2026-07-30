package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class at1 extends t0 {
    public static final Parcelable.Creator<at1> CREATOR = new g2(12);
    public final int d;
    public final fm e;
    public final ht1 g;

    public at1(int i, fm fmVar, ht1 ht1Var) {
        this.d = i;
        this.e = fmVar;
        this.g = ht1Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int P = y90.P(parcel, 20293);
        y90.R(parcel, 1, 4);
        parcel.writeInt(this.d);
        y90.L(parcel, 2, this.e, i);
        y90.L(parcel, 3, this.g, i);
        y90.Q(parcel, P);
    }
}
