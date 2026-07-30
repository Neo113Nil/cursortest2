package com.baidu.mshield.x0.i;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.mshield.b.a.g;
import com.baidu.mshield.b.f.e;
import com.baidu.mshield.x0.EngineImpl;
import com.baidu.mshield.x0.d.d;
import com.baidu.mshield.x6.f.f;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.my.lib.data.ErrorCode;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a extends com.baidu.mshield.b.d.a {

    /* renamed from: c, reason: collision with root package name */
    public b f8475c;

    public a(Context context, Handler handler) {
        super(context, handler);
        this.f8316b = context;
        this.f8475c = b.a(context);
    }

    public HashMap<String, String> b() {
        HashMap<String, String> hashMap;
        String str;
        String str2;
        HashMap<String, String> hashMap2 = new HashMap<>();
        String str3 = "";
        try {
            byte[] d8 = d.d();
            try {
                str = this.f8475c.a(URLEncoder.encode(Base64.encodeToString(com.baidu.mshield.b.f.d.d(d8, e.a(com.baidu.mshield.utility.c.b(this.f8316b)).getBytes()), 0)));
            } catch (Throwable th) {
                d.a(th);
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                try {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    com.baidu.mshield.x0.l.a aVar = new com.baidu.mshield.x0.l.a(this.f8316b);
                    jSONObject2.put("so", aVar.p());
                    jSONObject.put("jwl", jSONObject2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    String c8 = aVar.c("plc114");
                    String str4 = str;
                    if (TextUtils.isEmpty(c8)) {
                        jSONObject4.put("4", "0");
                        jSONObject4.put(ErrorCode.PARAMETER_ERROR, "0");
                        jSONObject4.put("6", "0");
                    } else {
                        JSONObject jSONObject5 = new JSONObject(c8);
                        if (jSONObject5.has(ErrorCode.PARAMETER_ERROR) && jSONObject5.optJSONObject(ErrorCode.PARAMETER_ERROR).has("uv6")) {
                            String optString = jSONObject5.optJSONObject(ErrorCode.PARAMETER_ERROR).optJSONObject("uv6").optString("4", "");
                            String optString2 = jSONObject5.optJSONObject(ErrorCode.PARAMETER_ERROR).optJSONObject("uv6").optString(ErrorCode.PARAMETER_ERROR, "");
                            String optString3 = jSONObject5.optJSONObject(ErrorCode.PARAMETER_ERROR).optJSONObject("uv6").optString("6", "");
                            jSONObject4.put("4", optString);
                            jSONObject4.put(ErrorCode.PARAMETER_ERROR, optString2);
                            jSONObject4.put("6", optString3);
                        }
                    }
                    jSONObject3.put("uv6", jSONObject4);
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("4", "");
                    String c9 = aVar.c("plc115");
                    if (!TextUtils.isEmpty(c9)) {
                        JSONObject optJSONObject = new JSONObject(c9).optJSONObject(ErrorCode.PARAMETER_ERROR);
                        if (optJSONObject.has("uv4") && optJSONObject.optJSONObject("uv4").has("4")) {
                            jSONObject6.put("4", optJSONObject.optJSONObject("uv4").optString("4"));
                        }
                    }
                    jSONObject3.put("uv4", jSONObject6);
                    jSONObject.put("sec", jSONObject3);
                    try {
                        String y7 = new com.baidu.mshield.x6.b.b(this.f8316b).y();
                        if (!TextUtils.isEmpty(y7)) {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("ver", y7);
                            jSONObject.put("sig", jSONObject7);
                        }
                    } catch (Throwable th2) {
                        d.a(th2);
                    }
                    try {
                        com.baidu.mshield.x6.b.b bVar = new com.baidu.mshield.x6.b.b(this.f8316b);
                        JSONObject jSONObject8 = new JSONObject();
                        jSONObject8.put("1", bVar.x());
                        String L = bVar.L();
                        if (TextUtils.isEmpty(L)) {
                            String a8 = g.a(this.f8316b);
                            com.baidu.mshield.b.c.a.b(" manufacturer: " + a8.toLowerCase());
                            if (!TextUtils.isEmpty(a8)) {
                                L = e.a(a8.toLowerCase());
                                bVar.l(L);
                            }
                        }
                        jSONObject8.put("2", L);
                        String M = bVar.M();
                        if (TextUtils.isEmpty(M)) {
                            String propertyByType = EngineImpl.getInstance(this.f8316b).getPropertyByType("mod");
                            com.baidu.mshield.b.c.a.b(" model: " + propertyByType.toLowerCase());
                            if (!TextUtils.isEmpty(propertyByType)) {
                                M = e.a(propertyByType.toLowerCase());
                                bVar.m(M);
                            }
                        }
                        jSONObject8.put(ExifInterface.GPS_MEASUREMENT_3D, M);
                        String s7 = bVar.s();
                        if (TextUtils.isEmpty(s7)) {
                            String lowerCase = Build.ID.toLowerCase();
                            com.baidu.mshield.b.c.a.b(" buildId: " + lowerCase);
                            s7 = e.a(lowerCase);
                            bVar.d(s7);
                        }
                        jSONObject8.put("4", s7);
                        String d9 = bVar.d();
                        if (TextUtils.isEmpty(d9)) {
                            String b8 = g.b(this.f8316b);
                            com.baidu.mshield.b.c.a.b(" romName: " + b8.toLowerCase());
                            if (!TextUtils.isEmpty(b8)) {
                                d9 = e.a(b8.toLowerCase());
                                bVar.t(d9);
                            }
                        }
                        jSONObject8.put(ErrorCode.PARAMETER_ERROR, d9);
                        String e8 = bVar.e();
                        if (TextUtils.isEmpty(e8)) {
                            String c10 = g.c(this.f8316b);
                            com.baidu.mshield.b.c.a.b(" romVersion: " + c10.toLowerCase());
                            if (!TextUtils.isEmpty(c10)) {
                                e8 = e.a(c10.toLowerCase());
                                bVar.u(e8);
                            }
                        }
                        jSONObject8.put("6", e8);
                        String t7 = bVar.t();
                        if (TextUtils.isEmpty(t7)) {
                            String propertyByType2 = EngineImpl.getInstance(this.f8316b).getPropertyByType("arv");
                            com.baidu.mshield.b.c.a.b(" romVersion: " + propertyByType2.toLowerCase());
                            if (!TextUtils.isEmpty(propertyByType2)) {
                                t7 = e.a(propertyByType2.toLowerCase());
                                bVar.e(t7);
                            }
                        }
                        jSONObject8.put("7", t7);
                        String d10 = f.d(this.f8316b);
                        if (TextUtils.isEmpty(d10)) {
                            jSONObject8.put("9", "");
                        } else {
                            try {
                                jSONObject8.put("9", new JSONObject(d10).optString("2", ""));
                            } catch (Throwable th3) {
                                d.a(th3);
                            }
                        }
                        jSONObject.put("f", jSONObject8);
                    } catch (Throwable th4) {
                        d.a(th4);
                    }
                    try {
                        jSONObject.put("prv", "1");
                        JSONObject jSONObject9 = new JSONObject();
                        jSONObject9.put("cu", d.i(this.f8316b));
                        jSONObject9.put("zi", com.baidu.mshield.utility.c.b(this.f8316b));
                        jSONObject9.put("cuw", new com.baidu.mshield.x6.b.c(this.f8316b).a());
                        jSONObject.put("ids", jSONObject9);
                    } catch (Throwable th5) {
                        d.a(th5);
                    }
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    String jSONObject10 = d.a(this.f8316b, "1044103", jSONArray).toString();
                    byte[] a9 = this.f8475c.a(d8, jSONObject10);
                    com.baidu.mshield.b.c.a.b("getPolicy: " + jSONObject10);
                    String a10 = a(str4, a9);
                    new com.baidu.mshield.x6.b.b(this.f8316b).a(System.currentTimeMillis(), !TextUtils.isEmpty(a10));
                    com.baidu.mshield.b.c.a.b("get policy r: " + a10);
                    if (TextUtils.isEmpty(a10)) {
                        return null;
                    }
                    try {
                        JSONObject jSONObject11 = new JSONObject(a10);
                        String optString4 = jSONObject11.optString("skey");
                        str3 = jSONObject11.optString("data");
                        str2 = new String(com.baidu.mshield.b.a.c.b(com.baidu.mshield.b.f.d.a(Base64.decode(str3.getBytes(), 0), com.baidu.mshield.b.f.d.c(Base64.decode(optString4.getBytes(), 0), a().getBytes()))));
                    } catch (Throwable th6) {
                        d.a(th6);
                        str2 = str3;
                    }
                    if (TextUtils.isEmpty(str2)) {
                        return null;
                    }
                    com.baidu.mshield.b.c.a.b("policy d: " + str2);
                    hashMap2.put("url", str4);
                    hashMap2.put(FirebaseAnalytics.Param.SOURCE, a10);
                    hashMap2.put("decrpt", str2);
                    return hashMap2;
                } catch (Throwable th7) {
                    d.a(th7);
                    return null;
                }
            } catch (Throwable th8) {
                th = th8;
                hashMap = null;
                d.a(th);
                return hashMap;
            }
        } catch (Throwable th9) {
            th = th9;
            hashMap = null;
        }
    }
}
