package com.facebook.ads.internal.view.e.c;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public class k extends com.facebook.ads.internal.view.e.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final com.facebook.ads.internal.j.f<com.facebook.ads.internal.view.e.b.l> f5773a;

    public k(Context context) {
        this(context, null);
    }

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public k(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5773a = new com.facebook.ads.internal.j.f<com.facebook.ads.internal.view.e.b.l>() { // from class: com.facebook.ads.internal.view.e.c.k.1
            @Override // com.facebook.ads.internal.j.f
            public Class<com.facebook.ads.internal.view.e.b.l> a() {
                return com.facebook.ads.internal.view.e.b.l.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.l lVar) {
                k.this.setVisibility(8);
            }
        };
        int applyDimension = (int) TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics());
        ProgressBar progressBar = new ProgressBar(getContext());
        progressBar.setIndeterminate(true);
        progressBar.getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(applyDimension, applyDimension);
        layoutParams.addRule(13);
        addView(progressBar, layoutParams);
    }

    @Override // com.facebook.ads.internal.view.e.a.c
    protected void a() {
        super.a();
        setVisibility(0);
        if (getVideoView() != null) {
            getVideoView().getEventBus().a((com.facebook.ads.internal.j.e<com.facebook.ads.internal.j.f, com.facebook.ads.internal.j.d>) this.f5773a);
        }
    }

    @Override // com.facebook.ads.internal.view.e.a.c
    protected void b() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().b((com.facebook.ads.internal.j.e<com.facebook.ads.internal.j.f, com.facebook.ads.internal.j.d>) this.f5773a);
        }
        setVisibility(8);
        super.b();
    }
}
