package G;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: G.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0212n extends r {

    /* renamed from: a, reason: collision with root package name */
    public final int f2836a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2837b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2838c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f2839d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f2840e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final C0205j0 f2841f = C0192d.K(O.d.f3626m, W.f2777j);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0216p f2842g;

    public C0212n(C0216p c0216p, int i2, boolean z4, boolean z5, C0231x c0231x) {
        this.f2842g = c0216p;
        this.f2836a = i2;
        this.f2837b = z4;
        this.f2838c = z5;
    }

    @Override // G.r
    public final void a(C0225u c0225u, O.a aVar) {
        this.f2842g.f2863b.a(c0225u, aVar);
    }

    @Override // G.r
    public final void b() {
        C0216p c0216p = this.f2842g;
        c0216p.f2887z--;
    }

    @Override // G.r
    public final boolean c() {
        return this.f2842g.f2863b.c();
    }

    @Override // G.r
    public final boolean d() {
        return this.f2837b;
    }

    @Override // G.r
    public final boolean e() {
        return this.f2838c;
    }

    @Override // G.r
    public final InterfaceC0213n0 f() {
        return (InterfaceC0213n0) this.f2841f.getValue();
    }

    @Override // G.r
    public final int g() {
        return this.f2836a;
    }

    @Override // G.r
    public final CoroutineContext h() {
        return this.f2842g.f2863b.h();
    }

    @Override // G.r
    public final void i(C0225u c0225u) {
        C0216p c0216p = this.f2842g;
        c0216p.f2863b.i(c0216p.f2868g);
        c0216p.f2863b.i(c0225u);
    }

    @Override // G.r
    public final void j(Set set) {
        HashSet hashSet = this.f2839d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f2839d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // G.r
    public final void k(C0216p c0216p) {
        this.f2840e.add(c0216p);
    }

    @Override // G.r
    public final void l(C0225u c0225u) {
        this.f2842g.f2863b.l(c0225u);
    }

    @Override // G.r
    public final void m() {
        this.f2842g.f2887z++;
    }

    @Override // G.r
    public final void n(C0216p c0216p) {
        HashSet hashSet = this.f2839d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                Intrinsics.d(c0216p, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                set.remove(c0216p.f2864c);
            }
        }
        LinkedHashSet linkedHashSet = this.f2840e;
        M2.J.a(linkedHashSet);
        linkedHashSet.remove(c0216p);
    }

    @Override // G.r
    public final void o(C0225u c0225u) {
        this.f2842g.f2863b.o(c0225u);
    }

    public final void p() {
        LinkedHashSet<C0216p> linkedHashSet = this.f2840e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f2839d;
        if (hashSet != null) {
            for (C0216p c0216p : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(c0216p.f2864c);
                }
            }
        }
        linkedHashSet.clear();
    }
}
