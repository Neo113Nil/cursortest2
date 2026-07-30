package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ft1 extends t0 {
    public static final Parcelable.Creator<ft1> CREATOR = new g2(14);
    public final int d;
    public final Account e;
    public final int g;
    public final GoogleSignInAccount h;

    public ft1(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.d = i;
        this.e = account;
        this.g = i2;
        this.h = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int P = y90.P(parcel, 20293);
        y90.R(parcel, 1, 4);
        parcel.writeInt(this.d);
        y90.L(parcel, 2, this.e, i);
        y90.R(parcel, 3, 4);
        parcel.writeInt(this.g);
        y90.L(parcel, 4, this.h, i);
        y90.Q(parcel, P);
    }
}
