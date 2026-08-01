package s2;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.oriondriftchasers.arordrft.R;
import f1.b1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class m extends b1 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f3215u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f3216v;

    /* renamed from: w, reason: collision with root package name */
    public final ProgressBar f3217w;

    public m(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.quiz_stat_title_text);
        f3.d.d(findViewById, "findViewById(...)");
        this.f3215u = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.quiz_stat_score_text);
        f3.d.d(findViewById2, "findViewById(...)");
        this.f3216v = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.quiz_stat_progress_bar);
        f3.d.d(findViewById3, "findViewById(...)");
        this.f3217w = (ProgressBar) findViewById3;
    }
}
