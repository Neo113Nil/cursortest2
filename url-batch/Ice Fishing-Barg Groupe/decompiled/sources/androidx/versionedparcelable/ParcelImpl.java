package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.BUo4iHFctTZi;
import defpackage.dq2;
import defpackage.eq2;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new BUo4iHFctTZi(2);
    public final eq2 rtx2ld2ELZv4;

    public ParcelImpl(Parcel parcel) {
        this.rtx2ld2ELZv4 = new dq2(parcel).RAsUl2FVSrh6();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new dq2(parcel).OPXfSBeufaJ8(this.rtx2ld2ELZv4);
    }
}
