package com.bytedance.sdk.openadsdk.core.settings;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ISettingsDataRepository.java */
/* loaded from: classes2.dex */
public interface NB {
    public static final icD<JSONObject> pvs = new icD<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.NB.1
        @Override // com.bytedance.sdk.openadsdk.core.settings.NB.icD
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public JSONObject icD(String str) {
            try {
                return new JSONObject(str);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.Ju.pvs("ISettingsDataRepository", "", e);
                return null;
            }
        }
    };
    public static final icD<Set<String>> icD = new icD<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.NB.2
        @Override // com.bytedance.sdk.openadsdk.core.settings.NB.icD
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public Set<String> icD(String str) {
            HashSet hashSet = new HashSet();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    hashSet.add(jSONArray.getString(i));
                }
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.Ju.pvs("ISettingsDataRepository", "", e);
            }
            return hashSet;
        }
    };

    /* compiled from: ISettingsDataRepository.java */
    public interface icD<T> {
        T icD(String str);
    }

    /* compiled from: ISettingsDataRepository.java */
    public interface pvs {
        pvs pvs(String str);

        pvs pvs(String str, float f);

        pvs pvs(String str, int i);

        pvs pvs(String str, long j);

        pvs pvs(String str, String str2);

        pvs pvs(String str, boolean z);

        void pvs();
    }

    void pvs(JSONObject jSONObject);
}
