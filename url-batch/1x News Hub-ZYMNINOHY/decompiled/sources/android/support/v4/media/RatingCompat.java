package android.support.v4.media;

import H.h;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new h(26);

    /* renamed from: a, reason: collision with root package name */
    public final int f1939a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1940b;

    public RatingCompat(int i3, float f) {
        this.f1939a = i3;
        this.f1940b = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f1939a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f1939a);
        sb.append(" rating=");
        float f = this.f1940b;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f1939a);
        parcel.writeFloat(this.f1940b);
    }
}
