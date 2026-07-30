package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ip3 extends i1 {
    public static final Parcelable.Creator<ip3> CREATOR = new va3(21);
    public final String m;
    public final long n;
    public final int o;

    public ip3(String str, int i, long j) {
        this.m = str;
        this.n = j;
        this.o = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        yk3.W(parcel, 1, this.m);
        yk3.d0(parcel, 2, 8);
        parcel.writeLong(this.n);
        yk3.d0(parcel, 3, 4);
        parcel.writeInt(this.o);
        yk3.c0(parcel, b0);
    }
}
