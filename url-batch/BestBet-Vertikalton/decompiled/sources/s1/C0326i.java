package s1;

import java.util.concurrent.CancellationException;

/* renamed from: s1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4046a;

    /* renamed from: b, reason: collision with root package name */
    public final K f4047b;

    /* renamed from: c, reason: collision with root package name */
    public final j1.l f4048c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f4049e;

    public C0326i(Object obj, K k2, j1.l lVar, Object obj2, Throwable th) {
        this.f4046a = obj;
        this.f4047b = k2;
        this.f4048c = lVar;
        this.d = obj2;
        this.f4049e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0326i a(C0326i c0326i, K k2, CancellationException cancellationException, int i) {
        Object obj = c0326i.f4046a;
        if ((i & 2) != 0) {
            k2 = c0326i.f4047b;
        }
        K k3 = k2;
        j1.l lVar = c0326i.f4048c;
        Object obj2 = c0326i.d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = c0326i.f4049e;
        }
        c0326i.getClass();
        return new C0326i(obj, k3, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0326i)) {
            return false;
        }
        C0326i c0326i = (C0326i) obj;
        return k1.e.a(this.f4046a, c0326i.f4046a) && k1.e.a(this.f4047b, c0326i.f4047b) && k1.e.a(this.f4048c, c0326i.f4048c) && k1.e.a(this.d, c0326i.d) && k1.e.a(this.f4049e, c0326i.f4049e);
    }

    public final int hashCode() {
        Object obj = this.f4046a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        K k2 = this.f4047b;
        int hashCode2 = (hashCode + (k2 == null ? 0 : k2.hashCode())) * 31;
        j1.l lVar = this.f4048c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f4049e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f4046a + ", cancelHandler=" + this.f4047b + ", onCancellation=" + this.f4048c + ", idempotentResume=" + this.d + ", cancelCause=" + this.f4049e + ')';
    }

    public /* synthetic */ C0326i(Object obj, K k2, j1.l lVar, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : k2, (i & 4) != 0 ? null : lVar, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
