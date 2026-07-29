package com.aiming.mdt.a;

import android.app.Activity;
import android.text.TextUtils;
import com.aiming.mdt.a.C0121;
import com.aiming.mdt.core.AbstractC0253;
import com.aiming.mdt.core.C0261;
import com.aiming.mdt.interactive.InteractiveAdListener;
import com.aiming.mdt.mediation.CustomInteractiveEvent;
import com.aiming.mdt.utils.AdLog;
import com.aiming.mdt.utils.C0277;
import com.aiming.mdt.utils.C0279;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.Constants;
import com.aiming.mdt.video.VideoAdListener;

/* renamed from: com.aiming.mdt.a.ʼʾʿˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0132 extends AbstractC0253 implements InterfaceC0152, VideoAdListener {

    /* renamed from: ʻʼʽʾ, reason: contains not printable characters */
    private InteractiveAdListener f415;

    /* renamed from: ʻʽʾ, reason: contains not printable characters */
    private C0046 f416;

    C0132(Activity activity, String str, InteractiveAdListener interactiveAdListener) {
        super(activity, str);
        this.f415 = interactiveAdListener;
    }

    @Override // com.aiming.mdt.video.VideoAdListener
    public final void onAdClicked() {
    }

    @Override // com.aiming.mdt.video.VideoAdListener
    public final void onAdClosed(boolean z) {
        C0035.m54().m57();
        if (this.f416 != null) {
            this.f416.m898();
        }
    }

    @Override // com.aiming.mdt.core.AdListener
    public final void onAdFailed(String str) {
        StringBuilder sb = new StringBuilder("on Request video error  : ");
        sb.append(str);
        C0282.m973(Constants.ADTYPE_INTERACTIVE, sb.toString());
    }

    @Override // com.aiming.mdt.video.VideoAdListener
    public final void onAdReady() {
        mo505();
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    public final void onAdRewarded() {
    }

    @Override // com.aiming.mdt.mediation.Callback
    protected final void onInsShow(String str, String str2, Object obj) {
        super.onInsShow(str, str2, obj);
        C0088 c0088 = m891(str, str2);
        if (c0088 == null) {
            return;
        }
        m889(c0088);
        C0279.m949(this.f782, c0088.m304());
        C0035.m54().m55(this);
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʻ */
    protected final C0137 mo66() {
        return new C0137(this.f782).m523(3);
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʻʼ */
    protected final int mo67() {
        return 3;
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʻʼʽ */
    protected final void mo68() {
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
        CustomInteractiveEvent customInteractiveEvent = (CustomInteractiveEvent) C0261.m906().m910(3, c0088);
        if (customInteractiveEvent == null) {
            m882(c0088, "create mediation adapter failed");
            return;
        }
        if (customInteractiveEvent.isReady()) {
            m899(c0088);
            m879(false, c0088, c0088.m312());
        } else {
            c0088.m306(System.currentTimeMillis());
            customInteractiveEvent.loadAd(this.f788.get(), C0277.m945(this.f782, c0088));
            m896(c0088);
        }
    }

    /* renamed from: ʻʼʿ, reason: contains not printable characters */
    public final void m503() {
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
            CustomInteractiveEvent customInteractiveEvent = (CustomInteractiveEvent) C0261.m906().m910(3, c0088);
            if (customInteractiveEvent == null) {
                m893("Display ad error, the ad is not ready");
                return;
            }
            C0049.m149().m153(this.f782, c0088);
            ((AbstractC0253) this).f776 = c0088;
            customInteractiveEvent.show(this.f788.get());
        } catch (Exception e) {
            C0282.m972("interactive showAd", e);
            C0076.m232().m236(e);
            m893("Display ad error, the ad is not ready");
        }
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʻʽ */
    protected final void mo70(String str) {
        if (this.f415 != null) {
            this.f415.onAdFailed(str);
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

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m504(InteractiveAdListener interactiveAdListener) {
        this.f415 = interactiveAdListener;
    }

    @Override // com.aiming.mdt.core.AbstractC0253, com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʼʽ */
    public final void mo73() {
        if (this.f416 != null) {
            this.f416.mo73();
            this.f416 = null;
        }
        this.f415 = null;
        C0035.m54().m59();
        C0121.C0122.f372.m468(this.f782);
        super.mo73();
    }

    @Override // com.aiming.mdt.core.AbstractC0253
    /* renamed from: ʼʽ */
    protected final void mo140(C0088 c0088) {
        super.mo140(c0088);
        C0261.m906().m913(this.f782, c0088);
    }

    @Override // com.aiming.mdt.a.InterfaceC0152
    /* renamed from: ʼʿ, reason: contains not printable characters */
    public final void mo505() {
        boolean z = this.f416 != null && this.f416.mo71();
        StringBuilder sb = new StringBuilder("ask video Ready : ");
        sb.append(z);
        C0282.m971(sb.toString());
        if (z) {
            C0035.m54().m61();
        }
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʽ */
    protected final void mo74() {
        if (this.f415 != null) {
            this.f415.onAdReady();
        }
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʽ */
    protected final void mo75(boolean z) {
        if (((AbstractC0253) this).f776 != null) {
            C0121.C0122.f372.m466(this.f788.get(), this.f782, ((AbstractC0253) this).f776);
            ((AbstractC0253) this).f776 = null;
        }
        if (this.f415 != null) {
            this.f415.onAdClosed();
        }
    }

    @Override // com.aiming.mdt.core.AbstractC0253
    /* renamed from: ʾ */
    protected final boolean mo76(C0088 c0088) {
        if (c0088 == null) {
            return false;
        }
        try {
            CustomInteractiveEvent customInteractiveEvent = (CustomInteractiveEvent) C0261.m906().m910(3, c0088);
            if (customInteractiveEvent != null) {
                if (customInteractiveEvent.isReady()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.aiming.mdt.a.InterfaceC0152
    /* renamed from: ʾʿ, reason: contains not printable characters */
    public final void mo506() {
        if (m894()) {
            if (this.f416 == null) {
                if (this.f780 == null) {
                    return;
                }
                String valueOf = String.valueOf(this.f780.m121());
                if (TextUtils.isEmpty(valueOf)) {
                    return;
                } else {
                    this.f416 = new C0046(this.f788.get(), valueOf, this);
                }
            }
            this.f416.m898();
        }
    }

    @Override // com.aiming.mdt.a.InterfaceC0152
    /* renamed from: ʿ, reason: contains not printable characters */
    public final void mo507() {
        C0282.m971("request play video");
        if (this.f416 == null || !this.f416.mo71()) {
            return;
        }
        this.f416.m138();
        C0035.m54().m62();
    }
}
