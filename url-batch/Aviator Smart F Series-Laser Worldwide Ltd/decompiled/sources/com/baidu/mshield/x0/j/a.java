package com.baidu.mshield.x0.j;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.mshield.b.a.c;
import com.baidu.mshield.b.f.e;
import com.baidu.mshield.x0.EngineImpl;
import com.baidu.mshield.x0.d.d;
import com.baidu.mshield.x6.f.f;
import com.baidu.mshield.x6.f.l;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.my.lib.data.ErrorCode;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static a f8479a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f8480b;

    /* renamed from: com.baidu.mshield.x0.j.a$a, reason: collision with other inner class name */
    public class C0090a extends com.baidu.mshield.x0.d.h.b {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f8481b;

        public C0090a(b bVar) {
            this.f8481b = bVar;
        }

        @Override // com.baidu.mshield.x0.d.h.b
        public void b() {
            a.this.a(this.f8481b);
        }
    }

    public interface b {
        void a(int i8);
    }

    public a(Context context) {
        this.f8480b = context;
    }

    public final void b(JSONObject jSONObject) {
        try {
            com.baidu.mshield.b.c.a.b("handleRmfPolicy:" + jSONObject);
            if (jSONObject == null) {
                l.f8570e = "";
                return;
            }
            boolean a8 = f.a(this.f8480b, false);
            com.baidu.mshield.x6.b.b bVar = new com.baidu.mshield.x6.b.b(this.f8480b);
            if (a8) {
                bVar.v(jSONObject.toString());
                l.f8570e = "";
            } else {
                l.f8570e = jSONObject.toString();
                bVar.p();
            }
            com.baidu.mshield.b.c.a.b("handleRmfPolicy ungz:" + new String(c.b(Base64.decode(jSONObject.optString("1").getBytes(), 0)), "utf-8"));
        } catch (Throwable th) {
            d.a(th);
        }
    }

    public static synchronized a a(Context context) {
        a aVar;
        synchronized (a.class) {
            try {
                if (f8479a == null) {
                    f8479a = new a(context);
                }
                aVar = f8479a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public final int a(b bVar) {
        try {
            com.baidu.mshield.x0.l.a aVar = new com.baidu.mshield.x0.l.a(this.f8480b);
            long j8 = aVar.j();
            long m8 = aVar.m() * 60000;
            long currentTimeMillis = System.currentTimeMillis();
            if (m8 <= 0) {
                if (bVar != null) {
                    bVar.a(1);
                }
                return 1;
            }
            if (currentTimeMillis - j8 >= m8) {
                boolean a8 = d.n(this.f8480b) ? a() : false;
                aVar.c(currentTimeMillis);
                if (a8) {
                    if (bVar != null) {
                        bVar.a(0);
                    }
                    return 0;
                }
            }
            if (bVar != null) {
                bVar.a(1);
            }
            return 1;
        } catch (Throwable th) {
            d.a(th);
            if (bVar != null) {
                bVar.a(2);
            }
            return 2;
        }
    }

    public final void b(String str) {
        try {
            com.baidu.mshield.b.c.a.b("handleFgPolicy:" + str);
            l.b(this.f8480b, str);
        } catch (Throwable th) {
            d.a(th);
        }
    }

    public int a(b bVar, boolean z7) {
        if (z7) {
            com.baidu.mshield.x0.d.h.d.b().a(new C0090a(bVar));
            return 0;
        }
        return a(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a A[Catch: all -> 0x0175, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0175, blocks: (B:5:0x0008, B:19:0x004b, B:23:0x005a, B:56:0x016f, B:61:0x0148, B:65:0x012e, B:69:0x0114, B:72:0x00de, B:76:0x00b5, B:81:0x009e, B:85:0x0087, B:90:0x0046, B:43:0x0117, B:45:0x011f, B:62:0x0125, B:29:0x008a, B:31:0x0092, B:77:0x0098, B:39:0x00e1, B:41:0x00e9, B:66:0x010e, B:47:0x0131, B:49:0x0139, B:58:0x013f, B:37:0x00b8, B:33:0x00a1, B:35:0x00a9, B:73:0x00af, B:51:0x014b, B:25:0x0073, B:27:0x007b, B:82:0x0081), top: B:4:0x0008, inners: #1, #3, #6, #7, #8, #9, #10, #12 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0087 -> B:28:0x008a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean a() {
        String str;
        Throwable th;
        String str2;
        HashMap<String, String> b8;
        String str3 = "";
        String str4 = "";
        try {
            com.baidu.mshield.x0.l.a aVar = new com.baidu.mshield.x0.l.a(this.f8480b);
            try {
                b8 = new com.baidu.mshield.x0.i.a(this.f8480b, null).b();
            } catch (Throwable th2) {
                str = "";
                th = th2;
            }
            if (b8 == null) {
                return false;
            }
            String str5 = b8.get("decrpt");
            try {
                str2 = b8.get("url");
                try {
                    str4 = b8.get(FirebaseAnalytics.Param.SOURCE);
                } catch (Throwable th3) {
                    th = th3;
                    str = str2;
                    str3 = str5;
                    d.a(th);
                    str5 = str3;
                    str2 = str;
                    aVar.d(System.currentTimeMillis());
                    if (!TextUtils.isEmpty(str5)) {
                    }
                }
            } catch (Throwable th4) {
                str = "";
                th = th4;
            }
            aVar.d(System.currentTimeMillis());
            if (!TextUtils.isEmpty(str5)) {
                return false;
            }
            com.baidu.mshield.b.c.a.b("policy sdata====" + str5);
            JSONObject jSONObject = new JSONObject(str5);
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("sec");
                if (jSONObject2 != null) {
                    a(jSONObject2, str5, str2, str4);
                } else {
                    com.baidu.mshield.b.c.a.b("sec sdata is empty ");
                }
            } catch (Throwable th5) {
                d.a(th5);
            }
            try {
                String optString = jSONObject.optString("fig");
                if (optString != null) {
                    b(optString);
                } else {
                    com.baidu.mshield.b.c.a.b("finger sdata is empty ");
                }
            } catch (Throwable th6) {
                d.a(th6);
            }
            try {
                String optString2 = jSONObject.optString("sig");
                if (optString2 != null) {
                    a(optString2);
                } else {
                    com.baidu.mshield.b.c.a.b("sig sdata is empty ");
                }
            } catch (Throwable th7) {
                d.a(th7);
            }
            try {
                String optString3 = jSONObject.optString("prv");
                com.baidu.mshield.b.c.a.b("privacyPolicy===" + optString3);
                new com.baidu.mshield.x0.l.c(this.f8480b).c(optString3);
            } catch (Throwable th8) {
                d.a(th8);
            }
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("sgs");
                if (optJSONObject != null) {
                    com.baidu.mshield.b.c.a.b("sgs data ：" + optJSONObject.toString());
                    l.f8567b = optJSONObject.optString(ExifInterface.GPS_MEASUREMENT_3D, "");
                } else {
                    com.baidu.mshield.b.c.a.b("sgs sdata is empty ");
                }
            } catch (Throwable th9) {
                d.a(th9);
            }
            try {
                JSONObject optJSONObject2 = jSONObject.optJSONObject("drf");
                if (optJSONObject2 != null) {
                    a(optJSONObject2);
                } else {
                    com.baidu.mshield.b.c.a.b("drf sdata is empty ");
                    a((JSONObject) null);
                }
            } catch (Throwable th10) {
                d.a(th10);
            }
            try {
                JSONObject optJSONObject3 = jSONObject.optJSONObject("rmf");
                if (optJSONObject3 != null) {
                    b(optJSONObject3);
                } else {
                    com.baidu.mshield.b.c.a.b("rmf sdata is empty ");
                    b((JSONObject) null);
                }
            } catch (Throwable th11) {
                d.a(th11);
            }
            try {
                String optString4 = jSONObject.optString("ids");
                com.baidu.mshield.b.c.a.b("ids===" + optString4);
                EngineImpl.getInstance(this.f8480b).ids = optString4;
            } catch (Throwable th12) {
                d.a(th12);
            }
            return true;
        } catch (Throwable th13) {
            d.a(th13);
            return false;
        }
    }

    public final void a(JSONObject jSONObject) {
        try {
            com.baidu.mshield.b.c.a.b("handleDrfPolicy:" + jSONObject);
            com.baidu.mshield.x6.b.b bVar = new com.baidu.mshield.x6.b.b(this.f8480b);
            if (jSONObject == null) {
                l.f8569d = "";
                return;
            }
            l.f8569d = jSONObject.toString();
            com.baidu.mshield.b.c.a.b("handleDrfPolicy ungz:" + new String(c.b(Base64.decode(jSONObject.optString("1").getBytes(), 0)), "utf-8"));
            bVar.g(jSONObject.optString("2"));
        } catch (Throwable th) {
            d.a(th);
        }
    }

    public final void a(com.baidu.mshield.x0.l.a aVar, JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(ErrorCode.PARAMETER_ERROR);
        if (optJSONObject != null) {
            int optInt = optJSONObject.optInt("1", 0);
            if (optInt == 0 && aVar.d()) {
                EngineImpl.getInstance(this.f8480b).unload();
            }
            aVar.b(optInt);
            aVar.f(optJSONObject.optInt("9", 0));
            aVar.g(optJSONObject.optInt("15", 3));
        }
    }

    public final void a(JSONObject jSONObject, String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        int i8;
        try {
            com.baidu.mshield.b.c.a.b("handleSecPolicy:" + jSONObject.toString());
            com.baidu.mshield.x0.l.a aVar = new com.baidu.mshield.x0.l.a(this.f8480b);
            JSONObject optJSONObject = jSONObject.optJSONObject(ExifInterface.GPS_MEASUREMENT_3D);
            if (optJSONObject != null) {
                str4 = "95";
                try {
                    aVar.b("plc03", optJSONObject.toString());
                    com.baidu.mshield.b.c.a.b(ExifInterface.GPS_MEASUREMENT_3D + optJSONObject);
                } catch (Throwable th) {
                    th = th;
                    d.a(th);
                    return;
                }
            } else {
                str4 = "95";
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("15");
            if (optJSONObject2 != null) {
                aVar.b("plc15", optJSONObject2.toString());
                com.baidu.mshield.b.c.a.b("15" + optJSONObject2);
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("16");
            if (optJSONObject3 != null) {
                aVar.b("plc16", optJSONObject3.toString());
                com.baidu.mshield.b.c.a.b("16" + optJSONObject3);
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("18");
            if (optJSONObject4 != null) {
                aVar.b("plc18", optJSONObject4.toString());
                com.baidu.mshield.b.c.a.b("18" + optJSONObject4);
            }
            JSONObject optJSONObject5 = jSONObject.optJSONObject("20");
            if (optJSONObject5 != null) {
                aVar.b("plc20", optJSONObject5.toString());
                com.baidu.mshield.b.c.a.b("20" + optJSONObject5);
            }
            JSONObject optJSONObject6 = jSONObject.optJSONObject("36");
            if (optJSONObject6 != null) {
                aVar.b("plc36", optJSONObject6.toString());
                com.baidu.mshield.b.c.a.b("36" + optJSONObject6);
            }
            JSONObject optJSONObject7 = jSONObject.optJSONObject("62");
            if (optJSONObject7 != null) {
                aVar.b("plc62", optJSONObject7.toString());
                com.baidu.mshield.b.c.a.b("62" + optJSONObject7.toString());
            }
            JSONObject optJSONObject8 = jSONObject.optJSONObject("71");
            if (optJSONObject8 != null) {
                aVar.b("plc71", optJSONObject8.toString());
                com.baidu.mshield.b.c.a.b("71" + optJSONObject8);
            }
            JSONObject optJSONObject9 = jSONObject.optJSONObject("83");
            if (optJSONObject9 != null) {
                aVar.b("plc83", optJSONObject9.toString());
                com.baidu.mshield.b.c.a.b("83" + optJSONObject9);
            }
            JSONObject optJSONObject10 = jSONObject.optJSONObject("84");
            if (optJSONObject10 != null) {
                aVar.b("plc84", optJSONObject10.toString());
                com.baidu.mshield.b.c.a.b("84" + optJSONObject10);
            }
            JSONObject optJSONObject11 = jSONObject.optJSONObject("94");
            if (optJSONObject11 != null) {
                aVar.b("plc94", optJSONObject11.toString());
                com.baidu.mshield.b.c.a.b("94" + optJSONObject11);
            }
            String str7 = str4;
            JSONObject optJSONObject12 = jSONObject.optJSONObject(str7);
            if (optJSONObject12 != null) {
                aVar.b("plc95", optJSONObject12.toString());
                com.baidu.mshield.b.c.a.b(str7 + optJSONObject12.toString());
            }
            JSONObject optJSONObject13 = jSONObject.optJSONObject("107");
            if (optJSONObject13 != null) {
                aVar.b("plc107", optJSONObject13.toString());
                com.baidu.mshield.b.c.a.b("107" + optJSONObject13.toString());
                if (optJSONObject13.has(ErrorCode.PARAMETER_ERROR)) {
                    JSONObject optJSONObject14 = optJSONObject13.optJSONObject(ErrorCode.PARAMETER_ERROR);
                    if (optJSONObject14.has("t")) {
                        aVar.d(optJSONObject14.optInt("t", com.crrepa.band.my.device.customkey.util.c.MAX_GOAL_TIME));
                    }
                }
            }
            JSONObject optJSONObject15 = jSONObject.optJSONObject("51");
            if (optJSONObject15 != null) {
                aVar.b("plc51", optJSONObject15.toString());
                try {
                    a(aVar, optJSONObject15);
                    com.baidu.mshield.b.c.a.b("51" + optJSONObject15.toString());
                } catch (Throwable th2) {
                    th = th2;
                    d.a(th);
                    return;
                }
            }
            JSONObject optJSONObject16 = jSONObject.optJSONObject("102");
            if (optJSONObject16 != null) {
                aVar.b("plc102", optJSONObject16.toString());
                int optInt = optJSONObject16.optJSONObject(ErrorCode.PARAMETER_ERROR).optInt("1", 60);
                aVar.c(optInt);
                com.baidu.mshield.x0.g.a.f8466d = optInt;
                com.baidu.mshield.b.c.a.b("102" + optJSONObject16.toString());
            }
            JSONObject optJSONObject17 = jSONObject.optJSONObject("104");
            if (optJSONObject17 != null) {
                aVar.b("plc104", optJSONObject17.toString());
                com.baidu.mshield.b.c.a.b("104" + optJSONObject17.toString());
            }
            JSONObject optJSONObject18 = jSONObject.optJSONObject("114");
            if (optJSONObject18 != null) {
                com.baidu.mshield.b.c.a.b("114" + optJSONObject18.toString());
                JSONObject optJSONObject19 = optJSONObject18.optJSONObject(ErrorCode.PARAMETER_ERROR);
                if (optJSONObject19.has("uv6") && optJSONObject19.optJSONObject("uv6").has("2")) {
                    com.baidu.mshield.x0.c.a.f8416a = optJSONObject19.optJSONObject("uv6").optString("2");
                    com.baidu.mshield.b.c.a.b("policy detect app encrypt===" + com.baidu.mshield.x0.c.a.f8416a);
                    optJSONObject19.optJSONObject("uv6").remove("2");
                    com.baidu.mshield.b.c.a.b("policy detect encryptStr====" + com.baidu.mshield.x0.c.a.f8416a);
                    aVar.b("plc114", optJSONObject18.toString());
                } else {
                    aVar.b("plc114", optJSONObject18.toString());
                }
            }
            JSONObject optJSONObject20 = jSONObject.optJSONObject("115");
            if (optJSONObject20 != null) {
                String c8 = aVar.c("plc115");
                String str8 = "";
                if (TextUtils.isEmpty(c8)) {
                    str5 = "";
                    str6 = str5;
                } else {
                    JSONObject jSONObject2 = new JSONObject(c8);
                    aVar.a(jSONObject2.optInt(ExifInterface.GPS_MEASUREMENT_3D));
                    JSONObject optJSONObject21 = jSONObject2.optJSONObject(ErrorCode.PARAMETER_ERROR);
                    str6 = (optJSONObject21.has("uv4") && optJSONObject21.optJSONObject("uv4").has("2")) ? optJSONObject21.optJSONObject("uv4").optString("2") : "";
                    str5 = (optJSONObject21.has("uv4") && optJSONObject21.optJSONObject("uv4").has("4")) ? optJSONObject21.optJSONObject("uv4").optString("4") : "";
                }
                com.baidu.mshield.b.c.a.b("115" + optJSONObject20.toString());
                JSONObject optJSONObject22 = optJSONObject20.optJSONObject(ErrorCode.PARAMETER_ERROR);
                if (optJSONObject22.has("uv4")) {
                    JSONObject optJSONObject23 = optJSONObject22.optJSONObject("uv4");
                    if (optJSONObject23.has("4")) {
                        str8 = optJSONObject23.optString("4");
                        aVar.e(str8);
                    }
                    int i9 = 0;
                    if (optJSONObject23.has("7")) {
                        int optInt2 = optJSONObject23.optJSONObject("7").optInt("2", 0);
                        i8 = optJSONObject23.optJSONObject("7").optInt(ExifInterface.GPS_MEASUREMENT_3D, 0);
                        i9 = optInt2;
                    } else {
                        i8 = 0;
                    }
                    if (optJSONObject23.has("2")) {
                        String optString = optJSONObject23.optString("2");
                        if (i9 != 0 && !TextUtils.isEmpty(str8)) {
                            if (TextUtils.isEmpty(optString) && !TextUtils.isEmpty(str8) && str8.equals(str5)) {
                                optJSONObject23.put("2", str6);
                            }
                        }
                        com.baidu.mshield.x0.c.c.f8420a = optString;
                        optJSONObject23.remove("2");
                    }
                    if (!TextUtils.isEmpty(str8) && !str8.equals(str5) && i8 == 1) {
                        aVar.a(0L);
                    }
                    aVar.b("plc115", optJSONObject20.toString());
                } else {
                    aVar.b("plc115", optJSONObject20.toString());
                }
            }
            aVar.a(true);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void a(String str) {
        try {
            com.baidu.mshield.b.c.a.b("handleEmulatorSig:" + str);
            if (!TextUtils.isEmpty(str)) {
                String a8 = e.a(str);
                l.f8568c = a8;
                new com.baidu.mshield.x6.b.b(this.f8480b).h(a8);
                String str2 = new String(c.b(Base64.decode(str.getBytes(), 0)), "utf-8");
                com.baidu.mshield.b.c.a.b("handleEmulatorSig ungz:" + str2);
                l.f8566a = str2;
            } else {
                f.c(this.f8480b);
            }
        } catch (Throwable th) {
            d.a(th);
        }
    }
}
