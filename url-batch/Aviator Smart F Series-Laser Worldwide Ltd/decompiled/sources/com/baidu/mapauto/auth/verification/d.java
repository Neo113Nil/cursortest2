package com.baidu.mapauto.auth.verification;

import android.text.TextUtils;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.mapauto.auth.AuthCore;
import com.baidu.mapauto.auth.util.LogUtil;
import com.baidu.mapauto.auth.util.RSAUtil;
import java.security.PublicKey;
import java.util.Iterator;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d extends com.baidu.mapauto.auth.base.a<com.baidu.mapauto.auth.proxy.c> {
    public d(int i8, AuthCore.AuthParam authParam, com.baidu.mapauto.auth.proxy.c cVar) {
        super(i8, authParam, cVar);
    }

    @Override // com.baidu.mapauto.auth.base.c
    public final /* bridge */ /* synthetic */ boolean a(int i8, AuthCore.AuthParam authParam, Object obj) {
        return a(authParam, (com.baidu.mapauto.auth.proxy.c) obj);
    }

    public final boolean a(AuthCore.AuthParam authParam, com.baidu.mapauto.auth.proxy.c cVar) {
        Object opt;
        LogUtil.getInstance().i("d", "开始检验 sign");
        JSONObject jSONObject = cVar.f7881a;
        boolean z7 = false;
        if (jSONObject == null) {
            LogUtil.getInstance().e("d", "校验签名失败: 验签结果为空");
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        TreeSet treeSet = new TreeSet();
        while (keys.hasNext()) {
            treeSet.add(keys.next());
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!"pub_key".equals(str) && !HttpConstants.SIGN.equals(str) && (opt = jSONObject.opt(str)) != null) {
                if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    int length = jSONArray.length();
                    for (int i8 = 0; i8 < length; i8++) {
                        String optString = jSONArray.optString(i8);
                        if (!TextUtils.isEmpty(optString)) {
                            sb.append(optString);
                        }
                    }
                } else {
                    sb.append(opt);
                }
            }
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2)) {
            LogUtil.getInstance().e("d", "校验签名失败: sign 原数据为空");
            return false;
        }
        try {
            JSONObject jSONObject2 = cVar.f7881a;
            PublicKey publicKeyFromPemString = RSAUtil.getPublicKeyFromPemString(jSONObject2 == null ? null : jSONObject2.optString("pub_key"), false);
            JSONObject jSONObject3 = cVar.f7881a;
            z7 = RSAUtil.verify(sb2, publicKeyFromPemString, jSONObject3 == null ? null : jSONObject3.optString(HttpConstants.SIGN));
        } catch (Exception e8) {
            LogUtil.getInstance().e("d", e8.toString());
        }
        LogUtil logUtil = LogUtil.getInstance();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("校验签名结束: source: ");
        sb3.append(sb2);
        sb3.append(", pubKey: ");
        JSONObject jSONObject4 = cVar.f7881a;
        sb3.append(jSONObject4 == null ? null : jSONObject4.optString("pub_key"));
        sb3.append(", sign: ");
        JSONObject jSONObject5 = cVar.f7881a;
        sb3.append(jSONObject5 != null ? jSONObject5.optString(HttpConstants.SIGN) : null);
        sb3.append(" => 校验结果: ");
        sb3.append(z7);
        logUtil.i("d", sb3.toString());
        return z7;
    }
}
