package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1f, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01601f {
    public static byte[] A05;
    public static String[] A06 = {"jJreqFAWfQsm2UlBXjWleQZy51A8w9r3", "B5vxrqY9e1pfFDILbPSJEQZe5Zep9JAF", "7hwRhDIA2xM98ucsNVPICP0872", "8yYdfjKxcW1uK5E8nS4F9bT", "cwoTvwLLOWGZrFwonmn2qn9xu", "wuc4L", "VoE60CbUCih", "1JGxuEjawtyxaKItdz1AQ1lnM"};
    public C6Q A00;
    public NP A01 = NP.A06;
    public ArrayList<C0718Oh> A02 = new ArrayList<>();
    public final C1C A03;
    public final InterfaceC01591e A04;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 96);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-97, -39, -27, -34, -35, -81, -44, -38, -53, -40, -44, -57, -46, -122, -85, -40, -40, -43, -40, -122, -104, -106, -106, -100, -122, -35, -49, -38, -50, -43, -37, -38, -122, -57, -122, -36, -57, -46, -49, -54, -122, -89, -54, -81, -44, -52, -43, -108, Ascii.US, 34, Ascii.GS, 34, Ascii.US, 50, Ascii.US, Ascii.GS, 32, 51, 44, 34, 42, 35, -45, -30, -37, -59, -54, -61, -53, -48, -63, -46, -61, -44, -61, -49, -43, -42, -37, -44, -36, -31, -40, -41, -76, -41, -73, -44, -25, -44, -75, -24, -31, -41, -33, -40, -38, -33, -27, -42, -29, -28, -27, -38, -27, -38, -46, -35};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A0J(YA ya, EnumSet<CacheFlag> enumSet) {
        if (A0E() == EnumC0600Jq.A03) {
            C1043aQ c1043aQ = (C1043aQ) this.A03;
            AbstractC1045aS A0s = c1043aQ.A0s();
            if (A0C(ya, A0s) || A0s == null) {
                return;
            }
            this.A04.AEL();
            A0A(ya, enumSet, c1043aQ, A0s, 0, this.A04);
            return;
        }
        if (A0C(ya, (AbstractC1045aS) this.A03)) {
            return;
        }
        this.A04.AEL();
        if (A0E() == EnumC0600Jq.A0B) {
            A08(ya, (F0) this.A03);
        } else {
            A09(ya, enumSet, (F0) this.A03, -1, this.A04);
        }
    }

    static {
        A06();
    }

    public C01601f(YA ya, C01731s c01731s, InterfaceC01591e interfaceC01591e, String str) {
        JSONObject dataObject = c01731s.A03();
        this.A03 = A01(ya, c01731s, str, dataObject);
        this.A04 = interfaceC01591e;
    }

    private AdError A00(YA ya, AbstractC1045aS abstractC1045aS) {
        if (abstractC1045aS == null || abstractC1045aS.A13().isEmpty()) {
            ya.A07().A9M(A04(62, 3, 18), C03207x.A0Z, new C03217y(A04(5, 43, 6)));
            return AdError.internalError(AdError.INTERNAL_ERROR_2006);
        }
        return null;
    }

    public static C1C A01(YA ya, C01731s c01731s, String str, JSONObject jSONObject) {
        C1C c1c = null;
        if (jSONObject.has(A04(65, 12, 2))) {
            try {
                c1c = C1043aQ.A03(jSONObject, ya, true);
                c1c.A0c(true);
                c1c.A0Z(A04(96, 12, 17));
            } catch (JSONException unused) {
            }
        }
        if (c1c == null) {
            c1c = F0.A02(jSONObject, ya);
        }
        c1c.A0Y(str);
        C8G A01 = c01731s.A01();
        if (A01 != null) {
            c1c.A0V(A01.A06());
        }
        return c1c;
    }

    private C6Q A03(YA ya) {
        C6Q c6q = this.A00;
        return c6q != null ? c6q : new C6Q(ya);
    }

    private void A08(YA ya, F0 f0) {
        C1Z playableData = f0.A0v().A0D().A06();
        A0B(playableData != null ? playableData.A0A() : NP.A06);
        C1034aH c1034aH = new C1034aH(this);
        C6Q c6q = new C6Q(ya);
        boolean z = IP.A1j(ya) && C02725q.A0A(f0.A0U());
        if (z) {
            C02725q unifiedAssetsLoader = new C02725q(c6q, f0.A0U(), f0.A0O(), f0.A0R(), z, new C1033aG(this));
            c6q.A0d(new C0573In(f0.A11(), ya.A09()));
            unifiedAssetsLoader.A0B();
            return;
        }
        C01701p.A02(ya, f0, true, c1034aH);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0092, code lost:
    
        if (r21 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0094, code lost:
    
        r7 = new com.facebook.ads.redexgen.X.C6M(r27.A0L(), r27.A0R(), r1);
        r7.A04 = true;
        r7.A03 = A04(0, 5, 17);
        r13.A0X(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b0, code lost:
    
        r13.A0c(new com.facebook.ads.redexgen.X.C6O(r27.A0z().A01(), com.facebook.ads.redexgen.X.PB.A04, com.facebook.ads.redexgen.X.PB.A04, r27.A0R(), A04(96, 12, 17)));
        r12 = r26.contains(com.facebook.ads.CacheFlag.VIDEO);
        r11 = 0;
        r10 = com.facebook.ads.redexgen.X.IP.A2N(r25, com.facebook.ads.redexgen.X.QJ.A03());
        r9 = r27.A13().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ef, code lost:
    
        if (r9.hasNext() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f1, code lost:
    
        r0 = r9.next();
        r14 = new com.facebook.ads.redexgen.X.C6O(r0.A0D().A07(), com.facebook.ads.redexgen.X.C01661l.A00(r0.A0D()), com.facebook.ads.redexgen.X.C01661l.A01(r0.A0D()), r27.A0R(), A04(96, 12, 17));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0122, code lost:
    
        if (r11 != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0124, code lost:
    
        r13.A0b(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0127, code lost:
    
        r8 = r0.A0G().A01();
        r7 = com.facebook.ads.redexgen.X.C01601f.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x013f, code lost:
    
        if (r7[6].length() == r7[2].length()) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0141, code lost:
    
        r7 = com.facebook.ads.redexgen.X.C01601f.A06;
        r7[1] = "D8Za7DAeUKhUMlH0nChh1nyf5MUepOev";
        r7[0] = "YMJugZMvnGL61TcEtQKO8oN05ixDNSHw";
        r8 = r8.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0155, code lost:
    
        if (r8.hasNext() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0157, code lost:
    
        r13.A0c(new com.facebook.ads.redexgen.X.C6O(r8.next(), -1, -1, r27.A0R(), A04(96, 12, 17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0178, code lost:
    
        if (r12 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0186, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.A0D().A08()) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0188, code lost:
    
        r14 = new com.facebook.ads.redexgen.X.C6M(r0.A0D().A08(), r27.A0R(), A04(96, 12, 17), r0.A0D().A05());
        r14.A04 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01ad, code lost:
    
        if (r11 != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01af, code lost:
    
        if (r21 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01b1, code lost:
    
        if (r10 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b3, code lost:
    
        r13.A0X(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01b6, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ba, code lost:
    
        r13.A0a(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01be, code lost:
    
        if (r21 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01c0, code lost:
    
        if (r10 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01c2, code lost:
    
        r13.A0Y(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01c6, code lost:
    
        r13.A0Z(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01ca, code lost:
    
        r8 = r8.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01cf, code lost:
    
        r13.A0c(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01e4, code lost:
    
        r13.A0W(new com.facebook.ads.redexgen.X.C1035aI(r24, r25, r21, r27, r29), new com.facebook.ads.redexgen.X.C6J(r27.A0R(), r1, r28));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01e0, code lost:
    
        if (r21 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A09(YA ya, EnumSet<CacheFlag> enumSet, AbstractC1045aS abstractC1045aS, int i, InterfaceC01591e interfaceC01591e) {
        boolean A0k = abstractC1045aS.A0k();
        C6Q A03 = A03(ya);
        A03.A0d(new C0573In(abstractC1045aS.A11(), ya.A09()));
        boolean z = IP.A1j(ya) && C02725q.A0A(abstractC1045aS.A0U());
        if (A06[3].length() == 32) {
            throw new RuntimeException();
        }
        A06[5] = "QkQhg";
        if (z) {
            new C02725q(A03, abstractC1045aS.A0U(), abstractC1045aS.A0O(), abstractC1045aS.A0R(), z, new C1037aK(this, ya, A0k, abstractC1045aS, interfaceC01591e)).A0B();
            return;
        }
        String A04 = A04(96, 12, 17);
        String[] strArr = A06;
        if (strArr[1].charAt(24) != strArr[0].charAt(24)) {
            String[] strArr2 = A06;
            strArr2[1] = "jVhVjw8PHVLop7GyU0UYPYiA56KfUjA6";
            strArr2[0] = "lzrrt2iICm45JkiVqVLOf6p257fg56KP";
        } else {
            String[] strArr3 = A06;
            strArr3[7] = "mMtIDEEqjJJ695eeXDndb9bWh";
            strArr3[4] = "Ebj8lqyUqzLrB8iZ5jF9tO70n";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(YA ya, EnumSet<CacheFlag> enumSet, C1043aQ c1043aQ, AbstractC1045aS abstractC1045aS, int i, InterfaceC01591e interfaceC01591e) {
        A09(ya, enumSet, abstractC1045aS, i, new C1039aM(this, ya, abstractC1045aS, c1043aQ, i, interfaceC01591e, enumSet));
    }

    private void A0B(NP np) {
        this.A01 = np;
    }

    private boolean A0C(YA ya, AbstractC1045aS abstractC1045aS) {
        AdError A00 = A00(ya, abstractC1045aS);
        if (A00 != null) {
            InterfaceC01591e interfaceC01591e = this.A04;
            String[] strArr = A06;
            if (strArr[1].charAt(24) != strArr[0].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[1] = "Dm6wm58uJ8qXwjtNx8Vtzbsb5Jkw9mit";
            strArr2[0] = "fLwuuFNg4tiwPdo6hP9t6x3v5l5Hcavg";
            interfaceC01591e.AAP(A00);
            return true;
        }
        return false;
    }

    public final C1C A0D() {
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
    
        if (r3 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
    
        return com.facebook.ads.redexgen.X.EnumC0600Jq.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
    
        return com.facebook.ads.redexgen.X.EnumC0600Jq.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        if (r3 != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EnumC0600Jq A0E() {
        if (this.A03.A0h()) {
            return EnumC0600Jq.A03;
        }
        AbstractC1045aS abstractC1045aS = (AbstractC1045aS) this.A03;
        String[] strArr = A06;
        if (strArr[6].length() != strArr[2].length()) {
            A06[3] = "f4kXngrP8CD5dz";
            if (abstractC1045aS.A0k()) {
                return EnumC0600Jq.A05;
            }
            if (abstractC1045aS.A13().size() > 1) {
                EnumC0600Jq enumC0600Jq = EnumC0600Jq.A09;
                String[] strArr2 = A06;
                if (strArr2[7].length() == strArr2[4].length()) {
                    A06[3] = "ny";
                    return enumC0600Jq;
                }
            } else {
                if (abstractC1045aS.A0v().A0D().A06() != null) {
                    EnumC0600Jq enumC0600Jq2 = EnumC0600Jq.A0B;
                    String[] strArr3 = A06;
                    if (strArr3[6].length() == strArr3[2].length()) {
                        throw new RuntimeException();
                    }
                    A06[3] = "JH";
                    return enumC0600Jq2;
                }
                boolean A0L = A0L(abstractC1045aS);
                if (A06[3].length() != 32) {
                    String[] strArr4 = A06;
                    strArr4[1] = "93R6MUXHMTxUt8WfLt1oZ3ea5zubl3sl";
                    strArr4[0] = "9xXPI1nVQC4CSUB4soKlPH985bh9DAt9";
                } else {
                    A06[3] = "ySAy4b6nQ";
                }
            }
        }
        throw new RuntimeException();
    }

    public final NP A0F() {
        return this.A01;
    }

    public final String A0G() {
        if (this.A03.A0h()) {
            return ((C1043aQ) this.A03).A0v();
        }
        return ((AbstractC1045aS) this.A03).A11();
    }

    public final void A0H() {
        this.A04.AG1();
    }

    public final void A0I(Intent intent, RewardData rewardData, String str) {
        this.A03.A0X(rewardData);
        this.A03.A0a(str);
        if (A0D().A0h()) {
            intent.putExtra(A04(77, 19, 19), this.A03);
        }
        intent.putExtra(A04(48, 14, 94), this.A03);
    }

    public final boolean A0K() {
        return this.A03.A0e();
    }

    public final boolean A0L(AbstractC1045aS abstractC1045aS) {
        return !TextUtils.isEmpty(abstractC1045aS.A0v().A0D().A08());
    }
}
