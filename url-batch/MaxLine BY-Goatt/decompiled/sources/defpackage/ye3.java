package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ye3 extends i1 {
    public static final Parcelable.Creator<ye3> CREATOR = new va3(15);
    public final long m;
    public final long n;
    public final boolean o;
    public final Bundle p;
    public final String q;

    public ye3(long j, long j2, boolean z, Bundle bundle, String str) {
        this.m = j;
        this.n = j2;
        this.o = z;
        this.p = bundle;
        this.q = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        yk3.d0(parcel, 1, 8);
        parcel.writeLong(this.m);
        yk3.d0(parcel, 2, 8);
        parcel.writeLong(this.n);
        yk3.d0(parcel, 3, 4);
        parcel.writeInt(this.o ? 1 : 0);
        yk3.T(parcel, 7, this.p);
        yk3.W(parcel, 8, this.q);
        yk3.c0(parcel, b0);
    }
}
