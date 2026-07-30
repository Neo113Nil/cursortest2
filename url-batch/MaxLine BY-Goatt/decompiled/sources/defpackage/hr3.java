package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hr3 extends i1 {
    public static final Parcelable.Creator<hr3> CREATOR = new va3(26);
    public final boolean m;
    public final String n;
    public final int o;
    public final int p;

    public hr3(int i, int i2, String str, boolean z) {
        this.m = z;
        this.n = str;
        this.o = mi2.r(i) - 1;
        this.p = ij2.o(i2) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        yk3.d0(parcel, 1, 4);
        parcel.writeInt(this.m ? 1 : 0);
        yk3.W(parcel, 2, this.n);
        yk3.d0(parcel, 3, 4);
        parcel.writeInt(this.o);
        yk3.d0(parcel, 4, 4);
        parcel.writeInt(this.p);
        yk3.c0(parcel, b0);
    }
}
