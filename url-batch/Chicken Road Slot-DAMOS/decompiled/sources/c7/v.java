package c7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v extends d7.a {
    public static final Parcelable.Creator<v> CREATOR = new p(3);

    /* renamed from: d, reason: collision with root package name */
    public final int f1990d;

    /* renamed from: e, reason: collision with root package name */
    public final Account f1991e;

    /* renamed from: i, reason: collision with root package name */
    public final int f1992i;

    /* renamed from: r, reason: collision with root package name */
    public final GoogleSignInAccount f1993r;

    public v(int i3, Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.f1990d = i3;
        this.f1991e = account;
        this.f1992i = i10;
        this.f1993r = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.Y(parcel, 1, 4);
        parcel.writeInt(this.f1990d);
        cf.c.U(parcel, 2, this.f1991e, i3);
        cf.c.Y(parcel, 3, 4);
        parcel.writeInt(this.f1992i);
        cf.c.U(parcel, 4, this.f1993r, i3);
        cf.c.a0(parcel, Z);
    }
}
