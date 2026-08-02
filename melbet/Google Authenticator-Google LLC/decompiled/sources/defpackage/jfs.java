package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfs implements jft {
    public final jgg a;
    public final jiu b;
    public final List c;
    public final jhi d;
    public final int e;
    public final int f = 2;

    public jfs(jgg jggVar, int i, jiu jiuVar, List list, jhi jhiVar) {
        this.a = jggVar;
        this.e = i;
        this.b = jiuVar;
        this.c = list;
        this.d = jhiVar;
    }

    @Override // defpackage.jft
    public final int a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfs)) {
            return false;
        }
        jfs jfsVar = (jfs) obj;
        if (!ksp.b(this.a, jfsVar.a) || this.e != jfsVar.e || !ksp.b(this.b, jfsVar.b) || !ksp.b(this.c, jfsVar.c)) {
            return false;
        }
        int i = jfsVar.f;
        return ksp.b(this.d, jfsVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        jiu jiuVar = this.b;
        int hashCode2 = (((((((hashCode + this.e) * 31) + (jiuVar == null ? 0 : jiuVar.hashCode())) * 31) + this.c.hashCode()) * 31) + 2) * 31;
        jhi jhiVar = this.d;
        return hashCode2 + (jhiVar != null ? jhiVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountHeader(account=");
        sb.append(this.a);
        sb.append(", trailingIcon=");
        int i = this.e;
        sb.append((Object) (i != 1 ? i != 2 ? "NONE" : "INFO" : "CHEVRON_EXPAND"));
        sb.append(", avatarTap=");
        sb.append(this.b);
        sb.append(", accessibilityLabelParts=");
        sb.append(this.c);
        sb.append(", style=COMPACT, premiumDecorationData=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
