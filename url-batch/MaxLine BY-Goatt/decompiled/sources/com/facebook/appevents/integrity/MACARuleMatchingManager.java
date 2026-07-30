package com.facebook.appevents.integrity;

import android.os.Build;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.UserDataStore;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.tp2;
import defpackage.up2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class MACARuleMatchingManager {
    private static JSONArray MACARules;
    private static boolean enabled;
    public static final MACARuleMatchingManager INSTANCE = new MACARuleMatchingManager();
    private static String[] keys = {"event", "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};

    private MACARuleMatchingManager() {
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return;
        }
        try {
            INSTANCE.loadMACARules();
            if (MACARules != null) {
                enabled = true;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
        }
    }

    public static final void generateInfo(Bundle bundle, String str) {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return;
        }
        try {
            bundle.getClass();
            str.getClass();
            bundle.putString("event", str);
            StringBuilder sb = new StringBuilder();
            Utility utility = Utility.INSTANCE;
            Locale locale = utility.getLocale();
            String language = locale != null ? locale.getLanguage() : null;
            String str2 = BuildConfig.FLAVOR;
            if (language == null) {
                language = BuildConfig.FLAVOR;
            }
            sb.append(language);
            sb.append('_');
            Locale locale2 = utility.getLocale();
            String country = locale2 != null ? locale2.getCountry() : null;
            if (country == null) {
                country = BuildConfig.FLAVOR;
            }
            sb.append(country);
            bundle.putString("_locale", sb.toString());
            String versionName = utility.getVersionName();
            if (versionName == null) {
                versionName = BuildConfig.FLAVOR;
            }
            bundle.putString("_appVersion", versionName);
            bundle.putString("_deviceOS", "ANDROID");
            bundle.putString("_platform", "mobile");
            String str3 = Build.MODEL;
            if (str3 == null) {
                str3 = BuildConfig.FLAVOR;
            }
            bundle.putString("_deviceModel", str3);
            bundle.putString("_nativeAppID", FacebookSdk.getApplicationId());
            String versionName2 = utility.getVersionName();
            if (versionName2 != null) {
                str2 = versionName2;
            }
            bundle.putString("_nativeAppShortVersion", str2);
            bundle.putString("_timezone", utility.getDeviceTimeZoneName());
            bundle.putString("_carrier", utility.getCarrierName());
            bundle.putString("_deviceOSTypeName", "ANDROID");
            bundle.putString("_deviceOSVersion", Build.VERSION.RELEASE);
            bundle.putLong("_remainingDiskGB", utility.getAvailableExternalStorageGB());
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
        }
    }

    public static final String getKey(JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return null;
        }
        try {
            jSONObject.getClass();
            Iterator<String> keys2 = jSONObject.keys();
            if (keys2.hasNext()) {
                return keys2.next();
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            return null;
        }
    }

    public static final String getMatchPropertyIDs(Bundle bundle) {
        String optString;
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = MACARules;
            if (jSONArray == null) {
                return "[]";
            }
            if (jSONArray != null && jSONArray.length() == 0) {
                return "[]";
            }
            JSONArray jSONArray2 = MACARules;
            jSONArray2.getClass();
            ArrayList arrayList = new ArrayList();
            int length = jSONArray2.length();
            for (int i = 0; i < length; i++) {
                String optString2 = jSONArray2.optString(i);
                if (optString2 != null) {
                    JSONObject jSONObject = new JSONObject(optString2);
                    long optLong = jSONObject.optLong("id");
                    if (optLong != 0 && (optString = jSONObject.optString("rule")) != null && isMatchCCRule(optString, bundle)) {
                        arrayList.add(Long.valueOf(optLong));
                    }
                }
            }
            String jSONArray3 = new JSONArray((Collection) arrayList).toString();
            jSONArray3.getClass();
            return jSONArray3;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            return null;
        }
    }

    public static final ArrayList<String> getStringArrayList(JSONArray jSONArray) {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class) || jSONArray == null) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArray.get(i).toString());
            }
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            return null;
        }
    }

    public static final boolean isMatchCCRule(String str, Bundle bundle) {
        if (!CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class) && str != null && bundle != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String key = getKey(jSONObject);
                if (key == null) {
                    return false;
                }
                Object obj = jSONObject.get(key);
                int hashCode = key.hashCode();
                if (hashCode != 3555) {
                    if (hashCode != 96727) {
                        if (hashCode == 109267 && key.equals("not")) {
                            return !isMatchCCRule(obj.toString(), bundle);
                        }
                    } else if (key.equals("and")) {
                        JSONArray jSONArray = (JSONArray) obj;
                        if (jSONArray == null) {
                            return false;
                        }
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            if (!isMatchCCRule(jSONArray.get(i).toString(), bundle)) {
                                return false;
                            }
                        }
                        return true;
                    }
                } else if (key.equals("or")) {
                    JSONArray jSONArray2 = (JSONArray) obj;
                    if (jSONArray2 == null) {
                        return false;
                    }
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        if (isMatchCCRule(jSONArray2.get(i2).toString(), bundle)) {
                            return true;
                        }
                    }
                    return false;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 == null) {
                    return false;
                }
                return stringComparison(key, jSONObject2, bundle);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            }
        }
        return false;
    }

    private final void loadMACARules() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
            if (queryAppSettings == null) {
                return;
            }
            MACARules = queryAppSettings.getMACARuleMatchingSetting();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final void processParameters(Bundle bundle, String str) {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return;
        }
        try {
            str.getClass();
            if (!enabled || bundle == null) {
                return;
            }
            try {
                generateInfo(bundle, str);
                bundle.putString("_audiencePropertyIds", getMatchPropertyIDs(bundle));
                bundle.putString("cs_maca", AppEventsConstants.EVENT_PARAM_VALUE_YES);
                removeGeneratedInfo(bundle);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
        }
    }

    public static final void removeGeneratedInfo(Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return;
        }
        try {
            bundle.getClass();
            for (String str : keys) {
                bundle.remove(str);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r4 == null) goto L19;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0314 A[Catch: all -> 0x003f, TryCatch #0 {all -> 0x003f, blocks: (B:6:0x000b, B:9:0x0019, B:12:0x0033, B:17:0x0044, B:19:0x0061, B:20:0x0065, B:22:0x006a, B:25:0x0074, B:27:0x008d, B:30:0x0097, B:34:0x00a3, B:39:0x0212, B:43:0x021a, B:45:0x0221, B:52:0x00ad, B:55:0x00b7, B:57:0x00d0, B:62:0x0253, B:65:0x025b, B:67:0x0262, B:74:0x00da, B:77:0x00e4, B:79:0x00fd, B:82:0x01ad, B:86:0x0107, B:89:0x0191, B:93:0x0111, B:96:0x016b, B:100:0x011b, B:103:0x0125, B:106:0x01f2, B:110:0x012f, B:113:0x0139, B:118:0x0314, B:120:0x0143, B:123:0x01c3, B:127:0x014d, B:130:0x0157, B:133:0x01df, B:135:0x0161, B:138:0x017d, B:141:0x0187, B:144:0x01a3, B:147:0x01b9, B:150:0x01d5, B:153:0x01e8, B:156:0x0204, B:159:0x0245, B:162:0x0286, B:165:0x0290, B:169:0x02ac, B:172:0x02b6, B:174:0x02bf, B:179:0x02ff, B:181:0x02c9, B:184:0x02d3, B:186:0x02e1, B:189:0x02ea, B:191:0x02f3, B:194:0x0308, B:197:0x031d, B:200:0x0326, B:204:0x0055), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02ff A[Catch: all -> 0x003f, TryCatch #0 {all -> 0x003f, blocks: (B:6:0x000b, B:9:0x0019, B:12:0x0033, B:17:0x0044, B:19:0x0061, B:20:0x0065, B:22:0x006a, B:25:0x0074, B:27:0x008d, B:30:0x0097, B:34:0x00a3, B:39:0x0212, B:43:0x021a, B:45:0x0221, B:52:0x00ad, B:55:0x00b7, B:57:0x00d0, B:62:0x0253, B:65:0x025b, B:67:0x0262, B:74:0x00da, B:77:0x00e4, B:79:0x00fd, B:82:0x01ad, B:86:0x0107, B:89:0x0191, B:93:0x0111, B:96:0x016b, B:100:0x011b, B:103:0x0125, B:106:0x01f2, B:110:0x012f, B:113:0x0139, B:118:0x0314, B:120:0x0143, B:123:0x01c3, B:127:0x014d, B:130:0x0157, B:133:0x01df, B:135:0x0161, B:138:0x017d, B:141:0x0187, B:144:0x01a3, B:147:0x01b9, B:150:0x01d5, B:153:0x01e8, B:156:0x0204, B:159:0x0245, B:162:0x0286, B:165:0x0290, B:169:0x02ac, B:172:0x02b6, B:174:0x02bf, B:179:0x02ff, B:181:0x02c9, B:184:0x02d3, B:186:0x02e1, B:189:0x02ea, B:191:0x02f3, B:194:0x0308, B:197:0x031d, B:200:0x0326, B:204:0x0055), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0212 A[Catch: all -> 0x003f, TryCatch #0 {all -> 0x003f, blocks: (B:6:0x000b, B:9:0x0019, B:12:0x0033, B:17:0x0044, B:19:0x0061, B:20:0x0065, B:22:0x006a, B:25:0x0074, B:27:0x008d, B:30:0x0097, B:34:0x00a3, B:39:0x0212, B:43:0x021a, B:45:0x0221, B:52:0x00ad, B:55:0x00b7, B:57:0x00d0, B:62:0x0253, B:65:0x025b, B:67:0x0262, B:74:0x00da, B:77:0x00e4, B:79:0x00fd, B:82:0x01ad, B:86:0x0107, B:89:0x0191, B:93:0x0111, B:96:0x016b, B:100:0x011b, B:103:0x0125, B:106:0x01f2, B:110:0x012f, B:113:0x0139, B:118:0x0314, B:120:0x0143, B:123:0x01c3, B:127:0x014d, B:130:0x0157, B:133:0x01df, B:135:0x0161, B:138:0x017d, B:141:0x0187, B:144:0x01a3, B:147:0x01b9, B:150:0x01d5, B:153:0x01e8, B:156:0x0204, B:159:0x0245, B:162:0x0286, B:165:0x0290, B:169:0x02ac, B:172:0x02b6, B:174:0x02bf, B:179:0x02ff, B:181:0x02c9, B:184:0x02d3, B:186:0x02e1, B:189:0x02ea, B:191:0x02f3, B:194:0x0308, B:197:0x031d, B:200:0x0326, B:204:0x0055), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0262 A[Catch: all -> 0x003f, TryCatch #0 {all -> 0x003f, blocks: (B:6:0x000b, B:9:0x0019, B:12:0x0033, B:17:0x0044, B:19:0x0061, B:20:0x0065, B:22:0x006a, B:25:0x0074, B:27:0x008d, B:30:0x0097, B:34:0x00a3, B:39:0x0212, B:43:0x021a, B:45:0x0221, B:52:0x00ad, B:55:0x00b7, B:57:0x00d0, B:62:0x0253, B:65:0x025b, B:67:0x0262, B:74:0x00da, B:77:0x00e4, B:79:0x00fd, B:82:0x01ad, B:86:0x0107, B:89:0x0191, B:93:0x0111, B:96:0x016b, B:100:0x011b, B:103:0x0125, B:106:0x01f2, B:110:0x012f, B:113:0x0139, B:118:0x0314, B:120:0x0143, B:123:0x01c3, B:127:0x014d, B:130:0x0157, B:133:0x01df, B:135:0x0161, B:138:0x017d, B:141:0x0187, B:144:0x01a3, B:147:0x01b9, B:150:0x01d5, B:153:0x01e8, B:156:0x0204, B:159:0x0245, B:162:0x0286, B:165:0x0290, B:169:0x02ac, B:172:0x02b6, B:174:0x02bf, B:179:0x02ff, B:181:0x02c9, B:184:0x02d3, B:186:0x02e1, B:189:0x02ea, B:191:0x02f3, B:194:0x0308, B:197:0x031d, B:200:0x0326, B:204:0x0055), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean stringComparison(String str, JSONObject jSONObject, Bundle bundle) {
        Object obj;
        int size;
        int i;
        if (!CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            try {
                str.getClass();
                jSONObject.getClass();
                String key = getKey(jSONObject);
                if (key != null) {
                    String obj2 = jSONObject.get(key).toString();
                    ArrayList<String> stringArrayList = getStringArrayList(jSONObject.optJSONArray(key));
                    if (!key.equals("exists")) {
                        if (bundle != null) {
                            String lowerCase = str.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            obj = bundle.get(lowerCase);
                        }
                        obj = bundle != null ? bundle.get(str) : null;
                        if (obj == null) {
                        }
                        switch (key.hashCode()) {
                            case -1729128927:
                                if (!key.equals("i_not_contains")) {
                                    break;
                                } else {
                                    String obj3 = obj.toString();
                                    Locale locale = Locale.ROOT;
                                    String lowerCase2 = obj3.toLowerCase(locale);
                                    lowerCase2.getClass();
                                    String lowerCase3 = obj2.toLowerCase(locale);
                                    lowerCase3.getClass();
                                    if (!up2.q(lowerCase2, lowerCase3)) {
                                        return true;
                                    }
                                }
                                break;
                            case -1179774633:
                                if (!key.equals("is_any")) {
                                    break;
                                }
                                if (stringArrayList == null) {
                                    return stringArrayList.contains(obj.toString());
                                }
                                break;
                            case -1039699439:
                                if (!key.equals("not_in")) {
                                    break;
                                }
                                if (stringArrayList == null) {
                                    return stringArrayList.contains(obj.toString());
                                }
                                break;
                            case -969266188:
                                if (!key.equals("starts_with")) {
                                    break;
                                } else {
                                    return tp2.o(obj.toString(), obj2, false);
                                }
                            case -966353971:
                                if (!key.equals("regex_match")) {
                                    break;
                                } else {
                                    return new Regex(obj2).a(obj.toString());
                                }
                            case -665609109:
                                if (!key.equals("is_not_any")) {
                                    break;
                                }
                                if (stringArrayList == null) {
                                }
                                break;
                            case -567445985:
                                if (!key.equals("contains")) {
                                    break;
                                } else {
                                    return up2.q(obj.toString(), obj2);
                                }
                            case -327990090:
                                if (!key.equals("i_str_neq")) {
                                    break;
                                } else {
                                    String obj4 = obj.toString();
                                    Locale locale2 = Locale.ROOT;
                                    String lowerCase4 = obj4.toLowerCase(locale2);
                                    lowerCase4.getClass();
                                    String lowerCase5 = obj2.toLowerCase(locale2);
                                    lowerCase5.getClass();
                                    if (!lowerCase4.equals(lowerCase5)) {
                                        return true;
                                    }
                                }
                                break;
                            case -159812115:
                                if (!key.equals("i_is_any")) {
                                    break;
                                }
                                if (stringArrayList != null && !stringArrayList.isEmpty()) {
                                    size = stringArrayList.size();
                                    i = 0;
                                    while (i < size) {
                                        String str2 = stringArrayList.get(i);
                                        i++;
                                        Locale locale3 = Locale.ROOT;
                                        String lowerCase6 = str2.toLowerCase(locale3);
                                        lowerCase6.getClass();
                                        String lowerCase7 = obj.toString().toLowerCase(locale3);
                                        lowerCase7.getClass();
                                        if (lowerCase6.equals(lowerCase7)) {
                                            return true;
                                        }
                                    }
                                    break;
                                }
                                break;
                            case -92753547:
                                if (!key.equals("i_str_not_in")) {
                                    break;
                                }
                                if (stringArrayList == null) {
                                    break;
                                } else {
                                    if (stringArrayList.isEmpty()) {
                                        return true;
                                    }
                                    int size2 = stringArrayList.size();
                                    int i2 = 0;
                                    while (i2 < size2) {
                                        String str3 = stringArrayList.get(i2);
                                        i2++;
                                        Locale locale4 = Locale.ROOT;
                                        String lowerCase8 = str3.toLowerCase(locale4);
                                        lowerCase8.getClass();
                                        String lowerCase9 = obj.toString().toLowerCase(locale4);
                                        lowerCase9.getClass();
                                        if (lowerCase8.equals(lowerCase9)) {
                                            break;
                                        }
                                    }
                                    return true;
                                }
                            case 60:
                                if (!key.equals("<")) {
                                    break;
                                }
                                if (Double.parseDouble(obj.toString()) < Double.parseDouble(obj2)) {
                                    return true;
                                }
                                break;
                            case 61:
                                if (!key.equals("=")) {
                                    break;
                                }
                                return Intrinsics.b(obj.toString(), obj2);
                            case 62:
                                if (!key.equals(">")) {
                                    break;
                                }
                                if (Double.parseDouble(obj.toString()) > Double.parseDouble(obj2)) {
                                    return true;
                                }
                                break;
                            case 1084:
                                if (!key.equals("!=")) {
                                    break;
                                }
                                if (!Intrinsics.b(obj.toString(), obj2)) {
                                    return true;
                                }
                                break;
                            case 1921:
                                if (!key.equals("<=")) {
                                    break;
                                }
                                if (Double.parseDouble(obj.toString()) <= Double.parseDouble(obj2)) {
                                    return true;
                                }
                                break;
                            case 1952:
                                if (!key.equals("==")) {
                                    break;
                                }
                                return Intrinsics.b(obj.toString(), obj2);
                            case 1983:
                                if (!key.equals(">=")) {
                                    break;
                                }
                                if (Double.parseDouble(obj.toString()) >= Double.parseDouble(obj2)) {
                                    return true;
                                }
                                break;
                            case 3244:
                                if (!key.equals("eq")) {
                                    break;
                                }
                                return Intrinsics.b(obj.toString(), obj2);
                            case 3294:
                                if (!key.equals(UserDataStore.GENDER)) {
                                    break;
                                }
                                if (Double.parseDouble(obj.toString()) >= Double.parseDouble(obj2)) {
                                }
                                break;
                            case 3309:
                                if (!key.equals("gt")) {
                                    break;
                                }
                                if (Double.parseDouble(obj.toString()) > Double.parseDouble(obj2)) {
                                }
                                break;
                            case 3365:
                                if (!key.equals("in")) {
                                    break;
                                }
                                if (stringArrayList == null) {
                                }
                                break;
                            case 3449:
                                if (!key.equals("le")) {
                                    break;
                                }
                                if (Double.parseDouble(obj.toString()) <= Double.parseDouble(obj2)) {
                                }
                                break;
                            case 3464:
                                if (!key.equals("lt")) {
                                    break;
                                }
                                if (Double.parseDouble(obj.toString()) < Double.parseDouble(obj2)) {
                                }
                                break;
                            case 3511:
                                if (!key.equals("ne")) {
                                    break;
                                }
                                if (!Intrinsics.b(obj.toString(), obj2)) {
                                }
                                break;
                            case 102680:
                                if (!key.equals("gte")) {
                                    break;
                                }
                                if (Double.parseDouble(obj.toString()) >= Double.parseDouble(obj2)) {
                                }
                                break;
                            case 107485:
                                if (!key.equals("lte")) {
                                    break;
                                }
                                if (Double.parseDouble(obj.toString()) <= Double.parseDouble(obj2)) {
                                }
                                break;
                            case 108954:
                                if (!key.equals("neq")) {
                                    break;
                                }
                                if (!Intrinsics.b(obj.toString(), obj2)) {
                                }
                                break;
                            case 127966736:
                                if (!key.equals("i_str_eq")) {
                                    break;
                                } else {
                                    String obj5 = obj.toString();
                                    Locale locale5 = Locale.ROOT;
                                    String lowerCase10 = obj5.toLowerCase(locale5);
                                    lowerCase10.getClass();
                                    String lowerCase11 = obj2.toLowerCase(locale5);
                                    lowerCase11.getClass();
                                    return lowerCase10.equals(lowerCase11);
                                }
                            case 127966857:
                                if (!key.equals("i_str_in")) {
                                    break;
                                }
                                if (stringArrayList != null) {
                                    size = stringArrayList.size();
                                    i = 0;
                                    while (i < size) {
                                    }
                                    break;
                                }
                            case 363990325:
                                if (!key.equals("i_contains")) {
                                    break;
                                } else {
                                    String obj6 = obj.toString();
                                    Locale locale6 = Locale.ROOT;
                                    String lowerCase12 = obj6.toLowerCase(locale6);
                                    lowerCase12.getClass();
                                    String lowerCase13 = obj2.toLowerCase(locale6);
                                    lowerCase13.getClass();
                                    return up2.q(lowerCase12, lowerCase13);
                                }
                            case 1091487233:
                                if (!key.equals("i_is_not_any")) {
                                    break;
                                }
                                if (stringArrayList == null) {
                                }
                                break;
                            case 1918401035:
                                if (key.equals("not_contains") && !up2.q(obj.toString(), obj2)) {
                                    return true;
                                }
                                break;
                            case 1961112862:
                                if (!key.equals("i_starts_with")) {
                                    break;
                                } else {
                                    String obj7 = obj.toString();
                                    Locale locale7 = Locale.ROOT;
                                    String lowerCase14 = obj7.toLowerCase(locale7);
                                    lowerCase14.getClass();
                                    String lowerCase15 = obj2.toLowerCase(locale7);
                                    lowerCase15.getClass();
                                    return tp2.o(lowerCase14, lowerCase15, false);
                                }
                        }
                    } else if (bundle != null && bundle.containsKey(str) == Boolean.parseBoolean(obj2)) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
                return false;
            }
        }
        return false;
    }
}
