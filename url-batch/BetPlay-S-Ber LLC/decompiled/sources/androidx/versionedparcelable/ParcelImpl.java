package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.n80;
import defpackage.o80;
import defpackage.v1;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new v1(14);
    public final o80 f;

    public ParcelImpl(Parcel parcel) {
        this.f = new n80(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new n80(parcel).i(this.f);
    }
}
