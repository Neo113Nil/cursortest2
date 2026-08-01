package com.google.android.gms.internal.measurement;

import android.os.Looper;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class jb {

    /* renamed from: a, reason: collision with root package name */
    public final da f2428a;

    public jb(da daVar) {
        this.f2428a = daVar;
    }

    public static f8.a b(Task task) {
        ja jaVar = new ja();
        jaVar.f2427v = task;
        v5 v5Var = new v5(10, jaVar);
        f8.d0 d0Var = f8.d0.f4128d;
        task.b(d0Var, v5Var);
        return f8.l0.a(jaVar, a7.e.class, ib.f2402b, d0Var);
    }

    public final f8.a a(l5 l5Var) {
        String sb2;
        da daVar = this.f2428a;
        String simpleName = fa.class.getSimpleName();
        Looper looper = daVar.g;
        c7.c0.h(looper, "Looper must not be null");
        b7.f fVar = new b7.f(looper, l5Var, simpleName);
        String a9 = g7.b.a();
        if (a9 == null) {
            sb2 = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            int length = a9.length() + 1;
            int identityHashCode = System.identityHashCode(fa.class);
            StringBuilder sb3 = new StringBuilder(length + String.valueOf(identityHashCode).length());
            sb3.append(a9);
            sb3.append("|");
            sb3.append(identityHashCode);
            sb2 = sb3.toString();
        }
        a1.n nVar = new a1.n(daVar, sb2, fVar, 9);
        h1 h1Var = h1.f2358s;
        b7.h hVar = new b7.h();
        hVar.f1295d = fVar;
        hVar.f1293b = nVar;
        hVar.f1294c = h1Var;
        hVar.f1296e = new z6.d[]{h.f2350b};
        hVar.f1292a = false;
        b7.e eVar = ((b7.f) hVar.f1295d).f1286b;
        c7.c0.h(eVar, "Key must not be null");
        b7.f fVar2 = (b7.f) hVar.f1295d;
        b7.o0 o0Var = new b7.o0(hVar, fVar2, (z6.d[]) hVar.f1296e, hVar.f1292a);
        d9.c cVar = new d9.c(hVar, eVar);
        c7.c0.h(fVar2.f1286b, "Listener has already been released.");
        b7.d dVar = daVar.j;
        dVar.getClass();
        w7.g gVar = new w7.g();
        dVar.b(gVar, 0, daVar);
        b7.m0 m0Var = new b7.m0(new b7.r0(new b7.n0(o0Var, cVar), gVar), dVar.f1270i.get(), daVar);
        z5 z5Var = dVar.f1273m;
        z5Var.sendMessage(z5Var.obtainMessage(8, m0Var));
        return b(gVar.f10117a);
    }
}
