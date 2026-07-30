package com.baidu.mapauto.auth.process;

import android.content.SharedPreferences;
import android.text.TextUtils;
import cn.hutool.core.util.g1;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapauto.auth.AuthCore;
import com.baidu.mapauto.auth.base.BaseLicenseAuthDataStandardProcess;
import com.baidu.mapauto.auth.base.d;
import com.baidu.mapauto.auth.constant.ErrorCode;
import com.baidu.mapauto.auth.util.AESECBPKCS5PaddingUtil;
import com.baidu.mapauto.auth.util.RSAUtil;
import com.liulishuo.filedownloader.services.f;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a extends BaseLicenseAuthDataStandardProcess<com.baidu.mapauto.auth.proxy.b, com.baidu.mapauto.auth.proxy.a> {

    /* renamed from: b, reason: collision with root package name */
    public final com.baidu.mapauto.auth.data.license.impl.a f7876b;

    /* renamed from: c, reason: collision with root package name */
    public final com.baidu.mapauto.auth.data.license.impl.b f7877c;

    public a(int i8, com.baidu.mapauto.auth.data.license.impl.a aVar, com.baidu.mapauto.auth.data.license.impl.b bVar) {
        super(i8);
        this.f7876b = aVar;
        this.f7877c = bVar;
    }

    @Override // com.baidu.mapauto.auth.base.BaseLicenseAuthDataStandardProcess
    public final com.baidu.mapauto.auth.proxy.b a(String str) {
        return new com.baidu.mapauto.auth.proxy.b(str);
    }

    @Override // com.baidu.mapauto.auth.base.BaseLicenseAuthDataStandardProcess
    public final com.baidu.mapauto.auth.net.b c(AuthCore.AuthParam authParam) {
        com.baidu.mapauto.auth.data.license.impl.a aVar = this.f7876b;
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
                hashMap.put("device_id", RSAUtil.encryptToHexStringPub(d8, publicKeyFromPemString));
                if (!TextUtils.isEmpty(str2)) {
                    hashMap.put("function_name", str2);
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
                return ((com.baidu.mapauto.auth.net.a) aVar2).a("/license/device/file", hashMap);
            }
        }
        return null;
    }

    @Override // com.baidu.mapauto.auth.base.BaseLicenseAuthDataStandardProcess
    public final void a(AuthCore.AuthParam authParam, com.baidu.mapauto.auth.base.b bVar) {
        com.baidu.mapauto.auth.proxy.b bVar2 = (com.baidu.mapauto.auth.proxy.b) bVar;
        JSONObject jSONObject = bVar2.f7736b;
        JSONArray optJSONArray = jSONObject == null ? null : jSONObject.optJSONArray(g1.URL_PROTOCOL_FILE);
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            JSONObject jSONObject2 = bVar2.f7736b;
            JSONArray optJSONArray2 = jSONObject2 == null ? null : jSONObject2.optJSONArray("errors");
            if (optJSONArray2 == null) {
                return;
            }
            int length = optJSONArray2.length();
            if (length == 1) {
                JSONObject optJSONObject = optJSONArray2.optJSONObject(0);
                Integer valueOf = optJSONObject == null ? null : Integer.valueOf(optJSONObject.optInt(SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE));
                if (valueOf == null || valueOf.intValue() == 0) {
                    return;
                }
                String optString = optJSONObject != null ? optJSONObject.optString("error_msg") : null;
                if (TextUtils.isEmpty(optString)) {
                    optString = "没有权限";
                }
                throw new BaseLicenseAuthDataStandardProcess.ProcessException(valueOf.intValue(), optString);
            }
            if (length > 1) {
                Object obj = authParam.get("function_name");
                if (TextUtils.isEmpty(obj instanceof String ? (String) obj : null)) {
                    HashMap hashMap = new HashMap();
                    for (int i8 = 0; i8 < length; i8++) {
                        JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i8);
                        hashMap.put(optJSONObject2 == null ? null : optJSONObject2.optString("function"), optJSONObject2 == null ? null : Integer.valueOf(optJSONObject2.optInt(SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE)));
                    }
                    BaseLicenseAuthDataStandardProcess.ProcessException processException = new BaseLicenseAuthDataStandardProcess.ProcessException(ErrorCode.CODE_MULTI_FUNC_ERROR, "所申请一个或多个LICENSE授权错误");
                    processException.setErrors(hashMap);
                    throw processException;
                }
            }
        }
    }

    @Override // com.baidu.mapauto.auth.base.BaseLicenseAuthDataStandardProcess
    public final String b(AuthCore.AuthParam authParam) {
        d dVar;
        com.baidu.mapauto.auth.data.license.impl.b bVar = this.f7877c;
        if (bVar == null) {
            return null;
        }
        String e8 = authParam.e();
        if (TextUtils.isEmpty(bVar.f7739b) || (dVar = bVar.f7738a) == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("license_file");
        if (!TextUtils.isEmpty(e8)) {
            sb.append("_");
            sb.append(e8);
        }
        if (!TextUtils.isEmpty(null)) {
            sb.append("_");
            sb.append((String) null);
        }
        String sb2 = sb.toString();
        SharedPreferences sharedPreferences = ((com.baidu.mapauto.auth.store.a) dVar).f7882a;
        return AESECBPKCS5PaddingUtil.decrypt(sharedPreferences != null ? sharedPreferences.getString(sb2, "") : "", bVar.f7739b);
    }

    @Override // com.baidu.mapauto.auth.base.BaseLicenseAuthDataStandardProcess
    public final ArrayList a(int i8, AuthCore.AuthParam authParam, com.baidu.mapauto.auth.base.b bVar) {
        JSONObject jSONObject = ((com.baidu.mapauto.auth.proxy.b) bVar).f7736b;
        JSONArray optJSONArray = jSONObject == null ? null : jSONObject.optJSONArray(g1.URL_PROTOCOL_FILE);
        if (optJSONArray == null) {
            return new ArrayList(0);
        }
        int length = optJSONArray.length();
        ArrayList arrayList = new ArrayList((length * 2) + 1);
        for (int i9 = 0; i9 < length; i9++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i9);
            if (optJSONObject != null) {
                com.baidu.mapauto.auth.proxy.a aVar = new com.baidu.mapauto.auth.proxy.a(optJSONObject);
                arrayList.add(new com.baidu.mapauto.auth.verification.a(i8, authParam, aVar));
                arrayList.add(new com.baidu.mapauto.auth.verification.b(i8, authParam, aVar));
            }
        }
        return arrayList;
    }

    @Override // com.baidu.mapauto.auth.base.BaseLicenseAuthDataStandardProcess
    public final HashMap a(com.baidu.mapauto.auth.base.b bVar) {
        JSONObject jSONObject = ((com.baidu.mapauto.auth.proxy.b) bVar).f7736b;
        JSONArray optJSONArray = jSONObject == null ? null : jSONObject.optJSONArray(g1.URL_PROTOCOL_FILE);
        if (optJSONArray == null) {
            return new HashMap(0);
        }
        int length = optJSONArray.length();
        HashMap hashMap = new HashMap(length);
        for (int i8 = 0; i8 < length; i8++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i8);
            String optString = optJSONObject == null ? null : optJSONObject.optString("function");
            Integer valueOf = optJSONObject == null ? null : Integer.valueOf(optJSONObject.optInt("status"));
            if (!TextUtils.isEmpty(optString) && valueOf != null) {
                hashMap.put(optString, Integer.valueOf(valueOf.intValue() == 0 ? 0 : 1));
            }
        }
        return hashMap;
    }

    @Override // com.baidu.mapauto.auth.base.BaseLicenseAuthDataStandardProcess
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean b(AuthCore.AuthParam authParam, com.baidu.mapauto.auth.proxy.b bVar) {
        String str;
        JSONObject jSONObject;
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        JSONObject jSONObject2;
        boolean z7;
        d dVar;
        com.baidu.mapauto.auth.data.license.impl.b bVar2 = this.f7877c;
        if (bVar2 == null) {
            return false;
        }
        String e8 = authParam.e();
        str = "";
        if (!TextUtils.isEmpty(bVar2.f7739b) && (dVar = bVar2.f7738a) != null) {
            StringBuilder sb = new StringBuilder("license_file");
            if (!TextUtils.isEmpty(e8)) {
                sb.append("_");
                sb.append(e8);
            }
            if (!TextUtils.isEmpty(null)) {
                sb.append("_");
                sb.append((String) null);
            }
            String sb2 = sb.toString();
            SharedPreferences sharedPreferences = ((com.baidu.mapauto.auth.store.a) dVar).f7882a;
            str = AESECBPKCS5PaddingUtil.decrypt(sharedPreferences != null ? sharedPreferences.getString(sb2, "") : "", bVar2.f7739b);
        }
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
                jSONObject = null;
            }
            JSONObject jSONObject3 = bVar.f7736b;
            if (jSONObject3 != null && jSONObject != null && (optJSONArray = jSONObject3.optJSONArray(g1.URL_PROTOCOL_FILE)) != null && optJSONArray.length() > 0 && (optJSONArray2 = jSONObject.optJSONArray(g1.URL_PROTOCOL_FILE)) != null && optJSONArray2.length() > 0) {
                try {
                    JSONObject jSONObject4 = bVar.f7736b;
                    try {
                        int length = optJSONArray.length();
                        for (int i8 = 0; i8 < optJSONArray2.length(); i8++) {
                            String optString = optJSONArray2.getJSONObject(i8).optString("function");
                            int i9 = 0;
                            while (true) {
                                if (i9 >= length) {
                                    jSONObject2 = null;
                                    z7 = false;
                                    break;
                                }
                                if (!optJSONArray.getJSONObject(i9).optString("function").equals(optString)) {
                                    jSONObject2 = optJSONArray2.getJSONObject(i8);
                                    z7 = true;
                                    break;
                                }
                                i9++;
                            }
                            if (z7 && jSONObject2 != null) {
                                optJSONArray.put(jSONObject2);
                            }
                        }
                    } catch (JSONException unused2) {
                    }
                    jSONObject4.put(g1.URL_PROTOCOL_FILE, optJSONArray);
                    bVar.f7735a = bVar.f7736b.toString();
                } catch (JSONException unused3) {
                }
            }
        }
        String e9 = authParam.e();
        String str2 = bVar.f7735a;
        if (!TextUtils.isEmpty(bVar2.f7739b) && bVar2.f7738a != null) {
            if (!TextUtils.isEmpty(str2)) {
                str2 = AESECBPKCS5PaddingUtil.encrypt(str2, bVar2.f7739b);
            }
            d dVar2 = bVar2.f7738a;
            StringBuilder sb3 = new StringBuilder("license_file");
            if (!TextUtils.isEmpty(e9)) {
                sb3.append("_");
                sb3.append(e9);
            }
            if (!TextUtils.isEmpty(null)) {
                sb3.append("_");
                sb3.append((String) null);
            }
            String sb4 = sb3.toString();
            SharedPreferences.Editor editor = ((com.baidu.mapauto.auth.store.a) dVar2).f7883b;
            if (editor != null) {
                return editor.putString(sb4, str2).commit();
            }
        }
        return false;
    }
}
