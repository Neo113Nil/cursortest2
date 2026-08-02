package com.google.android.gms.people.cpg.cpgex;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.cri;
import defpackage.dad;
import defpackage.oy;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CpgExDataContents extends cri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dad();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final boolean q;
    public final boolean r;
    public final Long s;

    public CpgExDataContents(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, boolean z2, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = str12;
        this.m = str13;
        this.n = str14;
        this.o = str15;
        this.p = str16;
        this.q = z;
        this.r = z2;
        this.s = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CpgExDataContents) {
            CpgExDataContents cpgExDataContents = (CpgExDataContents) obj;
            if (this.q == cpgExDataContents.q && this.r == cpgExDataContents.r && Objects.equals(this.a, cpgExDataContents.a) && Objects.equals(this.b, cpgExDataContents.b) && Objects.equals(this.c, cpgExDataContents.c) && Objects.equals(this.d, cpgExDataContents.d) && Objects.equals(this.e, cpgExDataContents.e) && Objects.equals(this.f, cpgExDataContents.f) && Objects.equals(this.g, cpgExDataContents.g) && Objects.equals(this.h, cpgExDataContents.h) && Objects.equals(this.i, cpgExDataContents.i) && Objects.equals(this.j, cpgExDataContents.j) && Objects.equals(this.k, cpgExDataContents.k) && Objects.equals(this.l, cpgExDataContents.l) && Objects.equals(this.m, cpgExDataContents.m) && Objects.equals(this.n, cpgExDataContents.n) && Objects.equals(this.o, cpgExDataContents.o) && Objects.equals(this.p, cpgExDataContents.p) && Objects.equals(this.s, cpgExDataContents.s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, Boolean.valueOf(this.q), Boolean.valueOf(this.r), this.s);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 2, str);
        oy.I(parcel, 3, this.b);
        oy.I(parcel, 4, this.c);
        oy.I(parcel, 5, this.d);
        oy.I(parcel, 6, this.e);
        oy.I(parcel, 7, this.f);
        oy.I(parcel, 8, this.g);
        oy.I(parcel, 9, this.h);
        oy.I(parcel, 10, this.i);
        oy.I(parcel, 11, this.j);
        oy.I(parcel, 12, this.k);
        oy.I(parcel, 13, this.l);
        oy.I(parcel, 14, this.m);
        oy.I(parcel, 15, this.n);
        oy.I(parcel, 16, this.o);
        oy.I(parcel, 17, this.p);
        oy.s(parcel, 18, this.q);
        oy.s(parcel, 19, this.r);
        oy.G(parcel, 20, this.s);
        oy.r(parcel, q);
    }
}
