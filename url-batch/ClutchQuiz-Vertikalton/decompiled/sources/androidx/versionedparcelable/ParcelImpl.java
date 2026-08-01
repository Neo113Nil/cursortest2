package androidx.versionedparcelable;

import C0.b;
import android.os.Parcel;
import android.os.Parcelable;
import p0.C0311b;
import p0.InterfaceC0312c;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new b(15);

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0312c f1695a;

    public ParcelImpl(Parcel parcel) {
        this.f1695a = new C0311b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new C0311b(parcel).i(this.f1695a);
    }
}
