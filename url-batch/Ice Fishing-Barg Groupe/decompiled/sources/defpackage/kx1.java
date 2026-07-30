package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class kx1 extends POWyO8hTM6YC {
    public static final Parcelable.Creator<kx1> CREATOR = new BUo4iHFctTZi(15);
    public final boolean OPXfSBeufaJ8;
    public final int dgRBjINgWbAK;
    public final int rtx2ld2ELZv4;
    public final boolean wdg6QnbFHrFF;
    public final int x50lh2ztY7Y5;

    public kx1(int i, boolean z, boolean z2, int i2, int i3) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = z;
        this.wdg6QnbFHrFF = z2;
        this.dgRBjINgWbAK = i2;
        this.x50lh2ztY7Y5 = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D0aTLcX6Uhyo = ki0.D0aTLcX6Uhyo(parcel, 20293);
        ki0.JTxCbbCwomzt(parcel, 1, 4);
        parcel.writeInt(this.rtx2ld2ELZv4);
        ki0.JTxCbbCwomzt(parcel, 2, 4);
        parcel.writeInt(this.OPXfSBeufaJ8 ? 1 : 0);
        ki0.JTxCbbCwomzt(parcel, 3, 4);
        parcel.writeInt(this.wdg6QnbFHrFF ? 1 : 0);
        ki0.JTxCbbCwomzt(parcel, 4, 4);
        parcel.writeInt(this.dgRBjINgWbAK);
        ki0.JTxCbbCwomzt(parcel, 5, 4);
        parcel.writeInt(this.x50lh2ztY7Y5);
        ki0.PsecLrZVVK61(parcel, D0aTLcX6Uhyo);
    }
}
