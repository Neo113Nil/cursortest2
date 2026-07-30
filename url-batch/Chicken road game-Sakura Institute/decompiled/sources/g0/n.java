package g0;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n extends r {

    /* renamed from: a, reason: collision with root package name */
    public final int f3795a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3796b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3797c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f3798d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f3799e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final g1 f3800f = d.J(o0.d.f6822i, t0.f3901i);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f3801g;

    public n(p pVar, int i7, boolean z8, boolean z9, t0 t0Var) {
        this.f3801g = pVar;
        this.f3795a = i7;
        this.f3796b = z8;
        this.f3797c = z9;
    }

    @Override // g0.r
    public final void a(u uVar, o0.a aVar) {
        this.f3801g.f3821b.a(uVar, aVar);
    }

    @Override // g0.r
    public final void b() {
        p pVar = this.f3801g;
        pVar.f3845z--;
    }

    @Override // g0.r
    public final boolean c() {
        return this.f3801g.f3821b.c();
    }

    @Override // g0.r
    public final boolean d() {
        return this.f3796b;
    }

    @Override // g0.r
    public final boolean e() {
        return this.f3797c;
    }

    @Override // g0.r
    public final k1 f() {
        return (k1) this.f3800f.getValue();
    }

    @Override // g0.r
    public final int g() {
        return this.f3795a;
    }

    @Override // g0.r
    public final h6.i h() {
        return this.f3801g.f3821b.h();
    }

    @Override // g0.r
    public final void i(u uVar) {
        p pVar = this.f3801g;
        pVar.f3821b.i(pVar.f3826g);
        pVar.f3821b.i(uVar);
    }

    @Override // g0.r
    public final void j(Set set) {
        HashSet hashSet = this.f3798d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f3798d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // g0.r
    public final void k(p pVar) {
        this.f3799e.add(pVar);
    }

    @Override // g0.r
    public final void l(u uVar) {
        this.f3801g.f3821b.l(uVar);
    }

    @Override // g0.r
    public final void m() {
        this.f3801g.f3845z++;
    }

    @Override // g0.r
    public final void n(p pVar) {
        HashSet hashSet = this.f3798d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                r6.k.d(pVar, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                set.remove(pVar.f3822c);
            }
        }
        LinkedHashSet linkedHashSet = this.f3799e;
        r6.y.a(linkedHashSet);
        linkedHashSet.remove(pVar);
    }

    @Override // g0.r
    public final void o(u uVar) {
        this.f3801g.f3821b.o(uVar);
    }

    public final void p() {
        LinkedHashSet<p> linkedHashSet = this.f3799e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f3798d;
        if (hashSet != null) {
            for (p pVar : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(pVar.f3822c);
                }
            }
        }
        linkedHashSet.clear();
    }
}
