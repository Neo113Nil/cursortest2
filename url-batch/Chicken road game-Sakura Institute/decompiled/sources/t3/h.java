package t3;

import a0.s0;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.b1;
import androidx.lifecycle.c1;
import androidx.lifecycle.q0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import l.u1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h implements androidx.lifecycle.v, c1, androidx.lifecycle.j, x3.f {

    /* renamed from: f, reason: collision with root package name */
    public final Context f8791f;

    /* renamed from: g, reason: collision with root package name */
    public v f8792g;

    /* renamed from: h, reason: collision with root package name */
    public final Bundle f8793h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.lifecycle.o f8794i;

    /* renamed from: j, reason: collision with root package name */
    public final o f8795j;

    /* renamed from: k, reason: collision with root package name */
    public final String f8796k;

    /* renamed from: l, reason: collision with root package name */
    public final Bundle f8797l;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.lifecycle.x f8798m = new androidx.lifecycle.x(this);

    /* renamed from: n, reason: collision with root package name */
    public final s0 f8799n = new s0(this);

    /* renamed from: o, reason: collision with root package name */
    public boolean f8800o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.lifecycle.o f8801p;

    /* renamed from: q, reason: collision with root package name */
    public final u0 f8802q;

    public h(Context context, v vVar, Bundle bundle, androidx.lifecycle.o oVar, o oVar2, String str, Bundle bundle2) {
        this.f8791f = context;
        this.f8792g = vVar;
        this.f8793h = bundle;
        this.f8794i = oVar;
        this.f8795j = oVar2;
        this.f8796k = str;
        this.f8797l = bundle2;
        d6.o d8 = d6.a.d(new g(this, 0));
        d6.a.d(new g(this, 1));
        this.f8801p = androidx.lifecycle.o.f1008g;
        this.f8802q = (u0) d8.getValue();
    }

    @Override // x3.f
    public final x3.e b() {
        return (x3.e) this.f8799n.f138d;
    }

    @Override // androidx.lifecycle.j
    public final y0 c() {
        return this.f8802q;
    }

    @Override // androidx.lifecycle.j
    public final u1 d() {
        q3.b bVar = new q3.b(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.f5679a;
        Context context = this.f8791f;
        Object applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            linkedHashMap.put(x0.f1054d, application);
        }
        linkedHashMap.put(q0.f1021a, this);
        linkedHashMap.put(q0.f1022b, this);
        Bundle g9 = g();
        if (g9 != null) {
            linkedHashMap.put(q0.f1023c, g9);
        }
        return bVar;
    }

    @Override // androidx.lifecycle.c1
    public final b1 e() {
        if (!this.f8800o) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.f8798m.f1046d == androidx.lifecycle.o.f1007f) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        o oVar = this.f8795j;
        if (oVar == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String str = this.f8796k;
        r6.k.f(str, "backStackEntryId");
        LinkedHashMap linkedHashMap = oVar.f8828b;
        b1 b1Var = (b1) linkedHashMap.get(str);
        if (b1Var != null) {
            return b1Var;
        }
        b1 b1Var2 = new b1();
        linkedHashMap.put(str, b1Var2);
        return b1Var2;
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj != null && (obj instanceof h)) {
            h hVar = (h) obj;
            Bundle bundle = hVar.f8793h;
            if (r6.k.a(this.f8796k, hVar.f8796k) && r6.k.a(this.f8792g, hVar.f8792g) && r6.k.a(this.f8798m, hVar.f8798m) && r6.k.a((x3.e) this.f8799n.f138d, (x3.e) hVar.f8799n.f138d)) {
                Bundle bundle2 = this.f8793h;
                if (r6.k.a(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (keySet = bundle2.keySet()) != null) {
                    Set<String> set = keySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!r6.k.a(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.lifecycle.v
    public final androidx.lifecycle.x f() {
        return this.f8798m;
    }

    public final Bundle g() {
        Bundle bundle = this.f8793h;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    public final void h(androidx.lifecycle.o oVar) {
        r6.k.f(oVar, "maxState");
        this.f8801p = oVar;
        i();
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.f8792g.hashCode() + (this.f8796k.hashCode() * 31);
        Bundle bundle = this.f8793h;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i7 = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i7 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return ((x3.e) this.f8799n.f138d).hashCode() + ((this.f8798m.hashCode() + (hashCode * 31)) * 31);
    }

    public final void i() {
        if (!this.f8800o) {
            s0 s0Var = this.f8799n;
            s0Var.f();
            this.f8800o = true;
            if (this.f8795j != null) {
                q0.e(this);
            }
            s0Var.g(this.f8797l);
        }
        int ordinal = this.f8794i.ordinal();
        int ordinal2 = this.f8801p.ordinal();
        androidx.lifecycle.x xVar = this.f8798m;
        if (ordinal < ordinal2) {
            xVar.g(this.f8794i);
        } else {
            xVar.g(this.f8801p);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(h.class.getSimpleName());
        sb.append("(" + this.f8796k + ')');
        sb.append(" destination=");
        sb.append(this.f8792g);
        String sb2 = sb.toString();
        r6.k.e(sb2, "sb.toString()");
        return sb2;
    }
}
