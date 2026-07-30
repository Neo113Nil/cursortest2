package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import d4.a;
import d4.c;
import d4.d;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a(0);

    /* renamed from: f, reason: collision with root package name */
    public final d f1130f;

    public ParcelImpl(Parcel parcel) {
        this.f1130f = new c(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        new c(parcel).i(this.f1130f);
    }
}
