package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cp1 implements id1, u53, jx0, zd2 {
    public final Context m;
    public op1 n;
    public final Bundle o;
    public zc1 p;
    public final hp1 q;
    public final String r;
    public final Bundle s;
    public final kd1 t = new kd1(this, true);
    public final xd2 u = new xd2(new yd2(this, new dj(11, this)));
    public boolean v;
    public zc1 w;
    public final ae2 x;

    public cp1(Context context, op1 op1Var, Bundle bundle, zc1 zc1Var, hp1 hp1Var, String str, Bundle bundle2) {
        this.m = context;
        this.n = op1Var;
        this.o = bundle;
        this.p = zc1Var;
        this.q = hp1Var;
        this.r = str;
        this.s = bundle2;
        y91 b = ya1.b(new bp1(this, 0));
        ya1.b(new bp1(this, 1));
        this.w = zc1.n;
        this.x = (ae2) b.getValue();
    }

    public final Bundle a() {
        Bundle bundle = this.o;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    public final void b() {
        if (!this.v) {
            xd2 xd2Var = this.u;
            xd2Var.a.a();
            this.v = true;
            if (this.q != null) {
                z71.p(this);
            }
            xd2Var.a(this.s);
        }
        int ordinal = this.p.ordinal();
        int ordinal2 = this.w.ordinal();
        kd1 kd1Var = this.t;
        if (ordinal < ordinal2) {
            kd1Var.h(this.p);
        } else {
            kd1Var.h(this.w);
        }
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj != null && (obj instanceof cp1)) {
            cp1 cp1Var = (cp1) obj;
            Bundle bundle = cp1Var.o;
            if (Intrinsics.b(this.r, cp1Var.r) && Intrinsics.b(this.n, cp1Var.n) && Intrinsics.b(this.t, cp1Var.t) && Intrinsics.b(this.u.b, cp1Var.u.b)) {
                Bundle bundle2 = this.o;
                if (Intrinsics.b(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (keySet = bundle2.keySet()) != null) {
                    Set<String> set = keySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!Intrinsics.b(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jx0
    public final i50 getDefaultViewModelCreationExtras() {
        wm1 wm1Var = new wm1(0);
        Context context = this.m;
        Object applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        LinkedHashMap linkedHashMap = wm1Var.a;
        if (application != null) {
            linkedHashMap.put(p53.d, application);
        }
        linkedHashMap.put(z71.v, this);
        linkedHashMap.put(z71.w, this);
        Bundle a = a();
        if (a != null) {
            linkedHashMap.put(z71.x, a);
        }
        return wm1Var;
    }

    @Override // defpackage.jx0
    public final q53 getDefaultViewModelProviderFactory() {
        return this.x;
    }

    @Override // defpackage.id1
    public final ad1 getLifecycle() {
        return this.t;
    }

    @Override // defpackage.zd2
    public final wd2 getSavedStateRegistry() {
        return this.u.b;
    }

    @Override // defpackage.u53
    public final t53 getViewModelStore() {
        if (!this.v) {
            lh.g("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (this.t.c == zc1.m) {
            lh.g("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        hp1 hp1Var = this.q;
        if (hp1Var == null) {
            lh.g("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        String str = this.r;
        str.getClass();
        LinkedHashMap linkedHashMap = hp1Var.b;
        t53 t53Var = (t53) linkedHashMap.get(str);
        if (t53Var != null) {
            return t53Var;
        }
        t53 t53Var2 = new t53();
        linkedHashMap.put(str, t53Var2);
        return t53Var2;
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.n.hashCode() + (this.r.hashCode() * 31);
        Bundle bundle = this.o;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.u.b.hashCode() + ((this.t.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(cp1.class.getSimpleName());
        sb.append("(" + this.r + ')');
        sb.append(" destination=");
        sb.append(this.n);
        return sb.toString();
    }
}
