package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.component.utils.iqz;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public interface btk {
    public static final fs<JSONObject> zmn = new fs<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.btk.1
        @Override // com.bytedance.sdk.openadsdk.core.settings.btk.fs
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public JSONObject fs(String str) {
            try {
                return PangleNetworkBridge.jsonObjectInit(str);
            } catch (Exception e) {
                iqz.zmn("ISettingsDataRepository", "", e);
                return null;
            }
        }
    };
    public static final fs<Set<String>> fs = new fs<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.btk.2
        @Override // com.bytedance.sdk.openadsdk.core.settings.btk.fs
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public Set<String> fs(String str) {
            HashSet hashSet = new HashSet();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    hashSet.add(jSONArray.getString(i));
                }
            } catch (Exception e) {
                iqz.zmn("ISettingsDataRepository", "", e);
            }
            return hashSet;
        }
    };

    public interface fs<T> {
        T fs(String str);
    }

    public interface zmn {
        zmn zmn(String str);

        zmn zmn(String str, float f);

        zmn zmn(String str, int i);

        zmn zmn(String str, long j);

        zmn zmn(String str, String str2);

        zmn zmn(String str, boolean z);

        void zmn();
    }

    void zmn(JSONObject jSONObject);
}
