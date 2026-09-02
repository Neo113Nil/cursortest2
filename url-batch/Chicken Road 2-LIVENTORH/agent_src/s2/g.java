package s2;

import android.view.View;
import android.widget.TextView;
import com.oriondriftchasers.arordrft.R;
import f1.b1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class g extends b1 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f3196u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f3197v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f3198w;

    public g(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.chapter_title_text);
        f3.d.d(findViewById, "findViewById(...)");
        this.f3196u = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.chapter_content_text);
        f3.d.d(findViewById2, "findViewById(...)");
        this.f3197v = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.expand_indicator_text);
        f3.d.d(findViewById3, "findViewById(...)");
        this.f3198w = (TextView) findViewById3;
    }
}
