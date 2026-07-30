package k1;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f682a;

    /* renamed from: b, reason: collision with root package name */
    public final c1.l f683b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f684c;

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f685d;

    public /* synthetic */ i(Object obj, c1.l lVar, CancellationException cancellationException, int i2) {
        this(obj, (i2 & 4) != 0 ? null : lVar, (Object) null, (i2 & 16) != 0 ? null : cancellationException);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return d1.h.a(this.f682a, iVar.f682a) && d1.h.a(this.f683b, iVar.f683b) && d1.h.a(this.f684c, iVar.f684c) && d1.h.a(this.f685d, iVar.f685d);
    }

    public final int hashCode() {
        Object obj = this.f682a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 961;
        c1.l lVar = this.f683b;
        int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f684c;
        int hashCode3 = (hashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f685d;
        return hashCode3 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f682a + ", cancelHandler=null, onCancellation=" + this.f683b + ", idempotentResume=" + this.f684c + ", cancelCause=" + this.f685d + ')';
    }

    public i(Object obj, c1.l lVar, Object obj2, Throwable th) {
        this.f682a = obj;
        this.f683b = lVar;
        this.f684c = obj2;
        this.f685d = th;
    }
}
