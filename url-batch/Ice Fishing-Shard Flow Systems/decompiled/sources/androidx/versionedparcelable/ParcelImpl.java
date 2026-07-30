package androidx.versionedparcelable;

import I1.c;
import android.os.Parcel;
import android.os.Parcelable;
import t0.C0903b;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new c(23);

    /* renamed from: d, reason: collision with root package name */
    public final t0.c f4068d;

    public ParcelImpl(Parcel parcel) {
        this.f4068d = new C0903b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        new C0903b(parcel).i(this.f4068d);
    }
}
