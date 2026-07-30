package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.basead.ui.BaseEndCardView;
import com.anythink.basead.ui.BaseShakeView;
import com.anythink.basead.ui.component.CTAButtonLayout;
import com.anythink.basead.ui.f.b;
import com.anythink.core.common.a.b;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.g;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class SplashEndCardView extends BaseEndCardView {

    /* renamed from: e, reason: collision with root package name */
    protected String f10520e;

    /* renamed from: f, reason: collision with root package name */
    RoundImageView f10521f;

    /* renamed from: g, reason: collision with root package name */
    TextView f10522g;

    /* renamed from: h, reason: collision with root package name */
    TextView f10523h;
    CTAButtonLayout i;

    /* renamed from: j, reason: collision with root package name */
    TextView f10524j;

    /* renamed from: k, reason: collision with root package name */
    BaseShakeView f10525k;

    /* renamed from: l, reason: collision with root package name */
    ImageView f10526l;

    /* renamed from: m, reason: collision with root package name */
    private View f10527m;

    /* renamed from: n, reason: collision with root package name */
    private long f10528n;

    /* renamed from: o, reason: collision with root package name */
    private final View.OnClickListener f10529o;

    public SplashEndCardView(Context context, w wVar, x xVar) {
        super(context, wVar, xVar);
        View findViewById;
        this.f10520e = "Skip";
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.anythink.basead.ui.SplashEndCardView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseEndCardView.a aVar;
                y yVar = SplashEndCardView.this.f9981d;
                if (yVar != null) {
                    if (yVar.J() == 0) {
                        BaseEndCardView.a aVar2 = SplashEndCardView.this.mListener;
                        if (aVar2 != null) {
                            aVar2.a(22);
                            return;
                        }
                        return;
                    }
                    SplashEndCardView splashEndCardView = SplashEndCardView.this;
                    CTAButtonLayout cTAButtonLayout = splashEndCardView.i;
                    if (cTAButtonLayout == null || view != cTAButtonLayout || (aVar = splashEndCardView.mListener) == null) {
                        return;
                    }
                    aVar.a(22);
                }
            }
        };
        this.f10529o = onClickListener;
        this.f10520e = getResources().getString(q.a(getContext(), "myoffer_splash_skip_text", k.f19794g));
        View inflate = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_splash_endcard", "layout"), (ViewGroup) this, true);
        this.f10527m = inflate;
        this.f10521f = (RoundImageView) inflate.findViewById(q.a(getContext(), "myoffer_splash_endcard_icon", "id"));
        this.i = (CTAButtonLayout) this.f10527m.findViewById(q.a(getContext(), "myoffer_splash_endcard_cta", "id"));
        this.f10522g = (TextView) this.f10527m.findViewById(q.a(getContext(), "myoffer_splash_endcard_title", "id"));
        this.f10523h = (TextView) this.f10527m.findViewById(q.a(getContext(), "myoffer_splash_endcard_desc", "id"));
        this.f10524j = (TextView) this.f10527m.findViewById(q.a(getContext(), "myoffer_splash_endcard_count_down_text", "id"));
        this.f10525k = (BaseShakeView) this.f10527m.findViewById(q.a(getContext(), "myoffer_splash_endcard_shake_hint_text", "id"));
        this.f10526l = (ImageView) this.f10527m.findViewById(q.a(getContext(), "myoffer_splash_endcard_top_bg", "id"));
        if (!this.f9979b.c()) {
            setOnClickListener(onClickListener);
        }
        RoundImageView roundImageView = this.f10521f;
        if (roundImageView != null) {
            roundImageView.setNeedRadiu(true);
            this.f10521f.setRadiusInDip(12);
        }
        if (this.i != null && !this.f9979b.c()) {
            this.i.setOnClickListener(onClickListener);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(q.a(getContext(), 12.0f));
        setBackground(gradientDrawable);
        if (this.f10524j != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(Integer.MIN_VALUE);
            gradientDrawable2.setCornerRadius(q.a(getContext(), 12.0f));
            this.f10524j.setBackground(gradientDrawable2);
            this.f10524j.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.SplashEndCardView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseEndCardView.a aVar = SplashEndCardView.this.mListener;
                    if (aVar instanceof BaseEndCardView.b) {
                        ((BaseEndCardView.b) aVar).b();
                    }
                }
            });
        }
        if (TextUtils.isEmpty(this.f9979b.x()) && TextUtils.isEmpty(this.f9979b.y()) && (findViewById = this.f10527m.findViewById(q.a(getContext(), "myoffer_splash_endcard_header_container", "id"))) != null) {
            findViewById.getLayoutParams().height = q.a(getContext(), 240.0f);
        }
        String a9 = g.a().a(b.d.f12277e);
        if (TextUtils.isEmpty(a9)) {
            return;
        }
        D.y.f().a(new e(3, a9), new b.a() { // from class: com.anythink.basead.ui.SplashEndCardView.3
            @Override // com.anythink.core.common.res.b.a
            public final void onFail(String str, String str2) {
            }

            @Override // com.anythink.core.common.res.b.a
            public final void onSuccess(String str, Bitmap bitmap) {
                if (bitmap != null) {
                    SplashEndCardView.this.f10526l.setImageBitmap(bitmap);
                }
            }
        });
    }

    @Override // com.anythink.basead.ui.BaseEndCardView
    public final void a() {
    }

    public void init(BaseEndCardView.a aVar, long j9) {
        this.mListener = aVar;
        final String z8 = this.f9979b.z();
        if (TextUtils.isEmpty(z8)) {
            z8 = this.f9979b.B();
        }
        int a9 = q.a(getContext(), 60.0f);
        com.anythink.core.common.res.b.a(getContext()).a(new e(1, z8), a9, a9, new b.a() { // from class: com.anythink.basead.ui.SplashEndCardView.4
            @Override // com.anythink.core.common.res.b.a
            public final void onFail(String str, String str2) {
            }

            @Override // com.anythink.core.common.res.b.a
            public final void onSuccess(String str, Bitmap bitmap) {
                if (TextUtils.equals(str, z8)) {
                    SplashEndCardView.this.f10521f.setImageBitmap(bitmap);
                }
            }
        });
        CTAButtonLayout cTAButtonLayout = this.i;
        if (cTAButtonLayout != null) {
            cTAButtonLayout.initSetting(this.f9979b, this.f9980c, true, new b.a() { // from class: com.anythink.basead.ui.SplashEndCardView.5
                @Override // com.anythink.basead.ui.f.b.a
                public final void a(int i, int i4) {
                    BaseEndCardView.a aVar2 = SplashEndCardView.this.mListener;
                    if (aVar2 != null) {
                        aVar2.a(i4);
                    }
                }
            });
        }
        if (TextUtils.isEmpty(this.f9979b.x())) {
            this.f10522g.setVisibility(8);
        } else {
            this.f10522g.setVisibility(0);
            this.f10522g.setText(this.f9979b.x());
        }
        if (TextUtils.isEmpty(this.f9979b.y())) {
            this.f10523h.setVisibility(8);
        } else {
            this.f10523h.setVisibility(0);
            this.f10523h.setText(this.f9979b.y());
        }
        if (com.anythink.basead.b.e.a(this.f9980c)) {
            this.f10525k.setVisibility(0);
            this.f10525k.setShakeSetting(this.f9980c.f14325o, this.f9979b.K());
            if (this.f9981d.J() != 1 && !this.f9979b.c()) {
                this.f10525k.setOnClickListener(this.f10529o);
            }
            this.f10525k.setOnShakeListener(new BaseShakeView.a() { // from class: com.anythink.basead.ui.SplashEndCardView.6
                @Override // com.anythink.basead.ui.BaseShakeView.a
                public final boolean a() {
                    BaseEndCardView.a aVar2;
                    if (!com.anythink.basead.ui.f.b.a(SplashEndCardView.this.f10528n, SplashEndCardView.this.f9980c) || (aVar2 = SplashEndCardView.this.mListener) == null) {
                        return false;
                    }
                    aVar2.a(9);
                    return true;
                }
            }, this.f9981d);
        } else {
            this.f10525k.setVisibility(8);
        }
        this.f10528n = j9;
    }

    public void onCountDownTick(long j9) {
        TextView textView = this.f10524j;
        if (textView != null) {
            textView.setText((j9 / 1000) + "s | " + this.f10520e);
        }
    }
}
