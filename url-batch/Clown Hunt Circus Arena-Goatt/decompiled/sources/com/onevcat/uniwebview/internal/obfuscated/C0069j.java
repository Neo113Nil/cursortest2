package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0069j implements F3 {
    public final String a;
    public final C0065i b;

    public C0069j(String name, C0065i sender) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(sender, "sender");
        this.a = name;
        this.b = sender;
    }

    public final void a(H3 method, String parameters) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.b.a(this.a, method, parameters);
    }
}
