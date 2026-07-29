package com.facebook.ads.internal.view.d;

import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.component.f;

/* loaded from: classes.dex */
class d extends f {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f5633a;

    public d(Context context) {
        super(context);
        this.f5633a = new ImageView(context);
        this.f5633a.setAdjustViewBounds(true);
        addView(this.f5633a, new RelativeLayout.LayoutParams(-2, -1));
    }

    public void a(String str) {
        com.facebook.ads.internal.view.b.d dVar = new com.facebook.ads.internal.view.b.d(this.f5633a);
        dVar.a();
        dVar.a(str);
    }
}
