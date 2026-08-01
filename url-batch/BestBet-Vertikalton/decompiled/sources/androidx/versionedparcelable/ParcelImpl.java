package androidx.versionedparcelable;

import F0.b;
import android.os.Parcel;
import android.os.Parcelable;
import r0.C0314b;
import r0.InterfaceC0315c;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new b(15);

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0315c f2036a;

    public ParcelImpl(Parcel parcel) {
        this.f2036a = new C0314b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new C0314b(parcel).i(this.f2036a);
    }
}
