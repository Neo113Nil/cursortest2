package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class k0 extends h.a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1654k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m0 f1655l;

    public /* synthetic */ k0(m0 m0Var, int i) {
        this.f1654k = i;
        this.f1655l = m0Var;
    }

    @Override // n0.q0
    public final void a() {
        View view;
        int i = this.f1654k;
        m0 m0Var = this.f1655l;
        switch (i) {
            case 0:
                if (m0Var.B && (view = m0Var.f1666t) != null) {
                    view.setTranslationY(0.0f);
                    m0Var.f1663q.setTranslationY(0.0f);
                }
                m0Var.f1663q.setVisibility(8);
                m0Var.f1663q.setTransitioning(false);
                m0Var.F = null;
                androidx.emoji2.text.q qVar = m0Var.f1670x;
                if (qVar != null) {
                    qVar.A(m0Var.f1669w);
                    m0Var.f1669w = null;
                    m0Var.f1670x = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = m0Var.f1662p;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = n0.l0.f2757a;
                    n0.b0.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                m0Var.F = null;
                m0Var.f1663q.requestLayout();
                break;
        }
    }
}
