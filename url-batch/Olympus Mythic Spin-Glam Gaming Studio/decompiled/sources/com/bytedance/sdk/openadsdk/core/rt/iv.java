package com.bytedance.sdk.openadsdk.core.rt;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class iv {
    private final String fb;
    private final URL fs;
    private final String zmn;
    private final String zn;

    private iv(String str, String str2, String str3, String str4) throws MalformedURLException {
        this.zmn = str2;
        this.fs = new URL(str);
        this.zn = str3;
        this.fb = str4;
    }

    public String zmn() {
        return this.zmn;
    }

    public String fs() {
        return this.zn;
    }

    public URL zn() {
        return this.fs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv)) {
            return false;
        }
        iv ivVar = (iv) obj;
        if (zmn(this.zmn, ivVar.zmn) && zmn(this.fs, ivVar.fs) && zmn(this.zn, ivVar.zn)) {
            return zmn(this.fb, ivVar.fb);
        }
        return false;
    }

    public int hashCode() {
        String str = this.zmn;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.fs.hashCode()) * 31;
        String str2 = this.zn;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.fb;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    private boolean zmn(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static iv zmn(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new iv(str, str2, str3, str4);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static iv zmn(JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString(VastAttributes.API_FRAMEWORK);
            String optString2 = jSONObject.optString("javascriptResourceUrl");
            if (CampaignEx.KEY_OMID.equalsIgnoreCase(optString) && !TextUtils.isEmpty(optString2)) {
                return new iv(optString2, jSONObject.optString("vendorKey"), jSONObject.optString("verificationParameters"), jSONObject.optString("verificationNotExecuted"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static HashSet<iv> zmn(JSONArray jSONArray) {
        HashSet<iv> hashSet = new HashSet<>();
        if (jSONArray == null) {
            return hashSet;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                hashSet.add(zmn(jSONArray.getJSONObject(i)));
            } catch (Throwable unused) {
            }
        }
        return hashSet;
    }
}
