package N3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2154a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f2155b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f2156c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2157d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2158e;

    /* renamed from: f, reason: collision with root package name */
    public final e f2159f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f2160g;

    public b(String str, Set set, Set set2, int i, int i4, e eVar, Set set3) {
        this.f2154a = str;
        this.f2155b = Collections.unmodifiableSet(set);
        this.f2156c = Collections.unmodifiableSet(set2);
        this.f2157d = i;
        this.f2158e = i4;
        this.f2159f = eVar;
        this.f2160g = Collections.unmodifiableSet(set3);
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
            Z5.c.b(cls2, "Null interface");
            hashSet.add(r.a(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new F3.l(1, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f2155b.toArray()) + ">{" + this.f2157d + ", type=" + this.f2158e + ", deps=" + Arrays.toString(this.f2156c.toArray()) + "}";
    }
}
