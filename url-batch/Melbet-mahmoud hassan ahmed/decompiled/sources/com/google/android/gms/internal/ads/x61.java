package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class x61<AdT> implements y61<AdT> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, a52<AdT>> f14053a;

    x61(Map<String, a52<AdT>> map) {
        this.f14053a = map;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final a52<AdT> a(int i7, String str) {
        return this.f14053a.get(str);
    }
}
