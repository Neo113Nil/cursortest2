package com.baidu.mapauto.auth.base;

import android.text.TextUtils;
import com.baidu.mapauto.auth.AuthCore;
import com.baidu.mapauto.auth.base.b;
import com.baidu.mapauto.auth.constant.ErrorCode;
import com.baidu.mapauto.auth.util.LogUtil;
import com.baidu.mapauto.auth.util.RSAUtil;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class BaseLicenseAuthDataStandardProcess<T extends b, Z> {

    /* renamed from: a, reason: collision with root package name */
    public final int f7731a;

    public static class ProcessException extends Exception {
        private Map<String, Integer> errors;
        private final int mCode;

        public ProcessException(int i8, String str) {
            super(str);
            this.mCode = i8;
        }

        public int getCode() {
            return this.mCode;
        }

        public Map<String, Integer> getErrors() {
            return this.errors;
        }

        public void setErrors(Map<String, Integer> map) {
            this.errors = map;
        }
    }

    public BaseLicenseAuthDataStandardProcess(int i8) {
        this.f7731a = i8;
    }

    public abstract T a(String str);

    public abstract ArrayList a(int i8, AuthCore.AuthParam authParam, b bVar);

    public abstract HashMap a(b bVar);

    public void a(AuthCore.AuthParam authParam, b bVar) {
    }

    public abstract String b(AuthCore.AuthParam authParam);

    public abstract boolean b(AuthCore.AuthParam authParam, T t7);

    public abstract com.baidu.mapauto.auth.net.b c(AuthCore.AuthParam authParam);

    public final Map<String, Integer> a(AuthCore.AuthParam authParam) {
        com.baidu.mapauto.auth.net.b bVar;
        int i8;
        Integer num;
        LogUtil logUtil;
        String str;
        if ((this.f7731a & 1) == 1) {
            LogUtil.getInstance().i("BaseLicenseAuthDataStandardProcess", "开始请求 license  服务 ==>");
            KeyPair generateKeyPair = RSAUtil.generateKeyPair();
            if (generateKeyPair == null) {
                logUtil = LogUtil.getInstance();
                str = "生成公私钥错误";
            } else {
                String publicKeyCS1Pem = RSAUtil.getPublicKeyCS1Pem(generateKeyPair.getPublic());
                if (publicKeyCS1Pem == null) {
                    logUtil = LogUtil.getInstance();
                    str = "生成公钥为空";
                } else {
                    authParam.put("public_key", publicKeyCS1Pem);
                    try {
                        authParam.put("private_key", RSAUtil.getPrivateKeyStr(generateKeyPair.getPrivate()));
                        int i9 = 1;
                        while (true) {
                            try {
                                bVar = c(authParam);
                            } catch (Exception e8) {
                                LogUtil.getInstance().e("BaseLicenseAuthDataStandardProcess", e8.toString());
                                com.baidu.mapauto.auth.net.b bVar2 = new com.baidu.mapauto.auth.net.b();
                                bVar2.f7746d = e8;
                                bVar = bVar2;
                            }
                            if (i9 >= 3 || (bVar != null && bVar.f7746d == null && (num = bVar.f7743a) != null && num.intValue() == 200 && !TextUtils.isEmpty(bVar.f7745c))) {
                                break;
                            }
                            try {
                                Thread.sleep(500L);
                            } catch (InterruptedException e9) {
                                LogUtil.getInstance().e("BaseLicenseAuthDataStandardProcess", e9.toString());
                            }
                            i9++;
                        }
                    } catch (Exception e10) {
                        LogUtil.getInstance().e("BaseLicenseAuthDataStandardProcess", e10.toString());
                    }
                    LogUtil.getInstance().i("BaseLicenseAuthDataStandardProcess", "<== license 服务返回结果:" + bVar);
                    i8 = 0;
                }
            }
            logUtil.i("BaseLicenseAuthDataStandardProcess", str);
            bVar = null;
            LogUtil.getInstance().i("BaseLicenseAuthDataStandardProcess", "<== license 服务返回结果:" + bVar);
            i8 = 0;
        } else {
            bVar = null;
            i8 = -1;
        }
        String str2 = bVar == null ? "" : bVar.f7745c;
        if (TextUtils.isEmpty(str2) && (this.f7731a & 2) == 2) {
            LogUtil.getInstance().i("BaseLicenseAuthDataStandardProcess", "尝试从本地缓存获取 ==>");
            str2 = b(authParam);
            LogUtil.getInstance().i("BaseLicenseAuthDataStandardProcess", "<== 本地缓存服务返回结果:" + str2);
            i8 = 1;
        }
        if (i8 == -1) {
            return new HashMap(0);
        }
        if (TextUtils.isEmpty(str2)) {
            if ((this.f7731a & 1) != 1) {
                throw new ProcessException(ErrorCode.CODE_MULTI_FUNC_ERROR, "获取本地数据异常，本地无License文件");
            }
            if (bVar == null) {
                throw new ProcessException(-1001, "获取数据异常");
            }
            Exception exc = bVar.f7746d;
            if (exc instanceof SocketTimeoutException) {
                throw new ProcessException(-1004, "网络超时");
            }
            if ((exc instanceof HttpRetryException) || (exc instanceof MalformedURLException) || (exc instanceof ProtocolException) || (exc instanceof URISyntaxException) || (exc instanceof SocketException)) {
                throw new ProcessException(-1003, "网络链接异常");
            }
            if ((exc instanceof UnknownHostException) || (exc instanceof UnknownServiceException)) {
                throw new ProcessException(ErrorCode.CODE_SERVER_ERROR, "服务异常");
            }
            throw new ProcessException(-1000, "网络未知异常");
        }
        T a8 = a(str2);
        JSONObject jSONObject = a8.f7736b;
        if (jSONObject == null) {
            throw new ProcessException(-1001, a(bVar, "license 数据解析错误"));
        }
        if (jSONObject == null || jSONObject.optInt("status", -1) != 0) {
            JSONObject jSONObject2 = a8.f7736b;
            int optInt = jSONObject2 != null ? jSONObject2.optInt("status", -1) : -1;
            JSONObject jSONObject3 = a8.f7736b;
            String optString = jSONObject3 != null ? jSONObject3.optString("message") : null;
            if (TextUtils.isEmpty(optString)) {
                optString = "license 数据服务错误";
            }
            throw new ProcessException(optInt, a(bVar, optString));
        }
        LogUtil.getInstance().i("BaseLicenseAuthDataStandardProcess", "开始校验 license 数据");
        ArrayList<a> a9 = a(i8, authParam, a8);
        if (a9 != null && !a9.isEmpty()) {
            for (a aVar : a9) {
                int i10 = aVar.f7732a;
                AuthCore.AuthParam authParam2 = aVar.f7733b;
                T t7 = aVar.f7734c;
                if ((i10 != 0 && i10 != 1) || authParam2 == null || t7 == 0 || !aVar.a(i10, authParam2, t7)) {
                    throw new ProcessException(ErrorCode.CODE_CHECK_SIGN_ERROR, a(bVar, "license 校验失败"));
                }
            }
        }
        LogUtil.getInstance().i("BaseLicenseAuthDataStandardProcess", "校验 license 数据完成");
        if (i8 == 0) {
            LogUtil.getInstance().i("BaseLicenseAuthDataStandardProcess", "更新本地 license 缓存");
            b(authParam, a8);
        }
        LogUtil.getInstance().i("BaseLicenseAuthDataStandardProcess", "数据通过接入点开始");
        a(authParam, a8);
        LogUtil.getInstance().i("BaseLicenseAuthDataStandardProcess", "数据通过接入点结束");
        return a(a8);
    }

    public static String a(com.baidu.mapauto.auth.net.b bVar, String str) {
        Integer num;
        if (bVar == null || (num = bVar.f7743a) == null || num.intValue() == 200) {
            return str;
        }
        return "(" + num + ")" + str;
    }
}
