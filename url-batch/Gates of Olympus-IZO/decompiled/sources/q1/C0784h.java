package q1;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C0238x;
import androidx.lifecycle.EnumC0230o;
import androidx.lifecycle.InterfaceC0225j;
import androidx.lifecycle.InterfaceC0236v;
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
import n1.C0675b;

/* renamed from: q1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0784h implements InterfaceC0236v, b0, InterfaceC0225j, u1.f {

    /* renamed from: d, reason: collision with root package name */
    public final Context f6894d;

    /* renamed from: e, reason: collision with root package name */
    public w f6895e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f6896f;

    /* renamed from: g, reason: collision with root package name */
    public EnumC0230o f6897g;

    /* renamed from: h, reason: collision with root package name */
    public final p f6898h;

    /* renamed from: i, reason: collision with root package name */
    public final String f6899i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f6900j;

    /* renamed from: k, reason: collision with root package name */
    public final C0238x f6901k = new C0238x(this);

    /* renamed from: l, reason: collision with root package name */
    public final Z.r f6902l = new Z.r(this);

    /* renamed from: m, reason: collision with root package name */
    public boolean f6903m;

    /* renamed from: n, reason: collision with root package name */
    public EnumC0230o f6904n;

    /* renamed from: o, reason: collision with root package name */
    public final T f6905o;

    public C0784h(Context context, w wVar, Bundle bundle, EnumC0230o enumC0230o, p pVar, String str, Bundle bundle2) {
        this.f6894d = context;
        this.f6895e = wVar;
        this.f6896f = bundle;
        this.f6897g = enumC0230o;
        this.f6898h = pVar;
        this.f6899i = str;
        this.f6900j = bundle2;
        L1.o F3 = I2.d.F(new C0783g(this, 0));
        I2.d.F(new C0783g(this, 1));
        this.f6904n = EnumC0230o.f4026e;
        this.f6905o = (T) F3.getValue();
    }

    @Override // androidx.lifecycle.InterfaceC0225j
    public final C0675b a() {
        C0675b c0675b = new C0675b();
        Context context = this.f6894d;
        Object applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0675b.f5876a;
        if (application != null) {
            linkedHashMap.put(W.f4004d, application);
        }
        linkedHashMap.put(P.f3986a, this);
        linkedHashMap.put(P.f3987b, this);
        Bundle g3 = g();
        if (g3 != null) {
            linkedHashMap.put(P.f3988c, g3);
        }
        return c0675b;
    }

    @Override // u1.f
    public final u1.e c() {
        return (u1.e) this.f6902l.f3455c;
    }

    @Override // androidx.lifecycle.b0
    public final a0 d() {
        if (!this.f6903m) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.f6901k.f4041d == EnumC0230o.f4025d) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        p pVar = this.f6898h;
        if (pVar == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String str = this.f6899i;
        Z1.i.f(str, "backStackEntryId");
        LinkedHashMap linkedHashMap = pVar.f6933b;
        a0 a0Var = (a0) linkedHashMap.get(str);
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0();
        linkedHashMap.put(str, a0Var2);
        return a0Var2;
    }

    @Override // androidx.lifecycle.InterfaceC0236v
    public final C0238x e() {
        return this.f6901k;
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj == null || !(obj instanceof C0784h)) {
            return false;
        }
        C0784h c0784h = (C0784h) obj;
        if (!Z1.i.a(this.f6899i, c0784h.f6899i) || !Z1.i.a(this.f6895e, c0784h.f6895e) || !Z1.i.a(this.f6901k, c0784h.f6901k) || !Z1.i.a((u1.e) this.f6902l.f3455c, (u1.e) c0784h.f6902l.f3455c)) {
            return false;
        }
        Bundle bundle = this.f6896f;
        Bundle bundle2 = c0784h.f6896f;
        if (!Z1.i.a(bundle, bundle2)) {
            if (bundle == null || (keySet = bundle.keySet()) == null) {
                return false;
            }
            Set<String> set = keySet;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (String str : set) {
                    if (!Z1.i.a(bundle.get(str), bundle2 != null ? bundle2.get(str) : null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // androidx.lifecycle.InterfaceC0225j
    public final X f() {
        return this.f6905o;
    }

    public final Bundle g() {
        Bundle bundle = this.f6896f;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    public final void h(EnumC0230o enumC0230o) {
        Z1.i.f(enumC0230o, "maxState");
        this.f6904n = enumC0230o;
        i();
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.f6895e.hashCode() + (this.f6899i.hashCode() * 31);
        Bundle bundle = this.f6896f;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i3 = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i3 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return ((u1.e) this.f6902l.f3455c).hashCode() + ((this.f6901k.hashCode() + (hashCode * 31)) * 31);
    }

    public final void i() {
        if (!this.f6903m) {
            Z.r rVar = this.f6902l;
            rVar.d();
            this.f6903m = true;
            if (this.f6898h != null) {
                P.e(this);
            }
            rVar.e(this.f6900j);
        }
        int ordinal = this.f6897g.ordinal();
        int ordinal2 = this.f6904n.ordinal();
        C0238x c0238x = this.f6901k;
        if (ordinal < ordinal2) {
            c0238x.g(this.f6897g);
        } else {
            c0238x.g(this.f6904n);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0784h.class.getSimpleName());
        sb.append("(" + this.f6899i + ')');
        sb.append(" destination=");
        sb.append(this.f6895e);
        String sb2 = sb.toString();
        Z1.i.e(sb2, "sb.toString()");
        return sb2;
    }
}
