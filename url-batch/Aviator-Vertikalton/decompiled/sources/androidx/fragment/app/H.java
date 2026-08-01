package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class H implements Parcelable {
    public static final Parcelable.Creator<H> CREATOR = new Q.k(3);

    /* renamed from: a, reason: collision with root package name */
    public String f1207a;

    /* renamed from: b, reason: collision with root package name */
    public int f1208b;

    public H(String str, int i) {
        this.f1207a = str;
        this.f1208b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1207a);
        parcel.writeInt(this.f1208b);
    }
}
