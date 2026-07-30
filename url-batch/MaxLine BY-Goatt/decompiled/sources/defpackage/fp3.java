package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fp3 {
    public final HashMap a;

    public fp3(Map map) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap.putAll(map);
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        i82 i82Var = hp3.a;
        int i = i82Var.p;
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) i82Var.get(i2);
            HashMap hashMap = this.a;
            if (hashMap.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append((String) hashMap.get(str));
            }
        }
        return sb.toString();
    }

    public final Bundle b() {
        tg3 tg3Var = ug3.Z0;
        boolean booleanValue = ((Boolean) tg3Var.a(null)).booleanValue();
        HashMap hashMap = this.a;
        if (!booleanValue ? !(!AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(hashMap.get("GoogleConsent")) || !AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(hashMap.get("gdprApplies")) || !AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(hashMap.get("EnableAdvertiserConsentMode"))) : !(!AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(hashMap.get("gdprApplies")) || !AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(hashMap.get("EnableAdvertiserConsentMode")))) {
            if (!((Boolean) tg3Var.a(null)).booleanValue()) {
                return d();
            }
            if (hashMap.get("Version") == null) {
                return d();
            }
            if (e() >= 0) {
                Bundle bundle = new Bundle();
                bundle.putString("ad_storage", true != Objects.equals(hashMap.get("AuthorizePurpose1"), AppEventsConstants.EVENT_PARAM_VALUE_YES) ? "denied" : "granted");
                bundle.putString("ad_personalization", (Objects.equals(hashMap.get("AuthorizePurpose3"), AppEventsConstants.EVENT_PARAM_VALUE_YES) && Objects.equals(hashMap.get("AuthorizePurpose4"), AppEventsConstants.EVENT_PARAM_VALUE_YES)) ? "granted" : "denied");
                if (e() >= 4) {
                    bundle.putString("ad_user_data", (Objects.equals(hashMap.get("AuthorizePurpose1"), AppEventsConstants.EVENT_PARAM_VALUE_YES) && Objects.equals(hashMap.get("AuthorizePurpose7"), AppEventsConstants.EVENT_PARAM_VALUE_YES)) ? "granted" : "denied");
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    public final String c() {
        HashMap hashMap = this.a;
        StringBuilder sb = new StringBuilder(AppEventsConstants.EVENT_PARAM_VALUE_YES);
        int i = -1;
        try {
            String str = (String) hashMap.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                i = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        if (i < 0 || i > 4095) {
            sb.append("00");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i >> 6));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i & 63));
        }
        int e = e();
        if (e < 0 || e > 63) {
            sb.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(e));
        }
        int i2 = true != AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(hashMap.get("gdprApplies")) ? 0 : 2;
        int i3 = i2 | 4;
        if (AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(hashMap.get("EnableAdvertiserConsentMode"))) {
            i3 = i2 | 12;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i3));
        return sb.toString();
    }

    public final Bundle d() {
        int e;
        HashMap hashMap = this.a;
        if (AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(hashMap.get("GoogleConsent")) && (e = e()) >= 0) {
            String str = (String) hashMap.get("PurposeConsents");
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                String str2 = "denied";
                if (str.length() > 0) {
                    bundle.putString("ad_storage", str.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str.length() > 3) {
                    bundle.putString("ad_personalization", (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str.length() > 6 && e >= 4) {
                    if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                        str2 = "granted";
                    }
                    bundle.putString("ad_user_data", str2);
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    public final int e() {
        try {
            String str = (String) this.a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fp3) {
            return a().equalsIgnoreCase(((fp3) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
