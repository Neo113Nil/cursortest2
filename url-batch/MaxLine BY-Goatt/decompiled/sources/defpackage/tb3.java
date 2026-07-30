package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tb3 extends i1 {
    public static final Parcelable.Creator<tb3> CREATOR = new va3(5);
    public final long m;
    public final int n;
    public final long o;

    public tb3(long j, long j2, int i) {
        this.m = j;
        this.n = i;
        this.o = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        yk3.d0(parcel, 1, 8);
        parcel.writeLong(this.m);
        yk3.d0(parcel, 2, 4);
        parcel.writeInt(this.n);
        yk3.d0(parcel, 3, 8);
        parcel.writeLong(this.o);
        yk3.c0(parcel, b0);
    }
}
