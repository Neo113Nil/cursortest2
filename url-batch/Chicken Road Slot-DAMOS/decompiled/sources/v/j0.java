package v;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j0 implements p {

    /* renamed from: a, reason: collision with root package name */
    public final float f9826a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9827b;

    public j0(float f3, Object obj) {
        this.f9826a = f3;
        this.f9827b = obj;
    }

    @Override // v.f
    public final b1 a(c6.s sVar) {
        Object obj = this.f9827b;
        return new c1(this.f9826a, obj == null ? null : (l) ((Function1) sVar.f1868d).invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return j0Var.f9826a == this.f9826a && Intrinsics.a(j0Var.f9827b, this.f9827b);
    }

    public final int hashCode() {
        Object obj = this.f9827b;
        return Float.hashCode(this.f9826a) + n0.l.b(1.0f, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }
}
