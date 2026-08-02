package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhq {
    public final List a;
    public final jhb b;
    public final Integer c;
    public final List d;
    public final int e;

    public jhq(List list, jhb jhbVar, int i, Integer num, List list2) {
        jhbVar.getClass();
        this.a = list;
        this.b = jhbVar;
        this.e = i;
        this.c = num;
        this.d = list2;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("texts list cannot be empty");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhq)) {
            return false;
        }
        jhq jhqVar = (jhq) obj;
        return ksp.b(this.a, jhqVar.a) && this.b == jhqVar.b && this.e == jhqVar.e && ksp.b(this.c, jhqVar.c) && ksp.b(this.d, jhqVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Integer num = this.c;
        return (((((hashCode * 31) + this.e) * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.d.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Text(texts=");
        sb.append(this.a);
        sb.append(", color=");
        sb.append(this.b);
        sb.append(", style=");
        switch (this.e) {
            case 1:
                str = "TITLE_MEDIUM";
                break;
            case 2:
                str = "LABEL_LARGE";
                break;
            case 3:
                str = "LABEL_MEDIUM";
                break;
            case 4:
                str = "BODY_MEDIUM";
                break;
            case 5:
                str = "BODY_SMALL";
                break;
            case 6:
                str = "TITLE_SMALL";
                break;
            case 7:
                str = "TITLE_LARGE";
                break;
            default:
                str = "TITLE_LARGE_EMPHASIZED";
                break;
        }
        sb.append((Object) str);
        sb.append(", maxLines=");
        sb.append(this.c);
        sb.append(", accessibilityLabelParts=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ jhq(jhh jhhVar, jhb jhbVar, int i, Integer num, int i2) {
        this(jhhVar, (i2 & 2) != 0 ? jhb.b : jhbVar, (i2 & 4) != 0 ? 2 : i, num, kpk.a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jhq(jhh jhhVar, jhb jhbVar, int i, Integer num, List list) {
        this(ixc.b(jhhVar), jhbVar, i, num, list);
        jhhVar.getClass();
        jhbVar.getClass();
        if (i != 0) {
            return;
        }
        throw null;
    }
}
