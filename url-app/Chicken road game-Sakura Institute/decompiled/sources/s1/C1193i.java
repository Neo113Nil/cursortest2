package s1;

import A.V;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C0483x;
import androidx.lifecycle.EnumC0475o;
import androidx.lifecycle.InterfaceC0470j;
import androidx.lifecycle.InterfaceC0481v;
import androidx.lifecycle.M;
import androidx.lifecycle.P;
import androidx.lifecycle.U;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import l.t0;
import p1.C0993c;
import v1.C1248e;
import v1.InterfaceC1249f;
import y2.C1336k;
import y2.InterfaceC1335j;

/* renamed from: s1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1193i implements InterfaceC0481v, Z, InterfaceC0470j, InterfaceC1249f {

    /* renamed from: d, reason: collision with root package name */
    public final Context f10509d;

    /* renamed from: e, reason: collision with root package name */
    public v f10510e;

    /* renamed from: i, reason: collision with root package name */
    public final Bundle f10511i;

    /* renamed from: j, reason: collision with root package name */
    public EnumC0475o f10512j;

    /* renamed from: k, reason: collision with root package name */
    public final p f10513k;

    /* renamed from: l, reason: collision with root package name */
    public final String f10514l;

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f10515m;

    /* renamed from: n, reason: collision with root package name */
    public final C0483x f10516n = new C0483x(this);

    /* renamed from: o, reason: collision with root package name */
    public final V f10517o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10518p;

    /* renamed from: q, reason: collision with root package name */
    public EnumC0475o f10519q;

    /* renamed from: r, reason: collision with root package name */
    public final P f10520r;

    public C1193i(Context context, v vVar, Bundle bundle, EnumC0475o enumC0475o, p pVar, String str, Bundle bundle2) {
        this.f10509d = context;
        this.f10510e = vVar;
        this.f10511i = bundle;
        this.f10512j = enumC0475o;
        this.f10513k = pVar;
        this.f10514l = str;
        this.f10515m = bundle2;
        Intrinsics.checkNotNullParameter(this, "owner");
        this.f10517o = new V(this);
        InterfaceC1335j a4 = C1336k.a(new C1192h(this, 0));
        C1336k.a(new C1192h(this, 1));
        this.f10519q = EnumC0475o.f5481e;
        this.f10520r = (P) a4.getValue();
    }

    @Override // androidx.lifecycle.InterfaceC0470j
    public final t0 a() {
        C0993c c0993c = new C0993c();
        Context context = this.f10509d;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            c0993c.r(U.f5459d, application);
        }
        c0993c.r(M.f5442a, this);
        c0993c.r(M.f5443b, this);
        Bundle g4 = g();
        if (g4 != null) {
            c0993c.r(M.f5444c, g4);
        }
        return c0993c;
    }

    @Override // v1.InterfaceC1249f
    public final C1248e c() {
        return (C1248e) this.f10517o.f63d;
    }

    @Override // androidx.lifecycle.Z
    public final Y d() {
        if (!this.f10518p) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.f10516n.f5496d == EnumC0475o.f5480d) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        p pVar = this.f10513k;
        if (pVar == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String backStackEntryId = this.f10514l;
        Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
        LinkedHashMap linkedHashMap = pVar.f10543b;
        Y y4 = (Y) linkedHashMap.get(backStackEntryId);
        if (y4 != null) {
            return y4;
        }
        Y y5 = new Y();
        linkedHashMap.put(backStackEntryId, y5);
        return y5;
    }

    @Override // androidx.lifecycle.InterfaceC0481v
    public final C0483x e() {
        return this.f10516n;
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj == null || !(obj instanceof C1193i)) {
            return false;
        }
        C1193i c1193i = (C1193i) obj;
        if (!Intrinsics.a(this.f10514l, c1193i.f10514l) || !Intrinsics.a(this.f10510e, c1193i.f10510e) || !Intrinsics.a(this.f10516n, c1193i.f10516n) || !Intrinsics.a((C1248e) this.f10517o.f63d, (C1248e) c1193i.f10517o.f63d)) {
            return false;
        }
        Bundle bundle = this.f10511i;
        Bundle bundle2 = c1193i.f10511i;
        if (!Intrinsics.a(bundle, bundle2)) {
            if (bundle == null || (keySet = bundle.keySet()) == null) {
                return false;
            }
            Set<String> set = keySet;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (String str : set) {
                    if (!Intrinsics.a(bundle.get(str), bundle2 != null ? bundle2.get(str) : null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // androidx.lifecycle.InterfaceC0470j
    public final androidx.lifecycle.V f() {
        return this.f10520r;
    }

    public final Bundle g() {
        Bundle bundle = this.f10511i;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    public final void h(EnumC0475o maxState) {
        Intrinsics.checkNotNullParameter(maxState, "maxState");
        this.f10519q = maxState;
        i();
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.f10510e.hashCode() + (this.f10514l.hashCode() * 31);
        Bundle bundle = this.f10511i;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i2 = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i2 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return ((C1248e) this.f10517o.f63d).hashCode() + ((this.f10516n.hashCode() + (hashCode * 31)) * 31);
    }

    public final void i() {
        if (!this.f10518p) {
            V v4 = this.f10517o;
            v4.e();
            this.f10518p = true;
            if (this.f10513k != null) {
                M.e(this);
            }
            v4.f(this.f10515m);
        }
        int ordinal = this.f10512j.ordinal();
        int ordinal2 = this.f10519q.ordinal();
        C0483x c0483x = this.f10516n;
        if (ordinal < ordinal2) {
            c0483x.g(this.f10512j);
        } else {
            c0483x.g(this.f10519q);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C1193i.class.getSimpleName());
        sb.append("(" + this.f10514l + ')');
        sb.append(" destination=");
        sb.append(this.f10510e);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}
