package androidx.versionedparcelable;

import E1.a;
import E1.c;
import E1.d;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a(0);

    /* renamed from: d, reason: collision with root package name */
    public final d f5255d;

    public ParcelImpl(Parcel parcel) {
        this.f5255d = new c(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        new c(parcel).i(this.f5255d);
    }
}
