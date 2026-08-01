package l8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f5898a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f5899b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f5900c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5901d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5902e;

    /* renamed from: f, reason: collision with root package name */
    public final e f5903f;
    public final Set g;

    public b(String str, Set set, Set set2, int i3, int i10, e eVar, Set set3) {
        this.f5898a = str;
        this.f5899b = Collections.unmodifiableSet(set);
        this.f5900c = Collections.unmodifiableSet(set2);
        this.f5901d = i3;
        this.f5902e = i10;
        this.f5903f = eVar;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static a a(Class cls) {
        return new a(cls, new Class[0]);
    }

    public static a b(r rVar) {
        return new a(rVar, new r[0]);
    }

    public static b c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            i7.a.z(cls2, "Null interface");
            hashSet.add(r.a(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new b1.h(8, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f5899b.toArray()) + ">{" + this.f5901d + ", type=" + this.f5902e + ", deps=" + Arrays.toString(this.f5900c.toArray()) + "}";
    }
}
