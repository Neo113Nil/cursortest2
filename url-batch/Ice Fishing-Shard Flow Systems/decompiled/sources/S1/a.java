package S1;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f2458a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2459b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2460c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f2461d;

    /* renamed from: e, reason: collision with root package name */
    public final Serializable f2462e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f2463f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2464g;

    public a(Class cls, Class[] clsArr) {
        this.f2460c = null;
        HashSet hashSet = new HashSet();
        this.f2461d = hashSet;
        this.f2462e = new HashSet();
        this.f2458a = 0;
        this.f2459b = 0;
        this.f2463f = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            O6.g.A(cls2, "Null interface");
            ((HashSet) this.f2461d).add(r.a(cls2));
        }
    }

    public void a(j jVar) {
        if (((HashSet) this.f2461d).contains(jVar.f2488a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.f2462e).add(jVar);
    }

    public b b() {
        if (((e) this.f2464g) != null) {
            return new b((String) this.f2460c, new HashSet((HashSet) this.f2461d), new HashSet((HashSet) this.f2462e), this.f2458a, this.f2459b, (e) this.f2464g, (HashSet) this.f2463f);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public a(r rVar, r[] rVarArr) {
        this.f2460c = null;
        HashSet hashSet = new HashSet();
        this.f2461d = hashSet;
        this.f2462e = new HashSet();
        this.f2458a = 0;
        this.f2459b = 0;
        this.f2463f = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            O6.g.A(rVar2, "Null interface");
        }
        Collections.addAll((HashSet) this.f2461d, rVarArr);
    }

    public a(Integer num, int i2, Boolean bool, Integer num2, int i5, Integer num3, Boolean bool2) {
        this.f2460c = num;
        this.f2458a = i2;
        this.f2461d = bool;
        this.f2462e = num2;
        this.f2459b = i5;
        this.f2463f = num3;
        this.f2464g = bool2;
    }
}
