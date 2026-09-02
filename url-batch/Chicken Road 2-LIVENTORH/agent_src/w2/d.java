package w2;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.k0;
import androidx.fragment.app.r0;
import androidx.fragment.app.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d extends u {
    public u2.c Y;

    public final void G() {
        k0 j4 = j();
        d dVar = new d();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(j4);
        aVar.f(R.id.content, dVar, null, 2);
        aVar.d(false);
        u uVar = this.f554z;
        if (uVar != null) {
            k0 g4 = uVar.g();
            g4.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(g4);
            aVar2.e(this);
            aVar2.b(new r0(7, this));
            aVar2.d(false);
        }
    }

    @Override // androidx.fragment.app.u
    public final View s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        f3.d.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(com.oriondriftchasers.arordrft.R.layout.fragment_game_garage, viewGroup, false);
        int i = com.oriondriftchasers.arordrft.R.id.garage_credit_balance_text;
        TextView textView = (TextView) h.a.s(inflate, com.oriondriftchasers.arordrft.R.id.garage_credit_balance_text);
        if (textView != null) {
            i = com.oriondriftchasers.arordrft.R.id.garage_header_layout;
            if (((LinearLayout) h.a.s(inflate, com.oriondriftchasers.arordrft.R.id.garage_header_layout)) != null) {
                i = com.oriondriftchasers.arordrft.R.id.gliders_recycler_view;
                RecyclerView recyclerView = (RecyclerView) h.a.s(inflate, com.oriondriftchasers.arordrft.R.id.gliders_recycler_view);
                if (recyclerView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    this.Y = new u2.c(constraintLayout, textView, recyclerView);
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
        x2.a aVar = new x2.a(C(), 0);
        y2.e f2 = aVar.f();
        List e4 = t0.d.e();
        u2.c cVar = this.Y;
        f3.d.b(cVar);
        cVar.f3363a.setText("💰 " + f2.f3820a);
        u2.c cVar2 = this.Y;
        f3.d.b(cVar2);
        cVar2.f3364b.setLayoutManager(new LinearLayoutManager(1));
        u2.c cVar3 = this.Y;
        f3.d.b(cVar3);
        cVar3.f3364b.setAdapter(new s2.e(e4, f2.d, f2.f3823e, new c(aVar, this)));
    }
}
