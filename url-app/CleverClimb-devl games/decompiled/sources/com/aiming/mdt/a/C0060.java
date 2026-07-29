package com.aiming.mdt.a;

import com.aiming.mdt.utils.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.aiming.mdt.a.ʻʼˈˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0060 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static Map<String, C0088[]> f136 = new HashMap();

    /* renamed from: ʻʼ, reason: contains not printable characters */
    static String m190(int i) {
        switch (i) {
            case 0:
                return Constants.ADTYPE_BANNER;
            case 1:
                return Constants.ADTYPE_NATIVE;
            case 2:
                return Constants.ADTYPE_VIDEO;
            case 3:
                return Constants.ADTYPE_INTERACTIVE;
            case 4:
                return Constants.ADTYPE_INTERSTITIAL;
            default:
                return Constants.ADTYPE_INIT;
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    static String m191(String str, String str2) {
        StringBuilder sb = new StringBuilder("com.aiming.mdt.mobileads.");
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static C0088[] m192(JSONObject jSONObject, C0045 c0045, int i) {
        if (i == 0 || c0045 == null) {
            return new C0088[0];
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("campaigns");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            C0162 m619 = C0162.m619();
            StringBuilder sb = new StringBuilder();
            sb.append(c0045.m124());
            sb.append("refresh");
            m619.m621(sb.toString(), Boolean.TRUE);
            C0162 m6192 = C0162.m619();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c0045.m124());
            sb2.append("-campaigns");
            m6192.m621(sb2.toString(), optJSONArray);
        }
        C0088[] c0088Arr = f136.get(c0045.m124());
        if (c0088Arr != null && c0088Arr.length > 0) {
            return m193(c0088Arr, i);
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("ins");
        if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
            return new C0088[0];
        }
        Map<Integer, C0088> m113 = c0045.m113();
        if (m113 == null || m113.isEmpty()) {
            return new C0088[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
            C0088 c0088 = m113.get(Integer.valueOf(optJSONArray2.optInt(i2)));
            if (c0088 != null) {
                arrayList.add(c0088);
            }
        }
        return arrayList.size() == 0 ? new C0088[0] : m193((C0088[]) arrayList.toArray(new C0088[arrayList.size()]), i);
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static C0088[] m193(C0088[] c0088Arr, int i) {
        C0088[] c0088Arr2 = (C0088[]) Arrays.copyOf(c0088Arr, c0088Arr.length);
        int length = c0088Arr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            C0088 c0088 = c0088Arr2[i3];
            c0088.m299(i3);
            int i4 = i2 + 1;
            if (i3 >= i4 * i) {
                i2 = i4;
            }
            c0088.m310(i2);
            if (i3 % i == 0) {
                c0088.m302(true);
            }
            c0088.m297((Object) null);
            c0088.m306(0L);
        }
        return c0088Arr2;
    }
}
