package p1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import m1.AbstractC0521b;

/* renamed from: p1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0576a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5660a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f5661b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f5662c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5663d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5664e;

    /* renamed from: f, reason: collision with root package name */
    public final c f5665f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f5666g;

    public C0576a(String str, Set set, Set set2, int i7, int i8, c cVar, Set set3) {
        this.f5660a = str;
        this.f5661b = Collections.unmodifiableSet(set);
        this.f5662c = Collections.unmodifiableSet(set2);
        this.f5663d = i7;
        this.f5664e = i8;
        this.f5665f = cVar;
        this.f5666g = Collections.unmodifiableSet(set3);
    }

    public static N3.e a(o oVar) {
        return new N3.e(oVar, new o[0]);
    }

    public static C0576a b(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(o.a(cls));
        for (Class cls2 : clsArr) {
            AbstractC0521b.f(cls2, "Null interface");
            hashSet.add(o.a(cls2));
        }
        return new C0576a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new B0.b(12, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f5661b.toArray()) + ">{" + this.f5663d + ", type=" + this.f5664e + ", deps=" + Arrays.toString(this.f5662c.toArray()) + "}";
    }
}
