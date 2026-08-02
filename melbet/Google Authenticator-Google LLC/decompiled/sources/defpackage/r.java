package defpackage;

import j$.util.DesugarCollections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class r {

    @Deprecated
    public final Set a;

    @Deprecated
    public final boolean b;

    @Deprecated
    public final int c;

    private r(int i, Set set, boolean z) {
        this.c = i;
        this.a = set;
        this.b = z;
    }

    static r a(String str) {
        int i;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (str.startsWith("integer")) {
            i = 1;
        } else {
            if (!str.startsWith("decimal")) {
                throw new IllegalArgumentException("Samples must start with 'integer' or 'decimal'");
            }
            i = 2;
        }
        boolean z = true;
        boolean z2 = false;
        for (String str2 : w.e.split(str.substring(7).trim())) {
            if (str2.equals("…") || str2.equals("...")) {
                z2 = true;
                z = false;
            } else {
                if (z2) {
                    throw new IllegalArgumentException("Can only have … at the end of samples: ".concat(String.valueOf(str2)));
                }
                String[] split = w.f.split(str2);
                int length = split.length;
                if (length == 1) {
                    p pVar = new p(split[0]);
                    b(i, pVar);
                    linkedHashSet.add(new q(pVar, pVar));
                } else {
                    if (length != 2) {
                        throw new IllegalArgumentException("Ill-formed number range: ".concat(String.valueOf(str2)));
                    }
                    p pVar2 = new p(split[0]);
                    p pVar3 = new p(split[1]);
                    b(i, pVar2);
                    b(i, pVar3);
                    linkedHashSet.add(new q(pVar2, pVar3));
                }
            }
        }
        return new r(i, DesugarCollections.unmodifiableSet(linkedHashSet), z);
    }

    private static void b(int i, p pVar) {
        if ((i == 1) != (pVar.b == 0)) {
            throw new IllegalArgumentException("Ill-formed number range: ".concat(pVar.toString()));
        }
    }

    @Deprecated
    public final String toString() {
        StringBuilder sb = new StringBuilder("@");
        boolean z = true;
        sb.append((this.c != 1 ? "DECIMAL" : "INTEGER").toLowerCase(Locale.ENGLISH));
        for (q qVar : this.a) {
            if (!z) {
                sb.append(",");
            }
            sb.append(' ');
            sb.append(qVar);
            z = false;
        }
        if (!this.b) {
            sb.append(", …");
        }
        return sb.toString();
    }
}
