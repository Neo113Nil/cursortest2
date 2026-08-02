package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.c1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1072c1 {
    public static byte[] A08;
    public static String[] A09 = {"wHWy6mJnObE4TdegwzR1XIqaiMp2qzo2", "2kKTv183xGQoCJ4bH8MOQBKEcrYPubr8", "yAnU2m0QEWVpmJNiipOenY", "2CWVvRtjqdC7", "Y1Dj6sRIbzGHXk3FXnyOisKccxY5ExT7", "AAUb4pYdx4XqEM8CotKihUFr9wNvuug2", "KLTFv3N2v474XPM9CBPbC4npqkPjZQN", "uonDorlDhYGoL6YzDZYQroxkAXvFfbHU"};
    public WeakReference<C1064bt> A00;
    public WeakReference<I3> A01 = new WeakReference<>(null);
    public boolean A02 = false;
    public final C1153dL A03;
    public final C1051bg A04;
    public final String A05;
    public final String A06;
    public final WeakReference<US> A07;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 12);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        byte[] bArr = {-121, -109, -111, -111, -123, -110, -120, -110, -109, -108, -113, -93, -102, -94, 112, Byte.MAX_VALUE, 120, 107, -93, -78, -85, -85, -94, -87, -100, -96, -84, -95, -94, -86, -71, -78, -78, -87, -80, -93, -79, -87, -73, -73, -91, -85, -87, -15, 0, -7, -7, -16, -9, -22, -1, 4, -5, -16, -18, -24, -4, -56, -55, -72, -62, -67, -127, 114, -122, -124, 118, 117, 83, -118, 102, -124, 118, -125, -31, -30, -49, -32, -30, -45, -46, -80, -25, -61, -31, -45, -32, -14, -13, -32, -13, -28, -39, -42, -48, -81, -55, -35, -84, -105, -94, -85, -101};
        if (A09[5].charAt(6) == '8') {
            throw new RuntimeException();
        }
        A09[3] = "q8I1zS5uUBp9u7UYsB3eM38aYjAC";
        A08 = bArr;
    }

    static {
        A09();
    }

    public C1072c1(C1153dL c1153dL, C1064bt c1064bt, US us, C1051bg c1051bg, String str, String str2) {
        this.A03 = c1153dL;
        this.A00 = new WeakReference<>(c1064bt);
        this.A07 = new WeakReference<>(us);
        this.A04 = c1051bg;
        this.A05 = str;
        this.A06 = str2;
    }

    public static Map<String, String> A03(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.optString(next));
        }
        return hashMap;
    }

    private void A04() {
        I3 uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.close();
        if (A09[3].length() == 20) {
            throw new RuntimeException();
        }
        String[] strArr = A09;
        strArr[2] = "rLuDNCDiUJCt8jrcDw8nHa";
        strArr[6] = "w5dFeIXZRXYPRcNf7kYaeIakMq27def";
    }

    private void A05() {
        I3 uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A9c();
    }

    private void A06() {
        I3 uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.AAd();
    }

    private void A07() {
        this.A03.A0F().A5w();
        this.A02 = true;
        I3 uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.AJS();
        if (U7.A1u(this.A03)) {
            this.A03.A0B().ACx();
        }
    }

    private void A08() {
        I3 uxActionsJavascriptListener = this.A01.get();
        if (uxActionsJavascriptListener == null) {
            return;
        }
        uxActionsJavascriptListener.ADM();
    }

    private void A0A(C1064bt c1064bt, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        SharedPreferences A00 = AbstractC0825Ve.A00(this.A03);
        String A01 = A01(57, 5, 77);
        String A012 = A01(0, 0, 53);
        String storageValue = jSONObject.optString(A01, A012);
        String key = jSONObject.optString(A01(54, 3, 119), A01(7, 7, 34));
        String string = A00.getString(A01(14, 4, 0) + key, A012);
        if (string != null) {
            A012 = string;
        }
        c1064bt.A0g(storageValue, A012);
    }

    private void A0B(C1064bt c1064bt, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String A01 = A01(98, 5, 42);
        String A012 = A01(0, 0, 53);
        String optString = jSONObject.optString(A01, A012);
        String optString2 = jSONObject.optString(A01(57, 5, 77), A012);
        AbstractC0825Ve.A00(this.A03).edit().putString(A01(14, 4, 0) + jSONObject.optString(A01(54, 3, 119), A01(7, 7, 34)), optString).apply();
        c1064bt.A0f(optString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A0C(EnumC1070bz enumC1070bz, String str) throws JSONException {
        C1064bt c1064bt;
        switch (C1069by.A00[enumC1070bz.ordinal()]) {
            case 1:
                A0I(new JSONObject(str));
                c1064bt = this.A00.get();
                if (c1064bt != null) {
                    return;
                }
                switch (C1069by.A00[enumC1070bz.ordinal()]) {
                    case 19:
                        c1064bt.A0S();
                        return;
                    case 20:
                        c1064bt.A0R();
                        return;
                    case 21:
                        A0B(c1064bt, str);
                        return;
                    case 22:
                        A0A(c1064bt, str);
                        return;
                    case 23:
                        c1064bt.A0i(A03(new JSONObject(str)));
                        return;
                    default:
                        return;
                }
            case 2:
                A06();
                c1064bt = this.A00.get();
                if (c1064bt != null) {
                }
                break;
            case 3:
                A04();
                c1064bt = this.A00.get();
                if (c1064bt != null) {
                }
                break;
            case 4:
                A07();
                c1064bt = this.A00.get();
                if (c1064bt != null) {
                }
                break;
            case 5:
                A0K(new JSONObject(str));
                c1064bt = this.A00.get();
                if (c1064bt != null) {
                }
                break;
            case 6:
                A0L(new JSONObject(str));
                c1064bt = this.A00.get();
                if (c1064bt != null) {
                }
                break;
            case 7:
                boolean isDebug = BuildConfigApi.isDebug();
                String[] strArr = A09;
                if (strArr[2].length() != strArr[6].length()) {
                    String[] strArr2 = A09;
                    strArr2[7] = "ti0FJd6QzsmsCUgFEJNk2tGDtWFDX3UL";
                    strArr2[0] = "2bsL1IjRD3bcdVR1Mvy0yjSySADV0GcP";
                    if (isDebug) {
                    }
                    c1064bt = this.A00.get();
                    if (c1064bt != null) {
                    }
                } else {
                    throw new RuntimeException();
                }
                break;
            case 8:
                A05();
                this.A03.A0F().A68(str);
                c1064bt = this.A00.get();
                if (c1064bt != null) {
                }
                break;
            case 9:
                this.A03.A0F().A68(str);
                c1064bt = this.A00.get();
                if (c1064bt != null) {
                }
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                A0D(enumC1070bz, str);
                c1064bt = this.A00.get();
                if (c1064bt != null) {
                }
                break;
            case 15:
                A0J(new JSONObject(str));
                c1064bt = this.A00.get();
                if (c1064bt != null) {
                }
                break;
            case 16:
                A08();
                c1064bt = this.A00.get();
                if (c1064bt != null) {
                }
                break;
            case 17:
                A0M(new JSONObject(str));
                c1064bt = this.A00.get();
                if (c1064bt != null) {
                }
                break;
            default:
                c1064bt = this.A00.get();
                if (c1064bt != null) {
                }
                break;
        }
    }

    private void A0D(EnumC1070bz enumC1070bz, String str) throws JSONException {
        I3 i3 = this.A01.get();
        if (i3 == null) {
        }
        switch (C1069by.A00[enumC1070bz.ordinal()]) {
            case 10:
                i3.ADQ();
                break;
            case 11:
                i3.AFG();
                break;
            case 12:
                A0G(i3, str);
                break;
            case 13:
                A0F(i3, str);
                break;
            case 14:
                A0E(i3, str);
                break;
        }
    }

    private void A0E(I3 i3, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STATE_KEY = A01(87, 5, 115);
        i3.AEF(jSONObject.optBoolean(STATE_KEY, false));
    }

    private void A0F(I3 i3, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String PAUSED_BY_USER_KEY = A01(62, 12, 5);
        i3.AFn(jSONObject.optBoolean(PAUSED_BY_USER_KEY, false));
    }

    private void A0G(I3 i3, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STARTED_BY_USER_KEY = A01(74, 13, 98);
        i3.AFp(jSONObject.optBoolean(STARTED_BY_USER_KEY, false));
    }

    private void A0I(JSONObject jSONObject) {
        I3 i3 = this.A01.get();
        if (i3 == null) {
            return;
        }
        String productUrl = jSONObject.optString(A01(0, 7, 24));
        if (TextUtils.isEmpty(productUrl)) {
            i3.A9X();
        } else {
            i3.A9Y(productUrl);
        }
    }

    private void A0J(JSONObject jSONObject) {
        I3 uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        jSONObject.optString(A01(0, 7, 24));
    }

    private void A0K(JSONObject jSONObject) {
        US us = this.A07.get();
        if (us == null) {
            return;
        }
        if (A09[3].length() == 20) {
            throw new RuntimeException();
        }
        A09[3] = "hDImTkFK3KoL7AYoPxXIP";
        String key = jSONObject.optString(A01(43, 11, 127));
        if (TextUtils.isEmpty(key)) {
            return;
        }
        C0796Ua handler = new C0796Ua(this.A06, us);
        handler.A05(key, A03(jSONObject));
    }

    private void A0L(JSONObject jSONObject) {
        int optInt = jSONObject.optInt(A01(18, 11, 49), -1);
        if (optInt == -1) {
            return;
        }
        String message = jSONObject.optString(A01(29, 14, 56));
        if (TextUtils.isEmpty(message)) {
            return;
        }
        this.A03.A0F().AAw(optInt, message);
        String[] strArr = A09;
        String message2 = strArr[2];
        String str = strArr[6];
        int length = message2.length();
        int code = str.length();
        if (length == code) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[7] = "NCNoRnun1G3dlwmqoYaN2uZPLfccAkgr";
        strArr2[0] = "12RLbgldZ9TmNXvaOMkOvzOeimlYTJg9";
    }

    private void A0M(JSONObject jSONObject) {
        I3 i3 = this.A01.get();
        if (i3 == null) {
            return;
        }
        String A01 = A01(92, 6, 88);
        String[] strArr = A09;
        if (strArr[2].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[7] = "rydiERFHLfFXOcJD9tadKbqyFej0NUPk";
        strArr2[0] = "tiiagSBkZ4Sc0Tn3kexlzzs5G1JfuHdZ";
        String optString = jSONObject.optString(A01);
        if (optString == null) {
            return;
        }
        i3.AG4(optString);
    }

    public final void A0N(I3 i3) {
        this.A01 = new WeakReference<>(i3);
    }

    public final boolean A0O() {
        return this.A02;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        XJ.A00(new RunnableC1068bx(this, str));
    }
}
