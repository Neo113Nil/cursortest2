package defpackage;

import defpackage.q13;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dk2 {
    public static final dk2 d = new dk2();
    public final long a;
    public final long b;
    public final float c;

    public /* synthetic */ dk2() {
        this(0.0f, ap.d(4278190080L), 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2)) {
            return false;
        }
        dk2 dk2Var = (dk2) obj;
        return aw.c(this.a, dk2Var.a) && au1.b(this.b, dk2Var.b) && this.c == dk2Var.c;
    }

    public final int hashCode() {
        int i = aw.h;
        q13.a aVar = q13.m;
        return Float.hashCode(this.c) + in1.h(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        in1.o(this.a, sb, ", offset=");
        sb.append((Object) au1.i(this.b));
        sb.append(", blurRadius=");
        return q40.n(sb, this.c, ')');
    }

    public dk2(float f, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }
}
