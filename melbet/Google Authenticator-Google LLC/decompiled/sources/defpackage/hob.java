package defpackage;

import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hob {
    public static final Comparator a = new alu(7);
    public static final hob b = new hob(new hnz(Collections.EMPTY_LIST));
    public final hnz c;

    public hob(hnz hnzVar) {
        this.c = hnzVar;
    }

    public final boolean a() {
        return this.c.isEmpty();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof hob) && ((hob) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return ~this.c.hashCode();
    }

    public final String toString() {
        return this.c.toString();
    }
}
