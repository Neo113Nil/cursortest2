package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gfr extends gft {
    private final Throwable a;

    public gfr(Throwable th) {
        if (th == null) {
            throw new NullPointerException("Null error");
        }
        this.a = th;
    }

    @Override // defpackage.gft
    public final Object a() {
        throw new IllegalStateException("This Result was a failure, and is being polled for data.");
    }

    @Override // defpackage.gft
    public final boolean b() {
        return false;
    }

    @Override // defpackage.gft
    public final Throwable c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gfr) {
            return this.a.equals(((gfr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Failure{error=" + this.a.toString() + "}";
    }

    public gfr() {
        throw null;
    }
}
