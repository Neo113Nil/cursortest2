package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class j5 {
    public final Context a;
    public final nr b;
    public final long c;
    public final ku0 d;

    public j5(Context context, nr nrVar, long j, ku0 ku0Var) {
        this.a = context;
        this.b = nrVar;
        this.c = j;
        this.d = ku0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!j5.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        j5 j5Var = (j5) obj;
        return Intrinsics.a(this.a, j5Var.a) && Intrinsics.a(this.b, j5Var.b) && hi.c(this.c, j5Var.c) && Intrinsics.a(this.d, j5Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = hi.h;
        jk1 jk1Var = kk1.d;
        return this.d.hashCode() + qy0.e(this.c, hashCode, 31);
    }
}
