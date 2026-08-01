package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import c7.p;
import p5.b;
import p5.c;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new p(11);

    /* renamed from: d, reason: collision with root package name */
    public final c f755d;

    public ParcelImpl(Parcel parcel) {
        this.f755d = new b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        new b(parcel).i(this.f755d);
    }
}
