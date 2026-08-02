package androidx.versionedparcelable;

import H.h;
import android.os.Parcel;
import android.os.Parcelable;
import r1.C1401b;
import r1.InterfaceC1402c;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new h(29);

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1402c f5198a;

    public ParcelImpl(Parcel parcel) {
        this.f5198a = new C1401b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        new C1401b(parcel).i(this.f5198a);
    }
}
