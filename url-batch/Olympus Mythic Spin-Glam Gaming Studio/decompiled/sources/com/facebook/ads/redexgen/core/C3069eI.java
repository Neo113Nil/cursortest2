package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.eI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3069eI extends FrameLayout {
    public static byte[] A0C;
    public static String[] A0D = {"5vYLtEaU9MAxDoI06TlJjFfWs8tiaGj", "TX23sib3Tj6X7eJy5cgYAILp0vVPLOiW", "Lxz50jZMaNdiu", "yIxUapHBf", "xsW4qvb7U5EMj5cNQbMl14i5qh6u6uOh", "8XLPt3rjq6gnj0Cd96o3z24ZTqMdgzej", "IIODaFrLnzdPntRGftRJpuPC", "ODWlzaCdU1siup4vWOfVQK22DnthNinE"};
    public static final float A0E;
    public static final RelativeLayout.LayoutParams A0F;
    public int A00;
    public long A01;
    public Map<String, String> A02;
    public final AbstractC3383jd A03;
    public final C2490No A04;
    public final C3218gi A05;
    public final VA A06;
    public final InterfaceC2867b1 A07;
    public final LV A08;
    public final InterfaceC3067eG A09;
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 9);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        String[] strArr = A0D;
        if (strArr[1].charAt(1) != strArr[5].charAt(1)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[7] = "Af0WM9g7Nak7nSkWG18ndsMVC8MahONd";
        strArr2[4] = "VergmF1iO6RBn6aZ7U2vBdquKGl77VZm";
        A0C = new byte[]{54, 18, 32, 28, 17, 9, 17, 18, 28, 21, 49, 20, 19, 34, 49, 48, 42, 45, 36, 99, 38, 49, 49, 44, 49, 68, 120, 117, 109, 117, 118, 120, 113, 52, 112, 123, 87, 96, 117, 87, 120, 125, 119, Byte.MAX_VALUE, 52, 96, 102, 125, 115, 115, 113, 102, 113, 112, 52, 99, 125, 96, 124, 52, 100, 102, 113, 57, 113, 98, 113, 122, 96, 52, 119, 120, 125, 119, Byte.MAX_VALUE, 103, 52, 119, 123, 97, 122, 96, 52, 117, 122, 112, 52, 80, 113, 120, 117, 109, 13, 49, 60, 36, 60, 63, 49, 56, 28, 57, 46, 11, 52, 56, 42, 114, 117, 119, 121, 126, 48, 124, Byte.MAX_VALUE, 113, 116, 121, 126, 119, 48, 98, 117, 125, Byte.MAX_VALUE, 100, 117, 48, 96, 124, 113, 105, 113, 114, 124, 117, 34, 45, 40, 34, 42, 50, 5, 4, 13, 0, 24, 114, 110, 99, 123, 99, 96, 110, 103, 52, 40, 37, 61, 37, 38, 40, 33, 27, 54, 33, 41, 43, 48, 33, 95, 72, 64, 66, 89, 72, 114, 94, 72, 94, 94, 68, 66, 67, 114, 68, 73, 78, 85, 81, 95, 84, 119, 101, 98, 95, 118, 105, 101, 119};
    }

    static {
        A0A();
        A0E = (int) (XX.A02 * 4.0f);
        A0F = new RelativeLayout.LayoutParams(-1, -1);
    }

    public C3069eI(C3218gi c3218gi, AbstractC3383jd abstractC3383jd, C2490No c2490No, VA va, InterfaceC3067eG interfaceC3067eG, Map<String, String> playableMetricsData) {
        super(c3218gi);
        this.A0A = new AtomicBoolean(false);
        this.A0B = new AtomicBoolean(false);
        this.A01 = -1L;
        this.A00 = 0;
        this.A07 = new AbstractC2440Lp() { // from class: com.facebook.ads.redexgen.X.4S
            @Override // com.facebook.ads.redexgen.core.InterfaceC2867b1
            public final void ACz() {
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC2440Lp, com.facebook.ads.redexgen.core.InterfaceC2867b1
            public final void ADu(int i, String str) {
                AtomicBoolean atomicBoolean;
                InterfaceC3067eG interfaceC3067eG2;
                atomicBoolean = C3069eI.this.A0B;
                atomicBoolean.set(true);
                interfaceC3067eG2 = C3069eI.this.A09;
                interfaceC3067eG2.AEh();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC2867b1
            public final void AEA() {
                AtomicBoolean atomicBoolean;
                AtomicBoolean atomicBoolean2;
                InterfaceC3067eG interfaceC3067eG2;
                atomicBoolean = C3069eI.this.A0B;
                if (atomicBoolean.get()) {
                    return;
                }
                atomicBoolean2 = C3069eI.this.A0A;
                if (!atomicBoolean2.compareAndSet(false, true)) {
                    return;
                }
                interfaceC3067eG2 = C3069eI.this.A09;
                interfaceC3067eG2.AEA();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC2867b1
            public final void AF8() {
                C2490No c2490No2;
                InterfaceC3067eG interfaceC3067eG2;
                c2490No2 = C3069eI.this.A04;
                if (!c2490No2.A0b()) {
                    return;
                }
                interfaceC3067eG2 = C3069eI.this.A09;
                interfaceC3067eG2.AFQ();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC2867b1
            public final void AGg() {
                InterfaceC3067eG interfaceC3067eG2;
                interfaceC3067eG2 = C3069eI.this.A09;
                interfaceC3067eG2.AGg();
            }
        };
        this.A05 = c3218gi;
        this.A03 = abstractC3383jd;
        this.A04 = c2490No;
        this.A06 = va;
        this.A09 = interfaceC3067eG;
        this.A02 = playableMetricsData;
        this.A08 = A05();
        if (C2668Up.A1z(this.A05)) {
            this.A05.A0B().AKn(this.A08, this.A03.A2E(), false);
        }
        addView(this.A08, A0F);
    }

    public static /* synthetic */ int A00(C3069eI c3069eI) {
        int i = c3069eI.A00;
        c3069eI.A00 = i + 1;
        return i;
    }

    private LV A05() {
        LV lv = new LV(this.A05, (WeakReference<InterfaceC2867b1>) new WeakReference(this.A07), 10, C2668Up.A28(this.A05));
        lv.setCornerRadius(A0E);
        lv.setLogMultipleImpressions(false);
        lv.setCheckAssetsByJavascriptBridge(false);
        lv.setWebViewTimeoutInMillis(this.A04.A0F());
        lv.setRequestId(this.A03.A1D());
        lv.setOnTouchListener(new ViewOnTouchListenerC3068eH(this));
        WebSettings settings = lv.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs(true);
        lv.addJavascriptInterface(new C3070eJ(this.A05, this, this.A06, this.A02, this.A03.A2E()), A07(0, 12, Sdk.SDKError.Reason.TPAT_ERROR_VALUE));
        return lv;
    }

    public final void A0B() {
        long currentTimeMillis = System.currentTimeMillis() - this.A01;
        C2631Te c2631Te = new C2631Te(A07(25, 67, 29));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A07(136, 6, 72), this.A00);
            jSONObject.put(A07(142, 5, 104), currentTimeMillis);
            jSONObject.put(A07(187, 5, 51), this.A03.A2E());
        } catch (JSONException e) {
            Log.e(A07(92, 15, 84), A07(12, 13, 74), e);
        }
        c2631Te.A07(jSONObject);
        c2631Te.A05(1);
        InterfaceC2629Tc A08 = this.A05.A08();
        int i = AbstractC2630Td.A2D;
        String A07 = A07(147, 8, 11);
        A08.ABD(A07, i, c2631Te);
        this.A00 = 0;
        if (!C2668Up.A1u(this.A05)) {
            this.A09.ADX();
            return;
        }
        if (currentTimeMillis <= C2668Up.A0L(this.A05)) {
            InterfaceC3067eG interfaceC3067eG = this.A09;
            String[] strArr = A0D;
            if (strArr[7].charAt(0) == strArr[4].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[1] = "0XAlcIRGce3nNmobAWWNAzxTwWjfpKo1";
            strArr2[5] = "vX4VpuJxASYV4FwrDvVxGQ4QiWthZxUm";
            interfaceC3067eG.ADX();
            return;
        }
        c2631Te.A05(0);
        this.A05.A08().ABC(A07, AbstractC2630Td.A2E, c2631Te);
    }

    public final void A0C() {
        String A0L;
        if (this.A04.A0Y()) {
            C2631Te c2631Te = new C2631Te(A07(107, 29, 25));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A07(170, 17, 36), this.A04.A0P());
                jSONObject.put(A07(187, 5, 51), this.A03.A2E());
            } catch (JSONException e) {
                String A07 = A07(92, 15, 84);
                String A072 = A07(12, 13, 74);
                String[] strArr = A0D;
                if (strArr[1].charAt(1) != strArr[5].charAt(1)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[3] = "qKqF8GsLC";
                strArr2[6] = "yUBs4wOBB81EmWZp6CsNCuI0";
                Log.e(A07, A072, e);
            }
            c2631Te.A07(jSONObject);
            c2631Te.A05(1);
            InterfaceC2629Tc A08 = this.A05.A08();
            int i = AbstractC2630Td.A2G;
            String A073 = A07(155, 15, 77);
            A08.ABD(A073, i, c2631Te);
            if (C2668Up.A0r(this.A05) && AbstractC2751Xz.A00(this.A05) == EnumC2750Xy.A07) {
                this.A05.A08().ABD(A073, AbstractC2630Td.A2F, c2631Te);
                this.A07.ADu(0, null);
                String[] strArr3 = A0D;
                if (strArr3[1].charAt(1) != strArr3[5].charAt(1)) {
                    String[] strArr4 = A0D;
                    strArr4[7] = "eYeTyqsAvkMxTzxGPJMzaaOJBs1WoRUE";
                    strArr4[4] = "DGSgvEgHkFrTWskIwQomZOyU4ros1fyW";
                    return;
                } else {
                    String[] strArr5 = A0D;
                    strArr5[1] = "QXwUk7ZcYbXDO6xLw92fyo5XHWgn18Du";
                    strArr5[5] = "iXthj0ZXJZZP0QlicLBvNNfJ4d5EWvqr";
                    return;
                }
            }
        }
        try {
            LV lv = this.A08;
            if (!TextUtils.isEmpty(this.A04.A0I())) {
                A0L = this.A04.A0I();
            } else {
                A0L = this.A04.A0L();
            }
            lv.loadUrl(A0L);
        } catch (Exception e2) {
            this.A05.A08().ABC(A07(192, 8, 9), AbstractC2630Td.A2f, new C2631Te(e2));
        }
    }

    public final void A0D() {
        if (C2668Up.A1z(this.A05)) {
            this.A05.A0B().AKU(this.A08);
        }
        this.A08.removeJavascriptInterface(A07(0, 12, Sdk.SDKError.Reason.TPAT_ERROR_VALUE));
        this.A08.destroy();
    }

    public final void A0E(int i) {
        this.A08.setVisibility(i);
        if (i == 0) {
            this.A08.resumeTimers();
        } else {
            this.A08.pauseTimers();
        }
    }

    public Y2 getTouchDataRecorder() {
        return this.A08.getTouchDataRecorder();
    }

    public C3163fp getViewabilityChecker() {
        return this.A08.getViewabilityChecker();
    }
}
