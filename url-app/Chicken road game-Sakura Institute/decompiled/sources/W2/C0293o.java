package W2;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: W2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0293o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4284a;

    /* renamed from: b, reason: collision with root package name */
    public final C0283e f4285b;

    /* renamed from: c, reason: collision with root package name */
    public final L2.c f4286c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4287d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f4288e;

    public C0293o(Object obj, C0283e c0283e, L2.c cVar, Object obj2, Throwable th) {
        this.f4284a = obj;
        this.f4285b = c0283e;
        this.f4286c = cVar;
        this.f4287d = obj2;
        this.f4288e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0293o a(C0293o c0293o, C0283e c0283e, CancellationException cancellationException, int i2) {
        Object obj = c0293o.f4284a;
        if ((i2 & 2) != 0) {
            c0283e = c0293o.f4285b;
        }
        C0283e c0283e2 = c0283e;
        L2.c cVar = c0293o.f4286c;
        Object obj2 = c0293o.f4287d;
        CancellationException cancellationException2 = cancellationException;
        if ((i2 & 16) != 0) {
            cancellationException2 = c0293o.f4288e;
        }
        c0293o.getClass();
        return new C0293o(obj, c0283e2, cVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0293o)) {
            return false;
        }
        C0293o c0293o = (C0293o) obj;
        return Intrinsics.a(this.f4284a, c0293o.f4284a) && Intrinsics.a(this.f4285b, c0293o.f4285b) && Intrinsics.a(this.f4286c, c0293o.f4286c) && Intrinsics.a(this.f4287d, c0293o.f4287d) && Intrinsics.a(this.f4288e, c0293o.f4288e);
    }

    public final int hashCode() {
        Object obj = this.f4284a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C0283e c0283e = this.f4285b;
        int hashCode2 = (hashCode + (c0283e == null ? 0 : c0283e.hashCode())) * 31;
        L2.c cVar = this.f4286c;
        int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Object obj2 = this.f4287d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f4288e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f4284a + ", cancelHandler=" + this.f4285b + ", onCancellation=" + this.f4286c + ", idempotentResume=" + this.f4287d + ", cancelCause=" + this.f4288e + ')';
    }

    public /* synthetic */ C0293o(Object obj, C0283e c0283e, L2.c cVar, CancellationException cancellationException, int i2) {
        this(obj, (i2 & 2) != 0 ? null : c0283e, (i2 & 4) != 0 ? null : cVar, (Object) null, (i2 & 16) != 0 ? null : cancellationException);
    }
}
