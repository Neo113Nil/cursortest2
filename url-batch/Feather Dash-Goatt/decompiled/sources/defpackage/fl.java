package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class fl extends ml {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final LinkedHashSet e = new LinkedHashSet();
    public final av0 f = new av0(kw0.k, j50.B);
    public final /* synthetic */ hl g;

    public fl(hl hlVar, long j, boolean z, boolean z2, s40 s40Var) {
        this.g = hlVar;
        this.a = j;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.ml
    public final void a(tl tlVar, Function2 function2) {
        this.g.b.a(tlVar, function2);
    }

    @Override // defpackage.ml
    public final wn0 b(tl tlVar, na1 na1Var, Function2 function2) {
        return this.g.b.b(tlVar, na1Var, function2);
    }

    @Override // defpackage.ml
    public final void c() {
        hl hlVar = this.g;
        hlVar.A--;
    }

    @Override // defpackage.ml
    public final boolean d() {
        return this.g.b.d();
    }

    @Override // defpackage.ml
    public final boolean e() {
        return this.b;
    }

    @Override // defpackage.ml
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.ml
    public final long g() {
        return this.a;
    }

    @Override // defpackage.ml
    public final ll h() {
        return this.g.h;
    }

    @Override // defpackage.ml
    public final kw0 i() {
        return (kw0) this.f.getValue();
    }

    @Override // defpackage.ml
    public final CoroutineContext j() {
        return this.g.b.j();
    }

    @Override // defpackage.ml
    public final boolean k() {
        return this.g.b.k();
    }

    @Override // defpackage.ml
    public final void l(tl tlVar) {
        hl hlVar = this.g;
        hlVar.b.l(hlVar.h);
        hlVar.b.l(tlVar);
    }

    @Override // defpackage.ml
    public final wm0 m(xm0 xm0Var) {
        return this.g.b.m(xm0Var);
    }

    @Override // defpackage.ml
    public final wn0 n(tl tlVar, na1 na1Var, wn0 wn0Var) {
        return this.g.b.n(tlVar, na1Var, wn0Var);
    }

    @Override // defpackage.ml
    public final void o(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.ml
    public final void p(hl hlVar) {
        this.e.add(hlVar);
    }

    @Override // defpackage.ml
    public final void q(i11 i11Var) {
        this.g.b.q(i11Var);
    }

    @Override // defpackage.ml
    public final void r(tl tlVar) {
        this.g.b.r(tlVar);
    }

    @Override // defpackage.ml
    public final uf s(ce ceVar) {
        return this.g.b.s(ceVar);
    }

    @Override // defpackage.ml
    public final void t() {
        this.g.A++;
    }

    @Override // defpackage.ml
    public final void u(hl hlVar) {
        HashSet hashSet = this.d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                hlVar.getClass();
                set.remove(hlVar.w());
            }
        }
        LinkedHashSet linkedHashSet = this.e;
        if (!(linkedHashSet instanceof yb0) || (linkedHashSet instanceof zb0)) {
            linkedHashSet.remove(hlVar);
        } else {
            tj1.d(linkedHashSet, "kotlin.collections.MutableCollection");
            throw null;
        }
    }

    @Override // defpackage.ml
    public final void v(tl tlVar) {
        this.g.b.v(tlVar);
    }

    public final void w() {
        LinkedHashSet<hl> linkedHashSet = this.e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.d;
        if (hashSet != null) {
            for (hl hlVar : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(hlVar.w());
                }
            }
        }
        linkedHashSet.clear();
    }
}
