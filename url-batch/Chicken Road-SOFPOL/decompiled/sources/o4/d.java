package o4;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d implements androidx.lifecycle.u, x0, androidx.lifecycle.k, x4.f {

    /* renamed from: d, reason: collision with root package name */
    public final d4.p f5620d;

    /* renamed from: e, reason: collision with root package name */
    public o f5621e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f5622f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.lifecycle.p f5623g;

    /* renamed from: h, reason: collision with root package name */
    public final h f5624h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f5625j;

    /* renamed from: k, reason: collision with root package name */
    public final r4.c f5626k = new r4.c(this);

    public d(d4.p pVar, o oVar, Bundle bundle, androidx.lifecycle.p pVar2, h hVar, String str, Bundle bundle2) {
        this.f5620d = pVar;
        this.f5621e = oVar;
        this.f5622f = bundle;
        this.f5623g = pVar2;
        this.f5624h = hVar;
        this.i = str;
        this.f5625j = bundle2;
        a.a.r(new m0(7, this));
    }

    @Override // x4.f
    public final x4.e b() {
        return (x4.e) this.f5626k.f6570h.f8656b;
    }

    public final void c(androidx.lifecycle.p pVar) {
        r4.c cVar = this.f5626k;
        cVar.getClass();
        cVar.f6572k = pVar;
        cVar.b();
    }

    @Override // androidx.lifecycle.k
    public final t0 d() {
        return this.f5626k.f6573l;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    @Override // androidx.lifecycle.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l4.b e() {
        Application application;
        Application application2;
        r4.c cVar = this.f5626k;
        cVar.getClass();
        l4.e eVar = new l4.e(0);
        d dVar = cVar.f6563a;
        LinkedHashMap linkedHashMap = eVar.f4829a;
        linkedHashMap.put(l0.f836a, dVar);
        linkedHashMap.put(l0.f837b, dVar);
        Bundle a8 = cVar.a();
        if (a8 != null) {
            linkedHashMap.put(l0.f838c, a8);
        }
        d4.p pVar = this.f5620d;
        if (pVar != null) {
            Context context = pVar.f2282a;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                application2 = application != null ? application : null;
                if (application2 != null) {
                    linkedHashMap.put(s0.f862d, application2);
                }
                return eVar;
            }
        }
        application = null;
        if (application != null) {
        }
        if (application2 != null) {
        }
        return eVar;
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj != null && (obj instanceof d)) {
            d dVar = (d) obj;
            Bundle bundle = dVar.f5622f;
            if (q6.i.a(this.i, dVar.i) && q6.i.a(this.f5621e, dVar.f5621e) && q6.i.a(this.f5626k.f6571j, dVar.f5626k.f6571j) && q6.i.a(b(), dVar.b())) {
                Bundle bundle2 = this.f5622f;
                if (q6.i.a(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (keySet = bundle2.keySet()) != null) {
                    Set<String> set = keySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!q6.i.a(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.lifecycle.x0
    public final w0 f() {
        r4.c cVar = this.f5626k;
        if (!cVar.i) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (cVar.f6571j.f871c == androidx.lifecycle.p.f847d) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        h hVar = cVar.f6567e;
        if (hVar == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String str = cVar.f6568f;
        q6.i.e(str, "backStackEntryId");
        LinkedHashMap linkedHashMap = hVar.f5639b;
        w0 w0Var = (w0) linkedHashMap.get(str);
        if (w0Var != null) {
            return w0Var;
        }
        w0 w0Var2 = new w0();
        linkedHashMap.put(str, w0Var2);
        return w0Var2;
    }

    @Override // androidx.lifecycle.u
    public final androidx.lifecycle.w g() {
        return this.f5626k.f6571j;
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.f5621e.hashCode() + (this.i.hashCode() * 31);
        Bundle bundle = this.f5622f;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return b().hashCode() + ((this.f5626k.f6571j.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return this.f5626k.toString();
    }
}
