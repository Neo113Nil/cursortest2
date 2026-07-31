package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final int f9798b;

    /* renamed from: c, reason: collision with root package name */
    private final float f9799c;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public RatingCompat[] newArray(int i4) {
            return new RatingCompat[i4];
        }
    }

    RatingCompat(int i4, float f4) {
        this.f9798b = i4;
        this.f9799c = f4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f9798b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f9798b);
        sb.append(" rating=");
        float f4 = this.f9799c;
        sb.append(f4 < 0.0f ? "unrated" : String.valueOf(f4));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f9798b);
        parcel.writeFloat(this.f9799c);
    }
}
