package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ci implements aeh, ame, agl {
    public ael a = null;
    public brr b = null;
    private final bd c;
    private final agk d;
    private final Runnable e;
    private agh f;

    public ci(bd bdVar, agk agkVar, Runnable runnable) {
        this.c = bdVar;
        this.d = agkVar;
        this.e = runnable;
    }

    @Override // defpackage.aer
    public final ael L() {
        b();
        return this.a;
    }

    @Override // defpackage.aeh
    public final agh N() {
        Application application;
        bd bdVar = this.c;
        agh N = bdVar.N();
        if (!N.equals(bdVar.ad)) {
            this.f = N;
            return N;
        }
        if (this.f == null) {
            Context applicationContext = bdVar.y().getApplicationContext();
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
            this.f = new aga(application, bdVar, bdVar.n);
        }
        return this.f;
    }

    @Override // defpackage.agl
    public final agk O() {
        b();
        return this.d;
    }

    @Override // defpackage.aeh
    public final ago P() {
        Application application;
        bd bdVar = this.c;
        Context applicationContext = bdVar.y().getApplicationContext();
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
        agp agpVar = new agp();
        if (application != null) {
            agpVar.b(agg.b, application);
        }
        agpVar.b(afx.a, bdVar);
        agpVar.b(afx.b, this);
        Bundle bundle = bdVar.n;
        if (bundle != null) {
            agpVar.b(afx.c, bundle);
        }
        return agpVar;
    }

    final void a(aej aejVar) {
        this.a.b(aejVar);
    }

    @Override // defpackage.ame
    public final boe aE() {
        b();
        return (boe) this.b.a;
    }

    final void b() {
        if (this.a == null) {
            this.a = new ael(this);
            brr j = yi.j(this);
            this.b = j;
            j.h();
            this.e.run();
        }
    }
}
