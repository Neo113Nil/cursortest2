package d2;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import e2.AbstractC0408a;

/* loaded from: classes.dex */
public final class n extends AbstractC0408a {
    public static final Parcelable.Creator<n> CREATOR = new H.h(16);

    /* renamed from: a, reason: collision with root package name */
    public final int f8282a;

    /* renamed from: b, reason: collision with root package name */
    public final Account f8283b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8284c;

    /* renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f8285d;

    public n(int i4, Account account, int i5, GoogleSignInAccount googleSignInAccount) {
        this.f8282a = i4;
        this.f8283b = account;
        this.f8284c = i5;
        this.f8285d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int D3 = O3.l.D(parcel, 20293);
        O3.l.G(parcel, 1, 4);
        parcel.writeInt(this.f8282a);
        O3.l.z(parcel, 2, this.f8283b, i4);
        O3.l.G(parcel, 3, 4);
        parcel.writeInt(this.f8284c);
        O3.l.z(parcel, 4, this.f8285d, i4);
        O3.l.F(parcel, D3);
    }
}
