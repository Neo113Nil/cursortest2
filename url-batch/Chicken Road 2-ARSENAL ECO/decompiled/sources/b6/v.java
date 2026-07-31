package b6;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final w f3736a;

    /* renamed from: b, reason: collision with root package name */
    public final w f3737b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f3738c;

    public v(w wVar, e eVar, Throwable th) {
        this.f3736a = wVar;
        this.f3737b = eVar;
        this.f3738c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.i.a(this.f3736a, vVar.f3736a) && kotlin.jvm.internal.i.a(this.f3737b, vVar.f3737b) && kotlin.jvm.internal.i.a(this.f3738c, vVar.f3738c);
    }

    public final int hashCode() {
        int hashCode = this.f3736a.hashCode() * 31;
        w wVar = this.f3737b;
        int hashCode2 = (hashCode + (wVar == null ? 0 : wVar.hashCode())) * 31;
        Throwable th = this.f3738c;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.f3736a + ", nextPlan=" + this.f3737b + ", throwable=" + this.f3738c + ')';
    }

    public /* synthetic */ v(w wVar, Throwable th, int i7) {
        this(wVar, (e) null, (i7 & 4) != 0 ? null : th);
    }
}
