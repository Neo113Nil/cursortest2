package l;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7766a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7767b;

    public i0(Object obj, Object obj2) {
        this.f7766a = obj;
        this.f7767b = obj2;
    }

    @Override // l.h0
    public final Object b() {
        return this.f7766a;
    }

    @Override // l.h0
    public final Object c() {
        return this.f7767b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            if (Intrinsics.a(this.f7766a, h0Var.b())) {
                if (Intrinsics.a(this.f7767b, h0Var.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f7766a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f7767b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
