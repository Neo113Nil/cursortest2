package com.anythink.basead.ui.improveclick;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.anythink.basead.ui.BaseSdkSplashATView;
import com.anythink.basead.ui.BaseShakeView;
import com.anythink.basead.ui.ShakeBorderThumbView;
import com.anythink.basead.ui.ShakeNativeBorderThumbView;
import com.anythink.basead.ui.ShakeThumbView;
import com.anythink.basead.ui.ShakeView;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.basead.ui.improveclick.g;
import com.anythink.core.api.ATSDKGlobalSetting;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.q;
import com.anythink.expressad.video.module.a.a.m;
import java.util.Map;

/* loaded from: classes.dex */
public final class j extends c {

    /* renamed from: a, reason: collision with root package name */
    BaseShakeView f11395a;

    /* renamed from: b, reason: collision with root package name */
    BaseShakeView f11396b;

    /* renamed from: p, reason: collision with root package name */
    long f11402p;

    /* renamed from: q, reason: collision with root package name */
    private final int f11403q = 12;

    /* renamed from: r, reason: collision with root package name */
    private final int f11404r = 252;

    /* renamed from: s, reason: collision with root package name */
    private final int f11405s = 132;

    /* renamed from: t, reason: collision with root package name */
    private final int f11406t = 48;

    /* renamed from: u, reason: collision with root package name */
    private final int f11407u = 86;

    /* renamed from: v, reason: collision with root package name */
    private boolean f11408v = false;

    /* renamed from: c, reason: collision with root package name */
    final long f11397c = m.ai;

    /* renamed from: l, reason: collision with root package name */
    final long f11398l = 500;

    /* renamed from: m, reason: collision with root package name */
    boolean f11399m = false;

    /* renamed from: n, reason: collision with root package name */
    boolean f11400n = false;

    /* renamed from: o, reason: collision with root package name */
    boolean f11401o = false;

