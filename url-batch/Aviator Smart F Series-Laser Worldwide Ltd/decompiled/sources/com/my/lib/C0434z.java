package com.my.lib;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.my.lib.C0434z;
import com.my.lib.data.ErrorCode;
import com.my.lib.data.Order;
import com.my.lib.data.SubscriptionInfo;
import com.my.lib.data.SubscriptionProduct;
import com.my.lib.data.TimeoutConfig;
import com.my.lib.data.WatchInfo;
import com.my.lib.enums.LicenseModel;
import com.my.lib.enums.PaymentModel;
import com.my.lib.enums.Region;
import java.util.ArrayList;
import kotlin.collections.ArraysKt___ArraysKt;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.lib.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0434z {
    public static final y5.w a(f6.l lVar, int i8, String msg) {
        kotlin.jvm.internal.s.checkNotNullParameter(msg, "msg");
        if (i8 == 1) {
            AbstractC0409a.a(ErrorCode.TIME_OUT, msg, lVar);
        } else if (i8 != 2) {
            AbstractC0409a.a(ErrorCode.NO_ACCESS_SERVER, msg, lVar);
        } else {
            AbstractC0409a.a(ErrorCode.UNKNOWN_ERROR, msg, lVar);
        }
        return y5.w.INSTANCE;
    }

    public static final y5.w b(f6.l lVar, int i8, String msg) {
        kotlin.jvm.internal.s.checkNotNullParameter(msg, "msg");
        if (i8 == 1) {
            AbstractC0409a.a(ErrorCode.TIME_OUT, msg, lVar);
        } else if (i8 != 2) {
            AbstractC0409a.a(ErrorCode.NO_ACCESS_SERVER, msg, lVar);
        } else {
            AbstractC0409a.a(ErrorCode.UNKNOWN_ERROR, msg, lVar);
        }
        return y5.w.INSTANCE;
    }

    public static final y5.w c(f6.l lVar, int i8, String msg) {
        kotlin.jvm.internal.s.checkNotNullParameter(msg, "msg");
        if (i8 == 1) {
            AbstractC0409a.a(ErrorCode.TIME_OUT, msg, lVar);
        } else if (i8 != 2) {
            AbstractC0409a.a(ErrorCode.NO_ACCESS_SERVER, msg, lVar);
        } else {
            AbstractC0409a.a(ErrorCode.UNKNOWN_ERROR, msg, lVar);
        }
        return y5.w.INSTANCE;
    }

    public static final y5.w b(f6.l lVar, f6.l lVar2, Response response) {
        kotlin.jvm.internal.s.checkNotNullParameter(response, "response");
        try {
            ResponseBody body = response.body();
            String string = body != null ? body.string() : null;
            B.a("onResponse: " + string);
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                int optInt = jSONObject.optInt("VzQn");
                if (optInt == 0) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("Wlgj");
                    ArrayList arrayList = new ArrayList();
                    JSONArray optJSONArray = jSONObject2.optJSONArray("lFOBuktcCAhyCAGWFPCK");
                    if (optJSONArray != null) {
                        int length = optJSONArray.length();
                        for (int i8 = 0; i8 < length; i8++) {
                            JSONObject optJSONObject = optJSONArray.optJSONObject(i8);
                            if (optJSONObject != null) {
                                arrayList.add(new SubscriptionProduct(optJSONObject.optInt("iCbmMVEFxMknR"), optJSONObject.optInt("iCbmMVEGHHX"), optJSONObject.optInt("iCbmMVEtAsWp"), optJSONObject.optInt("kpZjAgtapfnx"), optJSONObject.optLong("XIcrJXLg")));
                            }
                        }
                    }
                    lVar.invoke(arrayList);
                } else {
                    String optString = jSONObject.optString("fpfBsZp");
                    String valueOf = String.valueOf(optInt);
                    kotlin.jvm.internal.s.checkNotNull(optString);
                    lVar2.invoke(new ErrorCode(valueOf, optString));
                }
            } else {
                lVar2.invoke(new ErrorCode(ErrorCode.UNKNOWN_ERROR, "response body is null"));
            }
        } catch (Exception e8) {
            lVar2.invoke(new ErrorCode(ErrorCode.UNKNOWN_ERROR, String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error")));
        }
        return y5.w.INSTANCE;
    }

    public final void a(final Context context, Region region, WatchInfo[] watchInfoArr, final f6.l onSuccess, final f6.l onFailure) {
        String str;
        Object first;
        WatchInfo[] watches = watchInfoArr;
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(region, "region");
        kotlin.jvm.internal.s.checkNotNullParameter(watches, "watches");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        String a8 = AbstractC0422n.a(context);
        String b8 = AbstractC0422n.b(context);
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.s.checkNotNullExpressionValue(MODEL, "MODEL");
        String a9 = A.a(context);
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.s.checkNotNullExpressionValue(RELEASE, "RELEASE");
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        int i8 = 0;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            str = null;
        }
        String packageName = context.getPackageName();
        JSONArray jSONArray = new JSONArray();
        int length = watches.length;
        while (i8 < length) {
            WatchInfo watchInfo = watches[i8];
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ptQ", watchInfo.getWid());
            jSONObject.put("glZn", watchInfo.getName());
            jSONObject.put("TGNCskfeu", watchInfo.getAvatarUrl());
            jSONObject.put("kpfxDnEVxF", watchInfo.getResolution());
            jSONObject.put("mshvtglVujXDbuMmtbw", watchInfo.getThuResolution());
            jSONObject.put("elapMTrR", watchInfo.getLanguage());
            jSONObject.put("lFcyGkERmdTyTDsZpf", watchInfo.getSupportedLanguages());
            jSONObject.put("illVGWpY", watchInfo.getPayModel().getValue());
            jSONObject.put("etPnFlpzxvXw", watchInfo.getLicenseModel().getValue());
            jSONObject.put("msVAvNFVm", watchInfo.getThirdUuid());
            jSONArray.put(jSONObject);
            i8++;
            watches = watchInfoArr;
        }
        final JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ntQ", "");
        jSONObject2.put("WpiruXTQ", a8);
        jSONObject2.put("lgRAKbza", "4.7.1");
        jSONObject2.put("kpfxDnEVxF", b8);
        jSONObject2.put("fzQnD", MODEL);
        jSONObject2.put("elapMTrR", a9);
        jSONObject2.put("hD", "Android");
        jSONObject2.put("hDInJltbw", RELEASE);
        jSONObject2.put("TAcYCZYNvw", packageName);
        jSONObject2.put("TAcewkDVxF", str);
        jSONObject2.put("plglzetfC", jSONArray);
        C0412d.f15369b.a();
        first = ArraysKt___ArraysKt.first(watchInfoArr);
        String url = "https://ratewatchmy.hanshuang.ltd/my/cdn?WpiruXTQ=" + ((WatchInfo) first).getWid() + "&lpeEw=" + region.getValue();
        f6.l success = new f6.l() { // from class: i5.d1
            @Override // f6.l
            public final Object invoke(Object obj) {
                return C0434z.a(C0434z.this, context, jSONObject2, onSuccess, onFailure, (String) obj);
            }
        };
        f6.p failed = new f6.p() { // from class: i5.e1
            @Override // f6.p
            public final Object invoke(Object obj, Object obj2) {
                return C0434z.a(C0434z.this, context, jSONObject2, onSuccess, onFailure, ((Integer) obj).intValue(), (String) obj2);
            }
        };
        kotlin.jvm.internal.s.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.s.checkNotNullParameter(success, "success");
        kotlin.jvm.internal.s.checkNotNullParameter(failed, "failed");
        try {
            B.a(url);
            ((OkHttpClient) F.f15344a.getValue()).newCall(F.a(new Request.Builder(), "", "", null).get().url(url).build()).enqueue(new C0417i(failed, success));
        } catch (Exception e9) {
            B.a("onFailure: ", e9, 1);
            failed.invoke(0, String.valueOf(e9.getMessage() != null ? e9.getMessage() : "Unknown error"));
        }
    }

    public static final y5.w a(C0434z c0434z, Context context, JSONObject jSONObject, f6.l lVar, f6.l lVar2, String url) {
        kotlin.jvm.internal.s.checkNotNullParameter(url, "url");
        if (url.length() > 0) {
            C0412d a8 = C0412d.f15369b.a();
            kotlin.jvm.internal.s.checkNotNullParameter(url, "url");
            a8.f15371a = url;
        }
        c0434z.a(jSONObject, lVar, lVar2);
        return y5.w.INSTANCE;
    }

    public static final y5.w a(C0434z c0434z, Context context, JSONObject jSONObject, f6.l lVar, f6.l lVar2, int i8, String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<unused var>");
        c0434z.a(jSONObject, lVar, lVar2);
        return y5.w.INSTANCE;
    }

    public final void a(JSONObject jSONObject, final f6.l lVar, final f6.l lVar2) {
        String url = C0412d.f15369b.a().f15371a + "/my/init";
        String params = jSONObject.toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(params, "toString(...)");
        f6.l success = new f6.l() { // from class: i5.h1
            @Override // f6.l
            public final Object invoke(Object obj) {
                return C0434z.a(C0434z.this, lVar, lVar2, (String) obj);
            }
        };
        f6.p failed = new f6.p() { // from class: i5.i1
            @Override // f6.p
            public final Object invoke(Object obj, Object obj2) {
                return C0434z.a(f6.l.this, ((Integer) obj).intValue(), (String) obj2);
            }
        };
        kotlin.jvm.internal.s.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.s.checkNotNullParameter(params, "params");
        kotlin.jvm.internal.s.checkNotNullParameter(success, "success");
        kotlin.jvm.internal.s.checkNotNullParameter(failed, "failed");
        try {
            B.a(url);
            B.a(params);
            ((OkHttpClient) F.f15344a.getValue()).newCall(F.a(new Request.Builder(), "", "", "").post(RequestBody.Companion.create(params, MediaType.Companion.parse(com.yanzhenjie.kalle.i.VALUE_APPLICATION_JSON))).url(url).build()).enqueue(new C0433y(failed, success));
        } catch (Exception e8) {
            B.a("onFailure: ", e8, 1);
            failed.invoke(0, String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error"));
        }
    }

    public static final y5.w a(C0434z c0434z, f6.l lVar, f6.l lVar2, String json) {
        PaymentModel paymentModel;
        LicenseModel licenseModel;
        kotlin.jvm.internal.s.checkNotNullParameter(json, "json");
        try {
            JSONObject jSONObject = new JSONObject(json);
            int optInt = jSONObject.optInt("VzQn");
            if (optInt == 0) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("Wlgj");
                ArrayList arrayList = new ArrayList();
                JSONArray optJSONArray = jSONObject2.optJSONArray("plglzXD");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    int length = optJSONArray.length();
                    for (int i8 = 0; i8 < length; i8++) {
                        JSONObject jSONObject3 = optJSONArray.getJSONObject(i8);
                        int optInt2 = jSONObject3.optInt("illVGWpY");
                        c0434z.getClass();
                        if (optInt2 == 0) {
                            paymentModel = PaymentModel.C_END_PAY;
                        } else if (optInt2 != 1) {
                            paymentModel = PaymentModel.C_END_PAY;
                        } else {
                            paymentModel = PaymentModel.LICENSE_PAY;
                        }
                        String optString = jSONObject3.optString("ptQ");
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(optString, "optString(...)");
                        WatchInfo watchInfo = new WatchInfo(paymentModel, optString);
                        int optInt3 = jSONObject3.optInt("etPnFlpzxvXw");
                        if (optInt3 == 0) {
                            licenseModel = LicenseModel.KNOWN_DEVICE;
                        } else if (optInt3 != 1) {
                            licenseModel = LicenseModel.CONSUMER_DEVICE;
                        } else {
                            licenseModel = LicenseModel.CONSUMER_DEVICE;
                        }
                        watchInfo.setLicenseModel(licenseModel);
                        watchInfo.setName(jSONObject3.optString("glZn"));
                        watchInfo.setAvatarUrl(jSONObject3.optString("TGNCskfeu"));
                        watchInfo.setResolution(jSONObject3.optString("kpfxDnEVxF"));
                        watchInfo.setThuResolution(jSONObject3.optString("mshvtglVujXDbuMmtbw"));
                        watchInfo.setLanguage(jSONObject3.optString("elapMTrR"));
                        watchInfo.setSupportedLanguages(jSONObject3.optString("lFcyGkERmdTyTDsZpf"));
                        JSONObject optJSONObject = jSONObject3.optJSONObject("lFOBuktcCAhyvwxh");
                        if (optJSONObject != null) {
                            SubscriptionInfo subscriptionInfo = new SubscriptionInfo(optJSONObject.optInt("boRwLbElcQip"));
                            subscriptionInfo.setValidTimeToB(Long.valueOf(optJSONObject.optLong("olYrvMtZnlhM")));
                            subscriptionInfo.setValidTimeToC(Long.valueOf(optJSONObject.optLong("olYrvMtZnlhN")));
                            subscriptionInfo.setValidCountToB(Integer.valueOf(optJSONObject.optInt("olYrvvzhwLMzo")));
                            subscriptionInfo.setValidCountToC(Integer.valueOf(optJSONObject.optInt("olYrvvzhwLMzp")));
                            subscriptionInfo.setFreeDays(Integer.valueOf(optJSONObject.optInt("YCRnVTJf")));
                            watchInfo.setSubscriptionInfo(subscriptionInfo);
                        }
                        arrayList.add(watchInfo);
                    }
                }
                lVar.invoke(arrayList);
            } else {
                String optString2 = jSONObject.optString("fpfBsZp");
                String valueOf = String.valueOf(optInt);
                kotlin.jvm.internal.s.checkNotNull(optString2);
                lVar2.invoke(new ErrorCode(valueOf, optString2));
            }
        } catch (Exception e8) {
            lVar2.invoke(new ErrorCode(ErrorCode.UNKNOWN_ERROR, String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error")));
        }
        return y5.w.INSTANCE;
    }

    public static void a(Context context, TimeoutConfig timeoutConfig, String wid, final f6.l onSuccess, final f6.l onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        if (wid.length() > 0) {
            String str = C0412d.f15369b.a().f15371a;
            I.a(timeoutConfig, str + "/my/subscriptions?" + ("VsNwFXwvm=716170bbda67bd99&ptQ=" + wid), AbstractC0422n.a(context), wid, new f6.l() { // from class: i5.f1
                @Override // f6.l
                public final Object invoke(Object obj) {
                    return C0434z.b(f6.l.this, onFailure, (Response) obj);
                }
            }, new f6.p() { // from class: i5.g1
                @Override // f6.p
                public final Object invoke(Object obj, Object obj2) {
                    return C0434z.c(f6.l.this, ((Integer) obj).intValue(), (String) obj2);
                }
            });
            return;
        }
        throw new IllegalArgumentException("wid cannot be null or empty");
    }

    public static void a(Context context, TimeoutConfig timeoutConfig, String wid, int i8, int i9, final f6.l onSuccess, final f6.l onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        if (wid.length() > 0) {
            String a8 = AbstractC0422n.a(context);
            String str = "VsNwFXwvm=716170bbda67bd99&ptQ=" + wid + "&ilTnkbKR=" + i9 + "&ilTnfnx=" + i8;
            I.a(timeoutConfig, C0412d.f15369b.a().f15371a + str, a8, wid, new f6.l() { // from class: i5.j1
                @Override // f6.l
                public final Object invoke(Object obj) {
                    return C0434z.a(f6.l.this, onFailure, (Response) obj);
                }
            }, new f6.p() { // from class: i5.k1
                @Override // f6.p
                public final Object invoke(Object obj, Object obj2) {
                    return C0434z.b(f6.l.this, ((Integer) obj).intValue(), (String) obj2);
                }
            });
            return;
        }
        throw new IllegalArgumentException("wid cannot be null or empty");
    }

    public static final y5.w a(f6.l lVar, f6.l lVar2, Response response) {
        String str;
        String str2 = "optString(...)";
        kotlin.jvm.internal.s.checkNotNullParameter(response, "response");
        try {
            ResponseBody body = response.body();
            String string = body != null ? body.string() : null;
            B.a("onResponse: " + string);
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                int optInt = jSONObject.optInt("VzQn");
                if (optInt == 0) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("Wlgj");
                    ArrayList arrayList = new ArrayList();
                    JSONArray optJSONArray = jSONObject2.optJSONArray("hCQnJl");
                    if (optJSONArray != null) {
                        int length = optJSONArray.length();
                        int i8 = 0;
                        while (i8 < length) {
                            JSONObject optJSONObject = optJSONArray.optJSONObject(i8);
                            if (optJSONObject != null) {
                                String optString = optJSONObject.optString("hCQnJBo");
                                kotlin.jvm.internal.s.checkNotNullExpressionValue(optString, str2);
                                String optString2 = optJSONObject.optString("hCQnJICVlw");
                                kotlin.jvm.internal.s.checkNotNullExpressionValue(optString2, str2);
                                str = str2;
                                arrayList.add(new Order(optString, optString2, optJSONObject.optInt("hCQnJGFZ"), optJSONObject.optLong("lENALMtZn"), optJSONObject.optLong("XyQcAfp"), optJSONObject.optInt("hCQnJMJcn"), optJSONObject.optInt("hCQnJLENCMl")));
                            } else {
                                str = str2;
                            }
                            i8++;
                            str2 = str;
                        }
                    }
                    lVar.invoke(arrayList);
                } else {
                    String optString3 = jSONObject.optString("fpfBsZp");
                    String valueOf = String.valueOf(optInt);
                    kotlin.jvm.internal.s.checkNotNull(optString3);
                    lVar2.invoke(new ErrorCode(valueOf, optString3));
                }
            } else {
                lVar2.invoke(new ErrorCode(ErrorCode.UNKNOWN_ERROR, "response body is null"));
            }
        } catch (Exception e8) {
            lVar2.invoke(new ErrorCode(ErrorCode.UNKNOWN_ERROR, String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error")));
        }
        return y5.w.INSTANCE;
    }
}
