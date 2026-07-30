package com.facebook.appevents.codeless.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ParameterComponent {
    public static final Companion Companion = new Companion(null);
    private static final String PARAMETER_NAME_KEY = "name";
    private static final String PARAMETER_PATH_KEY = "path";
    private static final String PARAMETER_VALUE_KEY = "value";
    private final String name;
    private final List<PathComponent> path;
    private final String pathType;
    private final String value;

    public ParameterComponent(JSONObject jSONObject) {
        jSONObject.getClass();
        String string = jSONObject.getString("name");
        string.getClass();
        this.name = string;
        String optString = jSONObject.optString("value");
        optString.getClass();
        this.value = optString;
        String optString2 = jSONObject.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE);
        optString2.getClass();
        this.pathType = optString2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray(PARAMETER_PATH_KEY);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                jSONObject2.getClass();
                arrayList.add(new PathComponent(jSONObject2));
            }
        }
        this.path = arrayList;
    }

    public final String getName() {
        return this.name;
    }

    public final List<PathComponent> getPath() {
        return this.path;
    }

    public final String getPathType() {
        return this.pathType;
    }

    public final String getValue() {
        return this.value;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
