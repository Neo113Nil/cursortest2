package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class u implements Serializable {
    private static final long serialVersionUID = 1;
    public final String a;
    public final o b;
    public final r c;
    public final r d;

    public u(String str, o oVar, r rVar, r rVar2) {
        this.a = str;
        this.b = oVar;
        this.c = rVar;
        this.d = rVar2;
    }

    @Deprecated
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        r rVar = this.c;
        String obj = this.b.toString();
        String concat = rVar == null ? "" : " ".concat(rVar.toString());
        r rVar2 = this.d;
        String concat2 = rVar2 != null ? " ".concat(rVar2.toString()) : "";
        return this.a + ": " + obj + concat + concat2;
    }
}
