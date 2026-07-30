package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s3;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new s3(22);
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.m);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.n);
    }
}
