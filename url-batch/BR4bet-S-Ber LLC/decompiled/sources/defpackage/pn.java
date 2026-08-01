package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class pn implements fp, n40, uc0 {
    public final pm f;
    public final tc0 g;
    public os h = null;
    public m40 i = null;

    public pn(pm pmVar, tc0 tc0Var) {
        this.f = pmVar;
        this.g = tc0Var;
    }

    @Override // defpackage.n40
    public final s3 a() {
        f();
        return this.i.b;
    }

    public final void b(gs gsVar) {
        this.h.d(gsVar);
    }

    @Override // defpackage.fp
    public final qx c() {
        Application application;
        pm pmVar = this.f;
        Context applicationContext = pmVar.E().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        qx qxVar = new qx(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) qxVar.a;
        if (application != null) {
            linkedHashMap.put(rc0.i, application);
        }
        linkedHashMap.put(kr.k, this);
        linkedHashMap.put(kr.l, this);
        Bundle bundle = pmVar.k;
        if (bundle != null) {
            linkedHashMap.put(kr.m, bundle);
        }
        return qxVar;
    }

    @Override // defpackage.uc0
    public final tc0 d() {
        f();
        return this.g;
    }

    @Override // defpackage.ms
    public final os e() {
        f();
        return this.h;
    }

    public final void f() {
        if (this.h == null) {
            this.h = new os(this);
            m40 m40Var = new m40(this);
            this.i = m40Var;
            m40Var.a();
            kr.r(this);
        }
    }
}
