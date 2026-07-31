package t1;

import B.U;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C0294x;
import androidx.lifecycle.EnumC0286o;
import androidx.lifecycle.InterfaceC0281j;
import androidx.lifecycle.InterfaceC0292v;
import androidx.lifecycle.P;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import q1.C0812b;

/* renamed from: t1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1028h implements InterfaceC0292v, b0, InterfaceC0281j, y1.f {

    /* renamed from: d, reason: collision with root package name */
    public final Context f8873d;

    /* renamed from: e, reason: collision with root package name */
    public u f8874e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f8875f;

    /* renamed from: g, reason: collision with root package name */
    public EnumC0286o f8876g;

    /* renamed from: h, reason: collision with root package name */
    public final n f8877h;

    /* renamed from: i, reason: collision with root package name */
    public final String f8878i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f8879j;

    /* renamed from: k, reason: collision with root package name */
    public final C0294x f8880k = new C0294x(this);

    /* renamed from: l, reason: collision with root package name */
    public final U f8881l = new U(this);

    /* renamed from: m, reason: collision with root package name */
    public boolean f8882m;

    /* renamed from: n, reason: collision with root package name */
    public EnumC0286o f8883n;

    /* renamed from: o, reason: collision with root package name */
    public final T f8884o;

    public C1028h(Context context, u uVar, Bundle bundle, EnumC0286o enumC0286o, n nVar, String str, Bundle bundle2) {
        this.f8873d = context;
        this.f8874e = uVar;
        this.f8875f = bundle;
        this.f8876g = enumC0286o;
        this.f8877h = nVar;
        this.f8878i = str;
        this.f8879j = bundle2;
        R1.n d3 = R1.a.d(new C1027g(this, 0));
        R1.a.d(new C1027g(this, 1));
        this.f8883n = EnumC0286o.f5227e;
        this.f8884o = (T) d3.getValue();
    }

    @Override // androidx.lifecycle.InterfaceC0281j
    public final C0812b a() {
        C0812b c0812b = new C0812b();
        Context context = this.f8873d;
        Object applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0812b.f6877a;
        if (application != null) {
            linkedHashMap.put(W.f5205d, application);
        }
        linkedHashMap.put(P.f5187a, this);
        linkedHashMap.put(P.f5188b, this);
        Bundle g3 = g();
        if (g3 != null) {
            linkedHashMap.put(P.f5189c, g3);
        }
        return c0812b;
    }

    @Override // y1.f
    public final y1.e c() {
        return (y1.e) this.f8881l.f320d;
    }

    @Override // androidx.lifecycle.b0
    public final a0 d() {
        if (!this.f8882m) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.f8880k.f5242d == EnumC0286o.f5226d) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        n nVar = this.f8877h;
        if (nVar == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String str = this.f8878i;
        f2.j.f(str, "backStackEntryId");
        LinkedHashMap linkedHashMap = nVar.f8902b;
        a0 a0Var = (a0) linkedHashMap.get(str);
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0();
        linkedHashMap.put(str, a0Var2);
        return a0Var2;
    }

    @Override // androidx.lifecycle.InterfaceC0292v
    public final C0294x e() {
        return this.f8880k;
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj == null || !(obj instanceof C1028h)) {
            return false;
        }
        C1028h c1028h = (C1028h) obj;
        if (!f2.j.a(this.f8878i, c1028h.f8878i) || !f2.j.a(this.f8874e, c1028h.f8874e) || !f2.j.a(this.f8880k, c1028h.f8880k) || !f2.j.a((y1.e) this.f8881l.f320d, (y1.e) c1028h.f8881l.f320d)) {
            return false;
        }
        Bundle bundle = this.f8875f;
        Bundle bundle2 = c1028h.f8875f;
        if (!f2.j.a(bundle, bundle2)) {
            if (bundle == null || (keySet = bundle.keySet()) == null) {
                return false;
            }
            Set<String> set = keySet;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (String str : set) {
                    if (!f2.j.a(bundle.get(str), bundle2 != null ? bundle2.get(str) : null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // androidx.lifecycle.InterfaceC0281j
    public final X f() {
        return this.f8884o;
    }

    public final Bundle g() {
        Bundle bundle = this.f8875f;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    public final void h(EnumC0286o enumC0286o) {
        f2.j.f(enumC0286o, "maxState");
        this.f8883n = enumC0286o;
        i();
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.f8874e.hashCode() + (this.f8878i.hashCode() * 31);
        Bundle bundle = this.f8875f;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i3 = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i3 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return ((y1.e) this.f8881l.f320d).hashCode() + ((this.f8880k.hashCode() + (hashCode * 31)) * 31);
    }

    public final void i() {
        if (!this.f8882m) {
            U u3 = this.f8881l;
            u3.e();
            this.f8882m = true;
            if (this.f8877h != null) {
                P.e(this);
            }
            u3.f(this.f8879j);
        }
        int ordinal = this.f8876g.ordinal();
        int ordinal2 = this.f8883n.ordinal();
        C0294x c0294x = this.f8880k;
        if (ordinal < ordinal2) {
            c0294x.g(this.f8876g);
        } else {
            c0294x.g(this.f8883n);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C1028h.class.getSimpleName());
        sb.append("(" + this.f8878i + ')');
        sb.append(" destination=");
        sb.append(this.f8874e);
        String sb2 = sb.toString();
        f2.j.e(sb2, "sb.toString()");
        return sb2;
    }
}
