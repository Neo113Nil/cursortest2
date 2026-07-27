package o1;

import a.AbstractC0169a;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p1.AbstractC1380a;

/* loaded from: classes.dex */
public final class p extends AbstractC1380a {
    public static final Parcelable.Creator<p> CREATOR = new B1.c(25);

    /* renamed from: a, reason: collision with root package name */
    public final int f11585a;

    /* renamed from: b, reason: collision with root package name */
    public final Account f11586b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11587c;

    /* renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f11588d;

    public p(int i2, Account account, int i3, GoogleSignInAccount googleSignInAccount) {
        this.f11585a = i2;
        this.f11586b = account;
        this.f11587c = i3;
        this.f11588d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int R5 = AbstractC0169a.R(parcel, 20293);
        AbstractC0169a.T(parcel, 1, 4);
        parcel.writeInt(this.f11585a);
        AbstractC0169a.N(parcel, 2, this.f11586b, i2);
        AbstractC0169a.T(parcel, 3, 4);
        parcel.writeInt(this.f11587c);
        AbstractC0169a.N(parcel, 4, this.f11588d, i2);
        AbstractC0169a.S(parcel, R5);
    }
}
