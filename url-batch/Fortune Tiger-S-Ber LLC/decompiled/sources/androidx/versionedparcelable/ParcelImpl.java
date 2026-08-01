package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.b;
import h1.c;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new b(12);

    /* renamed from: f, reason: collision with root package name */
    public final c f683f;

    public ParcelImpl(Parcel parcel) {
        this.f683f = new h1.b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        new h1.b(parcel).i(this.f683f);
    }
}
