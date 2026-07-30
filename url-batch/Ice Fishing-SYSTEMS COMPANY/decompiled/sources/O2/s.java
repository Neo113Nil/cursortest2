package O2;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class s extends P2.a {
    public static final Parcelable.Creator<s> CREATOR = new F0.a(9);

    /* renamed from: n, reason: collision with root package name */
    public final int f2466n;

    /* renamed from: u, reason: collision with root package name */
    public final Account f2467u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2468v;

    /* renamed from: w, reason: collision with root package name */
    public final GoogleSignInAccount f2469w;

    public s(int i, Account account, int i4, GoogleSignInAccount googleSignInAccount) {
        this.f2466n = i;
        this.f2467u = account;
        this.f2468v = i4;
        this.f2469w = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 1, 4);
        parcel.writeInt(this.f2466n);
        S0.f.t(parcel, 2, this.f2467u, i);
        S0.f.A(parcel, 3, 4);
        parcel.writeInt(this.f2468v);
        S0.f.t(parcel, 4, this.f2469w, i);
        S0.f.C(parcel, B8);
    }
}
