package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class n11 implements l11 {

    /* renamed from: a, reason: collision with root package name */
    private final a3.t1 f8863a;

    public n11(a3.t1 t1Var) {
        this.f8863a = t1Var;
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void a(Map<String, String> map) {
        this.f8863a.U(Boolean.parseBoolean(map.get("content_url_opted_out")));
    }
}
