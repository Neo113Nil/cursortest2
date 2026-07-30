package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.appevents.internal.Constants;
import defpackage.li1;
import defpackage.mi1;
import defpackage.oi;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class OperationalData {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> iapOperationalAndCustomParameters;
    private static final Set<String> iapOperationalParameters;
    private static final Map<OperationalDataEnum, Pair<Set<String>, Set<String>>> parameterClassifications;
    private final Map<OperationalDataEnum, Map<String, Object>> operationalData = new LinkedHashMap();

    static {
        Set<String> z = oi.z(new String[]{Constants.IAP_PACKAGE_NAME, Constants.IAP_SUBSCRIPTION_AUTORENEWING, Constants.IAP_FREE_TRIAL_PERIOD, Constants.IAP_INTRO_PRICE_AMOUNT_MICROS, Constants.IAP_INTRO_PRICE_CYCLES, Constants.IAP_BASE_PLAN, Constants.EVENT_PARAM_IS_IMPLICIT_PURCHASE_LOGGING_ENABLED, Constants.IAP_AUTOLOG_IMPLEMENTATION, Constants.EVENT_PARAM_IS_AUTOLOG_APP_EVENTS_ENABLED, Constants.IAP_BILLING_LIBRARY_VERSION, Constants.IAP_SUBSCRIPTION_PERIOD, Constants.IAP_PURCHASE_TOKEN, Constants.IAP_NON_DEDUPED_EVENT_TIME, Constants.IAP_ACTUAL_DEDUP_RESULT, Constants.IAP_ACTUAL_DEDUP_KEY_USED, Constants.IAP_TEST_DEDUP_RESULT, Constants.IAP_TEST_DEDUP_KEY_USED});
        iapOperationalParameters = z;
        Set<String> z2 = oi.z(new String[]{Constants.IAP_PRODUCT_ID, Constants.IAP_PRODUCT_TYPE, Constants.IAP_PURCHASE_TIME});
        iapOperationalAndCustomParameters = z2;
        parameterClassifications = li1.b(new Pair(OperationalDataEnum.IAPParameters, new Pair(z, z2)));
    }

    public final void addParameter(OperationalDataEnum operationalDataEnum, String str, Object obj) {
        operationalDataEnum.getClass();
        str.getClass();
        obj.getClass();
        try {
            AppEvent.Companion.validateIdentifier(str);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str}, 2)));
            }
            if (!this.operationalData.containsKey(operationalDataEnum)) {
                this.operationalData.put(operationalDataEnum, new LinkedHashMap());
            }
            Map<String, Object> map = this.operationalData.get(operationalDataEnum);
            if (map != null) {
                map.put(str, obj);
            }
        } catch (Exception unused) {
        }
    }

    public final OperationalData copy() {
        OperationalData operationalData = new OperationalData();
        for (OperationalDataEnum operationalDataEnum : this.operationalData.keySet()) {
            Map<String, Object> map = this.operationalData.get(operationalDataEnum);
            if (map != null) {
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    if (obj != null) {
                        operationalData.addParameter(operationalDataEnum, str, obj);
                    }
                }
            }
        }
        return operationalData;
    }

    public final Object getParameter(OperationalDataEnum operationalDataEnum, String str) {
        Map<String, Object> map;
        operationalDataEnum.getClass();
        str.getClass();
        if (this.operationalData.containsKey(operationalDataEnum) && (map = this.operationalData.get(operationalDataEnum)) != null) {
            return map.get(str);
        }
        return null;
    }

    public final JSONObject toJSON() {
        JSONObject jSONObject;
        try {
            Map<OperationalDataEnum, Map<String, Object>> map = this.operationalData;
            LinkedHashMap linkedHashMap = new LinkedHashMap(li1.a(map.size()));
            for (Object obj : map.entrySet()) {
                linkedHashMap.put(((OperationalDataEnum) ((Map.Entry) obj).getKey()).getValue(), ((Map.Entry) obj).getValue());
            }
            jSONObject = new JSONObject(mi1.i(linkedHashMap));
        } catch (Exception unused) {
            jSONObject = null;
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {

        /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ParameterClassification.values().length];
                try {
                    iArr[ParameterClassification.CustomData.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ParameterClassification.OperationalData.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ParameterClassification.CustomAndOperationalData.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addParameter(OperationalDataEnum operationalDataEnum, String str, String str2, Bundle bundle, OperationalData operationalData) {
            operationalDataEnum.getClass();
            str.getClass();
            str2.getClass();
            bundle.getClass();
            operationalData.getClass();
            int i = WhenMappings.$EnumSwitchMapping$0[getParameterClassification(operationalDataEnum, str).ordinal()];
            if (i == 1) {
                bundle.putCharSequence(str, str2);
                return;
            }
            if (i == 2) {
                operationalData.addParameter(operationalDataEnum, str, str2);
            } else {
                if (i != 3) {
                    return;
                }
                operationalData.addParameter(operationalDataEnum, str, str2);
                bundle.putCharSequence(str, str2);
            }
        }

        public final Pair<Bundle, OperationalData> addParameterAndReturn(OperationalDataEnum operationalDataEnum, String str, String str2, Bundle bundle, OperationalData operationalData) {
            operationalDataEnum.getClass();
            str.getClass();
            str2.getClass();
            int i = WhenMappings.$EnumSwitchMapping$0[getParameterClassification(operationalDataEnum, str).ordinal()];
            if (i == 1) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putCharSequence(str, str2);
            } else if (i == 2) {
                if (operationalData == null) {
                    operationalData = new OperationalData();
                }
                operationalData.addParameter(operationalDataEnum, str, str2);
            } else if (i == 3) {
                if (operationalData == null) {
                    operationalData = new OperationalData();
                }
                if (bundle == null) {
                    bundle = new Bundle();
                }
                operationalData.addParameter(operationalDataEnum, str, str2);
                bundle.putCharSequence(str, str2);
            }
            return new Pair<>(bundle, operationalData);
        }

        public final Object getParameter(OperationalDataEnum operationalDataEnum, String str, Bundle bundle, OperationalData operationalData) {
            operationalDataEnum.getClass();
            str.getClass();
            Object parameter = operationalData != null ? operationalData.getParameter(operationalDataEnum, str) : null;
            return parameter == null ? bundle != null ? bundle.getCharSequence(str) : null : parameter;
        }

        public final ParameterClassification getParameterClassification(OperationalDataEnum operationalDataEnum, String str) {
            operationalDataEnum.getClass();
            str.getClass();
            Pair pair = (Pair) OperationalData.parameterClassifications.get(operationalDataEnum);
            Set set = pair != null ? (Set) pair.m : null;
            Pair pair2 = (Pair) OperationalData.parameterClassifications.get(operationalDataEnum);
            Set set2 = pair2 != null ? (Set) pair2.n : null;
            return (set == null || !set.contains(str)) ? (set2 == null || !set2.contains(str)) ? ParameterClassification.CustomData : ParameterClassification.CustomAndOperationalData : ParameterClassification.OperationalData;
        }

        private Companion() {
        }
    }
}
