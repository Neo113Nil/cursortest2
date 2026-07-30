package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class om {
    public final int a;
    public final long b;
    public final pm c;
    public final nq0 d;

    public om(int i, long j, pm pmVar, nq0 nq0Var) {
        this.a = i;
        this.b = j;
        this.c = pmVar;
        this.d = nq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om)) {
            return false;
        }
        om omVar = (om) obj;
        return this.a == omVar.a && this.b == omVar.b && this.c == omVar.c && Intrinsics.a(this.d, omVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + qy0.e(this.b, Integer.hashCode(this.a) * 31, 31)) * 31;
        nq0 nq0Var = this.d;
        return hashCode + (nq0Var == null ? 0 : nq0Var.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ')';
    }
}
