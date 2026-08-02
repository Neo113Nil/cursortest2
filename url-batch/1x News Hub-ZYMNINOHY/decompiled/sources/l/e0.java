package l;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f9787a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f9788b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f9789c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f9790d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f9791e;

    public e0(View view) {
        this.f9787a = (TextView) view.findViewById(R.id.text1);
        this.f9788b = (TextView) view.findViewById(R.id.text2);
        this.f9789c = (ImageView) view.findViewById(R.id.icon1);
        this.f9790d = (ImageView) view.findViewById(R.id.icon2);
        this.f9791e = (ImageView) view.findViewById(com.fc.barca.football.R.id.edit_query);
    }
}
