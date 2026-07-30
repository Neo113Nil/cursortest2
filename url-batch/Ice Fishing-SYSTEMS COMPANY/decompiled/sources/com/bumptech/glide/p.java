package com.bumptech.glide;

import F3.C;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import s1.InterfaceC4992e;

/* loaded from: classes.dex */
public final class p implements ComponentCallbacks2, com.bumptech.glide.manager.h {

    /* renamed from: D, reason: collision with root package name */
    public static final J1.e f23641D;

    /* renamed from: A, reason: collision with root package name */
    public final com.bumptech.glide.manager.b f23642A;

    /* renamed from: B, reason: collision with root package name */
    public final CopyOnWriteArrayList f23643B;

    /* renamed from: C, reason: collision with root package name */
    public final J1.e f23644C;

    /* renamed from: n, reason: collision with root package name */
    public final c f23645n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f23646u;

    /* renamed from: v, reason: collision with root package name */
    public final com.bumptech.glide.manager.g f23647v;

    /* renamed from: w, reason: collision with root package name */
    public final com.bumptech.glide.manager.o f23648w;

    /* renamed from: x, reason: collision with root package name */
    public final com.bumptech.glide.manager.l f23649x;

    /* renamed from: y, reason: collision with root package name */
    public final com.bumptech.glide.manager.p f23650y;

    /* renamed from: z, reason: collision with root package name */
    public final C f23651z;

    static {
        J1.e eVar = (J1.e) new J1.e().i(Bitmap.class);
        eVar.f1342F = true;
        f23641D = eVar;
        ((J1.e) new J1.e().i(F1.b.class)).f1342F = true;
    }

    public p(c cVar, com.bumptech.glide.manager.g gVar, com.bumptech.glide.manager.l lVar, Context context) {
        J1.e eVar;
        com.bumptech.glide.manager.o oVar = new com.bumptech.glide.manager.o(2);
        W3.e eVar2 = cVar.f23535y;
        this.f23650y = new com.bumptech.glide.manager.p();
        C c4 = new C(17, this);
        this.f23651z = c4;
        this.f23645n = cVar;
        this.f23647v = gVar;
        this.f23649x = lVar;
        this.f23648w = oVar;
        this.f23646u = context;
        Context applicationContext = context.getApplicationContext();
        o oVar2 = new o(this, oVar);
        eVar2.getClass();
        boolean z8 = E.e.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z8 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        com.bumptech.glide.manager.b cVar2 = z8 ? new com.bumptech.glide.manager.c(applicationContext, oVar2) : new com.bumptech.glide.manager.j();
        this.f23642A = cVar2;
        synchronized (cVar.f23536z) {
            if (cVar.f23536z.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            cVar.f23536z.add(this);
        }
        char[] cArr = N1.p.f1976a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            gVar.b(this);
        } else {
            N1.p.f().post(c4);
        }
        gVar.b(cVar2);
        this.f23643B = new CopyOnWriteArrayList(cVar.f23532v.f23552e);
        i iVar = cVar.f23532v;
        synchronized (iVar) {
            try {
                if (iVar.f23556j == null) {
                    iVar.f23551d.getClass();
                    J1.e eVar3 = new J1.e();
                    eVar3.f1342F = true;
                    iVar.f23556j = eVar3;
                }
                eVar = iVar.f23556j;
            } finally {
            }
        }
        synchronized (this) {
            J1.e eVar4 = (J1.e) eVar.clone();
            if (eVar4.f1342F && !eVar4.f1344H) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            eVar4.f1344H = true;
            eVar4.f1342F = true;
            this.f23644C = eVar4;
        }
    }

    public final void i(K1.c cVar) {
        if (cVar == null) {
            return;
        }
        boolean n9 = n(cVar);
        J1.c g9 = cVar.g();
        if (n9) {
            return;
        }
        c cVar2 = this.f23645n;
        synchronized (cVar2.f23536z) {
            try {
                Iterator it = cVar2.f23536z.iterator();
                while (it.hasNext()) {
                    if (((p) it.next()).n(cVar)) {
                        return;
                    }
                }
                if (g9 != null) {
                    cVar.b(null);
                    g9.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void j() {
        try {
            Iterator it = N1.p.e(this.f23650y.f23626n).iterator();
            while (it.hasNext()) {
                i((K1.c) it.next());
            }
            this.f23650y.f23626n.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final n k(Uri uri) {
        PackageInfo packageInfo;
        n nVar = new n(this.f23645n, this, Drawable.class, this.f23646u);
        n F8 = nVar.F(uri);
        if (uri == null || !"android.resource".equals(uri.getScheme())) {
            return F8;
        }
        Context context = nVar.f23627K;
        n nVar2 = (n) F8.v(context.getTheme());
        ConcurrentHashMap concurrentHashMap = M1.b.f1877a;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = M1.b.f1877a;
        InterfaceC4992e interfaceC4992e = (InterfaceC4992e) concurrentHashMap2.get(packageName);
        if (interfaceC4992e == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e6) {
                Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e6);
                packageInfo = null;
            }
            M1.d dVar = new M1.d(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            InterfaceC4992e interfaceC4992e2 = (InterfaceC4992e) concurrentHashMap2.putIfAbsent(packageName, dVar);
            interfaceC4992e = interfaceC4992e2 == null ? dVar : interfaceC4992e2;
        }
        return (n) nVar2.t(new M1.a(context.getResources().getConfiguration().uiMode & 48, interfaceC4992e));
    }

    public final synchronized void l() {
        com.bumptech.glide.manager.o oVar = this.f23648w;
        oVar.f23623u = true;
        Iterator it = N1.p.e((Set) oVar.f23624v).iterator();
        while (it.hasNext()) {
            J1.c cVar = (J1.c) it.next();
            if (cVar.isRunning()) {
                cVar.pause();
                ((HashSet) oVar.f23625w).add(cVar);
            }
        }
    }

    public final synchronized void m() {
        com.bumptech.glide.manager.o oVar = this.f23648w;
        oVar.f23623u = false;
        Iterator it = N1.p.e((Set) oVar.f23624v).iterator();
        while (it.hasNext()) {
            J1.c cVar = (J1.c) it.next();
            if (!cVar.j() && !cVar.isRunning()) {
                cVar.i();
            }
        }
        ((HashSet) oVar.f23625w).clear();
    }

    public final synchronized boolean n(K1.c cVar) {
        J1.c g9 = cVar.g();
        if (g9 == null) {
            return true;
        }
        if (!this.f23648w.a(g9)) {
            return false;
        }
        this.f23650y.f23626n.remove(cVar);
        cVar.b(null);
        return true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.manager.h
    public final synchronized void onDestroy() {
        this.f23650y.onDestroy();
        j();
        com.bumptech.glide.manager.o oVar = this.f23648w;
        Iterator it = N1.p.e((Set) oVar.f23624v).iterator();
        while (it.hasNext()) {
            oVar.a((J1.c) it.next());
        }
        ((HashSet) oVar.f23625w).clear();
        this.f23647v.c(this);
        this.f23647v.c(this.f23642A);
        N1.p.f().removeCallbacks(this.f23651z);
        c cVar = this.f23645n;
        synchronized (cVar.f23536z) {
            if (!cVar.f23536z.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            cVar.f23536z.remove(this);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // com.bumptech.glide.manager.h
    public final synchronized void onStart() {
        m();
        this.f23650y.onStart();
    }

    @Override // com.bumptech.glide.manager.h
    public final synchronized void onStop() {
        this.f23650y.onStop();
        l();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f23648w + ", treeNode=" + this.f23649x + "}";
    }
}
