package te;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f9395a;

    public k0(k0 k0Var) {
        k0Var.getClass();
        this.f9395a = k0Var;
    }

    public final List a() {
        return this.f9395a.a();
    }

    public final ce.b b() {
        return this.f9395a.b();
    }

    public final boolean c() {
        return this.f9395a.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean z10 = obj instanceof k0;
        k0 k0Var = z10 ? (k0) obj : null;
        k0 k0Var2 = k0Var != null ? k0Var.f9395a : null;
        k0 k0Var3 = this.f9395a;
        if (!Intrinsics.a(k0Var3, k0Var2)) {
            return false;
        }
        ce.b b10 = k0Var3.b();
        if (b10 instanceof ce.b) {
            k0 k0Var4 = z10 ? (k0) obj : null;
            ce.b b11 = k0Var4 != null ? k0Var4.f9395a.b() : null;
            if (b11 != null && (b11 instanceof ce.b)) {
                return a.a.D(b10).equals(a.a.D(b11));
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9395a.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f9395a;
    }
}
