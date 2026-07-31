package N3;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import m1.AbstractC0521b;
import p1.C0576a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f1687a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1688b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1689c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f1690d;

    /* renamed from: e, reason: collision with root package name */
    public final Serializable f1691e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1692f;

    /* renamed from: g, reason: collision with root package name */
    public final Serializable f1693g;

    public e(Class cls, Class[] clsArr) {
        this.f1689c = null;
        HashSet hashSet = new HashSet();
        this.f1690d = hashSet;
        this.f1691e = new HashSet();
        this.f1687a = 0;
        this.f1688b = 0;
        this.f1693g = new HashSet();
        hashSet.add(p1.o.a(cls));
        for (Class cls2 : clsArr) {
            AbstractC0521b.f(cls2, "Null interface");
            ((HashSet) this.f1690d).add(p1.o.a(cls2));
        }
    }

    public void a(p1.g gVar) {
        if (((HashSet) this.f1690d).contains(gVar.f5680a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.f1691e).add(gVar);
    }

    public C0576a b() {
        if (((p1.c) this.f1692f) != null) {
            return new C0576a((String) this.f1689c, new HashSet((HashSet) this.f1690d), new HashSet((HashSet) this.f1691e), this.f1687a, this.f1688b, (p1.c) this.f1692f, (HashSet) this.f1693g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public e(p1.o oVar, p1.o[] oVarArr) {
        this.f1689c = null;
        HashSet hashSet = new HashSet();
        this.f1690d = hashSet;
        this.f1691e = new HashSet();
        this.f1687a = 0;
        this.f1688b = 0;
        this.f1693g = new HashSet();
        hashSet.add(oVar);
        for (p1.o oVar2 : oVarArr) {
            AbstractC0521b.f(oVar2, "Null interface");
        }
        Collections.addAll((HashSet) this.f1690d, oVarArr);
    }

    public e(Integer num, int i7, Boolean bool, Integer num2, int i8, Integer num3, Boolean bool2) {
        this.f1689c = num;
        this.f1687a = i7;
        this.f1692f = bool;
        this.f1690d = num2;
        this.f1688b = i8;
        this.f1691e = num3;
        this.f1693g = bool2;
    }
}
