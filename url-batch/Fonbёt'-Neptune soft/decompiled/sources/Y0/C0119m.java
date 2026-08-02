package Y0;

import java.util.concurrent.CancellationException;

/* renamed from: Y0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1213a;

    /* renamed from: b, reason: collision with root package name */
    public final D f1214b;

    /* renamed from: c, reason: collision with root package name */
    public final P0.l f1215c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1216d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f1217e;

    public C0119m(Object obj, D d2, P0.l lVar, Object obj2, Throwable th) {
        this.f1213a = obj;
        this.f1214b = d2;
        this.f1215c = lVar;
        this.f1216d = obj2;
        this.f1217e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0119m a(C0119m c0119m, D d2, CancellationException cancellationException, int i2) {
        Object obj = c0119m.f1213a;
        if ((i2 & 2) != 0) {
            d2 = c0119m.f1214b;
        }
        D d3 = d2;
        P0.l lVar = c0119m.f1215c;
        Object obj2 = c0119m.f1216d;
        CancellationException cancellationException2 = cancellationException;
        if ((i2 & 16) != 0) {
            cancellationException2 = c0119m.f1217e;
        }
        c0119m.getClass();
        return new C0119m(obj, d3, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0119m)) {
            return false;
        }
        C0119m c0119m = (C0119m) obj;
        return Q0.h.a(this.f1213a, c0119m.f1213a) && Q0.h.a(this.f1214b, c0119m.f1214b) && Q0.h.a(this.f1215c, c0119m.f1215c) && Q0.h.a(this.f1216d, c0119m.f1216d) && Q0.h.a(this.f1217e, c0119m.f1217e);
    }

    public final int hashCode() {
        Object obj = this.f1213a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        D d2 = this.f1214b;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        P0.l lVar = this.f1215c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f1216d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f1217e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f1213a + ", cancelHandler=" + this.f1214b + ", onCancellation=" + this.f1215c + ", idempotentResume=" + this.f1216d + ", cancelCause=" + this.f1217e + ')';
    }

    public /* synthetic */ C0119m(Object obj, D d2, P0.l lVar, CancellationException cancellationException, int i2) {
        this(obj, (i2 & 2) != 0 ? null : d2, (i2 & 4) != 0 ? null : lVar, (Object) null, (i2 & 16) != 0 ? null : cancellationException);
    }
}
