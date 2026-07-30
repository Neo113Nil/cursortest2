package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class cr extends POWyO8hTM6YC {
    public static final Parcelable.Creator<cr> CREATOR = new BUo4iHFctTZi(20);
    public final boolean OPXfSBeufaJ8;
    public final int[] cpQdD2nAriOS;
    public final int[] dgRBjINgWbAK;
    public final kx1 rtx2ld2ELZv4;
    public final boolean wdg6QnbFHrFF;
    public final int x50lh2ztY7Y5;

    public cr(kx1 kx1Var, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.rtx2ld2ELZv4 = kx1Var;
        this.OPXfSBeufaJ8 = z;
        this.wdg6QnbFHrFF = z2;
        this.dgRBjINgWbAK = iArr;
        this.x50lh2ztY7Y5 = i;
        this.cpQdD2nAriOS = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D0aTLcX6Uhyo = ki0.D0aTLcX6Uhyo(parcel, 20293);
        ki0.yQRudnv4La6p(parcel, 1, this.rtx2ld2ELZv4, i);
        ki0.JTxCbbCwomzt(parcel, 2, 4);
        parcel.writeInt(this.OPXfSBeufaJ8 ? 1 : 0);
        ki0.JTxCbbCwomzt(parcel, 3, 4);
        parcel.writeInt(this.wdg6QnbFHrFF ? 1 : 0);
        int[] iArr = this.dgRBjINgWbAK;
        if (iArr != null) {
            int D0aTLcX6Uhyo2 = ki0.D0aTLcX6Uhyo(parcel, 4);
            parcel.writeIntArray(iArr);
            ki0.PsecLrZVVK61(parcel, D0aTLcX6Uhyo2);
        }
        ki0.JTxCbbCwomzt(parcel, 5, 4);
        parcel.writeInt(this.x50lh2ztY7Y5);
        int[] iArr2 = this.cpQdD2nAriOS;
        if (iArr2 != null) {
            int D0aTLcX6Uhyo3 = ki0.D0aTLcX6Uhyo(parcel, 6);
            parcel.writeIntArray(iArr2);
            ki0.PsecLrZVVK61(parcel, D0aTLcX6Uhyo3);
        }
        ki0.PsecLrZVVK61(parcel, D0aTLcX6Uhyo);
    }
}
