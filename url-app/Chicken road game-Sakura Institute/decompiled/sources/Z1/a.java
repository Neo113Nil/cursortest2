package Z1;

import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f4555a = null;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f4556b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f4557c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4558d;

    /* renamed from: e, reason: collision with root package name */
    public e f4559e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f4560f;

    public a(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f4556b = hashSet;
        this.f4557c = new HashSet();
        this.f4558d = 0;
        this.f4560f = new HashSet();
        hashSet.add(t.a(cls));
        for (Class cls2 : clsArr) {
            j0.c.s(cls2, "Null interface");
            this.f4556b.add(t.a(cls2));
        }
    }

    public final void a(k kVar) {
        if (this.f4556b.contains(kVar.f4586a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.f4557c.add(kVar);
    }

    public final b b() {
        if (this.f4559e != null) {
            return new b(this.f4555a, new HashSet(this.f4556b), new HashSet(this.f4557c), this.f4558d, this.f4559e, this.f4560f);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public a(t tVar, t[] tVarArr) {
        HashSet hashSet = new HashSet();
        this.f4556b = hashSet;
        this.f4557c = new HashSet();
        this.f4558d = 0;
        this.f4560f = new HashSet();
        hashSet.add(tVar);
        for (t tVar2 : tVarArr) {
            j0.c.s(tVar2, "Null interface");
        }
        Collections.addAll(this.f4556b, tVarArr);
    }
}
