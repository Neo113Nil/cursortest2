package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.embedapplog.IDefaultEncrypt;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class bjh implements IDefaultEncrypt {
    private final PangleEncryptConstant.CryptDataScene zmn;

    public bjh(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        this.zmn = cryptDataScene;
    }

    @Override // com.bytedance.sdk.component.embedapplog.IDefaultEncrypt
    public JSONObject encrypt(JSONObject jSONObject, int i) {
        rp.zmn(1, this.zmn, i);
        return com.bytedance.sdk.component.utils.zmn.zmn(jSONObject);
    }
}
