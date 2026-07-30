package n6;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n6.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0783p {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7070a;

    /* renamed from: b, reason: collision with root package name */
    public final C0772e f7071b;

    /* renamed from: c, reason: collision with root package name */
    public final e6.n f7072c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7073d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f7074e;

    public C0783p(Object obj, C0772e c0772e, e6.n nVar, Object obj2, Throwable th) {
        this.f7070a = obj;
        this.f7071b = c0772e;
        this.f7072c = nVar;
        this.f7073d = obj2;
        this.f7074e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0783p a(C0783p c0783p, C0772e c0772e, CancellationException cancellationException, int i2) {
        Object obj = c0783p.f7070a;
        if ((i2 & 2) != 0) {
            c0772e = c0783p.f7071b;
        }
        C0772e c0772e2 = c0772e;
        e6.n nVar = c0783p.f7072c;
        Object obj2 = c0783p.f7073d;
        CancellationException cancellationException2 = cancellationException;
        if ((i2 & 16) != 0) {
            cancellationException2 = c0783p.f7074e;
        }
        c0783p.getClass();
        return new C0783p(obj, c0772e2, nVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0783p)) {
            return false;
        }
        C0783p c0783p = (C0783p) obj;
        return Intrinsics.a(this.f7070a, c0783p.f7070a) && Intrinsics.a(this.f7071b, c0783p.f7071b) && Intrinsics.a(this.f7072c, c0783p.f7072c) && Intrinsics.a(this.f7073d, c0783p.f7073d) && Intrinsics.a(this.f7074e, c0783p.f7074e);
    }

    public final int hashCode() {
        Object obj = this.f7070a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C0772e c0772e = this.f7071b;
        int hashCode2 = (hashCode + (c0772e == null ? 0 : c0772e.hashCode())) * 31;
        e6.n nVar = this.f7072c;
        int hashCode3 = (hashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        Object obj2 = this.f7073d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f7074e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f7070a + ", cancelHandler=" + this.f7071b + ", onCancellation=" + this.f7072c + ", idempotentResume=" + this.f7073d + ", cancelCause=" + this.f7074e + ')';
    }

    public /* synthetic */ C0783p(Object obj, C0772e c0772e, e6.n nVar, CancellationException cancellationException, int i2) {
        this(obj, (i2 & 2) != 0 ? null : c0772e, (i2 & 4) != 0 ? null : nVar, (Object) null, (i2 & 16) != 0 ? null : cancellationException);
    }
}
