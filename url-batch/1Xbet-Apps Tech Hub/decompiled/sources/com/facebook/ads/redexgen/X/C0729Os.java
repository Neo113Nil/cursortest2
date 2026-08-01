package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.google.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Os, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0729Os {
    public static byte[] A08;
    public WeakReference<C0718Oh> A00;
    public WeakReference<SV> A01 = new WeakReference<>(null);
    public boolean A02 = false;
    public final YA A03;
    public final OU A04;
    public final String A05;
    public final String A06;
    public final WeakReference<InterfaceC0565If> A07;

    static {
        A09();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 116);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A08 = new byte[]{44, 56, 54, 54, 42, 55, 45, 10, Ascii.VT, Ascii.FF, 7, Ascii.ESC, Ascii.DC2, Ascii.SUB, 63, 78, 71, 58, -29, -14, -21, -21, -30, -23, -36, -32, -20, -31, -30, Ascii.FF, Ascii.ESC, Ascii.DC4, Ascii.DC4, Ascii.VT, Ascii.DC2, 5, 19, Ascii.VT, Ascii.EM, Ascii.EM, 7, Ascii.CR, Ascii.VT, -37, -22, -29, -29, -38, -31, -44, -23, -18, -27, -38, -23, -29, -9, 52, 53, 36, 46, 41, 90, 75, 95, 93, 79, 78, 44, 99, 63, 93, 79, 92, 57, 58, 39, 56, 58, 43, 42, 8, 63, Ascii.ESC, 57, 43, 56, 83, 84, 65, 84, 69, 48, 45, 39, 6, 32, 52, -10, -31, -20, -11, -27};
    }

    public C0729Os(YA ya, C0718Oh c0718Oh, InterfaceC0565If interfaceC0565If, OU ou, String str, String str2) {
        this.A03 = ya;
        this.A00 = new WeakReference<>(c0718Oh);
        this.A07 = new WeakReference<>(interfaceC0565If);
        this.A04 = ou;
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
        SV uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.close();
    }

    private void A05() {
        SV uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A8N();
    }

    private void A06() {
        SV uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A96();
    }

    private void A07() {
        this.A03.A0E().A5A();
        this.A02 = true;
        SV uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.AFn();
        if (IP.A1X(this.A03)) {
            this.A03.A0A().AB1();
        }
    }

    private void A08() {
        SV uxActionsJavascriptListener = this.A01.get();
        if (uxActionsJavascriptListener == null) {
            return;
        }
        uxActionsJavascriptListener.ABR();
    }

    private void A0A(C0718Oh c0718Oh, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        SharedPreferences A00 = C0602Jt.A00(this.A03);
        String A01 = A01(57, 5, 81);
        String A012 = A01(0, 0, 21);
        String storageValue = jSONObject.optString(A01, A012);
        String key = jSONObject.optString(A01(54, 3, 10), A01(7, 7, 50));
        String string = A00.getString(A01(14, 4, 103) + key, A012);
        if (string != null) {
            A012 = string;
        }
        c0718Oh.A0g(storageValue, A012);
    }

    private void A0B(C0718Oh c0718Oh, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String A01 = A01(98, 5, 12);
        String A012 = A01(0, 0, 21);
        String optString = jSONObject.optString(A01, A012);
        String optString2 = jSONObject.optString(A01(57, 5, 81), A012);
        C0602Jt.A00(this.A03).edit().putString(A01(14, 4, 103) + jSONObject.optString(A01(54, 3, 10), A01(7, 7, 50)), optString).apply();
        c0718Oh.A0f(optString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(EnumC0727Oq enumC0727Oq, String str) throws JSONException {
        switch (C0726Op.A00[enumC0727Oq.ordinal()]) {
            case 1:
                A0I(new JSONObject(str));
                break;
            case 2:
                A06();
                break;
            case 3:
                A04();
                break;
            case 4:
                A07();
                break;
            case 5:
                A0K(new JSONObject(str));
                break;
            case 6:
                A0L(new JSONObject(str));
                break;
            case 7:
                if (BuildConfigApi.isDebug()) {
                }
                break;
            case 8:
                A05();
            case 9:
                this.A03.A0E().A5M(str);
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                A0D(enumC0727Oq, str);
                break;
            case 15:
                A0J(new JSONObject(str));
                break;
            case 16:
                A08();
                break;
            case 17:
                A0M(new JSONObject(str));
                break;
        }
        C0718Oh c0718Oh = this.A00.get();
        if (c0718Oh == null) {
        }
        switch (enumC0727Oq) {
            case A06:
                c0718Oh.A0S();
                break;
            case A05:
                c0718Oh.A0R();
                break;
            case A0P:
                A0B(c0718Oh, str);
                break;
            case A0L:
                A0A(c0718Oh, str);
                break;
            case A0F:
                c0718Oh.A0i(A03(new JSONObject(str)));
                break;
        }
    }

    private void A0D(EnumC0727Oq enumC0727Oq, String str) throws JSONException {
        SV sv = this.A01.get();
        if (sv == null) {
        }
        switch (enumC0727Oq) {
            case A0C:
                sv.ABV();
                break;
            case A0N:
                sv.ACx();
                break;
            case A0K:
                A0G(sv, str);
                break;
            case A0J:
                A0F(sv, str);
                break;
            case A0G:
                A0E(sv, str);
                break;
        }
    }

    private void A0E(SV sv, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STATE_KEY = A01(87, 5, 108);
        sv.AC9(jSONObject.optBoolean(STATE_KEY, false));
    }

    private void A0F(SV sv, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String PAUSED_BY_USER_KEY = A01(62, 12, 118);
        sv.ADS(jSONObject.optBoolean(PAUSED_BY_USER_KEY, false));
    }

    private void A0G(SV sv, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STARTED_BY_USER_KEY = A01(74, 13, 82);
        sv.ADU(jSONObject.optBoolean(STARTED_BY_USER_KEY, false));
    }

    private void A0I(JSONObject jSONObject) {
        SV sv = this.A01.get();
        if (sv == null) {
            return;
        }
        String productUrl = jSONObject.optString(A01(0, 7, 85));
        if (TextUtils.isEmpty(productUrl)) {
            sv.A8I();
        } else {
            sv.A8J(productUrl);
        }
    }

    private void A0J(JSONObject jSONObject) {
        SV uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        jSONObject.optString(A01(0, 7, 85));
    }

    private void A0K(JSONObject jSONObject) {
        InterfaceC0565If interfaceC0565If = this.A07.get();
        if (interfaceC0565If == null) {
            return;
        }
        String optString = jSONObject.optString(A01(43, 11, 1));
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        new C0573In(this.A06, interfaceC0565If).A05(optString, A03(jSONObject));
    }

    private void A0L(JSONObject jSONObject) {
        int optInt = jSONObject.optInt(A01(18, 11, 9), -1);
        if (optInt == -1) {
            return;
        }
        String message = jSONObject.optString(A01(29, 14, 50));
        if (TextUtils.isEmpty(message)) {
            return;
        }
        this.A03.A0E().A9K(optInt, message);
    }

    private void A0M(JSONObject jSONObject) {
        String optString;
        SV sv = this.A01.get();
        if (sv == null || (optString = jSONObject.optString(A01(92, 6, 71))) == null) {
            return;
        }
        sv.ADh(optString);
    }

    public final void A0N(SV sv) {
        this.A01 = new WeakReference<>(sv);
    }

    public final boolean A0O() {
        return this.A02;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        LP.A00(new RunnableC0725Oo(this, str));
    }
}
