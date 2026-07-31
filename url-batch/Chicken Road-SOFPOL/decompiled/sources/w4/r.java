package w4;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new e5.a(3);

    /* renamed from: d, reason: collision with root package name */
    public int f8023d;

    /* renamed from: e, reason: collision with root package name */
    public int f8024e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8025f;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8023d);
        parcel.writeInt(this.f8024e);
        parcel.writeInt(this.f8025f ? 1 : 0);
    }
}
