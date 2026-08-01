package s2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.oriondriftchasers.arordrft.R;
import f1.b1;
import f1.d0;
import java.util.List;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class q extends d0 {
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final w2.c f3231e;

    public q(List list, w2.c cVar) {
        this.d = list;
        this.f3231e = cVar;
    }

    @Override // f1.d0
    public final int a() {
        return this.d.size();
    }

    @Override // f1.d0
    public final void c(b1 b1Var, int i) {
        p pVar = (p) b1Var;
        y2.j jVar = (y2.j) this.d.get(i);
        pVar.f3226u.setText(jVar.f3844c);
        pVar.f3227v.setText(jVar.f3843b);
        pVar.f3228w.setText(jVar.d);
        pVar.f3229x.setText(String.valueOf(jVar.f3845e));
        pVar.f3230y.setOnClickListener(new j(this, jVar, 1));
    }

    @Override // f1.d0
    public final b1 d(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_shop_item, viewGroup, false);
        f3.d.b(inflate);
        return new p(inflate);
    }
}
