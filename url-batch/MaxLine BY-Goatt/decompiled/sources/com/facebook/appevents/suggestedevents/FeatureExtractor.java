package com.facebook.appevents.suggestedevents;

import android.util.Patterns;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.mi1;
import defpackage.up2;
import defpackage.yt;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class FeatureExtractor {
    public static final FeatureExtractor INSTANCE = new FeatureExtractor();
    private static final int NUM_OF_FEATURES = 30;
    private static final String REGEX_ADD_TO_CART_BUTTON_TEXT = "(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart";
    private static final String REGEX_ADD_TO_CART_PAGE_TITLE = "(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy";
    private static final String REGEX_CR_HAS_CONFIRM_PASSWORD_FIELD = "(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)";
    private static final String REGEX_CR_HAS_LOG_IN_KEYWORDS = "(?i)(sign in)|login|signIn";
    private static final String REGEX_CR_HAS_SIGN_ON_KEYWORDS = "(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)";
    private static final String REGEX_CR_PASSWORD_FIELD = "password";
    private static Map<String, String> eventInfo;
    private static boolean initialized;
    private static Map<String, String> languageInfo;
    private static JSONObject rules;
    private static Map<String, String> textTypeInfo;

    private FeatureExtractor() {
    }

    public static final float[] getDenseFeatures(JSONObject jSONObject, String str) {
        String lowerCase;
        JSONObject jSONObject2;
        String optString;
        JSONArray jSONArray;
        FeatureExtractor featureExtractor;
        JSONObject interactedNode;
        if (CrashShieldHandler.isObjectCrashing(FeatureExtractor.class)) {
            return null;
        }
        try {
            jSONObject.getClass();
            str.getClass();
            if (!initialized) {
                return null;
            }
            float[] fArr = new float[NUM_OF_FEATURES];
            for (int i = 0; i < NUM_OF_FEATURES; i++) {
                fArr[i] = 0.0f;
            }
            try {
                lowerCase = str.toLowerCase();
                lowerCase.getClass();
                jSONObject2 = new JSONObject(jSONObject.optJSONObject(ViewHierarchyConstants.VIEW_KEY).toString());
                optString = jSONObject.optString(ViewHierarchyConstants.SCREEN_NAME_KEY);
                jSONArray = new JSONArray();
                featureExtractor = INSTANCE;
                featureExtractor.pruneTree(jSONObject2, jSONArray);
                featureExtractor.sum(fArr, featureExtractor.parseFeatures(jSONObject2));
                interactedNode = featureExtractor.getInteractedNode(jSONObject2);
            } catch (JSONException unused) {
            }
            if (interactedNode == null) {
                return null;
            }
            optString.getClass();
            String jSONObject3 = jSONObject2.toString();
            jSONObject3.getClass();
            featureExtractor.sum(fArr, featureExtractor.nonparseFeatures(interactedNode, jSONArray, optString, jSONObject3, lowerCase));
            return fArr;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FeatureExtractor.class);
            return null;
        }
    }

    private final JSONObject getInteractedNode(JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
        } catch (JSONException unused) {
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
        if (jSONObject.optBoolean(ViewHierarchyConstants.IS_INTERACTED_KEY)) {
            return jSONObject;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(ViewHierarchyConstants.CHILDREN_VIEW_KEY);
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            jSONObject2.getClass();
            JSONObject interactedNode = getInteractedNode(jSONObject2);
            if (interactedNode != null) {
                return interactedNode;
            }
        }
        return null;
    }

    public static final String getTextFeature(String str, String str2, String str3) {
        if (CrashShieldHandler.isObjectCrashing(FeatureExtractor.class)) {
            return null;
        }
        try {
            str.getClass();
            str2.getClass();
            str3.getClass();
            String lowerCase = (str3 + " | " + str2 + ", " + str).toLowerCase();
            lowerCase.getClass();
            return lowerCase;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FeatureExtractor.class);
            return null;
        }
    }

    public static final void initialize(File file) {
        if (CrashShieldHandler.isObjectCrashing(FeatureExtractor.class)) {
            return;
        }
        try {
            try {
                rules = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                rules = new JSONObject(new String(bArr, yt.b));
                languageInfo = mi1.f(new Pair(ViewHierarchyConstants.ENGLISH, AppEventsConstants.EVENT_PARAM_VALUE_YES), new Pair(ViewHierarchyConstants.GERMAN, "2"), new Pair(ViewHierarchyConstants.SPANISH, "3"), new Pair(ViewHierarchyConstants.JAPANESE, "4"));
                eventInfo = mi1.f(new Pair(ViewHierarchyConstants.VIEW_CONTENT, AppEventsConstants.EVENT_PARAM_VALUE_NO), new Pair(ViewHierarchyConstants.SEARCH, AppEventsConstants.EVENT_PARAM_VALUE_YES), new Pair(ViewHierarchyConstants.ADD_TO_CART, "2"), new Pair(ViewHierarchyConstants.ADD_TO_WISHLIST, "3"), new Pair(ViewHierarchyConstants.INITIATE_CHECKOUT, "4"), new Pair(ViewHierarchyConstants.ADD_PAYMENT_INFO, "5"), new Pair(ViewHierarchyConstants.PURCHASE, "6"), new Pair(ViewHierarchyConstants.LEAD, "7"), new Pair(ViewHierarchyConstants.COMPLETE_REGISTRATION, "8"));
                textTypeInfo = mi1.f(new Pair(ViewHierarchyConstants.BUTTON_TEXT, AppEventsConstants.EVENT_PARAM_VALUE_YES), new Pair(ViewHierarchyConstants.PAGE_TITLE, "2"), new Pair(ViewHierarchyConstants.RESOLVED_DOCUMENT_LINK, "3"), new Pair(ViewHierarchyConstants.BUTTON_ID, "4"));
                initialized = true;
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FeatureExtractor.class);
        }
    }

    private final boolean isButton(JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return ((jSONObject.optInt(ViewHierarchyConstants.CLASS_TYPE_BITMASK_KEY) & 1) << 5) > 0;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public static final boolean isInitialized() {
        if (CrashShieldHandler.isObjectCrashing(FeatureExtractor.class)) {
            return false;
        }
        try {
            return initialized;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FeatureExtractor.class);
            return false;
        }
    }

    private final boolean matchIndicators(String[] strArr, String[] strArr2) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                for (String str : strArr) {
                    for (String str2 : strArr2) {
                        if (up2.q(str2, str)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return false;
            }
        }
        return false;
    }

    private final float[] nonparseFeatures(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            float[] fArr = new float[NUM_OF_FEATURES];
            int i = 0;
            while (true) {
                if (i >= NUM_OF_FEATURES) {
                    break;
                }
                fArr[i] = 0.0f;
                i++;
            }
            int length = jSONArray.length();
            fArr[3] = length > 1 ? length - 1.0f : 0.0f;
            try {
                int length2 = jSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    jSONObject2.getClass();
                    if (isButton(jSONObject2)) {
                        fArr[9] = fArr[9] + 1.0f;
                    }
                }
            } catch (JSONException unused) {
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str4 = str + '|' + str3;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            updateHintAndTextRecursively(jSONObject, sb2, sb);
            String sb3 = sb.toString();
            String sb4 = sb2.toString();
            fArr[15] = regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.COMPLETE_REGISTRATION, ViewHierarchyConstants.BUTTON_TEXT, sb4) ? 1.0f : 0.0f;
            fArr[16] = regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.COMPLETE_REGISTRATION, ViewHierarchyConstants.PAGE_TITLE, str4) ? 1.0f : 0.0f;
            fArr[17] = regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.COMPLETE_REGISTRATION, ViewHierarchyConstants.BUTTON_ID, sb3) ? 1.0f : 0.0f;
            fArr[18] = up2.q(str2, REGEX_CR_PASSWORD_FIELD) ? 1.0f : 0.0f;
            fArr[19] = regexMatched(REGEX_CR_HAS_CONFIRM_PASSWORD_FIELD, str2) ? 1.0f : 0.0f;
            fArr[20] = regexMatched(REGEX_CR_HAS_LOG_IN_KEYWORDS, str2) ? 1.0f : 0.0f;
            fArr[21] = regexMatched(REGEX_CR_HAS_SIGN_ON_KEYWORDS, str2) ? 1.0f : 0.0f;
            fArr[22] = regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.PURCHASE, ViewHierarchyConstants.BUTTON_TEXT, sb4) ? 1.0f : 0.0f;
            fArr[24] = regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.PURCHASE, ViewHierarchyConstants.PAGE_TITLE, str4) ? 1.0f : 0.0f;
            fArr[25] = regexMatched(REGEX_ADD_TO_CART_BUTTON_TEXT, sb4) ? 1.0f : 0.0f;
            fArr[27] = regexMatched(REGEX_ADD_TO_CART_PAGE_TITLE, str4) ? 1.0f : 0.0f;
            fArr[28] = regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.LEAD, ViewHierarchyConstants.BUTTON_TEXT, sb4) ? 1.0f : 0.0f;
            fArr[29] = regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.LEAD, ViewHierarchyConstants.PAGE_TITLE, str4) ? 1.0f : 0.0f;
            return fArr;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final float[] parseFeatures(JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            float[] fArr = new float[NUM_OF_FEATURES];
            for (int i = 0; i < NUM_OF_FEATURES; i++) {
                fArr[i] = 0.0f;
            }
            String optString = jSONObject.optString("text");
            optString.getClass();
            String lowerCase = optString.toLowerCase();
            lowerCase.getClass();
            String optString2 = jSONObject.optString(ViewHierarchyConstants.HINT_KEY);
            optString2.getClass();
            String lowerCase2 = optString2.toLowerCase();
            lowerCase2.getClass();
            String optString3 = jSONObject.optString(ViewHierarchyConstants.CLASS_NAME_KEY);
            optString3.getClass();
            String lowerCase3 = optString3.toLowerCase();
            lowerCase3.getClass();
            int optInt = jSONObject.optInt(ViewHierarchyConstants.INPUT_TYPE_KEY, -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (matchIndicators(new String[]{"$", "amount", FirebaseAnalytics.Param.PRICE, "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (matchIndicators(new String[]{REGEX_CR_PASSWORD_FIELD, "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (matchIndicators(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (matchIndicators(new String[]{FirebaseAnalytics.Event.SEARCH}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (optInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (optInt == 2 || optInt == 3) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (up2.q(lowerCase3, "checkbox")) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (matchIndicators(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (up2.q(lowerCase3, "radio") && up2.q(lowerCase3, "button")) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray(ViewHierarchyConstants.CHILDREN_VIEW_KEY);
                int length = optJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                    jSONObject2.getClass();
                    sum(fArr, parseFeatures(jSONObject2));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final boolean pruneTree(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean(ViewHierarchyConstants.IS_INTERACTED_KEY)) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray(ViewHierarchyConstants.CHILDREN_VIEW_KEY);
            int length = optJSONArray.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                if (optJSONArray.getJSONObject(i).optBoolean(ViewHierarchyConstants.IS_INTERACTED_KEY)) {
                    z = true;
                    break;
                }
                i++;
            }
            boolean z2 = z;
            JSONArray jSONArray2 = new JSONArray();
            if (z) {
                int length2 = optJSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    jSONArray.put(optJSONArray.getJSONObject(i2));
                }
                return z2;
            }
            int length3 = optJSONArray.length();
            for (int i3 = 0; i3 < length3; i3++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i3);
                jSONObject2.getClass();
                if (pruneTree(jSONObject2, jSONArray)) {
                    jSONArray2.put(jSONObject2);
                    z2 = true;
                }
            }
            jSONObject.put(ViewHierarchyConstants.CHILDREN_VIEW_KEY, jSONArray2);
            return z2;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean regexMatched(String str, String str2, String str3, String str4) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            JSONObject jSONObject = rules;
            String str5 = null;
            if (jSONObject == null) {
                Intrinsics.f("rules");
                throw null;
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("rulesForLanguage");
            if (optJSONObject3 != null) {
                Map<String, String> map = languageInfo;
                if (map == null) {
                    Intrinsics.f("languageInfo");
                    throw null;
                }
                JSONObject optJSONObject4 = optJSONObject3.optJSONObject(map.get(str));
                if (optJSONObject4 != null && (optJSONObject = optJSONObject4.optJSONObject("rulesForEvent")) != null) {
                    Map<String, String> map2 = eventInfo;
                    if (map2 == null) {
                        Intrinsics.f("eventInfo");
                        throw null;
                    }
                    JSONObject optJSONObject5 = optJSONObject.optJSONObject(map2.get(str2));
                    if (optJSONObject5 != null && (optJSONObject2 = optJSONObject5.optJSONObject("positiveRules")) != null) {
                        Map<String, String> map3 = textTypeInfo;
                        if (map3 == null) {
                            Intrinsics.f("textTypeInfo");
                            throw null;
                        }
                        str5 = optJSONObject2.optString(map3.get(str3));
                    }
                }
            }
            if (str5 == null) {
                return false;
            }
            return regexMatched(str5, str4);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final void sum(float[] fArr, float[] fArr2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                fArr[i] = fArr[i] + fArr2[i];
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void updateHintAndTextRecursively(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            String optString = jSONObject.optString("text", BuildConfig.FLAVOR);
            optString.getClass();
            String lowerCase = optString.toLowerCase();
            lowerCase.getClass();
            String optString2 = jSONObject.optString(ViewHierarchyConstants.HINT_KEY, BuildConfig.FLAVOR);
            optString2.getClass();
            String lowerCase2 = optString2.toLowerCase();
            lowerCase2.getClass();
            if (lowerCase.length() > 0) {
                sb.append(lowerCase);
                sb.append(" ");
            }
            if (lowerCase2.length() > 0) {
                sb2.append(lowerCase2);
                sb2.append(" ");
            }
            JSONArray optJSONArray = jSONObject.optJSONArray(ViewHierarchyConstants.CHILDREN_VIEW_KEY);
            if (optJSONArray == null) {
                return;
            }
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    jSONObject2.getClass();
                    updateHintAndTextRecursively(jSONObject2, sb, sb2);
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final boolean regexMatched(String str, String str2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}
