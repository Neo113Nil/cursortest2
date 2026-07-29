package com.ironsource.b;

import android.app.Activity;
import android.text.TextUtils;
import com.ironsource.b.d.c;
import com.youappi.sdk.mediation.admob.ParamNames;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: AbstractAdUnitManager.java */
/* loaded from: classes2.dex */
abstract class a {
    int h;
    Activity j;
    String k;
    String l;
    Boolean o;
    boolean p;
    private c s;
    private c t;

    /* renamed from: a, reason: collision with root package name */
    final String f6713a = "reason";

    /* renamed from: b, reason: collision with root package name */
    final String f6714b = "status";

    /* renamed from: c, reason: collision with root package name */
    final String f6715c = "placement";

    /* renamed from: d, reason: collision with root package name */
    final String f6716d = "rewardName";
    final String e = ParamNames.REWARD_AMOUNT;
    final String f = "providerPriority";
    boolean n = false;
    boolean q = true;
    boolean r = false;
    final CopyOnWriteArrayList<c> i = new CopyOnWriteArrayList<>();
    com.ironsource.b.d.d m = com.ironsource.b.d.d.c();
    com.ironsource.b.h.c g = null;

    a() {
    }

    public void a(Activity activity) {
        if (activity != null) {
            this.j = activity;
        }
        synchronized (this.i) {
            if (this.i != null) {
                Iterator<c> it = this.i.iterator();
                while (it.hasNext()) {
                    it.next().a(activity);
                }
            }
        }
    }

    public void b(Activity activity) {
        synchronized (this.i) {
            if (this.i != null) {
                Iterator<c> it = this.i.iterator();
                while (it.hasNext()) {
                    it.next().b(activity);
                }
            }
        }
    }

    void a(int i) {
        this.h = i;
    }

    void a(c cVar) {
        this.i.add(cVar);
        if (this.g != null) {
            this.g.a(cVar);
        }
    }

    void b(c cVar) {
        this.m.a(c.a.INTERNAL, cVar.m() + " is set as backfill", 0);
        this.s = cVar;
    }

    void c(c cVar) {
        this.m.a(c.a.INTERNAL, cVar.m() + " is set as premium", 0);
        this.t = cVar;
    }

    c a() {
        return this.s;
    }

    c b() {
        return this.t;
    }

    void d(c cVar) {
        try {
            Integer b2 = m.a().b();
            if (b2 != null) {
                cVar.a(b2.intValue());
            }
            String c2 = m.a().c();
            if (!TextUtils.isEmpty(c2)) {
                cVar.a(c2);
            }
            String d2 = m.a().d();
            if (!TextUtils.isEmpty(d2)) {
                cVar.b(d2);
            }
            String b3 = com.ironsource.b.a.a.a().b();
            if (!TextUtils.isEmpty(b3)) {
                cVar.a(b3, com.ironsource.b.a.a.a().d());
            }
            Boolean m = m.a().m();
            if (m != null) {
                cVar.a(m.booleanValue());
            }
        } catch (Exception e) {
            this.m.a(c.a.INTERNAL, ":setCustomParams():" + e.toString(), 3);
        }
    }

    synchronized boolean c() {
        return this.q;
    }

    synchronized void d() {
        this.q = false;
    }

    synchronized b e(c cVar) {
        b b2;
        try {
            b2 = m.a().b(cVar.n());
            if (b2 == null) {
                this.m.a(c.a.INTERNAL, "loading " + cVar.n() + " with reflection", 0);
                Class<?> cls = Class.forName("com.ironsource.adapters." + cVar.l().toLowerCase() + "." + cVar.l() + "Adapter");
                b2 = (b) cls.getMethod("startAdapter", String.class).invoke(cls, cVar.n());
            } else {
                this.m.a(c.a.INTERNAL, "using previously loaded " + cVar.n(), 0);
            }
        } catch (Exception unused) {
            return null;
        }
        return b2;
    }

    void b(boolean z) {
        Iterator<c> it = this.i.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next != null) {
                next.a(z);
            }
        }
    }
}
