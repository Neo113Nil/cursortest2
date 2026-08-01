package w2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.oriondriftchasers.arordrft.R;
import f1.c0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e extends u {
    public c0 Y;

    @Override // androidx.fragment.app.u
    public final View s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        f3.d.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_game_missions, viewGroup, false);
        int i = R.id.missions_recycler_view;
        RecyclerView recyclerView = (RecyclerView) h.a.s(inflate, R.id.missions_recycler_view);
        if (recyclerView != null) {
            i = R.id.missions_title_text;
            if (((TextView) h.a.s(inflate, R.id.missions_title_text)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                this.Y = new c0(constraintLayout, recyclerView);
                f3.d.d(constraintLayout, "getRoot(...)");
                return constraintLayout;
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
        ArrayList arrayList = f2.d;
        List<y2.d> W = a3.f.W(new y2.d(1, "First Steps", "Complete 3 races", 3, 5000L, 100), new y2.d(2, "Speed Demon", "Win 5 races", 5, 10000L, 200), new y2.d(3, "Experienced Pilot", "Reach level 5", 5, 15000L, 300), new y2.d(4, "Fleet Commander", "Own 3 gliders", 3, 20000L, 400), new y2.d(5, "Racing Legend", "Complete 20 races", 20, 30000L, 500), new y2.d(6, "Master Collector", "Own all gliders", 7, 100000L, 2000));
        Set c4 = aVar.c();
        for (y2.d dVar : W) {
            int i = dVar.f3813a;
            int i4 = dVar.f3818g;
            long j4 = dVar.f3817f;
            switch (i) {
                case 1:
                    dVar.f3816e = f2.f3824f;
                    break;
                case 2:
                    dVar.f3816e = f2.f3825g;
                    break;
                case 3:
                    dVar.f3816e = f2.f3822c;
                    break;
                case 4:
                    dVar.f3816e = arrayList.size();
                    break;
                case 5:
                    dVar.f3816e = f2.f3824f;
                    break;
                case 6:
                    dVar.f3816e = arrayList.size();
                    break;
            }
            boolean z3 = dVar.f3816e >= dVar.d;
            dVar.f3819h = z3;
            if (z3 && !c4.contains(Integer.valueOf(i))) {
                y2.e f4 = aVar.f();
                f4.f3820a += j4;
                aVar.g(f4);
                aVar.a(i4);
                LinkedHashSet linkedHashSet = new LinkedHashSet(aVar.c());
                linkedHashSet.add(Integer.valueOf(i));
                aVar.f3619a.edit().putString("completed_missions", new JSONArray((Collection) a3.e.Y(linkedHashSet)).toString()).apply();
                Toast.makeText(h(), "🎉 Mission completed! +" + j4 + " credits, +" + i4 + " XP", 1).show();
            }
        }
        c0 c0Var = this.Y;
        f3.d.b(c0Var);
        c0Var.f1328a.setLayoutManager(new LinearLayoutManager(1));
        c0 c0Var2 = this.Y;
        f3.d.b(c0Var2);
        c0Var2.f1328a.setAdapter(new s2.b(W, 1));
    }
}
