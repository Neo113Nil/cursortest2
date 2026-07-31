package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class z61<AdT> implements kv3<x61<AdT>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Map<String, a52<AdT>>> f14974a;

    public z61(yv3<Map<String, a52<AdT>>> yv3Var) {
        this.f14974a = yv3Var;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new x61(((ov3) this.f14974a).a());
    }
}
