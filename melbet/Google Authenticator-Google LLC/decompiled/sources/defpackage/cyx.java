package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cyx extends cri {
    public static final Parcelable.Creator CREATOR = new ctk(14);
    public final int a;
    public final Bundle b;

    public cyx(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    public final her a() {
        hen henVar = new hen(4);
        Bundle bundle = this.b;
        for (String str : bundle.keySet()) {
            henVar.g(new Account(str, "com.google"), Integer.valueOf(bundle.getInt(str)));
        }
        return henVar.d(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyx)) {
            return false;
        }
        cyx cyxVar = (cyx) obj;
        return this.a == cyxVar.a && Objects.equals(a(), cyxVar.a());
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, i2);
        oy.z(parcel, 2, this.b);
        oy.r(parcel, q);
    }
}
