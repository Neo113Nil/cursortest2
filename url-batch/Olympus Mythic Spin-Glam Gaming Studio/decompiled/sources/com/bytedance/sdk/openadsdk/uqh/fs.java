package com.bytedance.sdk.openadsdk.uqh;

import com.safedk.android.internal.partials.PangleNetworkBridge;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public interface fs {
    public static final zmn<JSONObject> zmn = new zmn<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.uqh.fs.1
        @Override // com.bytedance.sdk.openadsdk.uqh.fs.zmn
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public JSONObject fs(String str) {
            try {
                return PangleNetworkBridge.jsonObjectInit(str);
            } catch (Exception unused) {
                return null;
            }
        }
    };

    public interface zmn<T> {
        T fs(String str);
    }
}
