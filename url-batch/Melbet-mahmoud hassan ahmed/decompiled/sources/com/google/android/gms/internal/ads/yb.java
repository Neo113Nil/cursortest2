package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class yb extends p9<Integer, Object> {

    /* renamed from: b, reason: collision with root package name */
    public Long f14599b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f14600c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f14601d;

    public yb(String str) {
        HashMap a7 = p9.a(str);
        if (a7 != null) {
            this.f14599b = (Long) a7.get(0);
            this.f14600c = (Boolean) a7.get(1);
            this.f14601d = (Boolean) a7.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.p9
    protected final HashMap<Integer, Object> b() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f14599b);
        hashMap.put(1, this.f14600c);
        hashMap.put(2, this.f14601d);
        return hashMap;
    }
}
