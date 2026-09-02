package s2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.oriondriftchasers.arordrft.R;
import f1.b1;
import f1.d0;
import java.util.List;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class h extends d0 {
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public int f3199e = -1;

    public h(List list) {
        this.d = list;
    }

    @Override // f1.d0
    public final int a() {
        return this.d.size();
    }

    @Override // f1.d0
    public final void c(b1 b1Var, int i) {
        g gVar = (g) b1Var;
        y2.c cVar = (y2.c) this.d.get(i);
        gVar.f3196u.setText(cVar.f3811a);
        TextView textView = gVar.f3197v;
        textView.setText(cVar.f3812b);
        boolean z3 = i == this.f3199e;
        textView.setVisibility(z3 ? 0 : 8);
        gVar.f3198w.setText(z3 ? "▲" : "▼");
        gVar.f1309a.setOnClickListener(new f(this, z3, gVar));
    }

    @Override // f1.d0
    public final b1 d(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_info_chapter, viewGroup, false);
        f3.d.b(inflate);
        return new g(inflate);
    }
}
