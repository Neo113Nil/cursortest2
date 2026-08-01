package s2;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.oriondriftchasers.arordrft.R;
import f1.b1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class i extends b1 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f3200u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f3201v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f3202w;

    /* renamed from: x, reason: collision with root package name */
    public final ProgressBar f3203x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f3204y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f3205z;

    public i(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.mission_title_text);
        f3.d.d(findViewById, "findViewById(...)");
        this.f3200u = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.mission_description_text);
        f3.d.d(findViewById2, "findViewById(...)");
        this.f3201v = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.mission_progress_text);
        f3.d.d(findViewById3, "findViewById(...)");
        this.f3202w = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.mission_progress_bar);
        f3.d.d(findViewById4, "findViewById(...)");
        this.f3203x = (ProgressBar) findViewById4;
        View findViewById5 = view.findViewById(R.id.mission_rewards_text);
        f3.d.d(findViewById5, "findViewById(...)");
        this.f3204y = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.mission_status_text);
        f3.d.d(findViewById6, "findViewById(...)");
        this.f3205z = (TextView) findViewById6;
    }
}
