package m2;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f6464a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f6465b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f6466c;

    /* renamed from: d, reason: collision with root package name */
    public final a0 f6467d;

    public f0(a0 a0Var, a0 a0Var2, a0 a0Var3, a0 a0Var4) {
        this.f6464a = a0Var;
        this.f6465b = a0Var2;
        this.f6466c = a0Var3;
        this.f6467d = a0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.a(this.f6464a, f0Var.f6464a) && Intrinsics.a(this.f6465b, f0Var.f6465b) && Intrinsics.a(this.f6466c, f0Var.f6466c) && Intrinsics.a(this.f6467d, f0Var.f6467d);
    }

    public final int hashCode() {
        a0 a0Var = this.f6464a;
        int hashCode = (a0Var != null ? a0Var.hashCode() : 0) * 31;
        a0 a0Var2 = this.f6465b;
        int hashCode2 = (hashCode + (a0Var2 != null ? a0Var2.hashCode() : 0)) * 31;
        a0 a0Var3 = this.f6466c;
        int hashCode3 = (hashCode2 + (a0Var3 != null ? a0Var3.hashCode() : 0)) * 31;
        a0 a0Var4 = this.f6467d;
        return hashCode3 + (a0Var4 != null ? a0Var4.hashCode() : 0);
    }
}
