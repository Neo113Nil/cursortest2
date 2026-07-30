package com.anythink.basead.ui.thirdparty;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.anythink.basead.ui.BaseMediaATView;
import com.anythink.basead.ui.MediaATView;
import com.anythink.core.api.ATNativeAdInfo;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.l.e.a.d;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.q;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ThirdPartyNativeTemplateView extends MediaATView implements d {

    /* renamed from: r, reason: collision with root package name */
    ATNativeAdInfo.AdPrepareInfo f11506r;

    /* renamed from: s, reason: collision with root package name */
    private BaseAd f11507s;

    public ThirdPartyNativeTemplateView(Context context, w wVar, x xVar, boolean z8, BaseMediaATView.a aVar, BaseAd baseAd) {
        super(context, wVar, xVar, z8, aVar);
        this.f11507s = baseAd;
    }

    @Override // com.anythink.basead.ui.MediaATView
    public final void a(int i, int i4) {
        ViewGroup viewGroup = (ViewGroup) findViewById(q.a(getContext(), "myoffer_media_ad_main_image_container", "id"));
        View adMediaView = this.f11507s.getAdMediaView(viewGroup);
        if (viewGroup == null || adMediaView == null) {
            super.a(i, i4);
        } else {
            if (this.f9985c.f14325o.J() != 0) {
                c.c(adMediaView);
            }
            am.a(adMediaView);
            viewGroup.addView(adMediaView, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f11507s.setVideoMute(true);
        View findViewById = findViewById(q.a(getContext(), "myoffer_ad_lable", "id"));
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
    }

    @Override // com.anythink.core.common.l.e.a.d
    public void destroyNativeAd() {
        destroyPlayerView(0);
    }

    public ATNativeAdInfo.AdPrepareInfo getAdPrepareInfo() {
        return this.f11506r;
    }

    @Override // com.anythink.basead.ui.MediaATView, com.anythink.basead.ui.BaseMediaATView
    public void init(int i, int i4, int i9) {
        super.init(i, i4, i9);
        ATNativeAdInfo.AdPrepareInfo adPrepareInfo = new ATNativeAdInfo.AdPrepareInfo();
        this.f11506r = adPrepareInfo;
        adPrepareInfo.setTitleView(((MediaATView) this).f10250j);
        this.f11506r.setDescView(this.f10255o);
        this.f11506r.setIconView(this.f10254n);
        this.f11506r.setMainImageView(this.f10253m);
        this.f11506r.setCtaView(((MediaATView) this).f10251k);
        this.f11506r.setParentView(this);
        this.f11506r.setCloseView(this.f9989g);
        this.f11506r.setAdLogoView(this.f10256p);
        this.f11506r.getClickViewList().clear();
        ArrayList arrayList = new ArrayList();
        arrayList.add(((MediaATView) this).f10251k);
        if (this.f9985c.f14325o.J() == 0) {
            arrayList.add(((MediaATView) this).f10250j);
            arrayList.add(this.f10255o);
            arrayList.add(this.f10254n);
            arrayList.add(this.f10253m);
            arrayList.add(this);
        }
        this.f11506r.setClickViewList(arrayList);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(q.a(getContext(), 32.0f), q.a(getContext(), 12.0f));
        layoutParams.gravity = 85;
        this.f11506r.setChoiceViewLayoutParams(layoutParams);
        View adIconView = this.f11507s.getAdIconView();
        RoundImageView roundImageView = this.f10254n;
        if (roundImageView != null && adIconView != null) {
            if (roundImageView.getParent() != null && (this.f10254n.getParent() instanceof ViewGroup)) {
                am.a(adIconView);
                this.f10254n.setVisibility(0);
                ((ViewGroup) this.f10254n.getParent()).addView(adIconView, this.f10254n.getLayoutParams());
            }
            if (this.f9985c.f14325o.J() != 0) {
                c.c(adIconView);
            }
        }
        View adLogoView = this.f11507s.getAdLogoView();
        ImageView imageView = this.f10256p;
        if (imageView != null && adLogoView != null && imageView.getParent() != null && (this.f10256p.getParent() instanceof ViewGroup)) {
            am.a(adLogoView);
            this.f10256p.setVisibility(4);
            ((ViewGroup) this.f10256p.getParent()).addView(adLogoView, this.f10256p.getLayoutParams());
        }
        if (this.i != null) {
            com.anythink.core.basead.b.b bVar = new com.anythink.core.basead.b.b();
            this.i.a(this.f11507s, bVar, true);
            this.f11506r.setDomainView(bVar.h());
            this.f11506r.setWarningView(bVar.i());
            this.f11506r.setAdFromView(bVar.f());
        }
        setIsMuted(true);
    }

    @Override // com.anythink.basead.ui.MediaATView
    public final boolean a() {
        return this.f11507s.getAdIconView() == null && super.a();
    }
}
