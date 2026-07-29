package com.aiming.mdt.a;

import android.app.Activity;
import android.text.TextUtils;
import com.aiming.mdt.a.C0027;
import com.aiming.mdt.adt.C0226;
import com.aiming.mdt.core.AbstractC0253;
import com.aiming.mdt.core.C0261;
import com.aiming.mdt.mediation.CustomVideoEvent;
import com.aiming.mdt.utils.AdLog;
import com.aiming.mdt.utils.C0271;
import com.aiming.mdt.utils.C0277;
import com.aiming.mdt.utils.C0279;
import com.aiming.mdt.utils.C0280;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.video.VideoAdListener;

/* renamed from: com.aiming.mdt.a.ʻʼʾʿˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0046 extends AbstractC0253 {

    /* renamed from: ʻʽʾ, reason: contains not printable characters */
    private String f87;

    /* renamed from: ʼʽʾ, reason: contains not printable characters */
    private VideoAdListener f88;

    /* renamed from: ʽʾ, reason: contains not printable characters */
    private String f89;

    public C0046(Activity activity, String str, VideoAdListener videoAdListener) {
        super(activity, str);
        this.f88 = videoAdListener;
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    protected final void onAdRewarded() {
        super.onAdRewarded();
        if (this.f88 != null) {
            this.f88.onAdRewarded();
        }
    }

    @Override // com.aiming.mdt.mediation.Callback
    protected final void onInsRewarded(int i, String str, String str2, String str3) {
        super.onInsRewarded(i, str, str2, str3);
        if (TextUtils.isEmpty(this.f87)) {
            m895();
            return;
        }
        String str4 = this.f782;
        String str5 = this.f87;
        try {
            String m960 = C0280.m960(2, str5);
            if (TextUtils.isEmpty(m960)) {
                return;
            }
            C0026.m23().m672(m960).m668(C0226.m826()).m665(new C0271(C0280.m963(2, str4, str5))).m671(30000).m667(60000).m669(true).m670(C0226.m829());
        } catch (Exception e) {
            C0282.m970("HttpVPC error ", e);
            C0076.m232().m236(e);
        }
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
            C0177.m675(C0226.m829(), m313, this.f782, c0088.m311(), obj, new C0153(this, str, c0088, m313));
            return;
        }
        String str3 = (String) C0162.m619().m622(this.f782, String.class);
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
        C0177.m677(this.f89, c0088.m313(), this.f782, c0088.m311());
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʻ */
    protected final C0137 mo66() {
        return new C0137(this.f782).m523(2);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m136(VideoAdListener videoAdListener) {
        this.f88 = videoAdListener;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m137(String str) {
        this.f87 = str;
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʻʼ */
    protected final int mo67() {
        return 2;
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʻʼʽ */
    protected final void mo68() {
        if (this.f88 != null) {
            this.f88.onAdClicked();
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
        CustomVideoEvent customVideoEvent = (CustomVideoEvent) C0261.m906().m910(2, c0088);
        if (customVideoEvent == null) {
            m882(c0088, "create mediation adapter failed");
            return;
        }
        if (customVideoEvent.isReady()) {
            m899(c0088);
            m879(false, c0088, c0088.m312());
        } else {
            c0088.m306(System.currentTimeMillis());
            customVideoEvent.loadAd(this.f788.get(), C0277.m945(this.f782, c0088));
            m896(c0088);
        }
    }

    /* renamed from: ʻʼʿ, reason: contains not printable characters */
    public final void m138() {
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
            CustomVideoEvent customVideoEvent = (CustomVideoEvent) C0261.m906().m910(2, c0088);
            if (customVideoEvent == null) {
                m893("Display ad error, the ad is not ready");
                return;
            }
            C0049.m149().m153(this.f782, c0088);
            ((AbstractC0253) this).f776 = c0088;
            customVideoEvent.show(this.f788.get());
        } catch (Exception e) {
            C0282.m972("video showAd", e);
            C0076.m232().m236(e);
            m893("Display ad error, the ad is not ready");
        }
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʻʽ */
    protected final void mo70(String str) {
        if (this.f88 != null) {
            this.f88.onAdFailed(str);
        }
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʻʽ */
    public final boolean mo71() {
        return (this.f779 || !m894() || m880() == null) ? false : true;
    }

    @Override // com.aiming.mdt.core.AbstractC0253
    /* renamed from: ʼ, reason: contains not printable characters */
    protected final void mo139(Activity activity) {
        super.mo139(activity);
    }

    @Override // com.aiming.mdt.core.AbstractC0253, com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʼʽ */
    public final void mo73() {
        this.f88 = null;
        C0027.C0028.f19.m26(this.f782);
        super.mo73();
    }

    @Override // com.aiming.mdt.core.AbstractC0253
    /* renamed from: ʼʽ, reason: contains not printable characters */
    protected final void mo140(C0088 c0088) {
        super.mo140(c0088);
        C0261.m906().m913(this.f782, c0088);
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʽ */
    protected final void mo74() {
        if (this.f88 != null) {
            this.f88.onAdReady();
        }
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʽ */
    protected final void mo75(boolean z) {
        if (((AbstractC0253) this).f776 != null) {
            C0027.C0028.f19.m28(this.f788.get(), this.f782, ((AbstractC0253) this).f776);
            ((AbstractC0253) this).f776 = null;
        }
        if (this.f88 != null) {
            this.f88.onAdClosed(z);
        }
    }

    @Override // com.aiming.mdt.core.AbstractC0253
    /* renamed from: ʾ */
    protected final boolean mo76(C0088 c0088) {
        if (c0088 == null) {
            return false;
        }
        try {
            CustomVideoEvent customVideoEvent = (CustomVideoEvent) C0261.m906().m910(2, c0088);
            if (customVideoEvent != null) {
                if (customVideoEvent.isReady()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
