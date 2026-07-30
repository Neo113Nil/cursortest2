package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class rw2 extends POWyO8hTM6YC {
    public static final Parcelable.Creator<rw2> CREATOR = new BUo4iHFctTZi(12);
    public final Account OPXfSBeufaJ8;
    public final GoogleSignInAccount dgRBjINgWbAK;
    public final int rtx2ld2ELZv4;
    public final int wdg6QnbFHrFF;

    public rw2(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = account;
        this.wdg6QnbFHrFF = i2;
        this.dgRBjINgWbAK = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D0aTLcX6Uhyo = ki0.D0aTLcX6Uhyo(parcel, 20293);
        ki0.JTxCbbCwomzt(parcel, 1, 4);
        parcel.writeInt(this.rtx2ld2ELZv4);
        ki0.yQRudnv4La6p(parcel, 2, this.OPXfSBeufaJ8, i);
        ki0.JTxCbbCwomzt(parcel, 3, 4);
        parcel.writeInt(this.wdg6QnbFHrFF);
        ki0.yQRudnv4La6p(parcel, 4, this.dgRBjINgWbAK, i);
        ki0.PsecLrZVVK61(parcel, D0aTLcX6Uhyo);
    }
}
