package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
/* loaded from: classes3.dex */
public final class zzl {
    private final zzam zza;
    private final Context zzb;

    zzl(Application application, zzam zzamVar) {
        this.zza = zzamVar;
        this.zzb = application.getApplicationContext();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0027 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Map map) {
        String str;
        String str2;
        int intValue;
        zzam zzamVar = this.zza;
        if (zzamVar.zzd()) {
            zzamVar.zzb(this.zzb);
            Integer num = (Integer) map.get("IABTCF_gdprApplies");
            HashMap hashMap = new HashMap();
            for (String str3 : map.keySet()) {
                if (!str3.equals("IABTCF_gdprApplies")) {
                    switch (str3.hashCode()) {
                        case -1926457382:
                            if (str3.equals("UMP_CoMoAdPersonalizationPurposeConsentStatus")) {
                                str = "google_analytics_default_allow_ad_personalization_signals";
                                str2 = "AD_PERSONALIZATION";
                                intValue = ((Integer) map.get(str3)).intValue();
                                if (intValue == -1) {
                                    if (intValue != 1) {
                                        if (intValue != 2) {
                                            if (intValue == 4) {
                                                break;
                                            } else if (intValue != 5) {
                                                Log.w("UserMessagingPlatform", "Invalid CoMo consent status: " + intValue);
                                                break;
                                            } else {
                                                Object zza = zzamVar.zza(str);
                                                if (zza == null) {
                                                    Log.w("UserMessagingPlatform", "No default metadata");
                                                    break;
                                                } else if (zza instanceof Boolean) {
                                                    hashMap.put(str2, true != ((Boolean) zza).booleanValue() ? "DENIED" : "GRANTED");
                                                    break;
                                                } else if (!(zza instanceof String) || !zza.equals("eu_consent_policy") || ((!str2.equals("AD_PERSONALIZATION") && !str2.equals("AD_USER_DATA")) || num == null)) {
                                                    Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
                                                    break;
                                                } else {
                                                    hashMap.put(str2, num.intValue() == 1 ? "DENIED" : "GRANTED");
                                                    break;
                                                }
                                            }
                                        } else {
                                            hashMap.put(str2, "DENIED");
                                            break;
                                        }
                                    } else {
                                        hashMap.put(str2, "GRANTED");
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        case -142866440:
                            if (!str3.equals("UMP_CoMoAnalyticsStoragePurposeConsentStatus")) {
                                break;
                            } else {
                                str = "google_analytics_default_allow_analytics_storage";
                                str2 = "ANALYTICS_STORAGE";
                                intValue = ((Integer) map.get(str3)).intValue();
                                if (intValue == -1) {
                                }
                            }
                            break;
                        case 1068702385:
                            if (!str3.equals("UMP_CoMoAdStoragePurposeConsentStatus")) {
                                break;
                            } else {
                                str = "google_analytics_default_allow_ad_storage";
                                str2 = "AD_STORAGE";
                                intValue = ((Integer) map.get(str3)).intValue();
                                if (intValue == -1) {
                                }
                            }
                            break;
                        case 1479307131:
                            if (!str3.equals("UMP_CoMoAdUserDataPurposeConsentStatus")) {
                                break;
                            } else {
                                str = "google_analytics_default_allow_ad_user_data";
                                str2 = "AD_USER_DATA";
                                intValue = ((Integer) map.get(str3)).intValue();
                                if (intValue == -1) {
                                }
                            }
                            break;
                    }
                }
            }
            zzamVar.zzc(hashMap);
        }
    }
}
