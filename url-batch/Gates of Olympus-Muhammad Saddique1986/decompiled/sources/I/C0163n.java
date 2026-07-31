package I;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: I.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0163n extends r {

    /* renamed from: a, reason: collision with root package name */
    public final int f2840a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2841b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2842c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f2843d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f2844e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final C0156j0 f2845f = C0143d.K(Q.d.f3954g, W.f2781g);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0167p f2846g;

    public C0163n(C0167p c0167p, int i3, boolean z3, boolean z4, C0182x c0182x) {
        this.f2846g = c0167p;
        this.f2840a = i3;
        this.f2841b = z3;
        this.f2842c = z4;
    }

    @Override // I.r
    public final void a(C0176u c0176u, Q.a aVar) {
        this.f2846g.f2866b.a(c0176u, aVar);
    }

    @Override // I.r
    public final void b() {
        C0167p c0167p = this.f2846g;
        c0167p.f2890z--;
    }

    @Override // I.r
    public final boolean c() {
        return this.f2846g.f2866b.c();
    }

    @Override // I.r
    public final boolean d() {
        return this.f2841b;
    }

    @Override // I.r
    public final boolean e() {
        return this.f2842c;
    }

    @Override // I.r
    public final InterfaceC0164n0 f() {
        return (InterfaceC0164n0) this.f2845f.getValue();
    }

    @Override // I.r
    public final int g() {
        return this.f2840a;
    }

    @Override // I.r
    public final V1.i h() {
        return this.f2846g.f2866b.h();
    }

    @Override // I.r
    public final void i(C0176u c0176u) {
        C0167p c0167p = this.f2846g;
        c0167p.f2866b.i(c0167p.f2871g);
        c0167p.f2866b.i(c0176u);
    }

    @Override // I.r
    public final void j(Set set) {
        HashSet hashSet = this.f2843d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f2843d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // I.r
    public final void k(C0167p c0167p) {
        this.f2844e.add(c0167p);
    }

    @Override // I.r
    public final void l(C0176u c0176u) {
        this.f2846g.f2866b.l(c0176u);
    }

    @Override // I.r
    public final void m() {
        this.f2846g.f2890z++;
    }

    @Override // I.r
    public final void n(C0167p c0167p) {
        HashSet hashSet = this.f2843d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                f2.j.d(c0167p, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                set.remove(c0167p.f2867c);
            }
        }
        LinkedHashSet linkedHashSet = this.f2844e;
        f2.x.a(linkedHashSet);
        linkedHashSet.remove(c0167p);
    }

    @Override // I.r
    public final void o(C0176u c0176u) {
        this.f2846g.f2866b.o(c0176u);
    }

    public final void p() {
        LinkedHashSet<C0167p> linkedHashSet = this.f2844e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f2843d;
        if (hashSet != null) {
            for (C0167p c0167p : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(c0167p.f2867c);
                }
            }
        }
        linkedHashSet.clear();
    }
}
