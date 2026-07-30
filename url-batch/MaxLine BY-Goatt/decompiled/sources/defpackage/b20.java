package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class b20 {
    public final int a;
    public final long b;
    public final c20 c;
    public final ot2 d;

    public b20(int i, long j, c20 c20Var, ot2 ot2Var) {
        this.a = i;
        this.b = j;
        this.c = c20Var;
        this.d = ot2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b20)) {
            return false;
        }
        b20 b20Var = (b20) obj;
        return this.a == b20Var.a && this.b == b20Var.b && this.c == b20Var.c && Intrinsics.b(this.d, b20Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + in1.h(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        ot2 ot2Var = this.d;
        return hashCode + (ot2Var == null ? 0 : ot2Var.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ')';
    }
}
