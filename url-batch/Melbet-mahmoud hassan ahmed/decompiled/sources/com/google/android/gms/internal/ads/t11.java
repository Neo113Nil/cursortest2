package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class t11 implements l11 {

    /* renamed from: a, reason: collision with root package name */
    private final uy1 f12028a;

    t11(uy1 uy1Var) {
        this.f12028a = uy1Var;
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void a(Map<String, String> map) {
        if (((Boolean) sw.c().b(m10.Q6)).booleanValue()) {
            String str = map.get("policy_violations");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f12028a.k(str);
        }
    }
}
