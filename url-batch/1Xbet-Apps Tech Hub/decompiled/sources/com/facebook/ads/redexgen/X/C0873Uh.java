package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Log;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Uh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0873Uh implements InterfaceC0565If {
    public static InterfaceC0565If A03;
    public static byte[] A04;
    public static final String A05;
    public static volatile boolean A06;
    public final Y9 A00;
    public final InterfaceC03278e A01;
    public final InterfaceC0564Ie A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 79);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{-90, -21, -4, -21, -12, -6, -76, -88, -37, -37, -52, -44, -41, -37, -48, -43, -50, -121, -37, -42, -121, -45, -42, -50, -121, -56, -43, -121, -48, -43, -35, -56, -45, -48, -53, -121, -43, -13, -30, -28, -26, -24, -26, -17, -26, -13, -22, -28, 46, 51, 42, Ascii.US};
    }

    static {
        A03();
        A05 = C0873Uh.class.getSimpleName();
        A06 = false;
    }

    public C0873Uh(Y9 y9) {
        InterfaceC0563Id dispatchCallback;
        this.A00 = y9;
        if (IR.A0T(y9)) {
            InterfaceC03278e A00 = C03258c.A00(y9);
            this.A01 = A00;
            dispatchCallback = C0570Ik.A00(y9, A00);
        } else {
            C0444Dm A01 = C03258c.A01(y9);
            dispatchCallback = C0570Ik.A01(y9, A01);
            this.A01 = A01;
        }
        this.A02 = new C0876Uk(y9, dispatchCallback);
        ExecutorC0633La.A08.execute(new C0875Uj(this));
        A04(y9);
    }

    public static synchronized InterfaceC0565If A01(Y9 y9) {
        InterfaceC0565If interfaceC0565If;
        synchronized (C0873Uh.class) {
            if (A03 == null) {
                A03 = new C0873Uh(y9);
            }
            interfaceC0565If = A03;
        }
        return interfaceC0565If;
    }

    public static synchronized void A04(Y9 y9) {
        synchronized (C0873Uh.class) {
            if (A06) {
                return;
            }
            y9.A03().AAO();
            A06 = true;
        }
    }

    private void A05(C0562Ic c0562Ic) {
        if (!c0562Ic.A0A()) {
            Log.e(A05, A02(7, 29, 24) + c0562Ic.A06() + A02(0, 7, 55));
        } else {
            A06(c0562Ic);
            this.A01.AGT(c0562Ic, new C0874Ui(this, c0562Ic));
        }
    }

    private void A06(C0562Ic c0562Ic) {
        switch (C0566Ig.A00[c0562Ic.A06().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                C03217y c03217y = new C03217y(new Exception(A02(36, 5, 50)));
                c03217y.A03(1);
                try {
                    c03217y.A05(new JSONObject().put(A02(48, 4, 107), c0562Ic.A06().toString()));
                } catch (JSONException unused) {
                }
                this.A00.A07().A9N(A02(41, 7, 50), C03207x.A1H, c03217y);
                break;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0565If
    public final void A9F(String str, Map<String, String> data) {
        A05(new C0561Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0567Ih.A04).A02(EnumC0568Ii.A04).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0565If
    public final void A9H(String str, Map<String, String> data) {
        A05(new C0561Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0567Ih.A04).A02(EnumC0568Ii.A06).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0565If
    public final void A9I(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0561Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0567Ih.A04).A02(EnumC0568Ii.A07).A06(C0575Ip.A0A(str, EnumC0572Im.A0I)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0565If
    public final void A9J(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0561Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0567Ih.A04).A02(EnumC0568Ii.A08).A06(C0575Ip.A0A(str, EnumC0572Im.A06)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0565If
    public final void A9L(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0561Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0567Ih.A04).A02(EnumC0568Ii.A0B).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0565If
    public final void A9P(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0561Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0567Ih.A04).A02(EnumC0568Ii.A0C).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0565If
    public final void A9S(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0561Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0567Ih.A05).A02(EnumC0568Ii.A0D).A06(C0575Ip.A0A(str, EnumC0572Im.A0T)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0565If
    public final void A9T(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0561Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0567Ih.A05).A02(EnumC0568Ii.A0E).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0565If
    public final void A9U(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0561Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0567Ih.A05).A02(EnumC0568Ii.A0F).A06(C0575Ip.A0A(str, EnumC0572Im.A0V)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0565If
    public final void A9V(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0561Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0567Ih.A05).A02(EnumC0568Ii.A0K).A06(C0575Ip.A0A(str, EnumC0572Im.A0W)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0565If
    public final void A9W(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0561Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0567Ih.A05).A02(EnumC0568Ii.A0H).A06(C0575Ip.A0A(str, EnumC0572Im.A0X)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0565If
    public final void A9Y(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0561Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0567Ih.A04).A02(EnumC0568Ii.A0J).A06(C0575Ip.A0A(str, EnumC0572Im.A0Y)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0565If
    public final void A9Z(String str, Map<String, String> data, String str2, EnumC0567Ih enumC0567Ih) {
        A05(new C0561Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(enumC0567Ih).A02(EnumC0568Ii.A00(str2)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0565If
    public final void A9a(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C0562Ic adEvent = new C0561Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0567Ih.A04).A02(EnumC0568Ii.A0L).A07(this.A00);
        A05(adEvent);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0565If
    public final void A9e(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0561Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0567Ih.A05).A02(EnumC0568Ii.A0N).A06(C0575Ip.A0A(str, EnumC0572Im.A0a)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0565If
    public final void A9f(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0561Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0567Ih.A05).A02(EnumC0568Ii.A0O).A06(C0575Ip.A0A(str, EnumC0572Im.A0b)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0565If
    public final void A9h(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0561Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A01(EnumC0567Ih.A04).A02(EnumC0568Ii.A0P).A06(C0575Ip.A0A(str, EnumC0572Im.A0c)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0565If
    public final void A9i(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0561Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0567Ih.A04).A02(EnumC0568Ii.A0G).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0565If
    public final void A9m(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0561Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0567Ih.A05).A02(EnumC0568Ii.A0Q).A06(C0575Ip.A0A(str, EnumC0572Im.A0g)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0565If
    public final void A9n(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0561Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0567Ih.A04).A02(EnumC0568Ii.A0U).A06(C0575Ip.A0A(str, EnumC0572Im.A0i)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0565If
    public final void A9o(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0561Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0567Ih.A04).A02(EnumC0568Ii.A0T).A06(C0575Ip.A0A(str, EnumC0572Im.A0j)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0565If
    public final void A9p(String str, Map<String, String> data) {
        A05(new C0561Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0567Ih.A05).A02(EnumC0568Ii.A0V).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0565If
    public final void A9r(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0561Ib().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0567Ih.A05).A02(EnumC0568Ii.A0W).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0565If
    public final void ADr(String str) {
        new R1(this.A00).execute(str);
    }
}
