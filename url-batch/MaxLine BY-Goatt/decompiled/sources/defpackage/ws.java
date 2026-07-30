package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ws {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ws(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws)) {
            return false;
        }
        ws wsVar = (ws) obj;
        return Intrinsics.b(this.a, wsVar.a) && Intrinsics.b(this.b, wsVar.b) && Intrinsics.b(this.c, wsVar.c) && Intrinsics.b(this.d, wsVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + in1.j(this.c, in1.j(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "Tip(titleRu=" + this.a + ", titleEn=" + this.b + ", bodyRu=" + this.c + ", bodyEn=" + this.d + ")";
    }
}
