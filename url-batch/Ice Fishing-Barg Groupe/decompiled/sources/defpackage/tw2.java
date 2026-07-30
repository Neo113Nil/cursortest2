package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class tw2 extends POWyO8hTM6YC {
    public static final Parcelable.Creator<tw2> CREATOR = new BUo4iHFctTZi(13);
    public final IBinder OPXfSBeufaJ8;
    public final boolean dgRBjINgWbAK;
    public final int rtx2ld2ELZv4;
    public final xq wdg6QnbFHrFF;
    public final boolean x50lh2ztY7Y5;

    public tw2(int i, IBinder iBinder, xq xqVar, boolean z, boolean z2) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = iBinder;
        this.wdg6QnbFHrFF = xqVar;
        this.dgRBjINgWbAK = z;
        this.x50lh2ztY7Y5 = z2;
    }

    public final boolean equals(Object obj) {
        Object wx2Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw2)) {
            return false;
        }
        tw2 tw2Var = (tw2) obj;
        if (!this.wdg6QnbFHrFF.equals(tw2Var.wdg6QnbFHrFF)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.OPXfSBeufaJ8;
        if (iBinder == null) {
            wx2Var = null;
        } else {
            int i = FT2GK7JK5Ma2.Y1f8riQaR6yg;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            wx2Var = queryLocalInterface instanceof pm0 ? (pm0) queryLocalInterface : new wx2(iBinder);
        }
        IBinder iBinder2 = tw2Var.OPXfSBeufaJ8;
        if (iBinder2 != null) {
            int i2 = FT2GK7JK5Ma2.Y1f8riQaR6yg;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof pm0 ? (pm0) queryLocalInterface2 : new wx2(iBinder2);
        }
        return ni0.BRwzKIf41E4i(wx2Var, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D0aTLcX6Uhyo = ki0.D0aTLcX6Uhyo(parcel, 20293);
        ki0.JTxCbbCwomzt(parcel, 1, 4);
        parcel.writeInt(this.rtx2ld2ELZv4);
        IBinder iBinder = this.OPXfSBeufaJ8;
        if (iBinder != null) {
            int D0aTLcX6Uhyo2 = ki0.D0aTLcX6Uhyo(parcel, 2);
            parcel.writeStrongBinder(iBinder);
            ki0.PsecLrZVVK61(parcel, D0aTLcX6Uhyo2);
        }
        ki0.yQRudnv4La6p(parcel, 3, this.wdg6QnbFHrFF, i);
        ki0.JTxCbbCwomzt(parcel, 4, 4);
        parcel.writeInt(this.dgRBjINgWbAK ? 1 : 0);
        ki0.JTxCbbCwomzt(parcel, 5, 4);
        parcel.writeInt(this.x50lh2ztY7Y5 ? 1 : 0);
        ki0.PsecLrZVVK61(parcel, D0aTLcX6Uhyo);
    }
}
