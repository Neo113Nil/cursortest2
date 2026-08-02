package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ian {
    public final iaz a;
    public final int b;
    private final int c;

    public ian(Class cls, int i, int i2) {
        this.a = new iaz(iay.class, cls);
        this.b = i;
        this.c = i2;
    }

    public final boolean a() {
        return this.c == 0;
    }

    public final boolean b() {
        return this.b == 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ian) {
            ian ianVar = (ian) obj;
            if (this.a.equals(ianVar.a) && this.b == ianVar.b && this.c == ianVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b == 1 ? "required" : "set");
        sb.append(", injection=");
        sb.append(this.c != 0 ? "provider" : "direct");
        sb.append("}");
        return sb.toString();
    }
}
