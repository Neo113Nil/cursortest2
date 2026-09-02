package s2;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.oriondriftchasers.arordrft.R;
import f1.b1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d extends b1 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f3184u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f3185v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f3186w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f3187x;

    /* renamed from: y, reason: collision with root package name */
    public final Button f3188y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f3189z;

    public d(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.glider_emoji_text);
        f3.d.d(findViewById, "findViewById(...)");
        this.f3184u = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.glider_name_text);
        f3.d.d(findViewById2, "findViewById(...)");
        this.f3185v = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.glider_stats_text);
        f3.d.d(findViewById3, "findViewById(...)");
        this.f3186w = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.glider_price_text);
        f3.d.d(findViewById4, "findViewById(...)");
        this.f3187x = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.glider_action_button);
        f3.d.d(findViewById5, "findViewById(...)");
        this.f3188y = (Button) findViewById5;
        View findViewById6 = view.findViewById(R.id.glider_selected_indicator);
        f3.d.d(findViewById6, "findViewById(...)");
        this.f3189z = (TextView) findViewById6;
    }
}
