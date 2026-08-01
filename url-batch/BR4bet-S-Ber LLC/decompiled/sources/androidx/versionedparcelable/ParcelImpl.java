package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.rb0;
import defpackage.s1;
import defpackage.sb0;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new s1(13);
    public final sb0 f;

    public ParcelImpl(Parcel parcel) {
        this.f = new rb0(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new rb0(parcel).i(this.f);
    }
}
