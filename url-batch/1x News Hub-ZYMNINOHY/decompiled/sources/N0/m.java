package N0;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class m extends O0.a {
    public static final Parcelable.Creator<m> CREATOR = new H.h(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f1040a;

    /* renamed from: b, reason: collision with root package name */
    public final Account f1041b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1042c;

    /* renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f1043d;

    public m(int i3, Account account, int i4, GoogleSignInAccount googleSignInAccount) {
        this.f1040a = i3;
        this.f1041b = account;
        this.f1042c = i4;
        this.f1043d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int S2 = C2.b.S(parcel, 20293);
        C2.b.U(parcel, 1, 4);
        parcel.writeInt(this.f1040a);
        C2.b.N(parcel, 2, this.f1041b, i3);
        C2.b.U(parcel, 3, 4);
        parcel.writeInt(this.f1042c);
        C2.b.N(parcel, 4, this.f1043d, i3);
        C2.b.T(parcel, S2);
    }
}
