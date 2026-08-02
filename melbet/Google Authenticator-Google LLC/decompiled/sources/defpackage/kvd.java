package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvd {
    public final Object a;
    public final kuu b;
    public final kry c;
    public final Object d = null;
    public final Throwable e;

    public kvd(Object obj, kuu kuuVar, kry kryVar, Throwable th) {
        this.a = obj;
        this.b = kuuVar;
        this.c = kryVar;
        this.e = th;
    }

    public static /* synthetic */ kvd b(kvd kvdVar, kuu kuuVar, Throwable th, int i) {
        Object obj = (i & 1) != 0 ? kvdVar.a : null;
        if ((i & 2) != 0) {
            kuuVar = kvdVar.b;
        }
        kry kryVar = (i & 4) != 0 ? kvdVar.c : null;
        if ((i & 8) != 0) {
            Object obj2 = kvdVar.d;
        }
        if ((i & 16) != 0) {
            th = kvdVar.e;
        }
        return new kvd(obj, kuuVar, kryVar, th);
    }

    public final boolean a() {
        return this.e != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvd)) {
            return false;
        }
        kvd kvdVar = (kvd) obj;
        if (!ksp.b(this.a, kvdVar.a) || !ksp.b(this.b, kvdVar.b) || !ksp.b(this.c, kvdVar.c)) {
            return false;
        }
        Object obj2 = kvdVar.d;
        return ksp.b(null, null) && ksp.b(this.e, kvdVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        kuu kuuVar = this.b;
        int hashCode2 = kuuVar == null ? 0 : kuuVar.hashCode();
        int i = hashCode * 31;
        kry kryVar = this.c;
        int hashCode3 = kryVar == null ? 0 : kryVar.hashCode();
        int i2 = (i + hashCode2) * 31;
        Throwable th = this.e;
        return ((i2 + hashCode3) * 961) + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=null, cancelCause=" + this.e + ")";
    }
}
