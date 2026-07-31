package r3;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class f0 extends s3.a {
    public static final Parcelable.Creator<f0> CREATOR = new g0();

    /* renamed from: f, reason: collision with root package name */
    final int f21274f;

    /* renamed from: g, reason: collision with root package name */
    private final Account f21275g;

    /* renamed from: h, reason: collision with root package name */
    private final int f21276h;

    /* renamed from: i, reason: collision with root package name */
    private final GoogleSignInAccount f21277i;

    f0(int i7, Account account, int i8, GoogleSignInAccount googleSignInAccount) {
        this.f21274f = i7;
        this.f21275g = account;
        this.f21276h = i8;
        this.f21277i = googleSignInAccount;
    }

    public f0(Account account, int i7, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i7, googleSignInAccount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.h(parcel, 1, this.f21274f);
        s3.c.l(parcel, 2, this.f21275g, i7, false);
        s3.c.h(parcel, 3, this.f21276h);
        s3.c.l(parcel, 4, this.f21277i, i7, false);
        s3.c.b(parcel, a7);
    }
}
