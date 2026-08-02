package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iag {
    public int a;
    public iaj b;
    private final Set c;
    private final Set d;
    private final Set e;

    @SafeVarargs
    public iag(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.c = hashSet;
        this.d = new HashSet();
        this.a = 0;
        this.e = new HashSet();
        hashSet.add(new iaz(iay.class, cls));
        for (Class cls2 : clsArr) {
            a.v(cls2, "Null interface");
            this.c.add(new iaz(iay.class, cls2));
        }
    }

    public final iah a() {
        if (this.b != null) {
            return new iah(new HashSet(this.c), new HashSet(this.d), this.a, this.b, this.e);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public final void b(ian ianVar) {
        if (this.c.contains(ianVar.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.d.add(ianVar);
    }
}
