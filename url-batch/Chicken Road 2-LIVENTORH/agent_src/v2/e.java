package v2;

import a0.j;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.oriondriftchasers.arordrft.R;
import java.util.ArrayList;
import java.util.List;
import y2.h;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e extends u {
    public j Y;

    @Override // androidx.fragment.app.u
    public final View s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        f3.d.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_stats_progress, viewGroup, false);
        int i = R.id.achievements_header_text;
        if (((TextView) h.a.s(inflate, R.id.achievements_header_text)) != null) {
            i = R.id.achievements_recycler_view;
            RecyclerView recyclerView = (RecyclerView) h.a.s(inflate, R.id.achievements_recycler_view);
            if (recyclerView != null) {
                i = R.id.overall_stats_card;
                if (((MaterialCardView) h.a.s(inflate, R.id.overall_stats_card)) != null) {
                    i = R.id.quiz_progress_header;
                    if (((TextView) h.a.s(inflate, R.id.quiz_progress_header)) != null) {
                        i = R.id.quiz_stats_recycler_view;
                        RecyclerView recyclerView2 = (RecyclerView) h.a.s(inflate, R.id.quiz_stats_recycler_view);
                        if (recyclerView2 != null) {
                            i = R.id.stats_title_header;
                            if (((TextView) h.a.s(inflate, R.id.stats_title_header)) != null) {
                                i = R.id.total_correct_answers_text;
                                TextView textView = (TextView) h.a.s(inflate, R.id.total_correct_answers_text);
                                if (textView != null) {
                                    i = R.id.total_quizzes_completed_text;
                                    TextView textView2 = (TextView) h.a.s(inflate, R.id.total_quizzes_completed_text);
                                    if (textView2 != null) {
                                        ScrollView scrollView = (ScrollView) inflate;
                                        this.Y = new j(scrollView, recyclerView, recyclerView2, textView, textView2);
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
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // androidx.fragment.app.u
    public final void t() {
        this.H = true;
        this.Y = null;
    }

    @Override // androidx.fragment.app.u
    public final void z(View view, Bundle bundle) {
        boolean z3;
        f3.d.e(view, "view");
        x2.a aVar = new x2.a(C(), 1);
        List<y2.f> f2 = t0.d.f();
        int e4 = aVar.e();
        ArrayList b4 = aVar.b();
        int size = b4.size();
        int i = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = b4.get(i4);
            i4++;
            i += ((h) obj).f3834c;
        }
        j jVar = this.Y;
        f3.d.b(jVar);
        ((TextView) jVar.i).setText("🎯 Quizzes Completed: " + e4 + "/" + f2.size());
        j jVar2 = this.Y;
        f3.d.b(jVar2);
        ((TextView) jVar2.f102h).setText("✅ Total Correct: " + i);
        ArrayList arrayList = new ArrayList(a3.g.X(f2));
        for (y2.f fVar : f2) {
            arrayList.add(new z2.c(fVar.f3827b, Integer.valueOf(aVar.d(fVar.f3826a)), Integer.valueOf(fVar.d.size())));
        }
        j jVar3 = this.Y;
        f3.d.b(jVar3);
        ((RecyclerView) jVar3.f101g).setLayoutManager(new LinearLayoutManager(1));
        j jVar4 = this.Y;
        f3.d.b(jVar4);
        ((RecyclerView) jVar4.f101g).setAdapter(new s2.b(arrayList, 2));
        int size2 = f2.size();
        int e5 = aVar.e();
        ArrayList b5 = aVar.b();
        int size3 = b5.size();
        int i5 = 0;
        int i6 = 0;
        while (i6 < size3) {
            Object obj2 = b5.get(i6);
            i6++;
            i5 += ((h) obj2).f3834c;
        }
        y2.a aVar2 = new y2.a("🚀 Rookie Pilot", "Complete your first quiz", e5 >= 1);
        y2.a aVar3 = new y2.a("📚 Knowledge Seeker", "Complete 3 quizzes", e5 >= 3);
        y2.a aVar4 = new y2.a("🎓 Expert Navigator", "Complete all quizzes", e5 >= size2);
        ArrayList b6 = aVar.b();
        if (!b6.isEmpty()) {
            int size4 = b6.size();
            int i7 = 0;
            while (i7 < size4) {
                Object obj3 = b6.get(i7);
                i7++;
                h hVar = (h) obj3;
                if (hVar.f3834c == hVar.f3833b) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        List W = a3.f.W(aVar2, aVar3, aVar4, new y2.a("💯 Perfectionist", "Score 100% on any quiz", z3), new y2.a("🏆 Quiz Master", "Answer 100+ questions correctly", i5 >= 100), new y2.a("⭐ Dedicated Student", "Answer 50+ questions correctly", i5 >= 50), new y2.a("🎯 Sharp Mind", "Answer 25+ questions correctly", i5 >= 25), new y2.a("🌟 Rising Star", "Complete 2 quizzes", e5 >= 2));
        j jVar5 = this.Y;
        f3.d.b(jVar5);
        ((RecyclerView) jVar5.f100f).setLayoutManager(new LinearLayoutManager(1));
        j jVar6 = this.Y;
        f3.d.b(jVar6);
        ((RecyclerView) jVar6.f100f).setAdapter(new s2.b(W, 0));
    }
}
