package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
final class qx3 {

    /* renamed from: d, reason: collision with root package name */
    private final px3 f10900d;

    /* renamed from: e, reason: collision with root package name */
    private final c64 f10901e;

    /* renamed from: f, reason: collision with root package name */
    private final v24 f10902f;

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<ox3, nx3> f10903g;

    /* renamed from: h, reason: collision with root package name */
    private final Set<ox3> f10904h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f10905i;

    /* renamed from: j, reason: collision with root package name */
    private vt1 f10906j;

    /* renamed from: k, reason: collision with root package name */
    private l74 f10907k = new l74(0);

    /* renamed from: b, reason: collision with root package name */
    private final IdentityHashMap<r54, ox3> f10898b = new IdentityHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Object, ox3> f10899c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final List<ox3> f10897a = new ArrayList();

    public qx3(px3 px3Var, q04 q04Var, Handler handler) {
        this.f10900d = px3Var;
        c64 c64Var = new c64();
        this.f10901e = c64Var;
        v24 v24Var = new v24();
        this.f10902f = v24Var;
        this.f10903g = new HashMap<>();
        this.f10904h = new HashSet();
        c64Var.b(handler, q04Var);
        v24Var.b(handler, q04Var);
    }

    private final void p(int i7, int i8) {
        while (i7 < this.f10897a.size()) {
            this.f10897a.get(i7).f9879d += i8;
            i7++;
        }
    }

    private final void q(ox3 ox3Var) {
        nx3 nx3Var = this.f10903g.get(ox3Var);
        if (nx3Var != null) {
            nx3Var.f9360a.k(nx3Var.f9361b);
        }
    }

    private final void r() {
        Iterator<ox3> it = this.f10904h.iterator();
        while (it.hasNext()) {
            ox3 next = it.next();
            if (next.f9878c.isEmpty()) {
                q(next);
                it.remove();
            }
        }
    }

    private final void s(ox3 ox3Var) {
        if (ox3Var.f9880e && ox3Var.f9878c.isEmpty()) {
            nx3 remove = this.f10903g.remove(ox3Var);
            Objects.requireNonNull(remove);
            remove.f9360a.a(remove.f9361b);
            remove.f9360a.f(remove.f9362c);
            remove.f9360a.e(remove.f9362c);
            this.f10904h.remove(ox3Var);
        }
    }

    private final void t(ox3 ox3Var) {
        o54 o54Var = ox3Var.f9876a;
        u54 u54Var = new u54() { // from class: com.google.android.gms.internal.ads.kx3
            @Override // com.google.android.gms.internal.ads.u54
            public final void a(v54 v54Var, ei0 ei0Var) {
                qx3.this.e(v54Var, ei0Var);
            }
        };
        mx3 mx3Var = new mx3(this, ox3Var);
        this.f10903g.put(ox3Var, new nx3(o54Var, u54Var, mx3Var));
        o54Var.c(new Handler(n13.a(), null), mx3Var);
        o54Var.b(new Handler(n13.a(), null), mx3Var);
        o54Var.i(u54Var, this.f10906j);
    }

    private final void u(int i7, int i8) {
        while (true) {
            i8--;
            if (i8 < i7) {
                return;
            }
            ox3 remove = this.f10897a.remove(i8);
            this.f10899c.remove(remove.f9877b);
            p(i8, -remove.f9876a.F().c());
            remove.f9880e = true;
            if (this.f10905i) {
                s(remove);
            }
        }
    }

    public final int a() {
        return this.f10897a.size();
    }

    public final ei0 b() {
        if (this.f10897a.isEmpty()) {
            return ei0.f4614a;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.f10897a.size(); i8++) {
            ox3 ox3Var = this.f10897a.get(i8);
            ox3Var.f9879d = i7;
            i7 += ox3Var.f9876a.F().c();
        }
        return new vx3(this.f10897a, this.f10907k, null);
    }

    final /* synthetic */ void e(v54 v54Var, ei0 ei0Var) {
        this.f10900d.f();
    }

