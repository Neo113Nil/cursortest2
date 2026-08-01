package k0;

import java.util.concurrent.CancellationException;

/* renamed from: k0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0049j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f920a;

    /* renamed from: b, reason: collision with root package name */
    public final d0.l f921b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f922c;

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f923d;

    public C0049j(Object obj, d0.l lVar, Object obj2, Throwable th) {
        this.f920a = obj;
        this.f921b = lVar;
        this.f922c = obj2;
        this.f923d = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0049j)) {
            return false;
        }
        C0049j c0049j = (C0049j) obj;
        return e0.h.a(this.f920a, c0049j.f920a) && e0.h.a(null, null) && e0.h.a(this.f921b, c0049j.f921b) && e0.h.a(this.f922c, c0049j.f922c) && e0.h.a(this.f923d, c0049j.f923d);
    }

    public final int hashCode() {
        Object obj = this.f920a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 961;
        d0.l lVar = this.f921b;
        int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f922c;
        int hashCode3 = (hashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f923d;
        return hashCode3 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f920a + ", cancelHandler=null, onCancellation=" + this.f921b + ", idempotentResume=" + this.f922c + ", cancelCause=" + this.f923d + ')';
    }

    public /* synthetic */ C0049j(Object obj, d0.l lVar, CancellationException cancellationException, int i2) {
        this(obj, (i2 & 4) != 0 ? null : lVar, (Object) null, (i2 & 16) != 0 ? null : cancellationException);
    }
}
