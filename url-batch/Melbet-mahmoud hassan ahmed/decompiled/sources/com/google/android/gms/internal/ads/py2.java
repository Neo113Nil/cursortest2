package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class py2 extends ly2 {

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f10480i = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    private final ny2 f10481a;

    /* renamed from: b, reason: collision with root package name */
    private final my2 f10482b;

    /* renamed from: d, reason: collision with root package name */
    private l03 f10484d;

    /* renamed from: e, reason: collision with root package name */
    private oz2 f10485e;

    /* renamed from: c, reason: collision with root package name */
    private final List<dz2> f10483c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private boolean f10486f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f10487g = false;

    /* renamed from: h, reason: collision with root package name */
    private final String f10488h = UUID.randomUUID().toString();

    py2(my2 my2Var, ny2 ny2Var) {
        this.f10482b = my2Var;
        this.f10481a = ny2Var;
        k(null);
        if (ny2Var.d() == oy2.HTML || ny2Var.d() == oy2.JAVASCRIPT) {
            this.f10485e = new pz2(ny2Var.a());
        } else {
            this.f10485e = new rz2(ny2Var.i(), null);
        }
        this.f10485e.j();
        az2.a().d(this);
        gz2.a().d(this.f10485e.a(), my2Var.b());
    }

    private final void k(View view) {
        this.f10484d = new l03(view);
    }

    @Override // com.google.android.gms.internal.ads.ly2
    public final void b(View view, ry2 ry2Var, String str) {
        dz2 dz2Var;
        if (this.f10487g) {
            return;
        }
        if (!f10480i.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
        }
        Iterator<dz2> it = this.f10483c.iterator();
        while (true) {
            if (!it.hasNext()) {
                dz2Var = null;
                break;
            } else {
                dz2Var = it.next();
                if (dz2Var.b().get() == view) {
                    break;
                }
            }
        }
        if (dz2Var == null) {
            this.f10483c.add(new dz2(view, ry2Var, "Ad overlay"));
        }
    }

    @Override // com.google.android.gms.internal.ads.ly2
    public final void c() {
        if (this.f10487g) {
            return;
        }
        this.f10484d.clear();
        if (!this.f10487g) {
            this.f10483c.clear();
        }
        this.f10487g = true;
        gz2.a().c(this.f10485e.a());
        az2.a().e(this);
        this.f10485e.c();
        this.f10485e = null;
    }

    @Override // com.google.android.gms.internal.ads.ly2
    public final void d(View view) {
        if (this.f10487g || f() == view) {
            return;
        }
        k(view);
        this.f10485e.b();
        Collection<py2> c7 = az2.a().c();
        if (c7 == null || c7.size() <= 0) {
            return;
        }
        for (py2 py2Var : c7) {
            if (py2Var != this && py2Var.f() == view) {
                py2Var.f10484d.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ly2
    public final void e() {
        if (this.f10486f) {
            return;
        }
        this.f10486f = true;
        az2.a().f(this);
        this.f10485e.h(hz2.b().a());
        this.f10485e.f(this, this.f10481a);
    }

    public final View f() {
        return this.f10484d.get();
    }

    public final oz2 g() {
        return this.f10485e;
    }

    public final String h() {
        return this.f10488h;
    }

    public final List<dz2> i() {
        return this.f10483c;
    }

    public final boolean j() {
        return this.f10486f && !this.f10487g;
    }
}
