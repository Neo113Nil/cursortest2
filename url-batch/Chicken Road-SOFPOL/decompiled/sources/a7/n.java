package a7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f279a;

    /* renamed from: b, reason: collision with root package name */
    public final e f280b;

    /* renamed from: c, reason: collision with root package name */
    public final p6.f f281c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f282d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f283e;

    public n(Object obj, e eVar, p6.f fVar, Object obj2, Throwable th) {
        this.f279a = obj;
        this.f280b = eVar;
        this.f281c = fVar;
        this.f282d = obj2;
        this.f283e = th;
    }

    public static n a(n nVar, e eVar, Throwable th, int i) {
        Object obj = nVar.f279a;
        if ((i & 2) != 0) {
            eVar = nVar.f280b;
        }
        e eVar2 = eVar;
        p6.f fVar = nVar.f281c;
        Object obj2 = nVar.f282d;
        if ((i & 16) != 0) {
            th = nVar.f283e;
        }
        return new n(obj, eVar2, fVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return q6.i.a(this.f279a, nVar.f279a) && q6.i.a(this.f280b, nVar.f280b) && q6.i.a(this.f281c, nVar.f281c) && q6.i.a(this.f282d, nVar.f282d) && q6.i.a(this.f283e, nVar.f283e);
    }

    public final int hashCode() {
        Object obj = this.f279a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        e eVar = this.f280b;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        p6.f fVar = this.f281c;
        int hashCode3 = (hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Object obj2 = this.f282d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f283e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f279a + ", cancelHandler=" + this.f280b + ", onCancellation=" + this.f281c + ", idempotentResume=" + this.f282d + ", cancelCause=" + this.f283e + ')';
    }

    public /* synthetic */ n(Object obj, e eVar, p6.f fVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : eVar, (i & 4) != 0 ? null : fVar, (Object) null, (i & 16) != 0 ? null : th);
    }
}
