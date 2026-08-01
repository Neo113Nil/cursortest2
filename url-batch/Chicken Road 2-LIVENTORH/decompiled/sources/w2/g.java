package w2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.oriondriftchasers.arordrft.R;
import java.util.List;
import s2.o;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class g extends u {
    public u2.c Y;

    @Override // androidx.fragment.app.u
    public final View s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        f3.d.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_game_races, viewGroup, false);
        int i = R.id.races_credits_balance_text;
        TextView textView = (TextView) h.a.s(inflate, R.id.races_credits_balance_text);
        if (textView != null) {
            i = R.id.races_header_layout;
            if (((LinearLayout) h.a.s(inflate, R.id.races_header_layout)) != null) {
                i = R.id.races_recycler_view;
                RecyclerView recyclerView = (RecyclerView) h.a.s(inflate, R.id.races_recycler_view);
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
        List W = a3.f.W(new y2.i(1, "Beginner's Loop", "🌟", "Easy", 1, 500L, 2000L, 50), new y2.i(2, "Asteroid Alley", "🪨", "Easy", 1, 800L, 3000L, 75), new y2.i(3, "Meteor Madness", "☄️", "Medium", 3, 1500L, 6000L, 150), new y2.i(4, "Nebula Storm", "⛈️", "Medium", 5, 2500L, 10000L, 250), new y2.i(5, "Titan's Challenge", "💫", "Hard", 8, 4000L, 16000L, 400), new y2.i(6, "Void Edge", "🌑", "Hard", 10, 6000L, 25000L, 600), new y2.i(7, "Orion's Gauntlet", "🏆", "Extreme", 15, 10000L, 45000L, 1000));
        u2.c cVar = this.Y;
        f3.d.b(cVar);
        cVar.f3363a.setText("💰 " + f2.f3820a);
        u2.c cVar2 = this.Y;
        f3.d.b(cVar2);
        cVar2.f3364b.setLayoutManager(new LinearLayoutManager(1));
        u2.c cVar3 = this.Y;
        f3.d.b(cVar3);
        cVar3.f3364b.setAdapter(new o(W, f2.f3822c, new f(f2, this, aVar)));
    }
}
