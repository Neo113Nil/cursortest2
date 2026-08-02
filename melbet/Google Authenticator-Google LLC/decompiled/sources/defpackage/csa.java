package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class csa extends cri {
    public static final Parcelable.Creator CREATOR = new cqc(10);
    private static final Comparator e = new alu(5);
    public final List a;
    public final boolean b;
    public final String c;
    public final String d;

    public csa(List list, boolean z, String str, String str2) {
        oy.at(list);
        this.a = list;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    static csa a(List list, boolean z) {
        TreeSet treeSet = new TreeSet(e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((cmx) it.next()).a());
        }
        return new csa(new ArrayList(treeSet), z, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof csa)) {
            return false;
        }
        csa csaVar = (csa) obj;
        return this.b == csaVar.b && Objects.equals(this.a, csaVar.a) && Objects.equals(this.c, csaVar.c) && Objects.equals(this.d, csaVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), this.a, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int q = oy.q(parcel, 20293);
        oy.M(parcel, 1, list);
        oy.s(parcel, 2, this.b);
        oy.I(parcel, 3, this.c);
        oy.I(parcel, 4, this.d);
        oy.r(parcel, q);
    }
}
