package com.ijinshan.cloudconfig.deepcloudconfig;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CloudConfig.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f6691a;

    /* renamed from: d, reason: collision with root package name */
    private final Object f6694d = new Object();

    /* renamed from: c, reason: collision with root package name */
    private Context f6693c = com.ijinshan.cloudconfig.c.a.d();

    /* renamed from: b, reason: collision with root package name */
    private HashMap<Integer, HashMap<String, List<ConfigInfo>>> f6692b = new HashMap<>();
    private List<String> e = new ArrayList();

    public static a a() {
        if (f6691a == null) {
            synchronized (a.class) {
                if (f6691a == null) {
                    f6691a = new a();
                }
            }
        }
        return f6691a;
    }

    private a() {
    }

    public List<ConfigInfo> a(Integer num, String str) {
        HashMap<String, List<ConfigInfo>> hashMap = this.f6692b.get(num);
        if (hashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<ConfigInfo> list = hashMap.get(str);
        if (list != null) {
            arrayList.addAll(list);
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    public String b(Integer num, String str) {
        ConfigInfo configInfo;
        ArrayList arrayList = new ArrayList();
        List<ConfigInfo> a2 = a(num, str);
        StringBuilder sb = new StringBuilder();
        sb.append("listTemp =");
        sb.append(a2 == null ? "null" : Integer.valueOf(a2.size()));
        com.ijinshan.cloudconfig.d.a.a("cloud", sb.toString());
        if (a2 != null) {
            arrayList.addAll(a2);
        }
        return (arrayList.size() < 1 || (configInfo = (ConfigInfo) arrayList.get(0)) == null || configInfo.getData() == null) ? "" : configInfo.getData();
    }

    public synchronized void a(JSONObject jSONObject) {
        HashMap<Integer, HashMap<String, List<ConfigInfo>>> hashMap;
        HashMap<Integer, HashMap<String, List<ConfigInfo>>> hashMap2 = null;
        if (jSONObject != null) {
            try {
                if (this.f6692b != null) {
                    hashMap = new HashMap<>(this.f6692b);
                    this.f6692b.clear();
                } else {
                    hashMap = null;
                }
                try {
                    this.e.clear();
                    JSONArray jSONArray = jSONObject.getJSONArray("data");
                    if (jSONArray != null && jSONArray.length() >= 1) {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String optString = jSONObject2.optString("id", "");
                            if (!TextUtils.isEmpty(optString)) {
                                this.e.add(optString);
                            }
                            HashMap<String, List<ConfigInfo>> hashMap3 = this.f6692b.get(Integer.valueOf(jSONObject2.optInt("func_type")));
                            if (hashMap3 == null) {
                                hashMap3 = new HashMap<>();
                            }
                            List<ConfigInfo> list = hashMap3.get(jSONObject2.opt("section"));
                            if (list == null) {
                                list = new ArrayList<>();
                            }
                            ConfigInfo configInfo = new ConfigInfo();
                            configInfo.setFunc_type(jSONObject2.optInt("func_type"));
                            configInfo.setPriority(jSONObject2.optInt("priority"));
                            configInfo.setSection(jSONObject2.optString("section"));
                            configInfo.setData(jSONObject2.get("key_value").toString());
                            list.add(configInfo);
                            hashMap3.put(jSONObject2.optString("section"), list);
                            this.f6692b.put(Integer.valueOf(jSONObject2.optInt("func_type")), hashMap3);
                        }
                        for (Integer num : this.f6692b.keySet()) {
                            HashMap<String, List<ConfigInfo>> hashMap4 = this.f6692b.get(num);
                            for (String str : hashMap4.keySet()) {
                                List<ConfigInfo> list2 = hashMap4.get(str);
                                if (list2.size() > 1) {
                                    Collections.sort(list2);
                                    hashMap4.put(str, list2);
                                }
                            }
                            this.f6692b.put(num, hashMap4);
                        }
                    }
                } catch (Exception unused) {
                    if (hashMap != null) {
                        this.f6692b = hashMap;
                        hashMap.clear();
                    }
                }
                hashMap2 = hashMap;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (hashMap2 != null && jSONObject != null) {
            hashMap2.clear();
            b.a();
        }
    }

    public void b() {
        a(com.ijinshan.cloudconfig.d.b.a(c()));
    }

    private String c() {
        try {
            if (this.f6693c == null) {
                this.f6693c = com.ijinshan.cloudconfig.c.a.d();
            }
            return this.f6693c.getApplicationContext().getDir("deep_cloud_config", 0).getAbsolutePath() + File.separator + "cloudmsgadv.json";
        } catch (Exception unused) {
            return "";
        }
    }
}
