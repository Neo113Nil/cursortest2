package s2;

import a.e0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.w0;
import com.oriondriftchasers.arordrft.R;
import f1.b1;
import f1.d0;
import java.util.List;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class l extends d0 {
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final x2.a f3213e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f3214f;

    public l(List list, x2.a aVar, e0 e0Var) {
        this.d = list;
        this.f3213e = aVar;
        this.f3214f = e0Var;
    }

    @Override // f1.d0
    public final int a() {
        return this.d.size();
    }

    @Override // f1.d0
    public final void c(b1 b1Var, int i) {
        k kVar = (k) b1Var;
        y2.f fVar = (y2.f) this.d.get(i);
        kVar.f3209u.setText(fVar.f3828c);
        kVar.f3210v.setText(fVar.f3827b);
        TextView textView = kVar.f3211w;
        List list = fVar.d;
        textView.setText(list.size() + " Questions");
        int d = this.f3213e.d(fVar.f3826a);
        kVar.f3212x.setText(d > 0 ? w0.e("Best: ", d, "/", list.size()) : "Not completed");
        kVar.f1309a.setOnClickListener(new j(this, fVar, 0));
    }

    @Override // f1.d0
    public final b1 d(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_quiz_selection, viewGroup, false);
        f3.d.b(inflate);
        return new k(inflate);
    }
}
