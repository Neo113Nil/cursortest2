package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s3;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new s3(24);
    public final int m;
    public final float n;

    public RatingCompat(int i, float f) {
        this.m = i;
        this.n = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.m);
        sb.append(" rating=");
        float f = this.n;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.m);
        parcel.writeFloat(this.n);
    }
}
