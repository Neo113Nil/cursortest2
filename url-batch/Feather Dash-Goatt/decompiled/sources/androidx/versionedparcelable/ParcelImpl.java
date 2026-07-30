package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cn1;
import defpackage.dn1;
import defpackage.g2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new g2(3);
    public final dn1 d;

    public ParcelImpl(Parcel parcel) {
        this.d = new cn1(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new cn1(parcel).i(this.d);
    }
}
