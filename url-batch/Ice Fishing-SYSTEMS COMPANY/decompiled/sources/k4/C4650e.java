package k4;

import android.content.Context;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.AdError;
import com.anythink.interstitial.api.ATInterstitialExListener;
import h.AbstractActivityC4553l;

/* renamed from: k4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4650e implements ATInterstitialExListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38749a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4553l f38750b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f38751c;

    public /* synthetic */ C4650e(int i, AbstractActivityC4553l abstractActivityC4553l, InterfaceC4657l interfaceC4657l, m mVar) {
        this.f38749a = i;
        this.f38751c = mVar;
        this.f38750b = abstractActivityC4553l;
    }

    @Override // com.anythink.interstitial.api.ATInterstitialExListener
    public final void onDeeplinkCallback(ATAdInfo aTAdInfo, boolean z8) {
        int i = this.f38749a;
    }

    @Override // com.anythink.interstitial.api.ATInterstitialExListener
    public final void onDownloadConfirm(Context context, ATAdInfo aTAdInfo, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        int i = this.f38749a;
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdClicked(ATAdInfo aTAdInfo) {
        int i = this.f38749a;
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdClose(ATAdInfo aTAdInfo) {
        switch (this.f38749a) {
            case 0:
                if (m.f38809z.isShowing()) {
                    m.f38809z.dismiss();
                }
                m.f();
                break;
            default:
                if (m.f38809z.isShowing()) {
                    m.f38809z.dismiss();
                }
                this.f38751c.getClass();
                m.f();
                break;
        }
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdLoadFail(AdError adError) {
        switch (this.f38749a) {
            case 0:
                if (m.f38809z.isShowing()) {
                    m.f38809z.dismiss();
                }
                m.f();
                if (m.f38791g == 1) {
                    m.g(this.f38750b);
                    break;
                }
                break;
            default:
                if (m.f38809z.isShowing()) {
                    m.f38809z.dismiss();
                }
                this.f38751c.getClass();
                m.f();
                if (m.f38791g == 1) {
                    m.g(this.f38750b);
                    break;
                }
                break;
        }
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdLoaded() {
        switch (this.f38749a) {
            case 0:
                if (m.f38809z.isShowing()) {
                    m.f38809z.dismiss();
                }
                this.f38751c.f38811b.show(this.f38750b);
                break;
            default:
                if (m.f38809z.isShowing()) {
                    m.f38809z.dismiss();
                }
                this.f38751c.f38811b.show(this.f38750b);
                break;
        }
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdShow(ATAdInfo aTAdInfo) {
        int i = this.f38749a;
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdVideoEnd(ATAdInfo aTAdInfo) {
        switch (this.f38749a) {
            case 0:
                if (m.f38809z.isShowing()) {
                    m.f38809z.dismiss();
                }
                m.f();
                break;
            default:
                if (m.f38809z.isShowing()) {
                    m.f38809z.dismiss();
                }
                this.f38751c.getClass();
                m.f();
                break;
        }
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdVideoError(AdError adError) {
        switch (this.f38749a) {
            case 0:
                if (m.f38809z.isShowing()) {
                    m.f38809z.dismiss();
                }
                m.f();
                if (m.f38791g == 1) {
                    m.g(this.f38750b);
                    break;
                }
                break;
            default:
                if (m.f38809z.isShowing()) {
                    m.f38809z.dismiss();
                }
                this.f38751c.getClass();
                m.f();
                if (m.i == 1 && m.f38791g == 1) {
                    m.g(this.f38750b);
                    break;
                }
                break;
        }
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdVideoStart(ATAdInfo aTAdInfo) {
        int i = this.f38749a;
    }

    private final void e(ATAdInfo aTAdInfo) {
    }

    private final void f(ATAdInfo aTAdInfo) {
    }

    private final void g(ATAdInfo aTAdInfo) {
    }

    private final void h(ATAdInfo aTAdInfo) {
    }

    private final void i(ATAdInfo aTAdInfo) {
    }

    private final void j(ATAdInfo aTAdInfo) {
    }

    private final void a(ATAdInfo aTAdInfo, boolean z8) {
    }

    private final void b(ATAdInfo aTAdInfo, boolean z8) {
    }

    private final void c(Context context, ATAdInfo aTAdInfo, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
    }

    private final void d(Context context, ATAdInfo aTAdInfo, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
    }
}