    private void b(Map<String, Object> map) {
        BaseShakeView baseShakeView;
        View view = this.f11300j;
        int indexOfChild = (view == null || this.f11298g.indexOfChild(view) <= 0) ? -1 : this.f11298g.indexOfChild(this.f11300j);
        int i = this.f11299h;
        RelativeLayout relativeLayout = null;
        if (i == 1 || i == 2) {
            try {
                relativeLayout = (RelativeLayout) this.f11298g.findViewById(q.a(this.f11295d, "myoffer_end_card_id", "id"));
            } catch (Throwable unused) {
            }
            BaseShakeView baseShakeView2 = this.f11395a;
            if (baseShakeView2 != null) {
                am.a(baseShakeView2);
                this.f11395a.setVisibility(8);
                if (relativeLayout != null) {
                    relativeLayout.addView(this.f11395a);
                    return;
                } else {
                    this.f11298g.addView(this.f11395a, indexOfChild);
                    return;
                }
            }
            return;
        }
        if (i == 3) {
            BaseShakeView baseShakeView3 = this.f11395a;
            if (baseShakeView3 != null) {
                am.a(baseShakeView3);
                this.f11395a.setVisibility(0);
                if (indexOfChild > 0) {
                    indexOfChild++;
                }
                this.f11298g.addView(this.f11395a, indexOfChild);
                return;
            }
            return;
        }
        if (i != 5 && i != 6) {
            if (i == 100 && (baseShakeView = this.f11395a) != null) {
                am.a(baseShakeView);
                this.f11395a.setVisibility(0);
                this.f11298g.addView(this.f11395a);
                return;
            }
            return;
        }
        BaseShakeView baseShakeView4 = this.f11395a;
        if (baseShakeView4 != null) {
            am.a(baseShakeView4);
            Object obj = map != null ? map.get(g.a.f11324b) : null;
            if (obj != null && (obj instanceof ViewGroup)) {
                BaseShakeView baseShakeView5 = this.f11395a;
                if (baseShakeView5 instanceof ShakeNativeBorderThumbView) {
                    ((ShakeNativeBorderThumbView) baseShakeView5).changeBackground();
                    if (obj instanceof FrameLayout) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 17;
                        this.f11395a.setLayoutParams(layoutParams);
                    }
                }
                ((ViewGroup) obj).addView(this.f11395a);
                return;
            }
            if (this.f11298g.getMeasuredWidth() < i.a().a(this.f11295d) || this.f11298g.getMeasuredHeight() < i.a().b(this.f11295d)) {
                Object obj2 = map.get(g.a.f11325c);
                if (obj2 == null || !(obj2 instanceof com.anythink.basead.g.f)) {
                    return;
                }
                ((com.anythink.basead.g.f) obj2).onATImproveClickViewRenderFail(1);
                return;
            }
            if (this.f11298g instanceof FrameLayout) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 21;
                this.f11395a.setLayoutParams(layoutParams2);
            }
            this.f11298g.addView(this.f11395a);
        }
    }

    private void c() {
        if (this.f11395a == null || this.f11396b == null || this.f11408v || !f()) {
            return;
        }
        this.f11408v = true;
        this.f11395a.setVisibility(0);
        this.f11395a.postDelayed(new Runnable() { // from class: com.anythink.basead.ui.improveclick.j.1
            @Override // java.lang.Runnable
            public final void run() {
                if (j.this.f()) {
                    try {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.2f);
                        ofFloat.setDuration(500L);
                        ofFloat.setRepeatCount(1);
                        ofFloat.setRepeatMode(2);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.improveclick.j.1.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                if (j.this.f11396b != null) {
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    j jVar = j.this;
                                    if (jVar.f11395a != null && jVar.f11396b.getParent() == null) {
                                        j.this.f11395a.setAlpha(floatValue);
                                    }
                                    if (j.this.f11396b.getParent() != null) {
                                        j.this.f11396b.setAlpha(floatValue);
                                    }
                                }
                            }
                        });
                        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.anythink.basead.ui.improveclick.j.1.2
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationRepeat(Animator animator) {
                                int i;
                                super.onAnimationRepeat(animator);
                                try {
                                    j jVar = j.this;
                                    if (jVar.f11396b == null || !jVar.f()) {
                                        return;
                                    }
                                    am.a(j.this.f11396b);
                                    j jVar2 = j.this;
                                    RelativeLayout relativeLayout = (RelativeLayout) jVar2.f11298g.findViewById(q.a(jVar2.f11295d, "myoffer_end_card_id", "id"));
                                    if (relativeLayout != null) {
                                        relativeLayout.addView(j.this.f11396b);
                                    } else {
                                        j jVar3 = j.this;
                                        View view = jVar3.f11300j;
                                        if (view == null || jVar3.f11298g.indexOfChild(view) <= 0) {
                                            i = -1;
                                        } else {
                                            j jVar4 = j.this;
                                            i = jVar4.f11298g.indexOfChild(jVar4.f11300j);
                                        }
                                        j jVar5 = j.this;
                                        jVar5.f11298g.addView(jVar5.f11396b, i);
                                    }
                                    j.this.f11396b.setAlpha(0.2f);
                                    j.this.f11395a.setVisibility(8);
                                } catch (Throwable unused) {
                                }
                            }
                        });
                        ofFloat.start();
                    } catch (Throwable unused) {
                        if (j.this.f()) {
                            BaseShakeView baseShakeView = j.this.f11396b;
                            if (baseShakeView == null || baseShakeView.getParent() == null) {
                                j.this.f11395a.setVisibility(0);
                            } else {
                                j.this.f11395a.setVisibility(8);
                                j.this.f11396b.setVisibility(0);
                            }
                        }
                    }
                }
            }
        }, m.ai);
    }

    private void d() {
        e();
        if (this.f11396b == null || this.f11299h != 1 || com.anythink.basead.b.e.b(this.f11296e) || com.anythink.basead.b.e.a(this.f11296e)) {
            return;
        }
        if (this.f11297f.f14325o.J() == 0 || com.anythink.core.common.v.m.f(this.f11295d) == 2) {
            this.f11396b.setAlpha(1.0f);
            this.f11396b.setVisibility(0);
        }
    }

    private void e() {
        BaseShakeView baseShakeView = this.f11395a;
        if (baseShakeView != null) {
            baseShakeView.setVisibility(8);
        }
        BaseShakeView baseShakeView2 = this.f11396b;
        if (baseShakeView2 != null) {
            baseShakeView2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        return (this.f11299h == 1 && com.anythink.basead.b.e.a(this.f11296e, this.f11297f) && this.f11399m) ? false : true;
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a() {
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a(Context context, w wVar, x xVar, ViewGroup viewGroup, RelativeLayout relativeLayout, View view, int i, c.a aVar) {
        boolean z8;
        super.a(context, wVar, xVar, viewGroup, relativeLayout, view, i, aVar);
        int i4 = this.f11299h;
        if (i4 == 1 || i4 == 2) {
            this.f11395a = new ShakeThumbView(context);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            if (i == 2 && com.anythink.core.common.v.m.f(context) == 2 && xVar.f14325o.J() == 0) {
                this.f11395a.setPadding(0, 0, 0, q.a(context, 42.0f));
            }
            this.f11395a.setLayoutParams(layoutParams);
            this.f11396b = new ShakeBorderThumbView(context);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(9);
            layoutParams2.addRule(12);
            int a9 = q.a(context, 12.0f);
            if (i == 1) {
                if (com.anythink.core.common.v.m.f(context) == 2) {
                    layoutParams2.setMargins(a9, 0, 0, q.a(context, 132.0f));
                } else {
                    layoutParams2.setMargins(a9, 0, 0, q.a(context, 252.0f));
                }
            }
            if (i == 2 && !com.anythink.basead.b.e.a(this.f11296e)) {
                if (xVar.f14325o.J() == 0) {
                    layoutParams2.setMargins(a9, 0, 0, q.a(context, 48.0f));
                } else {
                    layoutParams2.setMargins(a9, 0, 0, q.a(context, 86.0f));
                }
            }
            this.f11396b.setLayoutParams(layoutParams2);
            a(this.f11395a, xVar.f14325o.J() != 1);
            a(this.f11396b, xVar.f14325o.J() != 1);
        } else if (i4 == 3) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            boolean z9 = (this.f11297f.f14325o.au() == 1 && !TextUtils.isEmpty(this.f11297f.f14325o.aw())) || this.f11297f.f14325o.ah() || this.f11297f.f14325o.ar();
            if (this.f11296e.n()) {
                if (!z9) {
                    this.f11395a = new ShakeThumbView(context);
                    layoutParams3.addRule(13);
                    this.f11395a.setPadding(0, 0, 0, q.a(context, 26.0f));
                } else {
                    this.f11395a = new ShakeBorderThumbView(context);
                    layoutParams3.addRule(11);
                    layoutParams3.addRule(15);
                }
            } else if (BaseSdkSplashATView.isSinglePicture(this.f11296e, this.f11297f.f14325o)) {
                this.f11395a = new ShakeView(context);
                layoutParams3.addRule(14);
                layoutParams3.addRule(12);
                int a10 = this.f11297f.f14325o.C() == 2 ? q.a(context, 46.0f) : q.a(context, 63.0f);
                if (this.f11297f.f14325o.ar()) {
                    a10 = q.a(context, 100.0f);
                }
                if (wVar.b() == 4) {
                    String directlySplashAdShakeIconString = ATSDKGlobalSetting.getDirectlySplashAdShakeIconString();
                    if (!TextUtils.isEmpty(directlySplashAdShakeIconString)) {
                        ((ShakeView) this.f11395a).setShakeHintText(directlySplashAdShakeIconString);
                    }
                    View directlySplashShakeButton = ATSDKGlobalSetting.getDirectlySplashShakeButton();
                    if (directlySplashShakeButton != null) {
                        ((ShakeView) this.f11395a).replaceShakeCTAButton(directlySplashShakeButton);
                    }
                }
                ((ShakeView) this.f11395a).setNeedHideShakeIcon(z9);
                layoutParams3.setMargins(0, 0, 0, a10);
                z8 = true;
                this.f11395a.setLayoutParams(layoutParams3);
                BaseShakeView baseShakeView = this.f11395a;
                if (!z8 && xVar.f14325o.J() == 1) {
                    r7 = false;
                }
                a(baseShakeView, r7);
            } else if (z9 && this.f11297f.f14325o.C() != 1) {
                this.f11395a = new ShakeBorderThumbView(context);
                layoutParams3.addRule(11);
                layoutParams3.addRule(15);
            } else {
                this.f11395a = new ShakeThumbView(context);
                layoutParams3.addRule(13);
                if (this.f11297f.f14325o.C() == 2) {
                    this.f11395a.setPadding(0, 0, 0, q.a(context, 26.0f));
                }
            }
            z8 = false;
            this.f11395a.setLayoutParams(layoutParams3);
            BaseShakeView baseShakeView2 = this.f11395a;
            if (!z8) {
                r7 = false;
            }
            a(baseShakeView2, r7);
        } else if (i4 == 5 || i4 == 6) {
            this.f11395a = new ShakeNativeBorderThumbView(context);
            this.f11395a.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            a(this.f11395a, xVar.f14325o.J() != 1);
        } else if (i4 == 100) {
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            this.f11395a = new ShakeBorderThumbView(context);
            layoutParams4.addRule(13);
            this.f11395a.setAlpha(0.0f);
            this.f11395a.setLayoutParams(layoutParams4);
            a(this.f11395a, false);
        }
        BaseShakeView baseShakeView3 = this.f11395a;
        if (baseShakeView3 != null) {
            baseShakeView3.setShakeSetting(this.f11297f.f14325o, this.f11296e.K());
        }
        BaseShakeView baseShakeView4 = this.f11396b;
        if (baseShakeView4 != null) {
            baseShakeView4.setShakeSetting(this.f11297f.f14325o, this.f11296e.K());
        }
    }

    public final boolean b() {
        if (!com.anythink.basead.ui.f.b.a(this.f11402p, this.f11297f)) {
            return false;
        }
        int i = this.f11299h;
        if (i == 1 || i == 2) {
            return this.f11400n;
        }
        return (i == 3 && this.f11401o) ? false : true;
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a(int i, Map<String, Object> map) {
        BaseShakeView baseShakeView;
        if (i != 102) {
            if (i != 103) {
                if (i == 105) {
                    e();
                    return;
                }
                if (i == 106) {
                    if (this.f11299h == 3 && com.anythink.basead.b.e.b(this.f11296e)) {
                        b(map);
                        return;
                    }
                    return;
                }
                if (i != 118) {
                    if (i == 119) {
                        e();
                        return;
                    }
                    if (i == 303) {
                        if (this.f11299h == 100) {
                            b(map);
                            return;
                        }
                        return;
                    }
                    if (i != 304) {
                        switch (i) {
                            case 110:
                                this.f11400n = true;
                                break;
                            case 111:
                                this.f11400n = false;
                                break;
                            case 112:
                                break;
                            default:
                                switch (i) {
                                    case 114:
                                        this.f11402p = System.currentTimeMillis();
                                        Object obj = map.get(g.a.f11323a);
                                        boolean z8 = (obj instanceof Integer) && ((Integer) obj).intValue() == 1;
                                        if (z8 && (baseShakeView = this.f11396b) != null) {
                                            ViewGroup.LayoutParams layoutParams = baseShakeView.getLayoutParams();
                                            int a9 = q.a(this.f11295d, 12.0f);
                                            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                                                ((RelativeLayout.LayoutParams) layoutParams).setMargins(a9, 0, 0, q.a(this.f11295d, 48.0f));
                                            }
                                        }
                                        int i4 = this.f11299h;
                                        if (i4 == 1) {
                                            b(map);
                                            c();
                                            break;
                                        } else if (!z8 && (i4 != 2 || com.anythink.basead.b.e.a(this.f11296e))) {
                                            int i9 = this.f11299h;
                                            if (i9 == 5 || i9 == 6) {
                                                b(map);
                                                break;
                                            }
                                        } else {
                                            b(map);
                                            c();
                                            break;
                                        }
                                        break;
                                    case 115:
                                        this.f11401o = true;
                                        break;
                                    case 116:
                                        if (this.f11299h == 3 && !com.anythink.basead.b.e.b(this.f11296e)) {
                                            b(map);
                                            break;
                                        }
                                        break;
                                }
                        }
                        return;
                    }
                    if (this.f11299h != 100) {
                        return;
                    }
                } else if (this.f11299h != 3 || !com.anythink.basead.b.e.b(this.f11296e, this.f11297f)) {
                    return;
                }
            } else if (!c.a(map)) {
                return;
            }
            e();
            return;
        }
        this.f11399m = true;
        if (this.f11299h == 1 && com.anythink.basead.b.e.a(this.f11296e, this.f11297f)) {
            e();
            if (this.f11396b == null || this.f11299h != 1 || com.anythink.basead.b.e.b(this.f11296e) || com.anythink.basead.b.e.a(this.f11296e)) {
                return;
            }
            if (this.f11297f.f14325o.J() == 0 || com.anythink.core.common.v.m.f(this.f11295d) == 2) {
                this.f11396b.setAlpha(1.0f);
                this.f11396b.setVisibility(0);
            }
        }
    }

    private void a(BaseShakeView baseShakeView, boolean z8) {
        if (z8) {
            baseShakeView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.improveclick.j.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.a aVar = j.this.f11301k;
                    if (aVar != null) {
                        aVar.a(1, 5);
                    }
                }
            });
        }
        baseShakeView.setOnShakeListener(new BaseShakeView.a() { // from class: com.anythink.basead.ui.improveclick.j.3
            @Override // com.anythink.basead.ui.BaseShakeView.a
            public final boolean a() {
                if (!j.this.b()) {
                    return false;
                }
                c.a aVar = j.this.f11301k;
                if (aVar == null) {
                    return true;
                }
                aVar.a(4, 5);
                return true;
            }
        }, this.f11297f.f14325o);
    }
}
