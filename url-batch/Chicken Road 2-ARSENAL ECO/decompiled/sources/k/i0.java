package k;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f5024a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f5025b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f5026c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f5027d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f5028e;

    public i0(View view) {
        this.f5024a = (TextView) view.findViewById(R.id.text1);
        this.f5025b = (TextView) view.findViewById(R.id.text2);
        this.f5026c = (ImageView) view.findViewById(R.id.icon1);
        this.f5027d = (ImageView) view.findViewById(R.id.icon2);
        this.f5028e = (ImageView) view.findViewById(com.strategylink.Row.Five.R.id.edit_query);
    }
}
