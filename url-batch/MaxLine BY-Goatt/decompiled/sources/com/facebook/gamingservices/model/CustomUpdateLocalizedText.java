package com.facebook.gamingservices.model;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class CustomUpdateLocalizedText {

    /* renamed from: default, reason: not valid java name */
    private final String f0default;
    private final HashMap<String, String> localizations;

    public CustomUpdateLocalizedText(String str, HashMap<String, String> hashMap) {
        str.getClass();
        this.f0default = str;
        this.localizations = hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomUpdateLocalizedText copy$default(CustomUpdateLocalizedText customUpdateLocalizedText, String str, HashMap hashMap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customUpdateLocalizedText.f0default;
        }
        if ((i & 2) != 0) {
            hashMap = customUpdateLocalizedText.localizations;
        }
        return customUpdateLocalizedText.copy(str, hashMap);
    }

    public final String component1() {
        return this.f0default;
    }

    public final HashMap<String, String> component2() {
        return this.localizations;
    }

    public final CustomUpdateLocalizedText copy(String str, HashMap<String, String> hashMap) {
        str.getClass();
        return new CustomUpdateLocalizedText(str, hashMap);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomUpdateLocalizedText)) {
            return false;
        }
        CustomUpdateLocalizedText customUpdateLocalizedText = (CustomUpdateLocalizedText) obj;
        return Intrinsics.b(this.f0default, customUpdateLocalizedText.f0default) && Intrinsics.b(this.localizations, customUpdateLocalizedText.localizations);
    }

    public final String getDefault() {
        return this.f0default;
    }

    public final HashMap<String, String> getLocalizations() {
        return this.localizations;
    }

    public int hashCode() {
        int hashCode = this.f0default.hashCode() * 31;
        HashMap<String, String> hashMap = this.localizations;
        return hashCode + (hashMap == null ? 0 : hashMap.hashCode());
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("default", this.f0default);
        HashMap<String, String> hashMap = this.localizations;
        if (hashMap != null) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
            jSONObject.put("localizations", jSONObject2);
        }
        return jSONObject;
    }

    public String toString() {
        return "CustomUpdateLocalizedText(default=" + this.f0default + ", localizations=" + this.localizations + ')';
    }

    public /* synthetic */ CustomUpdateLocalizedText(String str, HashMap hashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : hashMap);
    }
}
