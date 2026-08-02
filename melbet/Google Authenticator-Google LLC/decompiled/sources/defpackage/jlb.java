package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jlb {
    public volatile jjq a;
    protected volatile jll b;
    private final jll c;
    private final jkd d;
    private volatile boolean e;

    public jlb(jll jllVar) {
        if (jllVar == null) {
            throw new IllegalArgumentException("message cannot be null");
        }
        this.b = jllVar;
        this.c = jllVar.s();
        this.d = jkd.a;
        this.a = null;
        this.e = false;
    }

    final int a() {
        int c = this.a != null ? this.a.c() : this.b.j();
        return ((352 - (Integer.numberOfLeadingZeros(c) * 9)) >>> 6) + c;
    }

    final jll b() {
        try {
            return this.b;
        } catch (jld unused) {
            int i = jkd.b;
            return this.c;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlb)) {
            return b().equals(obj);
        }
        jlb jlbVar = (jlb) obj;
        if (this.a == null || jlbVar.a == null || this.d != jlbVar.d || !this.a.equals(jlbVar.a)) {
            return b().equals(jlbVar.b());
        }
        return true;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return b().toString();
    }
}
