package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.embedapplog.IDefaultEncrypt;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import org.json.JSONObject;

/* compiled from: PglDefaultEncryptType3.java */
/* loaded from: classes2.dex */
public class zM implements IDefaultEncrypt {
    private final PangleEncryptConstant.CryptDataScene pvs;

    public zM(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        this.pvs = cryptDataScene;
    }

    @Override // com.bytedance.sdk.component.embedapplog.IDefaultEncrypt
    public JSONObject encrypt(JSONObject jSONObject, int i) {
        uc.pvs(1, this.pvs, i);
        return com.bytedance.sdk.component.utils.pvs.pvs(jSONObject);
    }
}
