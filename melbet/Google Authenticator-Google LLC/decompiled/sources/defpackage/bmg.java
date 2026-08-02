package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bmg {
    private Class a;
    private Class b;
    private Class c;

    public bmg(Class cls, Class cls2, Class cls3) {
        a(cls, cls2, cls3);
    }

    public final void a(Class cls, Class cls2, Class cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bmg bmgVar = (bmg) obj;
        if (!this.a.equals(bmgVar.a) || !this.b.equals(bmgVar.b)) {
            return false;
        }
        Class cls = this.c;
        Class cls2 = bmgVar.c;
        char[] cArr = bmi.a;
        return iwo.b(cls, cls2);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Class cls = this.c;
        return (hashCode * 31) + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + String.valueOf(this.a) + ", second=" + String.valueOf(this.b) + "}";
    }

    public bmg() {
    }
}
