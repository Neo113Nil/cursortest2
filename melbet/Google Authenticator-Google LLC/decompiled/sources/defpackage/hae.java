package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hae implements hac {
    private volatile hac a;
    private Object b;
    private final hak c = new hak();

    public hae(hac hacVar) {
        this.a = hacVar;
    }

    @Override // defpackage.hac
    public final Object bB() {
        if (this.a != null) {
            synchronized (this.c) {
                if (this.a != null) {
                    Object bB = this.a.bB();
                    this.b = bB;
                    this.a = null;
                    return bB;
                }
            }
        }
        return this.b;
    }

    public final String toString() {
        Object obj = this.a;
        if (obj == null) {
            obj = "<supplier that returned " + String.valueOf(this.b) + ">";
        }
        return a.aa(obj, "Suppliers.memoize(", ")");
    }
}
