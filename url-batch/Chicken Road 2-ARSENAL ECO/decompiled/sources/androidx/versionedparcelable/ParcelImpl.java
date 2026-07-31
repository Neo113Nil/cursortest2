package androidx.versionedparcelable;

import I.j;
import a0.C0221b;
import a0.InterfaceC0222c;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new j(14);

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0222c f3542f;

    public ParcelImpl(Parcel parcel) {
        this.f3542f = new C0221b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        new C0221b(parcel).i(this.f3542f);
    }
}
