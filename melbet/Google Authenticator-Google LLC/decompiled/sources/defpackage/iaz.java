package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iaz {
    private final Class a;
    private final Class b;

    public iaz(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        iaz iazVar = (iaz) obj;
        if (this.b.equals(iazVar.b)) {
            return this.a.equals(iazVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return this.b.getName();
    }
}
