package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gfs extends gft {
    private final Object a;

    public gfs(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null data");
        }
        this.a = obj;
    }

    @Override // defpackage.gft
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.gft
    public final boolean b() {
        return true;
    }

    @Override // defpackage.gft
    public final Throwable c() {
        throw new IllegalStateException("This Result was a success, and is being polled for an error.");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gfs) {
            return this.a.equals(((gfs) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Success{data=" + this.a.toString() + "}";
    }

    public gfs() {
        throw null;
    }
}
