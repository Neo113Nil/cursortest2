package com.bytedance.sdk.component.yiw.vG;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TNCConfigHandler.java */
/* loaded from: classes.dex */
public class NB {
    private static final Object Jd = new Object();
    private int NB;
    private Jd icD = new Jd();
    private Context pvs;
    private boolean vG;

    public NB(Context context, boolean z, int i) {
        this.pvs = context;
        this.vG = z;
        this.NB = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd A[Catch: all -> 0x0133, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0133, blocks: (B:7:0x0016, B:10:0x0021, B:14:0x003b, B:15:0x0041, B:17:0x0047, B:19:0x0063, B:21:0x006c, B:24:0x006f, B:26:0x0075, B:27:0x007e, B:29:0x0084, B:30:0x008e, B:32:0x0094, B:35:0x00a3, B:38:0x00c1, B:51:0x00fd, B:62:0x00c8, B:64:0x00af, B:66:0x00bc), top: B:6:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c8 A[Catch: all -> 0x0133, TRY_LEAVE, TryCatch #1 {all -> 0x0133, blocks: (B:7:0x0016, B:10:0x0021, B:14:0x003b, B:15:0x0041, B:17:0x0047, B:19:0x0063, B:21:0x006c, B:24:0x006f, B:26:0x0075, B:27:0x007e, B:29:0x0084, B:30:0x008e, B:32:0x0094, B:35:0x00a3, B:38:0x00c1, B:51:0x00fd, B:62:0x00c8, B:64:0x00af, B:66:0x00bc), top: B:6:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00af A[Catch: all -> 0x0133, TryCatch #1 {all -> 0x0133, blocks: (B:7:0x0016, B:10:0x0021, B:14:0x003b, B:15:0x0041, B:17:0x0047, B:19:0x0063, B:21:0x006c, B:24:0x006f, B:26:0x0075, B:27:0x007e, B:29:0x0084, B:30:0x008e, B:32:0x0094, B:35:0x00a3, B:38:0x00c1, B:51:0x00fd, B:62:0x00c8, B:64:0x00af, B:66:0x00bc), top: B:6:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pvs(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject optJSONObject;
        Jd icD;
        if (!this.vG) {
            return;
        }
        so.pvs().pvs(this.NB).NB();
        try {
            try {
                boolean z = jSONObject.optInt("ttnet_url_dispatcher_enabled", 0) > 0;
                JSONArray optJSONArray = jSONObject.optJSONArray("ttnet_dispatch_actions");
                if (so.pvs().pvs(this.NB).vG() && z && optJSONArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject3 = ((JSONObject) optJSONArray.get(i)).getJSONObject("param");
                        if (jSONObject3.optString("service_name", "").equals("idc_selection")) {
                            arrayList.add(jSONObject3.getJSONObject("strategy_info"));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        jSONObject2 = new JSONObject();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            JSONObject jSONObject4 = (JSONObject) it.next();
                            Iterator<String> keys = jSONObject4.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                jSONObject2.put(next, jSONObject4.getString(next));
                            }
                        }
                        optJSONObject = jSONObject.optJSONObject("tnc_config");
                        if (optJSONObject == null || jSONObject2 != null) {
                            if (optJSONObject != null) {
                                optJSONObject = new JSONObject();
                                optJSONObject.put("host_replace_map", jSONObject2);
                            } else if (jSONObject2 != null) {
                                optJSONObject.put("host_replace_map", jSONObject2);
                            }
                        }
                        icD = icD(optJSONObject);
                        if (icD == null) {
                            icD.toString();
                        }
                        if (icD != null) {
                            synchronized (Jd) {
                                this.pvs.getSharedPreferences(so.pvs().pvs(this.NB).pvs(), 0).edit().putString("tnc_config_str", "").apply();
                                com.bytedance.sdk.component.yiw.Jd.Jd.pvs(this.pvs, 1, "", this.NB);
                            }
                            return;
                        } else {
                            this.icD = icD;
                            String jSONObject5 = optJSONObject.toString();
                            synchronized (Jd) {
                                this.pvs.getSharedPreferences(so.pvs().pvs(this.NB).pvs(), 0).edit().putString("tnc_config_str", jSONObject5).apply();
                                com.bytedance.sdk.component.yiw.Jd.Jd.pvs(this.pvs, 1, jSONObject5, this.NB);
                            }
                            return;
                        }
                    }
                }
                jSONObject2 = null;
                optJSONObject = jSONObject.optJSONObject("tnc_config");
                if (optJSONObject == null) {
                }
                if (optJSONObject != null) {
                }
                icD = icD(optJSONObject);
                if (icD == null) {
                }
                if (icD != null) {
                }
            } catch (Throwable unused) {
                this.icD = new Jd();
                synchronized (Jd) {
                    this.pvs.getSharedPreferences(so.pvs().pvs(this.NB).pvs(), 0).edit().putString("tnc_config_str", "").apply();
                    com.bytedance.sdk.component.yiw.Jd.Jd.pvs(this.pvs, 1, "", this.NB);
                }
            }
        } catch (Throwable th) {
            synchronized (Jd) {
                this.pvs.getSharedPreferences(so.pvs().pvs(this.NB).pvs(), 0).edit().putString("tnc_config_str", "").apply();
                com.bytedance.sdk.component.yiw.Jd.Jd.pvs(this.pvs, 1, "", this.NB);
                throw th;
            }
        }
    }

