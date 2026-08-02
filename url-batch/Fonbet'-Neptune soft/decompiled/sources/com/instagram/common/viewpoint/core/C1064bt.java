package com.instagram.common.viewpoint.core;

import android.util.Base64;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.bt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1064bt {
    public static byte[] A0K;
    public static String[] A0L = {"QJ7W4e4PJvclr77cDyA2o1qIxMihX3tE", "RH0qaB2vXSlWTV", "TMgHIdn8e0jRrsJAq9rOuGvMgMhVzLRj", "8zeB", "h3DHJTryp4843oQXq4V40YlaMfy8fMY9", "5EUDcWbBtTwBMpPZObVlQHA1Luk9oa", "lBOFkjXt9ejA3EivMitoOA5tI6ifJJ8U", "jkkICjKEbDq5EoZUmm0oqZxt7dyZ5DGY"};
    public static final AtomicInteger A0M;
    public static final AtomicInteger A0N;
    public InterfaceC1053bi A02;
    public InterfaceC1062br A03;
    public InterfaceC1063bs A04;
    public C1226eX A05;
    public final int A08;
    public final AbstractC1428hy A09;
    public final SF A0A;
    public final C1153dL A0B;
    public final US A0C;
    public final C0796Ua A0D;
    public final C1051bg A0E;
    public final I5 A0F;
    public final C1072c1 A0G;
    public final C1073c2 A0H;
    public final LinkedList<C1061bq> A0J = new LinkedList<>();
    public XH A01 = new XH();
    public boolean A07 = true;
    public boolean A06 = false;
    public long A00 = -1;
    public final String A0I = UUID.randomUUID().toString();

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0K, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 56);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0K = new byte[]{-71, -79, -87, -83, -85, -87, -85, -67, -22, -32, -18, -21, -27, -32, -59, -22, -16, -31, -18, -30, -35, -33, -31, -12, -9, -27, -8, 3, 2, 5, 7, -4, 1, -6, -39, -4, 1, -4, 6, -5, -8, -9, -69, -70, -72, 6, -70, -68, -50, -37, -34, -52, -33, -22, -23, -20, -18, -29, -24, -31, -51, -18, -37, -20, -18, -33, -34, -94, -95, -97, -19, -95, -93, -75, -103, -84, -84, -103, -101, -96, -99, -100, -113, -114, -122, -83, -91, -16, -17, 2, -15, -10, -13, -14, -44, 0, -17, -5, -13, -46, -17, 2, -17, 6, Ascii.CAN, Ascii.NAK, Ascii.NAK, 8, 17, Ascii.ETB, -6, -7, -15, Ascii.CAN, 16, Ascii.FS, 40, Ascii.ETB, 35, Ascii.ESC, 41, -52, -53, -98, -64, -47, -58, -45, -58, -47, -42, -83, -66, -46, -48, -62, -63, -123, -124, -126, -48, -124, -122, -104, -29, -30, -75, -41, -24, -35, -22, -35, -24, -19, -58, -39, -25, -23, -31, -39, -40, -100, -101, -103, -25, -101, -99, -81, Ascii.DC4, 19, -24, 17, Ascii.DC4, Ascii.CAN, 10, -21, Ascii.SUB, 17, 17, Ascii.CAN, 8, Ascii.ETB, 10, 10, 19, -5, Ascii.SO, 10, Ascii.FS, -51, -52, -54, Ascii.CAN, -52, -50, -83, -84, -124, -77, -86, -86, -79, -95, -80, -93, -93, -84, -108, -89, -93, -75, 102, 101, 99, -79, 101, 103, -82, -83, -107, -96, -85, -76, -92, -111, -92, -96, -93, 103, 102, 100, -78, 102, 107, 95, 102, 100, -78, 102, 107, 95, 102, 100, -78, 102, 104, 122, Ascii.FS, Ascii.ESC, 3, Ascii.SO, Ascii.EM, 34, Ascii.DC2, 4, Ascii.US, Ascii.SYN, 33, 33, Ascii.DC2, Ascii.ESC, -43, -44, -46, 32, -44, -39, -51, -44, -46, 32, -44, -42, -24, -71, -85, -87, -75, -76, -86, -91, -87, -82, -89, -76, -76, -85, -78, -81, -95, -80, 125, -79, -80, -92, -121, -95, -75, 100, 99, 97, -81, 99, 104, 99, 97, -81, 99, 101, 119, -9, -23, -8, -58, -27, -9, -23, -70, -72, -59, -9, -9, -23, -8, -9, -84, -85, -87, -9, -85, -80, -85, -87, -9, -85, -83, -31, -45, -30, -80, -49, -31, -45, -92, -94, -79, -35, -36, -44, -41, -43, -106, -107, -109, -31, -107, -102, -107, -109, -31, -107, -105, -77, -82, -77, -96, -85, -106, -107, -115, -76, -84, -58, -61, -67, -34, -47, -52, -51, -41, -83, -34, -51, -42, -36, -112, -113, -115, -37, -113, -108, -120, -113, -115, -37, -113, -108, -120, -113, -115, -37, -113, -111, -93, -78, -91, -95, -77, -114, -95, -99, -96, -75, -112, -85, -113, -92, -85, -77, 100, 99, 97, -81, 99, 101, 119};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds for length 21
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A0i(Map<String, String> map) {
        String A0A = A0A(87, 16, 86);
        if (map.containsKey(A0A) && U7.A1v(this.A0B)) {
            try {
                JSONArray jSONArray = new JSONArray(map.get(A0A));
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONArray jSONArray2 = new JSONArray(jSONArray.getString(i));
                    String string = jSONArray2.getString(0);
                    String string2 = jSONArray2.getString(1);
                    String string3 = jSONArray2.getString(2);
                    String string4 = jSONArray2.getString(3);
                    if (string != null && string2 != null && string3 != null) {
                        C1383h9 c1383h9 = new C1383h9(this.A09.A25(), Long.parseLong(string), Long.parseLong(string2), Long.parseLong(string3));
                        c1383h9.A06(Long.parseLong(string4));
                        arrayList.add(c1383h9);
                    }
                }
                String A01 = C1382h8.A01(arrayList);
                HashMap hashMap = new HashMap();
                hashMap.put(A0A(115, 6, 126), A01);
                if (A01 != null) {
                    this.A0C.ABQ(this.A09.A25(), hashMap);
                }
            } catch (Exception e) {
                this.A0B.A08().AAy(A0A(274, 14, 14), 3600, new C0767Sw(e));
            }
        }
        boolean containsKey = map.containsKey(A0A);
        if (A0L[0].charAt(7) != 'P') {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[4] = "rUTki8v1ZwD35w0l1wx8OInXS6BY1neH";
        strArr[7] = "OANcXSK4xu3EG1xYwZDVITEIbLyQGtEs";
        if (containsKey) {
            map.remove(A0A);
        }
        this.A0C.AAx(this.A09.A25(), new C0938Zp(map).A03(this.A05).A05());
    }

    static {
        A0D();
        A0N = new AtomicInteger();
        A0M = new AtomicInteger();
    }

    public C1064bt(C1153dL c1153dL, AbstractC1428hy abstractC1428hy, US us, int i) {
        this.A0B = c1153dL;
        this.A0C = us;
        this.A09 = abstractC1428hy;
        this.A08 = i;
        this.A0F = new I5(this, c1153dL);
        this.A0A = new SF(this.A0B);
        this.A0D = new C0796Ua(abstractC1428hy.A25(), us);
        this.A0E = new C1051bg(abstractC1428hy.A17(), abstractC1428hy.A20().A0H().A09(), i);
        this.A0H = AbstractC1074c3.A00(this.A0B, abstractC1428hy.A1C(), this.A0A, this.A0D, this.A0E, A0H());
        this.A0G = new C1072c1(this.A0B, this, us, this.A0E, this.A0I, abstractC1428hy.A25());
    }

    public static AtomicInteger A0B() {
        return A0M;
    }

    private void A0C() {
        A0F(new C1061bq(A0A(288, 22, 4), new String[]{this.A0I, A0A(1, 6, 67)}));
        String replace = Base64.encodeToString(this.A0H.A04.toString().getBytes(), 0).replace(A0A(0, 1, 119), A0A(0, 0, 35));
        String assets = this.A0I;
        A0F(new C1061bq(A0A(310, 26, 76), new String[]{replace, assets}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A0E() {
        if (this.A06) {
            while (!this.A0J.isEmpty()) {
                C1061bq poll = this.A0J.poll();
                if (poll != null) {
                    this.A0F.A0I(String.format(Locale.US, poll.A00, poll.A02));
                    if (poll.A01) {
                        this.A0D.A04(UZ.A0L, null);
                        this.A0B.A0F().A5x(poll.A00);
                    }
                }
            }
        }
    }

    private synchronized void A0F(C1061bq c1061bq) {
        this.A0J.offer(c1061bq);
        A0E();
    }

    private boolean A0H() {
        return !A0I();
    }

    private boolean A0I() {
        return U7.A2s(this.A0B, C1208eF.A03());
    }

    public final C0796Ua A0K() {
        return this.A0D;
    }

    public final XH A0L() {
        return this.A01;
    }

    public final C1051bg A0M() {
        return this.A0E;
    }

    public final InterfaceC1053bi A0N() {
        return this.A02;
    }

    public final I5 A0O() {
        return this.A0F;
    }

    public final void A0P() {
        A0F(new C1061bq(A0A(23, 26, 91), new String[]{this.A0I}));
    }

    public final void A0Q() {
        A0F(new C1061bq(A0A(49, 25, 66), new String[]{this.A0I}));
    }

    public final void A0R() {
        this.A07 = true;
    }

    public final void A0S() {
        this.A07 = false;
    }

    public final void A0T() {
        A0F(new C1061bq(A0A(121, 23, 37), new String[]{this.A0I}));
    }

    public final void A0U() {
        A0F(new C1061bq(A0A(Opcodes.JSR, 27, 109), new String[]{this.A0I}));
    }

    public final void A0V() {
        A0F(new C1061bq(A0A(Opcodes.MONITOREXIT, 22, 6), new String[]{this.A0I}));
    }

    public final void A0W() {
        A0F(new C1061bq(A0A(404, 22, 4), new String[]{this.A0I}));
    }

    public final void A0X() {
        this.A0F.addJavascriptInterface(this.A0G, A0A(7, 16, 68));
        this.A0D.A04(UZ.A0O, null);
        String str = this.A0H.A00;
        this.A0F.loadUrl(str);
        this.A00 = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            String url = A0A(372, 3, 25);
            jSONObject.put(url, str);
            String url2 = A0A(103, 12, 107);
            jSONObject.put(url2, AbstractC1065bu.A00());
            String url3 = A0A(362, 10, 7);
            jSONObject.put(url3, A0N.getAndIncrement());
            String url4 = A0A(74, 13, 0);
            jSONObject.put(url4, A0M);
        } catch (JSONException unused) {
        }
        this.A0B.A0F().A63(jSONObject.toString());
        A0C();
    }

    public final void A0Y() {
        A0F(new C1061bq(A0A(Opcodes.D2F, 24, 60), new String[]{this.A0I}));
    }

    public final void A0Z(XH xh) {
        this.A01 = xh;
    }

    public final void A0a(InterfaceC1053bi interfaceC1053bi) {
        this.A02 = interfaceC1053bi;
    }

    public final void A0b(InterfaceC1062br interfaceC1062br) {
        this.A03 = interfaceC1062br;
    }

    public final void A0c(InterfaceC1063bs interfaceC1063bs) {
        this.A04 = interfaceC1063bs;
    }

    public final void A0d(I3 i3) {
        this.A0G.A0N(i3);
    }

    public final void A0e(C1226eX c1226eX) {
        this.A05 = c1226eX;
    }

    public final void A0f(String str) {
        A0F(new C1061bq(A0A(247, 27, 117), new String[]{this.A0I, str}));
    }

    public final void A0g(String str, String str2) {
        A0F(new C1061bq(A0A(217, 30, 7), new String[]{this.A0I, str, str2}));
    }

    public final void A0h(String str, JSONObject jSONObject) {
        A0F(new C1061bq(A0A(375, 29, 48), new String[]{this.A0I, str, jSONObject.toString()}, false));
    }

    public final void A0j(JSONObject jSONObject) {
        String replace = Base64.encodeToString(jSONObject.toString().getBytes(), 0).replace(A0A(0, 1, 119), A0A(0, 0, 35));
        String assets = this.A0I;
        A0F(new C1061bq(A0A(336, 26, 54), new String[]{replace, assets}));
    }

    public final boolean A0k() {
        return this.A0G.A0O();
    }

    public final boolean A0l() {
        return this.A07;
    }
}
