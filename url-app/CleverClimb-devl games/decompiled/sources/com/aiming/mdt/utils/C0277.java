package com.aiming.mdt.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.aiming.mdt.a.C0045;
import com.aiming.mdt.a.C0067;
import com.aiming.mdt.a.C0076;
import com.aiming.mdt.a.C0088;
import com.aiming.mdt.a.C0131;
import com.aiming.mdt.a.C0162;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.aiming.mdt.utils.ʻʼʽʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0277 {
    /* renamed from: ʻʼ, reason: contains not printable characters */
    protected static C0067 m942(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("imp string : ");
        sb.append(str);
        C0282.m971(sb.toString());
        C0067 c0067 = new C0067();
        try {
            StringBuilder sb2 = new StringBuilder("PlacementUtils imp string : ");
            sb2.append(Uri.decode(str));
            C0282.m971(sb2.toString());
            JSONObject jSONObject = new JSONObject(Uri.decode(str));
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                List<C0067.C0068> m943 = m943(jSONObject.optJSONArray(next));
                if (m943 != null && !m943.isEmpty()) {
                    hashMap.put(next, m943);
                }
            }
            c0067.m206(hashMap);
            return c0067;
        } catch (JSONException e) {
            C0282.m972("PlacementUtils", e);
            C0076.m232().m236(e);
            return null;
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static List<C0067.C0068> m943(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            C0067.C0068 c0068 = new C0067.C0068();
            c0068.m211(optJSONObject.optLong("last_imp_time"));
            c0068.m208(optJSONObject.optInt("imp_count"));
            c0068.m218(optJSONObject.optString("time"));
            c0068.m216(optJSONObject.optString("pkg_name"));
            c0068.m209(optJSONObject.optString("placement_id"));
            c0068.m212(optJSONObject.optString("campaign_id"));
            arrayList.add(c0068);
        }
        return arrayList;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static String m944(C0045 c0045, int i) {
        String format;
        C0067 m942;
        List<C0067.C0068> list;
        StringBuilder sb = new StringBuilder();
        try {
            format = new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date());
            m942 = m942((String) C0162.m619().m622("ImpRecord", String.class));
        } catch (Throwable th) {
            C0282.m972("PlacementUtils", th);
            C0076.m232().m236(th);
        }
        if (m942 == null) {
            return "";
        }
        Map<String, List<C0067.C0068>> m205 = m942.m205();
        String concat = String.valueOf(c0045.m124()).trim().concat("_imp");
        if (m205 != null && m205.containsKey(concat) && (list = m205.get(concat)) != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (C0067.C0068 c0068 : list) {
                if (c0068 != null) {
                    if (TextUtils.equals(format, c0068.m207())) {
                        int m214 = c0068.m214();
                        long m213 = c0068.m213();
                        int m114 = c0045.m114();
                        if (m214 >= i || System.currentTimeMillis() - m213 < m114 * 1000) {
                            sb.append(c0068.m210());
                            sb.append(",");
                        }
                    } else {
                        arrayList.add(c0068);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                list.remove((C0067.C0068) it.next());
            }
            m205.put(concat, list);
            m942.m206(m205);
            C0162.m619().m624("ImpRecord", Uri.encode(m946(m942)));
            return sb.length() > 0 ? sb.substring(0, sb.length() - 1) : sb.toString();
        }
        return "";
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static Map<String, String> m945(String str, C0088 c0088) {
        C0131 c0131 = (C0131) C0162.m619().m622("Config", C0131.class);
        HashMap hashMap = new HashMap();
        hashMap.put("AppKey", c0131.m497().get(Integer.valueOf(c0088.m313())).m932());
        hashMap.put("PlacementId", str);
        hashMap.put("InstanceKey", c0088.m304());
        hashMap.put("InstanceId", String.valueOf(c0088.m311()));
        return hashMap;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    protected static String m946(C0067 c0067) {
        try {
            JSONObject jSONObject = new JSONObject();
            Map<String, List<C0067.C0068>> m205 = c0067.m205();
            for (String str : m205.keySet()) {
                List<C0067.C0068> list = m205.get(str);
                if (list != null && !list.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    for (C0067.C0068 c0068 : list) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("campaign_id", c0068.m215());
                        jSONObject2.put("imp_count", c0068.m214());
                        jSONObject2.put("last_imp_time", c0068.m213());
                        jSONObject2.put("pkg_name", c0068.m210());
                        jSONObject2.put("placement_id", c0068.m217());
                        jSONObject2.put("time", c0068.m207());
                        jSONArray.put(jSONObject2);
                    }
                    jSONObject.put(str, jSONArray);
                }
            }
            return jSONObject.toString();
        } catch (Exception e) {
            C0282.m972("PlacementUtils", e);
            C0076.m232().m236(e);
            return null;
        }
    }
}
