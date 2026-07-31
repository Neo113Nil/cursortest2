package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class p70 implements t70<eu0> {
    p70() {
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final /* bridge */ /* synthetic */ void a(eu0 eu0Var, Map map) {
        eu0 eu0Var2 = eu0Var;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            eu0Var2.Z0();
        } else if ("resume".equals(str)) {
            eu0Var2.b0();
        }
    }
}
