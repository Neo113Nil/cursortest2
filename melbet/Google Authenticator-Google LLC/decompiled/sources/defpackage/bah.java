package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bah implements ComponentCallbacks2, bkd {
    private static final blf e;
    protected final azj a;
    protected final Context b;
    public final bkc c;
    public final CopyOnWriteArrayList d;
    private final bkl f;
    private final bkk g;
    private final bkq h;
    private final Runnable i;
    private final bjw j;
    private blf k;

    static {
        blf a = blf.a(Bitmap.class);
        a.I();
        e = a;
        blf.a(bjj.class).I();
    }

    public bah(azj azjVar, bkc bkcVar, bkk bkkVar, Context context) {
        bkl bklVar = new bkl();
        a aVar = azjVar.f;
        this.h = new bkq();
        ath athVar = new ath(this, 2, null);
        this.i = athVar;
        this.a = azjVar;
        this.c = bkcVar;
        this.g = bkkVar;
        this.f = bklVar;
        this.b = context;
        Context applicationContext = context.getApplicationContext();
        bjw bjxVar = aat.c(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0 ? new bjx(applicationContext, new bag(this, bklVar)) : new bkg();
        this.j = bjxVar;
        synchronized (azjVar.d) {
            if (azjVar.d.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            azjVar.d.add(this);
        }
        if (bmi.h()) {
            bmi.g(athVar);
        } else {
            bkcVar.a(this);
        }
        bkcVar.a(bjxVar);
        this.d = new CopyOnWriteArrayList(azjVar.c.b);
        m(azjVar.c.b());
    }

    private final synchronized void p() {
        Set set = this.h.a;
        Iterator it = bmi.e(set).iterator();
        while (it.hasNext()) {
            f((bln) it.next());
        }
        set.clear();
    }

    public baf a(Class cls) {
        return new baf(this.a, this, cls);
    }

    public baf b() {
        return a(Bitmap.class).f(e);
    }

    public baf c() {
        return a(Drawable.class);
    }

    public baf d(Object obj) {
        return c().d(obj);
    }

    final synchronized blf e() {
        return this.k;
    }

    public final void f(bln blnVar) {
        if (blnVar == null) {
            return;
        }
        boolean o = o(blnVar);
        blb a = blnVar.a();
        if (o) {
            return;
        }
        List list = this.a.d;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((bah) it.next()).o(blnVar)) {
                    return;
                }
            }
            if (a != null) {
                blnVar.c(null);
                a.c();
            }
        }
    }

    @Override // defpackage.bkd
    public final synchronized void g() {
        this.h.g();
        p();
        bkl bklVar = this.f;
        Iterator it = bmi.e(bklVar.a).iterator();
        while (it.hasNext()) {
            bklVar.a((blb) it.next());
        }
        bklVar.b.clear();
        bkc bkcVar = this.c;
        bkcVar.b(this);
        bkcVar.b(this.j);
        bmi.d().removeCallbacks(this.i);
        List list = this.a.d;
        synchronized (list) {
            if (!list.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            list.remove(this);
        }
    }

    @Override // defpackage.bkd
    public final synchronized void h() {
        l();
        this.h.h();
    }

    @Override // defpackage.bkd
    public final synchronized void i() {
        this.h.i();
        k();
    }

    public final synchronized void j() {
        bkl bklVar = this.f;
        bklVar.c = true;
        for (blb blbVar : bmi.e(bklVar.a)) {
            if (blbVar.n() || blbVar.l()) {
                blbVar.c();
                bklVar.b.add(blbVar);
            }
        }
    }

    public final synchronized void k() {
        bkl bklVar = this.f;
        bklVar.c = true;
        for (blb blbVar : bmi.e(bklVar.a)) {
            if (blbVar.n()) {
                blbVar.f();
                bklVar.b.add(blbVar);
            }
        }
    }

    public final synchronized void l() {
        bkl bklVar = this.f;
        bklVar.c = false;
        for (blb blbVar : bmi.e(bklVar.a)) {
            if (!blbVar.l() && !blbVar.n()) {
                blbVar.b();
            }
        }
        bklVar.b.clear();
    }

    protected synchronized void m(blf blfVar) {
        this.k = (blf) ((blf) blfVar.g()).j();
    }

    final synchronized void n(bln blnVar, blb blbVar) {
        this.h.a.add(blnVar);
        bkl bklVar = this.f;
        bklVar.a.add(blbVar);
        if (!bklVar.c) {
            blbVar.b();
        } else {
            blbVar.c();
            bklVar.b.add(blbVar);
        }
    }

    final synchronized boolean o(bln blnVar) {
        blb a = blnVar.a();
        if (a == null) {
            return true;
        }
        if (!this.f.a(a)) {
            return false;
        }
        this.h.a.remove(blnVar);
        blnVar.c(null);
        return true;
    }

    public final synchronized String toString() {
        bkk bkkVar;
        bkl bklVar;
        bkkVar = this.g;
        bklVar = this.f;
        return super.toString() + "{tracker=" + String.valueOf(bklVar) + ", treeNode=" + String.valueOf(bkkVar) + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
