package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    public int f433f;

    /* renamed from: g, reason: collision with root package name */
    public int f434g;

    /* renamed from: h, reason: collision with root package name */
    public int f435h;

    /* renamed from: i, reason: collision with root package name */
    public int f436i;

    /* renamed from: j, reason: collision with root package name */
    public int f437j;

    class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i7) {
            return new ParcelableVolumeInfo[i7];
        }
    }

    public ParcelableVolumeInfo(int i7, int i8, int i9, int i10, int i11) {
        this.f433f = i7;
        this.f434g = i8;
        this.f435h = i9;
        this.f436i = i10;
        this.f437j = i11;
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f433f = parcel.readInt();
        this.f435h = parcel.readInt();
        this.f436i = parcel.readInt();
        this.f437j = parcel.readInt();
        this.f434g = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f433f);
        parcel.writeInt(this.f435h);
        parcel.writeInt(this.f436i);
        parcel.writeInt(this.f437j);
        parcel.writeInt(this.f434g);
    }
}
