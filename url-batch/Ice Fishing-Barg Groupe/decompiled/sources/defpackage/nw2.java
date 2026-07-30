package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class nw2 extends POWyO8hTM6YC {
    public static final Parcelable.Creator<nw2> CREATOR = new BUo4iHFctTZi(10);
    public final xq OPXfSBeufaJ8;
    public final int rtx2ld2ELZv4;
    public final tw2 wdg6QnbFHrFF;

    public nw2(int i, xq xqVar, tw2 tw2Var) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = xqVar;
        this.wdg6QnbFHrFF = tw2Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D0aTLcX6Uhyo = ki0.D0aTLcX6Uhyo(parcel, 20293);
        ki0.JTxCbbCwomzt(parcel, 1, 4);
        parcel.writeInt(this.rtx2ld2ELZv4);
        ki0.yQRudnv4La6p(parcel, 2, this.OPXfSBeufaJ8, i);
        ki0.yQRudnv4La6p(parcel, 3, this.wdg6QnbFHrFF, i);
        ki0.PsecLrZVVK61(parcel, D0aTLcX6Uhyo);
    }
}
