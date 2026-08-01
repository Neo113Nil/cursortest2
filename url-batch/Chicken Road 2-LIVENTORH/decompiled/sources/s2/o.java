package s2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.oriondriftchasers.arordrft.R;
import f1.b1;
import f1.d0;
import java.util.List;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class o extends d0 {
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3224e;

    /* renamed from: f, reason: collision with root package name */
    public final w2.f f3225f;

    public o(List list, int i, w2.f fVar) {
        this.d = list;
        this.f3224e = i;
        this.f3225f = fVar;
    }

    @Override // f1.d0
    public final int a() {
        return this.d.size();
    }

    @Override // f1.d0
    public final void c(b1 b1Var, int i) {
        n nVar = (n) b1Var;
        Button button = nVar.A;
        y2.i iVar = (y2.i) this.d.get(i);
        boolean z3 = this.f3224e >= iVar.f3838e;
        nVar.f3218u.setText(iVar.f3837c);
        nVar.f3219v.setText(iVar.f3836b);
        nVar.f3220w.setText("Difficulty: ".concat(iVar.d));
        nVar.f3221x.setText("Entry: " + iVar.f3839f + " credits");
        nVar.f3222y.setText("Reward: " + iVar.f3840g + " credits, " + iVar.f3841h + " XP");
        nVar.f3223z.setText("Level " + iVar.f3838e + " required");
        button.setEnabled(z3);
        button.setText(z3 ? "Start Race" : "🔒 Locked");
        button.setOnClickListener(new f(z3, this, iVar));
        nVar.f1309a.setAlpha(z3 ? 1.0f : 0.6f);
    }

    @Override // f1.d0
    public final b1 d(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_race_track, viewGroup, false);
        f3.d.b(inflate);
        return new n(inflate);
    }
}
