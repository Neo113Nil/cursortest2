package T0;

import V0.q;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.winworm.neongrid.R;
import g0.AbstractC0112B;
import g0.a0;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends AbstractC0112B {
    public final h d;

    /* renamed from: e, reason: collision with root package name */
    public int f835e = 1;

    /* renamed from: f, reason: collision with root package name */
    public Object f836f = q.f918a;

    public f(h hVar) {
        this.d = hVar;
    }

    @Override // g0.AbstractC0112B
    public final int a() {
        return 12;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Map] */
    @Override // g0.AbstractC0112B
    public final void c(a0 a0Var, int i) {
        e eVar = (e) a0Var;
        int i2 = i + 1;
        H.e eVar2 = eVar.f833u;
        Context context = ((LinearLayout) eVar2.f277b).getContext();
        f fVar = eVar.f834v;
        boolean z2 = i2 <= fVar.f835e;
        List list = S0.b.f767a;
        S0.d dVar = (S0.d) list.get(i0.g.e(i, 0, V0.h.v0(list)));
        ((TextView) eVar2.f280f).setText(context.getString(R.string.level_item, Integer.valueOf(i2)));
        Integer num = (Integer) fVar.f836f.get(Integer.valueOf(i2));
        ((TextView) eVar2.f278c).setText(context.getString(R.string.best_score, Integer.valueOf(num != null ? num.intValue() : 0)));
        TextView textView = (TextView) eVar2.f279e;
        ImageView imageView = (ImageView) eVar2.d;
        LinearLayout linearLayout = (LinearLayout) eVar2.f277b;
        if (!z2) {
            linearLayout.setBackground(A.a.b(context, R.drawable.bg_level_item_locked));
            imageView.setImageResource(R.drawable.ic_level_lock);
            textView.setText(context.getString(R.string.level_locked));
            linearLayout.setAlpha(0.7f);
            linearLayout.setOnClickListener(null);
            return;
        }
        linearLayout.setBackground(A.a.b(context, R.drawable.bg_level_item));
        imageView.setImageResource(R.drawable.ic_level_star);
        textView.setText(dVar.f774c + " food");
        linearLayout.setAlpha(1.0f);
        linearLayout.setOnClickListener(new i(fVar, i2, 2));
    }

    @Override // g0.AbstractC0112B
    public final a0 d(ViewGroup viewGroup) {
        g1.d.e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_level, viewGroup, false);
        int i = R.id.levelBestScore;
        TextView textView = (TextView) i0.g.h(inflate, R.id.levelBestScore);
        if (textView != null) {
            i = R.id.levelIcon;
            ImageView imageView = (ImageView) i0.g.h(inflate, R.id.levelIcon);
            if (imageView != null) {
                i = R.id.levelStatus;
                TextView textView2 = (TextView) i0.g.h(inflate, R.id.levelStatus);
                if (textView2 != null) {
                    i = R.id.levelTitle;
                    TextView textView3 = (TextView) i0.g.h(inflate, R.id.levelTitle);
                    if (textView3 != null) {
                        return new e(this, new H.e((LinearLayout) inflate, textView, imageView, textView2, textView3));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
