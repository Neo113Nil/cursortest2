package com.bytedance.sdk.openadsdk.core.yiw;

import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ViewabilityVendor.java */
/* loaded from: classes2.dex */
public class Wyp {
    private final String Jd;
    private final URL icD;
    private final String pvs;
    private final String vG;

    private Wyp(String str, String str2, String str3, String str4) throws MalformedURLException {
        this.pvs = str2;
        this.icD = new URL(str);
        this.vG = str3;
        this.Jd = str4;
    }

    public String pvs() {
        return this.pvs;
    }

    public String icD() {
        return this.vG;
    }

    public URL vG() {
        return this.icD;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wyp)) {
            return false;
        }
        Wyp wyp = (Wyp) obj;
        if (pvs(this.pvs, wyp.pvs) && pvs(this.icD, wyp.icD) && pvs(this.vG, wyp.vG)) {
            return pvs(this.Jd, wyp.Jd);
        }
        return false;
    }

    public int hashCode() {
        String str = this.pvs;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.icD.hashCode()) * 31;
        String str2 = this.vG;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.Jd;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    private boolean pvs(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public JSONObject Jd() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apiFramework", "omid");
            jSONObject.put("javascriptResourceUrl", this.icD.toString());
            if (!TextUtils.isEmpty(this.pvs)) {
                jSONObject.put("vendorKey", this.pvs);
            }
            if (!TextUtils.isEmpty(this.vG)) {
                jSONObject.put("verificationParameters", this.vG);
            }
            if (!TextUtils.isEmpty(this.Jd)) {
                jSONObject.put("verificationNotExecuted", this.Jd);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Wyp pvs(String str, String str2, String str3, String str4, String str5) {
        if ("omid".equalsIgnoreCase(str) && !TextUtils.isEmpty(str2)) {
            try {
                return new Wyp(str2, str3, str4, str5);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Wyp pvs(JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("apiFramework");
            String optString2 = jSONObject.optString("javascriptResourceUrl");
            if ("omid".equalsIgnoreCase(optString) && !TextUtils.isEmpty(optString2)) {
                return new Wyp(optString2, jSONObject.optString("vendorKey"), jSONObject.optString("verificationParameters"), jSONObject.optString("verificationNotExecuted"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static Set<Wyp> pvs(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        if (jSONArray == null) {
            return hashSet;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                hashSet.add(pvs(jSONArray.getJSONObject(i)));
            } catch (Throwable unused) {
            }
        }
        return hashSet;
    }
}
