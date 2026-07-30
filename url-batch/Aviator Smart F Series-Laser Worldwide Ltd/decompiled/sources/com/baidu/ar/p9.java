package com.baidu.ar;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.baidu.ar.arplay.core.engine.ARPScriptEnvironment;
import com.baidu.ar.arplay.core.message.ARPMessageType;
import com.baidu.ar.ihttp.HttpFactory;
import com.baidu.ar.ihttp.IHttpRequest;
import com.baidu.ar.obr.OBRConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class p9 {

    /* renamed from: b, reason: collision with root package name */
    public OBRConfig f2942b;

    /* renamed from: d, reason: collision with root package name */
    public final r3 f2944d;

    /* renamed from: e, reason: collision with root package name */
    public s3 f2945e;

    /* renamed from: f, reason: collision with root package name */
    public String f2946f;

    /* renamed from: g, reason: collision with root package name */
    public String f2947g;

    /* renamed from: h, reason: collision with root package name */
    public long f2948h = 0;

    /* renamed from: i, reason: collision with root package name */
    public HashMap<String, Long> f2949i = new HashMap<>();

    /* renamed from: j, reason: collision with root package name */
    public p6 f2950j = new b();

    /* renamed from: a, reason: collision with root package name */
    public o6 f2941a = o9.b();

    /* renamed from: c, reason: collision with root package name */
    public n6 f2943c = o9.a();

    public class a implements s3 {
        public a() {
        }

        @Override // com.baidu.ar.s3
        public List<Integer> a() {
            return Arrays.asList(Integer.valueOf(ARPMessageType.MSG_TYPE_OBR_TO_SDK));
        }

        @Override // com.baidu.ar.s3
        public void a(int i8, int i9, HashMap<String, Object> hashMap) {
            if (i8 == 8200) {
                p9.this.c("OBRModule receive msg : 8200");
                p9.this.a(hashMap);
            }
        }
    }

    public class b implements p6 {
        public b() {
        }

        @Override // com.baidu.ar.p6
        public void a(String str) {
            String str2 = p9.this.f2947g + p9.this.b(str);
            p9.this.c("OBRDownloader download success result : " + str);
            if (p9.this.f2943c != null) {
                p9.this.f2943c.c(str);
            }
            if (p9.this.f2949i.get(str) != null) {
                long currentTimeMillis = System.currentTimeMillis() - ((Long) p9.this.f2949i.get(str)).longValue();
                long j8 = currentTimeMillis / 1000;
                long j9 = (j8 / 60) % 60;
                long j10 = j8 % 60;
                p9.this.f2949i.put(str, Long.valueOf(currentTimeMillis));
            }
            p9.this.a("response_obr_path", "obr_path", str2, str);
        }
    }

    public p9(Context context, r3 r3Var, OBRConfig oBRConfig) {
        this.f2946f = null;
        this.f2944d = r3Var;
        f();
        if (oBRConfig != null) {
            this.f2942b = oBRConfig;
            this.f2946f = oBRConfig.getBaseUrl();
            this.f2947g = oBRConfig.getDirectory();
            o6 o6Var = this.f2941a;
            if (o6Var != null) {
                o6Var.a(context);
                if (oBRConfig.isLogEnable()) {
                    h.a("OBRModule", "OBRDownloader open Success");
                }
                try {
                    this.f2943c.a(oBRConfig.getBaseUrl(), oBRConfig.getDirectory(), oBRConfig.getMaxSize());
                    if (oBRConfig.isLogEnable()) {
                        h.a("OBRModule", "OBRCache open Success");
                        this.f2941a.a(true);
                        this.f2943c.a(true);
                    }
                } catch (Exception e8) {
                    if (oBRConfig.isLogEnable()) {
                        h.a("OBRModule", "OBRCache open failed : " + e8.getMessage());
                    }
                }
            }
        }
    }

    public void d() {
        int i8 = 0;
        long j8 = 0;
        for (String str : this.f2949i.keySet()) {
            i8++;
            long longValue = this.f2949i.get(str).longValue();
            j8 += longValue;
            long j9 = longValue / 1000;
            c("下载（" + str + "）所需时间：" + ((int) ((j9 / 60) % 60)) + ":" + ((int) (j9 % 60)) + "." + (longValue % 1000));
        }
        long j10 = j8 / i8;
        long j11 = j10 / 1000;
        c("下载（" + i8 + "）个模型所需平均时间：" + ((int) ((j11 / 60) % 60)) + ":" + ((int) (j11 % 60)) + "." + (j10 % 1000));
        if (this.f2948h != 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f2948h;
            long j12 = currentTimeMillis / 1000;
            c("下载（" + i8 + "）个模型总共需要时间：" + ((int) ((j12 / 60) % 60)) + ":" + ((int) (j12 % 60)) + "." + (currentTimeMillis % 1000));
        }
        this.f2949i.clear();
    }

    public void e() {
        HashMap hashMap = new HashMap();
        hashMap.put("gesture_scroll", "interaction_obr_move");
        hashMap.put("gesture_two_finger_scroll", "interaction_obr_rotate");
        hashMap.put("gesture_two_finger_rotate", "interaction_obr_rotate");
        hashMap.put("gesture_two_finger_pinch", "interaction_obr_scale_down");
        hashMap.put("gesture_two_finger_unpinch", "interaction_obr_scale_up");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("continuous_mapping", hashMap);
        ARPScriptEnvironment.getInstance().setSharedEnvironmentKV("interactioninfo", hashMap2);
    }

    public final void f() {
        a aVar = new a();
        this.f2945e = aVar;
        r3 r3Var = this.f2944d;
        if (r3Var != null) {
            r3Var.a(aVar);
        }
    }

    public final String a(String str) {
        if (this.f2942b == null || this.f2946f == null) {
            return str;
        }
        return this.f2946f + str;
    }

    public void c() {
        o6 o6Var = this.f2941a;
        if (o6Var != null) {
            o6Var.resume();
        }
    }

    public final boolean d(String str) {
        if (this.f2943c.d(str)) {
            String a8 = a(str);
            if (!TextUtils.isEmpty(a8)) {
                return a(a8, str);
            }
        }
        return false;
    }

    public void a() {
        o6 o6Var = this.f2941a;
        if (o6Var != null) {
            o6Var.pause();
        }
    }

    public final String b(String str) {
        Uri parse = Uri.parse(str);
        parse.getScheme();
        parse.getAuthority();
        return parse.getPath();
    }

    public final void c(String str) {
        OBRConfig oBRConfig = this.f2942b;
        if (oBRConfig == null || !oBRConfig.isLogEnable()) {
            return;
        }
        h.a("OBRModule", str);
    }

    public void b() {
        o9.e();
        this.f2942b = null;
        this.f2941a = null;
        this.f2943c = null;
        this.f2949i.clear();
    }

    public void a(String str, p6 p6Var) {
        o6 o6Var;
        StringBuilder sb;
        String b8 = b(str);
        n6 n6Var = this.f2943c;
        if (n6Var == null || this.f2941a == null) {
            return;
        }
        if (n6Var.a(b8)) {
            c("OBRModule download check file exist");
            if (!d(str)) {
                c("OBRModule download check file is fresh");
                p6Var.a(str);
                return;
            } else {
                c("OBRModule download check file is expired");
                this.f2943c.b(str);
                o6Var = this.f2941a;
                sb = new StringBuilder();
            }
        } else {
            o6Var = this.f2941a;
            sb = new StringBuilder();
        }
        sb.append(this.f2947g);
        sb.append(b8);
        o6Var.a(str, sb.toString(), p6Var);
    }

    public final void a(String str, String str2, String str3, String str4) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("event_name", str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(str2, str3);
        hashMap2.put("url", a(str4));
        hashMap.put("event_data", hashMap2);
        c("OBRModule send message to engine : " + hashMap.toString());
        this.f2944d.a(ARPMessageType.MSG_TYPE_SDK_TO_OBR, hashMap);
    }

    public final void a(HashMap<String, Object> hashMap) {
        if (hashMap != null) {
            String str = (String) hashMap.get("event_name");
            c("OBRModule receive msg : " + str);
            HashMap hashMap2 = (HashMap) hashMap.get("event_data");
            if (hashMap2 != null) {
                if (!TextUtils.equals(str, "engine_request_download")) {
                    TextUtils.equals(str, "engine_request_json");
                    return;
                }
                String str2 = (String) hashMap2.get("url");
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                if (TextUtils.isEmpty(str2)) {
                    c("obr empty url received form engine");
                    return;
                }
                if (str2.startsWith("icon")) {
                    return;
                }
                c("OBRModule receive download msg : " + str2);
                if (this.f2949i.keySet().size() == 0) {
                    this.f2948h = System.currentTimeMillis();
                }
                this.f2949i.put(str2, Long.valueOf(System.currentTimeMillis()));
                a(str2, this.f2950j);
            }
        }
    }

    public final boolean a(String str, String str2) {
        try {
            IHttpRequest newRequest = HttpFactory.newRequest();
            if (newRequest == null) {
                return false;
            }
            return this.f2943c.a(newRequest.setUrl(str).setMethod("HEAD").execute().getHeader("Last-Modified"), str2);
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }
}
