package h0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: h0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0169t implements Parcelable {
    public static final Parcelable.Creator<C0169t> CREATOR = new B0.b(11);

    /* renamed from: a, reason: collision with root package name */
    public int f3114a;

    /* renamed from: b, reason: collision with root package name */
    public int f3115b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3116c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3114a);
        parcel.writeInt(this.f3115b);
        parcel.writeInt(this.f3116c ? 1 : 0);
    }
}
