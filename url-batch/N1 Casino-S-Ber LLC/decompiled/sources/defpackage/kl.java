package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.a;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class kl implements tm, g10, j90 {
    public final mk f;
    public final i90 g;
    public a h = null;
    public f10 i = null;

    public kl(mk mkVar, i90 i90Var) {
        this.f = mkVar;
        this.g = i90Var;
    }

    @Override // defpackage.g10
    public final i3 a() {
        f();
        return this.i.b;
    }

    public final void b(up upVar) {
        this.h.d(upVar);
    }

    @Override // defpackage.tm
    public final pu c() {
        Application application;
        mk mkVar = this.f;
        Context applicationContext = mkVar.E().getApplicationContext();
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
        pu puVar = new pu(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) puVar.a;
        if (application != null) {
            linkedHashMap.put(dh.n, application);
        }
        linkedHashMap.put(jw.k, this);
        linkedHashMap.put(jw.l, this);
        Bundle bundle = mkVar.k;
        if (bundle != null) {
            linkedHashMap.put(jw.m, bundle);
        }
        return puVar;
    }

    @Override // defpackage.j90
    public final i90 d() {
        f();
        return this.g;
    }

    @Override // defpackage.aq
    public final a e() {
        f();
        return this.h;
    }

    public final void f() {
        if (this.h == null) {
            this.h = new a(this);
            f10 f10Var = new f10(this);
            this.i = f10Var;
            f10Var.a();
            jw.q(this);
        }
    }
}
