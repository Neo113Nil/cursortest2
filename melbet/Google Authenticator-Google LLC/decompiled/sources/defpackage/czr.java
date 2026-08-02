package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class czr extends cri {
    public static final Parcelable.Creator CREATOR = new ctk(20);
    public final int a;
    public final Account b;

    public czr(int i, Account account) {
        this.a = i;
        this.b = account;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, i2);
        oy.H(parcel, 2, this.b, i);
        oy.r(parcel, q);
    }
}
