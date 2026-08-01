package z4;

import ge.f1;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final u f10736a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f10737b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f10738c;

    /* renamed from: d, reason: collision with root package name */
    public final ReentrantLock f10739d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.u f10740e;

    /* renamed from: f, reason: collision with root package name */
    public final n0.u f10741f;
    public final Object g;

    public f(u uVar, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.f10736a = uVar;
        n0 n0Var = new n0(uVar, hashMap, hashMap2, strArr, uVar.f10842k, new f1(1, this, f.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 2));
        this.f10737b = n0Var;
        this.f10738c = new LinkedHashMap();
        this.f10739d = new ReentrantLock();
        this.f10740e = new n0.u(this, 13);
        this.f10741f = new n0.u(this, 14);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.g = new Object();
        n0Var.j = new a1.b(28, this);
    }
}
