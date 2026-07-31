package com.onevcat.uniwebview;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m0 implements g5 {
    @Override // com.onevcat.uniwebview.g5
    public final void a(String name, h5 method, c5 payload) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(payload, "payload");
        String parameters = payload.a();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    @Override // com.onevcat.uniwebview.g5
    public final void a(String name, h5 method, String parameters) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }
}
