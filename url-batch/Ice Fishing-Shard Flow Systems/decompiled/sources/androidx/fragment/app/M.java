package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class M implements Parcelable {
    public static final Parcelable.Creator<M> CREATOR = new I1.c(6);

    /* renamed from: d, reason: collision with root package name */
    public String f3593d;

    /* renamed from: e, reason: collision with root package name */
    public int f3594e;

    public M(String str, int i2) {
        this.f3593d = str;
        this.f3594e = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f3593d);
        parcel.writeInt(this.f3594e);
    }
}
