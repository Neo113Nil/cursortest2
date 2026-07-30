package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ab3 extends i1 {
    public static final Parcelable.Creator<ab3> CREATOR = new va3(2);
    public final int m;
    public final Account n;
    public final int o;
    public final GoogleSignInAccount p;

    public ab3(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.m = i;
        this.n = account;
        this.o = i2;
        this.p = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        yk3.d0(parcel, 1, 4);
        parcel.writeInt(this.m);
        yk3.V(parcel, 2, this.n, i);
        yk3.d0(parcel, 3, 4);
        parcel.writeInt(this.o);
        yk3.V(parcel, 4, this.p, i);
        yk3.c0(parcel, b0);
    }
}
