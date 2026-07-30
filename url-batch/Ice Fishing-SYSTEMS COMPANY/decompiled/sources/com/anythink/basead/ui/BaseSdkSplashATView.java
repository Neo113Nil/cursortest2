package com.anythink.basead.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.d.f;
import com.anythink.basead.d.j;
import com.anythink.basead.ui.BaseEndCardView;
import com.anythink.basead.ui.animplayerview.BasePlayerView;
import com.anythink.basead.ui.component.a;
import com.anythink.core.api.ATSDKGlobalSetting;
import com.anythink.core.common.h.ay;
import com.anythink.core.common.h.ba;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.res.b;
import com.anythink.core.common.u.e;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.q;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BaseSdkSplashATView extends BaseSplashATView {
    public static final int TYPE_ASSEBLEM = 1;
    public static final int TYPE_SINGLE_PICTURE = 0;

    /* renamed from: C, reason: collision with root package name */
    protected RoundImageView f10044C;

    /* renamed from: D, reason: collision with root package name */
    protected MuteImageView f10045D;

    /* renamed from: E, reason: collision with root package name */
    ImageView f10046E;

    /* renamed from: F, reason: collision with root package name */
    ImageView f10047F;

    /* renamed from: G, reason: collision with root package name */
    protected final View.OnClickListener f10048G;

    /* renamed from: H, reason: collision with root package name */
    protected boolean f10049H;

    /* renamed from: a, reason: collision with root package name */
    private SplashEndCardView f10050a;

    /* renamed from: b, reason: collision with root package name */
    private ValueAnimator f10051b;

    /* renamed from: com.anythink.basead.ui.BaseSdkSplashATView$5, reason: invalid class name */
    public class AnonymousClass5 implements a.InterfaceC0055a {
        public AnonymousClass5() {
        }

        @Override // com.anythink.basead.ui.component.a.InterfaceC0055a
        public final j a() {
            return BaseSdkSplashATView.this.l();
        }

        @Override // com.anythink.basead.ui.component.a.InterfaceC0055a
        public final com.anythink.basead.d.a b() {
            return BaseSdkSplashATView.this.m();
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseSdkSplashATView$6, reason: invalid class name */
    public class AnonymousClass6 implements BasePlayerView.a {
        public AnonymousClass6() {
        }

        @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
        public final void a(int i) {
        }

        @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
        public final void b() {
        }

        @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
        public final void c() {
            BaseSdkSplashATView.b(BaseSdkSplashATView.this);
        }

        @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
        public final void d() {
        }

        @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
        public final void e() {
        }

        @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
        public final void f() {
        }

        @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
        public final void a(long j9) {
        }

        @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
        public final void b(long j9) {
        }

        @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
        public final void a() {
            ImageView imageView = BaseSdkSplashATView.this.f10047F;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = BaseSdkSplashATView.this.f10046E;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }

        @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
        public final void b(int i) {
            if (BaseSdkSplashATView.this.f9892f.f14325o.J() != 1) {
                BaseSdkSplashATView.this.a(i, 3);
            }
        }

        @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
        public final void a(f fVar) {
            BaseSdkSplashATView.b(BaseSdkSplashATView.this);
            BaseSdkSplashATView baseSdkSplashATView = BaseSdkSplashATView.this;
            e.a(baseSdkSplashATView.f9892f, baseSdkSplashATView.f9893g, 2, fVar.c());
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseSdkSplashATView$7, reason: invalid class name */
    public class AnonymousClass7 implements View.OnClickListener {
        public AnonymousClass7() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BaseSdkSplashATView baseSdkSplashATView = BaseSdkSplashATView.this;
            com.anythink.basead.ui.component.a aVar = baseSdkSplashATView.f9903r;
            if (aVar == null || baseSdkSplashATView.f10045D == null) {
                return;
            }
            if (aVar.f()) {
                BaseSdkSplashATView.this.f10045D.setMute(false);
                BaseSdkSplashATView.this.f9903r.c(false);
            } else {
                BaseSdkSplashATView.this.f10045D.setMute(true);
                BaseSdkSplashATView.this.f9903r.c(true);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseSdkSplashATView$8, reason: invalid class name */
    public class AnonymousClass8 implements b.a {
        public AnonymousClass8() {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, BaseSdkSplashATView.this.f9893g.B())) {
                ImageView imageView = BaseSdkSplashATView.this.f10047F;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                BaseSdkSplashATView.this.f10046E.setImageBitmap(bitmap);
            }
        }
    }

    public BaseSdkSplashATView(Context context) {
        super(context);
        this.f10048G = new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseSdkSplashATView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y yVar = BaseSdkSplashATView.this.f9892f.f14325o;
                if (yVar == null || yVar.J() != 0) {
                    return;
                }
                BaseSdkSplashATView.this.a(1, 3);
            }
        };
        this.f10049H = false;
    }

    private void D() {
        com.anythink.basead.ui.component.a aVar = new com.anythink.basead.ui.component.a(this, this.f9892f, this.f9893g);
        this.f9903r = aVar;
        aVar.a(r());
        com.anythink.basead.ui.improveclick.a aVar2 = this.f9904s;
        if (aVar2 != null) {
            this.f9903r.a(aVar2);
        }
        int i = 0;
        this.f10049H = this.f9903r.l() == null;
        this.f9903r.o();
        this.f9903r.a(new AnonymousClass5());
        this.f9903r.a(new AnonymousClass6());
        if (t()) {
            this.f9903r.c(0);
            this.f9903r.a(true, (List<Bitmap>) null, this.f9911z);
        }
        MuteImageView muteImageView = (MuteImageView) findViewById(q.a(getContext(), "myoffer_btn_mute_id", "id"));
        this.f10045D = muteImageView;
        if (muteImageView != null) {
            muteImageView.setMute(true);
            this.f10045D.setVisibility(0);
            this.f10045D.setOnClickListener(new AnonymousClass7());
            if (this.f9893g.b() == 4) {
                try {
                    if (ATSDKGlobalSetting.getDirectlySplashMuteIconVisible() != null) {
                        MuteImageView muteImageView2 = this.f10045D;
                        if (!ATSDKGlobalSetting.getDirectlySplashMuteIconVisible().booleanValue()) {
                            i = 8;
                        }
                        muteImageView2.setVisibility(i);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    private void E() {
        if (!com.anythink.basead.b.e.a(this.f9893g, this.f9892f)) {
            ImageView imageView = this.f10047F;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f10046E;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f10046E == null || TextUtils.isEmpty(this.f9893g.B())) {
            return;
        }
        ImageView imageView3 = this.f10047F;
        if (imageView3 != null) {
            imageView3.setVisibility(0);
        }
        ImageView imageView4 = this.f10046E;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
        }
        com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, this.f9893g.B()), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new AnonymousClass8());
    }

    private void F() {
        this.f10049H = true;
        G();
        if (this.ab) {
            a(true, 7);
        }
    }

    private void G() {
        com.anythink.basead.ui.component.a aVar = this.f9903r;
        if (aVar != null) {
            aVar.d(2);
        }
    }

    public static /* synthetic */ void b(BaseSdkSplashATView baseSdkSplashATView) {
        baseSdkSplashATView.f10049H = true;
        baseSdkSplashATView.G();
        if (baseSdkSplashATView.ab) {
            baseSdkSplashATView.a(true, 7);
        }
    }

    public static boolean isSinglePicture(w wVar, y yVar) {
        return ((wVar instanceof ay) && (yVar instanceof ba)) ? 2 == ((ba) yVar).a() : (wVar instanceof bj) && 1 == ((bj) wVar).aJ();
    }

    public abstract void b();

    @Override // com.anythink.basead.ui.BaseSplashATView
    public void beforeSplashEndCardShow() {
        super.beforeSplashEndCardShow();
        TextView textView = this.f10093I;
        if (textView != null) {
            textView.setVisibility(8);
        }
        View view = this.f9902q;
        if (view != null) {
            view.setVisibility(8);
        }
        View findViewById = findViewById(q.a(getContext(), "myoffer_fl_invalid_btn", "id"));
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        com.anythink.basead.ui.component.a aVar = this.f9903r;
        if (aVar != null) {
            aVar.d(5);
        }
    }

    public void c() {
        this.f10049H = true;
    }

    public abstract void d();

    @Override // com.anythink.basead.ui.BaseATView
    public final void i() {
        super.i();
        com.anythink.basead.ui.component.a aVar = this.f9903r;
        if (aVar != null) {
            aVar.a(this.f9904s);
        }
    }

    @Override // com.anythink.basead.ui.BaseSplashATView, com.anythink.basead.ui.BaseATView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f10051b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        com.anythink.basead.ui.component.a aVar = this.f9903r;
        if (aVar != null) {
            int i = this.f10104U;
            int i4 = 2;
            if (i != 1) {
                if (i != 2) {
                    if (i != 6) {
                        if (i != 7) {
                            i4 = 4;
                        }
                    }
                }
                i4 = 1;
            }
            aVar.f(i4);
        }
    }

    @Override // com.anythink.basead.ui.BaseSplashATView
    public void onSplashEndCardCountDownTick(long j9) {
        super.onSplashEndCardCountDownTick(j9);
        if (this.f10050a == null) {
            beforeSplashEndCardShow();
            SplashEndCardView splashEndCardView = new SplashEndCardView(getContext(), this.f9893g, this.f9892f);
            this.f10050a = splashEndCardView;
            splashEndCardView.init(new BaseEndCardView.b() { // from class: com.anythink.basead.ui.BaseSdkSplashATView.2
                @Override // com.anythink.basead.ui.BaseEndCardView.a
                public final void a() {
                }

                @Override // com.anythink.basead.ui.BaseEndCardView.b
                public final void b() {
                    BaseSdkSplashATView.this.a(true, 1);
                }

                @Override // com.anythink.basead.ui.BaseEndCardView.a
                public final void a(int i) {
                    BaseSdkSplashATView.this.a(i != 9 ? 1 : 4, i);
                }
            }, this.f9908w);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f10050a.setAlpha(0.2f);
            addView(this.f10050a, layoutParams);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.2f, 1.0f);
            this.f10051b = ofFloat;
            ofFloat.setDuration(500L);
            this.f10051b.setRepeatCount(0);
            final View findViewById = findViewById(q.a(getContext(), "myoffer_splash_ad_content_image_area", "id"));
            this.f10051b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.BaseSdkSplashATView.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (BaseSdkSplashATView.this.f10050a != null) {
                        BaseSdkSplashATView.this.f10050a.setAlpha(floatValue);
                    }
                    View view = findViewById;
                    if (view != null) {
                        view.setAlpha((float) (1.0d - ((floatValue - 0.2d) * 1.25d)));
                    }
                }
            });
            this.f10051b.addListener(new AnimatorListenerAdapter() { // from class: com.anythink.basead.ui.BaseSdkSplashATView.4
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    View view = findViewById;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                }
            });
            this.f10051b.start();
        }
        this.f10050a.onCountDownTick(j9);
    }

    public void w() {
        b();
        this.f10044C = (RoundImageView) findViewById(q.a(getContext(), "myoffer_ad_logo", "id"));
        this.f10046E = (ImageView) findViewById(q.a(getContext(), "myoffer_player_view_cover_img_id", "id"));
        this.f10047F = (ImageView) findViewById(q.a(getContext(), "myoffer_player_view_cover_icon_id", "id"));
        this.f10094K = (ViewGroup) findViewById(q.a(getContext(), "myoffer_feedback_ll_id", "id"));
        if (!com.anythink.basead.b.e.a(this.f9893g, this.f9892f)) {
            ImageView imageView = this.f10047F;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f10046E;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        } else if (this.f10046E != null && !TextUtils.isEmpty(this.f9893g.B())) {
            ImageView imageView3 = this.f10047F;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
            ImageView imageView4 = this.f10046E;
            if (imageView4 != null) {
                imageView4.setVisibility(0);
            }
            com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, this.f9893g.B()), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new AnonymousClass8());
        }
        if (!com.anythink.basead.b.e.a(this.f9893g, this.f9892f)) {
            c();
            return;
        }
        com.anythink.basead.ui.component.a aVar = new com.anythink.basead.ui.component.a(this, this.f9892f, this.f9893g);
        this.f9903r = aVar;
        aVar.a(r());
        com.anythink.basead.ui.improveclick.a aVar2 = this.f9904s;
        if (aVar2 != null) {
            this.f9903r.a(aVar2);
        }
        this.f10049H = this.f9903r.l() == null;
        this.f9903r.o();
        this.f9903r.a(new AnonymousClass5());
        this.f9903r.a(new AnonymousClass6());
        if (t()) {
            this.f9903r.c(0);
            this.f9903r.a(true, (List<Bitmap>) null, this.f9911z);
        }
        MuteImageView muteImageView = (MuteImageView) findViewById(q.a(getContext(), "myoffer_btn_mute_id", "id"));
        this.f10045D = muteImageView;
        if (muteImageView != null) {
            muteImageView.setMute(true);
            this.f10045D.setVisibility(0);
            this.f10045D.setOnClickListener(new AnonymousClass7());
            if (this.f9893g.b() == 4) {
                try {
                    if (ATSDKGlobalSetting.getDirectlySplashMuteIconVisible() != null) {
                        this.f10045D.setVisibility(ATSDKGlobalSetting.getDirectlySplashMuteIconVisible().booleanValue() ? 0 : 8);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.anythink.basead.ui.BaseSplashATView
    public void x() {
        super.x();
        setOnClickListener(this.f10048G);
    }

    @Override // com.anythink.basead.ui.BaseSplashATView
    public final boolean y() {
        return !this.f10049H && this.f9892f.f14325o.aJ() == 1;
    }

    public final void z() {
        if (this.f9903r != null) {
            com.anythink.basead.e eVar = this.f10101R;
            if ((eVar == null || !eVar.a()) && !this.f10049H) {
                if (!this.ab || this.f9892f.f14325o.aJ() == 1) {
                    this.f9903r.d();
                }
            }
        }
    }

    @Override // com.anythink.basead.ui.BaseSplashATView, com.anythink.basead.ui.BaseATView
    public void a(int i) {
        super.a(i);
        if (i == 110) {
            z();
        } else {
            if (i != 111) {
                return;
            }
            G();
        }
    }

    public BaseSdkSplashATView(Context context, x xVar, w wVar, com.anythink.basead.g.a aVar) {
        super(context, xVar, wVar, aVar);
        this.f10048G = new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseSdkSplashATView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y yVar = BaseSdkSplashATView.this.f9892f.f14325o;
                if (yVar == null || yVar.J() != 0) {
                    return;
                }
                BaseSdkSplashATView.this.a(1, 3);
            }
        };
        this.f10049H = false;
        d();
        x();
        a((b) this.J, false);
    }
}
