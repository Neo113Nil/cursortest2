package androidx.versionedparcelable;

import Q.k;
import android.os.Parcel;
import android.os.Parcelable;
import m0.b;
import m0.c;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new k(14);

    /* renamed from: a, reason: collision with root package name */
    public final c f1497a;

    public ParcelImpl(Parcel parcel) {
        this.f1497a = new b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new b(parcel).i(this.f1497a);
    }
}
