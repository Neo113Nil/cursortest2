package androidx.versionedparcelable;

import A1.a;
import A1.c;
import A1.d;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a(0);

    /* renamed from: d, reason: collision with root package name */
    public final d f4119d;

    public ParcelImpl(Parcel parcel) {
        this.f4119d = new c(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        new c(parcel).i(this.f4119d);
    }
}
