package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class v01 {
    public final Class a;
    public final Class b;

    public v01(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static v01 a(Class cls) {
        return new v01(u01.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v01.class != obj.getClass()) {
            return false;
        }
        v01 v01Var = (v01) obj;
        if (this.b.equals(v01Var.b)) {
            return this.a.equals(v01Var.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.a;
        if (cls2 == u01.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
