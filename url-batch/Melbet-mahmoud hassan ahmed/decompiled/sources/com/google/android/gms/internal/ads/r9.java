package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class r9 extends p9<Integer, Object> {

    /* renamed from: b, reason: collision with root package name */
    public String f11063b;

    /* renamed from: c, reason: collision with root package name */
    public long f11064c;

    /* renamed from: d, reason: collision with root package name */
    public String f11065d;

    /* renamed from: e, reason: collision with root package name */
    public String f11066e;

    /* renamed from: f, reason: collision with root package name */
    public String f11067f;

    public r9() {
        this.f11063b = "E";
        this.f11064c = -1L;
        this.f11065d = "E";
        this.f11066e = "E";
        this.f11067f = "E";
    }

    public r9(String str) {
        this.f11063b = "E";
        this.f11064c = -1L;
        this.f11065d = "E";
        this.f11066e = "E";
        this.f11067f = "E";
        HashMap a7 = p9.a(str);
        if (a7 != null) {
            this.f11063b = a7.get(0) == null ? "E" : (String) a7.get(0);
            this.f11064c = a7.get(1) != null ? ((Long) a7.get(1)).longValue() : -1L;
            this.f11065d = a7.get(2) == null ? "E" : (String) a7.get(2);
            this.f11066e = a7.get(3) == null ? "E" : (String) a7.get(3);
            this.f11067f = a7.get(4) != null ? (String) a7.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.p9
    protected final HashMap<Integer, Object> b() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f11063b);
        hashMap.put(4, this.f11067f);
        hashMap.put(3, this.f11066e);
        hashMap.put(2, this.f11065d);
        hashMap.put(1, Long.valueOf(this.f11064c));
        return hashMap;
    }
}
