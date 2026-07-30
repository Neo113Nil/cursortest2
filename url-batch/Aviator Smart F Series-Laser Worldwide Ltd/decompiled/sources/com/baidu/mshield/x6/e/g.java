package com.baidu.mshield.x6.e;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.mshield.x6.EngineImpl;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public Context f8544a;

    public g(Context context, int i8) {
        this.f8544a = context;
    }

    public JSONObject a() {
        try {
            return b();
        } catch (Throwable th) {
            a(th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d7 A[Catch: all -> 0x0227, TRY_LEAVE, TryCatch #1 {all -> 0x0227, blocks: (B:3:0x0008, B:5:0x0022, B:7:0x002b, B:9:0x0034, B:11:0x0045, B:13:0x0056, B:15:0x0078, B:19:0x0087, B:21:0x008c, B:23:0x0095, B:42:0x00fc, B:44:0x0112, B:58:0x01a7, B:61:0x01ae, B:63:0x01d7, B:65:0x01ff, B:67:0x020d, B:69:0x0213, B:70:0x0217, B:72:0x021d, B:74:0x022a, B:75:0x023e, B:77:0x0266, B:79:0x026f, B:80:0x0276, B:82:0x0280, B:84:0x028c, B:86:0x02ab, B:88:0x02b1, B:89:0x02b5, B:91:0x02bb, B:93:0x02c5, B:94:0x02d9, B:95:0x02de, B:99:0x0193, B:105:0x01a1, B:119:0x00f9, B:102:0x0198, B:26:0x00b5, B:32:0x00dc, B:36:0x00e6, B:38:0x00eb, B:41:0x00f4), top: B:2:0x0008, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0280 A[Catch: all -> 0x0227, TryCatch #1 {all -> 0x0227, blocks: (B:3:0x0008, B:5:0x0022, B:7:0x002b, B:9:0x0034, B:11:0x0045, B:13:0x0056, B:15:0x0078, B:19:0x0087, B:21:0x008c, B:23:0x0095, B:42:0x00fc, B:44:0x0112, B:58:0x01a7, B:61:0x01ae, B:63:0x01d7, B:65:0x01ff, B:67:0x020d, B:69:0x0213, B:70:0x0217, B:72:0x021d, B:74:0x022a, B:75:0x023e, B:77:0x0266, B:79:0x026f, B:80:0x0276, B:82:0x0280, B:84:0x028c, B:86:0x02ab, B:88:0x02b1, B:89:0x02b5, B:91:0x02bb, B:93:0x02c5, B:94:0x02d9, B:95:0x02de, B:99:0x0193, B:105:0x01a1, B:119:0x00f9, B:102:0x0198, B:26:0x00b5, B:32:0x00dc, B:36:0x00e6, B:38:0x00eb, B:41:0x00f4), top: B:2:0x0008, inners: #0, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject b() {
        Throwable th;
        String str;
        String str2;
        String str3;
        String str4;
        String b8;
        String str5 = "";
        try {
            JSONObject a8 = com.baidu.xclient.gdid.a.a();
            com.baidu.mshield.b.c.a.a("praseJsonData jsonObject=" + a8);
            if (a8 != null) {
                com.baidu.mshield.x6.b.b bVar = new com.baidu.mshield.x6.b.b(this.f8544a);
                a8.put("15004", com.baidu.mshield.x6.f.f.a());
                a8.put("15101", EngineImpl.getInstance(this.f8544a).getPropertyByType("cuid"));
                a8.put("15110", EngineImpl.getInstance(this.f8544a).getPropertyByType("aid"));
                a8.put("15018", EngineImpl.getInstance(this.f8544a).getPropertyByType(EngineImpl.KEY_OAID));
                String propertyByType = EngineImpl.getInstance(this.f8544a).getPropertyByType("sl");
                a8.put("07001", propertyByType);
                a8.put("02037", com.baidu.mshield.x6.f.f.a(this.f8544a) ? "1" : "0");
                a8.put("17001", com.baidu.mshield.x6.c.b.a());
                a8.put("06005", a(this.f8544a));
                com.baidu.mshield.b.c.a.b("07001 sensor list=" + propertyByType);
                try {
                    a8.put("15100", com.baidu.mshield.x6.f.f.g(this.f8544a));
                    boolean a9 = a.a(this.f8544a, com.baidu.mshield.x6.b.b.f8514n);
                    a8.put("15090", a9 && a.a(this.f8544a, com.baidu.mshield.x6.b.b.f8514n, "2", true) ? "1" : "0");
                    a8.put("15093", a9 ? "1" : "0");
                    a8.put("15099", bVar.C() ? "0" : "1");
                } catch (Throwable th2) {
                    com.baidu.mshield.x6.f.f.b(th2);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ExifInterface.GPS_MEASUREMENT_3D, EngineImpl.getInstance(this.f8544a).getPropertyByType("p"));
                jSONObject.put("4", EngineImpl.getInstance(this.f8544a).getPropertyByType("s"));
                EngineImpl.getInstance(this.f8544a).getSecApi().a(this.f8544a, jSONObject);
                a8.put("1011105", jSONObject);
                try {
                    b8 = com.baidu.mshield.x6.f.f.b(this.f8544a);
                } catch (Throwable th3) {
                    th = th3;
                    str = "";
                    str2 = str;
                }
                if (TextUtils.isEmpty(b8)) {
                    str4 = "";
                    str3 = str4;
                    a8.put("15091", TextUtils.isEmpty(str5) ? "0" : "1");
                    a8.put("15082", str4 + "#" + bVar.E());
                    a8.put("15083", str3);
                    if (!TextUtils.isEmpty(str5)) {
                    }
                    if (a.a(this.f8544a, com.baidu.mshield.x6.b.b.f8515o)) {
                    }
                    a8.put("15086", com.baidu.mshield.x6.f.f.e() + "#" + com.baidu.mshield.x6.f.f.d());
                } else {
                    JSONObject jSONObject2 = new JSONObject(b8);
                    String optString = jSONObject2.optString("1");
                    if (TextUtils.isEmpty(optString)) {
                        str2 = "";
                    } else {
                        str2 = new String(com.baidu.mshield.b.a.c.b(Base64.decode(optString.getBytes(), 0)), "utf-8");
                        com.baidu.mshield.b.c.a.a("getJsonDataPart18 ungzDrf : " + str2);
                    }
                    try {
                        str = jSONObject2.optString(ExifInterface.GPS_MEASUREMENT_3D);
                        try {
                            str5 = jSONObject2.optString("2");
                        } catch (Throwable th4) {
                            th = th4;
                            com.baidu.mshield.x6.f.f.b(th);
                            try {
                                a8.put("15094", com.baidu.mshield.x6.f.f.a(th));
                            } catch (Throwable th5) {
                                com.baidu.mshield.x6.f.f.b(th5);
                            }
                            str3 = str;
                            str4 = str5;
                            str5 = str2;
                            a8.put("15091", TextUtils.isEmpty(str5) ? "0" : "1");
                            a8.put("15082", str4 + "#" + bVar.E());
                            a8.put("15083", str3);
                            if (!TextUtils.isEmpty(str5)) {
                            }
                            if (a.a(this.f8544a, com.baidu.mshield.x6.b.b.f8515o)) {
                            }
                            a8.put("15086", com.baidu.mshield.x6.f.f.e() + "#" + com.baidu.mshield.x6.f.f.d());
                            return a8;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        str = "";
                    }
                    str3 = str;
                    str4 = str5;
                    str5 = str2;
                    a8.put("15091", TextUtils.isEmpty(str5) ? "0" : "1");
                    a8.put("15082", str4 + "#" + bVar.E());
                    a8.put("15083", str3);
                    if (!TextUtils.isEmpty(str5)) {
                        com.baidu.mshield.b.c.a.a("real machine sig is not empty");
                        com.baidu.mshield.b.c.a.a("getEmulatorResultPolicy datas===" + str5);
                        long currentTimeMillis = System.currentTimeMillis();
                        List<String> a10 = com.baidu.mshield.x6.c.a.a(str5);
                        a8.put("d0005", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        JSONArray jSONArray = new JSONArray();
                        if (a10 != null && a10.size() > 0) {
                            Iterator<String> it = a10.iterator();
                            while (it.hasNext()) {
                                jSONArray.put(it.next());
                            }
                            com.baidu.mshield.b.c.a.a("getEmulatorResult 15084===" + jSONArray);
                        }
                        a8.put("15084", jSONArray);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        JSONObject b9 = com.baidu.mshield.x6.c.a.b(str5);
                        long currentTimeMillis3 = System.currentTimeMillis();
                        com.baidu.mshield.b.c.a.a("cpp param 2 result : " + b9);
                        a8.put("d0006", String.valueOf(currentTimeMillis3 - currentTimeMillis2));
                        a8.put("15085", b9.toString());
                    }
                    if (a.a(this.f8544a, com.baidu.mshield.x6.b.b.f8515o)) {
                        String c8 = com.baidu.mshield.x6.f.f.c(this.f8544a);
                        if (!TextUtils.isEmpty(c8)) {
                            com.baidu.mshield.b.c.a.a("getEmulatorResultPolicy===" + c8);
                            List<String> a11 = com.baidu.mshield.x6.c.a.a(c8);
                            JSONArray jSONArray2 = new JSONArray();
                            if (a11 != null && a11.size() > 0) {
                                Iterator<String> it2 = a11.iterator();
                                while (it2.hasNext()) {
                                    jSONArray2.put(it2.next());
                                }
                                com.baidu.mshield.b.c.a.a("getEmulatorResult 14001===" + jSONArray2);
                            }
                            a8.put("14001", jSONArray2);
                        }
                    }
                    a8.put("15086", com.baidu.mshield.x6.f.f.e() + "#" + com.baidu.mshield.x6.f.f.d());
                }
            }
            return a8;
        } catch (Throwable th7) {
            a(th7);
            return null;
        }
    }

    public final void a(Throwable th) {
        com.baidu.mshield.x6.f.f.b(th);
    }

    public static String a(Context context) {
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                return null;
            }
            String stringExtra = registerReceiver.getStringExtra("technology");
            return TextUtils.isEmpty(stringExtra) ? "unknown" : stringExtra;
        } catch (Exception e8) {
            com.baidu.mshield.x6.f.f.b(e8);
            return null;
        }
    }
}
