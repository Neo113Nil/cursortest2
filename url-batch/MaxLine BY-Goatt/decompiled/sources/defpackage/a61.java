package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class a61 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Double f;
    public final Long g;
    public final String h;
    public final Double i;
    public final String j;
    public final String k;
    public final boolean l;
    public final long m;

    public a61(long j, String str, String str2, String str3, String str4, Double d, Long l, String str5, Double d2, String str6, String str7, boolean z, long j2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = d;
        this.g = l;
        this.h = str5;
        this.i = d2;
        this.j = str6;
        this.k = str7;
        this.l = z;
        this.m = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a61)) {
            return false;
        }
        a61 a61Var = (a61) obj;
        return this.a == a61Var.a && Intrinsics.b(this.b, a61Var.b) && Intrinsics.b(this.c, a61Var.c) && Intrinsics.b(this.d, a61Var.d) && Intrinsics.b(this.e, a61Var.e) && Intrinsics.b(this.f, a61Var.f) && Intrinsics.b(this.g, a61Var.g) && Intrinsics.b(this.h, a61Var.h) && Intrinsics.b(this.i, a61Var.i) && Intrinsics.b(this.j, a61Var.j) && Intrinsics.b(this.k, a61Var.k) && this.l == a61Var.l && this.m == a61Var.m;
    }

    public final int hashCode() {
        int j = in1.j(this.d, in1.j(this.c, in1.j(this.b, Long.hashCode(this.a) * 31, 31), 31), 31);
        String str = this.e;
        int hashCode = (j + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Long l = this.g;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.h;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d2 = this.i;
        int hashCode5 = (hashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str3 = this.j;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        return Long.hashCode(this.m) + in1.i((hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.l);
    }

    public final String toString() {
        return "JewelryItem(id=" + this.a + ", name=" + this.b + ", type=" + this.c + ", metal=" + this.d + ", fineness=" + this.e + ", weightGrams=" + this.f + ", purchaseDateEpochDay=" + this.g + ", place=" + this.h + ", valueEntered=" + this.i + ", notes=" + this.j + ", photoUri=" + this.k + ", favourite=" + this.l + ", createdAt=" + this.m + ")";
    }
}
