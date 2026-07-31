package m6;

/* loaded from: classes.dex */
final class x {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19358a;

    /* renamed from: b, reason: collision with root package name */
    public final i f19359b;

    /* renamed from: c, reason: collision with root package name */
    public final f6.l<Throwable, v5.q> f19360c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f19361d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f19362e;

    /* JADX WARN: Multi-variable type inference failed */
    public x(Object obj, i iVar, f6.l<? super Throwable, v5.q> lVar, Object obj2, Throwable th) {
        this.f19358a = obj;
        this.f19359b = iVar;
        this.f19360c = lVar;
        this.f19361d = obj2;
        this.f19362e = th;
    }

    public /* synthetic */ x(Object obj, i iVar, f6.l lVar, Object obj2, Throwable th, int i7, kotlin.jvm.internal.e eVar) {
        this(obj, (i7 & 2) != 0 ? null : iVar, (i7 & 4) != 0 ? null : lVar, (i7 & 8) != 0 ? null : obj2, (i7 & 16) != 0 ? null : th);
    }

    public static /* synthetic */ x b(x xVar, Object obj, i iVar, f6.l lVar, Object obj2, Throwable th, int i7, Object obj3) {
        if ((i7 & 1) != 0) {
            obj = xVar.f19358a;
        }
        if ((i7 & 2) != 0) {
            iVar = xVar.f19359b;
        }
        i iVar2 = iVar;
        if ((i7 & 4) != 0) {
            lVar = xVar.f19360c;
        }
        f6.l lVar2 = lVar;
        if ((i7 & 8) != 0) {
            obj2 = xVar.f19361d;
        }
        Object obj4 = obj2;
        if ((i7 & 16) != 0) {
            th = xVar.f19362e;
        }
        return xVar.a(obj, iVar2, lVar2, obj4, th);
    }

    public final x a(Object obj, i iVar, f6.l<? super Throwable, v5.q> lVar, Object obj2, Throwable th) {
        return new x(obj, iVar, lVar, obj2, th);
    }

    public final boolean c() {
        return this.f19362e != null;
    }

    public final void d(l<?> lVar, Throwable th) {
        i iVar = this.f19359b;
        if (iVar != null) {
            lVar.o(iVar, th);
        }
        f6.l<Throwable, v5.q> lVar2 = this.f19360c;
        if (lVar2 == null) {
            return;
        }
        lVar.p(lVar2, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return kotlin.jvm.internal.i.a(this.f19358a, xVar.f19358a) && kotlin.jvm.internal.i.a(this.f19359b, xVar.f19359b) && kotlin.jvm.internal.i.a(this.f19360c, xVar.f19360c) && kotlin.jvm.internal.i.a(this.f19361d, xVar.f19361d) && kotlin.jvm.internal.i.a(this.f19362e, xVar.f19362e);
    }

    public int hashCode() {
        Object obj = this.f19358a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        i iVar = this.f19359b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        f6.l<Throwable, v5.q> lVar = this.f19360c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f19361d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f19362e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f19358a + ", cancelHandler=" + this.f19359b + ", onCancellation=" + this.f19360c + ", idempotentResume=" + this.f19361d + ", cancelCause=" + this.f19362e + ')';
    }
}
