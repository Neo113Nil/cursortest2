package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dbp extends cri {
    public static final Parcelable.Creator CREATOR = new dbh(6);
    public final List a;

    public dbp(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dbp) {
            return this.a.equals(((dbp) obj).a);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        boolean z = true;
        for (dbo dboVar : this.a) {
            if (!z) {
                sb.append(", ");
            }
            dboVar.a(sb);
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.M(parcel, 2, this.a);
        oy.r(parcel, q);
    }
}
