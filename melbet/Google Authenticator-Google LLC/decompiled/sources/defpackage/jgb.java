package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgb implements jgc {
    public final jgf a;
    public final jgd b;
    public final jfx c;
    public final jhk d;
    public final jge e;
    public final jhh f;
    public final boolean g;
    public final int h;

    public jgb(jgf jgfVar, jgd jgdVar, jfx jfxVar, jhk jhkVar, jge jgeVar, int i, jhh jhhVar, boolean z) {
        jhhVar.getClass();
        this.a = jgfVar;
        this.b = jgdVar;
        this.c = jfxVar;
        this.d = jhkVar;
        this.e = jgeVar;
        this.h = i;
        this.f = jhhVar;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgb)) {
            return false;
        }
        jgb jgbVar = (jgb) obj;
        return ksp.b(this.a, jgbVar.a) && ksp.b(this.b, jgbVar.b) && ksp.b(this.c, jgbVar.c) && ksp.b(this.d, jgbVar.d) && ksp.b(this.e, jgbVar.e) && this.h == jgbVar.h && ksp.b(this.f, jgbVar.f) && this.g == jgbVar.g;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        jhk jhkVar = this.d;
        return (((((((((hashCode * 31) + (jhkVar == null ? 0 : jhkVar.hashCode())) * 31) + this.e.hashCode()) * 31) + this.h) * 31) + this.f.hashCode()) * 31) + a.m(this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ready(accountsState=");
        sb.append(this.a);
        sb.append(", accountMenuTitleData=");
        sb.append(this.b);
        sb.append(", accountMenuFooterData=");
        sb.append(this.c);
        sb.append(", productSpaceData=");
        sb.append(this.d);
        sb.append(", accountMenuToolbarData=");
        sb.append(this.e);
        sb.append(", accountMenuAlignment=");
        int i = this.h;
        sb.append((Object) (i != 1 ? i != 2 ? "ACCOUNT_MENU_ALIGNMENT_CENTER" : "ACCOUNT_MENU_ALIGNMENT_END" : "ACCOUNT_MENU_ALIGNMENT_UNSPECIFIED"));
        sb.append(", accountMenuA11yLabel=");
        sb.append(this.f);
        sb.append(", allowInteractions=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
