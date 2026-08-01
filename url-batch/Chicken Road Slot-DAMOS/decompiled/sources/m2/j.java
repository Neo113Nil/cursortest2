package m2;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final String f6487a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f6488b;

    public j(String str, f0 f0Var) {
        this.f6487a = str;
        this.f6488b = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f6487a.equals(jVar.f6487a) && Intrinsics.a(this.f6488b, jVar.f6488b);
    }

    public final int hashCode() {
        int hashCode = this.f6487a.hashCode() * 31;
        f0 f0Var = this.f6488b;
        return (hashCode + (f0Var != null ? f0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return n0.l.h(new StringBuilder("LinkAnnotation.Url(url="), this.f6487a, ')');
    }
}
