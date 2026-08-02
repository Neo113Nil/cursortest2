package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jkc {
    private final Object a;
    private final int b;

    public jkc(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jkc)) {
            return false;
        }
        jkc jkcVar = (jkc) obj;
        return this.a == jkcVar.a && this.b == jkcVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
