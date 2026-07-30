package com.baidu.mapauto.auth.process;

import android.content.SharedPreferences;
import android.text.TextUtils;
import cn.hutool.core.util.g1;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.mapauto.auth.AuthCore;
import com.baidu.mapauto.auth.base.BaseLicenseAuthDataStandardProcess;
import com.baidu.mapauto.auth.proxy.c;
import com.baidu.mapauto.auth.proxy.d;
import com.baidu.mapauto.auth.util.AESECBPKCS5PaddingUtil;
import com.baidu.mapauto.auth.util.RSAUtil;
import com.liulishuo.filedownloader.services.f;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b extends BaseLicenseAuthDataStandardProcess<d, c> {

    /* renamed from: b, reason: collision with root package name */
    public final com.baidu.mapauto.auth.data.license.impl.a f7878b;

    /* renamed from: c, reason: collision with root package name */
    public final com.baidu.mapauto.auth.data.license.impl.b f7879c;

    public b(int i8, com.baidu.mapauto.auth.data.license.impl.a aVar, com.baidu.mapauto.auth.data.license.impl.b bVar) {
        super(i8);
        this.f7878b = aVar;
        this.f7879c = bVar;
    }

    @Override // com.baidu.mapauto.auth.base.BaseLicenseAuthDataStandardProcess
    public final d a(String str) {
        return new d(str);
    }

    @Override // com.baidu.mapauto.auth.base.BaseLicenseAuthDataStandardProcess
    public final com.baidu.mapauto.auth.net.b c(AuthCore.AuthParam authParam) {
        com.baidu.mapauto.auth.data.license.impl.a aVar = this.f7878b;
        if (aVar == null) {
            return null;
        }
        String b8 = authParam.b();
        String c8 = authParam.c();
        String e8 = authParam.e();
        Object obj = authParam.get("public_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = authParam.get("function_name");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        String d8 = authParam.d();
        Object obj3 = authParam.get(AuthCore.AuthParam.KEY_EXTRA_OS_VERSION);
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = authParam.get(AuthCore.AuthParam.KEY_EXTRA_MODEL);
        String str4 = obj4 instanceof String ? (String) obj4 : null;
        Object obj5 = authParam.get(AuthCore.AuthParam.KEY_EXTRA_MODE);
        String str5 = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = authParam.get(AuthCore.AuthParam.KEY_EXTRA_APP_VERSION);
        String str6 = obj6 instanceof String ? (String) obj6 : null;
        Object obj7 = authParam.get(AuthCore.AuthParam.KEY_EXTRA_CUID);
        String str7 = obj7 instanceof String ? (String) obj7 : null;
        Object obj8 = authParam.get(HttpConstants.SDK_VERSION_NAME);
        String str8 = obj8 instanceof String ? (String) obj8 : null;
        int intValue = authParam.get("need_active") == null ? 1 : ((Integer) authParam.get("need_active")).intValue();
        Object obj9 = authParam.get(HttpConstants.SDK_VERSION_CODE);
        if (obj9 instanceof Integer) {
            ((Integer) obj9).intValue();
        }
        com.baidu.mapauto.auth.net.base.a aVar2 = aVar.f7737a;
        if (aVar2 != null) {
            HashMap hashMap = new HashMap(13);
            PublicKey publicKeyFromPemString = RSAUtil.getPublicKeyFromPemString("MIIBCgKCAQEAz4ZBbWFih8n59i6cwKDW9aBQqMstCa0LgmkArRZ2WZgDLXFo9BBZAmcLqdgDUzm8yV7fB8isBDruyC3ADKSvWyJt5xQBGFiMkuEKvvnmbT4WEotwUu9Id3Xt0tPzefSixulhQ4UcaBNzPs2bU+1pphbsr2Rv4PdpMs66jZ8r5UF4H6fwAQwqRmhTKhSvkLvkhQ1nyxel/98nszHZRgKXTLv1EPafr290WJo24G+f6kEvGfK+gN87WCat8ftRZL7zeZSNLMDA5oqfjRKMZYg9eg6k0JWnAqUcY1MsLrQw7tFPkLlEVpd8rigfq0zPNZRrf1xdTCcnofpGD+WAH2nTIwIDAQAB", false);
            if (publicKeyFromPemString != null) {
                hashMap.put("ak", RSAUtil.encryptToHexStringPub(b8, publicKeyFromPemString));
                hashMap.put("channel", c8);
                hashMap.put("service_name", e8);
                hashMap.put("pk", str);
                if (!TextUtils.isEmpty(str2)) {
                    hashMap.put("function_name", str2);
                }
                if (!TextUtils.isEmpty(d8)) {
                    hashMap.put("device_id", RSAUtil.encryptToHexStringPub(d8, publicKeyFromPemString));
                }
                if (!TextUtils.isEmpty(str3)) {
                    hashMap.put(HttpConstants.OS_VERSION, str3);
                }
                if (!TextUtils.isEmpty(str5)) {
                    hashMap.put("mode", str5);
                }
                if (!TextUtils.isEmpty(str4)) {
                    hashMap.put(f.KEY_MODEL, str4);
                }
                if (!TextUtils.isEmpty(str6)) {
                    hashMap.put(HttpConstants.APP_VERSION, str6);
                }
                if (!TextUtils.isEmpty(str7)) {
                    hashMap.put("cuid", str7);
                }
                if (!TextUtils.isEmpty(str8)) {
                    hashMap.put("sdk_version", str8);
                }
                hashMap.put("need_active", Integer.valueOf(intValue));
                return ((com.baidu.mapauto.auth.net.a) aVar2).a("/license/permission/verify", hashMap);
            }
        }
        return null;
    }

    @Override // com.baidu.mapauto.auth.base.BaseLicenseAuthDataStandardProcess
    public final ArrayList a(int i8, AuthCore.AuthParam authParam, com.baidu.mapauto.auth.base.b bVar) {
        ArrayList arrayList = new ArrayList(2);
        JSONObject jSONObject = ((d) bVar).f7736b;
        c cVar = new c(jSONObject == null ? null : jSONObject.optJSONObject(g1.URL_PROTOCOL_FILE));
        arrayList.add(new com.baidu.mapauto.auth.verification.d(i8, authParam, cVar));
        arrayList.add(new com.baidu.mapauto.auth.verification.c(i8, authParam, cVar));
        return arrayList;
    }

    @Override // com.baidu.mapauto.auth.base.BaseLicenseAuthDataStandardProcess
    public final String b(AuthCore.AuthParam authParam) {
        com.baidu.mapauto.auth.base.d dVar;
        com.baidu.mapauto.auth.data.license.impl.b bVar = this.f7879c;
        if (bVar == null) {
            return null;
        }
        String e8 = authParam.e();
        if (TextUtils.isEmpty(bVar.f7739b) || (dVar = bVar.f7738a) == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("license_function");
        if (!TextUtils.isEmpty(e8)) {
            sb.append("_");
            sb.append(e8);
        }
        String sb2 = sb.toString();
        SharedPreferences sharedPreferences = ((com.baidu.mapauto.auth.store.a) dVar).f7882a;
        return AESECBPKCS5PaddingUtil.decrypt(sharedPreferences != null ? sharedPreferences.getString(sb2, "") : "", bVar.f7739b);
    }

    @Override // com.baidu.mapauto.auth.base.BaseLicenseAuthDataStandardProcess
    public final HashMap a(com.baidu.mapauto.auth.base.b bVar) {
        JSONObject jSONObject = ((d) bVar).f7736b;
        JSONObject optJSONObject = jSONObject == null ? null : jSONObject.optJSONObject(g1.URL_PROTOCOL_FILE);
        if (optJSONObject == null) {
            return new HashMap(0);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("functions");
        if (optJSONArray == null) {
            return new HashMap(0);
        }
        int length = optJSONArray.length();
        HashMap hashMap = new HashMap(length);
        for (int i8 = 0; i8 < length; i8++) {
            String optString = optJSONArray.optString(i8);
            if (!TextUtils.isEmpty(optString)) {
                hashMap.put(optString, 0);
            }
        }
        return hashMap;
    }

    @Override // com.baidu.mapauto.auth.base.BaseLicenseAuthDataStandardProcess
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean b(AuthCore.AuthParam authParam, d dVar) {
        com.baidu.mapauto.auth.data.license.impl.b bVar = this.f7879c;
        if (bVar == null) {
            return false;
        }
        String e8 = authParam.e();
        String str = dVar.f7735a;
        if (TextUtils.isEmpty(bVar.f7739b) || bVar.f7738a == null) {
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            str = AESECBPKCS5PaddingUtil.encrypt(str, bVar.f7739b);
        }
        com.baidu.mapauto.auth.base.d dVar2 = bVar.f7738a;
        StringBuilder sb = new StringBuilder("license_function");
        if (!TextUtils.isEmpty(e8)) {
            sb.append("_");
            sb.append(e8);
        }
        String sb2 = sb.toString();
        SharedPreferences.Editor editor = ((com.baidu.mapauto.auth.store.a) dVar2).f7883b;
        if (editor == null) {
            return false;
        }
        return editor.putString(sb2, str).commit();
    }
}
