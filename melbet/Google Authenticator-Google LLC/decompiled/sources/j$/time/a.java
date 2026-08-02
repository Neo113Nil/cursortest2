package j$.time;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class a extends b implements Serializable {
    public static final a c;
    private static final long serialVersionUID = 6740630888130243051L;
    public final b0 b;

    static {
        System.currentTimeMillis();
        c = new a(c0.e);
    }

    public a(b0 b0Var) {
        this.b = b0Var;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.b.equals(((a) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + String.valueOf(this.b) + "]";
    }
}
