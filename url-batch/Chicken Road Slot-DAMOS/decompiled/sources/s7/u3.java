package s7;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u3 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9046a;

    public u3(Map map) {
        HashMap hashMap = new HashMap();
        this.f9046a = hashMap;
        hashMap.putAll(map);
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        b8.s sVar = w3.f9091a;
        int i3 = sVar.f1442r;
        for (int i10 = 0; i10 < i3; i10++) {
            String str = (String) sVar.get(i10);
            HashMap hashMap = this.f9046a;
            if (hashMap.containsKey(str)) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append(str);
                sb2.append("=");
                sb2.append((String) hashMap.get(str));
            }
        }
        return sb2.toString();
    }

    public final Bundle b() {
        HashMap hashMap = this.f9046a;
        if ("1".equals(hashMap.get("gdprApplies")) && "1".equals(hashMap.get("EnableAdvertiserConsentMode"))) {
            String str = "denied";
            if (hashMap.get("Version") == null) {
                if (!"1".equals(hashMap.get("GoogleConsent"))) {
                    return Bundle.EMPTY;
                }
                int c10 = c();
                if (c10 < 0) {
                    return Bundle.EMPTY;
                }
                String str2 = (String) hashMap.get("PurposeConsents");
                if (TextUtils.isEmpty(str2)) {
                    return Bundle.EMPTY;
                }
                Bundle bundle = new Bundle();
                if (str2.length() > 0) {
                    bundle.putString("ad_storage", str2.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str2.length() > 3) {
                    bundle.putString("ad_personalization", (str2.charAt(2) == '1' && str2.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str2.length() > 6 && c10 >= 4) {
                    if (str2.charAt(0) == '1' && str2.charAt(6) == '1') {
                        str = "granted";
                    }
                    bundle.putString("ad_user_data", str);
                }
                return bundle;
            }
            if (c() >= 0) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("ad_storage", true != Objects.equals(hashMap.get("AuthorizePurpose1"), "1") ? "denied" : "granted");
                bundle2.putString("ad_personalization", (Objects.equals(hashMap.get("AuthorizePurpose3"), "1") && Objects.equals(hashMap.get("AuthorizePurpose4"), "1")) ? "granted" : "denied");
                if (c() >= 4) {
                    if (Objects.equals(hashMap.get("AuthorizePurpose1"), "1") && Objects.equals(hashMap.get("AuthorizePurpose7"), "1")) {
                        str = "granted";
                    }
                    bundle2.putString("ad_user_data", str);
                }
                return bundle2;
            }
        }
        return Bundle.EMPTY;
    }

    public final int c() {
        try {
            String str = (String) this.f9046a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u3) {
            return a().equalsIgnoreCase(((u3) obj).a());
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
