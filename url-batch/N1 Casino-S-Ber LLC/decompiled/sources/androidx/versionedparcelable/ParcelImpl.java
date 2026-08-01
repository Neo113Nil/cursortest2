package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.g80;
import defpackage.h80;
import defpackage.r1;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new r1(13);
    public final h80 f;

    public ParcelImpl(Parcel parcel) {
        this.f = new g80(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new g80(parcel).i(this.f);
    }
}
