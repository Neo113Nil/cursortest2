package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x9 extends d7.a {
    public static final Parcelable.Creator<x9> CREATOR = new o6(7);

    /* renamed from: d, reason: collision with root package name */
    public final String f2977d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2978e;

    /* renamed from: i, reason: collision with root package name */
    public final w9 f2979i;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f2980r;

    public x9(String str, String str2, w9 w9Var, boolean z10) {
        this.f2977d = str;
        this.f2978e = str2;
        this.f2979i = w9Var;
        this.f2980r = z10;
    }

    public final void b(StringBuilder sb2) {
        sb2.append("FlagOverride(");
        sb2.append(this.f2977d);
        sb2.append(", ");
        sb2.append(this.f2978e);
        sb2.append(", ");
        this.f2979i.b(sb2);
        sb2.append(", ");
        sb2.append(this.f2980r);
        sb2.append(")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9)) {
            return false;
        }
        x9 x9Var = (x9) obj;
        return hg.c(this.f2977d, x9Var.f2977d) && hg.c(this.f2978e, x9Var.f2978e) && hg.c(this.f2979i, x9Var.f2979i) && this.f2980r == x9Var.f2980r;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        b(sb2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.V(parcel, 2, this.f2977d);
        cf.c.V(parcel, 3, this.f2978e);
        cf.c.U(parcel, 4, this.f2979i, i3);
        cf.c.Y(parcel, 5, 4);
        parcel.writeInt(this.f2980r ? 1 : 0);
        cf.c.a0(parcel, Z);
    }
}
