package defpackage;

import defpackage.q13;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kw2 {
    public final long a;
    public final long b;

    public kw2(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw2)) {
            return false;
        }
        kw2 kw2Var = (kw2) obj;
        return aw.c(this.a, kw2Var.a) && aw.c(this.b, kw2Var.b);
    }

    public final int hashCode() {
        int i = aw.h;
        q13.a aVar = q13.m;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        in1.o(this.a, sb, ", selectionBackgroundColor=");
        sb.append((Object) aw.i(this.b));
        sb.append(')');
        return sb.toString();
    }
}
