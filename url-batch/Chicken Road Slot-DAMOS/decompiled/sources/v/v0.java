package v;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v0 implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9889a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9890b;

    public v0(Object obj, Object obj2) {
        this.f9889a = obj;
        this.f9890b = obj2;
    }

    @Override // v.u0
    public final Object a() {
        return this.f9889a;
    }

    @Override // v.u0
    public final Object c() {
        return this.f9890b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.a(this.f9889a, u0Var.a()) && Intrinsics.a(this.f9890b, u0Var.c());
    }

    public final int hashCode() {
        Object obj = this.f9889a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f9890b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
