package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.anythink.basead.ui.BaseATView;
import com.anythink.core.common.s.a.c;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.ew, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1729ew {
    public static byte[] A00;
    public static String[] A01 = {"m5Jty9nXe8L2gKLWEWc3vH5rHCR7lq15", "nXqLn2RrfIlx0c2v1RTl0CneHVNjUcek", "yIjJHM1120PmYi1BMLCe9caFimcQ2nFl", "mlpcJRY57Lt3u3e0DOF4Ze17XEKszIMh", "yNEzWcoMu1kvA6ly91E0yJELmkdnUTW9", "LQJ0sSZIBnjE3wRe9pGlPD4TX9Tbmis1", "3e9PCxJTK3pug342JyVCHaGplQMI3S8I", "kyVsWmEjdCkwx1v5lgIpAQohzDFxobhM"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static WebResourceResponse A00(C1839gi c1839gi, WebResourceRequest webResourceRequest, Uri uri, String str, HashMap<String, String> hashMap) throws IOException {
        String A02 = A02(85, 5, 1);
        C5Y A0H = C1770fb.A06(c1839gi.A02()).A0H(c1839gi);
        C1245Sx.A0H(c1839gi, uri.toString());
        try {
            C1730ex c1730ex = new C1730ex(c1839gi.A02(), uri, A0H);
            int available = c1730ex.available();
            if (available <= 0) {
                A05(c1839gi, 1, new Pair[]{new Pair(A02(61, 9, 46), String.valueOf(available))});
                return null;
            }
            String A03 = A03(webResourceRequest.getRequestHeaders());
            if (A03 == null) {
                c1839gi.A0F().A6D();
                A06(hashMap, available);
                return new WebResourceResponse(str, null, 200, A02(44, 2, 122), hashMap, c1730ex);
            }
            try {
                C1728ev A012 = A01(A03);
                if (!A012.A03) {
                    A05(c1839gi, 0, new Pair[]{new Pair(A02(94, 5, 77), A012.A02 != null ? A012.A02 : A02(90, 4, 30))});
                    return null;
                }
                int i = A012.A01;
                int i4 = A012.A00 == -1 ? available - 1 : A012.A00;
                A06(hashMap, available);
                hashMap.put(A02(31, 13, 93), A02(75, 6, 3) + i + A02(1, 1, 92) + i4 + A02(2, 1, 88) + available);
                c1839gi.A0F().A6D();
                return new WebResourceResponse(str, null, BaseATView.a.f9926E, A02(46, 15, 10), hashMap, c1730ex);
            } catch (NumberFormatException e6) {
                A05(c1839gi, 3, new Pair[]{new Pair(A02, e6.toString())});
                return null;
            }
        } catch (IOException e9) {
            A05(c1839gi, 2, new Pair[]{new Pair(A02, e9.toString())});
            return null;
        }
    }

    public static String A02(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 26);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-114, -93, -95, 100, -104, -70, -70, -68, -57, -53, -124, -87, -72, -59, -66, -68, -54, -70, -26, -27, -21, -36, -27, -21, -92, -61, -36, -27, -34, -21, -33, -70, -26, -27, -21, -36, -27, -21, -92, -55, -40, -27, -34, -36, -29, -33, 116, -123, -106, -104, -115, -123, -112, 68, 103, -109, -110, -104, -119, -110, -104, -87, -66, -87, -79, -76, -87, -86, -76, -83, -127, -104, -109, -124, -110, Byte.MAX_VALUE, -106, -111, -126, -112, 61, -74, -62, -73, -72, c.f16474a, -115, -115, -118, -115, -90, -83, -92, -92, -39, -56, -43, -50, -52};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A05(C1839gi c1839gi, int i, Pair<String, String>[] pairArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A02(81, 4, 57), i);
            for (Pair<String, String> pair : pairArr) {
                jSONObject.put((String) pair.first, pair.second);
            }
        } catch (JSONException unused) {
        }
        c1839gi.A0F().A6C(jSONObject.toString());
    }

    static {
        A04();
    }

    public static C1728ev A01(String str) {
        if (str == null) {
            C1728ev parseResult = new C1728ev();
            parseResult.A03 = false;
            parseResult.A02 = null;
            return parseResult;
        }
        String[] strArr = A01;
        if (strArr[0].charAt(24) != strArr[1].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "Dtu90aCnfjxtl3iZcl85ZURNtT9G66qF";
        strArr2[6] = "JBE4H6DVGxkCv3KpLfIzSFjkaXJMKyPO";
        String[] split = str.split(A02(3, 1, 13));
        if (split.length >= 2) {
            if (A02(70, 5, 5).equals(split[0].toLowerCase(Locale.US).trim())) {
                if (split[1].trim().split(A02(0, 1, 72)).length != 1) {
                    C1728ev c1728ev = new C1728ev();
                    c1728ev.A03 = false;
                    c1728ev.A02 = str;
                    return c1728ev;
                }
                String[] ranges = split[1].trim().split(A02(1, 1, 92));
                C1728ev c1728ev2 = new C1728ev();
                c1728ev2.A03 = true;
                c1728ev2.A02 = str;
                c1728ev2.A01 = TextUtils.isEmpty(ranges[0]) ? 0 : Integer.parseInt(ranges[0]);
                if (ranges.length > 1) {
                    c1728ev2.A00 = TextUtils.isEmpty(ranges[1]) ? -1 : Integer.parseInt(ranges[1]);
                } else {
                    c1728ev2.A00 = -1;
                }
                return c1728ev2;
            }
        }
        C1728ev c1728ev3 = new C1728ev();
        c1728ev3.A03 = false;
        c1728ev3.A02 = str;
        return c1728ev3;
    }

    public static String A03(Map<String, String> map) {
        for (String str : map.keySet()) {
            Locale locale = Locale.US;
            String[] strArr = A01;
            String header = strArr[0];
            if (header.charAt(24) != strArr[1].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "WwPgvkKaNJbx73tjItPTyID0XOg3nGIt";
            strArr2[6] = "4YitGEy8BigPs3HGnT2LP2sfmluRsQ6B";
            if (A02(94, 5, 77).equals(str.toLowerCase(locale))) {
                return map.get(str);
            }
        }
        return null;
    }

    public static void A06(HashMap<String, String> hashMap, int i) {
        hashMap.put(A02(4, 13, 61), A02(70, 5, 5));
        hashMap.put(A02(17, 14, 93), String.valueOf(i));
    }
}