    public final void f(vt1 vt1Var) {
        wu1.f(!this.f10905i);
        this.f10906j = vt1Var;
        for (int i7 = 0; i7 < this.f10897a.size(); i7++) {
            ox3 ox3Var = this.f10897a.get(i7);
            t(ox3Var);
            this.f10904h.add(ox3Var);
        }
        this.f10905i = true;
    }

    public final void g() {
        for (nx3 nx3Var : this.f10903g.values()) {
            try {
                nx3Var.f9360a.a(nx3Var.f9361b);
            } catch (RuntimeException e7) {
                oc2.a("MediaSourceList", "Failed to release child source.", e7);
            }
            nx3Var.f9360a.f(nx3Var.f9362c);
            nx3Var.f9360a.e(nx3Var.f9362c);
        }
        this.f10903g.clear();
        this.f10904h.clear();
        this.f10905i = false;
    }

    public final void h(r54 r54Var) {
        ox3 remove = this.f10898b.remove(r54Var);
        Objects.requireNonNull(remove);
        remove.f9876a.j(r54Var);
        remove.f9878c.remove(((l54) r54Var).f7830f);
        if (!this.f10898b.isEmpty()) {
            r();
        }
        s(remove);
    }

    public final boolean i() {
        return this.f10905i;
    }

    public final ei0 j(int i7, List<ox3> list, l74 l74Var) {
        int i8;
        if (!list.isEmpty()) {
            this.f10907k = l74Var;
            for (int i9 = i7; i9 < list.size() + i7; i9++) {
                ox3 ox3Var = list.get(i9 - i7);
                if (i9 > 0) {
                    ox3 ox3Var2 = this.f10897a.get(i9 - 1);
                    i8 = ox3Var2.f9879d + ox3Var2.f9876a.F().c();
                } else {
                    i8 = 0;
                }
                ox3Var.b(i8);
                p(i9, ox3Var.f9876a.F().c());
                this.f10897a.add(i9, ox3Var);
                this.f10899c.put(ox3Var.f9877b, ox3Var);
                if (this.f10905i) {
                    t(ox3Var);
                    if (this.f10898b.isEmpty()) {
                        this.f10904h.add(ox3Var);
                    } else {
                        q(ox3Var);
                    }
                }
            }
        }
        return b();
    }

    public final ei0 k(int i7, int i8, int i9, l74 l74Var) {
        wu1.d(a() >= 0);
        this.f10907k = null;
        return b();
    }

    public final ei0 l(int i7, int i8, l74 l74Var) {
        boolean z6 = false;
        if (i7 >= 0 && i7 <= i8 && i8 <= a()) {
            z6 = true;
        }
        wu1.d(z6);
        this.f10907k = l74Var;
        u(i7, i8);
        return b();
    }

    public final ei0 m(List<ox3> list, l74 l74Var) {
        u(0, this.f10897a.size());
        return j(this.f10897a.size(), list, l74Var);
    }

    public final ei0 n(l74 l74Var) {
        int a7 = a();
        if (l74Var.c() != a7) {
            l74Var = l74Var.f().g(0, a7);
        }
        this.f10907k = l74Var;
        return b();
    }

    public final r54 o(s54 s54Var, g94 g94Var, long j7) {
        Object obj = s54Var.f5772a;
        Object obj2 = ((Pair) obj).first;
        s54 c7 = s54Var.c(((Pair) obj).second);
        ox3 ox3Var = this.f10899c.get(obj2);
        Objects.requireNonNull(ox3Var);
        this.f10904h.add(ox3Var);
        nx3 nx3Var = this.f10903g.get(ox3Var);
        if (nx3Var != null) {
            nx3Var.f9360a.d(nx3Var.f9361b);
        }
        ox3Var.f9878c.add(c7);
        l54 h7 = ox3Var.f9876a.h(c7, g94Var, j7);
        this.f10898b.put(h7, ox3Var);
        r();
        return h7;
    }
}
