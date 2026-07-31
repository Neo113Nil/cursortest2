package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class r70 implements t70<eu0> {
    r70() {
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final /* bridge */ /* synthetic */ void a(eu0 eu0Var, Map map) {
        eu0 eu0Var2 = eu0Var;
        if (map.keySet().contains("start")) {
            eu0Var2.F(true);
        }
        if (map.keySet().contains("stop")) {
            eu0Var2.F(false);
        }
    }
}
