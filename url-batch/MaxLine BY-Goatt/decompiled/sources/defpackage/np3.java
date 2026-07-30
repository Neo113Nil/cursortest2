package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class np3 extends i1 {
    public static final Parcelable.Creator<np3> CREATOR = new va3(22);
    public final long m;
    public byte[] n;
    public final String o;
    public final Bundle p;
    public final int q;
    public final long r;
    public String s;

    public np3(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.m = j;
        this.n = bArr;
        this.o = str;
        this.p = bundle;
        this.q = i;
        this.r = j2;
        this.s = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        yk3.d0(parcel, 1, 8);
        parcel.writeLong(this.m);
        byte[] bArr = this.n;
        if (bArr != null) {
            int b02 = yk3.b0(parcel, 2);
            parcel.writeByteArray(bArr);
            yk3.c0(parcel, b02);
        }
        yk3.W(parcel, 3, this.o);
        yk3.T(parcel, 4, this.p);
        yk3.d0(parcel, 5, 4);
        parcel.writeInt(this.q);
        yk3.d0(parcel, 6, 8);
        parcel.writeLong(this.r);
        yk3.W(parcel, 7, this.s);
        yk3.c0(parcel, b0);
    }
}
