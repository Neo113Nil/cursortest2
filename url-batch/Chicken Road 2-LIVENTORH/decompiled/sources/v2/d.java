package v2;

import a.e0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.oriondriftchasers.arordrft.R;
import f1.c0;
import java.util.List;
import s2.l;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d extends u {
    public c0 Y;

    @Override // androidx.fragment.app.u
    public final View s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        f3.d.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_quiz_selection, viewGroup, false);
        int i = R.id.quiz_selection_recycler_view;
        RecyclerView recyclerView = (RecyclerView) h.a.s(inflate, R.id.quiz_selection_recycler_view);
        if (recyclerView != null) {
            i = R.id.quiz_subtitle_text;
            if (((TextView) h.a.s(inflate, R.id.quiz_subtitle_text)) != null) {
                i = R.id.quiz_title_header;
                if (((TextView) h.a.s(inflate, R.id.quiz_title_header)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    this.Y = new c0(constraintLayout, recyclerView);
                    f3.d.d(constraintLayout, "getRoot(...)");
                    return constraintLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // androidx.fragment.app.u
    public final void t() {
        this.H = true;
        this.Y = null;
    }

    @Override // androidx.fragment.app.u
    public final void z(View view, Bundle bundle) {
        f3.d.e(view, "view");
        List f2 = t0.d.f();
        x2.a aVar = new x2.a(C(), 1);
        c0 c0Var = this.Y;
        f3.d.b(c0Var);
        c0Var.f1328a.setLayoutManager(new GridLayoutManager());
        c0 c0Var2 = this.Y;
        f3.d.b(c0Var2);
        c0Var2.f1328a.setAdapter(new l(f2, aVar, new e0(7, this)));
    }
}
