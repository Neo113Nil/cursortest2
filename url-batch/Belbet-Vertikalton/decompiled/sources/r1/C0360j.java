package r1;

import i1.InterfaceC0192l;
import java.util.concurrent.CancellationException;

/* renamed from: r1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0360j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4074a;

    /* renamed from: b, reason: collision with root package name */
    public final L f4075b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0192l f4076c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4077d;
    public final Throwable e;

    public C0360j(Object obj, L l2, InterfaceC0192l interfaceC0192l, Object obj2, Throwable th) {
        this.f4074a = obj;
        this.f4075b = l2;
        this.f4076c = interfaceC0192l;
        this.f4077d = obj2;
        this.e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0360j a(C0360j c0360j, L l2, CancellationException cancellationException, int i) {
        Object obj = c0360j.f4074a;
        if ((i & 2) != 0) {
            l2 = c0360j.f4075b;
        }
        L l3 = l2;
        InterfaceC0192l interfaceC0192l = c0360j.f4076c;
        Object obj2 = c0360j.f4077d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = c0360j.e;
        }
        c0360j.getClass();
        return new C0360j(obj, l3, interfaceC0192l, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0360j)) {
            return false;
        }
        C0360j c0360j = (C0360j) obj;
        return j1.h.a(this.f4074a, c0360j.f4074a) && j1.h.a(this.f4075b, c0360j.f4075b) && j1.h.a(this.f4076c, c0360j.f4076c) && j1.h.a(this.f4077d, c0360j.f4077d) && j1.h.a(this.e, c0360j.e);
    }

    public final int hashCode() {
        Object obj = this.f4074a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        L l2 = this.f4075b;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        InterfaceC0192l interfaceC0192l = this.f4076c;
        int hashCode3 = (hashCode2 + (interfaceC0192l == null ? 0 : interfaceC0192l.hashCode())) * 31;
        Object obj2 = this.f4077d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f4074a + ", cancelHandler=" + this.f4075b + ", onCancellation=" + this.f4076c + ", idempotentResume=" + this.f4077d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ C0360j(Object obj, L l2, InterfaceC0192l interfaceC0192l, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : interfaceC0192l, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
