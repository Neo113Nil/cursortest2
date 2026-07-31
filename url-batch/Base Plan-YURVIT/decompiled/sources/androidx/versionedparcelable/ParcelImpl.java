package androidx.versionedparcelable;

import C.k;
import R.b;
import R.c;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new k(4);

    /* renamed from: e, reason: collision with root package name */
    public final c f1722e;

    public ParcelImpl(Parcel parcel) {
        this.f1722e = new b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        new b(parcel).i(this.f1722e);
    }
}
