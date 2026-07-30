package O7;

import java.util.concurrent.CancellationException;

/* renamed from: O7.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0390o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2613a;

    /* renamed from: b, reason: collision with root package name */
    public final C0380e f2614b;

    /* renamed from: c, reason: collision with root package name */
    public final E7.l f2615c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2616d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f2617e;

    public C0390o(Object obj, C0380e c0380e, E7.l lVar, Object obj2, Throwable th) {
        this.f2613a = obj;
        this.f2614b = c0380e;
        this.f2615c = lVar;
        this.f2616d = obj2;
        this.f2617e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0390o a(C0390o c0390o, C0380e c0380e, CancellationException cancellationException, int i) {
        Object obj = c0390o.f2613a;
        if ((i & 2) != 0) {
            c0380e = c0390o.f2614b;
        }
        C0380e c0380e2 = c0380e;
        E7.l lVar = c0390o.f2615c;
        Object obj2 = c0390o.f2616d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = c0390o.f2617e;
        }
        c0390o.getClass();
        return new C0390o(obj, c0380e2, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0390o)) {
            return false;
        }
        C0390o c0390o = (C0390o) obj;
        return kotlin.jvm.internal.h.a(this.f2613a, c0390o.f2613a) && kotlin.jvm.internal.h.a(this.f2614b, c0390o.f2614b) && kotlin.jvm.internal.h.a(this.f2615c, c0390o.f2615c) && kotlin.jvm.internal.h.a(this.f2616d, c0390o.f2616d) && kotlin.jvm.internal.h.a(this.f2617e, c0390o.f2617e);
    }

    public final int hashCode() {
        Object obj = this.f2613a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C0380e c0380e = this.f2614b;
        int hashCode2 = (hashCode + (c0380e == null ? 0 : c0380e.hashCode())) * 31;
        E7.l lVar = this.f2615c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f2616d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f2617e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f2613a + ", cancelHandler=" + this.f2614b + ", onCancellation=" + this.f2615c + ", idempotentResume=" + this.f2616d + ", cancelCause=" + this.f2617e + ')';
    }

    public /* synthetic */ C0390o(Object obj, C0380e c0380e, E7.l lVar, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : c0380e, (i & 4) != 0 ? null : lVar, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
