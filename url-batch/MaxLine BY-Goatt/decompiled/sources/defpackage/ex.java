package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ex {
    public final Object a;
    public final as b;
    public final xt0 c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ ex(Object obj, as asVar, xt0 xt0Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : asVar, (i & 4) != 0 ? null : xt0Var, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static ex a(ex exVar, as asVar, Throwable th, int i) {
        Object obj = exVar.a;
        if ((i & 2) != 0) {
            asVar = exVar.b;
        }
        as asVar2 = asVar;
        xt0 xt0Var = exVar.c;
        Object obj2 = exVar.d;
        if ((i & 16) != 0) {
            th = exVar.e;
        }
        return new ex(obj, asVar2, xt0Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex)) {
            return false;
        }
        ex exVar = (ex) obj;
        return Intrinsics.b(this.a, exVar.a) && Intrinsics.b(this.b, exVar.b) && Intrinsics.b(this.c, exVar.c) && Intrinsics.b(this.d, exVar.d) && Intrinsics.b(this.e, exVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        as asVar = this.b;
        int hashCode2 = (hashCode + (asVar == null ? 0 : asVar.hashCode())) * 31;
        xt0 xt0Var = this.c;
        int hashCode3 = (hashCode2 + (xt0Var == null ? 0 : xt0Var.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public ex(Object obj, as asVar, xt0 xt0Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = asVar;
        this.c = xt0Var;
        this.d = obj2;
        this.e = th;
    }
}
