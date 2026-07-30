package com.facebook.appevents.integrity;

import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.ah0;
import defpackage.fh0;
import defpackage.oi;
import defpackage.zv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class VVPManager {
    private static final String CONTENTS_KEY = "fb_content";
    private static final String ENABLED_KEY = "enabled";
    private static final String EVENT_NAME_SENTINEL = "1";
    private static final String IN_SCOPE_EVENT_NAMES_KEY = "inScopeEventNames";
    private static final String IS_SHADOW_ENABLED_KEY = "isShadowEnabled";
    private static final String KEY_NEGATIVE_REGEX_KEY = "keyNegativeRegex";
    private static final String KEY_REGEX_KEY = "keyRegex";
    public static final int PLACE_CUSTOM_DATA = 1;
    public static final int PLACE_EVENT_NAME = 3;
    private static final String PLACE_KEY = "place";
    private static final String RULES_KEY = "rules";
    private static final String SANITIZED_VALUE = "_removed_";
    private static final String STANDARD_PARAMS_KEY = "standardParams";
    private static final String VALUE_REGEX_KEY = "valueRegex";
    private static final String VP_RP = "vp_rp";
    private static final String VP_RP_EV = "vp_rp_ev";
    private static final String VVP_IS_APPLIED_KEY = "vvp";
    private static final String VVP_IS_APPLIED_VALUE = "1";
    private static final String VVP_METADATA_KEY = "vvp_md";
    private static volatile VVPConfig config;
    private static boolean enabled;
    public static final VVPManager INSTANCE = new VVPManager();
    private static final Set<String> CONTENT_ID_SANITIZE_KEYS = oi.z(new String[]{"fb_content_ids", AppEventsConstants.EVENT_PARAM_CONTENT_ID});

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class CompiledRule {
        private final Pattern keyNegativeRegex;
        private final Pattern keyRegex;
        private final int place;
        private final Pattern valueRegex;

        public CompiledRule(int i, Pattern pattern, Pattern pattern2, Pattern pattern3) {
            this.place = i;
            this.keyRegex = pattern;
            this.keyNegativeRegex = pattern2;
            this.valueRegex = pattern3;
        }

        public static /* synthetic */ CompiledRule copy$default(CompiledRule compiledRule, int i, Pattern pattern, Pattern pattern2, Pattern pattern3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = compiledRule.place;
            }
            if ((i2 & 2) != 0) {
                pattern = compiledRule.keyRegex;
            }
            if ((i2 & 4) != 0) {
                pattern2 = compiledRule.keyNegativeRegex;
            }
            if ((i2 & 8) != 0) {
                pattern3 = compiledRule.valueRegex;
            }
            return compiledRule.copy(i, pattern, pattern2, pattern3);
        }

        public final int component1() {
            return this.place;
        }

        public final Pattern component2() {
            return this.keyRegex;
        }

        public final Pattern component3() {
            return this.keyNegativeRegex;
        }

        public final Pattern component4() {
            return this.valueRegex;
        }

        public final CompiledRule copy(int i, Pattern pattern, Pattern pattern2, Pattern pattern3) {
            return new CompiledRule(i, pattern, pattern2, pattern3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CompiledRule)) {
                return false;
            }
            CompiledRule compiledRule = (CompiledRule) obj;
            return this.place == compiledRule.place && Intrinsics.b(this.keyRegex, compiledRule.keyRegex) && Intrinsics.b(this.keyNegativeRegex, compiledRule.keyNegativeRegex) && Intrinsics.b(this.valueRegex, compiledRule.valueRegex);
        }

        public final Pattern getKeyNegativeRegex() {
            return this.keyNegativeRegex;
        }

        public final Pattern getKeyRegex() {
            return this.keyRegex;
        }

        public final int getPlace() {
            return this.place;
        }

        public final Pattern getValueRegex() {
            return this.valueRegex;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.place) * 31;
            Pattern pattern = this.keyRegex;
            int hashCode2 = (hashCode + (pattern == null ? 0 : pattern.hashCode())) * 31;
            Pattern pattern2 = this.keyNegativeRegex;
            int hashCode3 = (hashCode2 + (pattern2 == null ? 0 : pattern2.hashCode())) * 31;
            Pattern pattern3 = this.valueRegex;
            return hashCode3 + (pattern3 != null ? pattern3.hashCode() : 0);
        }

        public String toString() {
            return "CompiledRule(place=" + this.place + ", keyRegex=" + this.keyRegex + ", keyNegativeRegex=" + this.keyNegativeRegex + ", valueRegex=" + this.valueRegex + ')';
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class VVPConfig {
        private final Set<String> inScopeEventNames;
        private final boolean isShadowEnabled;
        private final List<CompiledRule> rules;
        private final Set<String> standardParams;

        public VVPConfig(List<CompiledRule> list, Set<String> set, Set<String> set2, boolean z) {
            list.getClass();
            set.getClass();
            this.rules = list;
            this.standardParams = set;
            this.inScopeEventNames = set2;
            this.isShadowEnabled = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VVPConfig copy$default(VVPConfig vVPConfig, List list, Set set, Set set2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = vVPConfig.rules;
            }
            if ((i & 2) != 0) {
                set = vVPConfig.standardParams;
            }
            if ((i & 4) != 0) {
                set2 = vVPConfig.inScopeEventNames;
            }
            if ((i & 8) != 0) {
                z = vVPConfig.isShadowEnabled;
            }
            return vVPConfig.copy(list, set, set2, z);
        }

        public final List<CompiledRule> component1() {
            return this.rules;
        }

        public final Set<String> component2() {
            return this.standardParams;
        }

        public final Set<String> component3() {
            return this.inScopeEventNames;
        }

        public final boolean component4() {
            return this.isShadowEnabled;
        }

        public final VVPConfig copy(List<CompiledRule> list, Set<String> set, Set<String> set2, boolean z) {
            list.getClass();
            set.getClass();
            return new VVPConfig(list, set, set2, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VVPConfig)) {
                return false;
            }
            VVPConfig vVPConfig = (VVPConfig) obj;
            return Intrinsics.b(this.rules, vVPConfig.rules) && Intrinsics.b(this.standardParams, vVPConfig.standardParams) && Intrinsics.b(this.inScopeEventNames, vVPConfig.inScopeEventNames) && this.isShadowEnabled == vVPConfig.isShadowEnabled;
        }

        public final Set<String> getInScopeEventNames() {
            return this.inScopeEventNames;
        }

        public final List<CompiledRule> getRules() {
            return this.rules;
        }

        public final Set<String> getStandardParams() {
            return this.standardParams;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = (this.standardParams.hashCode() + (this.rules.hashCode() * 31)) * 31;
            Set<String> set = this.inScopeEventNames;
            int hashCode2 = (hashCode + (set == null ? 0 : set.hashCode())) * 31;
            boolean z = this.isShadowEnabled;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode2 + i;
        }

        public final boolean isShadowEnabled() {
            return this.isShadowEnabled;
        }

        public String toString() {
            return "VVPConfig(rules=" + this.rules + ", standardParams=" + this.standardParams + ", inScopeEventNames=" + this.inScopeEventNames + ", isShadowEnabled=" + this.isShadowEnabled + ')';
        }
    }

    private VVPManager() {
    }

    public static final void disable() {
        if (CrashShieldHandler.isObjectCrashing(VVPManager.class)) {
            return;
        }
        try {
            enabled = false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, VVPManager.class);
        }
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(VVPManager.class)) {
            return;
        }
        try {
            enabled = true;
            INSTANCE.loadConfig$facebook_core_release();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, VVPManager.class);
        }
    }

    public static final boolean isEnabled() {
        if (CrashShieldHandler.isObjectCrashing(VVPManager.class)) {
            return false;
        }
        try {
            return enabled;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, VVPManager.class);
            return false;
        }
    }

    private final Pattern optRegex(JSONObject jSONObject, String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            if (jSONObject.has(str) && !jSONObject.isNull(str)) {
                String optString = jSONObject.optString(str, BuildConfig.FLAVOR);
                optString.getClass();
                if (optString.length() == 0) {
                    return null;
                }
                try {
                    return Pattern.compile(optString, 2);
                } catch (Exception unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final Set<String> parseInScopeEventNames(JSONObject jSONObject) {
        JSONArray optJSONArray;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            if (!jSONObject.has(IN_SCOPE_EVENT_NAMES_KEY) || jSONObject.isNull(IN_SCOPE_EVENT_NAMES_KEY) || (optJSONArray = jSONObject.optJSONArray(IN_SCOPE_EVENT_NAMES_KEY)) == null) {
                return null;
            }
            HashSet hashSet = new HashSet();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                String optString = optJSONArray.optString(i, BuildConfig.FLAVOR);
                optString.getClass();
                if (optString.length() > 0) {
                    hashSet.add(optString);
                }
            }
            return hashSet;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final List<CompiledRule> parseRules(JSONObject jSONObject) {
        CompiledRule compileRule$facebook_core_release;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(RULES_KEY);
            if (optJSONArray == null) {
                return ah0.m;
            }
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null && (compileRule$facebook_core_release = compileRule$facebook_core_release(optJSONObject)) != null) {
                    arrayList.add(compileRule$facebook_core_release);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final Set<String> parseStandardParams(JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(STANDARD_PARAMS_KEY);
            if (optJSONObject == null) {
                return fh0.m;
            }
            HashSet hashSet = new HashSet();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (optJSONObject.optBoolean(next, false)) {
                    hashSet.add(next);
                }
            }
            return hashSet;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static final void processParametersForVVP(String str, Bundle bundle) {
        VVPConfig vVPConfig;
        Matcher matcher;
        String obj;
        Matcher matcher2;
        Matcher matcher3;
        Matcher matcher4;
        if (CrashShieldHandler.isObjectCrashing(VVPManager.class)) {
            return;
        }
        try {
            str.getClass();
            if (enabled && bundle != null && !bundle.isEmpty() && (vVPConfig = config) != null) {
                Set<String> inScopeEventNames = vVPConfig.getInScopeEventNames();
                if (inScopeEventNames == null || inScopeEventNames.isEmpty() || inScopeEventNames.contains(str)) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    boolean z = false;
                    for (CompiledRule compiledRule : vVPConfig.getRules()) {
                        int place = compiledRule.getPlace();
                        if (place == 1) {
                            Set<String> keySet = bundle.keySet();
                            keySet.getClass();
                            for (String str2 : zv.M(keySet)) {
                                Object obj2 = bundle.get(str2);
                                if (obj2 != null && (obj = obj2.toString()) != null) {
                                    Pattern keyRegex = compiledRule.getKeyRegex();
                                    boolean find = (keyRegex == null || (matcher4 = keyRegex.matcher(str2)) == null) ? true : matcher4.find();
                                    Pattern keyNegativeRegex = compiledRule.getKeyNegativeRegex();
                                    boolean z2 = find && !((keyNegativeRegex == null || (matcher3 = keyNegativeRegex.matcher(str2)) == null) ? false : matcher3.find());
                                    Pattern valueRegex = compiledRule.getValueRegex();
                                    boolean find2 = (valueRegex == null || (matcher2 = valueRegex.matcher(obj)) == null) ? true : matcher2.find();
                                    if (z2 && find2) {
                                        linkedHashSet.add(str2);
                                        z = true;
                                    }
                                }
                            }
                        } else if (place == 3 && compiledRule.getKeyRegex() != null && compiledRule.getKeyRegex().matcher(str).find()) {
                            Pattern keyNegativeRegex2 = compiledRule.getKeyNegativeRegex();
                            if (!((keyNegativeRegex2 == null || (matcher = keyNegativeRegex2.matcher(str)) == null) ? false : matcher.find())) {
                                linkedHashSet2.add(AppEventsConstants.EVENT_PARAM_VALUE_YES);
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        if (!vVPConfig.isShadowEnabled() && !vVPConfig.getStandardParams().isEmpty()) {
                            Set<String> keySet2 = bundle.keySet();
                            keySet2.getClass();
                            for (String str3 : zv.M(keySet2)) {
                                if (!vVPConfig.getStandardParams().contains(str3)) {
                                    if (CONTENT_ID_SANITIZE_KEYS.contains(str3)) {
                                        bundle.putString(str3, SANITIZED_VALUE);
                                    } else {
                                        bundle.remove(str3);
                                    }
                                }
                            }
                            INSTANCE.scrubIdInContentsArray$facebook_core_release(bundle);
                        }
                        bundle.putString(VVP_IS_APPLIED_KEY, AppEventsConstants.EVENT_PARAM_VALUE_YES);
                        if (linkedHashSet.isEmpty() && linkedHashSet2.isEmpty()) {
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        if (!linkedHashSet.isEmpty()) {
                            jSONObject.put(VP_RP, new JSONArray((Collection) zv.M(linkedHashSet)));
                        }
                        if (!linkedHashSet2.isEmpty()) {
                            jSONObject.put(VP_RP_EV, new JSONArray((Collection) zv.M(linkedHashSet2)));
                        }
                        bundle.putString(VVP_METADATA_KEY, jSONObject.toString());
                    }
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, VVPManager.class);
        }
    }

    public final void clearForTests$facebook_core_release() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            enabled = false;
            config = null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final CompiledRule compileRule$facebook_core_release(JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            jSONObject.getClass();
            int optInt = jSONObject.optInt(PLACE_KEY, -1);
            if (optInt != 1 && optInt != 3) {
                return null;
            }
            Pattern optRegex = optRegex(jSONObject, KEY_REGEX_KEY);
            Pattern optRegex2 = optRegex(jSONObject, KEY_NEGATIVE_REGEX_KEY);
            Pattern optRegex3 = optRegex(jSONObject, VALUE_REGEX_KEY);
            if (optRegex == null && optRegex3 == null) {
                return null;
            }
            return new CompiledRule(optInt, optRegex, optRegex2, optRegex3);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final VVPConfig getConfig$facebook_core_release() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return config;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final void loadConfig$facebook_core_release() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
            VVPConfig vVPConfig = null;
            String vvpConfig = queryAppSettings != null ? queryAppSettings.getVvpConfig() : null;
            if (vvpConfig != null && vvpConfig.length() != 0) {
                vVPConfig = parseConfig$facebook_core_release(vvpConfig);
            }
            config = vVPConfig;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final VVPConfig parseConfig$facebook_core_release(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            str.getClass();
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.optBoolean(ENABLED_KEY, false)) {
                    return null;
                }
                List<CompiledRule> parseRules = parseRules(jSONObject);
                if (parseRules.isEmpty()) {
                    return null;
                }
                return new VVPConfig(parseRules, parseStandardParams(jSONObject), parseInScopeEventNames(jSONObject), jSONObject.optBoolean(IS_SHADOW_ENABLED_KEY, true));
            } catch (JSONException unused) {
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final void scrubIdInContentsArray$facebook_core_release(Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            bundle.getClass();
            String string = bundle.getString("fb_content");
            if (string == null) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                boolean z = false;
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null && optJSONObject.has("id")) {
                        optJSONObject.put("id", SANITIZED_VALUE);
                        z = true;
                    }
                }
                if (z) {
                    bundle.putString("fb_content", jSONArray.toString());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
