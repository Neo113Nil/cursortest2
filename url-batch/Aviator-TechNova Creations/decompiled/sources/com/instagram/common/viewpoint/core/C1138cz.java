package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.cz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1138cz extends FrameLayout {
    public static byte[] A0C;
    public static String[] A0D = {"5vYLtEaU9MAxDoI06TlJjFfWs8tiaGj", "TX23sib3Tj6X7eJy5cgYAILp0vVPLOiW", "Lxz50jZMaNdiu", "yIxUapHBf", "xsW4qvb7U5EMj5cNQbMl14i5qh6u6uOh", "8XLPt3rjq6gnj0Cd96o3z24ZTqMdgzej", "IIODaFrLnzdPntRGftRJpuPC", "ODWlzaCdU1siup4vWOfVQK22DnthNinE"};
    public static final float A0E;
    public static final RelativeLayout.LayoutParams A0F;
    public int A00;
    public long A01;
    public InterfaceC1136cx A02;
    public Map<String, String> A03;
    public final AbstractC1434hy A04;
    public final NB A05;
    public final C1159dL A06;
    public final US A07;
    public final InterfaceC0936Zh A08;
    public final C0555Ki A09;
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 9);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        String[] strArr = A0D;
        if (strArr[1].charAt(1) != strArr[5].charAt(1)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[7] = "Af0WM9g7Nak7nSkWG18ndsMVC8MahONd";
        strArr2[4] = "VergmF1iO6RBn6aZ7U2vBdquKGl77VZm";
        A0C = new byte[]{54, Ascii.DC2, 32, Ascii.FS, 17, 9, 17, Ascii.DC2, Ascii.FS, Ascii.NAK, 49, Ascii.DC4, 19, 34, 49, 48, 42, 45, 36, 99, 38, 49, 49, 44, 49, 68, 120, 117, 109, 117, 118, 120, 113, 52, 112, 123, 87, 96, 117, 87, 120, 125, 119, Byte.MAX_VALUE, 52, 96, 102, 125, 115, 115, 113, 102, 113, 112, 52, 99, 125, 96, 124, 52, 100, 102, 113, 57, 113, 98, 113, 122, 96, 52, 119, 120, 125, 119, Byte.MAX_VALUE, 103, 52, 119, 123, 97, 122, 96, 52, 117, 122, 112, 52, 80, 113, 120, 117, 109, Ascii.CR, 49, 60, 36, 60, Utf8.REPLACEMENT_BYTE, 49, 56, Ascii.FS, 57, 46, Ascii.VT, 52, 56, 42, 114, 117, 119, 121, 126, 48, 124, Byte.MAX_VALUE, 113, 116, 121, 126, 119, 48, 98, 117, 125, Byte.MAX_VALUE, 100, 117, 48, 96, 124, 113, 105, 113, 114, 124, 117, 34, 45, 40, 34, 42, 50, 5, 4, Ascii.CR, 0, Ascii.CAN, 114, 110, 99, 123, 99, 96, 110, 103, 52, 40, 37, Base64.padSymbol, 37, 38, 40, 33, Ascii.ESC, 54, 33, 41, 43, 48, 33, 95, 72, 64, 66, 89, 72, 114, 94, 72, 94, 94, 68, 66, 67, 114, 68, 73, 78, 85, 81, 95, 84, 119, 101, 98, 95, 118, 105, 101, 119};
    }

    static {
        A09();
        A0E = (int) (AbstractC0862Wl.A02 * 4.0f);
        A0F = new RelativeLayout.LayoutParams(-1, -1);
    }

    public C1138cz(C1159dL c1159dL, AbstractC1434hy abstractC1434hy, NB nb, US us, InterfaceC1136cx interfaceC1136cx, Map<String, String> playableMetricsData) {
        super(c1159dL);
        this.A0A = new AtomicBoolean(false);
        this.A0B = new AtomicBoolean(false);
        this.A01 = -1L;
        this.A00 = 0;
        this.A08 = new AbstractC0566Kt() { // from class: com.facebook.ads.redexgen.X.3p
            @Override // com.instagram.common.viewpoint.core.InterfaceC0936Zh
            public final void ACO() {
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC0566Kt, com.instagram.common.viewpoint.core.InterfaceC0936Zh
            public final void ADG(int i, String str) {
                AtomicBoolean atomicBoolean;
                InterfaceC1136cx interfaceC1136cx2;
                InterfaceC1136cx interfaceC1136cx3;
                atomicBoolean = C1138cz.this.A0B;
                atomicBoolean.set(true);
                interfaceC1136cx2 = C1138cz.this.A02;
                if (interfaceC1136cx2 == null) {
                    return;
                }
                interfaceC1136cx3 = C1138cz.this.A02;
                interfaceC1136cx3.AE2();
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC0936Zh
            public final void ADW() {
                AtomicBoolean atomicBoolean;
                AtomicBoolean atomicBoolean2;
                InterfaceC1136cx interfaceC1136cx2;
                InterfaceC1136cx interfaceC1136cx3;
                atomicBoolean = C1138cz.this.A0B;
                if (atomicBoolean.get()) {
                    return;
                }
                atomicBoolean2 = C1138cz.this.A0A;
                if (!atomicBoolean2.compareAndSet(false, true)) {
                    return;
                }
                interfaceC1136cx2 = C1138cz.this.A02;
                if (interfaceC1136cx2 == null) {
                    return;
                }
                interfaceC1136cx3 = C1138cz.this.A02;
                interfaceC1136cx3.ADW();
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC0936Zh
            public final void AFw() {
                InterfaceC1136cx interfaceC1136cx2;
                InterfaceC1136cx interfaceC1136cx3;
                interfaceC1136cx2 = C1138cz.this.A02;
                if (interfaceC1136cx2 == null) {
                    return;
                }
                interfaceC1136cx3 = C1138cz.this.A02;
                interfaceC1136cx3.AFw();
            }
        };
        this.A06 = c1159dL;
        this.A04 = abstractC1434hy;
        this.A05 = nb;
        this.A07 = us;
        this.A02 = interfaceC1136cx;
        this.A03 = playableMetricsData;
        this.A09 = A04();
        if (this.A05.A0M() && !this.A05.A0O()) {
            A0B();
        }
        if (U7.A1u(this.A06)) {
            this.A06.A0B().AK2(this.A09, this.A04.A25(), false);
        }
        addView(this.A09, A0F);
    }

    public static /* synthetic */ int A00(C1138cz c1138cz) {
        int i = c1138cz.A00;
        c1138cz.A00 = i + 1;
        return i;
    }

    private C0555Ki A04() {
        C0555Ki c0555Ki = new C0555Ki(this.A06, (WeakReference<InterfaceC0936Zh>) new WeakReference(this.A08), 10, U7.A22(this.A06));
        c0555Ki.setCornerRadius(A0E);
        c0555Ki.setLogMultipleImpressions(false);
        c0555Ki.setCheckAssetsByJavascriptBridge(false);
        c0555Ki.setWebViewTimeoutInMillis(this.A05.A09());
        c0555Ki.setRequestId(this.A04.A17());
        c0555Ki.setOnTouchListener(new ViewOnTouchListenerC1137cy(this));
        WebSettings settings = c0555Ki.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs(true);
        c0555Ki.addJavascriptInterface(new C1139d0(this.A06, this, this.A07, this.A03, this.A04.A25()), A06(0, 12, Opcodes.LSHL));
        return c0555Ki;
    }

    public final void A0A() {
        long currentTimeMillis = System.currentTimeMillis() - this.A01;
        C0773Sw c0773Sw = new C0773Sw(A06(25, 67, 29));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A06(Opcodes.L2I, 6, 72), this.A00);
            jSONObject.put(A06(Opcodes.D2I, 5, 104), currentTimeMillis);
            jSONObject.put(A06(Opcodes.NEW, 5, 51), this.A04.A25());
        } catch (JSONException e) {
            Log.e(A06(92, 15, 84), A06(12, 13, 74), e);
        }
        c0773Sw.A07(jSONObject);
        c0773Sw.A05(1);
        InterfaceC0771Su A08 = this.A06.A08();
        int i = AbstractC0772Sv.A2D;
        String A06 = A06(Opcodes.I2S, 8, 11);
        A08.AAz(A06, i, c0773Sw);
        this.A00 = 0;
        if (!U7.A1p(this.A06)) {
            if (this.A02 == null) {
                return;
            }
            this.A02.ACt();
            return;
        }
        if (currentTimeMillis <= U7.A0L(this.A06)) {
            InterfaceC1136cx interfaceC1136cx = this.A02;
            String[] strArr = A0D;
            if (strArr[7].charAt(0) == strArr[4].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[1] = "0XAlcIRGce3nNmobAWWNAzxTwWjfpKo1";
            strArr2[5] = "vX4VpuJxASYV4FwrDvVxGQ4QiWthZxUm";
            if (interfaceC1136cx != null) {
                this.A02.ACt();
                return;
            }
            return;
        }
        c0773Sw.A05(0);
        this.A06.A08().AAy(A06, AbstractC0772Sv.A2E, c0773Sw);
    }

    public final void A0B() {
        String A0F2;
        if (this.A05.A0O()) {
            C0773Sw c0773Sw = new C0773Sw(A06(107, 29, 25));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A06(Opcodes.TABLESWITCH, 17, 36), this.A05.A0I());
                jSONObject.put(A06(Opcodes.NEW, 5, 51), this.A04.A25());
            } catch (JSONException e) {
                String A06 = A06(92, 15, 84);
                String A062 = A06(12, 13, 74);
                String[] strArr = A0D;
                if (strArr[1].charAt(1) != strArr[5].charAt(1)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[3] = "qKqF8GsLC";
                strArr2[6] = "yUBs4wOBB81EmWZp6CsNCuI0";
                Log.e(A06, A062, e);
            }
            c0773Sw.A07(jSONObject);
            c0773Sw.A05(1);
            InterfaceC0771Su A08 = this.A06.A08();
            int i = AbstractC0772Sv.A2G;
            String A063 = A06(155, 15, 77);
            A08.AAz(A063, i, c0773Sw);
            if (U7.A0r(this.A06) && XE.A00(this.A06) == XD.A07) {
                this.A06.A08().AAz(A063, AbstractC0772Sv.A2F, c0773Sw);
                this.A08.ADG(0, null);
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
            C0555Ki c0555Ki = this.A09;
            if (!TextUtils.isEmpty(this.A05.A0C())) {
                A0F2 = this.A05.A0C();
            } else {
                A0F2 = this.A05.A0F();
            }
            c0555Ki.loadUrl(A0F2);
        } catch (Exception e2) {
            this.A06.A08().AAy(A06(Opcodes.CHECKCAST, 8, 9), AbstractC0772Sv.A2f, new C0773Sw(e2));
        }
    }

    public final void A0C() {
        if (U7.A1u(this.A06)) {
            this.A06.A0B().AJj(this.A09);
        }
        this.A09.removeJavascriptInterface(A06(0, 12, Opcodes.LSHL));
        this.A09.destroy();
    }

    public XH getTouchDataRecorder() {
        return this.A09.getTouchDataRecorder();
    }

    public C1232eX getViewabilityChecker() {
        return this.A09.getViewabilityChecker();
    }

    public void setPlayableAdsViewListener(InterfaceC1136cx interfaceC1136cx) {
        this.A02 = interfaceC1136cx;
    }
}
