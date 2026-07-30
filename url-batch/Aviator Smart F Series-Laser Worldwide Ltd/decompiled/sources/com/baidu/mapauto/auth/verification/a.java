package com.baidu.mapauto.auth.verification;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.baidu.mapauto.auth.AuthCore;
import com.baidu.mapauto.auth.util.LogUtil;
import com.baidu.mapauto.auth.util.RSAUtil;
import java.security.PrivateKey;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a extends com.baidu.mapauto.auth.base.a<com.baidu.mapauto.auth.proxy.a> {
    public a(int i8, AuthCore.AuthParam authParam, com.baidu.mapauto.auth.proxy.a aVar) {
        super(i8, authParam, aVar);
    }

    @Override // com.baidu.mapauto.auth.base.c
    public final boolean a(int i8, AuthCore.AuthParam authParam, Object obj) {
        LogUtil logUtil;
        String str;
        com.baidu.mapauto.auth.proxy.a aVar = (com.baidu.mapauto.auth.proxy.a) obj;
        LogUtil.getInstance().i("a", "开始检验设备");
        String e8 = authParam.e();
        JSONObject jSONObject = aVar.f7880a;
        if (!TextUtils.equals(e8, jSONObject == null ? null : jSONObject.optString(NotificationCompat.CATEGORY_SERVICE))) {
            LogUtil.getInstance().e("a", "校验签名失败: 服务名不一致");
            return false;
        }
        String c8 = authParam.c();
        JSONObject jSONObject2 = aVar.f7880a;
        if (!TextUtils.equals(c8, jSONObject2 == null ? null : jSONObject2.optString("channel"))) {
            LogUtil.getInstance().e("a", "校验签名失败: 渠道不一致");
            return false;
        }
        if (i8 == 0) {
            Object obj2 = authParam.get("private_key");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (TextUtils.isEmpty(str2)) {
                LogUtil.getInstance().e("a", "校验签名失败: 本地私钥为空");
                return false;
            }
            PrivateKey privateKeyFrom16 = RSAUtil.getPrivateKeyFrom16(str2);
            JSONObject jSONObject3 = aVar.f7880a;
            byte[] decryptHexStringBySec = RSAUtil.decryptHexStringBySec(jSONObject3 == null ? null : jSONObject3.optString("ak"), privateKeyFrom16);
            JSONObject jSONObject4 = aVar.f7880a;
            byte[] decryptHexStringBySec2 = RSAUtil.decryptHexStringBySec(jSONObject4 != null ? jSONObject4.optString("device_id") : null, privateKeyFrom16);
            if (decryptHexStringBySec == null) {
                logUtil = LogUtil.getInstance();
                str = "校验签名失败: 解析 ak 失败";
            } else if (decryptHexStringBySec2 == null) {
                logUtil = LogUtil.getInstance();
                str = "校验签名失败: 解析 deviceId 失败";
            } else if (!new String(decryptHexStringBySec).equals(authParam.b())) {
                logUtil = LogUtil.getInstance();
                str = "校验签名失败: ak 不一致";
            } else if (!new String(decryptHexStringBySec2).equals(authParam.d())) {
                logUtil = LogUtil.getInstance();
                str = "校验签名失败: deviceId 不一致";
            }
            logUtil.e("a", str);
            return false;
        }
        LogUtil.getInstance().i("a", "设备校验通过");
        return true;
    }
}
