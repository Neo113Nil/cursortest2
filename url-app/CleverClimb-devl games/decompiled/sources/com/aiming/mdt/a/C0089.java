package com.aiming.mdt.a;

import android.app.Activity;
import android.text.TextUtils;
import com.aiming.mdt.a.C0111;
import com.aiming.mdt.adt.C0226;
import com.aiming.mdt.core.AbstractC0253;
import com.aiming.mdt.core.C0261;
import com.aiming.mdt.interstitial.InterstitialAdListener;
import com.aiming.mdt.mediation.CustomInterstitialEvent;
import com.aiming.mdt.utils.AdLog;
import com.aiming.mdt.utils.C0277;
import com.aiming.mdt.utils.C0279;
import com.aiming.mdt.utils.C0282;

/* renamed from: com.aiming.mdt.a.ʻʾʿˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0089 extends AbstractC0253 {

    /* renamed from: ʻʼʽʾ, reason: contains not printable characters */
    private String f245;

    /* renamed from: ʽʾ, reason: contains not printable characters */
    private InterstitialAdListener f246;

    public C0089(Activity activity, String str, InterstitialAdListener interstitialAdListener) {
        super(activity, str);
        this.f246 = interstitialAdListener;
    }

    @Override // com.aiming.mdt.mediation.Callback
    protected final void onInsShow(String str, String str2, Object obj) {
        super.onInsShow(str, str2, obj);
        C0088 c0088 = m891(str, str2);
        if (c0088 == null) {
            return;
        }
        m889(c0088);
        C0279.m949(this.f782, str);
        int m313 = c0088.m313();
        if (m313 != 0) {
            C0177.m675(C0226.m829(), m313, this.f782, c0088.m311(), obj, new C0181(this, c0088, str, m313));
            return;
        }
        String str3 = (String) C0162.m619().m622(str, String.class);
        StringBuilder sb = new StringBuilder("PackageName:");
        sb.append(str);
        sb.append(":");
        sb.append(str3);
        C0282.m971(sb.toString());
        if (this.f780 == null || this.f780.m119() != 1) {
            return;
        }
        C0193.m726().m729(this.f782, m313, str3);
    }

    @Override // com.aiming.mdt.core.AbstractC0253, com.aiming.mdt.mediation.Callback
    protected final void onInstanceClick(String str, String str2) {
        super.onInstanceClick(str, str2);
        C0088 c0088 = m891(str, str2);
        if (c0088 == null) {
            return;
        }
        C0177.m677(this.f245, c0088.m313(), this.f782, c0088.m311());
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʻ */
    protected final C0137 mo66() {
        return new C0137(this.f782).m523(4);
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʻʼ */
    protected final int mo67() {
        return 4;
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʻʼʽ */
    protected final void mo68() {
        if (this.f246 != null) {
            this.f246.onAdClicked();
        }
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
        CustomInterstitialEvent customInterstitialEvent = (CustomInterstitialEvent) C0261.m906().m910(4, c0088);
        if (customInterstitialEvent == null) {
            m882(c0088, "create mediation adapter failed");
            return;
        }
        if (customInterstitialEvent.isReady()) {
            m899(c0088);
            m879(false, c0088, c0088.m312());
        } else {
            c0088.m306(System.currentTimeMillis());
            customInterstitialEvent.loadAd(this.f788.get(), C0277.m945(this.f782, c0088));
            m896(c0088);
        }
    }

    /* renamed from: ʻʼʿ, reason: contains not printable characters */
    public final void m320() {
        try {
            if (this.f779) {
                AdLog.getSingleton().LogD("ad object is destroyed");
                return;
            }
            if (((AbstractC0253) this).f776 != null) {
                AdLog.getSingleton().LogD("ad is showing");
                return;
            }
            if (!m894()) {
                m893("Activity is null or destroyed");
                return;
            }
            C0088 c0088 = m880();
            if (c0088 == null) {
                m893("Display ad error, the ad is not ready");
                return;
            }
            CustomInterstitialEvent customInterstitialEvent = (CustomInterstitialEvent) C0261.m906().m910(4, c0088);
            if (customInterstitialEvent == null) {
                m893("Display ad error, the ad is not ready");
                return;
            }
            C0049.m149().m153(this.f782, c0088);
            ((AbstractC0253) this).f776 = c0088;
            customInterstitialEvent.show(this.f788.get());
        } catch (Exception e) {
            C0282.m972("interstitial showAd", e);
            C0076.m232().m236(e);
            m893("Display ad error, the ad is not ready");
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final void m321(InterstitialAdListener interstitialAdListener) {
        this.f246 = interstitialAdListener;
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʻʽ */
    protected final void mo70(String str) {
        if (this.f246 != null) {
            this.f246.onAdFailed(str);
        }
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʻʽ */
    public final boolean mo71() {
        return (this.f779 || !m894() || m880() == null) ? false : true;
    }

    @Override // com.aiming.mdt.core.AbstractC0253
    /* renamed from: ʼ */
    protected final void mo139(Activity activity) {
        super.mo139(activity);
    }

    @Override // com.aiming.mdt.core.AbstractC0253, com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʼʽ */
    public final void mo73() {
        this.f246 = null;
        C0111.C0112.f321.m422(this.f782);
        super.mo73();
    }

    @Override // com.aiming.mdt.core.AbstractC0253
    /* renamed from: ʼʽ */
    protected final void mo140(C0088 c0088) {
        super.mo140(c0088);
        C0261.m906().m913(this.f782, c0088);
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʽ */
    protected final void mo74() {
        if (this.f246 != null) {
            this.f246.onAdReady();
        }
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʽ */
    protected final void mo75(boolean z) {
        if (((AbstractC0253) this).f776 != null) {
            C0111.C0112.f321.m421(this.f788.get(), this.f782, ((AbstractC0253) this).f776);
            ((AbstractC0253) this).f776 = null;
        }
        if (this.f246 != null) {
            this.f246.onAdClosed();
        }
    }

    @Override // com.aiming.mdt.core.AbstractC0253
    /* renamed from: ʾ */
    protected final boolean mo76(C0088 c0088) {
        if (c0088 == null) {
            return false;
        }
        try {
            CustomInterstitialEvent customInterstitialEvent = (CustomInterstitialEvent) C0261.m906().m910(4, c0088);
            if (customInterstitialEvent != null) {
                if (customInterstitialEvent.isReady()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
