package com.baidu.mshield.x0.c;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.mshield.b.f.e;
import com.baidu.mshield.x0.EngineImpl;
import com.baidu.mshield.x0.d.d;
import com.my.lib.data.ErrorCode;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public static String f8416a = "";

    /* renamed from: com.baidu.mshield.x0.c.a$a, reason: collision with other inner class name */
    public static class C0087a extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONObject f8417a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f8418b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.baidu.mshield.x0.l.a f8419c;

        public C0087a(JSONObject jSONObject, Context context, com.baidu.mshield.x0.l.a aVar) {
            this.f8417a = jSONObject;
            this.f8418b = context;
            this.f8419c = aVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            String str;
            int i8;
            String str2;
            String str3;
            String str4;
            String[] strArr;
            String str5;
            JSONObject jSONObject;
            String str6 = "4";
            String str7 = "7";
            String str8 = "1";
            try {
                int optInt = this.f8417a.optInt("1", 0);
                String optString = this.f8417a.optString("4", "");
                String optString2 = this.f8417a.optString(ErrorCode.PARAMETER_ERROR, "");
                String optString3 = this.f8417a.optString("6", "");
                int optInt2 = this.f8417a.has("7") ? this.f8417a.optJSONObject("7").optInt("1", 1) : 0;
                String valueOf = String.valueOf(System.currentTimeMillis());
                com.baidu.mshield.b.c.a.b("detect app encryptStr====" + a.f8416a);
                String b8 = com.baidu.xclient.gdid.a.b(a.f8416a);
                com.baidu.mshield.b.c.a.b("detect app decryptStr====" + b8);
                JSONObject jSONObject2 = !TextUtils.isEmpty(b8) ? new JSONObject(b8) : new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str9 = "8";
                String str10 = "0";
                if (jSONObject2.length() > 0) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        Iterator<String> it = keys;
                        String next = keys.next();
                        String str11 = optString;
                        JSONObject optJSONObject = jSONObject2.optJSONObject(next);
                        JSONObject jSONObject4 = jSONObject2;
                        String optString4 = optJSONObject.optString("p");
                        String str12 = valueOf;
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("f");
                        JSONObject jSONObject5 = new JSONObject();
                        JSONObject jSONObject6 = jSONObject3;
                        PackageInfo b9 = b.b(this.f8418b, optString4);
                        if (b9 != null) {
                            str4 = next;
                            if (optInt == 1) {
                                i8 = optInt;
                                jSONObject5.put(str10, e.a(new File(b9.applicationInfo.sourceDir)));
                            } else {
                                i8 = optInt;
                            }
                            jSONObject5.put(str8, str8);
                            if (b.c(this.f8418b, optString4)) {
                                jSONObject5.put(str6, str8);
                            } else {
                                jSONObject5.put(str6, str10);
                            }
                            ArrayList arrayList = new ArrayList();
                            JSONObject jSONObject7 = new JSONObject();
                            str = str6;
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    int i9 = optInt2;
                                    StringBuffer stringBuffer = new StringBuffer();
                                    String str13 = str10;
                                    String next2 = keys2.next();
                                    String str14 = str8;
                                    String optString5 = optJSONObject2.optString(next2);
                                    if (TextUtils.isEmpty(optString5)) {
                                        optInt2 = i9;
                                        str8 = str14;
                                        str10 = str13;
                                    } else {
                                        String str15 = str9;
                                        if (new File(optString5).exists()) {
                                            String[] a8 = com.baidu.mshield.b.a.b.a(optString5);
                                            jSONObject = optJSONObject2;
                                            stringBuffer.append(a8[0]);
                                            stringBuffer.append("#");
                                            str5 = str7;
                                            stringBuffer.append(a8[1]);
                                            stringBuffer.append("#");
                                            stringBuffer.append(a8[2]);
                                            stringBuffer.append("#");
                                            stringBuffer.append(a8[3]);
                                        } else {
                                            str5 = str7;
                                            jSONObject = optJSONObject2;
                                        }
                                        arrayList.add(optString5);
                                        jSONObject7.put(next2, stringBuffer.toString());
                                        optInt2 = i9;
                                        str8 = str14;
                                        str10 = str13;
                                        str9 = str15;
                                        optJSONObject2 = jSONObject;
                                        str7 = str5;
                                    }
                                }
                            }
                            String str16 = str8;
                            JSONObject jSONObject8 = optJSONObject2;
                            String str17 = str10;
                            String str18 = str9;
                            int i10 = optInt2;
                            jSONObject5.put(ExifInterface.GPS_MEASUREMENT_3D, String.valueOf(b.a(this.f8418b, optString4, arrayList)));
                            jSONObject5.put(ErrorCode.PARAMETER_ERROR, jSONObject7.toString());
                            jSONObject5.put("6", b9.firstInstallTime);
                            str7 = str7;
                            jSONObject5.put(str7, b9.lastUpdateTime);
                            if (jSONObject8 == null || jSONObject8.length() <= 0) {
                                str8 = str16;
                                str3 = str18;
                                str2 = str17;
                                jSONObject5.put(str3, str2);
                            } else {
                                str8 = str16;
                                str3 = str18;
                                jSONObject5.put(str3, str8);
                                str2 = str17;
                            }
                            jSONObject5.put("9", b9.versionName);
                            optInt2 = i10;
                            if (optInt2 == 1) {
                                String[] a9 = b.a(this.f8418b, optString4);
                                int i11 = 0;
                                while (i11 < a9.length) {
                                    String str19 = a9[i11];
                                    StringBuffer stringBuffer2 = new StringBuffer();
                                    if (TextUtils.isEmpty(str19)) {
                                        strArr = a9;
                                    } else {
                                        String[] a10 = com.baidu.mshield.b.a.b.a(str19);
                                        strArr = a9;
                                        stringBuffer2.append(a10[0]);
                                        stringBuffer2.append("#");
                                        stringBuffer2.append(a10[1]);
                                        stringBuffer2.append("#");
                                        stringBuffer2.append(a10[2]);
                                        stringBuffer2.append("#");
                                        stringBuffer2.append(a10[3]);
                                    }
                                    jSONObject5.put(String.valueOf(i11 + 10), stringBuffer2.toString());
                                    i11++;
                                    a9 = strArr;
                                }
                            }
                        } else {
                            str = str6;
                            i8 = optInt;
                            str2 = str10;
                            str3 = str9;
                            str4 = next;
                            jSONObject5.put(str8, str2);
                        }
                        jSONObject6.put(str4, jSONObject5);
                        jSONObject3 = jSONObject6;
                        str9 = str3;
                        str10 = str2;
                        optString = str11;
                        keys = it;
                        jSONObject2 = jSONObject4;
                        valueOf = str12;
                        optInt = i8;
                        str6 = str;
                    }
                }
                String str20 = optString;
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.put(ExifInterface.GPS_MEASUREMENT_3D, jSONObject3);
                jSONObject9.put(str10, valueOf);
                jSONObject9.put(ErrorCode.PARAMETER_ERROR, str20);
                jSONObject9.put("6", optString2);
                jSONObject9.put(str7, optString3);
                jSONObject9.put(str9, EngineImpl.getInstance(this.f8418b).getPropertyByType("mod"));
                jSONArray.put(jSONObject9);
                com.baidu.mshield.b.c.a.b("handleNativeCollect: upArray=" + jSONArray);
                d.b(this.f8418b, jSONArray, "1001159");
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append(str20);
                stringBuffer3.append("_");
                stringBuffer3.append(optString2);
                stringBuffer3.append("_");
                stringBuffer3.append(optString3);
                this.f8419c.f(stringBuffer3.toString());
                a.f8416a = "";
            } catch (Throwable th) {
                d.a(th);
            }
        }
    }

    public static void a(Context context) {
        JSONObject optJSONObject;
        try {
            com.baidu.mshield.x0.l.a aVar = new com.baidu.mshield.x0.l.a(context);
            String c8 = aVar.c("plc114");
            com.baidu.mshield.b.c.a.b("handleNativeCollect: policy=" + c8);
            if (TextUtils.isEmpty(c8)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(c8);
            boolean z7 = jSONObject.optInt("1", 0) == 1;
            com.baidu.mshield.b.c.a.b("handleNativeCollect: sw=" + z7);
            if (z7 && (optJSONObject = jSONObject.optJSONObject(ErrorCode.PARAMETER_ERROR).optJSONObject("uv6")) != null) {
                com.baidu.mshield.b.c.a.b("detect app encrypt===" + f8416a);
                int optInt = optJSONObject.optInt(ExifInterface.GPS_MEASUREMENT_3D, 10);
                if (TextUtils.isEmpty(f8416a)) {
                    return;
                }
                new Timer().schedule(new C0087a(optJSONObject, context, aVar), optInt * 1000);
            }
        } catch (Throwable th) {
            d.a(th);
        }
    }
}
