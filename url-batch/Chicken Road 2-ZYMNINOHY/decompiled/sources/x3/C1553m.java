package x3;

import java.util.concurrent.CancellationException;
import o3.InterfaceC1339l;

/* renamed from: x3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1553m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16041a;

    /* renamed from: b, reason: collision with root package name */
    public final C1530E f16042b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1339l f16043c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16044d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f16045e;

    public C1553m(Object obj, C1530E c1530e, InterfaceC1339l interfaceC1339l, Object obj2, Throwable th) {
        this.f16041a = obj;
        this.f16042b = c1530e;
        this.f16043c = interfaceC1339l;
        this.f16044d = obj2;
        this.f16045e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C1553m a(C1553m c1553m, C1530E c1530e, CancellationException cancellationException, int i4) {
        Object obj = c1553m.f16041a;
        if ((i4 & 2) != 0) {
            c1530e = c1553m.f16042b;
        }
        C1530E c1530e2 = c1530e;
        InterfaceC1339l interfaceC1339l = c1553m.f16043c;
        Object obj2 = c1553m.f16044d;
        CancellationException cancellationException2 = cancellationException;
        if ((i4 & 16) != 0) {
            cancellationException2 = c1553m.f16045e;
        }
        c1553m.getClass();
        return new C1553m(obj, c1530e2, interfaceC1339l, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1553m)) {
            return false;
        }
        C1553m c1553m = (C1553m) obj;
        return kotlin.jvm.internal.i.a(this.f16041a, c1553m.f16041a) && kotlin.jvm.internal.i.a(this.f16042b, c1553m.f16042b) && kotlin.jvm.internal.i.a(this.f16043c, c1553m.f16043c) && kotlin.jvm.internal.i.a(this.f16044d, c1553m.f16044d) && kotlin.jvm.internal.i.a(this.f16045e, c1553m.f16045e);
    }

    public final int hashCode() {
        Object obj = this.f16041a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C1530E c1530e = this.f16042b;
        int hashCode2 = (hashCode + (c1530e == null ? 0 : c1530e.hashCode())) * 31;
        InterfaceC1339l interfaceC1339l = this.f16043c;
        int hashCode3 = (hashCode2 + (interfaceC1339l == null ? 0 : interfaceC1339l.hashCode())) * 31;
        Object obj2 = this.f16044d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f16045e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f16041a + ", cancelHandler=" + this.f16042b + ", onCancellation=" + this.f16043c + ", idempotentResume=" + this.f16044d + ", cancelCause=" + this.f16045e + ')';
    }

    public /* synthetic */ C1553m(Object obj, C1530E c1530e, InterfaceC1339l interfaceC1339l, CancellationException cancellationException, int i4) {
        this(obj, (i4 & 2) != 0 ? null : c1530e, (i4 & 4) != 0 ? null : interfaceC1339l, (Object) null, (i4 & 16) != 0 ? null : cancellationException);
    }
}
