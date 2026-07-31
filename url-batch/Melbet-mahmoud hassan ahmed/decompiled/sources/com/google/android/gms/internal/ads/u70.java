package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class u70 implements t70<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final uy1 f12674a;

    public u70(uy1 uy1Var) {
        r3.o.j(uy1Var, "The Inspector Manager must not be null");
        this.f12674a = uy1Var;
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final void a(Object obj, Map<String, String> map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j7 = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j7 = Long.parseLong(map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.f12674a.h(map.get("extras"), j7);
    }
}
