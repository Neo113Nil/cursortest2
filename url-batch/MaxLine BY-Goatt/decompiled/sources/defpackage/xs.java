package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xs {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;

    public xs(String str, String str2, String str3, String str4, String str5, List list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs)) {
            return false;
        }
        xs xsVar = (xs) obj;
        return Intrinsics.b(this.a, xsVar.a) && Intrinsics.b(this.b, xsVar.b) && Intrinsics.b(this.c, xsVar.c) && Intrinsics.b(this.d, xsVar.d) && Intrinsics.b(this.e, xsVar.e) && Intrinsics.b(this.f, xsVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + in1.j(this.e, in1.j(this.d, in1.j(this.c, in1.j(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "Warning(id=" + this.a + ", titleRu=" + this.b + ", titleEn=" + this.c + ", noteRu=" + this.d + ", noteEn=" + this.e + ", slugs=" + this.f + ")";
    }
}
