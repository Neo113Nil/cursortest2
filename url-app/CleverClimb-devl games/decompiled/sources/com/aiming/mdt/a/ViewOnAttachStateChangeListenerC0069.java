package com.aiming.mdt.a;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.aiming.mdt.core.AbstractC0253;
import com.aiming.mdt.core.C0261;
import com.aiming.mdt.mediation.CustomNativeEvent;
import com.aiming.mdt.nativead.AdInfo;
import com.aiming.mdt.nativead.NativeAdListener;
import com.aiming.mdt.nativead.NativeAdView;
import com.aiming.mdt.utils.C0277;
import com.aiming.mdt.utils.C0279;
import java.util.Map;

/* renamed from: com.aiming.mdt.a.ʻʽʾʿˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0069 extends AbstractC0253 implements View.OnAttachStateChangeListener {

    /* renamed from: ʻʼʽʾ, reason: contains not printable characters */
    private NativeAdView f157;

    /* renamed from: ʻʼʾ, reason: contains not printable characters */
    private boolean f158;

    /* renamed from: ʽʾ, reason: contains not printable characters */
    private NativeAdListener f159;

    public ViewOnAttachStateChangeListenerC0069(Activity activity, String str, NativeAdListener nativeAdListener) {
        super(activity, str);
        this.f159 = nativeAdListener;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f158 || this.f785 == null) {
            return;
        }
        this.f158 = true;
        m889(this.f785);
        C0279.m949(this.f782, this.f785.m304());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f158 = false;
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʻ */
    protected final C0137 mo66() {
        return new C0137(this.f782).m523(1);
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʻʼ */
    protected final int mo67() {
        return 1;
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʻʼʽ */
    protected final void mo68() {
        this.f159.onAdClicked();
    }

    @Override // com.aiming.mdt.core.AbstractC0253
    /* renamed from: ʻʼʽ */
    protected final void mo69(C0088 c0088) {
        if (!m894()) {
            m882(c0088, "Activity is null or destroyed");
            return;
        }
        if (TextUtils.isEmpty(c0088.m304())) {
            m882(c0088, "instance key is empty");
            return;
        }
        CustomNativeEvent customNativeEvent = (CustomNativeEvent) C0261.m906().m910(1, c0088);
        if (customNativeEvent == null) {
            m882(c0088, "create mediation adapter failed");
            return;
        }
        Map<String, String> m945 = C0277.m945(this.f782, c0088);
        if (this.f780 != null) {
            m945.put("ad_mark", String.valueOf(this.f780.m111()));
        }
        c0088.m306(System.currentTimeMillis());
        customNativeEvent.loadAd(this.f788.get(), m945);
        m896(c0088);
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final void m219(NativeAdView nativeAdView) {
        if (this.f779) {
            return;
        }
        this.f157 = nativeAdView;
        if (this.f785 != null) {
            CustomNativeEvent customNativeEvent = (CustomNativeEvent) C0261.m906().m910(1, this.f785);
            if (customNativeEvent != null) {
                this.f157.addOnAttachStateChangeListener(this);
                customNativeEvent.registerNativeView(nativeAdView);
            }
        }
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʻʽ */
    protected final void mo70(String str) {
        if (this.f159 != null) {
            this.f159.onAdFailed(str);
        }
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʻʽ */
    public final boolean mo71() {
        return mo76(this.f785);
    }

    @Override // com.aiming.mdt.core.AbstractC0253, com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʼʽ */
    public final void mo73() {
        if (this.f157 != null) {
            this.f157.removeAllViews();
            this.f157 = null;
        }
        if (this.f785 != null) {
            CustomNativeEvent customNativeEvent = (CustomNativeEvent) C0261.m906().m910(1, this.f785);
            if (customNativeEvent != null) {
                customNativeEvent.destroy(this.f788.get());
            }
            C0261.m906().m914(this.f785);
        }
        m904();
        super.mo73();
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʽ */
    protected final void mo74() {
        if (this.f159 == null) {
            return;
        }
        if (this.f785 == null) {
            this.f159.onAdFailed("No Fill");
            return;
        }
        Object m312 = this.f785.m312();
        if (!(m312 instanceof AdInfo)) {
            this.f159.onAdFailed("No Fill");
        } else {
            this.f159.onAdReady((AdInfo) m312);
        }
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʽ */
    protected final void mo75(boolean z) {
    }

    @Override // com.aiming.mdt.core.AbstractC0253
    /* renamed from: ʾ */
    protected final boolean mo76(C0088 c0088) {
        return (c0088 == null || c0088.m312() == null || !(c0088.m312() instanceof AdInfo)) ? false : true;
    }
}
