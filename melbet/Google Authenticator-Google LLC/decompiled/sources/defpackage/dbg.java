package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dbg extends cri {
    public static final Parcelable.Creator CREATOR = new dbh(0);
    public final String a;
    public final byte[] b;
    public final String c;
    public final dbf[] d;
    public final Map e = new TreeMap();
    public final boolean f;
    public final long g;

    public dbg(String str, String str2, dbf[] dbfVarArr, boolean z, byte[] bArr, long j) {
        this.a = str;
        this.c = str2;
        this.d = dbfVarArr;
        this.f = z;
        this.b = bArr;
        this.g = j;
        for (dbf dbfVar : dbfVarArr) {
            this.e.put(Integer.valueOf(dbfVar.a), dbfVar);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dbg) {
            dbg dbgVar = (dbg) obj;
            if (dih.y(this.a, dbgVar.a) && dih.y(this.c, dbgVar.c) && this.e.equals(dbgVar.e) && this.f == dbgVar.f && Arrays.equals(this.b, dbgVar.b) && this.g == dbgVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.e, Boolean.valueOf(this.f), this.b, Long.valueOf(this.g)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.a);
        sb.append("', '");
        sb.append(this.c);
        sb.append("', (");
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            sb.append((dbf) it.next());
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.f);
        sb.append(", ");
        byte[] bArr = this.b;
        sb.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb.append(", ");
        sb.append(this.g);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 2, this.a);
        oy.I(parcel, 3, this.c);
        oy.L(parcel, 4, this.d, i);
        oy.s(parcel, 5, this.f);
        oy.A(parcel, 6, this.b);
        oy.w(parcel, 7, this.g);
        oy.r(parcel, q);
    }
}
