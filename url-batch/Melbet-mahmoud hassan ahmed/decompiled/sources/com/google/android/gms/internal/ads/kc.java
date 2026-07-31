package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class kc extends p9<Integer, Long> {

    /* renamed from: b, reason: collision with root package name */
    public Long f7457b;

    /* renamed from: c, reason: collision with root package name */
    public Long f7458c;

    /* renamed from: d, reason: collision with root package name */
    public Long f7459d;

    /* renamed from: e, reason: collision with root package name */
    public Long f7460e;

    public kc(String str) {
        HashMap a7 = p9.a(str);
        if (a7 != null) {
            this.f7457b = (Long) a7.get(0);
            this.f7458c = (Long) a7.get(1);
            this.f7459d = (Long) a7.get(2);
            this.f7460e = (Long) a7.get(3);
        }
    }

    @Override // com.google.android.gms.internal.ads.p9
    protected final HashMap<Integer, Long> b() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f7457b);
        hashMap.put(1, this.f7458c);
        hashMap.put(2, this.f7459d);
        hashMap.put(3, this.f7460e);
        return hashMap;
    }
}
