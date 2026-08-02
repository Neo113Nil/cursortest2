package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ei extends yw {
    final /* synthetic */ el a;

    public ei(el elVar) {
        this.a = elVar;
    }

    @Override // defpackage.yw, defpackage.yv
    public final void a() {
        View view;
        el elVar = this.a;
        if (elVar.j && (view = elVar.e) != null) {
            view.setTranslationY(0.0f);
            elVar.c.setTranslationY(0.0f);
        }
        elVar.c.setVisibility(8);
        elVar.c.a(false);
        elVar.l = null;
        ff ffVar = elVar.h;
        if (ffVar != null) {
            ffVar.a(elVar.g);
            elVar.g = null;
            elVar.h = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = elVar.b;
        if (actionBarOverlayLayout != null) {
            int i = yq.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }
}
