package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.io.encoding.Base64;
import org.json.JSONArray;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.a9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1026a9 implements Ji {
    public static byte[] A0D;
    public static String[] A0E = {"4yJhIog9RzpC9w4XHjq79o6hmz2pMXrt", "bLneqHgNlbzxjE", "P7gevZ65hMGDm5VmgpkLcWEi46YxYduR", "Pajg2XTKXpS0pN0AoGLcPnQoa2IWF6Z7", "YyJRdl3XxpBTstTmsw", "OvgbPt0JG7dlaj99kqPbJKVmb9CPKTVr", "21VbiQWRKHmC0d4xB3zoTsbqXtN2ZOxw", "Q3Y9mBD7X4l0uaedlY7FP5X0xCsXbtIX"};
    public static final Handler A0F;
    public static final C01480t A0G = null;
    public static final C0593Jj A0H = null;
    public static final String A0I;
    public InterfaceC01430o A00;
    public InterfaceC01430o A01;
    public C8F A04;
    public C0591Jg A05;
    public AbstractC01440p A06;
    public final C01721r A07;
    public final InterfaceC0565If A08;
    public final C01480t A09;
    public final C0593Jj A0A;
    public final YA A0B;
    public volatile boolean A0C;
    public long A03 = -1;
    public String A02 = null;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0D = new byte[]{75, 110, 107, 122, 126, 111, 120, 42, 110, 101, 111, 121, 42, 100, 101, 126, 42, 111, 114, 99, 121, 126, 78, 107, 110, Byte.MAX_VALUE, 123, 106, 125, 47, 102, 124, 47, 97, 122, 99, 99, 47, 39, 108, 103, 110, 102, 97, 47, 97, 96, 123, 47, 99, 96, 110, 107, 106, 107, 38, 57, Ascii.FS, Ascii.EM, 8, Ascii.FF, Ascii.GS, 10, 88, 17, Ascii.VT, 88, Ascii.SYN, Ascii.CR, Ascii.DC4, Ascii.DC4, 88, 80, Ascii.ESC, 16, Ascii.EM, 17, Ascii.SYN, Ascii.GS, Ascii.FS, 81, 45, 8, Ascii.CR, Ascii.FS, Ascii.CAN, 9, Ascii.RS, 76, 5, Ascii.US, 76, 2, Ascii.EM, 0, 0, 76, 68, 2, 3, 76, Ascii.SI, 4, Ascii.CR, 5, 2, 69, 78, 107, 110, Byte.MAX_VALUE, 123, 106, 125, 47, 102, 124, 47, 97, 122, 99, 99, 47, 96, 97, 47, 124, 123, 110, 125, 123, 78, 107, 5, 36, 107, 38, 36, 57, 46, 107, 42, 47, 107, 40, 42, 37, 47, 34, 47, 42, 63, 46, 56, 101, 122, 95, 66, 67, 74, Ascii.CR, 76, 73, 76, 93, 89, 72, 95, Ascii.CR, 89, 84, 93, 72, 3, 46, 43, 111, 46, 35, Base64.padSymbol, 42, 46, 43, 54, 111, 60, 59, 46, Base64.padSymbol, 59, 42, 43, 94, 91, 76, 52, 37, 60, Ascii.SUB, 17, Ascii.CAN, 16, Ascii.ETB, 38, 9, Ascii.CAN, Ascii.VT, Ascii.CAN, Ascii.DC4, 10, 76, 91, 74, 79, 90, 79, 97, 76, 68, 75, 77, 90, Ascii.SO, 71, 93, Ascii.SO, 64, 91, 66, 66, 38, 45, 32, 49, 58, 51, 55, 38, 39, Ascii.FS, 42, 39, 122, 113, 105, 118, 109, 112, 113, 114, 122, 113, 107, 63, 118, 108, 63, 122, 114, 111, 107, 102, 38, 50, 37, 49, 53, 37, 46, 35, 57, Ascii.US, 35, 33, 48, 48, 41, 46, 39, Ascii.FS, Ascii.ESC, 3, Ascii.DC4, Ascii.EM, Ascii.FS, 17, 85, 5, Ascii.EM, Ascii.DC4, Ascii.SYN, 16, Ascii.CAN, 16, Ascii.ESC, 1, 85, Ascii.FS, Ascii.ESC, 85, 7, 16, 6, 5, Ascii.SUB, Ascii.ESC, 6, 16, 10, 9, 7, 2, 57, Ascii.DC2, Ascii.SI, Ascii.VT, 3, 57, Ascii.VT, Ascii.NAK, 44, 59, 47, 43, 59, 45, 42, 1, 55, 58};
    }

    public abstract void A0L();

    public abstract void A0N(InterfaceC01430o interfaceC01430o, C8F c8f, C8D c8d, C01731s c01731s);

    static {
        A07();
        LX.A02();
        A0I = AbstractC1026a9.class.getSimpleName();
        A0F = new Handler(Looper.getMainLooper());
    }

    public AbstractC1026a9(YA ya, C01721r c01721r) {
        this.A0B = ya;
        this.A07 = c01721r;
        C0593Jj c0593Jj = A0H;
        if (c0593Jj != null) {
            this.A0A = c0593Jj;
        } else {
            this.A0A = new C0593Jj(ya);
        }
        this.A0A.A0P(this);
        C01480t c01480t = A0G;
        if (c01480t != null) {
            this.A09 = c01480t;
        } else {
            this.A09 = new C01480t();
        }
        DynamicLoaderFactory.makeLoader(ya).getInitApi().onAdLoadInvoked(ya);
        this.A08 = ya.A09();
        ya.A0E().A4n();
    }

    private void A08(U6 u6) {
        C8F placement = u6.A00();
        if (placement == null || placement.A05() == null) {
            String A06 = A06(279, 29, 125);
            JG error = new JG(AdErrorType.NO_AD_PLACEMENT, A06);
            this.A0B.A0E().A4p(error.A03().getErrorCode(), A06);
            AbstractC01440p abstractC01440p = this.A06;
            if (abstractC01440p != null) {
                abstractC01440p.A0G(error);
                return;
            }
            return;
        }
        this.A04 = placement;
        this.A00 = null;
        C8F c8f = this.A04;
        JSONObject A0A = c8f.A0A();
        String A062 = A06(Opcodes.MONITOREXIT, 3, 93);
        if (A0A == null) {
            C8D A04 = c8f.A04();
            if (!A0C(c8f, A04)) {
                return;
            }
            if (this.A00 == null) {
                this.A0B.A07().A9M(A062, C03207x.A0a, new C03217y(A06(81, 26, 100), A04.A02()));
                ABH(JG.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            C01731s loadConfig = new C01731s(A04.A04(), c8f.A05(), this.A07.A09, c8f.A05().A0C());
            A0N(this.A00, c8f, A04, loadConfig);
        } else {
            ArrayList arrayList = new ArrayList();
            C8D A042 = c8f.A04();
            do {
                if (arrayList.isEmpty()) {
                    if (A0C(c8f, A042)) {
                        arrayList.add(A042);
                    } else {
                        return;
                    }
                } else if (A0B(A042)) {
                    arrayList.add(A042);
                }
                A042 = c8f.A04();
            } while (A042 != null);
            if (this.A00 == null) {
                this.A0B.A07().A9M(A062, C03207x.A0a, new C03217y(A06(56, 25, 112), ((C8D) arrayList.get(0)).A02()));
                ABH(JG.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            boolean z = false;
            try {
                if (arrayList.size() > 1 && this.A00.AFs()) {
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((C8D) it.next()).A04());
                    }
                    jSONObject.put(A06(Opcodes.CHECKCAST, 3, 55), jSONArray);
                    jSONObject.put(A06(Opcodes.IFNULL, 12, 113), c8f.A0A());
                    C01731s loadConfig2 = new C01731s(jSONObject, c8f.A05(), this.A07.A09, c8f.A05().A0C());
                    A0N(this.A00, c8f, A042, loadConfig2);
                    z = true;
                }
            } catch (Exception unused) {
                z = false;
            }
            if (!z) {
                if (arrayList.isEmpty()) {
                    JG A01 = JG.A01(AdErrorType.NO_FILL, A06(0, 0, 73));
                    this.A0B.A0E().A4p(A01.A03().getErrorCode(), A06(Opcodes.I2L, 22, 67));
                    AbstractC01440p abstractC01440p2 = this.A06;
                    if (abstractC01440p2 != null) {
                        abstractC01440p2.A0G(A01);
                        return;
                    }
                    return;
                }
                InterfaceC01430o interfaceC01430o = this.A00;
                String[] strArr = A0E;
                if (strArr[4].length() == strArr[1].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0E;
                strArr2[0] = "F2ixlBYVHNYJB4bAHADqJrSynawwg1yM";
                strArr2[5] = "djkwyiiWLTaQwWMcVWQWfq0o8Ww2Jgo9";
                if (interfaceC01430o == null) {
                    this.A0B.A07().A9M(A062, C03207x.A0a, new C03217y(A06(22, 34, 7), ((C8D) arrayList.get(0)).A02()));
                    ABH(JG.A00(AdErrorType.INTERNAL_ERROR));
                    return;
                }
                C8D c8d = (C8D) arrayList.get(0);
                A0N(this.A00, c8f, c8d, new C01731s(c8d.A04(), c8f.A05(), this.A07.A09, c8f.A05().A0C()));
            }
        }
        C01741t.A08(this.A0B.A01(), c8f);
    }

    private final void A09(String str, AdExperienceType adExperienceType) {
        this.A0B.A0E().A4q(str != null);
        this.A03 = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT < 17) {
            ABH(new JG(AdErrorType.API_NOT_SUPPORTED, A06(0, 0, 73)));
            return;
        }
        try {
            C0591Jg A01 = this.A07.A01(this.A0B, new JQ(this.A0B, str, this.A07.A09, this.A07.A08), adExperienceType);
            this.A05 = A01;
            if (A0E[6].charAt(21) == '6') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[4] = "3q2wB1pMY3UXfOrLgu";
            strArr[1] = "CsXqAZILgfX2KA";
            this.A0A.A0O(A01);
        } catch (JH e) {
            ABH(JG.A02(e));
        }
    }

    private void A0A(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.A02 = jSONObject.optString(A06(230, 12, 75));
            C01500v.A01(this.A0B).A0O(jSONObject);
        }
    }

    private boolean A0B(C8D c8d) {
        return (c8d == null || c8d.A04() == null) ? false : true;
    }

    private boolean A0C(C8F c8f, C8D c8d) {
        String A06 = A06(0, 0, 73);
        if (c8d == null) {
            JG A01 = JG.A01(AdErrorType.NO_FILL, A06);
            this.A0B.A0E().A4p(A01.A03().getErrorCode(), A06(Opcodes.I2L, 22, 67));
            AbstractC01440p abstractC01440p = this.A06;
            if (abstractC01440p != null) {
                abstractC01440p.A0G(A01);
            }
            return false;
        }
        String A02 = c8d.A02();
        InterfaceC01430o A00 = this.A09.A00(this.A0B, c8f.A05().A0D());
        if (A00 == null) {
            this.A0B.A07().A9M(A06(Opcodes.MONITOREXIT, 3, 93), C03207x.A0a, new C03217y(A06(0, 22, 2), A02));
            ABH(JG.A00(AdErrorType.INTERNAL_ERROR));
            return false;
        }
        if (this.A07.A00() != A00.A7W()) {
            JG A012 = JG.A01(AdErrorType.INTERNAL_ERROR, A06);
            this.A0B.A0E().A4p(A012.A03().getErrorCode(), A06(155, 19, 37));
            AbstractC01440p abstractC01440p2 = this.A06;
            if (abstractC01440p2 != null) {
                abstractC01440p2.A0G(A012);
            }
            return false;
        }
        this.A00 = A00;
        String[] strArr = A0E;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[0] = "MKxF4EMWgzzLH5X7HNcHVA2i4zdAiZz9";
        strArr2[5] = "4tfdEW2uI31voJBW941pIR5b1aNGKiQe";
        JSONObject A04 = c8d.A04();
        if (A04 != null) {
            String optString = A04.optString(A06(320, 10, 86));
            this.A0B.A0E().AFS(optString);
            this.A0B.A0C(optString);
            Y9 A002 = C7R.A00();
            if (A002 != null) {
                A002.A0C(optString);
            }
            JSONObject dataObject = A04.optJSONObject(A06(262, 17, 72));
            A0A(dataObject);
            if (this.A05 == null) {
                String A062 = A06(242, 20, 23);
                JG A013 = JG.A01(AdErrorType.UNKNOWN_ERROR, A062);
                this.A0B.A0E().A4p(A013.A03().getErrorCode(), A062);
                AbstractC01440p abstractC01440p3 = this.A06;
                if (abstractC01440p3 != null) {
                    abstractC01440p3.A0G(A013);
                }
                return false;
            }
            return true;
        }
        String A063 = A06(212, 18, 38);
        JG A014 = JG.A01(AdErrorType.UNKNOWN_ERROR, A063);
        this.A0B.A0E().A4p(A014.A03().getErrorCode(), A063);
        AbstractC01440p abstractC01440p4 = this.A06;
        if (abstractC01440p4 != null) {
            abstractC01440p4.A0G(A014);
        }
        return false;
    }

    public final long A0D() {
        C8F c8f = this.A04;
        if (c8f != null) {
            return c8f.A03();
        }
        return -1L;
    }

    public final Handler A0E() {
        return A0F;
    }

    public C1C A0F() {
        return ((AbstractC1049aW) this.A01).A0H();
    }

    public final C8G A0G() {
        C8F c8f = this.A04;
        if (c8f == null) {
            return null;
        }
        return c8f.A05();
    }

    public final void A0H() {
        String A6N;
        this.A0B.A0E().A2m(LM.A01(this.A03));
        InterfaceC01430o interfaceC01430o = this.A01;
        if (interfaceC01430o == null || (A6N = interfaceC01430o.A6N()) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String A04 = LM.A04(this.A03);
        String clientToken = A06(308, 12, 110);
        hashMap.put(clientToken, A04);
        new C0573In(A6N, this.A08).A04(EnumC0572Im.A08, hashMap);
    }

    public final void A0I() {
        InterfaceC01430o interfaceC01430o = this.A01;
        String A06 = A06(Opcodes.MONITOREXIT, 3, 93);
        if (interfaceC01430o == null) {
            String A062 = A06(107, 26, 7);
            this.A0B.A07().A9M(A06, C03207x.A0Q, new C03217y(A062));
            AdErrorType adErrorType = AdErrorType.INTERNAL_ERROR;
            this.A0B.A0E().A4p(adErrorType.getErrorCode(), A062);
            AbstractC01440p abstractC01440p = this.A06;
            if (abstractC01440p != null) {
                String errorMessage = adErrorType.getDefaultErrorMessage();
                abstractC01440p.A0G(JG.A01(adErrorType, errorMessage));
            }
            this.A0B.A0E().A4s();
            return;
        }
        if (this.A0C) {
            String A063 = A06(Opcodes.FRETURN, 18, 71);
            this.A0B.A07().A9M(A06, C03207x.A0M, new C03217y(A063));
            AdErrorType adErrorType2 = AdErrorType.AD_ALREADY_STARTED;
            this.A0B.A0E().A4p(adErrorType2.getErrorCode(), A063);
            AbstractC01440p abstractC01440p2 = this.A06;
            if (abstractC01440p2 != null) {
                String errorMessage2 = adErrorType2.getDefaultErrorMessage();
                abstractC01440p2.A0G(JG.A01(adErrorType2, errorMessage2));
            }
            this.A0B.A0E().A4r();
            return;
        }
        if (!TextUtils.isEmpty(this.A01.A6N())) {
            this.A08.A9h(this.A01.A6N());
        }
        this.A0B.A0E().A4t();
        this.A0C = true;
        A0L();
    }

    public final void A0J() {
        A0T(false);
    }

    public final void A0K() {
        if (this.A02 != null) {
            C01500v.A01(this.A0B).A0N(this.A02);
        }
    }

    public final void A0M(InterfaceC01430o interfaceC01430o) {
        if (interfaceC01430o != null) {
            interfaceC01430o.onDestroy();
        }
    }

    public final void A0O(AbstractC01440p abstractC01440p) {
        this.A06 = abstractC01440p;
    }

    public final void A0P(C01731s c01731s) {
        this.A0B.A0E().A4m();
        String clientToken = c01731s.A03().optString(A06(210, 2, 39));
        if (!TextUtils.isEmpty(clientToken)) {
            C0573In funnelLoggingHandler = new C0573In(clientToken, this.A08);
            funnelLoggingHandler.A04(EnumC0572Im.A04, null);
        }
    }

    public void A0Q(String str) {
        A09(str, null);
    }

    public final void A0R(String str) {
        A0Q(str);
    }

    public final void A0S(String str, AdExperienceType adExperienceType) {
        A09(str, adExperienceType);
    }

    public void A0T(boolean z) {
        if (!z && !this.A0C) {
            return;
        }
        this.A0B.A0E().A4u();
        A0M(this.A01);
        this.A0C = false;
    }

    public final boolean A0U() {
        C8F c8f = this.A04;
        return c8f == null || c8f.A0D();
    }

    @Override // com.facebook.ads.redexgen.X.Ji
    public final synchronized void ABH(JG jg) {
        A0E().post(new C1027aA(this, jg));
    }

    @Override // com.facebook.ads.redexgen.X.Ji
    public final synchronized void AD5(U6 u6) {
        try {
            A08(u6);
        } catch (Exception e) {
            this.A0B.A07().A9M(A06(Opcodes.MONITOREXIT, 3, 93), C03207x.A0T, new C03217y(e));
        }
    }
}
