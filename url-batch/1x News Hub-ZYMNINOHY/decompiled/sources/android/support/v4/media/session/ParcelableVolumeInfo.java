package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new b(0);

    /* renamed from: a, reason: collision with root package name */
    public int f1945a;

    /* renamed from: b, reason: collision with root package name */
    public int f1946b;

    /* renamed from: c, reason: collision with root package name */
    public int f1947c;

    /* renamed from: d, reason: collision with root package name */
    public int f1948d;

    /* renamed from: e, reason: collision with root package name */
    public int f1949e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f1945a);
        parcel.writeInt(this.f1947c);
        parcel.writeInt(this.f1948d);
        parcel.writeInt(this.f1949e);
        parcel.writeInt(this.f1946b);
    }
}
