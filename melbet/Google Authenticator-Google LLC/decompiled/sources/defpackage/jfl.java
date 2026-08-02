package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfl extends jfp {
    public final Drawable a;
    private final boolean b;
    private final ilc c = null;

    public jfl(Drawable drawable, boolean z) {
        this.a = drawable;
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
        if (!(obj instanceof jfl)) {
            return false;
        }
        jfl jflVar = (jfl) obj;
        if (!ksp.b(this.a, jflVar.a) || this.b != jflVar.b) {
            return false;
        }
        ilc ilcVar = jflVar.c;
        return ksp.b(null, null);
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + a.m(this.b)) * 31;
    }

    public final String toString() {
        return "CustomImage(icon=" + this.a + ", shouldTint=" + this.b + ", contentDescription=null)";
    }
}
