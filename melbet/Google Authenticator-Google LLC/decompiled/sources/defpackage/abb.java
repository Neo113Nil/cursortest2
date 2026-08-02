package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abb implements View.OnAttachStateChangeListener {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public abb(ViewGroup viewGroup, Object obj, int i) {
        this.c = i;
        this.a = viewGroup;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.c;
        if (i == 0) {
            ((ViewGroup) this.a).addView((View) this.b, 0);
            view.removeOnAttachStateChangeListener(this);
            return;
        }
        if (i == 1) {
            gam gamVar = (gam) this.a;
            gamVar.l();
            cn.c((ViewGroup) ((bd) gamVar.e).R.getParent(), ((bm) this.b).a).f();
            return;
        }
        if (i == 2) {
            Object obj = this.b;
            dsg dsgVar = ((dso) this.a).b;
            dja djaVar = (dja) obj;
            dsgVar.e(djaVar);
            if (dsgVar.d()) {
                djaVar.i();
                return;
            }
            return;
        }
        if (i == 3) {
            ((RecyclerView) this.a).X((kr) this.b);
            return;
        }
        eea eeaVar = (eea) this.b;
        dja djaVar2 = eeaVar.w;
        drb drbVar = ((eed) this.a).a;
        drbVar.e(djaVar2);
        if (drbVar.b) {
            eeaVar.f(false);
            djaVar2.j(drbVar.a());
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.c;
        if (i == 0) {
            ((ViewGroup) this.a).addView((View) this.b, 0);
            view.removeOnAttachStateChangeListener(this);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                ((dso) this.a).b.f((dja) this.b);
            } else if (i == 3) {
                ((RecyclerView) this.a).X(null);
            } else {
                ((eed) this.a).a.f(((eea) this.b).w);
            }
        }
    }

    public abb(bm bmVar, gam gamVar, int i) {
        this.c = i;
        this.b = bmVar;
        this.a = gamVar;
    }

    public abb(dso dsoVar, dja djaVar, int i) {
        this.c = i;
        this.b = djaVar;
        this.a = dsoVar;
    }

    public abb(eea eeaVar, eed eedVar, int i) {
        this.c = i;
        this.a = eedVar;
        this.b = eeaVar;
    }
}
