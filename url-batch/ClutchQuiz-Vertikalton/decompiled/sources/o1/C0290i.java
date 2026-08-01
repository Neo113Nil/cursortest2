package o1;

import java.util.concurrent.CancellationException;

/* renamed from: o1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0290i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3343a;

    /* renamed from: b, reason: collision with root package name */
    public final K f3344b;

    /* renamed from: c, reason: collision with root package name */
    public final f1.l f3345c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f3346e;

    public C0290i(Object obj, K k2, f1.l lVar, Object obj2, Throwable th) {
        this.f3343a = obj;
        this.f3344b = k2;
        this.f3345c = lVar;
        this.d = obj2;
        this.f3346e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0290i a(C0290i c0290i, K k2, CancellationException cancellationException, int i) {
        Object obj = c0290i.f3343a;
        if ((i & 2) != 0) {
            k2 = c0290i.f3344b;
        }
        K k3 = k2;
        f1.l lVar = c0290i.f3345c;
        Object obj2 = c0290i.d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = c0290i.f3346e;
        }
        c0290i.getClass();
        return new C0290i(obj, k3, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0290i)) {
            return false;
        }
        C0290i c0290i = (C0290i) obj;
        return g1.f.a(this.f3343a, c0290i.f3343a) && g1.f.a(this.f3344b, c0290i.f3344b) && g1.f.a(this.f3345c, c0290i.f3345c) && g1.f.a(this.d, c0290i.d) && g1.f.a(this.f3346e, c0290i.f3346e);
    }

    public final int hashCode() {
        Object obj = this.f3343a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        K k2 = this.f3344b;
        int hashCode2 = (hashCode + (k2 == null ? 0 : k2.hashCode())) * 31;
        f1.l lVar = this.f3345c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f3346e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f3343a + ", cancelHandler=" + this.f3344b + ", onCancellation=" + this.f3345c + ", idempotentResume=" + this.d + ", cancelCause=" + this.f3346e + ')';
    }

    public /* synthetic */ C0290i(Object obj, K k2, f1.l lVar, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : k2, (i & 4) != 0 ? null : lVar, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
