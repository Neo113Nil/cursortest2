package Z1;

import Q.C0273i;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f4561a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f4562b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f4563c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4564d;

    /* renamed from: e, reason: collision with root package name */
    public final e f4565e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f4566f;

    public b(String str, Set set, Set set2, int i2, e eVar, Set set3) {
        this.f4561a = str;
        this.f4562b = Collections.unmodifiableSet(set);
        this.f4563c = Collections.unmodifiableSet(set2);
        this.f4564d = i2;
        this.f4565e = eVar;
        this.f4566f = Collections.unmodifiableSet(set3);
    }

    public static a a(t tVar) {
        return new a(tVar, new t[0]);
    }

    public static b b(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(t.a(cls));
        for (Class cls2 : clsArr) {
            j0.c.s(cls2, "Null interface");
            hashSet.add(t.a(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, new C0273i(2, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f4562b.toArray()) + ">{0, type=" + this.f4564d + ", deps=" + Arrays.toString(this.f4563c.toArray()) + "}";
    }
}
