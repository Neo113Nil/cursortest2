package com.anythink.expressad.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.h.z;
import com.anythink.expressad.video.dynview.i.c;
import com.anythink.expressad.video.dynview.widget.AnyThinkOrderCampView;
import com.anythink.expressad.video.module.a.a;
import com.anythink.expressad.video.module.a.a.g;
import com.anythink.expressad.video.module.a.a.i;
import com.anythink.expressad.video.module.a.a.k;
import com.anythink.expressad.video.module.a.a.l;
import com.anythink.expressad.video.signal.e;
import com.anythink.expressad.video.signal.factory.b;
import com.anythink.expressad.video.signal.h;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class AnythinkContainerView extends AnythinkBaseView implements e, h {

    /* renamed from: A, reason: collision with root package name */
    private int f21631A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f21632B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f21633C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f21634D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f21635E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f21636F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f21637G;

    /* renamed from: H, reason: collision with root package name */
    private int f21638H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f21639I;
    private boolean J;

    /* renamed from: K, reason: collision with root package name */
    private int f21640K;

    /* renamed from: L, reason: collision with root package name */
    private int f21641L;

    /* renamed from: M, reason: collision with root package name */
    private int f21642M;

    /* renamed from: N, reason: collision with root package name */
    private int f21643N;

    /* renamed from: O, reason: collision with root package name */
    private int f21644O;

    /* renamed from: P, reason: collision with root package name */
    private String f21645P;

    /* renamed from: Q, reason: collision with root package name */
    private b f21646Q;

    /* renamed from: R, reason: collision with root package name */
    private AnyThinkOrderCampView f21647R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f21648S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f21649T;

    /* renamed from: U, reason: collision with root package name */
    private List<d> f21650U;

    /* renamed from: n, reason: collision with root package name */
    private AnythinkPlayableView f21651n;

    /* renamed from: o, reason: collision with root package name */
    private AnythinkClickCTAView f21652o;

    /* renamed from: p, reason: collision with root package name */
    private AnythinkClickMiniCardView f21653p;

    /* renamed from: q, reason: collision with root package name */
    private AnythinkNativeEndCardView f21654q;

    /* renamed from: r, reason: collision with root package name */
    private AnythinkH5EndCardView f21655r;

    /* renamed from: s, reason: collision with root package name */
    private AnythinkVideoEndCoverView f21656s;

    /* renamed from: t, reason: collision with root package name */
    private AnythinkVastEndCardView f21657t;

    /* renamed from: u, reason: collision with root package name */
    private AnythinkLandingPageView f21658u;

    /* renamed from: v, reason: collision with root package name */
    private AnythinkAlertWebview f21659v;

    /* renamed from: w, reason: collision with root package name */
    private String f21660w;

    /* renamed from: x, reason: collision with root package name */
    private int f21661x;

    /* renamed from: y, reason: collision with root package name */
    private int f21662y;

    /* renamed from: z, reason: collision with root package name */
    private int f21663z;

    /* renamed from: com.anythink.expressad.video.module.AnythinkContainerView$4, reason: invalid class name */
    public class AnonymousClass4 extends i {
        public AnonymousClass4(a aVar) {
            super(aVar);
        }

        @Override // com.anythink.expressad.video.module.a.a.i, com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
        public final void a(int i, Object obj) {
            super.a(i, obj);
            if (i == 100) {
                AnythinkContainerView.this.webviewshow();
                AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                anythinkContainerView.onConfigurationChanged(anythinkContainerView.getResources().getConfiguration());
            }
        }
    }

    public AnythinkContainerView(Context context) {
        super(context);
        this.f21662y = 1;
        this.f21663z = 1;
        this.f21631A = 1;
        this.f21632B = false;
        this.f21633C = false;
        this.f21634D = false;
        this.f21635E = false;
        this.f21636F = true;
        this.f21637G = false;
        this.f21639I = false;
        this.J = false;
        this.f21648S = false;
        this.f21649T = false;
        this.f21650U = new ArrayList();
    }

    private void b() {
        setWrapContent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
        }
    }

    private void e() {
        d dVar = this.f21600b;
        if (dVar != null) {
            boolean j9 = dVar.j();
            boolean f6 = v.f(this.f21600b.J());
            if (j9 && !f6) {
                i();
                return;
            }
        }
        if (this.f21662y != 2 || this.f21639I) {
            i();
        } else {
            h();
        }
    }

    private void f() {
        if (this.f21657t == null) {
            a(this.f21646Q, (Integer) 3);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        addView(this.f21657t, layoutParams);
        this.f21657t.notifyShowListener();
    }

    private void g() {
        if (this.f21658u == null) {
            a(this.f21646Q, (Integer) 4);
        }
        this.f21658u.setUnitId(this.f21660w);
        this.f21658u.preLoadData(this.f21646Q);
        addView(this.f21658u);
    }

    private void h() {
        if (this.f21655r == null) {
            a(this.f21646Q, (Integer) 2);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f21655r;
        if (anythinkH5EndCardView == null || !anythinkH5EndCardView.isLoadSuccess()) {
            i();
            AnythinkH5EndCardView anythinkH5EndCardView2 = this.f21655r;
            if (anythinkH5EndCardView2 != null) {
                anythinkH5EndCardView2.reportRenderResult("timeout", 3);
                this.f21655r.setError(true);
            }
        } else {
            this.f21639I = true;
            addView(this.f21655r);
            webviewshow();
            onConfigurationChanged(getResources().getConfiguration());
            this.f21655r.excuteTask();
            this.f21655r.setNotchValue(this.f21645P, this.f21640K, this.f21641L, this.f21642M, this.f21643N);
        }
        AnythinkH5EndCardView anythinkH5EndCardView3 = this.f21655r;
        if (anythinkH5EndCardView3 != null) {
            anythinkH5EndCardView3.setUnitId(this.f21660w);
        }
    }

    private void i() {
        this.f21662y = 1;
        if (this.f21654q == null) {
            a(this.f21646Q, (Integer) 2);
        }
        addView(this.f21654q);
        onConfigurationChanged(getResources().getConfiguration());
        this.f21654q.notifyShowListener();
        this.f21649T = true;
        bringToFront();
    }

    private void j() {
        AnythinkVideoEndCoverView anythinkVideoEndCoverView = this.f21656s;
        if (anythinkVideoEndCoverView == null) {
            b bVar = this.f21646Q;
            this.f21646Q = bVar;
            if (anythinkVideoEndCoverView == null) {
                AnythinkVideoEndCoverView anythinkVideoEndCoverView2 = new AnythinkVideoEndCoverView(this.f21599a);
                this.f21656s = anythinkVideoEndCoverView2;
                anythinkVideoEndCoverView2.setCampaign(this.f21600b);
                this.f21656s.setNotifyListener(new i(this.f21603e));
                this.f21656s.preLoadData(bVar);
            }
        }
        addView(this.f21656s);
        onConfigurationChanged(getResources().getConfiguration());
        this.f21649T = true;
        bringToFront();
    }

    private void k() {
        if (this.f21651n == null) {
            preLoadData(this.f21646Q);
        }
        addView(this.f21651n);
        AnythinkPlayableView anythinkPlayableView = this.f21651n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.setUnitId(this.f21660w);
            d dVar = this.f21600b;
            if (dVar != null && dVar.I() && this.f21600b.K() == 2) {
                this.f21651n.setCloseVisible(0);
            }
            this.f21651n.setNotchValue(this.f21645P, this.f21640K, this.f21641L, this.f21642M, this.f21643N);
        }
    }

    private void l() {
        if (this.f21652o == null) {
            b(-1);
        }
        if (this.f21652o != null) {
            d dVar = this.f21600b;
            if (dVar == null || !dVar.j()) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                addView(this.f21652o, 0, layoutParams);
            }
        }
    }

    private void m() {
        if (this.f21653p == null) {
            b(-2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.f21634D && this.f21636F) {
            this.f21636F = false;
            layoutParams.width = 1;
            layoutParams.height = 1;
        }
        addView(this.f21653p, layoutParams);
    }

    private void n() {
        if (this.f21659v == null) {
            o();
        }
        AnythinkAlertWebview anythinkAlertWebview = this.f21659v;
        if (anythinkAlertWebview != null && anythinkAlertWebview.getParent() != null) {
            removeView(this.f21659v);
        }
        addView(this.f21659v);
    }

    private void o() {
        if (this.f21659v == null) {
            AnythinkAlertWebview anythinkAlertWebview = new AnythinkAlertWebview(this.f21599a);
            this.f21659v = anythinkAlertWebview;
            anythinkAlertWebview.setUnitId(this.f21660w);
            this.f21659v.setCampaign(this.f21600b);
        }
        this.f21659v.preLoadData(this.f21646Q);
    }

    private void p() {
        this.f21633C = false;
        this.f21649T = false;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int i = 0;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof AnythinkContainerView) {
                    i++;
                } else {
                    viewGroup.bringChildToFront(childAt);
                }
            }
        }
    }

    private void q() {
        d dVar = this.f21600b;
        if (dVar == null) {
            return;
        }
        String J = dVar.J();
        int i = 404;
        if (!TextUtils.isEmpty(J)) {
            try {
                i = Integer.parseInt(z.a(J, "ecid"));
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        this.f21654q = new AnythinkNativeEndCardView(this.f21599a, null, true, i, this.f21600b.e() == 2, this.f21609l, this.f21600b.au());
        if (this.f21600b.k() != 5) {
            this.f21654q.setCampaign(this.f21600b);
            return;
        }
        a aVar = this.f21603e;
        if (aVar != null && (aVar instanceof k)) {
            ((k) aVar).a(this.f21600b);
        }
        this.f21654q.setCampaign(this.f21600b);
    }

    public void addOrderViewData(List<d> list) {
        if (list == null) {
            return;
        }
        this.f21650U = list;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (view != null) {
            a(view);
            super.addView(view);
        }
    }

    public boolean canBackPress() {
        if (this.f21654q != null) {
            return false;
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f21655r;
        if (anythinkH5EndCardView != null) {
            return anythinkH5EndCardView.canBackPress();
        }
        AnythinkLandingPageView anythinkLandingPageView = this.f21658u;
        if (anythinkLandingPageView != null) {
            return anythinkLandingPageView.canBackPress();
        }
        AnythinkPlayableView anythinkPlayableView = this.f21651n;
        if (anythinkPlayableView != null) {
            return anythinkPlayableView.canBackPress();
        }
        return false;
    }

    @Override // com.anythink.expressad.video.signal.e
    public void configurationChanged(int i, int i4, int i9) {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f21653p;
        if (anythinkClickMiniCardView == null || anythinkClickMiniCardView.getVisibility() != 0) {
            return;
        }
        this.f21653p.resizeMiniCard(i, i4);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean endCardShowing() {
        return this.f21632B;
    }

    public boolean endcardIsPlayable() {
        AnythinkH5EndCardView anythinkH5EndCardView = this.f21655r;
        return anythinkH5EndCardView != null && anythinkH5EndCardView.isPlayable();
    }

    public AnythinkH5EndCardView getH5EndCardView() {
        AnythinkH5EndCardView anythinkH5EndCardView = this.f21655r;
        return anythinkH5EndCardView == null ? this.f21651n : anythinkH5EndCardView;
    }

    public d getReSetCampaign() {
        if (!this.f21600b.j() || !TextUtils.isEmpty(this.f21600b.J())) {
            return null;
        }
        int size = this.f21650U.size();
        int i = 0;
        int i4 = 0;
        while (true) {
            if (i4 < size) {
                if (this.f21650U.get(i4) != null && this.f21650U.get(i4).bh() == this.f21600b.bh()) {
                    i = i4 - 1;
                    break;
                }
                i4++;
            } else {
                break;
            }
        }
        if (i < 0 || i >= size || this.f21650U.get(i) == null) {
            return null;
        }
        return this.f21650U.get(i);
    }

    public boolean getShowingTransparent() {
        return this.f21634D;
    }

    public String getUnitID() {
        return this.f21660w;
    }

    public int getVideoInteractiveType() {
        return this.f21661x;
    }

    public int getVideoSkipTime() {
        return this.f21638H;
    }

    @Override // com.anythink.expressad.video.signal.e, com.anythink.expressad.video.signal.h
    public void handlerPlayableException(String str) {
        AnythinkH5EndCardView anythinkH5EndCardView = this.f21655r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.handlerPlayableException(str);
            if (!this.f21639I) {
                return;
            }
        }
        e();
    }

    @Override // com.anythink.expressad.video.signal.e
    public void hideAlertWebview() {
        if (isLast()) {
            return;
        }
        if (this.f21648S && !this.f21649T) {
            p();
            this.f21648S = false;
        }
        AnythinkAlertWebview anythinkAlertWebview = this.f21659v;
        if (anythinkAlertWebview == null || anythinkAlertWebview.getParent() == null) {
            return;
        }
        removeView(this.f21659v);
        AnythinkClickCTAView anythinkClickCTAView = this.f21652o;
        if (anythinkClickCTAView == null || anythinkClickCTAView.getParent() == null) {
            return;
        }
        setWrapContent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        setVisibility(0);
    }

    @Override // com.anythink.expressad.video.signal.h
    public void install(d dVar) {
        this.f21603e.a(105, dVar);
    }

    public boolean isLast() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        return viewGroup != null && viewGroup.indexOfChild(this) == 0;
    }

    @Override // com.anythink.expressad.video.signal.e
    public void ivRewardAdsWithoutVideo(String str) {
        this.f21603e.a(103, str);
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean miniCardLoaded() {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f21653p;
        return anythinkClickMiniCardView != null && anythinkClickMiniCardView.isLoadSuccess();
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean miniCardShowing() {
        return this.f21633C;
    }

    @Override // com.anythink.expressad.video.signal.h
    public void notifyCloseBtn(int i) {
        AnythinkPlayableView anythinkPlayableView = this.f21651n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.notifyCloseBtn(i);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f21655r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.notifyCloseBtn(i);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnythinkBaseView[] anythinkBaseViewArr = {this.f21651n, this.f21652o, this.f21653p, this.f21654q, this.f21655r, this.f21657t, this.f21658u, this.f21656s};
        for (int i = 0; i < 8; i++) {
            AnythinkBaseView anythinkBaseView = anythinkBaseViewArr[i];
            if (anythinkBaseView != null && (anythinkBaseView instanceof AnythinkClickMiniCardView)) {
                anythinkBaseView.onSelfConfigurationChanged(configuration);
            } else if (anythinkBaseView != null && anythinkBaseView.getVisibility() == 0 && anythinkBaseView.getParent() != null && !isLast()) {
                anythinkBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    public void onEndcardBackPress() {
        if (this.f21654q != null || this.f21657t != null) {
            this.f21603e.a(104, "");
            return;
        }
        if (this.f21658u != null) {
            this.f21603e.a(103, "");
            return;
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f21655r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.onBackPress();
        }
    }

    public void onMiniEndcardBackPress() {
        if (this.f21633C) {
            this.f21603e.a(107, "");
        }
    }

    public void onPlayableBackPress() {
        AnythinkPlayableView anythinkPlayableView = this.f21651n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.onBackPress();
        }
    }

    @Override // com.anythink.expressad.video.signal.h
    public void orientation(Configuration configuration) {
        AnythinkH5EndCardView[] anythinkH5EndCardViewArr = {this.f21651n, this.f21653p, this.f21655r, this.f21659v};
        for (int i = 0; i < 4; i++) {
            AnythinkH5EndCardView anythinkH5EndCardView = anythinkH5EndCardViewArr[i];
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getVisibility() == 0) {
                anythinkH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(final b bVar) {
        this.f21646Q = bVar;
        d dVar = this.f21600b;
        if (dVar != null) {
            if (dVar.K() == 2) {
                if (this.f21651n == null) {
                    this.f21651n = new AnythinkPlayableView(this.f21599a);
                }
                this.f21651n.setCloseDelayShowTime(this.f21663z);
                this.f21651n.setPlayCloseBtnTm(this.f21631A);
                this.f21651n.setCampaign(this.f21600b);
                this.f21651n.setNotifyListener(new AnonymousClass4(this.f21603e));
                this.f21651n.preLoadData(bVar);
            } else {
                b(this.f21661x);
                if (this.f21600b.j()) {
                    try {
                        a(bVar, Integer.valueOf(this.f21600b.G()));
                    } catch (Throwable th) {
                        th.getMessage();
                        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkContainerView.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                                anythinkContainerView.a(bVar, Integer.valueOf(anythinkContainerView.f21600b.G()));
                            }
                        });
                    }
                    v.f(this.f21600b.J());
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkContainerView.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                            anythinkContainerView.a(bVar, Integer.valueOf(anythinkContainerView.f21600b.G()));
                        }
                    }, getVideoSkipTime());
                }
            }
            o();
        }
    }

    @Override // com.anythink.expressad.video.signal.e, com.anythink.expressad.video.signal.h
    public void readyStatus(int i) {
        AnythinkH5EndCardView anythinkH5EndCardView = this.f21655r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.readyStatus(i);
        }
    }

    public void release() {
        AnythinkH5EndCardView anythinkH5EndCardView = this.f21655r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.release();
            this.f21655r = null;
        }
        AnythinkPlayableView anythinkPlayableView = this.f21651n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.release();
        }
        AnythinkLandingPageView anythinkLandingPageView = this.f21658u;
        if (anythinkLandingPageView != null) {
            anythinkLandingPageView.release();
        }
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.f21654q;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.clearMoreOfferBitmap();
            this.f21654q.release();
        }
        if (this.f21603e != null) {
            this.f21603e = null;
        }
    }

    @Override // com.anythink.expressad.video.signal.e
    public void resizeMiniCard(int i, int i4, int i9) {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f21653p;
        if (anythinkClickMiniCardView != null) {
            anythinkClickMiniCardView.resizeMiniCard(i, i4);
            this.f21653p.setRadius(i9);
            removeAllViews();
            setMatchParent();
            this.f21649T = true;
            bringToFront();
            m();
        }
    }

    public void setAnythinkClickMiniCardViewTransparent() {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f21653p;
        if (anythinkClickMiniCardView != null) {
            anythinkClickMiniCardView.setAnythinkClickMiniCardViewTransparent();
            this.f21653p.setAnythinkClickMiniCardViewClickable(false);
        }
    }

    public void setCloseDelayTime(int i) {
        this.f21663z = i;
    }

    public void setEndscreenType(int i) {
        this.f21662y = i;
    }

    public void setJSFactory(b bVar) {
        this.f21646Q = bVar;
    }

    public void setNotchPadding(int i, int i4, int i9, int i10, int i11) {
        String.format("%1s-%2s-%3s-%4s-%5s", Integer.valueOf(i4), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i));
        this.f21644O = i;
        this.f21640K = i4;
        this.f21641L = i9;
        this.f21642M = i10;
        this.f21643N = i11;
        this.f21645P = com.anythink.expressad.foundation.h.i.a(i, i4, i9, i10, i11);
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.f21654q;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.setNotchPadding(i4, i9, i10, i11);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f21655r;
        if (anythinkH5EndCardView != null && anythinkH5EndCardView.f21697s != null) {
            anythinkH5EndCardView.setNotchValue(this.f21645P, i4, i9, i10, i11);
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.core.express.d.a.a((WebView) this.f21655r.f21697s, "oncutoutfetched", Base64.encodeToString(this.f21645P.getBytes(), 0));
        }
        AnythinkPlayableView anythinkPlayableView = this.f21651n;
        if (anythinkPlayableView != null && anythinkPlayableView.f21697s != null) {
            anythinkPlayableView.setNotchValue(this.f21645P, i4, i9, i10, i11);
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.core.express.d.a.a((WebView) this.f21651n.f21697s, "oncutoutfetched", Base64.encodeToString(this.f21645P.getBytes(), 0));
        }
        AnyThinkOrderCampView anyThinkOrderCampView = this.f21647R;
        if (anyThinkOrderCampView != null) {
            anyThinkOrderCampView.setNotchPadding(i4, i9, i10, i11);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void setNotifyListener(a aVar) {
        super.setNotifyListener(aVar);
        AnythinkBaseView[] anythinkBaseViewArr = {this.f21651n, this.f21652o, this.f21653p, this.f21654q, this.f21655r, this.f21657t, this.f21658u, this.f21656s};
        for (int i = 0; i < 8; i++) {
            AnythinkBaseView anythinkBaseView = anythinkBaseViewArr[i];
            if (anythinkBaseView != null) {
                if (anythinkBaseView instanceof AnythinkClickMiniCardView) {
                    anythinkBaseView.setNotifyListener(new g(this.f21653p, aVar));
                } else {
                    anythinkBaseView.setNotifyListener(new i(aVar));
                }
            }
        }
    }

    public void setOnPause() {
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.f21654q;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.setOnPause();
        }
    }

    public void setOnResume() {
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.f21654q;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.setOnResume();
        }
    }

    public void setPlayCloseBtnTm(int i) {
        this.f21631A = i;
    }

    public void setRewardStatus(boolean z8) {
        this.J = z8;
    }

    public void setShowingTransparent(boolean z8) {
        this.f21634D = z8;
    }

    public void setUnitID(String str) {
        this.f21660w = str;
    }

    public void setVideoInteractiveType(int i) {
        d dVar = this.f21600b;
        if (dVar == null || !dVar.j()) {
            this.f21661x = i;
            return;
        }
        int a9 = c.a(this.f21600b);
        if (a9 == 100) {
            this.f21661x = i;
        } else {
            this.f21661x = a9;
        }
    }

    public void setVideoSkipTime(int i) {
        this.f21638H = i;
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean showAlertWebView() {
        AnythinkAlertWebview anythinkAlertWebview = this.f21659v;
        if (anythinkAlertWebview == null || !anythinkAlertWebview.isLoadSuccess()) {
            return false;
        }
        setMatchParent();
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup.indexOfChild(this) != viewGroup.getChildCount() - 1 && !this.f21649T) {
            removeAllViews();
            bringToFront();
            this.f21648S = true;
        }
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f21653p;
        if (anythinkClickMiniCardView != null && anythinkClickMiniCardView.getParent() != null) {
            return false;
        }
        if (this.f21659v == null) {
            o();
        }
        AnythinkAlertWebview anythinkAlertWebview2 = this.f21659v;
        if (anythinkAlertWebview2 != null && anythinkAlertWebview2.getParent() != null) {
            removeView(this.f21659v);
        }
        addView(this.f21659v);
        setBackgroundColor(0);
        this.f21659v.webviewshow();
        return true;
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showEndcard(int i) {
        d dVar = this.f21600b;
        if (dVar != null) {
            if (i == 1) {
                a aVar = this.f21603e;
                if (aVar != null) {
                    aVar.a(104, "");
                }
            } else if (i == 100) {
                if (dVar.K() == 2) {
                    this.f21635E = true;
                }
                a(this.f21651n);
                setMatchParent();
                i();
            } else if (i == 3) {
                removeAllViews();
                setMatchParent();
                if (this.f21657t == null) {
                    a(this.f21646Q, (Integer) 3);
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(13, -1);
                addView(this.f21657t, layoutParams);
                this.f21657t.notifyShowListener();
                this.f21649T = true;
                bringToFront();
            } else if (i == 4) {
                a aVar2 = this.f21603e;
                if (aVar2 != null) {
                    aVar2.a(113, "");
                }
                removeAllViews();
                setMatchParent();
                if (this.f21658u == null) {
                    a(this.f21646Q, (Integer) 4);
                }
                this.f21658u.setUnitId(this.f21660w);
                this.f21658u.preLoadData(this.f21646Q);
                addView(this.f21658u);
                this.f21649T = true;
                bringToFront();
            } else if (i != 5) {
                removeAllViews();
                setMatchParent();
                this.f21649T = true;
                bringToFront();
                e();
                a aVar3 = this.f21603e;
                if (aVar3 != null) {
                    aVar3.a(117, "");
                }
            } else {
                a aVar4 = this.f21603e;
                if (aVar4 != null) {
                    aVar4.a(106, "");
                }
            }
        }
        this.f21632B = true;
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showMiniCard(int i, int i4, int i9, int i10, int i11) {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f21653p;
        if (anythinkClickMiniCardView != null) {
            anythinkClickMiniCardView.setMiniCardLocation(i, i4, i9, i10);
            this.f21653p.setRadius(i11);
            this.f21653p.setCloseVisible(8);
            this.f21653p.setClickable(false);
            removeAllViews();
            setMatchParent();
            this.f21649T = true;
            bringToFront();
            m();
            if (this.f21637G) {
                return;
            }
            this.f21637G = true;
            this.f21603e.a(a.f21914z, "");
            this.f21603e.a(117, "");
        }
    }

    public void showOrderCampView() {
        AnyThinkOrderCampView anyThinkOrderCampView = new AnyThinkOrderCampView(this.f21599a);
        this.f21647R = anyThinkOrderCampView;
        anyThinkOrderCampView.setCampaignExes(this.f21650U);
        a aVar = this.f21603e;
        if (aVar != null && (aVar instanceof k)) {
            ((k) aVar).a(this.f21650U);
        }
        this.f21647R.setNotifyListener(new i(this.f21603e));
        this.f21647R.setRewarded(this.J);
        this.f21647R.setNotchPadding(this.f21640K, this.f21641L, this.f21642M, this.f21643N);
        this.f21647R.setCampOrderViewBuildCallback(new com.anythink.expressad.video.dynview.f.b() { // from class: com.anythink.expressad.video.module.AnythinkContainerView.3
            @Override // com.anythink.expressad.video.dynview.f.b
            public final void a() {
                a aVar2 = AnythinkContainerView.this.f21603e;
                if (aVar2 != null) {
                    aVar2.a(117, "");
                }
            }

            @Override // com.anythink.expressad.video.dynview.f.b
            public final void b() {
                if (AnythinkContainerView.this.f21600b.e() == 2) {
                    AnythinkContainerView.this.showVideoEndCover();
                } else {
                    AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                    anythinkContainerView.showEndcard(anythinkContainerView.f21600b.G());
                }
            }
        });
        this.f21647R.createView(this);
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showPlayableView() {
        if (this.f21600b == null || this.f21635E) {
            return;
        }
        removeAllViews();
        setMatchParent();
        if (this.f21651n == null) {
            preLoadData(this.f21646Q);
        }
        addView(this.f21651n);
        AnythinkPlayableView anythinkPlayableView = this.f21651n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.setUnitId(this.f21660w);
            d dVar = this.f21600b;
            if (dVar != null && dVar.I() && this.f21600b.K() == 2) {
                this.f21651n.setCloseVisible(0);
            }
            this.f21651n.setNotchValue(this.f21645P, this.f21640K, this.f21641L, this.f21642M, this.f21643N);
        }
        this.f21649T = true;
        bringToFront();
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showVideoClickView(int i) {
        d dVar;
        if (this.f21600b != null) {
            if (i == -1) {
                if (isLast() || endCardShowing()) {
                    return;
                }
                p();
                return;
            }
            if (i == 1) {
                if (this.f21632B) {
                    return;
                }
                AnythinkH5EndCardView anythinkH5EndCardView = this.f21655r;
                if (anythinkH5EndCardView != null && anythinkH5EndCardView.getParent() != null) {
                    removeView(this.f21655r);
                }
                AnythinkClickMiniCardView anythinkClickMiniCardView = this.f21653p;
                if (anythinkClickMiniCardView != null && anythinkClickMiniCardView.getParent() != null) {
                    removeView(this.f21653p);
                }
                AnythinkClickCTAView anythinkClickCTAView = this.f21652o;
                if (anythinkClickCTAView == null || anythinkClickCTAView.getParent() == null) {
                    try {
                        d dVar2 = this.f21600b;
                        if (dVar2 != null && dVar2.K() == 1) {
                            this.f21649T = true;
                            if (this.f21652o == null) {
                                b(-1);
                            }
                            if (this.f21652o != null && ((dVar = this.f21600b) == null || !dVar.j())) {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                                layoutParams.addRule(12, -1);
                                addView(this.f21652o, 0, layoutParams);
                            }
                        }
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                }
                if (isLast()) {
                    bringToFront();
                    return;
                }
                return;
            }
            if (i != 2) {
                return;
            }
            AnythinkClickCTAView anythinkClickCTAView2 = this.f21652o;
            if (anythinkClickCTAView2 != null && anythinkClickCTAView2.getParent() != null) {
                removeView(this.f21652o);
            }
            AnythinkAlertWebview anythinkAlertWebview = this.f21659v;
            if (anythinkAlertWebview == null || anythinkAlertWebview.getParent() == null) {
                AnythinkClickMiniCardView anythinkClickMiniCardView2 = this.f21653p;
                if (anythinkClickMiniCardView2 == null || anythinkClickMiniCardView2.getParent() == null) {
                    try {
                        d dVar3 = this.f21600b;
                        if (dVar3 != null && dVar3.K() == 1) {
                            setMatchParent();
                            m();
                        }
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
                if (!miniCardLoaded()) {
                    p();
                    return;
                }
                AnythinkH5EndCardView anythinkH5EndCardView2 = this.f21655r;
                if (anythinkH5EndCardView2 != null && anythinkH5EndCardView2.getParent() != null) {
                    removeView(this.f21655r);
                }
                a aVar = this.f21603e;
                if (aVar != null) {
                    aVar.a(112, "");
                }
                d dVar4 = this.f21600b;
                if (dVar4 != null && !dVar4.ay()) {
                    this.f21600b.az();
                    com.anythink.expressad.video.module.b.a.e(this.f21599a, this.f21600b);
                }
                if (this.f21634D) {
                    a aVar2 = this.f21603e;
                    if (aVar2 != null) {
                        aVar2.a(115, "");
                    }
                } else {
                    this.f21649T = true;
                    bringToFront();
                    webviewshow();
                    onConfigurationChanged(getResources().getConfiguration());
                }
                this.f21633C = true;
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showVideoEndCover() {
        removeAllViews();
        setMatchParent();
        AnythinkVideoEndCoverView anythinkVideoEndCoverView = this.f21656s;
        if (anythinkVideoEndCoverView == null) {
            b bVar = this.f21646Q;
            this.f21646Q = bVar;
            if (anythinkVideoEndCoverView == null) {
                AnythinkVideoEndCoverView anythinkVideoEndCoverView2 = new AnythinkVideoEndCoverView(this.f21599a);
                this.f21656s = anythinkVideoEndCoverView2;
                anythinkVideoEndCoverView2.setCampaign(this.f21600b);
                this.f21656s.setNotifyListener(new i(this.f21603e));
                this.f21656s.preLoadData(bVar);
            }
        }
        addView(this.f21656s);
        onConfigurationChanged(getResources().getConfiguration());
        this.f21649T = true;
        bringToFront();
    }

    @Override // com.anythink.expressad.video.signal.h
    public void toggleCloseBtn(int i) {
        AnythinkPlayableView anythinkPlayableView = this.f21651n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.toggleCloseBtn(i);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f21655r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.toggleCloseBtn(i);
        }
    }

    public void triggerCloseBtn(String str) {
        a aVar;
        if (this.f21600b == null || (aVar = this.f21603e) == null) {
            return;
        }
        aVar.a(122, "");
        this.f21603e.a(104, "");
    }

    @Override // com.anythink.expressad.video.signal.h
    public void webviewshow() {
        AnythinkH5EndCardView[] anythinkH5EndCardViewArr = {this.f21651n, this.f21653p, this.f21655r, this.f21659v};
        for (int i = 0; i < 4; i++) {
            AnythinkH5EndCardView anythinkH5EndCardView = anythinkH5EndCardViewArr[i];
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getVisibility() == 0 && anythinkH5EndCardView.getParent() != null && !isLast()) {
                anythinkH5EndCardView.webviewshow();
            }
        }
    }

    private boolean a() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        return viewGroup.indexOfChild(this) == viewGroup.getChildCount() - 1;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            a(view);
            super.addView(view, layoutParams);
        }
    }

    private static void a(View view) {
        if (view != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    private void b(b bVar) {
        this.f21646Q = bVar;
        if (this.f21656s == null) {
            AnythinkVideoEndCoverView anythinkVideoEndCoverView = new AnythinkVideoEndCoverView(this.f21599a);
            this.f21656s = anythinkVideoEndCoverView;
            anythinkVideoEndCoverView.setCampaign(this.f21600b);
            this.f21656s.setNotifyListener(new i(this.f21603e));
            this.f21656s.preLoadData(bVar);
        }
    }

    private void a(b bVar) {
        if (this.f21651n == null) {
            this.f21651n = new AnythinkPlayableView(this.f21599a);
        }
        this.f21651n.setCloseDelayShowTime(this.f21663z);
        this.f21651n.setPlayCloseBtnTm(this.f21631A);
        this.f21651n.setCampaign(this.f21600b);
        this.f21651n.setNotifyListener(new AnonymousClass4(this.f21603e));
        this.f21651n.preLoadData(bVar);
    }

    private void b(int i) {
        if (i != -3) {
            if (i != -2) {
                if (this.f21652o == null) {
                    AnythinkClickCTAView anythinkClickCTAView = new AnythinkClickCTAView(this.f21599a);
                    this.f21652o = anythinkClickCTAView;
                    anythinkClickCTAView.setCampaign(this.f21600b);
                    this.f21652o.setUnitId(this.f21660w);
                    this.f21652o.setNotifyListener(new i(this.f21603e));
                    this.f21652o.preLoadData(this.f21646Q);
                    return;
                }
                return;
            }
            d dVar = this.f21600b;
            if (dVar == null || dVar.G() != 2) {
                return;
            }
            if (this.f21653p == null) {
                this.f21653p = new AnythinkClickMiniCardView(this.f21599a);
            }
            this.f21653p.setCampaign(this.f21600b);
            AnythinkClickMiniCardView anythinkClickMiniCardView = this.f21653p;
            anythinkClickMiniCardView.setNotifyListener(new g(anythinkClickMiniCardView, this.f21603e));
            this.f21653p.preLoadData(this.f21646Q);
            setMatchParent();
            m();
            p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar, Integer num) {
        a aVar;
        d dVar;
        this.f21646Q = bVar;
        d dVar2 = this.f21600b;
        if (dVar2 != null) {
            if (num == null) {
                num = Integer.valueOf(dVar2.G());
            }
            if (!isLast()) {
                p();
            }
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue == 3) {
                    if (this.f21657t == null) {
                        this.f21657t = new AnythinkVastEndCardView(this.f21599a);
                    }
                    this.f21657t.setCampaign(this.f21600b);
                    this.f21657t.setNotifyListener(new l(this.f21603e));
                    this.f21657t.preLoadData(bVar);
                    return;
                }
                if (intValue == 4) {
                    if (this.f21658u == null) {
                        this.f21658u = new AnythinkLandingPageView(this.f21599a);
                    }
                    this.f21658u.setCampaign(this.f21600b);
                    this.f21658u.setNotifyListener(new i(this.f21603e));
                    return;
                }
                if (intValue != 5) {
                    if (this.f21662y == 2) {
                        boolean j9 = this.f21600b.j();
                        boolean f6 = v.f(this.f21600b.J());
                        if ((!j9 || f6 || (dVar = this.f21600b) == null || dVar.I()) && this.f21600b.e() != 2) {
                            if (this.f21655r == null) {
                                this.f21655r = new AnythinkH5EndCardView(this.f21599a);
                            }
                            if (this.f21600b.k() == 5 && (aVar = this.f21603e) != null && (aVar instanceof k)) {
                                ((k) aVar).a(this.f21600b);
                            }
                            this.f21655r.setCampaign(this.f21600b);
                            this.f21655r.setCloseDelayShowTime(this.f21663z);
                            this.f21655r.setNotifyListener(new i(this.f21603e));
                            this.f21655r.setUnitId(this.f21660w);
                            this.f21655r.setNotchValue(this.f21645P, this.f21640K, this.f21641L, this.f21642M, this.f21643N);
                            this.f21655r.preLoadData(bVar);
                            if (this.f21634D) {
                                return;
                            }
                            addView(this.f21655r);
                            return;
                        }
                        return;
                    }
                    d dVar3 = this.f21600b;
                    int c4 = (dVar3 == null || dVar3.N() == null) ? 0 : this.f21600b.N().c();
                    AnythinkNativeEndCardView anythinkNativeEndCardView = this.f21654q;
                    if (anythinkNativeEndCardView == null && anythinkNativeEndCardView == null) {
                        if (this.f21600b.j()) {
                            q();
                        } else {
                            AnythinkNativeEndCardView anythinkNativeEndCardView2 = new AnythinkNativeEndCardView(this.f21599a, null, false, -1, this.f21600b.e() == 2, c4, this.f21600b.au());
                            this.f21654q = anythinkNativeEndCardView2;
                            anythinkNativeEndCardView2.setCampaign(this.f21600b);
                        }
                    }
                    this.f21654q.setLayout();
                    this.f21654q.setCampaign(this.f21600b);
                    this.f21654q.setUnitId(this.f21660w);
                    this.f21654q.setCloseBtnDelay(this.f21663z);
                    this.f21654q.setNotifyListener(new i(this.f21603e));
                    this.f21654q.preLoadData(bVar);
                    this.f21654q.setNotchPadding(this.f21640K, this.f21641L, this.f21642M, this.f21643N);
                }
            }
        }
    }

    public AnythinkContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21662y = 1;
        this.f21663z = 1;
        this.f21631A = 1;
        this.f21632B = false;
        this.f21633C = false;
        this.f21634D = false;
        this.f21635E = false;
        this.f21636F = true;
        this.f21637G = false;
        this.f21639I = false;
        this.J = false;
        this.f21648S = false;
        this.f21649T = false;
        this.f21650U = new ArrayList();
    }

    private void b(AnythinkH5EndCardView... anythinkH5EndCardViewArr) {
        for (int i = 0; i < 4; i++) {
            AnythinkH5EndCardView anythinkH5EndCardView = anythinkH5EndCardViewArr[i];
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getVisibility() == 0) {
                anythinkH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }

    private void a(a aVar, AnythinkBaseView... anythinkBaseViewArr) {
        for (int i = 0; i < 8; i++) {
            AnythinkBaseView anythinkBaseView = anythinkBaseViewArr[i];
            if (anythinkBaseView != null) {
                if (anythinkBaseView instanceof AnythinkClickMiniCardView) {
                    anythinkBaseView.setNotifyListener(new g(this.f21653p, aVar));
                } else {
                    anythinkBaseView.setNotifyListener(new i(aVar));
                }
            }
        }
    }

    private void a(Configuration configuration, AnythinkBaseView... anythinkBaseViewArr) {
        for (int i = 0; i < 8; i++) {
            AnythinkBaseView anythinkBaseView = anythinkBaseViewArr[i];
            if (anythinkBaseView != null && (anythinkBaseView instanceof AnythinkClickMiniCardView)) {
                anythinkBaseView.onSelfConfigurationChanged(configuration);
            } else if (anythinkBaseView != null && anythinkBaseView.getVisibility() == 0 && anythinkBaseView.getParent() != null && !isLast()) {
                anythinkBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    private void a(AnythinkH5EndCardView... anythinkH5EndCardViewArr) {
        for (int i = 0; i < 4; i++) {
            AnythinkH5EndCardView anythinkH5EndCardView = anythinkH5EndCardViewArr[i];
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getVisibility() == 0 && anythinkH5EndCardView.getParent() != null && !isLast()) {
                anythinkH5EndCardView.webviewshow();
            }
        }
    }
}
