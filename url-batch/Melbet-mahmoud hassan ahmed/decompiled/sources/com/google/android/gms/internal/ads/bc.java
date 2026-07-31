package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class bc extends p9<Integer, Long> {

    /* renamed from: b, reason: collision with root package name */
    public Long f3334b;

    /* renamed from: c, reason: collision with root package name */
    public Long f3335c;

    public bc(String str) {
        HashMap a7 = p9.a(str);
        if (a7 != null) {
            this.f3334b = (Long) a7.get(0);
            this.f3335c = (Long) a7.get(1);
        }
    }

    @Override // com.google.android.gms.internal.ads.p9
    protected final HashMap<Integer, Long> b() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f3334b);
        hashMap.put(1, this.f3335c);
        return hashMap;
    }
}
