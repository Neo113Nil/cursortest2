package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class mb extends p9<Integer, Long> {

    /* renamed from: b, reason: collision with root package name */
    public long f8475b;

    /* renamed from: c, reason: collision with root package name */
    public long f8476c;

    public mb(String str) {
        this.f8475b = -1L;
        this.f8476c = -1L;
        HashMap a7 = p9.a(str);
        if (a7 != null) {
            this.f8475b = ((Long) a7.get(0)).longValue();
            this.f8476c = ((Long) a7.get(1)).longValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.p9
    protected final HashMap<Integer, Long> b() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, Long.valueOf(this.f8475b));
        hashMap.put(1, Long.valueOf(this.f8476c));
        return hashMap;
    }
}
