package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dch extends cri {
    public static final Parcelable.Creator CREATOR = new dbh(10);
    public final String a;

    public dch(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dch) {
            return Objects.equals(this.a, ((dch) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PseudonymousIdToken[" + this.a + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 2, str);
        oy.r(parcel, q);
    }
}
