package m0;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q extends v {

    /* renamed from: a, reason: collision with root package name */
    public final long f5045a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5046b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5047c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f5048d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f5049e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final h1 f5050f = new h1(u0.g.f7151g, v0.f5134g);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f5051g;

    public q(s sVar, long j7, boolean z3, boolean z7, b1.b bVar) {
        this.f5051g = sVar;
        this.f5045a = j7;
        this.f5046b = z3;
        this.f5047c = z7;
    }

    @Override // m0.v
    public final void a(y yVar, p6.e eVar) {
        this.f5051g.f5074b.a(yVar, eVar);
    }

    @Override // m0.v
    public final o.k0 b(y yVar, c5.n nVar, p6.e eVar) {
        return this.f5051g.f5074b.b(yVar, nVar, eVar);
    }

    @Override // m0.v
    public final void c() {
        s sVar = this.f5051g;
        sVar.A--;
    }

    @Override // m0.v
    public final boolean d() {
        return this.f5051g.f5074b.d();
    }

    @Override // m0.v
    public final boolean e() {
        return this.f5046b;
    }

    @Override // m0.v
    public final boolean f() {
        return this.f5047c;
    }

    @Override // m0.v
    public final long g() {
        return this.f5045a;
    }

    @Override // m0.v
    public final u h() {
        return this.f5051g.f5080h;
    }

    @Override // m0.v
    public final o1 i() {
        return (o1) this.f5050f.getValue();
    }

    @Override // m0.v
    public final g6.h j() {
        return this.f5051g.f5074b.j();
    }

    @Override // m0.v
    public final void k(y yVar) {
        s sVar = this.f5051g;
        sVar.f5074b.k(sVar.f5080h);
        sVar.f5074b.k(yVar);
    }

    @Override // m0.v
    public final x0 l(y0 y0Var) {
        return this.f5051g.f5074b.l(y0Var);
    }

    @Override // m0.v
    public final o.k0 m(y yVar, c5.n nVar, o.k0 k0Var) {
        return this.f5051g.f5074b.m(yVar, nVar, k0Var);
    }

    @Override // m0.v
    public final void n(Set set) {
        HashSet hashSet = this.f5048d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f5048d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // m0.v
    public final void o(s sVar) {
        this.f5049e.add(sVar);
    }

    @Override // m0.v
    public final void p(t1 t1Var) {
        this.f5051g.f5074b.p(t1Var);
    }

    @Override // m0.v
    public final void q(y yVar) {
        this.f5051g.f5074b.q(yVar);
    }

    @Override // m0.v
    public final void r() {
        this.f5051g.A++;
    }

    @Override // m0.v
    public final void s(s sVar) {
        HashSet hashSet = this.f5048d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                q6.i.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                set.remove(sVar.f5075c);
            }
        }
        LinkedHashSet linkedHashSet = this.f5049e;
        q6.v.a(linkedHashSet);
        linkedHashSet.remove(sVar);
    }

    @Override // m0.v
    public final void t(y yVar) {
        this.f5051g.f5074b.t(yVar);
    }

    public final void u() {
        LinkedHashSet<s> linkedHashSet = this.f5049e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f5048d;
        if (hashSet != null) {
            for (s sVar : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(sVar.f5075c);
                }
            }
        }
        linkedHashSet.clear();
    }
}
