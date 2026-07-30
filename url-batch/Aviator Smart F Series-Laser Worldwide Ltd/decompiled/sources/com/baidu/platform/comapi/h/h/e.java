package com.baidu.platform.comapi.h.h;

import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private String f9090a;

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, String> f9091b = new LinkedHashMap(32);

    /* renamed from: c, reason: collision with root package name */
    private HashMap<String, String> f9092c = new LinkedHashMap(32);

    /* renamed from: d, reason: collision with root package name */
    private int f9093d = -1;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9094e = true;

    /* renamed from: f, reason: collision with root package name */
    private b f9095f = b.GET;

    /* renamed from: g, reason: collision with root package name */
    private a f9096g = a.PROTOBUF;

    /* renamed from: h, reason: collision with root package name */
    private int f9097h = -1;

    /* renamed from: i, reason: collision with root package name */
    private boolean f9098i = true;

    /* renamed from: j, reason: collision with root package name */
    private boolean f9099j = true;

    /* renamed from: k, reason: collision with root package name */
    private boolean f9100k = true;

    /* renamed from: l, reason: collision with root package name */
    private boolean f9101l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f9102m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f9103n = false;

    /* renamed from: o, reason: collision with root package name */
    private int f9104o;

    public enum a {
        PROTOBUF("pb"),
        JSON(BodyData.TYPE_JSON),
        UNKNOWN("unknown");


        /* renamed from: e, reason: collision with root package name */
        private String f9109e;

        a(String str) {
            this.f9109e = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f9109e;
        }
    }

    public enum b {
        GET("get"),
        POST("post");


        /* renamed from: d, reason: collision with root package name */
        private String f9113d;

        b(String str) {
            this.f9113d = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f9113d;
        }
    }

    public e() {
        this.f9090a = "";
        this.f9090a = "https://newclient.map.baidu.com/client/phpui2/";
    }

    public e a(a aVar) {
        if (aVar == null) {
            return this;
        }
        this.f9096g = aVar;
        return this;
    }

    public e b(int i8) {
        this.f9093d = i8;
        return this;
    }

    public String toString() {
        com.baidu.platform.comapi.h.h.f.a aVar = new com.baidu.platform.comapi.h.h.f.a();
        aVar.f();
        int indexOf = this.f9090a.indexOf(63);
        if (indexOf != -1) {
            String[] split = this.f9090a.substring(indexOf + 1).split("&");
            if (split != null) {
                int length = split.length;
                for (int i8 = 0; i8 < length; i8++) {
                    int indexOf2 = split[i8].indexOf(61);
                    if (indexOf2 != -1) {
                        a(split[i8].substring(0, indexOf2), split[i8].substring(indexOf2 + 1));
                    }
                }
            }
            this.f9090a = this.f9090a.substring(0, indexOf);
        }
        aVar.a("domain").b(this.f9090a);
        if (this.f9102m) {
            aVar.a("OFFLINE_SEARCH").a(1);
        }
        if (this.f9091b.size() > 0 || (this.f9095f == b.GET && this.f9092c.size() > 0)) {
            aVar.a("uri_param").f();
            for (Map.Entry<String, String> entry : this.f9091b.entrySet()) {
                aVar.a(entry.getKey()).b(entry.getValue());
            }
            if (this.f9095f == b.GET && this.f9092c.size() > 0) {
                for (Map.Entry<String, String> entry2 : this.f9092c.entrySet()) {
                    aVar.a(entry2.getKey()).b(entry2.getValue());
                }
            }
            aVar.d();
        }
        if (this.f9095f == b.POST && this.f9092c.size() > 0) {
            aVar.a("query_param").f();
            for (Map.Entry<String, String> entry3 : this.f9092c.entrySet()) {
                aVar.a(entry3.getKey()).b(entry3.getValue());
            }
            aVar.d();
        }
        aVar.a("ext_param").f();
        aVar.a("data_format").a(this.f9096g);
        aVar.a("b_cache").a(this.f9094e);
        aVar.a(FirebaseAnalytics.Param.METHOD).a(this.f9095f);
        aVar.a("businessid").a(this.f9104o);
        aVar.a("b_user_param").a(this.f9098i);
        aVar.a("b_sign").a(this.f9099j);
        aVar.a("b_encode").a(this.f9100k);
        aVar.d();
        aVar.d();
        return aVar.toString();
    }

    public e a(b bVar) {
        if (bVar == null) {
            return this;
        }
        this.f9095f = bVar;
        return this;
    }

    public void b(boolean z7) {
        this.f9101l = z7;
    }

    public e a(boolean z7) {
        this.f9094e = z7;
        return this;
    }

    public void a(int i8) {
        this.f9104o = i8;
    }

    public e a(String str, String str2) {
        this.f9091b.put(str, str2);
        return this;
    }

    public e a(String str, int i8) {
        return a(str, String.valueOf(i8));
    }
}
