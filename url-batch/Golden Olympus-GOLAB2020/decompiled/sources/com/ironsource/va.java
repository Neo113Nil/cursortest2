package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class va {

    /* renamed from: h, reason: collision with root package name */
    public static final int f20010h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f20011i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f20012j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static final int f20013k = 3;

    /* renamed from: l, reason: collision with root package name */
    public static final int f20014l = -1;

    /* renamed from: a, reason: collision with root package name */
    private String f20015a;

    /* renamed from: b, reason: collision with root package name */
    private String f20016b;

    /* renamed from: c, reason: collision with root package name */
    private int f20017c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f20018d;

    /* renamed from: e, reason: collision with root package name */
    private int f20019e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f20020f;

    /* renamed from: g, reason: collision with root package name */
    private sj f20021g;

    public va(sj sjVar) {
        this(sjVar.e(), sjVar.g(), sjVar.a(), sjVar.b());
        this.f20021g = sjVar;
    }

    public void a() {
        Map<String, String> map = this.f20018d;
        if (map != null) {
            map.clear();
        }
        this.f20018d = null;
    }

    public Map<String, String> b() {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceId", this.f20016b);
        hashMap.put("demandSourceName", this.f20015a);
        Map<String, String> map = this.f20018d;
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public sj c() {
        return this.f20021g;
    }

    public boolean d() {
        return this.f20020f;
    }

    public int e() {
        return this.f20019e;
    }

    public String f() {
        return this.f20015a;
    }

    public Map<String, String> g() {
        return this.f20018d;
    }

    public String h() {
        return this.f20016b;
    }

    public jo i() {
        if (this.f20021g != null) {
            return c().b();
        }
        return null;
    }

    public int j() {
        return this.f20017c;
    }

    public boolean k() {
        Map<String, String> map = this.f20018d;
        if (map == null || !map.containsKey("rewarded")) {
            return false;
        }
        return Boolean.parseBoolean(this.f20018d.get("rewarded"));
    }

    public va(String str, String str2, Map<String, String> map, jo joVar) {
        this.f20017c = -1;
        this.f20016b = str;
        this.f20015a = str2;
        this.f20018d = map;
        this.f20019e = 0;
        this.f20020f = false;
        this.f20021g = null;
    }

    public void a(boolean z4) {
        this.f20020f = z4;
    }

    public synchronized void b(int i4) {
        this.f20019e = i4;
    }

    public void c(int i4) {
        this.f20017c = i4;
    }

    public boolean a(int i4) {
        return this.f20017c == i4;
    }
}
