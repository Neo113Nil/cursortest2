package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class pv2 extends POWyO8hTM6YC {
    public static final Parcelable.Creator<pv2> CREATOR = new BUo4iHFctTZi(7);
    public final int OPXfSBeufaJ8;
    public final int rtx2ld2ELZv4;
    public final Intent wdg6QnbFHrFF;

    public pv2(int i, int i2, Intent intent) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = i2;
        this.wdg6QnbFHrFF = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D0aTLcX6Uhyo = ki0.D0aTLcX6Uhyo(parcel, 20293);
        ki0.JTxCbbCwomzt(parcel, 1, 4);
        parcel.writeInt(this.rtx2ld2ELZv4);
        ki0.JTxCbbCwomzt(parcel, 2, 4);
        parcel.writeInt(this.OPXfSBeufaJ8);
        ki0.yQRudnv4La6p(parcel, 3, this.wdg6QnbFHrFF, i);
        ki0.PsecLrZVVK61(parcel, D0aTLcX6Uhyo);
    }
}
