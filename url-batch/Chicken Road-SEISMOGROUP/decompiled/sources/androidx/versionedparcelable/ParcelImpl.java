package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import p.a;
import p.c;
import p.d;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final d f508a;

    public ParcelImpl(Parcel parcel) {
        this.f508a = new c(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        new c(parcel).i(this.f508a);
    }
}
