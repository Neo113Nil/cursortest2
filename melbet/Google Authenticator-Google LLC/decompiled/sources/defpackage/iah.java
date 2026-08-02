package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iah {
    public final Set a;
    public final Set b;
    public final iaj c;
    public final Set d;
    private final int e;

    public iah(Set set, Set set2, int i, iaj iajVar, Set set3) {
        this.a = DesugarCollections.unmodifiableSet(set);
        this.b = DesugarCollections.unmodifiableSet(set2);
        this.e = i;
        this.c = iajVar;
        this.d = DesugarCollections.unmodifiableSet(set3);
    }

    public static iag a(Class cls) {
        return new iag(cls, new Class[0]);
    }

    @SafeVarargs
    public static iah b(final Object obj, Class cls, Class... clsArr) {
        iag iagVar = new iag(cls, clsArr);
        iagVar.b = new iaj() { // from class: iaf
            @Override // defpackage.iaj
            public final Object a(iai iaiVar) {
                return obj;
            }
        };
        return iagVar.a();
    }

    public final boolean c() {
        return this.e == 0;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.a.toArray()) + ">{0, type=" + this.e + ", deps=" + Arrays.toString(this.b.toArray()) + "}";
    }
}
