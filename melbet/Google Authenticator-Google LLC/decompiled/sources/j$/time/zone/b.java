package j$.time.zone;

import j$.time.c0;
import j$.time.l;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;
    public final long a;
    public final l b;
    public final c0 c;
    public final c0 d;

    public b(l lVar, c0 c0Var, c0 c0Var2) {
        lVar.getClass();
        this.a = j$.nio.file.attribute.a.v(lVar, c0Var);
        this.b = lVar;
        this.c = c0Var;
        this.d = c0Var2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((b) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.a == bVar.a && this.c.equals(bVar.c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.d.a, 16) ^ (this.b.hashCode() ^ this.c.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        c0 c0Var = this.d;
        int i = c0Var.a;
        c0 c0Var2 = this.c;
        sb.append(i > c0Var2.a ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.b);
        sb.append(c0Var2);
        sb.append(" to ");
        sb.append(c0Var);
        sb.append(']');
        return sb.toString();
    }

    public b(long j, c0 c0Var, c0 c0Var2) {
        this.a = j;
        this.b = l.x(j, 0, c0Var);
        this.c = c0Var;
        this.d = c0Var2;
    }
}
