package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class v70 implements t70<eu0> {

    /* renamed from: a, reason: collision with root package name */
    private final w70 f13147a;

    public v70(w70 w70Var, byte[] bArr) {
        this.f13147a = w70Var;
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final /* bridge */ /* synthetic */ void a(eu0 eu0Var, Map map) {
        eu0 eu0Var2 = eu0Var;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f7 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f7 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e7) {
            io0.e("Fail to parse float", e7);
        }
        this.f13147a.c(equals);
        this.f13147a.b(equals2, f7);
        eu0Var2.m0(equals);
    }
}
