package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class nx2 extends POWyO8hTM6YC {
    public static final Parcelable.Creator<nx2> CREATOR = new BUo4iHFctTZi(19);
    public t70[] OPXfSBeufaJ8;
    public cr dgRBjINgWbAK;
    public Bundle rtx2ld2ELZv4;
    public int wdg6QnbFHrFF;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D0aTLcX6Uhyo = ki0.D0aTLcX6Uhyo(parcel, 20293);
        Bundle bundle = this.rtx2ld2ELZv4;
        if (bundle != null) {
            int D0aTLcX6Uhyo2 = ki0.D0aTLcX6Uhyo(parcel, 1);
            parcel.writeBundle(bundle);
            ki0.PsecLrZVVK61(parcel, D0aTLcX6Uhyo2);
        }
        ki0.qudtW7lwm99e(parcel, 2, this.OPXfSBeufaJ8, i);
        int i2 = this.wdg6QnbFHrFF;
        ki0.JTxCbbCwomzt(parcel, 3, 4);
        parcel.writeInt(i2);
        ki0.yQRudnv4La6p(parcel, 4, this.dgRBjINgWbAK, i);
        ki0.PsecLrZVVK61(parcel, D0aTLcX6Uhyo);
    }
}
