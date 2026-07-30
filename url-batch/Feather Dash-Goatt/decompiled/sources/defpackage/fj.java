package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class fj {
    public final Object a;
    public final pf b;
    public final s30 c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ fj(Object obj, pf pfVar, s30 s30Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : pfVar, (i & 4) != 0 ? null : s30Var, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static fj a(fj fjVar, pf pfVar, Throwable th, int i) {
        Object obj = fjVar.a;
        if ((i & 2) != 0) {
            pfVar = fjVar.b;
        }
        pf pfVar2 = pfVar;
        s30 s30Var = fjVar.c;
        Object obj2 = fjVar.d;
        if ((i & 16) != 0) {
            th = fjVar.e;
        }
        return new fj(obj, pfVar2, s30Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj)) {
            return false;
        }
        fj fjVar = (fj) obj;
        return Intrinsics.a(this.a, fjVar.a) && Intrinsics.a(this.b, fjVar.b) && Intrinsics.a(this.c, fjVar.c) && Intrinsics.a(this.d, fjVar.d) && Intrinsics.a(this.e, fjVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        pf pfVar = this.b;
        int hashCode2 = (hashCode + (pfVar == null ? 0 : pfVar.hashCode())) * 31;
        s30 s30Var = this.c;
        int hashCode3 = (hashCode2 + (s30Var == null ? 0 : s30Var.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public fj(Object obj, pf pfVar, s30 s30Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = pfVar;
        this.c = s30Var;
        this.d = obj2;
        this.e = th;
    }
}
