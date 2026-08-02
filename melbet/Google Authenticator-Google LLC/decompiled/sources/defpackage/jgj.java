package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgj {
    public final jgu a;
    public final int b;
    public final int c;
    private final jhh e = null;
    private final int f = 0;
    public final int d = 1;

    public jgj(jgu jguVar, int i, int i2) {
        this.a = jguVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgj)) {
            return false;
        }
        jgj jgjVar = (jgj) obj;
        if (!ksp.b(this.a, jgjVar.a)) {
            return false;
        }
        jhh jhhVar = jgjVar.e;
        if (!ksp.b(null, null)) {
            return false;
        }
        int i = jgjVar.f;
        if (this.b != jgjVar.b || this.c != jgjVar.c) {
            return false;
        }
        int i2 = jgjVar.d;
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 29791) + this.b) * 31) + this.c) * 31) + 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BadgeData(image=");
        sb.append(this.a);
        sb.append(", accessibilityLabel=null, badgeType=null, badgeStyle=");
        sb.append((Object) (this.b != 1 ? "DIMMED" : "PLAIN"));
        sb.append(", badgePosition=");
        sb.append((Object) (this.c != 1 ? "OVERLAP" : "INSIDE"));
        sb.append(", badgeAlignment=BOTTOM_END)");
        return sb.toString();
    }
}
