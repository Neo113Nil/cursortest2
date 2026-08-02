package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dbo extends cri {
    public static final Parcelable.Creator CREATOR = new dbh(5);
    public final String a;
    public final String b;
    public final dbn c;
    public final boolean d;

    public dbo(String str, String str2, dbn dbnVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = dbnVar;
        this.d = z;
    }

    final void a(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        this.c.a(sb);
        sb.append(", ");
        sb.append(this.d);
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbo)) {
            return false;
        }
        dbo dboVar = (dbo) obj;
        return dih.y(this.a, dboVar.a) && dih.y(this.b, dboVar.b) && dih.y(this.c, dboVar.c) && this.d == dboVar.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 2, this.a);
        oy.I(parcel, 3, this.b);
        oy.H(parcel, 4, this.c, i);
        oy.s(parcel, 5, this.d);
        oy.r(parcel, q);
    }
}
