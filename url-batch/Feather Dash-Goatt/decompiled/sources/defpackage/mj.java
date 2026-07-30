package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class mj {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final ak f;
    public final Set g;

    public mj(String str, Set set, Set set2, int i, int i2, ak akVar, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = akVar;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static lj a(v01 v01Var) {
        return new lj(v01Var, new v01[0]);
    }

    public static mj b(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(v01.a(cls));
        for (Class cls2 : clsArr) {
            ca0.f(cls2, "Null interface");
            hashSet.add(v01.a(cls2));
        }
        return new mj(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new kj(1, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
