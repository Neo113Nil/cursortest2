package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kom implements Serializable {
    public final Throwable a;

    public kom(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kom) && ksp.b(this.a, ((kom) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.a + ")";
    }
}
