package W0;

import java.util.concurrent.CancellationException;

/* renamed from: W0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0073m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f959a;

    /* renamed from: b, reason: collision with root package name */
    public final D f960b;

    /* renamed from: c, reason: collision with root package name */
    public final O0.l f961c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f962d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f963e;

    public C0073m(Object obj, D d2, O0.l lVar, Object obj2, Throwable th) {
        this.f959a = obj;
        this.f960b = d2;
        this.f961c = lVar;
        this.f962d = obj2;
        this.f963e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0073m a(C0073m c0073m, D d2, CancellationException cancellationException, int i2) {
        Object obj = c0073m.f959a;
        if ((i2 & 2) != 0) {
            d2 = c0073m.f960b;
        }
        D d3 = d2;
        O0.l lVar = c0073m.f961c;
        Object obj2 = c0073m.f962d;
        CancellationException cancellationException2 = cancellationException;
        if ((i2 & 16) != 0) {
            cancellationException2 = c0073m.f963e;
        }
        c0073m.getClass();
        return new C0073m(obj, d3, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0073m)) {
            return false;
        }
        C0073m c0073m = (C0073m) obj;
        return P0.h.a(this.f959a, c0073m.f959a) && P0.h.a(this.f960b, c0073m.f960b) && P0.h.a(this.f961c, c0073m.f961c) && P0.h.a(this.f962d, c0073m.f962d) && P0.h.a(this.f963e, c0073m.f963e);
    }

    public final int hashCode() {
        Object obj = this.f959a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        D d2 = this.f960b;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        O0.l lVar = this.f961c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f962d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f963e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f959a + ", cancelHandler=" + this.f960b + ", onCancellation=" + this.f961c + ", idempotentResume=" + this.f962d + ", cancelCause=" + this.f963e + ')';
    }

    public /* synthetic */ C0073m(Object obj, D d2, O0.l lVar, CancellationException cancellationException, int i2) {
        this(obj, (i2 & 2) != 0 ? null : d2, (i2 & 4) != 0 ? null : lVar, (Object) null, (i2 & 16) != 0 ? null : cancellationException);
    }
}
