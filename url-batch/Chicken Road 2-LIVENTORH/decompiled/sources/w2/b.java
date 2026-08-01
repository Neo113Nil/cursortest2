package w2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.u;
import com.google.android.material.card.MaterialCardView;
import com.oriondriftchasers.arordrft.R;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b extends u {
    public u2.b Y;

    public final void G(x2.a aVar) {
        y2.e f2 = aVar.f();
        u2.b bVar = this.Y;
        f3.d.b(bVar);
        bVar.f3357b.setText("💰 Credits: " + f2.f3820a);
        u2.b bVar2 = this.Y;
        f3.d.b(bVar2);
        bVar2.f3360f.setText("⭐ Level: " + f2.f3822c);
        u2.b bVar3 = this.Y;
        f3.d.b(bVar3);
        bVar3.f3358c.setText("✨ Experience: " + f2.f3821b + "/" + (f2.f3822c * 100));
        u2.b bVar4 = this.Y;
        f3.d.b(bVar4);
        bVar4.f3359e.setText("🚀 Owned Gliders: " + f2.d.size() + "/7");
        u2.b bVar5 = this.Y;
        f3.d.b(bVar5);
        bVar5.f3356a.setText("🏁 Races Completed: " + f2.f3824f);
        u2.b bVar6 = this.Y;
        f3.d.b(bVar6);
        bVar6.f3362h.setText("🏆 Total Wins: " + f2.f3825g);
        int i = f2.f3822c * 100;
        int i4 = i > 0 ? (int) ((f2.f3821b / i) * 100) : 0;
        u2.b bVar7 = this.Y;
        f3.d.b(bVar7);
        bVar7.d.setProgress(i4);
    }

    @Override // androidx.fragment.app.u
    public final View s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        f3.d.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_game_dashboard, viewGroup, false);
        int i = R.id.completed_races_text;
        TextView textView = (TextView) h.a.s(inflate, R.id.completed_races_text);
        if (textView != null) {
            i = R.id.credits_balance_text;
            TextView textView2 = (TextView) h.a.s(inflate, R.id.credits_balance_text);
            if (textView2 != null) {
                i = R.id.dashboard_title_text;
                if (((TextView) h.a.s(inflate, R.id.dashboard_title_text)) != null) {
                    i = R.id.experience_points_text;
                    TextView textView3 = (TextView) h.a.s(inflate, R.id.experience_points_text);
                    if (textView3 != null) {
                        i = R.id.experience_progress_bar;
                        ProgressBar progressBar = (ProgressBar) h.a.s(inflate, R.id.experience_progress_bar);
                        if (progressBar != null) {
                            i = R.id.owned_gliders_count_text;
                            TextView textView4 = (TextView) h.a.s(inflate, R.id.owned_gliders_count_text);
                            if (textView4 != null) {
                                i = R.id.player_level_text;
                                TextView textView5 = (TextView) h.a.s(inflate, R.id.player_level_text);
                                if (textView5 != null) {
                                    i = R.id.player_stats_card;
                                    if (((MaterialCardView) h.a.s(inflate, R.id.player_stats_card)) != null) {
                                        i = R.id.quick_tips_card;
                                        if (((MaterialCardView) h.a.s(inflate, R.id.quick_tips_card)) != null) {
                                            i = R.id.reset_game_button;
                                            Button button = (Button) h.a.s(inflate, R.id.reset_game_button);
                                            if (button != null) {
                                                i = R.id.total_wins_text;
                                                TextView textView6 = (TextView) h.a.s(inflate, R.id.total_wins_text);
                                                if (textView6 != null) {
                                                    ScrollView scrollView = (ScrollView) inflate;
                                                    this.Y = new u2.b(scrollView, textView, textView2, textView3, progressBar, textView4, textView5, button, textView6);
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
        G(aVar);
        u2.b bVar = this.Y;
        f3.d.b(bVar);
        bVar.f3361g.setOnClickListener(new s2.j(this, aVar, 2));
    }
}
