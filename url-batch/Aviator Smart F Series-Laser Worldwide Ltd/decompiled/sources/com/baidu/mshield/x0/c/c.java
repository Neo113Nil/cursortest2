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
public class c extends b {

    /* renamed from: a, reason: collision with root package name */
    public static String f8420a;

    /* renamed from: b, reason: collision with root package name */
    public static String f8421b;

    public static class a extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONObject f8422a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f8423b;

        public a(JSONObject jSONObject, Context context) {
            this.f8422a = jSONObject;
            this.f8423b = context;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            String str;
            int i8;
            String str2;
            JSONObject jSONObject;
            String str3;
            JSONObject jSONObject2;
            String str4;
            String str5 = "4";
            String str6 = "1";
            try {
                int optInt = this.f8422a.optInt("1", 0);
                String optString = this.f8422a.optString("4", "");
                int optInt2 = this.f8422a.has("7") ? this.f8422a.optJSONObject("7").optInt("1", 1) : 0;
                String valueOf = String.valueOf(System.currentTimeMillis());
                com.baidu.mshield.b.c.a.b("detect app encryptStr====" + c.f8421b);
                String b8 = com.baidu.xclient.gdid.a.b(c.f8421b);
                com.baidu.mshield.b.c.a.b("detect app decryptStr====" + b8);
                JSONObject jSONObject3 = !TextUtils.isEmpty(b8) ? new JSONObject(b8) : new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                String str7 = "8";
                String str8 = "0";
                if (jSONObject3.length() > 0) {
                    Iterator<String> keys = jSONObject3.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Iterator<String> it = keys;
                        JSONObject optJSONObject = jSONObject3.optJSONObject(next);
                        JSONObject jSONObject5 = jSONObject3;
                        String optString2 = optJSONObject.optString("p");
                        String str9 = optString;
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("f");
                        JSONObject jSONObject6 = new JSONObject();
                        String str10 = valueOf;
                        PackageInfo b9 = b.b(this.f8423b, optString2);
                        if (b9 != null) {
                            str2 = next;
                            if (optInt == 1) {
                                i8 = optInt;
                                jSONObject6.put(str8, e.a(new File(b9.applicationInfo.sourceDir)));
                            } else {
                                i8 = optInt;
                            }
                            jSONObject6.put(str6, str6);
                            if (b.c(this.f8423b, optString2)) {
                                jSONObject6.put(str5, str6);
                            } else {
                                jSONObject6.put(str5, str8);
                            }
                            ArrayList arrayList = new ArrayList();
                            JSONObject jSONObject7 = new JSONObject();
                            str = str5;
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    JSONObject jSONObject8 = jSONObject4;
                                    StringBuffer stringBuffer = new StringBuffer();
                                    int i9 = optInt2;
                                    String next2 = keys2.next();
                                    String str11 = str8;
                                    String optString3 = optJSONObject2.optString(next2);
                                    if (TextUtils.isEmpty(optString3)) {
                                        jSONObject4 = jSONObject8;
                                        str8 = str11;
                                        optInt2 = i9;
                                    } else {
                                        String str12 = str6;
                                        if (new File(optString3).exists()) {
                                            String[] a8 = com.baidu.mshield.b.a.b.a(optString3);
                                            str4 = str7;
                                            stringBuffer.append(a8[0]);
                                            stringBuffer.append("#");
                                            jSONObject2 = optJSONObject2;
                                            stringBuffer.append(a8[1]);
                                            stringBuffer.append("#");
                                            stringBuffer.append(a8[2]);
                                            stringBuffer.append("#");
                                            stringBuffer.append(a8[3]);
                                        } else {
                                            jSONObject2 = optJSONObject2;
                                            str4 = str7;
                                        }
                                        arrayList.add(optString3);
                                        jSONObject7.put(next2, stringBuffer.toString());
                                        jSONObject4 = jSONObject8;
                                        str8 = str11;
                                        optInt2 = i9;
                                        str6 = str12;
                                        str7 = str4;
                                        optJSONObject2 = jSONObject2;
                                    }
                                }
                            }
                            String str13 = str6;
                            String str14 = str8;
                            JSONObject jSONObject9 = optJSONObject2;
                            int i10 = optInt2;
                            jSONObject = jSONObject4;
                            String str15 = str7;
                            jSONObject6.put(ExifInterface.GPS_MEASUREMENT_3D, String.valueOf(b.a(this.f8423b, optString2, arrayList)));
                            jSONObject6.put(ErrorCode.PARAMETER_ERROR, jSONObject7.toString());
                            jSONObject6.put("6", b9.firstInstallTime);
                            jSONObject6.put("7", b9.lastUpdateTime);
                            if (jSONObject9 == null || jSONObject9.length() <= 0) {
                                str6 = str13;
                                str3 = str15;
                                str8 = str14;
                                jSONObject6.put(str3, str8);
                            } else {
                                str6 = str13;
                                str3 = str15;
                                jSONObject6.put(str3, str6);
                                str8 = str14;
                            }
                            jSONObject6.put("9", b9.versionName);
                            optInt2 = i10;
                            if (optInt2 == 1) {
                                String[] a9 = b.a(this.f8423b, optString2);
                                for (int i11 = 0; i11 < a9.length; i11++) {
                                    String str16 = a9[i11];
                                    StringBuffer stringBuffer2 = new StringBuffer();
                                    if (!TextUtils.isEmpty(str16)) {
                                        String[] a10 = com.baidu.mshield.b.a.b.a(str16);
                                        stringBuffer2.append(a10[0]);
                                        stringBuffer2.append("#");
                                        stringBuffer2.append(a10[1]);
                                        stringBuffer2.append("#");
                                        stringBuffer2.append(a10[2]);
                                        stringBuffer2.append("#");
                                        stringBuffer2.append(a10[3]);
                                    }
                                    jSONObject6.put(String.valueOf(i11 + 10), stringBuffer2.toString());
                                }
                            }
                        } else {
                            str = str5;
                            i8 = optInt;
                            str2 = next;
                            jSONObject = jSONObject4;
                            str3 = str7;
                            jSONObject6.put(str6, str8);
                        }
                        JSONObject jSONObject10 = jSONObject;
                        jSONObject10.put(str2, jSONObject6);
                        jSONObject4 = jSONObject10;
                        str7 = str3;
                        keys = it;
                        jSONObject3 = jSONObject5;
                        optString = str9;
                        valueOf = str10;
                        optInt = i8;
                        str5 = str;
                    }
                }
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject11 = new JSONObject();
                jSONObject11.put(ExifInterface.GPS_MEASUREMENT_3D, jSONObject4);
                jSONObject11.put(str8, valueOf);
                jSONObject11.put(ErrorCode.PARAMETER_ERROR, optString);
                jSONObject11.put(str7, EngineImpl.getInstance(this.f8423b).getPropertyByType("mod"));
                jSONArray.put(jSONObject11);
                com.baidu.mshield.b.c.a.b("handleNativeCollect: upArray=" + jSONArray);
                d.b(this.f8423b, jSONArray, "1001159");
            } catch (Throwable th) {
                d.a(th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:3:0x0006, B:7:0x002c, B:10:0x003d, B:13:0x0054, B:15:0x006d, B:17:0x0075, B:19:0x0084, B:21:0x0090, B:24:0x009b, B:25:0x00a6, B:27:0x00ae, B:30:0x00a2), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context) {
        try {
            com.baidu.mshield.x0.l.a aVar = new com.baidu.mshield.x0.l.a(context);
            String c8 = aVar.c("plc115");
            com.baidu.mshield.b.c.a.b("handleCollectRoutine: policy=" + c8);
            if (TextUtils.isEmpty(c8)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(c8);
            boolean z7 = true;
            if (jSONObject.optInt("1", 0) != 1) {
                z7 = false;
            }
            com.baidu.mshield.b.c.a.b("handleCollectRoutine: sw=" + z7);
            if (!z7) {
                return;
            }
            if (System.currentTimeMillis() - aVar.h() < jSONObject.optInt(ExifInterface.GPS_MEASUREMENT_3D, 24) * 3600000) {
                com.baidu.mshield.b.c.a.b("handleCollectRoutine not time");
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(ErrorCode.PARAMETER_ERROR).optJSONObject("uv4");
            if (optJSONObject == null) {
                return;
            }
            int optInt = optJSONObject.optInt(ExifInterface.GPS_MEASUREMENT_3D, 10);
            if (optJSONObject.has("7") && optJSONObject.optJSONObject("7").optInt("2", 0) != 0) {
                f8421b = optJSONObject.optString("2");
                if (TextUtils.isEmpty(f8421b)) {
                    new Timer().schedule(new a(optJSONObject, context), optInt * 1000);
                    return;
                }
                return;
            }
            f8421b = f8420a;
            if (TextUtils.isEmpty(f8421b)) {
            }
        } catch (Throwable th) {
            d.a(th);
        }
    }
}
