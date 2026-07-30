package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rb2 extends i1 {
    public static final Parcelable.Creator<rb2> CREATOR = new va3(7);
    public final int m;
    public final boolean n;
    public final boolean o;
    public final int p;
    public final int q;

    public rb2(int i, int i2, int i3, boolean z, boolean z2) {
        this.m = i;
        this.n = z;
        this.o = z2;
        this.p = i2;
        this.q = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        yk3.d0(parcel, 1, 4);
        parcel.writeInt(this.m);
        yk3.d0(parcel, 2, 4);
        parcel.writeInt(this.n ? 1 : 0);
        yk3.d0(parcel, 3, 4);
        parcel.writeInt(this.o ? 1 : 0);
        yk3.d0(parcel, 4, 4);
        parcel.writeInt(this.p);
        yk3.d0(parcel, 5, 4);
        parcel.writeInt(this.q);
        yk3.c0(parcel, b0);
    }
}
