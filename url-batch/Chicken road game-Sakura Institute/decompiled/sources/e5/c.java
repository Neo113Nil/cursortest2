package e5;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2760a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f2761b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f2762c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2763d;

    /* renamed from: e, reason: collision with root package name */
    public final f f2764e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f2765f;

    public c(String str, Set set, Set set2, int i7, f fVar, Set set3) {
        this.f2760a = str;
        this.f2761b = Collections.unmodifiableSet(set);
        this.f2762c = Collections.unmodifiableSet(set2);
        this.f2763d = i7;
        this.f2764e = fVar;
        this.f2765f = Collections.unmodifiableSet(set3);
    }

    public static b a(t tVar) {
        return new b(tVar, new t[0]);
    }

    public static c b(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(t.a(cls));
        for (Class cls2 : clsArr) {
            a8.m.n(cls2, "Null interface");
            hashSet.add(t.a(cls2));
        }
        return new c(null, new HashSet(hashSet), new HashSet(hashSet2), 0, new a(1, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f2761b.toArray()) + ">{0, type=" + this.f2763d + ", deps=" + Arrays.toString(this.f2762c.toArray()) + "}";
    }
}
