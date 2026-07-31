package U0;

import a.AbstractC0219a;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class o extends V0.a {
    public static final Parcelable.Creator<o> CREATOR = new I.j(8);

    /* renamed from: f, reason: collision with root package name */
    public final int f2564f;

    /* renamed from: g, reason: collision with root package name */
    public final Account f2565g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2566h;

    /* renamed from: i, reason: collision with root package name */
    public final GoogleSignInAccount f2567i;

    public o(int i7, Account account, int i8, GoogleSignInAccount googleSignInAccount) {
        this.f2564f = i7;
        this.f2565g = account;
        this.f2566h = i8;
        this.f2567i = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int O6 = AbstractC0219a.O(parcel, 20293);
        AbstractC0219a.R(parcel, 1, 4);
        parcel.writeInt(this.f2564f);
        AbstractC0219a.I(parcel, 2, this.f2565g, i7);
        AbstractC0219a.R(parcel, 3, 4);
        parcel.writeInt(this.f2566h);
        AbstractC0219a.I(parcel, 4, this.f2567i, i7);
        AbstractC0219a.Q(parcel, O6);
    }
}
