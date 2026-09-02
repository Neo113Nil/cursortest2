package s2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.oriondriftchasers.arordrft.R;
import f1.b1;
import f1.d0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b extends d0 {
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final List f3180e;

    public /* synthetic */ b(List list, int i) {
        this.d = i;
        this.f3180e = list;
    }

    @Override // f1.d0
    public final int a() {
        switch (this.d) {
            case 0:
                return this.f3180e.size();
            case 1:
                return this.f3180e.size();
            default:
                return ((ArrayList) this.f3180e).size();
        }
    }

    @Override // f1.d0
    public final void c(b1 b1Var, int i) {
        switch (this.d) {
            case 0:
                a aVar = (a) b1Var;
                y2.a aVar2 = (y2.a) this.f3180e.get(i);
                TextView textView = aVar.f3177u;
                textView.setText(aVar2.f3800a);
                TextView textView2 = aVar.f3178v;
                textView2.setText(aVar2.f3801b);
                TextView textView3 = aVar.f3179w;
                boolean z3 = aVar2.f3802c;
                textView3.setText(z3 ? "✅ Unlocked" : "🔒 Locked");
                aVar.f1309a.getContext();
                if (!z3) {
                    textView.setAlpha(0.5f);
                    textView2.setAlpha(0.5f);
                    break;
                } else {
                    textView.setAlpha(1.0f);
                    textView2.setAlpha(1.0f);
                    break;
                }
            case 1:
                i iVar = (i) b1Var;
                View view = iVar.f1309a;
                TextView textView4 = iVar.f3205z;
                y2.d dVar = (y2.d) this.f3180e.get(i);
                iVar.f3200u.setText(dVar.f3814b);
                iVar.f3201v.setText(dVar.f3815c);
                TextView textView5 = iVar.f3202w;
                int i4 = dVar.f3816e;
                int i5 = dVar.d;
                textView5.setText(i4 + " / " + i5);
                iVar.f3204y.setText("💰 " + dVar.f3817f + "  ✨ " + dVar.f3818g + " XP");
                int i6 = 100;
                int i7 = (int) ((((float) dVar.f3816e) / ((float) i5)) * ((float) 100));
                ProgressBar progressBar = iVar.f3203x;
                if (i7 < 0) {
                    i6 = 0;
                } else if (i7 <= 100) {
                    i6 = i7;
                }
                progressBar.setProgress(i6);
                textView4.setText(dVar.f3819h ? "✅ Completed" : "🔄 In Progress");
                textView4.setTextColor(dVar.f3819h ? view.getContext().getColor(R.color.success_green) : view.getContext().getColor(R.color.glider_cyan));
                break;
            default:
                m mVar = (m) b1Var;
                z2.c cVar = (z2.c) ((ArrayList) this.f3180e).get(i);
                String str = cVar.f3884f;
                int intValue = cVar.f3885g.intValue();
                int intValue2 = cVar.f3886h.intValue();
                mVar.f3215u.setText(str);
                mVar.f3216v.setText(intValue + " / " + intValue2);
                mVar.f3217w.setProgress(intValue2 > 0 ? (intValue * 100) / intValue2 : 0);
                break;
        }
    }

    @Override // f1.d0
    public final b1 d(ViewGroup viewGroup) {
        switch (this.d) {
            case 0:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_achievement, viewGroup, false);
                f3.d.b(inflate);
                return new a(inflate);
            case 1:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_mission, viewGroup, false);
                f3.d.b(inflate2);
                return new i(inflate2);
            default:
                View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_quiz_stat, viewGroup, false);
                f3.d.b(inflate3);
                return new m(inflate3);
        }
    }
}
