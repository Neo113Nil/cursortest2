package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jha implements jgu {
    public final jhh a;
    public final int b;

    public jha(int i, jhh jhhVar) {
        this.b = i;
        this.a = jhhVar;
    }

    @Override // defpackage.jgu
    public final jhh b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jha)) {
            return false;
        }
        jha jhaVar = (jha) obj;
        return this.b == jhaVar.b && ksp.b(this.a, jhaVar.a);
    }

    public final int hashCode() {
        jhh jhhVar = this.a;
        return (this.b * 31) + (jhhVar == null ? 0 : jhhVar.hashCode());
    }

    public final String toString() {
        return "OgImage(type=" + ((Object) ilg.a(this.b)) + ", a11yLabel=" + this.a + ")";
    }
}
