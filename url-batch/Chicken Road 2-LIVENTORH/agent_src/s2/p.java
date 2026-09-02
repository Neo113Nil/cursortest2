package s2;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.oriondriftchasers.arordrft.R;
import f1.b1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class p extends b1 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f3226u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f3227v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f3228w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f3229x;

    /* renamed from: y, reason: collision with root package name */
    public final Button f3230y;

    public p(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.shop_item_emoji_text);
        f3.d.d(findViewById, "findViewById(...)");
        this.f3226u = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.shop_item_name_text);
        f3.d.d(findViewById2, "findViewById(...)");
        this.f3227v = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.shop_item_description_text);
        f3.d.d(findViewById3, "findViewById(...)");
        this.f3228w = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.shop_item_price_text);
        f3.d.d(findViewById4, "findViewById(...)");
        this.f3229x = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.shop_item_buy_button);
        f3.d.d(findViewById5, "findViewById(...)");
        this.f3230y = (Button) findViewById5;
    }
}
