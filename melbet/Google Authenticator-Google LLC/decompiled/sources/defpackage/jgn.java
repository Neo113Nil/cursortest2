package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgn {
    public final List a;
    public final jiu b;
    public final int c;
    public final jhb d;
    public final jgm e;
    public final jgu f;
    public final int g;

    public jgn(List list, jiu jiuVar, int i, jhb jhbVar, jgm jgmVar, jgu jguVar, int i2) {
        jiuVar.getClass();
        jhbVar.getClass();
        this.a = list;
        this.b = jiuVar;
        this.c = i;
        this.d = jhbVar;
        this.e = jgmVar;
        this.f = jguVar;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgn)) {
            return false;
        }
        jgn jgnVar = (jgn) obj;
        return ksp.b(this.a, jgnVar.a) && ksp.b(this.b, jgnVar.b) && this.c == jgnVar.c && this.d == jgnVar.d && ksp.b(this.e, jgnVar.e) && ksp.b(this.f, jgnVar.f) && this.g == jgnVar.g;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        jgu jguVar = this.f;
        return (((hashCode * 31) + (jguVar == null ? 0 : jguVar.hashCode())) * 31) + this.g;
    }

    public final String toString() {
        return "Button(texts=" + this.a + ", tap=" + this.b + ", veId=" + this.c + ", textColor=" + this.d + ", style=" + this.e + ", icon=" + this.f + ", maxLines=" + this.g + ")";
    }
}
