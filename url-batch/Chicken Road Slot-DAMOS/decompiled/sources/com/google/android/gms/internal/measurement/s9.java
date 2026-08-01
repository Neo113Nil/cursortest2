package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s9 extends d7.a implements Comparable {
    public static final Parcelable.Creator<s9> CREATOR = new o6(2);

    /* renamed from: d, reason: collision with root package name */
    public final int f2779d;

    /* renamed from: e, reason: collision with root package name */
    public final w9[] f2780e;

    /* renamed from: i, reason: collision with root package name */
    public final String[] f2781i;

    /* renamed from: r, reason: collision with root package name */
    public final TreeMap f2782r = new TreeMap();

    public s9(int i3, w9[] w9VarArr, String[] strArr) {
        this.f2779d = i3;
        this.f2780e = w9VarArr;
        for (w9 w9Var : w9VarArr) {
            this.f2782r.put(w9Var.f2936d, w9Var);
        }
        this.f2781i = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f2779d - ((s9) obj).f2779d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s9)) {
            return false;
        }
        s9 s9Var = (s9) obj;
        return this.f2779d == s9Var.f2779d && hg.c(this.f2782r, s9Var.f2782r) && Arrays.equals(this.f2781i, s9Var.f2781i);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Configuration(");
        sb2.append(this.f2779d);
        sb2.append(", (");
        Iterator it = this.f2782r.values().iterator();
        while (it.hasNext()) {
            sb2.append((w9) it.next());
            sb2.append(", ");
        }
        sb2.append("), (");
        String[] strArr = this.f2781i;
        if (strArr != null) {
            for (String str : strArr) {
                sb2.append(str);
                sb2.append(", ");
            }
        } else {
            sb2.append("null");
        }
        sb2.append("))");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.Y(parcel, 2, 4);
        parcel.writeInt(this.f2779d);
        cf.c.W(parcel, 3, this.f2780e, i3);
        String[] strArr = this.f2781i;
        if (strArr != null) {
            int Z2 = cf.c.Z(parcel, 4);
            parcel.writeStringArray(strArr);
            cf.c.a0(parcel, Z2);
        }
        cf.c.a0(parcel, Z);
    }
}
