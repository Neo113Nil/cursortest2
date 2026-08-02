package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jim implements jie {
    public final jhq a;
    public final jhq b;
    public final jif c;
    public final jhh d;
    public final jin e;
    public final jgn f;
    public final jgn g;
    public final int h;
    public final int i;
    public final jig j;
    private final jhb k;

    public /* synthetic */ jim(jig jigVar, jhq jhqVar, jhq jhqVar2, jif jifVar, jin jinVar, jgn jgnVar, jgn jgnVar2, int i, int i2, int i3) {
        i = (i3 & 256) != 0 ? 1 : i;
        if (i == 0) {
            throw null;
        }
        i2 = (i3 & 1024) != 0 ? 2 : i2;
        if (i2 == 0) {
            throw null;
        }
        int i4 = i3 & 4;
        int i5 = i3 & 8;
        int i6 = i3 & 32;
        int i7 = i3 & 64;
        int i8 = i3 & 128;
        jhqVar2 = i4 != 0 ? null : jhqVar2;
        jifVar = i5 != 0 ? null : jifVar;
        jinVar = i6 != 0 ? null : jinVar;
        jgnVar = i7 != 0 ? null : jgnVar;
        jgnVar2 = i8 != 0 ? null : jgnVar2;
        this.j = jigVar;
        this.a = jhqVar;
        this.b = jhqVar2;
        this.c = jifVar;
        this.d = null;
        this.e = jinVar;
        this.f = jgnVar;
        this.g = jgnVar2;
        this.h = i;
        this.k = null;
        this.i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jim)) {
            return false;
        }
        jim jimVar = (jim) obj;
        if (!ksp.b(this.j, jimVar.j) || !ksp.b(this.a, jimVar.a) || !ksp.b(this.b, jimVar.b) || !ksp.b(this.c, jimVar.c)) {
            return false;
        }
        jhh jhhVar = jimVar.d;
        if (!ksp.b(null, null) || !ksp.b(this.e, jimVar.e) || !ksp.b(this.f, jimVar.f) || !ksp.b(this.g, jimVar.g) || this.h != jimVar.h) {
            return false;
        }
        jhb jhbVar = jimVar.k;
        return this.i == jimVar.i;
    }

    public final int hashCode() {
        int hashCode = (this.j.hashCode() * 31) + this.a.hashCode();
        jhq jhqVar = this.b;
        int hashCode2 = ((hashCode * 31) + (jhqVar == null ? 0 : jhqVar.hashCode())) * 31;
        jif jifVar = this.c;
        int hashCode3 = hashCode2 + (jifVar == null ? 0 : jifVar.hashCode());
        jin jinVar = this.e;
        int hashCode4 = ((hashCode3 * 961) + (jinVar == null ? 0 : jinVar.hashCode())) * 31;
        jgn jgnVar = this.f;
        int hashCode5 = (hashCode4 + (jgnVar == null ? 0 : jgnVar.hashCode())) * 31;
        jgn jgnVar2 = this.g;
        return ((((hashCode5 + (jgnVar2 != null ? jgnVar2.hashCode() : 0)) * 31) + this.h) * 961) + this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReadyState(cardImage=");
        sb.append(this.j);
        sb.append(", title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", content=");
        sb.append(this.c);
        sb.append(", accessibilityTitle=null, trailingContent=");
        sb.append(this.e);
        sb.append(", mainButton=");
        sb.append(this.f);
        sb.append(", secondaryButton=");
        sb.append(this.g);
        sb.append(", containerType=");
        sb.append((Object) (this.h != 1 ? "ACCOUNT_MANAGEMENT_CONTAINER" : "DEFAULT_CONTAINER"));
        sb.append(", overlayColor=null, iconAlignment=");
        sb.append((Object) (this.i != 1 ? "CENTERED_TO_TITLES" : "CARD_TOP"));
        sb.append(")");
        return sb.toString();
    }
}
