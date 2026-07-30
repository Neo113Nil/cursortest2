package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ik {
    public final String a;
    public final jk b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Double h;
    public final Double i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final List r;
    public final List s;
    public final Integer t;
    public final String u;
    public final List v;

    public ik(String str, jk jkVar, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, List list, List list2, Integer num, String str15, List list3) {
        str.getClass();
        jkVar.getClass();
        str2.getClass();
        str3.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        str10.getClass();
        str11.getClass();
        str12.getClass();
        str13.getClass();
        str14.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = str;
        this.b = jkVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = d;
        this.i = d2;
        this.j = str7;
        this.k = str8;
        this.l = str9;
        this.m = str10;
        this.n = str11;
        this.o = str12;
        this.p = str13;
        this.q = str14;
        this.r = list;
        this.s = list2;
        this.t = num;
        this.u = str15;
        this.v = list3;
    }

    public static final String a(double d) {
        return d % 1.0d == 0.0d ? String.valueOf((int) d) : String.valueOf(d);
    }

    public final String b() {
        Double d = this.h;
        if (d == null) {
            return null;
        }
        double doubleValue = d.doubleValue();
        Double d2 = this.i;
        double doubleValue2 = d2 != null ? d2.doubleValue() : doubleValue;
        if (doubleValue == doubleValue2) {
            return a(doubleValue);
        }
        return a(doubleValue) + "–" + a(doubleValue2);
    }

    public final String c(nh nhVar) {
        nhVar.getClass();
        return s03.F(this.c, this.d, nhVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik)) {
            return false;
        }
        ik ikVar = (ik) obj;
        return Intrinsics.b(this.a, ikVar.a) && this.b == ikVar.b && Intrinsics.b(this.c, ikVar.c) && Intrinsics.b(this.d, ikVar.d) && Intrinsics.b(this.e, ikVar.e) && Intrinsics.b(this.f, ikVar.f) && Intrinsics.b(this.g, ikVar.g) && Intrinsics.b(this.h, ikVar.h) && Intrinsics.b(this.i, ikVar.i) && Intrinsics.b(this.j, ikVar.j) && Intrinsics.b(this.k, ikVar.k) && Intrinsics.b(this.l, ikVar.l) && Intrinsics.b(this.m, ikVar.m) && Intrinsics.b(this.n, ikVar.n) && Intrinsics.b(this.o, ikVar.o) && Intrinsics.b(this.p, ikVar.p) && Intrinsics.b(this.q, ikVar.q) && Intrinsics.b(this.r, ikVar.r) && Intrinsics.b(this.s, ikVar.s) && Intrinsics.b(this.t, ikVar.t) && Intrinsics.b(this.u, ikVar.u) && Intrinsics.b(this.v, ikVar.v);
    }

    public final int hashCode() {
        int j = in1.j(this.d, in1.j(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31);
        String str = this.e;
        int j2 = in1.j(this.g, in1.j(this.f, (j + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        Double d = this.h;
        int hashCode = (j2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.i;
        int hashCode2 = (this.s.hashCode() + ((this.r.hashCode() + in1.j(this.q, in1.j(this.p, in1.j(this.o, in1.j(this.n, in1.j(this.m, in1.j(this.l, in1.j(this.k, in1.j(this.j, (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31)) * 31)) * 31;
        Integer num = this.t;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.u;
        return this.v.hashCode() + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AtlasEntry(slug=" + this.a + ", kind=" + this.b + ", nameRu=" + this.c + ", nameEn=" + this.d + ", formula=" + this.e + ", colorRu=" + this.f + ", colorEn=" + this.g + ", mohsMin=" + this.h + ", mohsMax=" + this.i + ", lustreRu=" + this.j + ", lustreEn=" + this.k + ", originRu=" + this.l + ", originEn=" + this.m + ", symbolismRu=" + this.n + ", symbolismEn=" + this.o + ", careRu=" + this.p + ", careEn=" + this.q + ", factsRu=" + this.r + ", factsEn=" + this.s + ", birthMonth=" + this.t + ", zodiac=" + this.u + ", sources=" + this.v + ")";
    }
}
