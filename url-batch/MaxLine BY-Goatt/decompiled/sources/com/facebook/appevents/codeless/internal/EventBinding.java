package com.facebook.appevents.codeless.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class EventBinding {
    public static final Companion Companion = new Companion(null);
    private final String activityName;
    private final String appVersion;
    private final String componentId;
    private final String eventName;
    private final MappingMethod method;
    private final List<ParameterComponent> parameters;
    private final List<PathComponent> path;
    private final String pathType;
    private final ActionType type;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public enum ActionType {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public enum MappingMethod {
        MANUAL,
        INFERENCE
    }

    public EventBinding(String str, MappingMethod mappingMethod, ActionType actionType, String str2, List<PathComponent> list, List<ParameterComponent> list2, String str3, String str4, String str5) {
        str.getClass();
        mappingMethod.getClass();
        actionType.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.eventName = str;
        this.method = mappingMethod;
        this.type = actionType;
        this.appVersion = str2;
        this.path = list;
        this.parameters = list2;
        this.componentId = str3;
        this.pathType = str4;
        this.activityName = str5;
    }

    public static final EventBinding getInstanceFromJson(JSONObject jSONObject) {
        return Companion.getInstanceFromJson(jSONObject);
    }

    public static final List<EventBinding> parseArray(JSONArray jSONArray) {
        return Companion.parseArray(jSONArray);
    }

    public final String getActivityName() {
        return this.activityName;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getComponentId() {
        return this.componentId;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final MappingMethod getMethod() {
        return this.method;
    }

    public final String getPathType() {
        return this.pathType;
    }

    public final ActionType getType() {
        return this.type;
    }

    public final List<ParameterComponent> getViewParameters() {
        List<ParameterComponent> unmodifiableList = Collections.unmodifiableList(this.parameters);
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public final List<PathComponent> getViewPath() {
        List<PathComponent> unmodifiableList = Collections.unmodifiableList(this.path);
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EventBinding getInstanceFromJson(JSONObject jSONObject) {
            jSONObject.getClass();
            String string = jSONObject.getString("event_name");
            String string2 = jSONObject.getString(FirebaseAnalytics.Param.METHOD);
            string2.getClass();
            Locale locale = Locale.ENGLISH;
            locale.getClass();
            String upperCase = string2.toUpperCase(locale);
            upperCase.getClass();
            MappingMethod valueOf = MappingMethod.valueOf(upperCase);
            String string3 = jSONObject.getString("event_type");
            string3.getClass();
            String upperCase2 = string3.toUpperCase(locale);
            upperCase2.getClass();
            ActionType valueOf2 = ActionType.valueOf(upperCase2);
            String string4 = jSONObject.getString("app_version");
            JSONArray jSONArray = jSONObject.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                jSONObject2.getClass();
                arrayList.add(new PathComponent(jSONObject2));
            }
            String optString = jSONObject.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE);
            JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null) {
                int length2 = optJSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject3 = optJSONArray.getJSONObject(i2);
                    jSONObject3.getClass();
                    arrayList2.add(new ParameterComponent(jSONObject3));
                }
            }
            String optString2 = jSONObject.optString("component_id");
            String optString3 = jSONObject.optString("activity_name");
            string.getClass();
            string4.getClass();
            optString2.getClass();
            optString.getClass();
            optString3.getClass();
            return new EventBinding(string, valueOf, valueOf2, string4, arrayList, arrayList2, optString2, optString, optString3);
        }

        public final List<EventBinding> parseArray(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                try {
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        jSONObject.getClass();
                        arrayList.add(getInstanceFromJson(jSONObject));
                    }
                } catch (IllegalArgumentException | JSONException unused) {
                }
            }
            return arrayList;
        }

        private Companion() {
        }
    }
}
