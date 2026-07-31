package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class e21 implements l11 {

    /* renamed from: a, reason: collision with root package name */
    private final uy1 f4461a;

    e21(uy1 uy1Var) {
        this.f4461a = uy1Var;
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void a(Map<String, String> map) {
        String str = map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f4461a.l(str.equals("true"));
    }
}
