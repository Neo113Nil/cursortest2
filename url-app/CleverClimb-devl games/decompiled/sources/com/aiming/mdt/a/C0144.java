package com.aiming.mdt.a;

import android.text.TextUtils;
import com.aiming.mdt.a.C0172;
import com.aiming.mdt.adt.C0226;
import com.aiming.mdt.utils.C0271;
import com.aiming.mdt.utils.C0272;
import com.aiming.mdt.utils.C0280;
import com.aiming.mdt.utils.C0282;
import com.tapjoy.TapjoyConstants;
import com.umeng.commonsdk.proguard.d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.aiming.mdt.a.ʼˈˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0144 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private int f472;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private int f473;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private int f474;

    /* renamed from: ʻ, reason: contains not printable characters */
    public static C0131 m542(String str) {
        C0131 c0131 = new C0131();
        try {
            JSONObject jSONObject = new JSONObject(str);
            c0131.m490(jSONObject.optInt("vt"));
            c0131.m500(jSONObject.optInt("mr"));
            c0131.m494(jSONObject.optString("atj"));
            c0131.m488(jSONObject.optInt("cts"));
            c0131.m493(jSONObject.optInt("ct"));
            c0131.m486(jSONObject.optInt("tg"));
            c0131.m498(jSONObject.optInt("pt"));
            c0131.m502(jSONObject.optInt("at"));
            c0131.m483(jSONObject.optInt(d.am));
            JSONObject optJSONObject = jSONObject.optJSONObject("hs");
            if (optJSONObject != null) {
                c0131.m484(optJSONObject.optString("tk"));
                c0131.m487(optJSONObject.optString(TapjoyConstants.TJC_SDK_PLACEMENT));
            }
            Map<Integer, C0272> m550 = m550(jSONObject.optJSONArray("ms"));
            c0131.m495(m550);
            c0131.m501(m544(m550, jSONObject.optJSONArray("pls")));
            return c0131;
        } catch (Exception e) {
            C0076.m232().m236(e);
            return null;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static Map<Integer, C0088> m543(String str, Map<Integer, C0272> map, int i, JSONArray jSONArray) {
        HashMap hashMap = new HashMap();
        if (jSONArray != null && jSONArray.length() != 0) {
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                C0088 c0088 = new C0088();
                int optInt = optJSONObject.optInt("id");
                int optInt2 = optJSONObject.optInt("m");
                C0272 c0272 = map.get(Integer.valueOf(optInt2));
                if (c0272 != null) {
                    c0088.m298(C0060.m191(c0272.m928(), C0060.m190(i)));
                    String optString = optJSONObject.optString("k");
                    c0088.m296(optInt);
                    if (optInt2 == 0 && TextUtils.isEmpty(optString)) {
                        c0088.m301(str);
                    } else {
                        c0088.m301(optString);
                    }
                    c0088.m305(optInt2);
                    c0088.m553(optJSONObject.optInt("fc"));
                    c0088.m555(optJSONObject.optInt("fu") * 60 * 60 * 1000);
                    c0088.m556(optJSONObject.optInt("fi") * 1000);
                    hashMap.put(Integer.valueOf(optInt), c0088);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static Map<String, C0045> m544(Map<Integer, C0272> map, JSONArray jSONArray) {
        HashMap hashMap = new HashMap();
        int length = jSONArray.length();
        if (length == 0) {
            return hashMap;
        }
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String valueOf = String.valueOf(optJSONObject.optInt("id"));
            int optInt = optJSONObject.optInt("t");
            if (!C0162.m619().m623("GTPid")) {
                C0162.m619().m624("GTPid", valueOf);
            }
            C0045 c0045 = new C0045();
            c0045.m118(valueOf);
            c0045.m117(optJSONObject.optInt("dm"));
            c0045.m115(optJSONObject.optInt("vd"));
            c0045.m123(optJSONObject.optInt("mk"));
            c0045.m110(optInt);
            c0045.m112(optJSONObject.optInt("mi"));
            c0045.m129(optJSONObject.optInt("vk"));
            c0045.m120(optJSONObject.optInt("ii"));
            c0045.m127(optJSONObject.optInt("vid"));
            c0045.m553(optJSONObject.optInt("fc"));
            c0045.m555(optJSONObject.optInt("fu") * 60 * 60 * 1000);
            c0045.m556(optJSONObject.optInt("fi") * 1000);
            c0045.m125(m543(valueOf, map, optInt, optJSONObject.optJSONArray("ins")));
            hashMap.put(String.valueOf(valueOf), c0045);
        }
        return hashMap;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static void m545(String str, int i, int i2, String str2) {
        try {
            String m960 = C0280.m960(1, str2);
            if (TextUtils.isEmpty(m960)) {
                return;
            }
            C0026.m23().m672(m960).m668(C0226.m826()).m665(new C0271(C0280.m963(1, str, String.valueOf(i2), String.valueOf(i)))).m671(30000).m667(60000).m669(true).m670(C0226.m829());
        } catch (Exception e) {
            C0282.m970("HttpLR error ", e);
            C0076.m232().m236(e);
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static void m546(String str, int i, int i2, String str2, int i3, int i4, int i5, int i6, int i7) {
        byte[] m963;
        try {
            String m960 = C0280.m960(6, new String[0]);
            if (TextUtils.isEmpty(m960) || (m963 = C0280.m963(6, str, String.valueOf(i), String.valueOf(i2), str2, String.valueOf(i3), String.valueOf(i4), String.valueOf(i5), String.valueOf(i6), String.valueOf(i7))) == null) {
                return;
            }
            C0026.m23().m672(m960).m668(C0226.m826()).m665(new C0271(m963)).m671(30000).m667(60000).m669(true).m670(C0226.m829());
        } catch (Exception e) {
            C0282.m970("HttpIR error ", e);
            C0076.m232().m236(e);
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static void m547(C0137 c0137, C0172.InterfaceC0174 interfaceC0174) {
        String m960 = C0280.m960(5, new String[0]);
        if (TextUtils.isEmpty(m960)) {
            interfaceC0174.mo14("empty Url");
            return;
        }
        byte[] m963 = C0280.m963(5, c0137.m524(), String.valueOf(c0137.m521()), String.valueOf(c0137.m522()));
        if (m963 == null) {
            interfaceC0174.mo14("build request data error");
        } else {
            C0026.m23().m672(m960).m665(new C0271(m963)).m668(C0226.m826()).m671(30000).m667(60000).m664(interfaceC0174).m670(C0226.m829());
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static void m548(String str, int i, String str2, C0172.InterfaceC0174 interfaceC0174) {
        try {
            String m960 = C0280.m960(0, str, String.valueOf(i), str2);
            if (TextUtils.isEmpty(m960)) {
                interfaceC0174.mo14("empty Url");
            } else {
                C0026.m23().m672(m960).m668(C0226.m826()).m665(new C0271(C0280.m963(0, new String[0]))).m671(30000).m667(60000).m669(true).m664(interfaceC0174).m670(C0226.m829());
            }
        } catch (Exception e) {
            C0282.m970("HttpDanmaku error ", e);
            C0076.m232().m236(e);
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static byte[] m549(C0052 c0052) {
        if (c0052 == null || c0052.m164() != 200) {
            return null;
        }
        try {
            return c0052.m163().mo516();
        } catch (Exception e) {
            C0076.m232().m236(e);
            return null;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static Map<Integer, C0272> m550(JSONArray jSONArray) {
        int length;
        HashMap hashMap = new HashMap();
        if (jSONArray == null || (length = jSONArray.length()) == 0) {
            return hashMap;
        }
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            C0272 c0272 = new C0272();
            String optString = jSONObject.optString("k");
            int optInt = jSONObject.optInt("id");
            String optString2 = jSONObject.optString("n");
            if (optInt == 0) {
                c0272.m929((String) C0162.m619().m622("AppKey", String.class));
                optString2 = "Adtiming";
            } else {
                c0272.m929(optString);
            }
            c0272.m935(optInt);
            c0272.m931(optString2);
            c0272.m933(C0060.m191(optString2, C0060.m190(-1)));
            hashMap.put(Integer.valueOf(optInt), c0272);
        }
        return hashMap;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public int m551() {
        return this.f473;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public int m552() {
        return this.f472;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public void m553(int i) {
        this.f472 = i;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public int m554() {
        return this.f474;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public void m555(int i) {
        this.f474 = i;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m556(int i) {
        this.f473 = i;
    }
}
