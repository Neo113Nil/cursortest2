package c7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1718a;

    /* renamed from: b, reason: collision with root package name */
    public final e f1719b;

    /* renamed from: c, reason: collision with root package name */
    public final q6.f f1720c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1721d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f1722e;

    public o(Object obj, e eVar, q6.f fVar, Object obj2, Throwable th) {
        this.f1718a = obj;
        this.f1719b = eVar;
        this.f1720c = fVar;
        this.f1721d = obj2;
        this.f1722e = th;
    }

    public static o a(o oVar, e eVar, Throwable th, int i7) {
        Object obj = oVar.f1718a;
        if ((i7 & 2) != 0) {
            eVar = oVar.f1719b;
        }
        e eVar2 = eVar;
        q6.f fVar = oVar.f1720c;
        Object obj2 = oVar.f1721d;
        if ((i7 & 16) != 0) {
            th = oVar.f1722e;
        }
        return new o(obj, eVar2, fVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return r6.k.a(this.f1718a, oVar.f1718a) && r6.k.a(this.f1719b, oVar.f1719b) && r6.k.a(this.f1720c, oVar.f1720c) && r6.k.a(this.f1721d, oVar.f1721d) && r6.k.a(this.f1722e, oVar.f1722e);
    }

    public final int hashCode() {
        Object obj = this.f1718a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        e eVar = this.f1719b;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        q6.f fVar = this.f1720c;
        int hashCode3 = (hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Object obj2 = this.f1721d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f1722e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f1718a + ", cancelHandler=" + this.f1719b + ", onCancellation=" + this.f1720c + ", idempotentResume=" + this.f1721d + ", cancelCause=" + this.f1722e + ')';
    }

    public /* synthetic */ o(Object obj, e eVar, q6.f fVar, Throwable th, int i7) {
        this(obj, (i7 & 2) != 0 ? null : eVar, (i7 & 4) != 0 ? null : fVar, (Object) null, (i7 & 16) != 0 ? null : th);
    }
}
