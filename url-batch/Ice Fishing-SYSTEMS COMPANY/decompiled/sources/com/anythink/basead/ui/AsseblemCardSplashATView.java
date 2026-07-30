package com.anythink.basead.ui;

import D.y;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.basead.ui.BaseShakeView;
import com.anythink.basead.ui.f.d;
import com.anythink.core.common.a.b;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.g;
import com.anythink.core.common.v.h;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class AsseblemCardSplashATView extends BaseNewStyleSDKSplashATView {

    /* renamed from: a, reason: collision with root package name */
    protected TextView f9823a;
    private SplashShakeTextHintView ad;
    private ImageView ae;

    /* renamed from: b, reason: collision with root package name */
    protected TextView f9824b;

    /* renamed from: c, reason: collision with root package name */
    protected TextView f9825c;

    /* renamed from: d, reason: collision with root package name */
    protected RoundImageView f9826d;

    public AsseblemCardSplashATView(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.BaseSdkSplashATView
    public final void b() {
        this.f9823a = (TextView) findViewById(q.a(getContext(), "myoffer_splash_ad_title", "id"));
        this.f9824b = (TextView) findViewById(q.a(getContext(), "myoffer_splash_desc", "id"));
        this.f9825c = (TextView) findViewById(q.a(getContext(), "myoffer_splash_cta_text", "id"));
        this.f9826d = (RoundImageView) findViewById(q.a(getContext(), "myoffer_splash_icon", "id"));
        this.f9902q = findViewById(q.a(getContext(), "myoffer_splash_ad_cta_layout", "id"));
        this.ad = (SplashShakeTextHintView) findViewById(q.a(getContext(), "myoffer_splash_cta_shake", "id"));
        this.ae = (ImageView) findViewById(q.a(getContext(), "myoffer_splash_ambience_bg", "id"));
        if (TextUtils.isEmpty(this.f9893g.z())) {
            am.a(this.f9826d, 0, 0);
        } else {
            this.f9826d.setVisibility(0);
            this.f9826d.setNeedRadiu(true);
            this.f9826d.setRadiusInDip(12);
            int i = this.f9826d.getLayoutParams().width;
            com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f9893g.z()), i, i, new b.a() { // from class: com.anythink.basead.ui.AsseblemCardSplashATView.2
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (TextUtils.equals(str, AsseblemCardSplashATView.this.f9893g.z())) {
                        AsseblemCardSplashATView.this.f9826d.setImageBitmap(bitmap);
                    }
                }
            });
        }
        if (TextUtils.isEmpty(this.f9893g.x())) {
            am.a(this.f9823a, 0, 0);
        } else {
            this.f9823a.setText(this.f9893g.x());
            this.f9823a.setVisibility(0);
        }
        if (this.f9824b != null) {
            if (TextUtils.isEmpty(this.f9893g.y())) {
                this.f9824b.setVisibility(8);
            } else {
                this.f9824b.setText(this.f9893g.y());
            }
        }
        View view = this.f9902q;
        if (view != null) {
            this.f9899n.add(view);
        }
        if (n()) {
            TextView textView = this.f9825c;
            if (textView != null) {
                textView.setVisibility(8);
            }
            SplashShakeTextHintView splashShakeTextHintView = this.ad;
            if (splashShakeTextHintView != null) {
                if (((BaseNewStyleSDKSplashATView) this).f9994A > ((BaseNewStyleSDKSplashATView) this).f9995B) {
                    splashShakeTextHintView.setTextSize(17);
                }
                this.ad.setVisibility(0);
                this.ad.setShakeSetting(this.f9892f.f14325o, this.f9893g.K());
                this.ad.setOnShakeListener(new BaseShakeView.a() { // from class: com.anythink.basead.ui.AsseblemCardSplashATView.3
                    @Override // com.anythink.basead.ui.BaseShakeView.a
                    public final boolean a() {
                        if (!AsseblemCardSplashATView.this.C()) {
                            return false;
                        }
                        AsseblemCardSplashATView.this.a(4, 5);
                        return true;
                    }
                }, this.f9892f.f14325o);
            }
        } else {
            if (this.f9825c != null && ((BaseNewStyleSDKSplashATView) this).f9994A > ((BaseNewStyleSDKSplashATView) this).f9995B) {
                if (TextUtils.isEmpty(this.f9893g.D())) {
                    this.f9825c.setText(com.anythink.basead.b.e.a(getContext(), this.f9893g));
                } else {
                    this.f9825c.setText(this.f9893g.D());
                }
            }
            SplashShakeTextHintView splashShakeTextHintView2 = this.ad;
            if (splashShakeTextHintView2 != null) {
                splashShakeTextHintView2.setVisibility(8);
            }
        }
        if (this.ae != null) {
            String a9 = g.a().a(b.d.f12281j);
            if (TextUtils.isEmpty(a9)) {
                return;
            }
            y.f().a(new e(3, a9), new b.a() { // from class: com.anythink.basead.ui.AsseblemCardSplashATView.4
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (AsseblemCardSplashATView.this.ae != null) {
                        AsseblemCardSplashATView.this.ae.setImageBitmap(bitmap);
                    }
                }
            });
        }
    }

    @Override // com.anythink.basead.ui.BaseSdkSplashATView
    public final void c() {
        super.c();
        final FrameLayout frameLayout = (FrameLayout) findViewById(q.a(getContext(), "myoffer_splash_ad_content_image_area", "id"));
        final RoundImageView roundImageView = (RoundImageView) findViewById(q.a(getContext(), "myoffer_splash_bg", "id"));
        frameLayout.removeAllViews();
        final WrapRoundImageView wrapRoundImageView = new WrapRoundImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        wrapRoundImageView.setLayoutParams(layoutParams);
        wrapRoundImageView.setNeedRadiu(false);
        wrapRoundImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        wrapRoundImageView.setVisibility(4);
        frameLayout.addView(wrapRoundImageView, layoutParams);
        frameLayout.setVisibility(0);
        roundImageView.setNeedRadiu(false);
        roundImageView.setVisibility(0);
        if (TextUtils.isEmpty(this.f9893g.B())) {
            roundImageView.setBackgroundColor(Color.parseColor("#EFEFEF"));
            return;
        }
        com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f9893g.B()), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new b.a() { // from class: com.anythink.basead.ui.AsseblemCardSplashATView.5
            @Override // com.anythink.core.common.res.b.a
            public final void onFail(String str, String str2) {
            }

            @Override // com.anythink.core.common.res.b.a
            public final void onSuccess(String str, final Bitmap bitmap) {
                if (TextUtils.equals(str, AsseblemCardSplashATView.this.f9893g.B())) {
                    frameLayout.post(new Runnable() { // from class: com.anythink.basead.ui.AsseblemCardSplashATView.5.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                            wrapRoundImageView.setBitmapAndResize(bitmap, frameLayout.getWidth(), frameLayout.getHeight());
                            wrapRoundImageView.setVisibility(0);
                        }
                    });
                    h.a(AsseblemCardSplashATView.this.getContext(), bitmap, new h.a() { // from class: com.anythink.basead.ui.AsseblemCardSplashATView.5.2
                        @Override // com.anythink.core.common.v.h.a
                        public final void a() {
                        }

                        @Override // com.anythink.core.common.v.h.a
                        public final void a(Bitmap bitmap2) {
                            roundImageView.setImageBitmap(bitmap2);
                        }
                    });
                }
            }
        });
        if (this.f9892f.f14325o.J() != 1) {
            this.f9899n.add(wrapRoundImageView);
        }
    }

    @Override // com.anythink.basead.ui.BaseSdkSplashATView
    public final void d() {
        super.a(this.f9892f.f14325o.ab() < 0 ? 100 : this.f9892f.f14325o.ab(), new Runnable() { // from class: com.anythink.basead.ui.AsseblemCardSplashATView.6
            @Override // java.lang.Runnable
            public final void run() {
                AsseblemCardSplashATView asseblemCardSplashATView = AsseblemCardSplashATView.this;
                if (asseblemCardSplashATView.f10098O == null) {
                    return;
                }
                asseblemCardSplashATView.j();
            }
        });
    }

    public AsseblemCardSplashATView(Context context, x xVar, w wVar, com.anythink.basead.g.a aVar) {
        super(context, xVar, wVar, aVar);
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void a() {
        View inflate;
        if (((BaseNewStyleSDKSplashATView) this).f9994A > ((BaseNewStyleSDKSplashATView) this).f9995B) {
            inflate = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_splash_ad_layout_asseblem_card_horizontal", "layout"), this);
        } else {
            inflate = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_splash_ad_layout_asseblem_card_vertical", "layout"), this);
        }
        w();
        d dVar = this.f10103T;
        if (dVar != null) {
            dVar.a(d.f10958c).a(new com.anythink.basead.ui.d.a() { // from class: com.anythink.basead.ui.AsseblemCardSplashATView.1
                @Override // com.anythink.basead.ui.d.a
                public final void a(int i, int i4) {
                    AsseblemCardSplashATView.this.a(i, i4);
                }
            }).a(getContext(), inflate);
        }
    }
}
