package H6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final w f1122a;

    /* renamed from: b, reason: collision with root package name */
    public final w f1123b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f1124c;

    public v(w plan, d dVar, Throwable th) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        this.f1122a = plan;
        this.f1123b = dVar;
        this.f1124c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.a(this.f1122a, vVar.f1122a) && Intrinsics.a(this.f1123b, vVar.f1123b) && Intrinsics.a(this.f1124c, vVar.f1124c);
    }

    public final int hashCode() {
        int hashCode = this.f1122a.hashCode() * 31;
        w wVar = this.f1123b;
        int hashCode2 = (hashCode + (wVar == null ? 0 : wVar.hashCode())) * 31;
        Throwable th = this.f1124c;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.f1122a + ", nextPlan=" + this.f1123b + ", throwable=" + this.f1124c + ')';
    }

    public /* synthetic */ v(w wVar, Throwable th, int i2) {
        this(wVar, (d) null, (i2 & 4) != 0 ? null : th);
    }
}
