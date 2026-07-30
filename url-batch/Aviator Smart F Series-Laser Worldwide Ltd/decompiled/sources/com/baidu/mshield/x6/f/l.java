package com.baidu.mshield.x6.f;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.mshield.x6.EngineImpl;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.my.lib.data.ErrorCode;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static String f8566a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f8567b = "";

    /* renamed from: c, reason: collision with root package name */
    public static String f8568c = "";

    /* renamed from: d, reason: collision with root package name */
    public static String f8569d = "";

    /* renamed from: e, reason: collision with root package name */
    public static String f8570e = "";

    public static class a extends com.baidu.mshield.x6.f.m.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f8571b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f8572c;

        public a(int i8, Context context) {
            this.f8571b = i8;
            this.f8572c = context;
        }

        @Override // com.baidu.mshield.x6.f.m.a
        public void b() {
            try {
                com.baidu.mshield.b.c.a.a("token respone order trigger token delay : " + this.f8571b);
                Thread.sleep((long) (this.f8571b * 1000));
                com.baidu.mshield.x6.e.h.a(this.f8572c).a(7);
            } catch (Throwable th) {
                f.b(th);
            }
        }
    }

    public static int a(Context context, String str) {
        String str2;
        String str3;
        String str4;
        String u7;
        String b8;
        String a8;
        String A;
        String b9;
        String a9;
        synchronized (l.class) {
            try {
                com.baidu.mshield.x6.b.b bVar = new com.baidu.mshield.x6.b.b(context);
                if (System.currentTimeMillis() - bVar.D() < 300000) {
                    return -1;
                }
                String str5 = null;
                String b10 = new com.baidu.mshield.x6.d.a(context, null).b(str);
                bVar.a(System.currentTimeMillis());
                com.baidu.mshield.b.c.a.c("ret: " + b10);
                if (TextUtils.isEmpty(b10)) {
                    return -1;
                }
                JSONObject jSONObject = new JSONObject(b10);
                try {
                    str2 = jSONObject.optString("status");
                } catch (Throwable th) {
                    f.b(th);
                    str2 = null;
                }
                try {
                    str3 = jSONObject.optString("xid");
                } catch (Throwable th2) {
                    f.b(th2);
                    str3 = null;
                }
                try {
                    str4 = jSONObject.optString("bs");
                } catch (Throwable th3) {
                    f.b(th3);
                    str4 = null;
                }
                if (str2 != null && str2.equals("99999999")) {
                    return -99;
                }
                if (!TextUtils.isEmpty(str3)) {
                    if (com.baidu.mshield.x6.c.b.b()) {
                        A = new com.baidu.mshield.x6.b.b(context).Q();
                        b9 = b.b(context, "x_o_b_d");
                        a9 = b.a(context, ".x_o_b_d");
                    } else {
                        A = new com.baidu.mshield.x6.b.b(context).A();
                        b9 = b.b(context, "x_b_d");
                        a9 = b.a(context, ".x_b_d");
                    }
                    if (!str3.equals(b9) || !str3.equals(a9) || !str3.equals(A)) {
                        b.d(context, str3);
                    }
                }
                if (!TextUtils.isEmpty(str4)) {
                    if (com.baidu.mshield.x6.c.b.b()) {
                        u7 = new com.baidu.mshield.x6.b.b(context).P();
                        b8 = b.b(context, "g_m_o_bs");
                        a8 = b.a(context, ".g_m_o_bs");
                    } else {
                        u7 = new com.baidu.mshield.x6.b.b(context).u();
                        b8 = b.b(context, "g_m_b_s");
                        a8 = b.a(context, ".g_m_b_s");
                    }
                    if (!str4.equals(b8) || !str4.equals(a8) || !str4.equals(u7)) {
                        b.c(context, str4);
                    }
                }
                try {
                    str5 = jSONObject.optString("ver");
                    if (!TextUtils.isEmpty(str5)) {
                        b.e(context, str5);
                    }
                } catch (Throwable th4) {
                    com.baidu.mshield.b.c.a.c("1" + th4.toString());
                    f.b(th4);
                }
                if (!TextUtils.isEmpty(str5)) {
                    b.e(context, str5);
                }
                return 0;
            } catch (Throwable th5) {
                com.baidu.mshield.b.c.a.c("2" + th5.toString());
                f.b(th5);
                return -1;
            }
        }
    }

    public static boolean b(Context context) {
        try {
            com.baidu.mshield.x6.b.b bVar = new com.baidu.mshield.x6.b.b(context);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - bVar.I() > 86400000) {
                bVar.e(1);
                bVar.b(currentTimeMillis);
                com.baidu.mshield.b.c.a.a("time limit , reset last time and count");
            }
            int H = bVar.H();
            if (H >= bVar.k()) {
                com.baidu.mshield.b.c.a.a("count limit return false ");
                return false;
            }
            int i8 = H + 1;
            bVar.e(i8);
            com.baidu.mshield.b.c.a.a("count not limit return true , count : " + i8);
            return true;
        } catch (Throwable th) {
            f.b(th);
            return false;
        }
    }

    public static void b(Context context, String str) {
        int i8;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.baidu.mshield.x6.b.b bVar = new com.baidu.mshield.x6.b.b(context);
            JSONObject jSONObject = new JSONObject(str);
            com.baidu.mshield.b.c.a.a("sdata:" + str);
            JSONObject optJSONObject = jSONObject.optJSONObject("1");
            if (optJSONObject != null) {
                bVar.a(com.baidu.mshield.x6.b.b.f8501a, optJSONObject.toString());
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("2");
            if (optJSONObject2 != null) {
                bVar.a(com.baidu.mshield.x6.b.b.f8502b, optJSONObject2.toString());
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject(ExifInterface.GPS_MEASUREMENT_3D);
            if (optJSONObject3 != null) {
                bVar.a(com.baidu.mshield.x6.b.b.f8503c, optJSONObject3.toString());
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("4");
            if (optJSONObject4 != null) {
                bVar.a(com.baidu.mshield.x6.b.b.f8504d, optJSONObject4.toString());
            }
            JSONObject optJSONObject5 = jSONObject.optJSONObject(ErrorCode.PARAMETER_ERROR);
            if (optJSONObject5 != null) {
                bVar.a(com.baidu.mshield.x6.b.b.f8505e, optJSONObject5.toString());
            }
            JSONObject optJSONObject6 = jSONObject.optJSONObject("6");
            if (optJSONObject6 != null) {
                bVar.a(com.baidu.mshield.x6.b.b.f8506f, optJSONObject6.toString());
            }
            JSONObject optJSONObject7 = jSONObject.optJSONObject("7");
            if (optJSONObject7 != null) {
                bVar.a(com.baidu.mshield.x6.b.b.f8507g, optJSONObject7.toString());
            }
            JSONObject optJSONObject8 = jSONObject.optJSONObject("8");
            if (optJSONObject8 != null) {
                bVar.a(com.baidu.mshield.x6.b.b.f8508h, optJSONObject8.toString());
            }
            JSONObject optJSONObject9 = jSONObject.optJSONObject("9");
            if (optJSONObject9 != null) {
                bVar.a(com.baidu.mshield.x6.b.b.f8509i, optJSONObject9.toString());
            }
            JSONObject optJSONObject10 = jSONObject.optJSONObject("10");
            if (optJSONObject10 != null) {
                bVar.a(com.baidu.mshield.x6.b.b.f8510j, optJSONObject10.toString());
            }
            JSONObject optJSONObject11 = jSONObject.optJSONObject("11");
            if (optJSONObject11 != null) {
                bVar.a(com.baidu.mshield.x6.b.b.f8511k, optJSONObject11.toString());
            }
            JSONObject optJSONObject12 = jSONObject.optJSONObject("12");
            if (optJSONObject12 != null) {
                bVar.a(com.baidu.mshield.x6.b.b.f8512l, optJSONObject12.toString());
            }
            JSONObject optJSONObject13 = jSONObject.optJSONObject("13");
            if (optJSONObject13 != null) {
                bVar.a(com.baidu.mshield.x6.b.b.f8513m, optJSONObject13.toString());
            }
            JSONObject optJSONObject14 = jSONObject.optJSONObject("14");
            if (optJSONObject14 != null) {
                try {
                    JSONObject optJSONObject15 = optJSONObject14.optJSONObject("2");
                    if (optJSONObject15 != null && optJSONObject15.has("1")) {
                        String optString = optJSONObject15.optString("1");
                        com.baidu.mshield.b.c.a.a("14 prv 1 origin : " + optString);
                        optJSONObject15.put("1", Base64.encodeToString(com.baidu.mshield.b.a.c.a(optString.getBytes()), 0));
                        optJSONObject14.put("2", optJSONObject15);
                    }
                } catch (Throwable th) {
                    f.b(th);
                }
                bVar.a(com.baidu.mshield.x6.b.b.f8514n, optJSONObject14.toString());
            }
            JSONObject optJSONObject16 = jSONObject.optJSONObject("15");
            if (optJSONObject16 != null) {
                try {
                    JSONObject jSONObject2 = optJSONObject16.getJSONObject("2");
                    if (jSONObject2 != null && (i8 = jSONObject2.getInt("1")) != bVar.o() && i8 > 0) {
                        bVar.l(i8);
                    }
                } catch (Throwable th2) {
                    f.b(th2);
                }
            }
            JSONObject optJSONObject17 = jSONObject.optJSONObject("19");
            if (optJSONObject17 != null) {
                com.baidu.mshield.b.c.a.a("emulator retry policy:" + optJSONObject17.toString());
                JSONObject optJSONObject18 = optJSONObject17.optJSONObject("2");
                StringBuilder sb = new StringBuilder();
                sb.append("emulator 2 json:");
                sb.append(optJSONObject18);
                com.baidu.mshield.b.c.a.a(sb.toString() == null ? "null" : optJSONObject18.toString());
                if (optJSONObject18 != null) {
                    int optInt = optJSONObject18.optInt("1", 0);
                    com.baidu.mshield.b.c.a.a("emulator set totalCount:" + optInt);
                    bVar.c(optInt);
                }
            }
            JSONObject optJSONObject19 = jSONObject.optJSONObject("20");
            if (optJSONObject19 != null) {
                bVar.a(com.baidu.mshield.x6.b.b.f8515o, optJSONObject19.toString());
            }
            JSONObject optJSONObject20 = jSONObject.optJSONObject("22");
            if (optJSONObject20 != null) {
                JSONObject optJSONObject21 = optJSONObject20.optJSONObject("2");
                com.baidu.mshield.b.c.a.b("intervalJson=" + optJSONObject21);
                if (optJSONObject21 != null) {
                    bVar.f(optJSONObject21.optInt("1", com.crrepa.band.my.device.customkey.util.c.MAX_GOAL_TIME));
                    bVar.h(optJSONObject21.optInt("2", 360));
                    bVar.g(optJSONObject21.optInt(ExifInterface.GPS_MEASUREMENT_3D, 360));
                    bVar.b(optJSONObject21.optInt("6", 10));
                    bVar.j(optJSONObject21.optInt("7", 10));
                }
            }
            JSONObject optJSONObject22 = jSONObject.optJSONObject("23");
            if (optJSONObject22 != null) {
                bVar.a(com.baidu.mshield.x6.b.b.f8516p, optJSONObject22.toString());
            }
            JSONObject optJSONObject23 = jSONObject.optJSONObject("24");
            if (optJSONObject23 != null) {
                bVar.a(com.baidu.mshield.x6.b.b.f8517q, optJSONObject23.toString());
            }
            JSONObject optJSONObject24 = jSONObject.optJSONObject("25");
            if (optJSONObject24 != null) {
                bVar.a(com.baidu.mshield.x6.b.b.f8518r, optJSONObject24.toString());
            }
            JSONObject optJSONObject25 = jSONObject.optJSONObject("26");
            if (optJSONObject25 != null) {
                bVar.a(com.baidu.mshield.x6.b.b.f8519s, optJSONObject25.toString());
            }
            JSONObject optJSONObject26 = jSONObject.optJSONObject("27");
            if (optJSONObject26 != null) {
                bVar.a(com.baidu.mshield.x6.b.b.f8520t, optJSONObject26.toString());
            }
            JSONObject optJSONObject27 = jSONObject.optJSONObject("28");
            if (optJSONObject27 != null) {
                bVar.a(com.baidu.mshield.x6.b.b.f8521u, optJSONObject27.toString());
            }
            bVar.r(f.c());
            com.baidu.mshield.b.c.a.a("pull static Policy for load success");
        } catch (Throwable th3) {
            f.b(th3);
        }
    }

    public static int a(Context context, String str, int i8) {
        String str2;
        try {
            com.baidu.mshield.x6.b.b bVar = new com.baidu.mshield.x6.b.b(context);
            if (!com.baidu.mshield.b.a.d.b(context)) {
                bVar.d(-1);
                return -100;
            }
            String a8 = new com.baidu.mshield.x6.d.a(context, null).a(str);
            if (TextUtils.isEmpty(a8)) {
                if (bVar.F() == 0) {
                    bVar.d(-2);
                }
                return -100;
            }
            bVar.x(a8);
            JSONObject jSONObject = new JSONObject(a8);
            com.baidu.mshield.x6.b.c cVar = new com.baidu.mshield.x6.b.c(context);
            try {
                String optString = jSONObject.optString(BaseParamNames.TOKEN);
                if (!TextUtils.isEmpty(optString)) {
                    if (i8 == 1) {
                        cVar.b(optString);
                        cVar.c(String.valueOf(System.currentTimeMillis()));
                    } else {
                        cVar.a(optString);
                        cVar.d(String.valueOf(System.currentTimeMillis()));
                        cVar.b("");
                        cVar.c("");
                        bVar.d(System.currentTimeMillis());
                    }
                }
                bVar.g(true);
            } catch (Throwable th) {
                f.b(th);
            }
            try {
                str2 = jSONObject.optString("nc");
            } catch (Throwable th2) {
                f.b(th2);
                str2 = "";
            }
            if (bVar.z()) {
                bVar.a(false);
            }
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("rmf");
                if (optJSONObject != null) {
                    if (f.a(context, false)) {
                        bVar.v(optJSONObject.toString());
                        f8570e = "";
                    } else {
                        f8570e = optJSONObject.toString();
                        bVar.p();
                    }
                    com.baidu.mshield.b.c.a.a("getZidChecktor ungzRmf : " + new String(com.baidu.mshield.b.a.c.b(Base64.decode(optJSONObject.optString("1").getBytes(), 0)), "utf-8"));
                } else {
                    f8570e = "";
                }
            } catch (Throwable th3) {
                f.b(th3);
            }
            if ((!TextUtils.equals(str2, "1") && (!jSONObject.has("nt") || jSONObject.optInt("nt") <= 0)) || !b(context)) {
                return 0;
            }
            try {
                if (!TextUtils.isEmpty(str2) && TextUtils.equals(str2, "1")) {
                    com.baidu.mshield.x6.e.h.a(context).a(2, true);
                }
            } catch (Throwable th4) {
                f.b(th4);
            }
            try {
                int optInt = jSONObject.optInt("op");
                bVar.w(jSONObject.optJSONArray("da").toString());
                bVar.i(optInt);
                if (jSONObject.has("nt") && jSONObject.optInt("nt") > 0) {
                    bVar.g(false);
                    com.baidu.mshield.x6.f.m.c.b().a(new a(jSONObject.optInt("nt"), context));
                }
                return 0;
            } catch (Throwable th5) {
                f.b(th5);
                return -100;
            }
        } catch (Throwable th6) {
            f.b(th6);
            try {
                com.baidu.mshield.x6.b.b bVar2 = new com.baidu.mshield.x6.b.b(context);
                if (bVar2.F() == 0) {
                    bVar2.d(-4);
                }
            } catch (Throwable th7) {
                f.b(th7);
            }
            return -100;
        }
    }

    public static String a(Context context) {
        try {
            com.baidu.mshield.x6.d.a aVar = new com.baidu.mshield.x6.d.a(context, null);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("4", com.baidu.mshield.b.b.a.a(context));
            JSONObject jSONObject2 = new JSONObject();
            com.baidu.mshield.x6.b.b bVar = new com.baidu.mshield.x6.b.b(context);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("1", bVar.x());
            String L = bVar.L();
            if (TextUtils.isEmpty(L)) {
                String a8 = com.baidu.mshield.b.a.g.a(context);
                com.baidu.mshield.b.c.a.a(" manufacturer: " + a8.toLowerCase());
                if (!TextUtils.isEmpty(a8)) {
                    L = com.baidu.mshield.b.f.e.a(a8.toLowerCase());
                    bVar.l(L);
                }
            }
            jSONObject3.put("2", L);
            String M = bVar.M();
            if (TextUtils.isEmpty(M)) {
                String propertyByType = EngineImpl.getInstance(context).getPropertyByType("mod");
                com.baidu.mshield.b.c.a.a(" model: " + propertyByType.toLowerCase());
                if (!TextUtils.isEmpty(propertyByType)) {
                    M = com.baidu.mshield.b.f.e.a(propertyByType.toLowerCase());
                    bVar.m(M);
                }
            }
            jSONObject3.put(ExifInterface.GPS_MEASUREMENT_3D, M);
            String s7 = bVar.s();
            if (TextUtils.isEmpty(s7)) {
                String lowerCase = Build.ID.toLowerCase();
                com.baidu.mshield.b.c.a.a(" buildId: " + lowerCase);
                s7 = com.baidu.mshield.b.f.e.a(lowerCase);
                bVar.d(s7);
            }
            jSONObject3.put("4", s7);
            String d8 = bVar.d();
            if (TextUtils.isEmpty(d8)) {
                String b8 = com.baidu.mshield.b.a.g.b(context);
                com.baidu.mshield.b.c.a.a(" romName: " + b8.toLowerCase());
                if (!TextUtils.isEmpty(b8)) {
                    d8 = com.baidu.mshield.b.f.e.a(b8.toLowerCase());
                    bVar.t(d8);
                }
            }
            jSONObject3.put(ErrorCode.PARAMETER_ERROR, d8);
            String e8 = bVar.e();
            if (TextUtils.isEmpty(e8)) {
                String c8 = com.baidu.mshield.b.a.g.c(context);
                com.baidu.mshield.b.c.a.a(" romVersion: " + c8.toLowerCase());
                if (!TextUtils.isEmpty(c8)) {
                    e8 = com.baidu.mshield.b.f.e.a(c8.toLowerCase());
                    bVar.u(e8);
                }
            }
            jSONObject3.put("6", e8);
            String t7 = bVar.t();
            if (TextUtils.isEmpty(t7)) {
                String propertyByType2 = EngineImpl.getInstance(context).getPropertyByType("arv");
                com.baidu.mshield.b.c.a.a(" romVersion: " + propertyByType2.toLowerCase());
                if (!TextUtils.isEmpty(propertyByType2)) {
                    t7 = com.baidu.mshield.b.f.e.a(propertyByType2.toLowerCase());
                    bVar.e(t7);
                }
            }
            jSONObject3.put("7", t7);
            String d9 = f.d(context);
            if (TextUtils.isEmpty(d9)) {
                jSONObject3.put("9", "");
            } else {
                try {
                    jSONObject3.put("9", new JSONObject(d9).optString("2", ""));
                } catch (Throwable th) {
                    f.b(th);
                }
            }
            jSONObject2.put("f", jSONObject3);
            jSONObject.put("module_section", new JSONArray().put(jSONObject2));
            com.baidu.mshield.b.c.a.a("f/2/sig post body : " + jSONObject.toString());
            return aVar.c(jSONObject.toString());
        } catch (Throwable unused) {
            return "";
        }
    }
}
