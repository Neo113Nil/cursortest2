package t1;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import u1.AbstractC0943a;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class q extends AbstractC0943a {
    public static final Parcelable.Creator<q> CREATOR = new I1.c(27);

    /* renamed from: d, reason: collision with root package name */
    public final int f7985d;

    /* renamed from: e, reason: collision with root package name */
    public final Account f7986e;

    /* renamed from: i, reason: collision with root package name */
    public final int f7987i;

    /* renamed from: l, reason: collision with root package name */
    public final GoogleSignInAccount f7988l;

    public q(int i2, Account account, int i5, GoogleSignInAccount googleSignInAccount) {
        this.f7985d = i2;
        this.f7986e = account;
        this.f7987i = i5;
        this.f7988l = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int Q = AbstractC1053a.Q(parcel, 20293);
        AbstractC1053a.P(parcel, 1, 4);
        parcel.writeInt(this.f7985d);
        AbstractC1053a.J(parcel, 2, this.f7986e, i2);
        AbstractC1053a.P(parcel, 3, 4);
        parcel.writeInt(this.f7987i);
        AbstractC1053a.J(parcel, 4, this.f7988l, i2);
        AbstractC1053a.S(parcel, Q);
    }
}
