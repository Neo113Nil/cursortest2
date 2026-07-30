package com.anythink.basead.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.anythink.basead.b.e;
import com.anythink.basead.ui.FullScreenHeaderPanelView;
import com.anythink.basead.ui.PanelView;
import com.anythink.basead.ui.animplayerview.BasePlayerView;
import com.anythink.basead.ui.f.d;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.basead.ui.improveclick.g;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;
import java.util.HashMap;

/* loaded from: classes.dex */
public class FullScreenATView extends BaseScreenATView {
    public static final String TAG = "FullScreenATView";
    LinearLayout ah;
    TextView ai;
    ImageView aj;
    private CountDownCloseView ak;
    private CloseHeaderView al;
    private PanelView am;
    private d an;
    private FullScreenHeaderPanelView ao;
    private long ap;
    private long aq;

    public FullScreenATView(Context context) {
        super(context);
    }

    private void ag() {
        this.f10010O.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (o()) {
            this.f10008M.addView(this.f10010O, 0);
            return;
        }
        if (b(this.f10001E)) {
            PanelView aa = aa();
            int i = this.f10001E;
            if (i != 1) {
                if (i != 2) {
                    if (i == 5) {
                        int i4 = this.f10022d;
                        int i9 = (int) (i4 * 0.5f);
                        this.f10010O.setLayoutParams(new RelativeLayout.LayoutParams(-1, i4 - i9));
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) aa.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = this.f10021c;
                            layoutParams.height = i9;
                            aa.setLayoutParams(layoutParams);
                            aa.removeAllViews();
                            aa.setLayoutType(this.f10001E);
                        }
                    } else if (i != 6) {
                        if (this.f9892f.f14325o.J() != 0) {
                            View shakeView = aa.getShakeView();
                            if (n()) {
                                if (shakeView != null) {
                                    shakeView.setVisibility(0);
                                }
                            } else if (shakeView != null) {
                                shakeView.setVisibility(8);
                            }
                        }
                    }
                }
                int a9 = q.a(getContext(), 300.0f);
                this.f10010O.setLayoutParams(new RelativeLayout.LayoutParams(this.f10021c - a9, -1));
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) aa.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = a9;
                    layoutParams2.height = -1;
                    aa.setLayoutParams(layoutParams2);
                    aa.removeAllViews();
                    aa.setLayoutType(this.f10001E);
                }
            } else {
                this.f10008M.setBackgroundColor(-1);
                int i10 = (int) (this.f10022d * 0.5f);
                int a10 = TextUtils.isEmpty(this.f9893g.z()) ? this.f10022d - i10 : (this.f10022d - i10) + q.a(getContext(), 50.0f);
                this.f10010O.setLayoutParams(new RelativeLayout.LayoutParams(-1, i10));
                this.f10010O.setNeedArc(true);
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) aa.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = this.f10021c;
                    layoutParams3.height = a10;
                    aa.setLayoutParams(layoutParams3);
                    aa.removeAllViews();
                    aa.setLayoutType(this.f10001E);
                }
            }
        }
        this.f10008M.addView(this.f10010O, 0);
    }

    private void ah() {
        if (((BaseScreenATView) this).f10019a == 1 && this.J) {
            RoundImageView roundImageView = new RoundImageView(getContext().getApplicationContext());
            roundImageView.setImageResource(q.a(getContext(), "myoffer_reward_icon", k.f19790c));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(q.a(getContext(), 60.0f), q.a(getContext(), 60.0f));
            int i = 2;
            if (b(this.f10001E)) {
                int i4 = this.f10001E;
                if (i4 == 2 || i4 == 6) {
                    layoutParams.leftMargin = this.f10021c - q.a(getContext(), 330.0f);
                    layoutParams.topMargin = q.a(getContext(), 22.0f);
                } else {
                    layoutParams.leftMargin = q.a(getContext(), 12.0f);
                    layoutParams.topMargin = q.a(getContext(), 12.0f);
                }
            } else {
                layoutParams.leftMargin = q.a(getContext(), 12.0f);
                layoutParams.topMargin = q.a(getContext(), 12.0f);
            }
            roundImageView.setLayoutParams(layoutParams);
            try {
                i = this.f10008M.indexOfChild(this.f10009N) + 1;
            } catch (Throwable unused) {
            }
            this.f10008M.addView(roundImageView, i);
        }
        LinearLayout linearLayout = this.ah;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    private boolean ai() {
        return ((BaseScreenATView) this).f10019a == 1 && this.f10002F != 100;
    }

    private boolean aj() {
        if (((BaseScreenATView) this).f10019a != 1) {
            return false;
        }
        int i = this.f10002F;
        return i == 1 || i == 101;
    }

    private boolean ak() {
        return Y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void al() {
        if (Y() || ((BaseScreenATView) this).f10019a != 1 || this.f9892f.f14325o.bj() <= 0) {
            return;
        }
        long min = Math.min(this.f10004H, this.f10003G);
        this.ap = Math.max(0L, min - this.f9892f.f14325o.bj());
        this.aq = Math.min(min, this.f9892f.f14325o.bj());
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void H() {
        PanelView panelView = this.am;
        if (panelView != null) {
            panelView.setVisibility(4);
            this.am.init(this.f9893g, this.f9892f, this.f10020b, n(), new PanelView.a() { // from class: com.anythink.basead.ui.FullScreenATView.3
                @Override // com.anythink.basead.ui.PanelView.a
                public final void a(int i, int i4) {
                    FullScreenATView.this.a(i, i4);
                }

                @Override // com.anythink.basead.ui.PanelView.a
                public final boolean a() {
                    if (!FullScreenATView.this.J()) {
                        return false;
                    }
                    FullScreenATView.this.a(4, 5);
                    return true;
                }
            });
        }
        super.H();
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public void I() {
        super.I();
        if (e.a(this.f9893g)) {
            this.f10001E = 0;
        } else {
            this.f10001E = 8;
        }
        PanelView panelView = this.f10009N;
        if (panelView != null) {
            panelView.setLayoutType(this.f10001E);
            if (this.f10001E == 8 && this.f9892f.f14325o.J() == 0) {
                this.f10009N.getCTAButton().setVisibility(8);
            }
        }
        PanelView panelView2 = this.am;
        if (panelView2 != null) {
            panelView2.setLayoutType(this.f10001E);
            if (this.f10001E == 8 && this.f9892f.f14325o.J() == 0) {
                this.am.getCTAButton().setVisibility(8);
            }
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void L() {
        super.L();
        if (ai()) {
            if (this.f10002F != 101) {
                CountDownCloseView countDownCloseView = this.ak;
                if (countDownCloseView != null) {
                    countDownCloseView.setVisibility(0);
                    return;
                }
                return;
            }
            CloseHeaderView closeHeaderView = this.al;
            if (closeHeaderView != null) {
                closeHeaderView.setVisibility(0);
                if (this.al.getCloseImageView() != null) {
                    this.al.getCloseImageView().setVisibility(0);
                }
            }
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void M() {
        int aC = this.f9892f.f14325o.aC();
        int i = ((BaseScreenATView) this).f10019a;
        if (i != 1) {
            if (i != 3) {
                c(1);
                return;
            }
            if (this.f10005I) {
                c(1);
                return;
            }
            N();
            if (aC == 1 || aC == 2) {
                c(1);
                return;
            }
            if (p()) {
                this.f9901p = true;
            }
            x();
            return;
        }
        if (this.f9901p) {
            c(1);
            return;
        }
        if (this.J) {
            if (aC == 1 || aC == 3) {
                N();
                c(1);
                return;
            } else {
                N();
                if (p()) {
                    this.f9901p = true;
                }
                x();
                return;
            }
        }
        if (aC == 1 || aC == 2) {
            try {
                Toast.makeText(getContext().getApplicationContext(), getContext().getString(q.a(getContext(), "myoffer_reward_exit_tips_msg", k.f19794g)), 0).show();
            } catch (Throwable unused) {
            }
            N();
            c(1);
            return;
        }
        double ceil = Math.ceil(this.f10004H / 1000.0d);
        if (this.f9903r != null) {
            double ceil2 = Math.ceil(r2.h() / 1000.0d);
            if (ceil > ceil2) {
                ceil = ceil2;
            }
        }
        RewardExitConfirmDialogActivity.a(getContext(), String.valueOf((int) ceil), new Runnable() { // from class: com.anythink.basead.ui.FullScreenATView.4
            @Override // java.lang.Runnable
            public final void run() {
                FullScreenATView.this.N();
                FullScreenATView.this.c(1);
            }
        }, ai() ? 2 : 1);
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void O() {
        super.O();
        if (ai()) {
            S();
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void P() {
        super.P();
        if (this.f10002F != 100) {
            d(8);
        }
        al();
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public void Q() {
        super.Q();
        d dVar = this.an;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void R() {
        super.R();
        d dVar = this.an;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public void U() {
        BaseEndCardView baseEndCardView;
        if (this.f10008M == null || (baseEndCardView = this.f10010O) == null || baseEndCardView.getParent() != null) {
            return;
        }
        if (!e.a(this.f9893g, this.f9892f)) {
            af();
            return;
        }
        this.f10010O.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (!o() && b(this.f10001E)) {
            PanelView aa = aa();
            int i = this.f10001E;
            if (i != 1) {
                if (i != 2) {
                    if (i == 5) {
                        int i4 = this.f10022d;
                        int i9 = (int) (i4 * 0.5f);
                        this.f10010O.setLayoutParams(new RelativeLayout.LayoutParams(-1, i4 - i9));
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) aa.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = this.f10021c;
                            layoutParams.height = i9;
                            aa.setLayoutParams(layoutParams);
                            aa.removeAllViews();
                            aa.setLayoutType(this.f10001E);
                        }
                    } else if (i != 6) {
                        if (this.f9892f.f14325o.J() != 0) {
                            View shakeView = aa.getShakeView();
                            if (n()) {
                                if (shakeView != null) {
                                    shakeView.setVisibility(0);
                                }
                            } else if (shakeView != null) {
                                shakeView.setVisibility(8);
                            }
                        }
                    }
                }
                int a9 = q.a(getContext(), 300.0f);
                this.f10010O.setLayoutParams(new RelativeLayout.LayoutParams(this.f10021c - a9, -1));
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) aa.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = a9;
                    layoutParams2.height = -1;
                    aa.setLayoutParams(layoutParams2);
                    aa.removeAllViews();
                    aa.setLayoutType(this.f10001E);
                }
            } else {
                this.f10008M.setBackgroundColor(-1);
                int i10 = (int) (this.f10022d * 0.5f);
                int a10 = TextUtils.isEmpty(this.f9893g.z()) ? this.f10022d - i10 : (this.f10022d - i10) + q.a(getContext(), 50.0f);
                this.f10010O.setLayoutParams(new RelativeLayout.LayoutParams(-1, i10));
                this.f10010O.setNeedArc(true);
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) aa.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = this.f10021c;
                    layoutParams3.height = a10;
                    aa.setLayoutParams(layoutParams3);
                    aa.removeAllViews();
                    aa.setLayoutType(this.f10001E);
                }
            }
        }
        this.f10008M.addView(this.f10010O, 0);
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public void V() {
        super.V();
        if (((BaseScreenATView) this).f10019a == 1 && this.J) {
            RoundImageView roundImageView = new RoundImageView(getContext().getApplicationContext());
            roundImageView.setImageResource(q.a(getContext(), "myoffer_reward_icon", k.f19790c));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(q.a(getContext(), 60.0f), q.a(getContext(), 60.0f));
            int i = 2;
            if (b(this.f10001E)) {
                int i4 = this.f10001E;
                if (i4 == 2 || i4 == 6) {
                    layoutParams.leftMargin = this.f10021c - q.a(getContext(), 330.0f);
                    layoutParams.topMargin = q.a(getContext(), 22.0f);
                } else {
                    layoutParams.leftMargin = q.a(getContext(), 12.0f);
                    layoutParams.topMargin = q.a(getContext(), 12.0f);
                }
            } else {
                layoutParams.leftMargin = q.a(getContext(), 12.0f);
                layoutParams.topMargin = q.a(getContext(), 12.0f);
            }
            roundImageView.setLayoutParams(layoutParams);
            try {
                i = this.f10008M.indexOfChild(this.f10009N) + 1;
            } catch (Throwable unused) {
            }
            this.f10008M.addView(roundImageView, i);
        }
        LinearLayout linearLayout = this.ah;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        if (o()) {
            PanelView panelView = this.f10009N;
            if (panelView != null) {
                panelView.setVisibility(8);
            }
            PanelView panelView2 = this.am;
            if (panelView2 != null) {
                panelView2.setVisibility(8);
            }
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final CloseImageView X() {
        if (ai()) {
            if (this.f10002F == 101) {
                CloseHeaderView closeHeaderView = this.al;
                if (closeHeaderView != null && closeHeaderView.getCloseImageView() != null) {
                    return this.al.getCloseImageView();
                }
            } else {
                CountDownCloseView countDownCloseView = this.ak;
                if (countDownCloseView != null) {
                    return countDownCloseView;
                }
            }
        }
        return super.X();
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final ViewGroup Z() {
        CloseHeaderView closeHeaderView = this.al;
        return (closeHeaderView == null || closeHeaderView.getVisibility() != 0 || this.al.getFeedbackButton() == null) ? super.Z() : this.al.getFeedbackButton();
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final PanelView aa() {
        PanelView panelView;
        PanelView panelView2;
        return (e.a(this.f9893g, this.f9892f) || (panelView2 = this.am) == null) ? (this.f10005I || this.f10002F == 1 || (panelView = this.am) == null) ? super.aa() : panelView : panelView2;
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void ab() {
        PanelView panelView;
        if (Y()) {
            return;
        }
        if (((BaseScreenATView) this).f10019a != 1 || this.f10002F == 100) {
            super.ab();
            if (!p() || (panelView = this.am) == null) {
                return;
            }
            panelView.setVisibility(8);
            return;
        }
        com.anythink.basead.ui.component.a aVar = this.f9903r;
        if (aVar == null || !aVar.a()) {
            return;
        }
        final BasePlayerView l9 = this.f9903r.l();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, -getMeasuredWidth(), 0.0f, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.4f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setFillAfter(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(300L);
        animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: com.anythink.basead.ui.FullScreenATView.5
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                View view = l9;
                if (view != null) {
                    view.post(new Runnable() { // from class: com.anythink.basead.ui.FullScreenATView.5.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            FullScreenATView.super.ab();
                            if (FullScreenATView.this.am != null) {
                                FullScreenATView.this.am.setVisibility(8);
                            }
                        }
                    });
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }
        });
        l9.startAnimation(animationSet);
        PanelView panelView2 = this.am;
        if (panelView2 == null || panelView2.getVisibility() != 0) {
            return;
        }
        this.am.startAnimation(animationSet);
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void ad() {
        super.ad();
        TextView textView = this.ai;
        if (textView != null) {
            textView.setText(getContext().getString(q.a(getContext(), "myoffer_reward_tips_rewarded", k.f19794g)));
        }
        ImageView imageView = this.aj;
        if (imageView != null) {
            imageView.setImageResource(q.a(getContext(), "reward_tips_icon_check", k.f19790c));
        }
    }

    public final void af() {
        this.f10010O.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (o()) {
            this.f10008M.addView(this.f10010O, 0);
        } else {
            aa().setVisibility(0);
            this.f10008M.addView(this.f10010O, 0);
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void d() {
        super.d();
        if (this.f9903r == null || !ai()) {
            return;
        }
        if (this.f9904s != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(g.a.f11331j, Integer.valueOf(this.f10002F));
            this.f9904s.a(hashMap);
        }
        a(125);
        this.f9903r.e(this.f10002F);
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void e(int i) {
        if (!ai()) {
            super.e(i);
            return;
        }
        this.f10012Q.setVisibility(8);
        com.anythink.basead.ui.component.b bVar = this.f10017V;
        if (bVar != null) {
            bVar.a(8);
        }
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final int r() {
        return 1;
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final c.a s() {
        return new c.b() { // from class: com.anythink.basead.ui.FullScreenATView.6
            @Override // com.anythink.basead.ui.improveclick.c.b
            public final void a() {
                FullScreenATView.this.C();
            }

            @Override // com.anythink.basead.ui.improveclick.c.b
            public final void b() {
                FullScreenATView.this.E();
            }

            @Override // com.anythink.basead.ui.improveclick.c.b
            public final void a(long j9) {
                if (j9 <= 0) {
                    FullScreenATView.this.ad();
                    FullScreenATView.this.c(1);
                    return;
                }
                FullScreenATView fullScreenATView = FullScreenATView.this;
                fullScreenATView.f10004H = Math.max(0L, fullScreenATView.f10004H - j9);
                FullScreenATView fullScreenATView2 = FullScreenATView.this;
                if (fullScreenATView2.J) {
                    return;
                }
                fullScreenATView2.al();
                FullScreenATView fullScreenATView3 = FullScreenATView.this;
                if (fullScreenATView3.f10004H <= 0) {
                    fullScreenATView3.ad();
                    return;
                }
                com.anythink.basead.ui.component.a aVar = fullScreenATView3.f9903r;
                if (aVar != null) {
                    long i = aVar.i();
                    if (i > 0) {
                        FullScreenATView fullScreenATView4 = FullScreenATView.this;
                        if (i >= fullScreenATView4.f10004H) {
                            fullScreenATView4.ad();
                        } else {
                            fullScreenATView4.b(fullScreenATView4.f9903r.i());
                        }
                    }
                }
            }

            @Override // com.anythink.basead.ui.improveclick.c.a
            public final void a(int i, int i4) {
                FullScreenATView.this.a(i, i4);
            }
        };
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void x() {
        if (Y()) {
            return;
        }
        super.x();
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public int y() {
        com.anythink.basead.ui.f.a aVar;
        int i = this.f10001E;
        if (i == 8) {
            return i;
        }
        if (this.f10021c < this.f10022d) {
            return this.af >= this.ag ? 1 : 5;
        }
        if (e.a(this.f9893g, this.f9892f) && (aVar = this.f10016U) != null) {
            aVar.a();
        }
        return this.af < this.ag ? 2 : 6;
    }

    public FullScreenATView(Context context, x xVar, w wVar, String str, int i, int i4) {
        super(context, xVar, wVar, str, i, i4);
        setId(q.a(getContext(), "myoffer_full_screen_view_id", "id"));
        if (xVar != null) {
            this.an = new d(wVar, xVar.f14325o);
        }
        this.ap = -1L;
    }

    @Override // com.anythink.basead.ui.BaseATView
    public void a() {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_full_screen", "layout"), this);
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public void b() {
        super.b();
        d dVar = this.an;
        if (dVar != null) {
            dVar.a(this.f10001E == 8 ? d.f10957b : -100).a(new com.anythink.basead.ui.d.a() { // from class: com.anythink.basead.ui.FullScreenATView.1
                @Override // com.anythink.basead.ui.d.a
                public final void a(int i, int i4) {
                    FullScreenATView.this.a(i, i4);
                }
            }).a(getContext(), this);
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public void c() {
        super.c();
        this.ak = (CountDownCloseView) findViewById(q.a(getContext(), "myoffer_btn_countdown_close_id", "id"));
        this.al = (CloseHeaderView) findViewById(q.a(getContext(), "myoffer_btn_close_header_view_id", "id"));
        this.am = (PanelView) findViewById(q.a(getContext(), "myoffer_banner_view_for_anim_player_id", "id"));
        FullScreenHeaderPanelView fullScreenHeaderPanelView = (FullScreenHeaderPanelView) findViewById(q.a(getContext(), "myoffer_header_panel_view_id", "id"));
        this.ao = fullScreenHeaderPanelView;
        if (fullScreenHeaderPanelView != null && e.a(this.f9893g)) {
            this.ao.initSetting(this.f9893g, this.f9892f, new FullScreenHeaderPanelView.a() { // from class: com.anythink.basead.ui.FullScreenATView.2
                @Override // com.anythink.basead.ui.FullScreenHeaderPanelView.a
                public final void a() {
                    FullScreenATView.this.a(1, 23);
                }
            });
            this.f10015T = this.ao;
        }
        this.ah = (LinearLayout) findViewById(q.a(getContext(), "myoffer_tv_reward_tips_ll_id", "id"));
        this.ai = (TextView) findViewById(q.a(getContext(), "myoffer_tv_reward_tips_id", "id"));
        this.aj = (ImageView) findViewById(q.a(getContext(), "myoffer_tv_reward_tips_icon_id", "id"));
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final boolean a(String str, IOfferClickHandler iOfferClickHandler) {
        if (Y()) {
            this.f10005I = true;
            com.anythink.basead.ui.component.a aVar = this.f9903r;
            boolean z8 = aVar != null && aVar.a(str, iOfferClickHandler);
            if (z8) {
                a(105);
                d dVar = this.an;
                if (dVar != null) {
                    dVar.a();
                }
            }
            return z8;
        }
        return super.a(str, iOfferClickHandler);
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public boolean b(int i) {
        if (i == 0 || i == 1 || i == 2 || i == 5 || i == 6) {
            return e.a(this.f9893g);
        }
        return i == 8;
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void b(long j9) {
        if (ai()) {
            CloseHeaderView closeHeaderView = this.al;
            if (closeHeaderView != null && closeHeaderView.getVisibility() == 0) {
                this.al.refresh(j9);
            }
            CountDownCloseView countDownCloseView = this.ak;
            if (countDownCloseView != null && countDownCloseView.getVisibility() == 0) {
                this.ak.refresh(j9);
            }
        } else {
            super.b(j9);
        }
        long j10 = this.ap;
        if (j10 < 0 || j9 < j10) {
            return;
        }
        LinearLayout linearLayout = this.ah;
        if (linearLayout != null && linearLayout.getVisibility() != 0) {
            this.ah.setVisibility(0);
        }
        TextView textView = this.ai;
        if (textView == null || this.aq <= j9 - this.ap) {
            return;
        }
        textView.setText(String.format(getContext().getString(q.a(getContext(), "myoffer_reward_tips", k.f19794g)), Integer.valueOf((((int) (this.aq - (j9 - this.ap))) / 1000) + 1)));
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void a(long j9) {
        int i;
        if (((BaseScreenATView) this).f10019a == 1 && ((i = this.f10002F) == 1 || i == 101)) {
            return;
        }
        super.a(j9);
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void c(long j9) {
        if (ai()) {
            CloseHeaderView closeHeaderView = this.al;
            if (closeHeaderView != null && closeHeaderView.getVisibility() == 0) {
                this.al.setDuration(j9);
            }
            CountDownCloseView countDownCloseView = this.ak;
            if (countDownCloseView == null || countDownCloseView.getVisibility() != 0) {
                return;
            }
            this.ak.setDuration(j9);
            return;
        }
        super.c(j9);
    }
}
