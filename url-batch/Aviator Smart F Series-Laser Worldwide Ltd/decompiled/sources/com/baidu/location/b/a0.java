package com.baidu.location.b;

import android.annotation.TargetApi;
import android.location.GnssNavigationMessage;
import android.text.TextUtils;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    private b f4463a;

    /* renamed from: b, reason: collision with root package name */
    private long f4464b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f4465c = 0;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static a0 f4466a = new a0();
    }

    class b extends com.baidu.location.e.g {

        /* renamed from: o, reason: collision with root package name */
        private boolean f4467o = false;

        /* renamed from: p, reason: collision with root package name */
        private String f4468p = null;

        /* renamed from: q, reason: collision with root package name */
        public boolean f4469q = false;

        /* renamed from: r, reason: collision with root package name */
        public long f4470r = 0;

        public b() {
            this.f5229g = new HashMap();
        }

        @Override // com.baidu.location.e.g
        public void a() {
            String c8 = com.baidu.location.e.c.a().c();
            if (c8 != null) {
                c8 = c8 + "&gnsst=" + this.f4470r;
            }
            String a8 = p.a().a(c8);
            String replaceAll = !TextUtils.isEmpty(a8) ? a8.trim().replaceAll("\r|\n", "") : "null";
            String a9 = p.a().a(this.f4468p);
            String replaceAll2 = TextUtils.isEmpty(a9) ? "null" : a9.trim().replaceAll("\r|\n", "");
            try {
                this.f5229g.put("info", URLEncoder.encode(replaceAll, "utf-8"));
                this.f5229g.put("enl", URLEncoder.encode(replaceAll2, "utf-8"));
            } catch (Exception unused) {
            }
        }

        public boolean b() {
            return this.f4467o;
        }

        public void a(String str, long j8) {
            if (this.f4467o) {
                return;
            }
            this.f4467o = true;
            this.f4468p = str;
            this.f4470r = j8;
            ExecutorService c8 = z.a().c();
            if (c8 != null) {
                a(c8, com.baidu.location.e.e.f5209h);
            } else {
                b(com.baidu.location.e.e.f5209h);
            }
        }

        @Override // com.baidu.location.e.g
        public void a(boolean z7) {
            if (z7 && this.f5227e != null) {
                try {
                    new JSONObject(this.f5227e);
                    this.f4469q = true;
                } catch (Throwable unused) {
                }
            }
            Map<String, Object> map = this.f5229g;
            if (map != null) {
                map.clear();
            }
            this.f4467o = false;
        }
    }

    public static a0 a() {
        return a.f4466a;
    }

    public void b() {
        ArrayList<String> b8;
        if (this.f4464b == 0 || Math.abs(System.currentTimeMillis() - this.f4464b) >= 20000) {
            return;
        }
        if (this.f4463a == null) {
            this.f4463a = new b();
        }
        b bVar = this.f4463a;
        if (bVar == null || bVar.b() || (b8 = v.a().b()) == null || b8.size() <= 0) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<String> it = b8.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            i8++;
            if (i8 != b8.size()) {
                stringBuffer.append(";");
            }
        }
        this.f4463a.a(stringBuffer.toString(), this.f4465c);
    }

    @TargetApi(24)
    public void a(GnssNavigationMessage gnssNavigationMessage, long j8) {
        v.a().a(gnssNavigationMessage, j8);
        this.f4464b = System.currentTimeMillis();
        this.f4465c = j8;
    }
}
