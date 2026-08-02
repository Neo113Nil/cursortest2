package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jil {
    public final int b;
    public final jhb c;
    public final int a = 100;
    public final int[] d = null;
    public final jhh e = null;

    public jil(int i, jhb jhbVar) {
        this.b = i;
        this.c = jhbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jil)) {
            return false;
        }
        jil jilVar = (jil) obj;
        int i = jilVar.a;
        if (this.b != jilVar.b || this.c != jilVar.c) {
            return false;
        }
        int[] iArr = jilVar.d;
        if (!ksp.b(null, null)) {
            return false;
        }
        jhh jhhVar = jilVar.e;
        return ksp.b(null, null);
    }

    public final int hashCode() {
        return (((this.b + 3100) * 31) + this.c.hashCode()) * 961;
    }

    public final String toString() {
        return "ProgressData(max=100, progress=" + this.b + ", color=" + this.c + ", indicatorColors=" + Arrays.toString((int[]) null) + ", contentDescription=null)";
    }
}
