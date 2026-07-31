package H5;

import java.util.concurrent.CancellationException;
import x5.InterfaceC0743l;

/* renamed from: H5.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1087a;

    /* renamed from: b, reason: collision with root package name */
    public final C0145e f1088b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0743l f1089c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1090d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f1091e;

    public C0155o(Object obj, C0145e c0145e, InterfaceC0743l interfaceC0743l, Object obj2, Throwable th) {
        this.f1087a = obj;
        this.f1088b = c0145e;
        this.f1089c = interfaceC0743l;
        this.f1090d = obj2;
        this.f1091e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0155o a(C0155o c0155o, C0145e c0145e, CancellationException cancellationException, int i7) {
        Object obj = c0155o.f1087a;
        if ((i7 & 2) != 0) {
            c0145e = c0155o.f1088b;
        }
        C0145e c0145e2 = c0145e;
        InterfaceC0743l interfaceC0743l = c0155o.f1089c;
        Object obj2 = c0155o.f1090d;
        CancellationException cancellationException2 = cancellationException;
        if ((i7 & 16) != 0) {
            cancellationException2 = c0155o.f1091e;
        }
        c0155o.getClass();
        return new C0155o(obj, c0145e2, interfaceC0743l, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0155o)) {
            return false;
        }
        C0155o c0155o = (C0155o) obj;
        return kotlin.jvm.internal.i.a(this.f1087a, c0155o.f1087a) && kotlin.jvm.internal.i.a(this.f1088b, c0155o.f1088b) && kotlin.jvm.internal.i.a(this.f1089c, c0155o.f1089c) && kotlin.jvm.internal.i.a(this.f1090d, c0155o.f1090d) && kotlin.jvm.internal.i.a(this.f1091e, c0155o.f1091e);
    }

    public final int hashCode() {
        Object obj = this.f1087a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C0145e c0145e = this.f1088b;
        int hashCode2 = (hashCode + (c0145e == null ? 0 : c0145e.hashCode())) * 31;
        InterfaceC0743l interfaceC0743l = this.f1089c;
        int hashCode3 = (hashCode2 + (interfaceC0743l == null ? 0 : interfaceC0743l.hashCode())) * 31;
        Object obj2 = this.f1090d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f1091e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f1087a + ", cancelHandler=" + this.f1088b + ", onCancellation=" + this.f1089c + ", idempotentResume=" + this.f1090d + ", cancelCause=" + this.f1091e + ')';
    }

    public /* synthetic */ C0155o(Object obj, C0145e c0145e, InterfaceC0743l interfaceC0743l, CancellationException cancellationException, int i7) {
        this(obj, (i7 & 2) != 0 ? null : c0145e, (i7 & 4) != 0 ? null : interfaceC0743l, (Object) null, (i7 & 16) != 0 ? null : cancellationException);
    }
}
