package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class jd {
    public final Object a;
    public final ok b;
    public final ja c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ jd(Object obj, ok okVar, ja jaVar, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : okVar, (i & 4) != 0 ? null : jaVar, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static jd a(jd jdVar, ok okVar, CancellationException cancellationException, int i) {
        Object obj = jdVar.a;
        if ((i & 2) != 0) {
            okVar = jdVar.b;
        }
        ok okVar2 = okVar;
        ja jaVar = jdVar.c;
        Object obj2 = jdVar.d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = jdVar.e;
        }
        return new jd(obj, okVar2, jaVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd)) {
            return false;
        }
        jd jdVar = (jd) obj;
        return mv.c(this.a, jdVar.a) && mv.c(this.b, jdVar.b) && mv.c(this.c, jdVar.c) && mv.c(this.d, jdVar.d) && mv.c(this.e, jdVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        ok okVar = this.b;
        int hashCode2 = (hashCode + (okVar == null ? 0 : okVar.hashCode())) * 31;
        ja jaVar = this.c;
        int hashCode3 = (hashCode2 + (jaVar == null ? 0 : jaVar.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public jd(Object obj, ok okVar, ja jaVar, Object obj2, Throwable th) {
        this.a = obj;
        this.b = okVar;
        this.c = jaVar;
        this.d = obj2;
        this.e = th;
    }
}
