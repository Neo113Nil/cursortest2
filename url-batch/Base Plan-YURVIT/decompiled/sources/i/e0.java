package i;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2195a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f2196b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f2197c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f2198d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f2199e;

    public e0(View view) {
        this.f2195a = (TextView) view.findViewById(R.id.text1);
        this.f2196b = (TextView) view.findViewById(R.id.text2);
        this.f2197c = (ImageView) view.findViewById(R.id.icon1);
        this.f2198d = (ImageView) view.findViewById(R.id.icon2);
        this.f2199e = (ImageView) view.findViewById(com.crane.slab.beam.R.id.edit_query);
    }
}
