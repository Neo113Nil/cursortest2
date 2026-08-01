package com.onesignal.inAppMessages.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f {
    public static final a Companion = new a(null);
    private static final String OUTCOME_NAME = "name";
    private static final String OUTCOME_UNIQUE = "unique";
    private static final String OUTCOME_WEIGHT = "weight";
    private boolean isUnique;
    private String name;
    private float weight;

    public f(JSONObject jSONObject) {
        jSONObject.getClass();
        String string = jSONObject.getString(OUTCOME_NAME);
        string.getClass();
        this.name = string;
        this.weight = jSONObject.has(OUTCOME_WEIGHT) ? (float) jSONObject.getDouble(OUTCOME_WEIGHT) : 0.0f;
        this.isUnique = jSONObject.has(OUTCOME_UNIQUE) && jSONObject.getBoolean(OUTCOME_UNIQUE);
    }

    public final String getName() {
        return this.name;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final boolean isUnique() {
        return this.isUnique;
    }

    public final void setName(String str) {
        str.getClass();
        this.name = str;
    }

    public final void setUnique(boolean z10) {
        this.isUnique = z10;
    }

    public final void setWeight(float f3) {
        this.weight = f3;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(OUTCOME_NAME, this.name);
            jSONObject.put(OUTCOME_WEIGHT, this.weight);
            jSONObject.put(OUTCOME_UNIQUE, this.isUnique);
            return jSONObject;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return "OSInAppMessageOutcome{name='" + this.name + "', weight=" + this.weight + ", unique=" + this.isUnique + '}';
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
