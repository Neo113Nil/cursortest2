package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ym implements Parcelable {
    public static final Parcelable.Creator<ym> CREATOR = new s3(3);
    public final ArrayList m;
    public final ArrayList n;

    public ym(Parcel parcel) {
        this.m = parcel.createStringArrayList();
        this.n = parcel.createTypedArrayList(xm.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.m);
        parcel.writeTypedList(this.n);
    }
}
