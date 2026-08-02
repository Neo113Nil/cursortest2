package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aqr;
import defpackage.aqs;
import defpackage.aqt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aqr(0);
    private final aqt a;

    public ParcelImpl(Parcel parcel) {
        this.a = new aqs(parcel).c();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new aqs(parcel).k(this.a);
    }
}
