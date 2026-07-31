package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class m70 implements t70<Object> {
    m70() {
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final void a(Object obj, Map<String, String> map) {
        String valueOf = String.valueOf(map.get("string"));
        io0.f(valueOf.length() != 0 ? "Received log message: ".concat(valueOf) : new String("Received log message: "));
    }
}
