package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public final class z10 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, y10> f14890a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final b20 f14891b;

    public z10(b20 b20Var) {
        this.f14891b = b20Var;
    }

    public final b20 a() {
        return this.f14891b;
    }

    public final void b(String str, y10 y10Var) {
        this.f14890a.put(str, y10Var);
    }

    public final void c(String str, String str2, long j7) {
        b20 b20Var = this.f14891b;
        y10 y10Var = this.f14890a.get(str2);
        String[] strArr = {str};
        if (y10Var != null) {
            b20Var.e(y10Var, j7, strArr);
        }
        this.f14890a.put(str, new y10(j7, null, null));
    }
}
