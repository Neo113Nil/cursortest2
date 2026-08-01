package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.io.encoding.Base64;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.95, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass95 extends FrameLayout implements SV {
    public static byte[] A0A;
    public static String[] A0B = {"gR8VXB3ia", "OJTiurBFiCqcREvzh7o4PkhSqDGudpIq", "iaBHwIBC1utH6CwOSIC2yyAu4ZYXfJ61", "YdU4", "YcTfP9iPeB3iMp", "vsmHP1kkKyGC9kag", "2EZKw0n31g6TC4", "KAWIkc2sX"};
    public C0764Qb A00;
    public final int A01;
    public final AbstractC1045aS A02;
    public final YA A03;
    public final InterfaceC0565If A04;
    public final LN A05;
    public final OW A06;
    public final C0718Oh A07;
    public final String A08;
    public final boolean A09;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 113);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{118, 84, 91, Ascii.DC2, 65, Ascii.NAK, 70, 65, 84, 71, 65, Ascii.NAK, 116, 64, 81, 92, 80, 91, 86, 80, 123, 80, 65, 66, 90, 71, 94, 116, 86, 65, 92, 67, 92, 65, 76, Ascii.ESC, Ascii.NAK, 120, 84, 94, 80, Ascii.NAK, 70, 64, 71, 80, Ascii.NAK, 65, 93, 84, 65, Ascii.NAK, 92, 65, Ascii.DC2, 70, Ascii.NAK, 92, 91, Ascii.NAK, 76, 90, 64, 71, Ascii.NAK, 116, 91, 81, 71, 90, 92, 81, 120, 84, 91, 92, 83, 80, 70, 65, Ascii.ESC, 77, 88, 89, Ascii.NAK, 83, 92, 89, 80, Ascii.ESC, Ascii.RS, Ascii.SUB, Ascii.EM, 45, 60, 49, Base64.padSymbol, 54, 59, Base64.padSymbol, Ascii.SYN, Base64.padSymbol, 44, 47, 55, 42, 51, 54, 57, 8, 54, 52, 35, 62, 33, 62, 35, 46, 77, 66, 71, 77, 69, 113, 93, 65, 91, 92, 77, 75, 55, 56, 45, 48, 47, 60, Ascii.CAN, Base64.padSymbol, Ascii.GS, 56, 45, 56, Ascii.ESC, 44, 55, Base64.padSymbol, 53, 60, 33, 39, 49, 38, 55, 56, Base64.padSymbol, 55, 63, Ascii.SYN, 9, 5, Ascii.ETB, 52, Ascii.EM, 16, 5};
    }

    static {
        A02();
    }

    public AnonymousClass95(YA ya, InterfaceC0565If interfaceC0565If, OW ow, AbstractC1045aS abstractC1045aS, String str, int i, LN ln) {
        super(ya);
        this.A03 = ya;
        this.A04 = interfaceC0565If;
        this.A02 = abstractC1045aS;
        this.A08 = str;
        this.A06 = ow;
        this.A01 = i;
        if (i == 3) {
            this.A07 = new C0718Oh(ya, abstractC1045aS, interfaceC0565If, i);
            this.A09 = false;
        } else {
            C0718Oh preloadedDynamicWebViewController = C0719Oi.A02(abstractC1045aS.A0R());
            if (preloadedDynamicWebViewController != null) {
                this.A07 = preloadedDynamicWebViewController;
                this.A09 = true;
            } else {
                C0718Oh preloadedDynamicWebViewController2 = new C0718Oh(ya, abstractC1045aS, interfaceC0565If, i);
                this.A07 = preloadedDynamicWebViewController2;
                C0719Oi.A03(abstractC1045aS, preloadedDynamicWebViewController2);
                this.A09 = false;
            }
        }
        if (ln != null) {
            this.A05 = ln;
            this.A07.A0Z(ln);
        } else {
            this.A05 = this.A07.A0L();
        }
        this.A07.A0c(new C0817Sc(this));
        this.A07.A0a(ow);
        EnumC0632Kz.A04(this, EnumC0632Kz.A0A);
        if (IP.A1X(ya)) {
            ya.A0A().AGC(this.A07.A0O(), abstractC1045aS.A11(), false, false, true);
        }
        A04();
    }

    public AnonymousClass95(YA ya, InterfaceC0565If interfaceC0565If, AbstractC1045aS abstractC1045aS, String str, int i) {
        this(ya, interfaceC0565If, null, abstractC1045aS, str, i, null);
    }

    private final void A03() {
        this.A07.A0d(this);
        if (!this.A09) {
            this.A03.A0E().A5C();
            this.A07.A0X();
        } else {
            this.A03.A0E().A5D();
            String[] strArr = A0B;
            if (strArr[6].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[6] = "EW3rEVX7vA8fzU";
            strArr2[4] = "ztAtYR2DvpL08d";
            if (this.A07.A0k()) {
                if (this.A01 == 4) {
                    OW ow = this.A06;
                    if (ow != null) {
                        ow.ABE(this);
                    }
                    if (IP.A1X(this.A03)) {
                        this.A03.A0A().AB1();
                    }
                } else {
                    AFn();
                }
            }
        }
        A08();
    }

    private final void A04() {
        C0718Oh.A0B().incrementAndGet();
        A03();
        this.A07.A0W();
    }

    private void A05(Intent intent, AbstractC1045aS abstractC1045aS) {
        intent.putExtra(A01(157, 8, 17), EnumC0600Jq.A06);
        intent.putExtra(A01(130, 18, 40), abstractC1045aS);
        intent.addFlags(268435456);
    }

    private final void A06(AbstractC1045aS abstractC1045aS) {
        AdActivityIntent A04 = KN.A04(this.A03);
        A05(A04, abstractC1045aS);
        try {
            KN.A09(this.A03, A04);
        } catch (Exception e) {
            this.A03.A07().A9M(A01(107, 11, 38), C03207x.A0D, new C03217y(e));
            Log.e(A01(90, 17, 41), A01(0, 90, 68), e);
        }
    }

    private void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        NW nw = new NW(this.A03, this.A08, this.A00, this.A05, this.A04, this.A02.A0x());
        HashMap hashMap = new HashMap();
        hashMap.put(A01(118, 12, 95), A01(Opcodes.LCMP, 9, 37));
        nw.A08(this.A02.A11(), str, hashMap);
    }

    public final void A08() {
        LV.A0J(this.A07.A0O());
        addView(this.A07.A0O(), new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.SV
    public final void A8I() {
        A07(this.A02.A0v().A0F().A05());
    }

    @Override // com.facebook.ads.redexgen.X.SV
    public final void A8J(String str) {
        A07(str);
    }

    @Override // com.facebook.ads.redexgen.X.SV
    public final void A8N() {
    }

    @Override // com.facebook.ads.redexgen.X.SV
    public final void A96() {
        new Handler(Looper.getMainLooper()).post(new C0816Sb(this));
    }

    @Override // com.facebook.ads.redexgen.X.SV
    public final void ABR() {
        A06(this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.SV
    public final void ABV() {
    }

    @Override // com.facebook.ads.redexgen.X.SV
    public final void AC9(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.SV
    public final void ACx() {
    }

    @Override // com.facebook.ads.redexgen.X.SV
    public final void ADS(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.SV
    public final void ADU(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.SV
    public final void ADh(String str) {
    }

    @Override // com.facebook.ads.redexgen.X.SV
    public final void AFn() {
        OW ow = this.A06;
        if (ow != null) {
            ow.ABE(this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SV
    public final void close() {
    }

    public InterfaceC0565If getAdEventManager() {
        return this.A04;
    }

    public C0718Oh getDynamicWebViewController() {
        return this.A07;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setAdViewabilityChecker(C0764Qb c0764Qb) {
        this.A00 = c0764Qb;
        this.A07.A0e(c0764Qb);
    }
}
