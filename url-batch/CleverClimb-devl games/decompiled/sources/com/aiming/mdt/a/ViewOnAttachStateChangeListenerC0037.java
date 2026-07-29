package com.aiming.mdt.a;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.aiming.mdt.banner.BannerAdListener;
import com.aiming.mdt.core.AbstractC0253;
import com.aiming.mdt.core.C0261;
import com.aiming.mdt.mediation.CustomBannerEvent;
import com.aiming.mdt.utils.C0277;
import com.aiming.mdt.utils.C0279;

/* renamed from: com.aiming.mdt.a.ʻʼʽʿˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0037 extends AbstractC0253 implements View.OnAttachStateChangeListener {

    /* renamed from: ʼʽʾ, reason: contains not printable characters */
    private BannerAdListener f56;

    public ViewOnAttachStateChangeListenerC0037(Activity activity, String str, BannerAdListener bannerAdListener) {
        super(activity, str);
        this.f56 = bannerAdListener;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f785 == null) {
            return;
        }
        m889(this.f785);
        C0279.m949(this.f782, this.f785.m304());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʻ, reason: contains not printable characters */
    protected final C0137 mo66() {
        return new C0137(this.f782).m523(0);
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʻʼ, reason: contains not printable characters */
    protected final int mo67() {
        return 0;
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    protected final void mo68() {
        if (this.f56 != null) {
            this.f56.onAdClicked();
        }
    }

    @Override // com.aiming.mdt.core.AbstractC0253
    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    protected final void mo69(C0088 c0088) {
        if (!m894()) {
            m882(c0088, "Activity is null or destroyed");
            return;
        }
        if (TextUtils.isEmpty(c0088.m304())) {
            m882(c0088, "instance key is empty");
            return;
        }
        CustomBannerEvent customBannerEvent = (CustomBannerEvent) C0261.m906().m910(0, c0088);
        if (customBannerEvent == null) {
            m882(c0088, "create mediation adapter failed");
            return;
        }
        c0088.m306(System.currentTimeMillis());
        customBannerEvent.loadAd(this.f788.get(), C0277.m945(this.f782, c0088));
        m896(c0088);
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʻʽ, reason: contains not printable characters */
    protected final void mo70(String str) {
        if (this.f56 != null) {
            this.f56.onAdFailed(str);
        }
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final boolean mo71() {
        return mo76(this.f785);
    }

    @Override // com.aiming.mdt.core.AbstractC0253
    /* renamed from: ʻʾ, reason: contains not printable characters */
    protected final void mo72(C0088 c0088) {
        super.mo72(c0088);
        CustomBannerEvent customBannerEvent = (CustomBannerEvent) C0261.m906().m910(0, c0088);
        if (customBannerEvent != null && m894()) {
            customBannerEvent.destroy(this.f788.get());
        }
        c0088.m297((Object) null);
    }

    @Override // com.aiming.mdt.core.AbstractC0253, com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʼʽ, reason: contains not printable characters */
    public final void mo73() {
        if (this.f785 != null && m894()) {
            CustomBannerEvent customBannerEvent = (CustomBannerEvent) C0261.m906().m910(0, this.f785);
            if (customBannerEvent != null) {
                customBannerEvent.destroy(this.f788.get());
            }
            C0261.m906().m914(this.f785);
        }
        m904();
        super.mo73();
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʽ, reason: contains not printable characters */
    protected final void mo74() {
        if (this.f56 == null) {
            return;
        }
        if (this.f785 == null) {
            this.f56.onAdFailed("No Fill");
            return;
        }
        if (!(this.f785.m312() instanceof View)) {
            this.f56.onAdFailed("No Fill");
            return;
        }
        View view = (View) this.f785.m312();
        view.addOnAttachStateChangeListener(this);
        m883();
        this.f56.onAdReady(view);
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʽ, reason: contains not printable characters */
    protected final void mo75(boolean z) {
    }

    @Override // com.aiming.mdt.core.AbstractC0253
    /* renamed from: ʾ, reason: contains not printable characters */
    protected final boolean mo76(C0088 c0088) {
        return (c0088 == null || c0088.m312() == null || !(c0088.m312() instanceof View)) ? false : true;
    }
}
