package k2;

import java.util.concurrent.CancellationException;

/* renamed from: k2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0543o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5372a;

    /* renamed from: b, reason: collision with root package name */
    public final C0533e f5373b;

    /* renamed from: c, reason: collision with root package name */
    public final Y1.f f5374c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5375d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f5376e;

    public C0543o(Object obj, C0533e c0533e, Y1.f fVar, Object obj2, Throwable th) {
        this.f5372a = obj;
        this.f5373b = c0533e;
        this.f5374c = fVar;
        this.f5375d = obj2;
        this.f5376e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0543o a(C0543o c0543o, C0533e c0533e, CancellationException cancellationException, int i3) {
        Object obj = c0543o.f5372a;
        if ((i3 & 2) != 0) {
            c0533e = c0543o.f5373b;
        }
        C0533e c0533e2 = c0533e;
        Y1.f fVar = c0543o.f5374c;
        Object obj2 = c0543o.f5375d;
        CancellationException cancellationException2 = cancellationException;
        if ((i3 & 16) != 0) {
            cancellationException2 = c0543o.f5376e;
        }
        c0543o.getClass();
        return new C0543o(obj, c0533e2, fVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0543o)) {
            return false;
        }
        C0543o c0543o = (C0543o) obj;
        return Z1.i.a(this.f5372a, c0543o.f5372a) && Z1.i.a(this.f5373b, c0543o.f5373b) && Z1.i.a(this.f5374c, c0543o.f5374c) && Z1.i.a(this.f5375d, c0543o.f5375d) && Z1.i.a(this.f5376e, c0543o.f5376e);
    }

    public final int hashCode() {
        Object obj = this.f5372a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C0533e c0533e = this.f5373b;
        int hashCode2 = (hashCode + (c0533e == null ? 0 : c0533e.hashCode())) * 31;
        Y1.f fVar = this.f5374c;
        int hashCode3 = (hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Object obj2 = this.f5375d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f5376e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f5372a + ", cancelHandler=" + this.f5373b + ", onCancellation=" + this.f5374c + ", idempotentResume=" + this.f5375d + ", cancelCause=" + this.f5376e + ')';
    }

    public /* synthetic */ C0543o(Object obj, C0533e c0533e, Y1.f fVar, CancellationException cancellationException, int i3) {
        this(obj, (i3 & 2) != 0 ? null : c0533e, (i3 & 4) != 0 ? null : fVar, (Object) null, (i3 & 16) != 0 ? null : cancellationException);
    }
}
