package com.facebook.ads.internal.view.e.c;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public class g extends com.facebook.ads.internal.view.e.a.c implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f5741a;

    /* renamed from: b, reason: collision with root package name */
    private final com.facebook.ads.internal.j.f<com.facebook.ads.internal.view.e.b.j> f5742b;

    /* renamed from: c, reason: collision with root package name */
    private final com.facebook.ads.internal.j.f<com.facebook.ads.internal.view.e.b.b> f5743c;

    public g(Context context) {
        super(context);
        this.f5742b = new com.facebook.ads.internal.j.f<com.facebook.ads.internal.view.e.b.j>() { // from class: com.facebook.ads.internal.view.e.c.g.1
            @Override // com.facebook.ads.internal.j.f
            public Class<com.facebook.ads.internal.view.e.b.j> a() {
                return com.facebook.ads.internal.view.e.b.j.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.j jVar) {
                g.this.setVisibility(8);
            }
        };
        this.f5743c = new com.facebook.ads.internal.j.f<com.facebook.ads.internal.view.e.b.b>() { // from class: com.facebook.ads.internal.view.e.c.g.2
            @Override // com.facebook.ads.internal.j.f
            public Class<com.facebook.ads.internal.view.e.b.b> a() {
                return com.facebook.ads.internal.view.e.b.b.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.b bVar) {
                g.this.setVisibility(0);
            }
        };
        this.f5741a = new ImageView(context);
        this.f5741a.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f5741a.setBackgroundColor(-16777216);
        this.f5741a.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(this.f5741a);
    }

    @Override // com.facebook.ads.internal.view.e.a.c
    protected void a() {
        super.a();
        if (getVideoView() != null) {
            getVideoView().getEventBus().a(this.f5742b, this.f5743c);
            getVideoView().addOnLayoutChangeListener(this);
        }
    }

    @Override // com.facebook.ads.internal.view.e.a.c
    protected void b() {
        if (getVideoView() != null) {
            getVideoView().removeOnLayoutChangeListener(this);
            getVideoView().getEventBus().b(this.f5743c, this.f5742b);
        }
        super.b();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
        int i9 = i4 - i2;
        int i10 = i3 - i;
        if (layoutParams.height == i9 && layoutParams.width == i10 && layoutParams.topMargin == i2 && layoutParams.leftMargin == i) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i10, i9);
        layoutParams2.topMargin = i2;
        layoutParams2.leftMargin = i;
        this.f5741a.setLayoutParams(new RelativeLayout.LayoutParams(i10, i9));
        setLayoutParams(layoutParams2);
    }

    public void setImage(String str) {
        if (str == null) {
            setVisibility(8);
        } else {
            setVisibility(0);
            new com.facebook.ads.internal.view.b.d(this.f5741a).a().a(str);
        }
    }
}
