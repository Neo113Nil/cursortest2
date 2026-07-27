package com.onesignal.inAppMessages.internal;

import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class InAppMessageOutcome {
    public static final Companion Companion = new Companion(null);
    private static final String OUTCOME_NAME = "name";
    private static final String OUTCOME_UNIQUE = "unique";
    private static final String OUTCOME_WEIGHT = "weight";
    private boolean isUnique;
    private String name;
    private float weight;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public InAppMessageOutcome(JSONObject json) {
        i.e(json, "json");
        String string = json.getString("name");
        i.d(string, "getString(...)");
        this.name = string;
        this.weight = json.has("weight") ? (float) json.getDouble("weight") : 0.0f;
        this.isUnique = json.has(OUTCOME_UNIQUE) && json.getBoolean(OUTCOME_UNIQUE);
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
        i.e(str, "<set-?>");
        this.name = str;
    }

    public final void setUnique(boolean z) {
        this.isUnique = z;
    }

    public final void setWeight(float f3) {
        this.weight = f3;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.name);
            jSONObject.put("weight", this.weight);
            jSONObject.put(OUTCOME_UNIQUE, this.isUnique);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return "OSInAppMessageOutcome{name='" + this.name + "', weight=" + this.weight + ", unique=" + this.isUnique + '}';
    }
}
