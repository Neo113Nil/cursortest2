package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xs0 implements jx0, zd2, u53 {
    public final fr0 m;
    public final t53 n;
    public q53 o;
    public kd1 p = null;
    public xd2 q = null;

    public xs0(fr0 fr0Var, t53 t53Var) {
        this.m = fr0Var;
        this.n = t53Var;
    }

    public final void a(yc1 yc1Var) {
        this.p.f(yc1Var);
    }

    public final void b() {
        if (this.p == null) {
            this.p = new kd1(this, true);
            yd2 yd2Var = new yd2(this, new dj(11, this));
            this.q = new xd2(yd2Var);
            yd2Var.a();
            z71.p(this);
        }
    }

    @Override // defpackage.jx0
    public final i50 getDefaultViewModelCreationExtras() {
        Application application;
        fr0 fr0Var = this.m;
        Context applicationContext = fr0Var.requireContext().getApplicationContext();
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
        wm1 wm1Var = new wm1(0);
        LinkedHashMap linkedHashMap = wm1Var.a;
        if (application != null) {
            linkedHashMap.put(p53.d, application);
        }
        linkedHashMap.put(z71.v, this);
        linkedHashMap.put(z71.w, this);
        if (fr0Var.getArguments() != null) {
            linkedHashMap.put(z71.x, fr0Var.getArguments());
        }
        return wm1Var;
    }

    @Override // defpackage.jx0
    public final q53 getDefaultViewModelProviderFactory() {
        Application application;
        fr0 fr0Var = this.m;
        q53 defaultViewModelProviderFactory = fr0Var.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fr0Var.mDefaultFactory)) {
            this.o = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.o == null) {
            Context applicationContext = fr0Var.requireContext().getApplicationContext();
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
            this.o = new ae2(application, this, fr0Var.getArguments());
        }
        return this.o;
    }

    @Override // defpackage.id1
    public final ad1 getLifecycle() {
        b();
        return this.p;
    }

    @Override // defpackage.zd2
    public final wd2 getSavedStateRegistry() {
        b();
        return this.q.b;
    }

    @Override // defpackage.u53
    public final t53 getViewModelStore() {
        b();
        return this.n;
    }
}
