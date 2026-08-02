package l1;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: l1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1265l implements Parcelable {
    public static final Parcelable.Creator<C1265l> CREATOR = new H.h(22);

    /* renamed from: a, reason: collision with root package name */
    public int f14245a;

    /* renamed from: b, reason: collision with root package name */
    public int f14246b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14247c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f14245a);
        parcel.writeInt(this.f14246b);
        parcel.writeInt(this.f14247c ? 1 : 0);
    }
}
