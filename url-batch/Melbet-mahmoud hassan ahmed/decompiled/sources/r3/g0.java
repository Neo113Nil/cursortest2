package r3;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class g0 implements Parcelable.Creator<f0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ f0 createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i7 = 0;
        int i8 = 0;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                i7 = s3.b.q(parcel, o7);
            } else if (l7 == 2) {
                account = (Account) s3.b.e(parcel, o7, Account.CREATOR);
            } else if (l7 == 3) {
                i8 = s3.b.q(parcel, o7);
            } else if (l7 != 4) {
                s3.b.t(parcel, o7);
            } else {
                googleSignInAccount = (GoogleSignInAccount) s3.b.e(parcel, o7, GoogleSignInAccount.CREATOR);
            }
        }
        s3.b.k(parcel, u6);
        return new f0(i7, account, i8, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ f0[] newArray(int i7) {
        return new f0[i7];
    }
}
