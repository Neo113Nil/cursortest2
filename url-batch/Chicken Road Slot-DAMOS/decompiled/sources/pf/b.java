package pf;

import androidx.lifecycle.u0;
import androidx.lifecycle.w0;
import b1.j;
import com.google.android.gms.internal.measurement.se;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import k4.e;
import kotlin.collections.i0;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import n0.l;
import u8.d;
import wd.h;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final h f7716a;

    /* renamed from: b, reason: collision with root package name */
    public final lf.a f7717b;

    public b(h hVar, lf.a aVar) {
        aVar.getClass();
        this.f7716a = hVar;
        this.f7717b = aVar;
    }

    @Override // androidx.lifecycle.w0
    public final u0 b(h hVar, e eVar) {
        a aVar = new a(eVar);
        se seVar = this.f7717b.f6020e;
        jf.a aVar2 = (jf.a) seVar.f2802s;
        aVar2.getClass();
        Object obj = aVar2.f5253a.get(ff.a.f4218d);
        if (obj == null) {
            obj = null;
        }
        if (!Intrinsics.a(obj, Boolean.TRUE)) {
            return (u0) this.f7717b.d(this.f7716a, aVar);
        }
        String str = hVar.c() + '-' + k7.e.s();
        hf.c cVar = new hf.c(hVar);
        hf.c cVar2 = qf.a.f8064a;
        jf.b bVar = (jf.b) seVar.f2800i;
        ConcurrentHashMap concurrentHashMap = bVar.f5257c;
        ((d) bVar.f5255a.f2798d).getClass();
        df.a aVar3 = df.a.f3728d;
        df.a aVar4 = df.a.f3732s;
        aVar4.compareTo(aVar3);
        Set set = bVar.f5256b;
        if (!set.contains(cVar)) {
            aVar4.compareTo(aVar3);
            set.add(cVar);
        }
        if (concurrentHashMap.containsKey(str)) {
            throw new j(l.g("Scope with id '", str, "' is already created"), 4);
        }
        lf.a aVar5 = new lf.a(cVar, str, cVar2, bVar.f5255a, 4);
        lf.a[] aVarArr = {bVar.f5258d};
        if (aVar5.f6018c) {
            i0.l("Can't add scope link to a root scope");
            return null;
        }
        aVar5.f6021f.addAll(0, w.v(aVarArr));
        concurrentHashMap.put(str, aVar5);
        u0 u0Var = (u0) aVar5.d(this.f7716a, aVar);
        c cVar3 = new c(str, seVar);
        u0Var.getClass();
        m4.d dVar = u0Var.f729a;
        if (dVar == null) {
            return u0Var;
        }
        if (dVar.f6558d) {
            m4.d.a(cVar3);
            return u0Var;
        }
        synchronized (dVar.f6555a) {
            dVar.f6557c.add(cVar3);
        }
        return u0Var;
    }
}
