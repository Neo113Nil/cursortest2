package com.bytedance.sdk.openadsdk.klz.zmn;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.fkt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class rc extends com.bytedance.sdk.component.zmn.fb<JSONObject, JSONObject> {
    private final fkt zmn;

    public rc(fkt fktVar) {
        this.zmn = fktVar;
    }

    public static void zmn(com.bytedance.sdk.component.zmn.cn cnVar, fkt fktVar) {
        cnVar.zmn("overlayRenderFinish", new rc(fktVar));
    }

    @Override // com.bytedance.sdk.component.zmn.fb
    @Nullable
    public JSONObject zmn(String str, @NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.zmn.btk btkVar) throws Exception {
        this.zmn.mw();
        return null;
    }
}
