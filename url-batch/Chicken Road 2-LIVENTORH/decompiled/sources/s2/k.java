package s2;

import android.view.View;
import android.widget.TextView;
import com.oriondriftchasers.arordrft.R;
import f1.b1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class k extends b1 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f3209u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f3210v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f3211w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f3212x;

    public k(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.quiz_emoji_text);
        f3.d.d(findViewById, "findViewById(...)");
        this.f3209u = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.quiz_title_text);
        f3.d.d(findViewById2, "findViewById(...)");
        this.f3210v = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.quiz_questions_count_text);
        f3.d.d(findViewById3, "findViewById(...)");
        this.f3211w = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.quiz_best_score_text);
        f3.d.d(findViewById4, "findViewById(...)");
        this.f3212x = (TextView) findViewById4;
    }
}
