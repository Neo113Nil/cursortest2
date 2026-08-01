package s2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.oriondriftchasers.arordrft.R;
import f1.b1;
import f1.d0;
import java.util.List;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e extends d0 {
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final List f3190e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3191f;

    /* renamed from: g, reason: collision with root package name */
    public final w2.c f3192g;

    public e(List list, List list2, int i, w2.c cVar) {
        f3.d.e(list2, "ownedGliderIds");
        this.d = list;
        this.f3190e = list2;
        this.f3191f = i;
        this.f3192g = cVar;
    }

    @Override // f1.d0
    public final int a() {
        return this.d.size();
    }

    @Override // f1.d0
    public final void c(b1 b1Var, int i) {
        d dVar = (d) b1Var;
        View view = dVar.f1309a;
        TextView textView = dVar.f3187x;
        Button button = dVar.f3188y;
        final y2.b bVar = (y2.b) this.d.get(i);
        boolean contains = this.f3190e.contains(Integer.valueOf(bVar.f3803a));
        boolean z3 = bVar.f3803a == this.f3191f;
        dVar.f3184u.setText(bVar.f3805c);
        dVar.f3185v.setText(bVar.f3804b);
        dVar.f3186w.setText("⚡" + bVar.d + " 🎯" + bVar.f3806e + " 🛡️" + bVar.f3807f);
        if (contains) {
            textView.setText("Owned");
            textView.setTextColor(view.getContext().getColor(R.color.success_green));
            button.setText(z3 ? "Selected" : "Select");
            button.setEnabled(!z3);
            final int i4 = 0;
            button.setOnClickListener(new View.OnClickListener(this) { // from class: s2.c

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ e f3182g;

                {
                    this.f3182g = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i4) {
                        case 0:
                            this.f3182g.f3192g.a(bVar, "select");
                            break;
                        default:
                            this.f3182g.f3192g.a(bVar, "purchase");
                            break;
                    }
                }
            });
        } else {
            textView.setText(bVar.f3808g + " credits");
            textView.setTextColor(view.getContext().getColor(R.color.glider_cyan));
            button.setText("Purchase");
            button.setEnabled(true);
            final int i5 = 1;
            button.setOnClickListener(new View.OnClickListener(this) { // from class: s2.c

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ e f3182g;

                {
                    this.f3182g = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i5) {
                        case 0:
                            this.f3182g.f3192g.a(bVar, "select");
                            break;
                        default:
                            this.f3182g.f3192g.a(bVar, "purchase");
                            break;
                    }
                }
            });
        }
        dVar.f3189z.setVisibility(z3 ? 0 : 8);
    }

    @Override // f1.d0
    public final b1 d(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_glider, viewGroup, false);
        f3.d.b(inflate);
        return new d(inflate);
    }
}
