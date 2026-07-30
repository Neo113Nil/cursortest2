package M0;

import java.util.concurrent.CancellationException;

/* renamed from: M0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0055m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f670a;

    /* renamed from: b, reason: collision with root package name */
    public final D f671b;

    /* renamed from: c, reason: collision with root package name */
    public final E0.l f672c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f673d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f674e;

    public C0055m(Object obj, D d2, E0.l lVar, Object obj2, Throwable th) {
        this.f670a = obj;
        this.f671b = d2;
        this.f672c = lVar;
        this.f673d = obj2;
        this.f674e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0055m a(C0055m c0055m, D d2, CancellationException cancellationException, int i2) {
        Object obj = c0055m.f670a;
        if ((i2 & 2) != 0) {
            d2 = c0055m.f671b;
        }
        D d3 = d2;
        E0.l lVar = c0055m.f672c;
        Object obj2 = c0055m.f673d;
        CancellationException cancellationException2 = cancellationException;
        if ((i2 & 16) != 0) {
            cancellationException2 = c0055m.f674e;
        }
        c0055m.getClass();
        return new C0055m(obj, d3, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0055m)) {
            return false;
        }
        C0055m c0055m = (C0055m) obj;
        return F0.i.a(this.f670a, c0055m.f670a) && F0.i.a(this.f671b, c0055m.f671b) && F0.i.a(this.f672c, c0055m.f672c) && F0.i.a(this.f673d, c0055m.f673d) && F0.i.a(this.f674e, c0055m.f674e);
    }

    public final int hashCode() {
        Object obj = this.f670a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        D d2 = this.f671b;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        E0.l lVar = this.f672c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f673d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f674e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f670a + ", cancelHandler=" + this.f671b + ", onCancellation=" + this.f672c + ", idempotentResume=" + this.f673d + ", cancelCause=" + this.f674e + ')';
    }

    public /* synthetic */ C0055m(Object obj, D d2, E0.l lVar, CancellationException cancellationException, int i2) {
        this(obj, (i2 & 2) != 0 ? null : d2, (i2 & 4) != 0 ? null : lVar, (Object) null, (i2 & 16) != 0 ? null : cancellationException);
    }
}
