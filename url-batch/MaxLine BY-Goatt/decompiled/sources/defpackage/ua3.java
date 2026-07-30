package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ua3 extends i1 {
    public static final Parcelable.Creator<ua3> CREATOR = new va3(0);
    public final int m;
    public final c10 n;
    public final cb3 o;

    public ua3(int i, c10 c10Var, cb3 cb3Var) {
        this.m = i;
        this.n = c10Var;
        this.o = cb3Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        yk3.d0(parcel, 1, 4);
        parcel.writeInt(this.m);
        yk3.V(parcel, 2, this.n, i);
        yk3.V(parcel, 3, this.o, i);
        yk3.c0(parcel, b0);
    }
}
