package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ol0;
import defpackage.pl0;
import defpackage.u1;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new u1(14);
    public final pl0 f;

    public ParcelImpl(Parcel parcel) {
        this.f = new ol0(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new ol0(parcel).i(this.f);
    }
}
