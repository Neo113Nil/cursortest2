package l8;

import java.util.Collections;
import java.util.HashSet;
import kotlin.collections.i0;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f5892a = null;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f5893b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f5894c;

    /* renamed from: d, reason: collision with root package name */
    public int f5895d;

    /* renamed from: e, reason: collision with root package name */
    public int f5896e;

    /* renamed from: f, reason: collision with root package name */
    public e f5897f;
    public final HashSet g;

    public a(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f5893b = hashSet;
        this.f5894c = new HashSet();
        this.f5895d = 0;
        this.f5896e = 0;
        this.g = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            i7.a.z(cls2, "Null interface");
            this.f5893b.add(r.a(cls2));
        }
    }

    public final void a(j jVar) {
        if (this.f5893b.contains(jVar.f5920a)) {
            a1.e("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            this.f5894c.add(jVar);
        }
    }

    public final b b() {
        if (this.f5897f != null) {
            return new b(this.f5892a, new HashSet(this.f5893b), new HashSet(this.f5894c), this.f5895d, this.f5896e, this.f5897f, this.g);
        }
        i0.l("Missing required property: factory.");
        return null;
    }

    public a(r rVar, r[] rVarArr) {
        HashSet hashSet = new HashSet();
        this.f5893b = hashSet;
        this.f5894c = new HashSet();
        this.f5895d = 0;
        this.f5896e = 0;
        this.g = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            i7.a.z(rVar2, "Null interface");
        }
        Collections.addAll(this.f5893b, rVarArr);
    }
}
