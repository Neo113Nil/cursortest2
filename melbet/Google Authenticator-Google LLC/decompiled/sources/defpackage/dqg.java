package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dqg {
    public final gzf a;
    private final String b;

    public dqg(gzf gzfVar, String str) {
        this.a = gzfVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dqg) {
            return ksp.b(this.b, ((dqg) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
