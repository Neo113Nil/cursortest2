package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jht {
    public final jin a;
    public final int b;

    public jht(jin jinVar, int i) {
        this.a = jinVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jht)) {
            return false;
        }
        jht jhtVar = (jht) obj;
        return ksp.b(this.a, jhtVar.a) && this.b == jhtVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrailingContentData(trailingContent=");
        sb.append(this.a);
        sb.append(", trailingContentAlignment=");
        int i = this.b;
        sb.append((Object) (i != 2 ? i != 3 ? "TRAILING_CONTENT_ALIGNMENT_CENTER" : "TRAILING_CONTENT_ALIGNMENT_SECONDARY_TEXT" : "TRAILING_CONTENT_ALIGNMENT_PRIMARY_TEXT"));
        sb.append(")");
        return sb.toString();
    }
}
