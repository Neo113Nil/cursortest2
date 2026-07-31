package I;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: I.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0109n extends r {

    /* renamed from: a, reason: collision with root package name */
    public final int f2283a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2284b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2285c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f2286d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f2287e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final C0102j0 f2288f = C0089d.J(Q.d.f3088g, X.f2226g);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0113p f2289g;

    public C0109n(C0113p c0113p, int i3, boolean z3, boolean z4, C0128x c0128x) {
        this.f2289g = c0113p;
        this.f2283a = i3;
        this.f2284b = z3;
        this.f2285c = z4;
    }

    @Override // I.r
    public final void a(C0122u c0122u, Q.a aVar) {
        this.f2289g.f2308b.a(c0122u, aVar);
    }

    @Override // I.r
    public final void b() {
        C0113p c0113p = this.f2289g;
        c0113p.f2331z--;
    }

    @Override // I.r
    public final boolean c() {
        return this.f2289g.f2308b.c();
    }

    @Override // I.r
    public final boolean d() {
        return this.f2284b;
    }

    @Override // I.r
    public final boolean e() {
        return this.f2285c;
    }

    @Override // I.r
    public final InterfaceC0110n0 f() {
        return (InterfaceC0110n0) this.f2288f.getValue();
    }

    @Override // I.r
    public final int g() {
        return this.f2283a;
    }

    @Override // I.r
    public final P1.i h() {
        return this.f2289g.f2308b.h();
    }

    @Override // I.r
    public final void i(C0122u c0122u) {
        C0113p c0113p = this.f2289g;
        c0113p.f2308b.i(c0113p.f2313g);
        c0113p.f2308b.i(c0122u);
    }

    @Override // I.r
    public final void j(Set set) {
        HashSet hashSet = this.f2286d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f2286d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // I.r
    public final void k(C0113p c0113p) {
        this.f2287e.add(c0113p);
    }

    @Override // I.r
    public final void l(C0122u c0122u) {
        this.f2289g.f2308b.l(c0122u);
    }

    @Override // I.r
    public final void m() {
        this.f2289g.f2331z++;
    }

    @Override // I.r
    public final void n(C0113p c0113p) {
        HashSet hashSet = this.f2286d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                Z1.i.d(c0113p, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                set.remove(c0113p.f2309c);
            }
        }
        LinkedHashSet linkedHashSet = this.f2287e;
        Z1.w.a(linkedHashSet);
        linkedHashSet.remove(c0113p);
    }

    @Override // I.r
    public final void o(C0122u c0122u) {
        this.f2289g.f2308b.o(c0122u);
    }

    public final void p() {
        LinkedHashSet<C0113p> linkedHashSet = this.f2287e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f2286d;
        if (hashSet != null) {
            for (C0113p c0113p : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(c0113p.f2309c);
                }
            }
        }
        linkedHashSet.clear();
    }
}
