package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fu implements View.OnAttachStateChangeListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public fu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                View view2 = (View) this.a;
                view2.removeOnAttachStateChangeListener(this);
                int i2 = yq.a;
                view2.requestApplyInsets();
                return;
            }
            if (i != 2) {
                if (i == 3) {
                    Object obj = this.a;
                    drp drpVar = (drp) obj;
                    dsf dsfVar = drpVar.a;
                    dsfVar.b.e(drpVar.c);
                    drpVar.b.b.d.add(drpVar.d);
                    gzp gzpVar = dsfVar.h;
                    drpVar.c();
                    dih.W(new dlj(obj, 10));
                    return;
                }
                if (i == 4) {
                    drp drpVar2 = (drp) this.a;
                    dsg dsgVar = drpVar2.a.b;
                    if (dsgVar.d()) {
                        drpVar2.a(dsgVar.a());
                    }
                    drpVar2.b.removeOnAttachStateChangeListener(this);
                    return;
                }
                Object obj2 = this.a;
                if (i != 5) {
                    ((fqs) obj2).e();
                    return;
                }
                eea eeaVar = (eea) obj2;
                eeaVar.q(37);
                eeaVar.removeOnAttachStateChangeListener(this);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [dps, java.lang.Object] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.b;
        if (i == 0) {
            fx fxVar = (fx) this.a;
            ViewTreeObserver viewTreeObserver = fxVar.e;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    fxVar.e = view.getViewTreeObserver();
                }
                fxVar.e.removeGlobalOnLayoutListener(fxVar.c);
            }
            view.removeOnAttachStateChangeListener(this);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                gv gvVar = (gv) this.a;
                ViewTreeObserver viewTreeObserver2 = gvVar.d;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        gvVar.d = view.getViewTreeObserver();
                    }
                    gvVar.d.removeGlobalOnLayoutListener(gvVar.b);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            }
            if (i != 3) {
                if (i == 4 || i == 5) {
                    return;
                }
                ((fqs) this.a).i();
                return;
            }
            drp drpVar = (drp) this.a;
            dsf dsfVar = drpVar.a;
            gzp gzpVar = dsfVar.h;
            dsfVar.b.f(drpVar.c);
            AccountParticleDisc accountParticleDisc = drpVar.b.b;
            accountParticleDisc.d.remove(drpVar.d);
            accountParticleDisc.n(null);
            dps dpsVar = accountParticleDisc.j;
            edb edbVar = accountParticleDisc.o;
            fao.c();
            ?? r2 = edbVar.a;
            if (r2 != 0) {
                r2.a();
            }
        }
    }
}
