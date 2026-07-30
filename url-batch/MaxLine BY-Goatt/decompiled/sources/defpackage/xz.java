package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xz extends d00 {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final LinkedHashSet e = new LinkedHashSet();
    public final lz1 f = new lz1(v02.s, by1.q);
    public final /* synthetic */ a00 g;

    public xz(a00 a00Var, long j, boolean z, boolean z2, ar0 ar0Var) {
        this.g = a00Var;
        this.a = j;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.d00
    public final void a(k00 k00Var, Function2 function2) {
        this.g.b.a(k00Var, function2);
    }

    @Override // defpackage.d00
    public final void b() {
        a00 a00Var = this.g;
        a00Var.A--;
    }

    @Override // defpackage.d00
    public final boolean c() {
        return this.g.b.c();
    }

    @Override // defpackage.d00
    public final boolean d() {
        return this.b;
    }

    @Override // defpackage.d00
    public final boolean e() {
        return this.c;
    }

    @Override // defpackage.d00
    public final long f() {
        return this.a;
    }

    @Override // defpackage.d00
    public final c00 g() {
        return this.g.h;
    }

    @Override // defpackage.d00
    public final v02 h() {
        return (v02) this.f.getValue();
    }

    @Override // defpackage.d00
    public final CoroutineContext i() {
        return this.g.b.i();
    }

    @Override // defpackage.d00
    public final void j(k00 k00Var) {
        a00 a00Var = this.g;
        a00Var.b.j(a00Var.h);
        a00Var.b.j(k00Var);
    }

    @Override // defpackage.d00
    public final km1 k(lm1 lm1Var) {
        return this.g.b.k(lm1Var);
    }

    @Override // defpackage.d00
    public final void l(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.d00
    public final void m(a00 a00Var) {
        this.e.add(a00Var);
    }

    @Override // defpackage.d00
    public final void n(k00 k00Var) {
        this.g.b.n(k00Var);
    }

    @Override // defpackage.d00
    public final void o() {
        this.g.A++;
    }

    @Override // defpackage.d00
    public final void p(a00 a00Var) {
        HashSet hashSet = this.d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                a00Var.getClass();
                set.remove(a00Var.c);
            }
        }
        LinkedHashSet linkedHashSet = this.e;
        if (!(linkedHashSet instanceof k71) || (linkedHashSet instanceof l71)) {
            linkedHashSet.remove(a00Var);
        } else {
            s03.O(linkedHashSet, "kotlin.collections.MutableCollection");
            throw null;
        }
    }

    @Override // defpackage.d00
    public final void q(k00 k00Var) {
        this.g.b.q(k00Var);
    }

    public final void r() {
        LinkedHashSet<a00> linkedHashSet = this.e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.d;
        if (hashSet != null) {
            for (a00 a00Var : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(a00Var.c);
                }
            }
        }
        linkedHashSet.clear();
    }
}
