package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class sj {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19606a;

    /* renamed from: b, reason: collision with root package name */
    private String f19607b;

    /* renamed from: c, reason: collision with root package name */
    private String f19608c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f19609d;

    /* renamed from: e, reason: collision with root package name */
    private ug f19610e;

    /* renamed from: f, reason: collision with root package name */
    private Map<String, String> f19611f;

    /* renamed from: g, reason: collision with root package name */
    private jo f19612g;

    /* renamed from: h, reason: collision with root package name */
    private String f19613h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f19614i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f19615j;

    sj(String str, String str2, boolean z4, boolean z5, boolean z6, boolean z7, String str3, Map<String, String> map, jo joVar, ug ugVar) {
        this.f19607b = str;
        this.f19608c = str2;
        this.f19606a = z4;
        this.f19609d = z5;
        this.f19611f = map;
        this.f19612g = joVar;
        this.f19610e = ugVar;
        this.f19614i = z6;
        this.f19615j = z7;
        this.f19613h = str3;
    }

    public Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("instanceId", this.f19607b);
        hashMap.put("instanceName", this.f19608c);
        hashMap.put("rewarded", Boolean.toString(this.f19606a));
        hashMap.put("inAppBidding", Boolean.toString(this.f19609d));
        hashMap.put("isOneFlow", Boolean.toString(this.f19614i));
        hashMap.put(b9.f15280r, String.valueOf(2));
        ug ugVar = this.f19610e;
        hashMap.put("width", ugVar != null ? Integer.toString(ugVar.c()) : "0");
        ug ugVar2 = this.f19610e;
        hashMap.put("height", ugVar2 != null ? Integer.toString(ugVar2.a()) : "0");
        ug ugVar3 = this.f19610e;
        hashMap.put("label", ugVar3 != null ? ugVar3.b() : "");
        hashMap.put(b9.f15284v, Boolean.toString(i()));
        if (this.f19615j) {
            hashMap.put("isMultipleAdObjects", com.ironsource.mediationsdk.metadata.a.f17681g);
        }
        String str = this.f19613h;
        if (str != null) {
            hashMap.put("adUnitId", str);
        }
        Map<String, String> map = this.f19611f;
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public final jo b() {
        return this.f19612g;
    }

    public String c() {
        return this.f19613h;
    }

    public Map<String, String> d() {
        return this.f19611f;
    }

    public String e() {
        return this.f19607b;
    }

    public String f() {
        return this.f19608c.replaceAll("IronSource_", "");
    }

    public String g() {
        return this.f19608c;
    }

    public ug h() {
        return this.f19610e;
    }

    public boolean i() {
        return h() != null && h().d();
    }

    public boolean j() {
        return this.f19609d;
    }

    public boolean k() {
        return j() || m();
    }

    public boolean l() {
        return this.f19615j;
    }

    public boolean m() {
        return this.f19614i;
    }

    public boolean n() {
        return this.f19606a;
    }

    public void a(jo joVar) {
        this.f19612g = joVar;
    }

    public void a(String str) {
        this.f19613h = str;
    }
}
