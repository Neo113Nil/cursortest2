package com.instagram.common.viewpoint.core;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1982jA implements InterfaceC1237Sp {
    public final C1111No A00;
    public final O3 A01;
    public final C1245Sx A02;
    public final C1839gi A03;
    public final boolean A04;

    public C1982jA(C1839gi c1839gi, O3 o32, C1245Sx c1245Sx, C1111No c1111No, boolean z8) {
        this.A03 = c1839gi;
        this.A01 = o32;
        this.A02 = c1245Sx;
        this.A00 = c1111No;
        this.A04 = z8;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        O4 playableWebViewClient = new O4(this.A00, this.A01, this.A04);
        webView.setWebViewClient(playableWebViewClient);
        webView.loadUrl(this.A00.A0L());
        playableWebViewClient.A03();
    }

    private void A01(boolean z8) {
        if (this.A00.A0G() == EnumC1112Np.A05) {
            A00();
            return;
        }
        String A0L = this.A00.A0L();
        if (z8) {
            C1245Sx c1245Sx = this.A02;
            String markupUrlResult = this.A00.A0L();
            A0L = c1245Sx.A0S(markupUrlResult);
        }
        this.A00.A0T(A0L);
        this.A01.AFG();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1237Sp
    public final void ADL() {
        if (this.A04) {
            this.A01.AFF(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1237Sp
    public final void ADT() {
        A01(true);
    }
}
