package k0;

import java.util.concurrent.CancellationException;

/* renamed from: k0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f867a;

    /* renamed from: b, reason: collision with root package name */
    public final d0.l f868b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f869c;

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f870d;

    public C0051j(Object obj, d0.l lVar, Object obj2, Throwable th) {
        this.f867a = obj;
        this.f868b = lVar;
        this.f869c = obj2;
        this.f870d = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0051j)) {
            return false;
        }
        C0051j c0051j = (C0051j) obj;
        return e0.h.a(this.f867a, c0051j.f867a) && e0.h.a(null, null) && e0.h.a(this.f868b, c0051j.f868b) && e0.h.a(this.f869c, c0051j.f869c) && e0.h.a(this.f870d, c0051j.f870d);
    }

    public final int hashCode() {
        Object obj = this.f867a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 961;
        d0.l lVar = this.f868b;
        int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f869c;
        int hashCode3 = (hashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f870d;
        return hashCode3 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f867a + ", cancelHandler=null, onCancellation=" + this.f868b + ", idempotentResume=" + this.f869c + ", cancelCause=" + this.f870d + ')';
    }

    public /* synthetic */ C0051j(Object obj, d0.l lVar, CancellationException cancellationException, int i2) {
        this(obj, (i2 & 4) != 0 ? null : lVar, (Object) null, (i2 & 16) != 0 ? null : cancellationException);
    }
}
