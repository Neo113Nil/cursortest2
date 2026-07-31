package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public int f9807b;

    /* renamed from: c, reason: collision with root package name */
    public int f9808c;

    /* renamed from: d, reason: collision with root package name */
    public int f9809d;

    /* renamed from: e, reason: collision with root package name */
    public int f9810e;

    /* renamed from: f, reason: collision with root package name */
    public int f9811f;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i4) {
            return new ParcelableVolumeInfo[i4];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f9807b = parcel.readInt();
        this.f9809d = parcel.readInt();
        this.f9810e = parcel.readInt();
        this.f9811f = parcel.readInt();
        this.f9808c = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f9807b);
        parcel.writeInt(this.f9809d);
        parcel.writeInt(this.f9810e);
        parcel.writeInt(this.f9811f);
        parcel.writeInt(this.f9808c);
    }
}
