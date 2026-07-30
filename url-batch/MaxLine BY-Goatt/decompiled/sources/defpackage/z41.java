package defpackage;

import com.majelw.libystne.data.MaxLineDatabase_Impl;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class z41 {
    public final MaxLineDatabase_Impl a;
    public final f03 b;
    public final LinkedHashMap c;
    public final ReentrantLock d;
    public final e4 e;
    public final e4 f;
    public final Object g;

    public z41(MaxLineDatabase_Impl maxLineDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.a = maxLineDatabase_Impl;
        f03 f03Var = new f03(maxLineDatabase_Impl, linkedHashMap, linkedHashMap2, strArr, maxLineDatabase_Impl.j, new rk(1, this, z41.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 0, 3));
        this.b = f03Var;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new e4(this, 9);
        this.f = new e4(this, 10);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.g = new Object();
        f03Var.k = new dj(5, this);
    }

    public final void a() {
        f03 f03Var = this.b;
        f03Var.getClass();
        this.e.getClass();
        e4 e4Var = this.f;
        e4Var.getClass();
        if (f03Var.j.compareAndSet(false, true)) {
            Unit unit = Unit.a;
            m30 m30Var = f03Var.a.a;
            o30 o30Var = null;
            if (m30Var != null) {
                z71.H(m30Var, new w40(), new z62(f03Var, e4Var, o30Var, 9), 2);
            } else {
                Intrinsics.f("coroutineScope");
                throw null;
            }
        }
    }

    public final Object b(pr2 pr2Var) {
        MaxLineDatabase_Impl maxLineDatabase_Impl = this.a;
        if (maxLineDatabase_Impl.g() && !maxLineDatabase_Impl.h()) {
            return Unit.a;
        }
        Object e = this.b.e(pr2Var);
        return e == b50.m ? e : Unit.a;
    }
}
