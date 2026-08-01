package m2;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i extends k {

    /* renamed from: a, reason: collision with root package name */
    public final String f6484a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f6485b;

    public i(String str, f0 f0Var) {
        this.f6484a = str;
        this.f6485b = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f6484a.equals(iVar.f6484a) && Intrinsics.a(this.f6485b, iVar.f6485b);
    }

    public final int hashCode() {
        int hashCode = this.f6484a.hashCode() * 31;
        f0 f0Var = this.f6485b;
        return (hashCode + (f0Var != null ? f0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return n0.l.h(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f6484a, ')');
    }
}
