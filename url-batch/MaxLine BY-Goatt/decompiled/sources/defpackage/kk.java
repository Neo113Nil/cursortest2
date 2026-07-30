package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kk {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public kk(String str, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk)) {
            return false;
        }
        kk kkVar = (kk) obj;
        return Intrinsics.b(this.a, kkVar.a) && this.b == kkVar.b && this.c == kkVar.c && this.d == kkVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + in1.i(in1.i(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "AtlasProgress(slug=" + this.a + ", studied=" + this.b + ", favourite=" + this.c + ", owned=" + this.d + ")";
    }
}
