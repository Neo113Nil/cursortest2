package t2;

import java.util.concurrent.CancellationException;

/* renamed from: t2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1203m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10424a;

    /* renamed from: b, reason: collision with root package name */
    public final F f10425b;

    /* renamed from: c, reason: collision with root package name */
    public final l2.l f10426c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10427d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f10428e;

    public C1203m(Object obj, F f, l2.l lVar, Object obj2, Throwable th) {
        this.f10424a = obj;
        this.f10425b = f;
        this.f10426c = lVar;
        this.f10427d = obj2;
        this.f10428e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C1203m a(C1203m c1203m, F f, CancellationException cancellationException, int i3) {
        Object obj = c1203m.f10424a;
        if ((i3 & 2) != 0) {
            f = c1203m.f10425b;
        }
        F f3 = f;
        l2.l lVar = c1203m.f10426c;
        Object obj2 = c1203m.f10427d;
        CancellationException cancellationException2 = cancellationException;
        if ((i3 & 16) != 0) {
            cancellationException2 = c1203m.f10428e;
        }
        c1203m.getClass();
        return new C1203m(obj, f3, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1203m)) {
            return false;
        }
        C1203m c1203m = (C1203m) obj;
        return kotlin.jvm.internal.j.a(this.f10424a, c1203m.f10424a) && kotlin.jvm.internal.j.a(this.f10425b, c1203m.f10425b) && kotlin.jvm.internal.j.a(this.f10426c, c1203m.f10426c) && kotlin.jvm.internal.j.a(this.f10427d, c1203m.f10427d) && kotlin.jvm.internal.j.a(this.f10428e, c1203m.f10428e);
    }

    public final int hashCode() {
        Object obj = this.f10424a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        F f = this.f10425b;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        l2.l lVar = this.f10426c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f10427d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f10428e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f10424a + ", cancelHandler=" + this.f10425b + ", onCancellation=" + this.f10426c + ", idempotentResume=" + this.f10427d + ", cancelCause=" + this.f10428e + ')';
    }

    public /* synthetic */ C1203m(Object obj, F f, l2.l lVar, CancellationException cancellationException, int i3) {
        this(obj, (i3 & 2) != 0 ? null : f, (i3 & 4) != 0 ? null : lVar, (Object) null, (i3 & 16) != 0 ? null : cancellationException);
    }
}
