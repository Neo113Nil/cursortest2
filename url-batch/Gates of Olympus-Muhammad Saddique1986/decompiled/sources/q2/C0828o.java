package q2;

import e2.InterfaceC0427f;
import java.util.concurrent.CancellationException;

/* renamed from: q2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0828o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7911a;

    /* renamed from: b, reason: collision with root package name */
    public final C0818e f7912b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0427f f7913c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7914d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f7915e;

    public C0828o(Object obj, C0818e c0818e, InterfaceC0427f interfaceC0427f, Object obj2, Throwable th) {
        this.f7911a = obj;
        this.f7912b = c0818e;
        this.f7913c = interfaceC0427f;
        this.f7914d = obj2;
        this.f7915e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0828o a(C0828o c0828o, C0818e c0818e, CancellationException cancellationException, int i3) {
        Object obj = c0828o.f7911a;
        if ((i3 & 2) != 0) {
            c0818e = c0828o.f7912b;
        }
        C0818e c0818e2 = c0818e;
        InterfaceC0427f interfaceC0427f = c0828o.f7913c;
        Object obj2 = c0828o.f7914d;
        CancellationException cancellationException2 = cancellationException;
        if ((i3 & 16) != 0) {
            cancellationException2 = c0828o.f7915e;
        }
        c0828o.getClass();
        return new C0828o(obj, c0818e2, interfaceC0427f, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0828o)) {
            return false;
        }
        C0828o c0828o = (C0828o) obj;
        return f2.j.a(this.f7911a, c0828o.f7911a) && f2.j.a(this.f7912b, c0828o.f7912b) && f2.j.a(this.f7913c, c0828o.f7913c) && f2.j.a(this.f7914d, c0828o.f7914d) && f2.j.a(this.f7915e, c0828o.f7915e);
    }

    public final int hashCode() {
        Object obj = this.f7911a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C0818e c0818e = this.f7912b;
        int hashCode2 = (hashCode + (c0818e == null ? 0 : c0818e.hashCode())) * 31;
        InterfaceC0427f interfaceC0427f = this.f7913c;
        int hashCode3 = (hashCode2 + (interfaceC0427f == null ? 0 : interfaceC0427f.hashCode())) * 31;
        Object obj2 = this.f7914d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f7915e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f7911a + ", cancelHandler=" + this.f7912b + ", onCancellation=" + this.f7913c + ", idempotentResume=" + this.f7914d + ", cancelCause=" + this.f7915e + ')';
    }

    public /* synthetic */ C0828o(Object obj, C0818e c0818e, InterfaceC0427f interfaceC0427f, CancellationException cancellationException, int i3) {
        this(obj, (i3 & 2) != 0 ? null : c0818e, (i3 & 4) != 0 ? null : interfaceC0427f, (Object) null, (i3 & 16) != 0 ? null : cancellationException);
    }
}
