package com.instagram.common.viewpoint.core;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.io.encoding.Base64;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.iG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1448iG implements MK {
    public static byte[] A08;
    public final MJ A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Collection<String> A06;
    public final Map<String, String> A07;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1448iG A00(C6M c6m, JSONObject jSONObject) {
        String optString = jSONObject.optString(A01(33, 6, 120));
        String optString2 = jSONObject.optString(A01(0, 18, Opcodes.FNEG));
        String optString3 = jSONObject.optString(A01(47, 10, 52));
        String A02 = AbstractC0868Wr.A02(jSONObject, A01(18, 2, 83));
        MJ A00 = ML.A00(jSONObject);
        Collection<String> A03 = ML.A03(c6m, jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject(A01(39, 8, 66));
        HashMap hashMap = new HashMap();
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, optJSONObject.optString(next));
            }
        }
        return new C1448iG(optString, optString2, A00, A03, hashMap, optString3, A02, AbstractC0868Wr.A02(jSONObject, A01(20, 13, 89)));
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 119);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A08 = new byte[]{78, 80, 97, 86, 99, 78, 97, 86, 92, 91, 76, 80, 92, 90, 90, 78, 91, 81, 45, 62, 53, 62, 51, 66, 73, 64, 68, 53, 52, 47, 51, 64, Base64.padSymbol, 92, 80, 97, 90, 100, 95, 38, Ascii.RS, 45, Ascii.SUB, Ascii.GS, Ascii.SUB, 45, Ascii.SUB, Ascii.GS, 16, Ascii.FS, 32, 16, Ascii.RS, Ascii.US, 10, Ascii.DC4, Ascii.SI};
    }

    public C1448iG(String str, String str2, MJ mj, Collection<String> detectionStrings, Map<String, String> metadata, String str3, String str4, String str5) {
        this.A04 = str;
        this.A01 = str2;
        this.A00 = mj;
        this.A06 = detectionStrings;
        this.A07 = metadata;
        this.A05 = str3;
        this.A02 = str4;
        this.A03 = str5;
    }

    public final String A03() {
        return this.A01;
    }

    public final String A04() {
        return this.A04;
    }

    public final String A05() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.MK
    public final String A7G() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.MK
    public final Collection<String> A7h() {
        return this.A06;
    }

    @Override // com.instagram.common.viewpoint.core.MK
    public final MJ A8C() {
        return this.A00;
    }
}
