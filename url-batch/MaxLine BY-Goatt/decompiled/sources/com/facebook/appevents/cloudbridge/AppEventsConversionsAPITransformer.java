package com.facebook.appevents.cloudbridge;

import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.cloudbridge.AppEventType;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.mi1;
import defpackage.pv;
import defpackage.wi0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AppEventsConversionsAPITransformer {
    public static final AppEventsConversionsAPITransformer INSTANCE = new AppEventsConversionsAPITransformer();
    public static final String TAG = "AppEventsConversionsAPITransformer";
    public static final Map<CustomEventField, SectionCustomEventFieldMapping> customEventTransformations;
    public static final Map<String, ConversionsAPIEventName> standardEventTransformations;
    private static final Map<AppEventUserAndAppDataField, SectionFieldMapping> topLevelTransformations;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class SectionCustomEventFieldMapping {
        private ConversionsAPICustomEventField field;
        private ConversionsAPISection section;

        public SectionCustomEventFieldMapping(ConversionsAPISection conversionsAPISection, ConversionsAPICustomEventField conversionsAPICustomEventField) {
            conversionsAPICustomEventField.getClass();
            this.section = conversionsAPISection;
            this.field = conversionsAPICustomEventField;
        }

        public static /* synthetic */ SectionCustomEventFieldMapping copy$default(SectionCustomEventFieldMapping sectionCustomEventFieldMapping, ConversionsAPISection conversionsAPISection, ConversionsAPICustomEventField conversionsAPICustomEventField, int i, Object obj) {
            if ((i & 1) != 0) {
                conversionsAPISection = sectionCustomEventFieldMapping.section;
            }
            if ((i & 2) != 0) {
                conversionsAPICustomEventField = sectionCustomEventFieldMapping.field;
            }
            return sectionCustomEventFieldMapping.copy(conversionsAPISection, conversionsAPICustomEventField);
        }

        public final ConversionsAPISection component1() {
            return this.section;
        }

        public final ConversionsAPICustomEventField component2() {
            return this.field;
        }

        public final SectionCustomEventFieldMapping copy(ConversionsAPISection conversionsAPISection, ConversionsAPICustomEventField conversionsAPICustomEventField) {
            conversionsAPICustomEventField.getClass();
            return new SectionCustomEventFieldMapping(conversionsAPISection, conversionsAPICustomEventField);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SectionCustomEventFieldMapping)) {
                return false;
            }
            SectionCustomEventFieldMapping sectionCustomEventFieldMapping = (SectionCustomEventFieldMapping) obj;
            return this.section == sectionCustomEventFieldMapping.section && this.field == sectionCustomEventFieldMapping.field;
        }

        public final ConversionsAPICustomEventField getField() {
            return this.field;
        }

        public final ConversionsAPISection getSection() {
            return this.section;
        }

        public int hashCode() {
            ConversionsAPISection conversionsAPISection = this.section;
            return this.field.hashCode() + ((conversionsAPISection == null ? 0 : conversionsAPISection.hashCode()) * 31);
        }

        public final void setField(ConversionsAPICustomEventField conversionsAPICustomEventField) {
            conversionsAPICustomEventField.getClass();
            this.field = conversionsAPICustomEventField;
        }

        public final void setSection(ConversionsAPISection conversionsAPISection) {
            this.section = conversionsAPISection;
        }

        public String toString() {
            return "SectionCustomEventFieldMapping(section=" + this.section + ", field=" + this.field + ')';
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class SectionFieldMapping {
        private ConversionsAPIUserAndAppDataField field;
        private ConversionsAPISection section;

        public SectionFieldMapping(ConversionsAPISection conversionsAPISection, ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField) {
            conversionsAPISection.getClass();
            this.section = conversionsAPISection;
            this.field = conversionsAPIUserAndAppDataField;
        }

        public static /* synthetic */ SectionFieldMapping copy$default(SectionFieldMapping sectionFieldMapping, ConversionsAPISection conversionsAPISection, ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField, int i, Object obj) {
            if ((i & 1) != 0) {
                conversionsAPISection = sectionFieldMapping.section;
            }
            if ((i & 2) != 0) {
                conversionsAPIUserAndAppDataField = sectionFieldMapping.field;
            }
            return sectionFieldMapping.copy(conversionsAPISection, conversionsAPIUserAndAppDataField);
        }

        public final ConversionsAPISection component1() {
            return this.section;
        }

        public final ConversionsAPIUserAndAppDataField component2() {
            return this.field;
        }

        public final SectionFieldMapping copy(ConversionsAPISection conversionsAPISection, ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField) {
            conversionsAPISection.getClass();
            return new SectionFieldMapping(conversionsAPISection, conversionsAPIUserAndAppDataField);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SectionFieldMapping)) {
                return false;
            }
            SectionFieldMapping sectionFieldMapping = (SectionFieldMapping) obj;
            return this.section == sectionFieldMapping.section && this.field == sectionFieldMapping.field;
        }

        public final ConversionsAPIUserAndAppDataField getField() {
            return this.field;
        }

        public final ConversionsAPISection getSection() {
            return this.section;
        }

        public int hashCode() {
            int hashCode = this.section.hashCode() * 31;
            ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField = this.field;
            return hashCode + (conversionsAPIUserAndAppDataField == null ? 0 : conversionsAPIUserAndAppDataField.hashCode());
        }

        public final void setField(ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField) {
            this.field = conversionsAPIUserAndAppDataField;
        }

        public final void setSection(ConversionsAPISection conversionsAPISection) {
            conversionsAPISection.getClass();
            this.section = conversionsAPISection;
        }

        public String toString() {
            return "SectionFieldMapping(section=" + this.section + ", field=" + this.field + ')';
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ValueTransformationType.values().length];
            try {
                iArr[ValueTransformationType.ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValueTransformationType.BOOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ValueTransformationType.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConversionsAPISection.values().length];
            try {
                iArr2[ConversionsAPISection.APP_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ConversionsAPISection.USER_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AppEventType.values().length];
            try {
                iArr3[AppEventType.MOBILE_APP_INSTALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[AppEventType.CUSTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    static {
        AppEventUserAndAppDataField appEventUserAndAppDataField = AppEventUserAndAppDataField.ANON_ID;
        ConversionsAPISection conversionsAPISection = ConversionsAPISection.USER_DATA;
        Pair pair = new Pair(appEventUserAndAppDataField, new SectionFieldMapping(conversionsAPISection, ConversionsAPIUserAndAppDataField.ANON_ID));
        Pair pair2 = new Pair(AppEventUserAndAppDataField.APP_USER_ID, new SectionFieldMapping(conversionsAPISection, ConversionsAPIUserAndAppDataField.FB_LOGIN_ID));
        Pair pair3 = new Pair(AppEventUserAndAppDataField.ADVERTISER_ID, new SectionFieldMapping(conversionsAPISection, ConversionsAPIUserAndAppDataField.MAD_ID));
        Pair pair4 = new Pair(AppEventUserAndAppDataField.PAGE_ID, new SectionFieldMapping(conversionsAPISection, ConversionsAPIUserAndAppDataField.PAGE_ID));
        Pair pair5 = new Pair(AppEventUserAndAppDataField.PAGE_SCOPED_USER_ID, new SectionFieldMapping(conversionsAPISection, ConversionsAPIUserAndAppDataField.PAGE_SCOPED_USER_ID));
        AppEventUserAndAppDataField appEventUserAndAppDataField2 = AppEventUserAndAppDataField.ADV_TE;
        ConversionsAPISection conversionsAPISection2 = ConversionsAPISection.APP_DATA;
        topLevelTransformations = mi1.f(pair, pair2, pair3, pair4, pair5, new Pair(appEventUserAndAppDataField2, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.ADV_TE)), new Pair(AppEventUserAndAppDataField.APP_TE, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.APP_TE)), new Pair(AppEventUserAndAppDataField.CONSIDER_VIEWS, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.CONSIDER_VIEWS)), new Pair(AppEventUserAndAppDataField.DEVICE_TOKEN, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.DEVICE_TOKEN)), new Pair(AppEventUserAndAppDataField.EXT_INFO, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.EXT_INFO)), new Pair(AppEventUserAndAppDataField.INCLUDE_DWELL_DATA, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INCLUDE_DWELL_DATA)), new Pair(AppEventUserAndAppDataField.INCLUDE_VIDEO_DATA, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INCLUDE_VIDEO_DATA)), new Pair(AppEventUserAndAppDataField.INSTALL_REFERRER, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INSTALL_REFERRER)), new Pair(AppEventUserAndAppDataField.INSTALLER_PACKAGE, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INSTALLER_PACKAGE)), new Pair(AppEventUserAndAppDataField.RECEIPT_DATA, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.RECEIPT_DATA)), new Pair(AppEventUserAndAppDataField.URL_SCHEMES, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.URL_SCHEMES)), new Pair(AppEventUserAndAppDataField.ADD_TO_MESSAGING_CUSTOMER_BASE_FOR_WHATSAPP, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.ADD_TO_MESSAGING_CUSTOMER_BASE_FOR_WHATSAPP)), new Pair(AppEventUserAndAppDataField.USER_DATA, new SectionFieldMapping(conversionsAPISection, null)));
        Pair pair6 = new Pair(CustomEventField.EVENT_TIME, new SectionCustomEventFieldMapping(null, ConversionsAPICustomEventField.EVENT_TIME));
        Pair pair7 = new Pair(CustomEventField.EVENT_NAME, new SectionCustomEventFieldMapping(null, ConversionsAPICustomEventField.EVENT_NAME));
        CustomEventField customEventField = CustomEventField.VALUE_TO_SUM;
        ConversionsAPISection conversionsAPISection3 = ConversionsAPISection.CUSTOM_DATA;
        customEventTransformations = mi1.f(pair6, pair7, new Pair(customEventField, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.VALUE_TO_SUM)), new Pair(CustomEventField.CONTENT_IDS, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.CONTENT_IDS)), new Pair(CustomEventField.CONTENTS, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.CONTENTS)), new Pair(CustomEventField.CONTENT_TYPE, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.CONTENT_TYPE)), new Pair(CustomEventField.CURRENCY, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.CURRENCY)), new Pair(CustomEventField.DESCRIPTION, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.DESCRIPTION)), new Pair(CustomEventField.LEVEL, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.LEVEL)), new Pair(CustomEventField.MAX_RATING_VALUE, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.MAX_RATING_VALUE)), new Pair(CustomEventField.NUM_ITEMS, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.NUM_ITEMS)), new Pair(CustomEventField.PAYMENT_INFO_AVAILABLE, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.PAYMENT_INFO_AVAILABLE)), new Pair(CustomEventField.REGISTRATION_METHOD, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.REGISTRATION_METHOD)), new Pair(CustomEventField.SEARCH_STRING, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.SEARCH_STRING)), new Pair(CustomEventField.SUCCESS, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.SUCCESS)), new Pair(CustomEventField.ORDER_ID, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.ORDER_ID)), new Pair(CustomEventField.AD_TYPE, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.AD_TYPE)));
        standardEventTransformations = mi1.f(new Pair(AppEventsConstants.EVENT_NAME_UNLOCKED_ACHIEVEMENT, ConversionsAPIEventName.UNLOCKED_ACHIEVEMENT), new Pair(AppEventsConstants.EVENT_NAME_ACTIVATED_APP, ConversionsAPIEventName.ACTIVATED_APP), new Pair(AppEventsConstants.EVENT_NAME_ADDED_PAYMENT_INFO, ConversionsAPIEventName.ADDED_PAYMENT_INFO), new Pair(AppEventsConstants.EVENT_NAME_ADDED_TO_CART, ConversionsAPIEventName.ADDED_TO_CART), new Pair(AppEventsConstants.EVENT_NAME_ADDED_TO_WISHLIST, ConversionsAPIEventName.ADDED_TO_WISHLIST), new Pair(AppEventsConstants.EVENT_NAME_COMPLETED_REGISTRATION, ConversionsAPIEventName.COMPLETED_REGISTRATION), new Pair(AppEventsConstants.EVENT_NAME_VIEWED_CONTENT, ConversionsAPIEventName.VIEWED_CONTENT), new Pair(AppEventsConstants.EVENT_NAME_INITIATED_CHECKOUT, ConversionsAPIEventName.INITIATED_CHECKOUT), new Pair(AppEventsConstants.EVENT_NAME_ACHIEVED_LEVEL, ConversionsAPIEventName.ACHIEVED_LEVEL), new Pair(AppEventsConstants.EVENT_NAME_PURCHASED, ConversionsAPIEventName.PURCHASED), new Pair(AppEventsConstants.EVENT_NAME_RATED, ConversionsAPIEventName.RATED), new Pair(AppEventsConstants.EVENT_NAME_SEARCHED, ConversionsAPIEventName.SEARCHED), new Pair(AppEventsConstants.EVENT_NAME_SPENT_CREDITS, ConversionsAPIEventName.SPENT_CREDITS), new Pair(AppEventsConstants.EVENT_NAME_COMPLETED_TUTORIAL, ConversionsAPIEventName.COMPLETED_TUTORIAL));
    }

    private AppEventsConversionsAPITransformer() {
    }

    private final List<Map<String, Object>> combineAllTransformedDataForCustom(Map<String, ? extends Object> map, List<? extends Map<String, ? extends Object>> list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Map map2 = (Map) it.next();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            linkedHashMap.putAll(map2);
            arrayList.add(linkedHashMap);
        }
        return arrayList;
    }

    private final List<Map<String, Object>> combineAllTransformedDataForMobileAppInstall(Map<String, ? extends Object> map, Object obj) {
        if (obj == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put(ConversionsAPICustomEventField.EVENT_NAME.getRawValue(), OtherEventConstants.MOBILE_APP_INSTALL.getRawValue());
        linkedHashMap.put(ConversionsAPICustomEventField.EVENT_TIME.getRawValue(), obj);
        return pv.c(linkedHashMap);
    }

    private final AppEventType splitAppEventParameters(Map<String, ? extends Object> map, Map<String, Object> map2, Map<String, Object> map3, ArrayList<Map<String, Object>> arrayList, Map<String, Object> map4) {
        Object obj = map.get(OtherEventConstants.EVENT.getRawValue());
        AppEventType.Companion companion = AppEventType.Companion;
        obj.getClass();
        AppEventType invoke = companion.invoke((String) obj);
        if (invoke != AppEventType.OTHER) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                AppEventUserAndAppDataField invoke2 = AppEventUserAndAppDataField.Companion.invoke(key);
                if (invoke2 != null) {
                    INSTANCE.transformAndUpdateAppAndUserData$facebook_core_release(map2, map3, invoke2, value);
                } else {
                    boolean b = Intrinsics.b(key, ConversionsAPISection.CUSTOM_EVENTS.getRawValue());
                    boolean z = value instanceof String;
                    if (invoke == AppEventType.CUSTOM && b && z) {
                        ArrayList<Map<String, Object>> transformEvents$facebook_core_release = transformEvents$facebook_core_release((String) value);
                        if (transformEvents$facebook_core_release != null) {
                            arrayList.addAll(transformEvents$facebook_core_release);
                        }
                    } else if (DataProcessingParameterName.Companion.invoke(key) != null) {
                        map4.put(key, value);
                    }
                }
            }
        }
        return invoke;
    }

    private final void transformAndUpdateAppData(Map<String, Object> map, AppEventUserAndAppDataField appEventUserAndAppDataField, Object obj) {
        ConversionsAPIUserAndAppDataField field;
        String rawValue;
        SectionFieldMapping sectionFieldMapping = topLevelTransformations.get(appEventUserAndAppDataField);
        if (sectionFieldMapping == null || (field = sectionFieldMapping.getField()) == null || (rawValue = field.getRawValue()) == null) {
            return;
        }
        map.put(rawValue, obj);
    }

    private final void transformAndUpdateUserData(Map<String, Object> map, AppEventUserAndAppDataField appEventUserAndAppDataField, Object obj) {
        ConversionsAPIUserAndAppDataField field;
        String rawValue;
        if (appEventUserAndAppDataField == AppEventUserAndAppDataField.USER_DATA) {
            try {
                obj.getClass();
                map.putAll(Utility.convertJSONObjectToHashMap(new JSONObject((String) obj)));
                return;
            } catch (JSONException e) {
                Logger.Companion.log(LoggingBehavior.APP_EVENTS, TAG, "\n transformEvents JSONException: \n%s\n%s", obj, e);
                return;
            }
        }
        SectionFieldMapping sectionFieldMapping = topLevelTransformations.get(appEventUserAndAppDataField);
        if (sectionFieldMapping == null || (field = sectionFieldMapping.getField()) == null || (rawValue = field.getRawValue()) == null) {
            return;
        }
        map.put(rawValue, obj);
    }

    private final String transformEventName(String str) {
        String rawValue;
        Map<String, ConversionsAPIEventName> map = standardEventTransformations;
        if (!map.containsKey(str)) {
            return str;
        }
        ConversionsAPIEventName conversionsAPIEventName = map.get(str);
        return (conversionsAPIEventName == null || (rawValue = conversionsAPIEventName.getRawValue()) == null) ? BuildConfig.FLAVOR : rawValue;
    }

    public static final ArrayList<Map<String, Object>> transformEvents$facebook_core_release(String str) {
        str.getClass();
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<T> it = Utility.convertJSONArrayToList(new JSONArray(str)).iterator();
            while (it.hasNext()) {
                arrayList.add(Utility.convertJSONObjectToHashMap(new JSONObject((String) it.next())));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            ArrayList<Map<String, Object>> arrayList2 = new ArrayList<>();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (String str2 : map.keySet()) {
                    CustomEventField invoke = CustomEventField.Companion.invoke(str2);
                    SectionCustomEventFieldMapping sectionCustomEventFieldMapping = customEventTransformations.get(invoke);
                    if (invoke != null && sectionCustomEventFieldMapping != null) {
                        ConversionsAPISection section = sectionCustomEventFieldMapping.getSection();
                        if (section == null) {
                            try {
                                String rawValue = sectionCustomEventFieldMapping.getField().getRawValue();
                                if (invoke == CustomEventField.EVENT_NAME && ((String) map.get(str2)) != null) {
                                    AppEventsConversionsAPITransformer appEventsConversionsAPITransformer = INSTANCE;
                                    Object obj2 = map.get(str2);
                                    obj2.getClass();
                                    linkedHashMap2.put(rawValue, appEventsConversionsAPITransformer.transformEventName((String) obj2));
                                } else if (invoke == CustomEventField.EVENT_TIME && ((Integer) map.get(str2)) != null) {
                                    Object obj3 = map.get(str2);
                                    obj3.getClass();
                                    Object transformValue$facebook_core_release = transformValue$facebook_core_release(str2, obj3);
                                    transformValue$facebook_core_release.getClass();
                                    linkedHashMap2.put(rawValue, transformValue$facebook_core_release);
                                }
                            } catch (ClassCastException e) {
                                Logger.Companion.log(LoggingBehavior.APP_EVENTS, TAG, "\n transformEvents ClassCastException: \n %s ", wi0.b(e));
                            }
                        } else if (section == ConversionsAPISection.CUSTOM_DATA) {
                            String rawValue2 = sectionCustomEventFieldMapping.getField().getRawValue();
                            Object obj4 = map.get(str2);
                            obj4.getClass();
                            Object transformValue$facebook_core_release2 = transformValue$facebook_core_release(str2, obj4);
                            transformValue$facebook_core_release2.getClass();
                            linkedHashMap.put(rawValue2, transformValue$facebook_core_release2);
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    linkedHashMap2.put(ConversionsAPISection.CUSTOM_DATA.getRawValue(), linkedHashMap);
                }
                arrayList2.add(linkedHashMap2);
            }
            return arrayList2;
        } catch (JSONException e2) {
            Logger.Companion.log(LoggingBehavior.APP_EVENTS, TAG, "\n transformEvents JSONException: \n%s\n%s", str, e2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Map] */
    public static final Object transformValue$facebook_core_release(String str, Object obj) {
        str.getClass();
        obj.getClass();
        ValueTransformationType invoke = ValueTransformationType.Companion.invoke(str);
        String str2 = obj instanceof String ? (String) obj : null;
        if (invoke == null || str2 == null) {
            return obj;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[invoke.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return b.f(obj.toString());
                }
                defpackage.a.b();
                return null;
            }
            Integer f = b.f(str2.toString());
            if (f != null) {
                return Boolean.valueOf(f.intValue() != 0);
            }
            return null;
        }
        try {
            List<String> convertJSONArrayToList = Utility.convertJSONArrayToList(new JSONArray(str2));
            ArrayList arrayList = new ArrayList();
            Iterator it = convertJSONArrayToList.iterator();
            while (it.hasNext()) {
                ?? r1 = (String) it.next();
                try {
                    try {
                        r1 = Utility.convertJSONObjectToHashMap(new JSONObject((String) r1));
                    } catch (JSONException unused) {
                    }
                } catch (JSONException unused2) {
                    r1 = Utility.convertJSONArrayToList(new JSONArray((String) r1));
                }
                arrayList.add(r1);
            }
            return arrayList;
        } catch (JSONException e) {
            Logger.Companion.log(LoggingBehavior.APP_EVENTS, TAG, "\n transformEvents JSONException: \n%s\n%s", obj, e);
            return Unit.a;
        }
    }

    public final List<Map<String, Object>> combineAllTransformedData$facebook_core_release(AppEventType appEventType, Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, List<? extends Map<String, ? extends Object>> list, Object obj) {
        appEventType.getClass();
        map.getClass();
        map2.getClass();
        map3.getClass();
        list.getClass();
        Map<String, Object> combineCommonFields$facebook_core_release = combineCommonFields$facebook_core_release(map, map2, map3);
        int i = WhenMappings.$EnumSwitchMapping$2[appEventType.ordinal()];
        if (i == 1) {
            return combineAllTransformedDataForMobileAppInstall(combineCommonFields$facebook_core_release, obj);
        }
        if (i != 2) {
            return null;
        }
        return combineAllTransformedDataForCustom(combineCommonFields$facebook_core_release, list);
    }

    public final Map<String, Object> combineCommonFields$facebook_core_release(Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OtherEventConstants.ACTION_SOURCE.getRawValue(), OtherEventConstants.APP.getRawValue());
        linkedHashMap.put(ConversionsAPISection.USER_DATA.getRawValue(), map);
        linkedHashMap.put(ConversionsAPISection.APP_DATA.getRawValue(), map2);
        linkedHashMap.putAll(map3);
        return linkedHashMap;
    }

    public final List<Map<String, Object>> conversionsAPICompatibleEvent$facebook_core_release(Map<String, ? extends Object> map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList<Map<String, Object>> arrayList = new ArrayList<>();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        AppEventType splitAppEventParameters = splitAppEventParameters(map, linkedHashMap, linkedHashMap2, arrayList, linkedHashMap3);
        if (splitAppEventParameters == AppEventType.OTHER) {
            return null;
        }
        return combineAllTransformedData$facebook_core_release(splitAppEventParameters, linkedHashMap, linkedHashMap2, linkedHashMap3, arrayList, map.get(OtherEventConstants.INSTALL_EVENT_TIME.getRawValue()));
    }

    public final void transformAndUpdateAppAndUserData$facebook_core_release(Map<String, Object> map, Map<String, Object> map2, AppEventUserAndAppDataField appEventUserAndAppDataField, Object obj) {
        ConversionsAPISection section;
        map.getClass();
        map2.getClass();
        appEventUserAndAppDataField.getClass();
        obj.getClass();
        SectionFieldMapping sectionFieldMapping = topLevelTransformations.get(appEventUserAndAppDataField);
        if (sectionFieldMapping == null || (section = sectionFieldMapping.getSection()) == null) {
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[section.ordinal()];
        if (i == 1) {
            transformAndUpdateAppData(map2, appEventUserAndAppDataField, obj);
        } else {
            if (i != 2) {
                return;
            }
            transformAndUpdateUserData(map, appEventUserAndAppDataField, obj);
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public enum DataProcessingParameterName {
        OPTIONS(FacebookSdk.DATA_PROCESSING_OPTIONS),
        COUNTRY(FacebookSdk.DATA_PROCESSING_OPTIONS_COUNTRY),
        STATE(FacebookSdk.DATA_PROCESSING_OPTIONS_STATE);

        public static final Companion Companion = new Companion(null);
        private final String rawValue;

        DataProcessingParameterName(String str) {
            this.rawValue = str;
        }

        public final String getRawValue() {
            return this.rawValue;
        }

        /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final DataProcessingParameterName invoke(String str) {
                str.getClass();
                for (DataProcessingParameterName dataProcessingParameterName : DataProcessingParameterName.values()) {
                    if (Intrinsics.b(dataProcessingParameterName.getRawValue(), str)) {
                        return dataProcessingParameterName;
                    }
                }
                return null;
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public enum ValueTransformationType {
        ARRAY,
        BOOL,
        INT;

        public static final Companion Companion = new Companion(null);

        /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ValueTransformationType invoke(String str) {
                str.getClass();
                if (Intrinsics.b(str, AppEventUserAndAppDataField.EXT_INFO.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (Intrinsics.b(str, AppEventUserAndAppDataField.URL_SCHEMES.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (Intrinsics.b(str, CustomEventField.CONTENT_IDS.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (Intrinsics.b(str, CustomEventField.CONTENTS.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (Intrinsics.b(str, DataProcessingParameterName.OPTIONS.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (Intrinsics.b(str, AppEventUserAndAppDataField.ADV_TE.getRawValue())) {
                    return ValueTransformationType.BOOL;
                }
                if (Intrinsics.b(str, AppEventUserAndAppDataField.APP_TE.getRawValue())) {
                    return ValueTransformationType.BOOL;
                }
                if (Intrinsics.b(str, CustomEventField.EVENT_TIME.getRawValue())) {
                    return ValueTransformationType.INT;
                }
                return null;
            }

            private Companion() {
            }
        }
    }
}
