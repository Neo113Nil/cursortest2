package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xr0 implements Parcelable {
    public static final Parcelable.Creator<xr0> CREATOR = new s3(5);
    public String m;
    public int n;

    public xr0(String str, int i) {
        this.m = str;
        this.n = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
    }
}
