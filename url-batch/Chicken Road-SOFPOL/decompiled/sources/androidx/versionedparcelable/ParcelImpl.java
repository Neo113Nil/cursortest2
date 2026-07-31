package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import e5.a;
import e5.c;
import e5.d;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a(0);

    /* renamed from: d, reason: collision with root package name */
    public final d f958d;

    public ParcelImpl(Parcel parcel) {
        this.f958d = new c(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new c(parcel).i(this.f958d);
    }
}
