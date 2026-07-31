package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class p11 implements l11 {

    /* renamed from: a, reason: collision with root package name */
    private final a3.t1 f9992a;

    public p11(a3.t1 t1Var) {
        this.f9992a = t1Var;
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void a(Map<String, String> map) {
        this.f9992a.c0(Boolean.parseBoolean(map.get("content_vertical_opted_out")));
    }
}