    public void pvs() {
        if (this.vG) {
            String string = this.pvs.getSharedPreferences(so.pvs().pvs(this.NB).pvs(), 0).getString("tnc_config_str", null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            try {
                Jd icD = icD(new JSONObject(string));
                if (icD != null) {
                    this.icD = icD;
                }
                if (icD == null) {
                    return;
                }
                icD.toString();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public void icD() {
        try {
            String pvs = com.bytedance.sdk.component.yiw.Jd.Jd.pvs(this.pvs, 1, this.NB);
            if (TextUtils.isEmpty(pvs)) {
                return;
            }
            Jd icD = icD(new JSONObject(pvs));
            if (icD != null) {
                icD.toString();
            }
            if (icD != null) {
                this.icD = icD;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public Jd vG() {
        return this.icD;
    }

    private Jd icD(JSONObject jSONObject) {
        try {
            Jd jd = new Jd();
            if (jSONObject.has("local_enable")) {
                jd.pvs = jSONObject.getInt("local_enable") != 0;
            }
            if (jSONObject.has("probe_enable")) {
                jd.icD = jSONObject.getInt("probe_enable") != 0;
            }
            if (jSONObject.has("local_host_filter")) {
                JSONArray jSONArray = jSONObject.getJSONArray("local_host_filter");
                HashMap hashMap = new HashMap();
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String string = jSONArray.getString(i);
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(string, 0);
                        }
                    }
                }
                jd.vG = hashMap;
            } else {
                jd.vG = null;
            }
            if (jSONObject.has("host_replace_map")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("host_replace_map");
                HashMap hashMap2 = new HashMap();
                if (jSONObject2.length() > 0) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String string2 = jSONObject2.getString(next);
                        if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string2)) {
                            hashMap2.put(next, string2);
                        }
                    }
                }
                jd.Jd = hashMap2;
            } else {
                jd.Jd = null;
            }
            jd.NB = jSONObject.optInt("req_to_cnt", jd.NB);
            jd.sUS = jSONObject.optInt("req_to_api_cnt", jd.sUS);
            jd.yiw = jSONObject.optInt("req_to_ip_cnt", jd.yiw);
            jd.so = jSONObject.optInt("req_err_cnt", jd.so);
            jd.Mxy = jSONObject.optInt("req_err_api_cnt", jd.Mxy);
            jd.Wyp = jSONObject.optInt("req_err_ip_cnt", jd.Wyp);
            jd.qh = jSONObject.optInt("update_interval", jd.qh);
            jd.kj = jSONObject.optInt("update_random_range", jd.kj);
            jd.Ju = jSONObject.optString("http_code_black", jd.Ju);
            return jd;
        } catch (Throwable unused) {
            return null;
        }
    }
}
