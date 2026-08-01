package com.facebook.ads.redexgen.X;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.aF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1032aF implements C6I {
    public final C1Z A00;
    public final InterfaceC01681n A01;
    public final C6Q A02;
    public final YA A03;
    public final boolean A04;

    public C1032aF(YA ya, InterfaceC01681n interfaceC01681n, C6Q c6q, C1Z c1z, boolean z) {
        this.A03 = ya;
        this.A01 = interfaceC01681n;
        this.A02 = c6q;
        this.A00 = c1z;
        this.A04 = z;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        webView.setWebViewClient(new C01691o(this.A00, this.A01, this.A04));
        webView.loadUrl(this.A00.A0E());
    }

    private void A01(boolean z) {
        if (this.A00.A09() == EnumC01551a.A05) {
            A00();
            return;
        }
        String A0E = this.A00.A0E();
        if (z) {
            C6Q c6q = this.A02;
            String markupUrlResult = this.A00.A0E();
            A0E = c6q.A0R(markupUrlResult);
        }
        this.A00.A0H(A0E);
        this.A01.ACN();
    }

    @Override // com.facebook.ads.redexgen.X.C6I
    public final void AAn() {
        if (this.A04) {
            this.A01.ACM(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C6I
    public final void AAw() {
        A01(true);
    }
}
