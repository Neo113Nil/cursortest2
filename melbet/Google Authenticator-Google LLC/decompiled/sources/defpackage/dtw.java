package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dtw extends eb implements ecs, duj {
    public static final String aj;
    public duh ak;
    public eia al;
    public dtn am;
    public dui an;
    public oc ao;
    public final dtw ap;
    public final lao aq = lak.a(null);
    public gjl ar;
    public final fwm as;
    private final koi at;

    static {
        String name = dua.class.getName();
        name.getClass();
        aj = name;
    }

    public dtw() {
        koi a = koc.a(3, new dfh(new dfh(this, 7), 8));
        int i = ksx.a;
        this.at = new agf(new ksj(dtr.class), new dfh(a, 9), new dtz(this, a, 1), new dfh(a, 10));
        this.as = new fwm(this);
        this.ap = this;
        new dtt(this);
    }

    private final void aI(krt krtVar) {
        this.as.F(new drn(krtVar, this, 3, null));
    }

    @Override // defpackage.bd
    public final View I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        Bundle bundle2 = this.n;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        dux duxVar = (dux) pj.h(bundle2, "themeConfiguration", dux.class);
        if (duxVar == null) {
            Bundle bundle3 = this.n;
            if (bundle3 != null && bundle3.getBoolean("enableDynamicColors")) {
                context = fhk.c(context);
            }
        } else {
            on onVar = new on(context, R.style.OneGoogle_Bento_DefaultOverlay);
            int i = duxVar.a;
            if (i != 0) {
                onVar = new on(onVar, i);
            }
            context = new on(onVar, R.style.OneGoogle_Bento_ForcedOverlay);
            if (duxVar.b) {
                context = fhk.c(context);
            }
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.bento_layout, viewGroup);
        inflate.getClass();
        return inflate;
    }

    @Override // defpackage.bd
    public final void Z() {
        aF().b();
        super.Z();
    }

    @Override // defpackage.eb, defpackage.ar
    public final Dialog a(Bundle bundle) {
        Dialog a = super.a(bundle);
        ea eaVar = (ea) a;
        Context context = eaVar.getContext();
        context.getClass();
        boolean E = dja.E(context);
        if (bundle == null) {
            Window window = eaVar.getWindow();
            if (window != null) {
                window.setWindowAnimations(true != E ? R.style.OneGoogle_Dialog_Bento_Animation : R.style.OneGoogle_Dialog_Bento_Animation_LargeScreen);
                return a;
            }
        } else {
            Window window2 = eaVar.getWindow();
            if (window2 != null) {
                window2.setWindowAnimations(true != E ? R.style.OneGoogle_Dialog_Bento_Animation_Exit : R.style.OneGoogle_Dialog_Bento_Animation_LargeScreen_Exit);
            }
        }
        return a;
    }

    public final dtr aF() {
        return (dtr) this.at.a();
    }

    public final duh aG() {
        duh duhVar = this.ak;
        if (duhVar != null) {
            return duhVar;
        }
        ksp.a("fragmentInjectables");
        return null;
    }

    @Override // defpackage.ecs
    public final boolean aH() {
        return this.ak != null;
    }

    @Override // defpackage.bd
    public final void ad(View view, Bundle bundle) {
        view.getClass();
        aI(new ajt(12));
        View findViewById = view.findViewById(R.id.og_bento_menu_content_container);
        findViewById.getClass();
        FrameLayout frameLayout = (FrameLayout) findViewById;
        Context context = view.getContext();
        context.getClass();
        if (dja.E(context) && bundle == null) {
            frameLayout.startAnimation(AnimationUtils.loadAnimation(frameLayout.getContext(), R.anim.scale_enter));
        }
        this.as.F(new ajx(this, view, frameLayout, 15));
    }

    @Override // defpackage.ar
    public final void d() {
        if (ao()) {
            if (ar()) {
                super.q(true, false);
            } else {
                super.q(false, false);
            }
        }
    }

    @Override // defpackage.ar, defpackage.bd
    public final void e(Context context) {
        super.e(context);
        aI(new ajq(this, 17));
        this.ao = K(new om(), new fsa(this, 1));
    }

    @Override // defpackage.ar, defpackage.bd
    public final void f(Bundle bundle) {
        super.f(bundle);
        aI(new ajt(10));
        if (bundle != null) {
            this.am = (dtn) pj.h(bundle, "activityResultContextKey", dtn.class);
        }
        this.as.F(new dlj(this, 15));
    }

    @Override // defpackage.ar, defpackage.bd
    public final void g() {
        super.g();
        this.aq.d(null);
        this.as.F(new dlj(this, 16));
    }

    @Override // defpackage.ar, defpackage.bd
    public final void h() {
        aI(new ajt(13));
        this.as.F(new dlj(this, 14));
        super.h();
    }

    @Override // defpackage.ar, defpackage.bd
    public final void i(Bundle bundle) {
        super.i(bundle);
        bundle.putParcelable("activityResultContextKey", this.am);
    }

    @Override // defpackage.bd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        aI(new ajt(11));
        View view = this.R;
        if (view == null || !aH() || this.al == null) {
            return;
        }
        aF().b();
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.og_bento_menu_content_container);
        frameLayout.removeAllViews();
        lao laoVar = this.aq;
        Object b = aG().a().b.b();
        frameLayout.getClass();
        laoVar.d(((dya) b).b(frameLayout));
        dtr aF = aF();
        eia eiaVar = this.al;
        dui duiVar = null;
        if (eiaVar == null) {
            ksp.a("initialModelData");
            eiaVar = null;
        }
        dui duiVar2 = this.an;
        if (duiVar2 == null) {
            ksp.a("fragmentScopedData");
        } else {
            duiVar = duiVar2;
        }
        aF.a(eiaVar, duiVar);
    }
}
