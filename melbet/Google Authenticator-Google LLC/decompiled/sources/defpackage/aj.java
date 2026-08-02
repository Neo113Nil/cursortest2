package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aj extends ck {
    public final ak a;

    public aj(ak akVar) {
        akVar.getClass();
        this.a = akVar;
    }

    @Override // defpackage.ck
    public final void a(ViewGroup viewGroup) {
        cm cmVar = this.a.a;
        View view = cmVar.a.R;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        cmVar.f(this);
        if (by.U(2)) {
            Objects.toString(cmVar);
        }
    }

    @Override // defpackage.ck
    public final void b(ViewGroup viewGroup) {
        Object obj;
        ak akVar = this.a;
        if (akVar.b()) {
            akVar.a.f(this);
            return;
        }
        Context context = viewGroup.getContext();
        cm cmVar = akVar.a;
        View view = cmVar.a.R;
        context.getClass();
        brr a = akVar.a(context);
        if (a == null || (obj = a.a) == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (cmVar.h != 1) {
            view.startAnimation((Animation) obj);
            cmVar.f(this);
            return;
        }
        viewGroup.startViewTransition(view);
        bh bhVar = new bh((Animation) obj, viewGroup, view);
        bhVar.setAnimationListener(new ai(cmVar, viewGroup, view, this));
        view.startAnimation(bhVar);
        if (by.U(2)) {
            Objects.toString(cmVar);
        }
    }
}
