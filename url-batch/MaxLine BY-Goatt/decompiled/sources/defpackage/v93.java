package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class v93 extends i1 {
    public static final Parcelable.Creator<v93> CREATOR = new s3(27);
    public final int m;
    public final int n;
    public final Intent o;

    public v93(int i, int i2, Intent intent) {
        this.m = i;
        this.n = i2;
        this.o = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        yk3.d0(parcel, 1, 4);
        parcel.writeInt(this.m);
        yk3.d0(parcel, 2, 4);
        parcel.writeInt(this.n);
        yk3.V(parcel, 3, this.o, i);
        yk3.c0(parcel, b0);
    }
}
