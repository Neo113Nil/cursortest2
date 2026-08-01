package V0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.winfour.neondrop.R;
import h0.AbstractC0113A;
import h0.X;
import h0.a0;
import m.C0227a;

/* loaded from: classes.dex */
public final class h extends AbstractC0113A {

    /* renamed from: c, reason: collision with root package name */
    public final Y0.c f940c;
    public final S0.a d;

    /* renamed from: e, reason: collision with root package name */
    public final i f941e;

    public h(Y0.c cVar, S0.a aVar, i iVar) {
        g1.d.e(cVar, "levels");
        g1.d.e(aVar, "progressStore");
        this.f940c = cVar;
        this.d = aVar;
        this.f941e = iVar;
    }

    @Override // h0.AbstractC0113A
    public final int a() {
        return this.f940c.a();
    }

    @Override // h0.AbstractC0113A
    public final void c(X x2, int i) {
        g gVar = (g) x2;
        final U0.e eVar = (U0.e) this.f940c.get(i);
        g1.d.e(eVar, "level");
        final h hVar = gVar.f939u;
        int e2 = a0.e(hVar.d.f800a.getInt("unlocked_level", 1), 1, 15);
        int i2 = eVar.f865a;
        final boolean z2 = i2 <= e2;
        T0.g gVar2 = gVar.f938t;
        TextView textView = (TextView) gVar2.f826c;
        MaterialCardView materialCardView = (MaterialCardView) gVar2.f824a;
        textView.setText(materialCardView.getContext().getString(R.string.level_number, Integer.valueOf(i2)));
        ((TextView) gVar2.f825b).setText(eVar.f866b);
        ((TextView) gVar2.d).setVisibility(z2 ? 8 : 0);
        materialCardView.setAlpha(z2 ? 1.0f : 0.5f);
        materialCardView.setEnabled(z2);
        materialCardView.setOnClickListener(new View.OnClickListener() { // from class: V0.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (z2) {
                    hVar.f941e.c(eVar);
                }
            }
        });
        materialCardView.setStrokeColor(z2 ? C.b.a(materialCardView.getContext(), R.color.piece_player) : C.b.a(materialCardView.getContext(), R.color.grid_line));
    }

    @Override // h0.AbstractC0113A
    public final X d(ViewGroup viewGroup) {
        g1.d.e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_level, viewGroup, false);
        int i = R.id.levelLabel;
        TextView textView = (TextView) C0227a.g(inflate, R.id.levelLabel);
        if (textView != null) {
            i = R.id.levelNumber;
            TextView textView2 = (TextView) C0227a.g(inflate, R.id.levelNumber);
            if (textView2 != null) {
                i = R.id.lockIcon;
                TextView textView3 = (TextView) C0227a.g(inflate, R.id.lockIcon);
                if (textView3 != null) {
                    return new g(this, new T0.g((MaterialCardView) inflate, textView, textView2, textView3));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
