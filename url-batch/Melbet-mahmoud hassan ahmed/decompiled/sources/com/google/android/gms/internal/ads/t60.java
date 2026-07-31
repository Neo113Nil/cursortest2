package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class t60 implements t70<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final u60 f12100a;

    public t60(u60 u60Var) {
        this.f12100a = u60Var;
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final void a(Object obj, Map<String, String> map) {
        String str = map.get("name");
        if (str == null) {
            io0.g("App event with no name parameter.");
        } else {
            this.f12100a.Q(str, map.get("info"));
        }
    }
}
