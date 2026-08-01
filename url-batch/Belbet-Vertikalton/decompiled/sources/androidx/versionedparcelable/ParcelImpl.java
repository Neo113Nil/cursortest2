package androidx.versionedparcelable;

import B0.b;
import android.os.Parcel;
import android.os.Parcelable;
import r0.c;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new b(15);

    /* renamed from: a, reason: collision with root package name */
    public final c f2150a;

    public ParcelImpl(Parcel parcel) {
        this.f2150a = new r0.b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new r0.b(parcel).i(this.f2150a);
    }
}
