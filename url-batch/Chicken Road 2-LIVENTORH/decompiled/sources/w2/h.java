package w2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.oriondriftchasers.arordrft.R;
import java.util.List;
import s2.q;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class h extends u {
    public u2.c Y;

    @Override // androidx.fragment.app.u
    public final View s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        f3.d.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_game_shop, viewGroup, false);
        int i = R.id.shop_credits_balance_text;
        TextView textView = (TextView) h.a.s(inflate, R.id.shop_credits_balance_text);
        if (textView != null) {
            i = R.id.shop_header_layout;
            if (((LinearLayout) h.a.s(inflate, R.id.shop_header_layout)) != null) {
                i = R.id.shop_items_recycler_view;
                RecyclerView recyclerView = (RecyclerView) h.a.s(inflate, R.id.shop_items_recycler_view);
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
        List W = a3.f.W(new y2.j(1, "Boost Pack", "⚡", "Temporary speed boost for next race", 2000L), new y2.j(2, "Shield Module", "🛡️", "Extra protection for next race", 2500L), new y2.j(3, "Credit Multiplier", "💰", "Double race rewards for 3 races", 5000L), new y2.j(4, "Experience Boost", "⭐", "Double XP for 5 races", 4000L), new y2.j(5, "Repair Kit", "🔧", "Full glider restoration", 3000L), new y2.j(6, "Lucky Charm", "🍀", "Increased win chance for next race", 6000L));
        u2.c cVar = this.Y;
        f3.d.b(cVar);
        cVar.f3363a.setText("💰 " + f2.f3820a);
        u2.c cVar2 = this.Y;
        f3.d.b(cVar2);
        cVar2.f3364b.setLayoutManager(new GridLayoutManager());
        u2.c cVar3 = this.Y;
        f3.d.b(cVar3);
        cVar3.f3364b.setAdapter(new q(W, new c(aVar, this)));
    }
}
