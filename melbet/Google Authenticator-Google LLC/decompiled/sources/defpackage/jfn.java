package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfn extends jfp {
    public final int a;
    private final boolean b;
    private final ilc c = null;

    public jfn(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.jfp
    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfn)) {
            return false;
        }
        jfn jfnVar = (jfn) obj;
        if (this.a != jfnVar.a || this.b != jfnVar.b) {
            return false;
        }
        ilc ilcVar = jfnVar.c;
        return ksp.b(null, null);
    }

    public final int hashCode() {
        return ((this.a * 31) + a.m(this.b)) * 31;
    }

    public final String toString() {
        return "ResourceImage(resourceIdentifier=" + this.a + ", shouldTint=" + this.b + ", contentDescription=null)";
    }
}
