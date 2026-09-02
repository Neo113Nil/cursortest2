package w2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.k0;
import androidx.fragment.app.r0;
import androidx.fragment.app.u;
import com.google.android.material.card.MaterialCardView;
import com.oriondriftchasers.arordrft.R;
import java.util.Iterator;
import java.util.List;
import l2.m;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class j extends u {
    public m Y;

    public final void G() {
        u uVar = this.f554z;
        if (uVar != null) {
            k0 g4 = uVar.g();
            g4.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(g4);
            aVar.e(this);
            aVar.b(new r0(7, this));
            aVar.d(false);
        }
    }

    @Override // androidx.fragment.app.u
    public final View s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        f3.d.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_game_upgrades, viewGroup, false);
        int i = R.id.current_glider_card;
        if (((MaterialCardView) h.a.s(inflate, R.id.current_glider_card)) != null) {
            i = R.id.current_glider_name_text;
            TextView textView = (TextView) h.a.s(inflate, R.id.current_glider_name_text);
            if (textView != null) {
                i = R.id.durability_stats_text;
                TextView textView2 = (TextView) h.a.s(inflate, R.id.durability_stats_text);
                if (textView2 != null) {
                    i = R.id.durability_upgrade_card;
                    if (((MaterialCardView) h.a.s(inflate, R.id.durability_upgrade_card)) != null) {
                        i = R.id.durability_upgrade_cost_text;
                        TextView textView3 = (TextView) h.a.s(inflate, R.id.durability_upgrade_cost_text);
                        if (textView3 != null) {
                            i = R.id.handling_stats_text;
                            TextView textView4 = (TextView) h.a.s(inflate, R.id.handling_stats_text);
                            if (textView4 != null) {
                                i = R.id.handling_upgrade_card;
                                if (((MaterialCardView) h.a.s(inflate, R.id.handling_upgrade_card)) != null) {
                                    i = R.id.handling_upgrade_cost_text;
                                    TextView textView5 = (TextView) h.a.s(inflate, R.id.handling_upgrade_cost_text);
                                    if (textView5 != null) {
                                        i = R.id.overall_rating_text;
                                        TextView textView6 = (TextView) h.a.s(inflate, R.id.overall_rating_text);
                                        if (textView6 != null) {
                                            i = R.id.speed_stats_text;
                                            TextView textView7 = (TextView) h.a.s(inflate, R.id.speed_stats_text);
                                            if (textView7 != null) {
                                                i = R.id.speed_upgrade_card;
                                                if (((MaterialCardView) h.a.s(inflate, R.id.speed_upgrade_card)) != null) {
                                                    i = R.id.speed_upgrade_cost_text;
                                                    TextView textView8 = (TextView) h.a.s(inflate, R.id.speed_upgrade_cost_text);
                                                    if (textView8 != null) {
                                                        i = R.id.upgrade_durability_button;
                                                        Button button = (Button) h.a.s(inflate, R.id.upgrade_durability_button);
                                                        if (button != null) {
                                                            i = R.id.upgrade_handling_button;
                                                            Button button2 = (Button) h.a.s(inflate, R.id.upgrade_handling_button);
                                                            if (button2 != null) {
                                                                i = R.id.upgrade_speed_button;
                                                                Button button3 = (Button) h.a.s(inflate, R.id.upgrade_speed_button);
                                                                if (button3 != null) {
                                                                    i = R.id.upgrades_credits_balance_text;
                                                                    TextView textView9 = (TextView) h.a.s(inflate, R.id.upgrades_credits_balance_text);
                                                                    if (textView9 != null) {
                                                                        i = R.id.upgrades_header_layout;
                                                                        if (((LinearLayout) h.a.s(inflate, R.id.upgrades_header_layout)) != null) {
                                                                            ScrollView scrollView = (ScrollView) inflate;
                                                                            this.Y = new m(scrollView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, button, button2, button3, textView9);
                                                                            f3.d.d(scrollView, "getRoot(...)");
                                                                            return scrollView;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
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
        Object obj;
        f3.d.e(view, "view");
        final x2.a aVar = new x2.a(C(), 0);
        y2.e f2 = aVar.f();
        List e4 = t0.d.e();
        Iterator it = e4.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((y2.b) obj).f3803a == f2.f3823e) {
                    break;
                }
            }
        }
        final y2.b bVar = (y2.b) obj;
        if (bVar == null) {
            bVar = (y2.b) e4.get(0);
        }
        m mVar = this.Y;
        f3.d.b(mVar);
        ((TextView) mVar.f2627l).setText("💰 " + f2.f3820a);
        m mVar2 = this.Y;
        f3.d.b(mVar2);
        TextView textView = (TextView) mVar2.f2618a;
        String str = bVar.f3805c;
        int i = bVar.f3807f;
        int i4 = bVar.f3806e;
        int i5 = bVar.d;
        textView.setText(str + " " + bVar.f3804b);
        m mVar3 = this.Y;
        f3.d.b(mVar3);
        TextView textView2 = (TextView) mVar3.f2623g;
        int i6 = bVar.f3809h;
        textView2.setText("⚡ Speed: " + ((i6 * 5) + i5) + " (Lvl " + i6 + ")");
        m mVar4 = this.Y;
        f3.d.b(mVar4);
        TextView textView3 = (TextView) mVar4.d;
        int i7 = bVar.i;
        textView3.setText("🎯 Handling: " + ((i7 * 4) + i4) + " (Lvl " + i7 + ")");
        m mVar5 = this.Y;
        f3.d.b(mVar5);
        TextView textView4 = (TextView) mVar5.f2619b;
        int i8 = bVar.f3810j;
        textView4.setText("🛡️ Durability: " + ((i8 * 6) + i) + " (Lvl " + i8 + ")");
        m mVar6 = this.Y;
        f3.d.b(mVar6);
        ((TextView) mVar6.f2622f).setText("📊 Overall: " + ((((bVar.f3810j * 6) + i) + (((bVar.i * 4) + i4) + ((bVar.f3809h * 5) + i5))) / 3));
        m mVar7 = this.Y;
        f3.d.b(mVar7);
        ((TextView) mVar7.f2624h).setText("Cost: " + ((bVar.f3809h * 500) + 1000) + " credits");
        m mVar8 = this.Y;
        f3.d.b(mVar8);
        ((TextView) mVar8.f2621e).setText("Cost: " + ((bVar.i * 500) + 1000) + " credits");
        m mVar9 = this.Y;
        f3.d.b(mVar9);
        ((TextView) mVar9.f2620c).setText("Cost: " + ((bVar.f3810j * 500) + 1000) + " credits");
        m mVar10 = this.Y;
        f3.d.b(mVar10);
        final int i9 = 0;
        ((Button) mVar10.f2626k).setOnClickListener(new View.OnClickListener() { // from class: w2.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i9) {
                    case 0:
                        y2.b bVar2 = bVar;
                        boolean h4 = aVar.h((bVar2.f3809h * 500) + 1000);
                        j jVar = this;
                        if (!h4) {
                            Toast.makeText(jVar.h(), "❌ Not enough credits!", 0).show();
                            break;
                        } else {
                            bVar2.f3809h++;
                            Toast.makeText(jVar.h(), "⚡ Speed upgraded!", 0).show();
                            jVar.G();
                            break;
                        }
                    case 1:
                        y2.b bVar3 = bVar;
                        boolean h5 = aVar.h((bVar3.i * 500) + 1000);
                        j jVar2 = this;
                        if (!h5) {
                            Toast.makeText(jVar2.h(), "❌ Not enough credits!", 0).show();
                            break;
                        } else {
                            bVar3.i++;
                            Toast.makeText(jVar2.h(), "🎯 Handling upgraded!", 0).show();
                            jVar2.G();
                            break;
                        }
                    default:
                        y2.b bVar4 = bVar;
                        boolean h6 = aVar.h((bVar4.f3810j * 500) + 1000);
                        j jVar3 = this;
                        if (!h6) {
                            Toast.makeText(jVar3.h(), "❌ Not enough credits!", 0).show();
                            break;
                        } else {
                            bVar4.f3810j++;
                            Toast.makeText(jVar3.h(), "🛡️ Durability upgraded!", 0).show();
                            jVar3.G();
                            break;
                        }
                }
            }
        });
        m mVar11 = this.Y;
        f3.d.b(mVar11);
        final int i10 = 1;
        ((Button) mVar11.f2625j).setOnClickListener(new View.OnClickListener() { // from class: w2.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        y2.b bVar2 = bVar;
                        boolean h4 = aVar.h((bVar2.f3809h * 500) + 1000);
                        j jVar = this;
                        if (!h4) {
                            Toast.makeText(jVar.h(), "❌ Not enough credits!", 0).show();
                            break;
                        } else {
                            bVar2.f3809h++;
                            Toast.makeText(jVar.h(), "⚡ Speed upgraded!", 0).show();
                            jVar.G();
                            break;
                        }
                    case 1:
                        y2.b bVar3 = bVar;
                        boolean h5 = aVar.h((bVar3.i * 500) + 1000);
                        j jVar2 = this;
                        if (!h5) {
                            Toast.makeText(jVar2.h(), "❌ Not enough credits!", 0).show();
                            break;
                        } else {
                            bVar3.i++;
                            Toast.makeText(jVar2.h(), "🎯 Handling upgraded!", 0).show();
                            jVar2.G();
                            break;
                        }
                    default:
                        y2.b bVar4 = bVar;
                        boolean h6 = aVar.h((bVar4.f3810j * 500) + 1000);
                        j jVar3 = this;
                        if (!h6) {
                            Toast.makeText(jVar3.h(), "❌ Not enough credits!", 0).show();
                            break;
                        } else {
                            bVar4.f3810j++;
                            Toast.makeText(jVar3.h(), "🛡️ Durability upgraded!", 0).show();
                            jVar3.G();
                            break;
                        }
                }
            }
        });
        m mVar12 = this.Y;
        f3.d.b(mVar12);
        final int i11 = 2;
        ((Button) mVar12.i).setOnClickListener(new View.OnClickListener() { // from class: w2.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        y2.b bVar2 = bVar;
                        boolean h4 = aVar.h((bVar2.f3809h * 500) + 1000);
                        j jVar = this;
                        if (!h4) {
                            Toast.makeText(jVar.h(), "❌ Not enough credits!", 0).show();
                            break;
                        } else {
                            bVar2.f3809h++;
                            Toast.makeText(jVar.h(), "⚡ Speed upgraded!", 0).show();
                            jVar.G();
                            break;
                        }
                    case 1:
                        y2.b bVar3 = bVar;
                        boolean h5 = aVar.h((bVar3.i * 500) + 1000);
                        j jVar2 = this;
                        if (!h5) {
                            Toast.makeText(jVar2.h(), "❌ Not enough credits!", 0).show();
                            break;
                        } else {
                            bVar3.i++;
                            Toast.makeText(jVar2.h(), "🎯 Handling upgraded!", 0).show();
                            jVar2.G();
                            break;
                        }
                    default:
                        y2.b bVar4 = bVar;
                        boolean h6 = aVar.h((bVar4.f3810j * 500) + 1000);
                        j jVar3 = this;
                        if (!h6) {
                            Toast.makeText(jVar3.h(), "❌ Not enough credits!", 0).show();
                            break;
                        } else {
                            bVar4.f3810j++;
                            Toast.makeText(jVar3.h(), "🛡️ Durability upgraded!", 0).show();
                            jVar3.G();
                            break;
                        }
                }
            }
        });
    }
}
