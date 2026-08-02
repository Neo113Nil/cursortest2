package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dbf extends cri implements Comparable {
    public static final Parcelable.Creator CREATOR = new dbh(1);
    public final int a;
    public final dbn[] b;
    public final String[] c;
    public final Map d = new TreeMap();

    public dbf(int i, dbn[] dbnVarArr, String[] strArr) {
        this.a = i;
        this.b = dbnVarArr;
        for (dbn dbnVar : dbnVarArr) {
            this.d.put(dbnVar.a, dbnVar);
        }
        this.c = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a - ((dbf) obj).a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dbf) {
            dbf dbfVar = (dbf) obj;
            if (this.a == dbfVar.a && dih.y(this.d, dbfVar.d) && Arrays.equals(this.c, dbfVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.a);
        sb.append(", (");
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append((dbn) it.next());
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.c;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 2, this.a);
        oy.L(parcel, 3, this.b, i);
        oy.J(parcel, 4, this.c);
        oy.r(parcel, q);
    }
}
