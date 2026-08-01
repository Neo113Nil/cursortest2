package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t9 extends d7.a {
    public static final Parcelable.Creator<t9> CREATOR = new o6(3);

    /* renamed from: d, reason: collision with root package name */
    public final String f2815d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f2816e;

    /* renamed from: i, reason: collision with root package name */
    public final String f2817i;

    /* renamed from: r, reason: collision with root package name */
    public final s9[] f2818r;

    /* renamed from: s, reason: collision with root package name */
    public final TreeMap f2819s = new TreeMap();

    /* renamed from: t, reason: collision with root package name */
    public final boolean f2820t;

    /* renamed from: u, reason: collision with root package name */
    public final long f2821u;

    public t9(String str, String str2, s9[] s9VarArr, boolean z10, byte[] bArr, long j) {
        this.f2815d = str;
        this.f2817i = str2;
        this.f2818r = s9VarArr;
        this.f2820t = z10;
        this.f2816e = bArr;
        this.f2821u = j;
        for (s9 s9Var : s9VarArr) {
            this.f2819s.put(Integer.valueOf(s9Var.f2779d), s9Var);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t9)) {
            return false;
        }
        t9 t9Var = (t9) obj;
        return hg.c(this.f2815d, t9Var.f2815d) && hg.c(this.f2817i, t9Var.f2817i) && this.f2819s.equals(t9Var.f2819s) && this.f2820t == t9Var.f2820t && Arrays.equals(this.f2816e, t9Var.f2816e) && this.f2821u == t9Var.f2821u;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2815d, this.f2817i, this.f2819s, Boolean.valueOf(this.f2820t), this.f2816e, Long.valueOf(this.f2821u)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Configurations('");
        sb2.append(this.f2815d);
        sb2.append("', '");
        sb2.append(this.f2817i);
        sb2.append("', (");
        Iterator it = this.f2819s.values().iterator();
        while (it.hasNext()) {
            sb2.append((s9) it.next());
            sb2.append(", ");
        }
        sb2.append("), ");
        sb2.append(this.f2820t);
        sb2.append(", ");
        byte[] bArr = this.f2816e;
        sb2.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb2.append(", ");
        sb2.append(this.f2821u);
        sb2.append(')');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.V(parcel, 2, this.f2815d);
        cf.c.V(parcel, 3, this.f2817i);
        cf.c.W(parcel, 4, this.f2818r, i3);
        cf.c.Y(parcel, 5, 4);
        parcel.writeInt(this.f2820t ? 1 : 0);
        cf.c.Q(parcel, 6, this.f2816e);
        cf.c.Y(parcel, 7, 8);
        parcel.writeLong(this.f2821u);
        cf.c.a0(parcel, Z);
    }
}
