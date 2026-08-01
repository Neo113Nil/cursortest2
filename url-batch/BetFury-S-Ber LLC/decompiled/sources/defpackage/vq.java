package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.a;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class vq implements ws, sb0, tm0 {
    public final a f;
    public final sm0 g;
    public nx h = null;
    public i5 i = null;

    public vq(a aVar, sm0 sm0Var) {
        this.f = aVar;
        this.g = sm0Var;
    }

    @Override // defpackage.sb0
    public final i5 a() {
        f();
        return (i5) this.i.h;
    }

    public final void b(fx fxVar) {
        this.h.d(fxVar);
    }

    @Override // defpackage.ws
    public final a30 c() {
        Application application;
        a aVar = this.f;
        Context applicationContext = aVar.E().getApplicationContext();
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
        a30 a30Var = new a30(0);
        LinkedHashMap linkedHashMap = a30Var.a;
        if (application != null) {
            linkedHashMap.put(qm0.k, application);
        }
        linkedHashMap.put(bi.k, this);
        linkedHashMap.put(bi.l, this);
        Bundle bundle = aVar.k;
        if (bundle != null) {
            linkedHashMap.put(bi.m, bundle);
        }
        return a30Var;
    }

    @Override // defpackage.tm0
    public final sm0 d() {
        f();
        return this.g;
    }

    @Override // defpackage.lx
    public final nx e() {
        f();
        return this.h;
    }

    public final void f() {
        if (this.h == null) {
            this.h = new nx(this);
            rb0 rb0Var = new rb0(this, new h2(9, this));
            this.i = new i5(rb0Var);
            rb0Var.a();
            bi.x(this);
        }
    }
}
