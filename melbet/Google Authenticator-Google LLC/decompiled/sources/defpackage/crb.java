package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class crb extends cri {
    public static final Parcelable.Creator CREATOR = new cqc(3);
    final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public crb(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, this.a);
        oy.H(parcel, 2, this.b, i);
        oy.v(parcel, 3, this.c);
        oy.H(parcel, 4, this.d, i);
        oy.r(parcel, q);
    }
}
