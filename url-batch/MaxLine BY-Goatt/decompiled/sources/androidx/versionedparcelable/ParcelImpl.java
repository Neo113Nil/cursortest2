package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.o43;
import defpackage.p43;
import defpackage.s3;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new s3(18);
    public final p43 m;

    public ParcelImpl(Parcel parcel) {
        this.m = new o43(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new o43(parcel).k(this.m);
    }
}
