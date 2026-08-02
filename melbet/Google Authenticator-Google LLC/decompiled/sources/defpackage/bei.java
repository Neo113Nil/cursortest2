package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bei implements ben {
    int a;
    public Class b;
    private final bej c;

    public bei(bej bejVar) {
        this.c = bejVar;
    }

    @Override // defpackage.ben
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bei) {
            bei beiVar = (bei) obj;
            if (this.a == beiVar.a && this.b == beiVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Class cls = this.b;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.a + "array=" + String.valueOf(this.b) + "}";
    }
}
