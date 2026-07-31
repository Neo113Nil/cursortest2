package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class q70 implements t70<eu0> {
    q70() {
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final /* bridge */ /* synthetic */ void a(eu0 eu0Var, Map map) {
        eu0 eu0Var2 = eu0Var;
        if (map.keySet().contains("start")) {
            eu0Var2.E0().j();
        } else if (map.keySet().contains("stop")) {
            eu0Var2.E0().k();
        } else if (map.keySet().contains("cancel")) {
            eu0Var2.E0().i();
        }
    }
}
