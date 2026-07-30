package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class d61 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final int e;
    public final double f;

    public d61(String str, String str2, String str3, List list, int i, double d) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = i;
        this.f = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d61)) {
            return false;
        }
        d61 d61Var = (d61) obj;
        return Intrinsics.b(this.a, d61Var.a) && Intrinsics.b(this.b, d61Var.b) && Intrinsics.b(this.c, d61Var.c) && Intrinsics.b(this.d, d61Var.d) && this.e == d61Var.e && Double.compare(this.f, d61Var.f) == 0;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return Double.hashCode(this.f) + q40.e(this.e, (this.d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "JewelryUiState(query=" + this.a + ", typeFilter=" + this.b + ", metalFilter=" + this.c + ", items=" + this.d + ", count=" + this.e + ", totalValue=" + this.f + ")";
    }
}
