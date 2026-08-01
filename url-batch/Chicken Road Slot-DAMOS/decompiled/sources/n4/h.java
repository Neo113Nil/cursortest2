package n4;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.a1;
import androidx.lifecycle.o0;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h implements androidx.lifecycle.u, a1, androidx.lifecycle.k, f5.e {

    /* renamed from: d, reason: collision with root package name */
    public final c4.o f7062d;

    /* renamed from: e, reason: collision with root package name */
    public s f7063e;

    /* renamed from: i, reason: collision with root package name */
    public final Bundle f7064i;

    /* renamed from: r, reason: collision with root package name */
    public androidx.lifecycle.p f7065r;

    /* renamed from: s, reason: collision with root package name */
    public final l f7066s;

    /* renamed from: t, reason: collision with root package name */
    public final String f7067t;

    /* renamed from: u, reason: collision with root package name */
    public final Bundle f7068u;

    /* renamed from: v, reason: collision with root package name */
    public final q4.c f7069v = new q4.c(this);

    public h(c4.o oVar, s sVar, Bundle bundle, androidx.lifecycle.p pVar, l lVar, String str, Bundle bundle2) {
        this.f7062d = oVar;
        this.f7063e = sVar;
        this.f7064i = bundle;
        this.f7065r = pVar;
        this.f7066s = lVar;
        this.f7067t = str;
        this.f7068u = bundle2;
        hd.h.b(new a1.b(16, this));
    }

    @Override // f5.e
    public final c6.l b() {
        return (c6.l) this.f7069v.f7976h.f1869e;
    }

    @Override // androidx.lifecycle.k
    public final w0 d() {
        return this.f7069v.f7979l;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    @Override // androidx.lifecycle.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k4.b e() {
        Application application;
        Application application2;
        q4.c cVar = this.f7069v;
        cVar.getClass();
        k4.e eVar = new k4.e(0);
        u8.d dVar = o0.f703a;
        h hVar = cVar.f7970a;
        LinkedHashMap linkedHashMap = eVar.f5386a;
        linkedHashMap.put(dVar, hVar);
        linkedHashMap.put(o0.f704b, hVar);
        Bundle a9 = cVar.a();
        if (a9 != null) {
            linkedHashMap.put(o0.f705c, a9);
        }
        c4.o oVar = this.f7062d;
        if (oVar != null) {
            Context context = oVar.f1772d;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                application2 = application != null ? application : null;
                if (application2 != null) {
                    linkedHashMap.put(v0.f733d, application2);
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
        if (obj != null && (obj instanceof h)) {
            h hVar = (h) obj;
            Bundle bundle = hVar.f7064i;
            if (Intrinsics.a(this.f7067t, hVar.f7067t) && Intrinsics.a(this.f7063e, hVar.f7063e) && Intrinsics.a(this.f7069v.j, hVar.f7069v.j) && Intrinsics.a(b(), hVar.b())) {
                Bundle bundle2 = this.f7064i;
                if (Intrinsics.a(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (keySet = bundle2.keySet()) != null) {
                    Set<String> set = keySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!Intrinsics.a(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.lifecycle.a1
    public final z0 f() {
        q4.c cVar = this.f7069v;
        if (!cVar.f7977i) {
            kotlin.collections.i0.l("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (cVar.j.f737c == androidx.lifecycle.p.f707d) {
            kotlin.collections.i0.l("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        l lVar = cVar.f7974e;
        if (lVar == null) {
            kotlin.collections.i0.l("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        String str = cVar.f7975f;
        str.getClass();
        LinkedHashMap linkedHashMap = lVar.f7084b;
        z0 z0Var = (z0) linkedHashMap.get(str);
        if (z0Var != null) {
            return z0Var;
        }
        z0 z0Var2 = new z0();
        linkedHashMap.put(str, z0Var2);
        return z0Var2;
    }

    @Override // androidx.lifecycle.u
    public final androidx.lifecycle.w g() {
        return this.f7069v.j;
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.f7063e.hashCode() + (this.f7067t.hashCode() * 31);
        Bundle bundle = this.f7064i;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i3 = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i3 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return b().hashCode() + ((this.f7069v.j.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return this.f7069v.toString();
    }
}
