package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class K implements Parcelable {
    public static final Parcelable.Creator<K> CREATOR = new F0.a(20);

    /* renamed from: n, reason: collision with root package name */
    public String f4946n;

    /* renamed from: u, reason: collision with root package name */
    public int f4947u;

    public K(String str, int i) {
        this.f4946n = str;
        this.f4947u = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f4946n);
        parcel.writeInt(this.f4947u);
    }
}
