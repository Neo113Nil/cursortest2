package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class C implements G3 {
    public static final C a = new C();

    @Override // com.onevcat.uniwebview.internal.obfuscated.G3
    public final void a(String name, H3 method, String parameters) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.G3
    public final void a(String name, v3 payload) {
        H3 method = H3.EvalJavaScriptFinished;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(payload, "payload");
        a(name, method, payload.a());
    }
}
