package androidx.versionedparcelable;

import S.k;
import android.os.Parcel;
import android.os.Parcelable;
import o0.C0253b;
import o0.InterfaceC0254c;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new k(14);

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0254c f1705a;

    public ParcelImpl(Parcel parcel) {
        this.f1705a = new C0253b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new C0253b(parcel).i(this.f1705a);
    }
}
