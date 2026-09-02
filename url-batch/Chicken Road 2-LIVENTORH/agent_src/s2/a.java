package s2;

import android.view.View;
import android.widget.TextView;
import com.oriondriftchasers.arordrft.R;
import f1.b1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a extends b1 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f3177u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f3178v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f3179w;

    public a(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.achievement_title_text);
        f3.d.d(findViewById, "findViewById(...)");
        this.f3177u = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.achievement_description_text);
        f3.d.d(findViewById2, "findViewById(...)");
        this.f3178v = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.achievement_status_text);
        f3.d.d(findViewById3, "findViewById(...)");
        this.f3179w = (TextView) findViewById3;
    }
}
