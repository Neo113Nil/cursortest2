package s2;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.oriondriftchasers.arordrft.R;
import f1.b1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class n extends b1 {
    public final Button A;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f3218u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f3219v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f3220w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f3221x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f3222y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f3223z;

    public n(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.race_emoji_text);
        f3.d.d(findViewById, "findViewById(...)");
        this.f3218u = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.race_name_text);
        f3.d.d(findViewById2, "findViewById(...)");
        this.f3219v = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.race_difficulty_text);
        f3.d.d(findViewById3, "findViewById(...)");
        this.f3220w = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.race_entry_fee_text);
        f3.d.d(findViewById4, "findViewById(...)");
        this.f3221x = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.race_rewards_text);
        f3.d.d(findViewById5, "findViewById(...)");
        this.f3222y = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.race_level_required_text);
        f3.d.d(findViewById6, "findViewById(...)");
        this.f3223z = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.race_start_button);
        f3.d.d(findViewById7, "findViewById(...)");
        this.A = (Button) findViewById7;
    }
}
