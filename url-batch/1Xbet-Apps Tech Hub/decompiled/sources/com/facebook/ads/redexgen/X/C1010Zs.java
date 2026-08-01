package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Zs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1010Zs extends AbstractC01440p {
    public static byte[] A01;
    public static String[] A02 = {"", "lR4UvBki6PSdVcLREjEHAbqRd1OmLUQf", "DjKPGQUWmMf7x", "ODfaPUPPzX7KhktdCz15RADFZIjUcUTH", "SOtQhTlfKwNvvZXzwoqU2I3z2iEV30z7", "BHtVd6ktyCMEATMZK8J5wjGrCvXYI9tG", "P8UTzFKpwpJ94", "IxNcf87J3g"};
    public final /* synthetic */ C1008Zq A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{99, 114, 107, Ascii.GS, 17, 16, 10, Ascii.FF, 17, Ascii.DC2, Ascii.DC2, Ascii.ESC, Ascii.FF, 94, Ascii.ETB, Ascii.CR, 94, 16, Ascii.VT, Ascii.DC2, Ascii.DC2};
    }

    static {
        A01();
    }

    public C1010Zs(C1008Zq c1008Zq) {
        this.A00 = c1008Zq;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01440p
    public final void A02() {
        InterstitialAd interstitialAd;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAd = this.A00.A01;
        if (interstitialAd == null) {
            this.A00.A06 = false;
            interstitialAdExtendedListener = this.A00.A09;
            interstitialAdExtendedListener.onInterstitialActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01440p
    public final void A04() {
        InterstitialAd interstitialAd;
        InterstitialAd interstitialAd2;
        C0480Ew c0480Ew;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        AnonymousClass23 anonymousClass23;
        LN ln;
        C0480Ew c0480Ew2;
        C0480Ew c0480Ew3;
        interstitialAd = this.A00.A01;
        if (interstitialAd != null) {
            interstitialAd2 = this.A00.A01;
            interstitialAd2.show();
            return;
        }
        this.A00.A06 = false;
        c0480Ew = this.A00.A03;
        if (c0480Ew != null) {
            c0480Ew2 = this.A00.A03;
            c0480Ew2.A0O(new Zt(this));
            c0480Ew3 = this.A00.A03;
            c0480Ew3.A0J();
            this.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A00.A09;
        anonymousClass23 = this.A00.A0A;
        interstitialAdExtendedListener.onInterstitialDismissed(anonymousClass23.A01());
        ln = this.A00.A05;
        ln.A05();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01440p
    public final void A05() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        AnonymousClass23 anonymousClass23;
        interstitialAdExtendedListener = this.A00.A09;
        anonymousClass23 = this.A00.A0A;
        interstitialAdExtendedListener.onInterstitialDisplayed(anonymousClass23.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01440p
    public final void A06() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A09;
        interstitialAdExtendedListener.onRewardedAdServerFailed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01440p
    public final void A07() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A09;
        interstitialAdExtendedListener.onRewardedAdServerSucceeded();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01440p
    public final void A08() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A09;
        interstitialAdExtendedListener.onRewardedAdCompleted();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01440p
    public final void A0C() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        AnonymousClass23 anonymousClass23;
        this.A00.A08.A0E().A2f();
        interstitialAdExtendedListener = this.A00.A09;
        anonymousClass23 = this.A00.A0A;
        interstitialAdExtendedListener.onAdClicked(anonymousClass23.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01440p
    public final void A0D() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        AnonymousClass23 anonymousClass23;
        interstitialAdExtendedListener = this.A00.A09;
        anonymousClass23 = this.A00.A0A;
        interstitialAdExtendedListener.onLoggingImpression(anonymousClass23.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01440p
    public final void A0E(View view) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0096, code lost:
    
        if (r5 > 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0098, code lost:
    
        r6 = new com.facebook.ads.redexgen.X.C0612Kd();
        r3 = r7.A00.A08;
        r0 = r7.A00.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b3, code lost:
    
        if (r6.A09(r3, r0.A07(), r2.A0t()) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b5, code lost:
    
        r6.A08(r7.A00.A08, true);
        r5 = r7.A00;
        r3 = r5.A08;
        r0 = r7.A00.A0A;
        r1 = r0.A09();
        r0 = r7.A00.A0A;
        r5.A01 = r6.A06(r3, r1, r0.A07());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0137, code lost:
    
        r6.A08(r7.A00.A08, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00db, code lost:
    
        r0 = r7.A00.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e1, code lost:
    
        if (r0 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e3, code lost:
    
        r2.A16(true);
        r0 = r7.A00.A01;
        r1 = r0.buildLoadAdConfig().withAdListener(new com.facebook.ads.redexgen.X.AnonymousClass21(r7, r2));
        r0 = r7.A00.A0A;
        r1 = r1.withCacheFlags(r0.A0A());
        r0 = r7.A00.A0A;
        r1 = r1.withRewardData(r0.A03()).build();
        r0 = r7.A00.A01;
        r0.loadAd(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0122, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0123, code lost:
    
        r1 = r7.A00.A09;
        r0 = r7.A00.A0A;
        r1.onAdLoaded(r0.A01());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0140, code lost:
    
        if (r5 > 0) goto L16;
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC01440p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0F(InterfaceC01430o interfaceC01430o) {
        C0480Ew c0480Ew;
        C0480Ew c0480Ew2;
        C1C c1c;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        AnonymousClass23 anonymousClass23;
        C1C c1c2;
        c0480Ew = this.A00.A03;
        if (c0480Ew != null) {
            this.A00.A07 = true;
            C1008Zq c1008Zq = this.A00;
            c0480Ew2 = c1008Zq.A03;
            c1008Zq.A02 = c0480Ew2.A0F();
            c1c = this.A00.A02;
            boolean z = c1c instanceof AbstractC1045aS;
            String[] strArr = A02;
            if (strArr[6].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "VeASnUkJuhfeOmGjJqk9CbDFf3FFhRFx";
            strArr2[5] = "TZLIDWk0RuIbUDThQePy8NEYvQ7OtG1H";
            if (!z) {
                interstitialAdExtendedListener = this.A00.A09;
                anonymousClass23 = this.A00.A0A;
                interstitialAdExtendedListener.onAdLoaded(anonymousClass23.A01());
                return;
            }
            c1c2 = this.A00.A02;
            final AbstractC1045aS abstractC1045aS = (AbstractC1045aS) c1c2;
            int A0t = abstractC1045aS.A0t();
            String[] strArr3 = A02;
            if (strArr3[0].length() != strArr3[3].length()) {
                String[] strArr4 = A02;
                strArr4[6] = "g2LThTD3HDKTh";
                strArr4[2] = "DwNNkt8z8VoEk";
            }
        } else {
            this.A00.A08.A07().A9M(A00(0, 3, 124), C03207x.A0N, new C03217y(A00(3, 18, 0)));
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01440p
    public final void A0G(JG jg) {
        long j;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        AnonymousClass23 anonymousClass23;
        C0S A0E = this.A00.A08.A0E();
        j = this.A00.A00;
        A0E.A2i(LM.A01(j), jg.A03().getErrorCode(), jg.A04());
        interstitialAdExtendedListener = this.A00.A09;
        anonymousClass23 = this.A00.A0A;
        interstitialAdExtendedListener.onError(anonymousClass23.A01(), C0614Kf.A00(jg));
    }
}
