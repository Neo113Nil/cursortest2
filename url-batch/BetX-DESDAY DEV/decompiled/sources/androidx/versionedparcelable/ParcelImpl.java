package androidx.versionedparcelable;

import Q.k;
import android.os.Parcel;
import android.os.Parcelable;
import l0.b;
import l0.c;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new k(15);

    /* renamed from: a, reason: collision with root package name */
    public final c f1631a;

    public ParcelImpl(Parcel parcel) {
        this.f1631a = new b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new b(parcel).i(this.f1631a);
    }
}
