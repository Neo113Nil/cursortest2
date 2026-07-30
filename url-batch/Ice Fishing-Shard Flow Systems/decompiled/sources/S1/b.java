package S1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2465a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f2466b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f2467c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2468d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2469e;

    /* renamed from: f, reason: collision with root package name */
    public final e f2470f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f2471g;

    public b(String str, Set set, Set set2, int i2, int i5, e eVar, Set set3) {
        this.f2465a = str;
        this.f2466b = Collections.unmodifiableSet(set);
        this.f2467c = Collections.unmodifiableSet(set2);
        this.f2468d = i2;
        this.f2469e = i5;
        this.f2470f = eVar;
        this.f2471g = Collections.unmodifiableSet(set3);
    }

    public static a a(r rVar) {
        return new a(rVar, new r[0]);
    }

    public static b b(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            O6.g.A(cls2, "Null interface");
            hashSet.add(r.a(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new A4.b(2, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f2466b.toArray()) + ">{" + this.f2468d + ", type=" + this.f2469e + ", deps=" + Arrays.toString(this.f2467c.toArray()) + "}";
    }
}
