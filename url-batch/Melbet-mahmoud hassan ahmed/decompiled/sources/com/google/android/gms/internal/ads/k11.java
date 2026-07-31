package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class k11 implements kv3<j11> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Map<String, m11>> f7329a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Map<String, l11>> f7330b;

    public k11(yv3<Map<String, m11>> yv3Var, yv3<Map<String, l11>> yv3Var2) {
        this.f7329a = yv3Var;
        this.f7330b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final j11 a() {
        return new j11(((ov3) this.f7329a).a(), ((ov3) this.f7330b).a());
    }
}
