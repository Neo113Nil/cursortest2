package com.onevcat.uniwebview.internal.obfuscated;

import com.unity3d.player.UnityPlayer;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0065i implements G3 {
    @Override // com.onevcat.uniwebview.internal.obfuscated.G3
    public final void a(String name, v3 payload) {
        H3 method = H3.EvalJavaScriptFinished;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(payload, "payload");
        a(name, method, payload.a());
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.G3
    public final void a(String name, H3 method, String parameters) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        UnityPlayer.UnitySendMessage("UniWebViewAndroidStaticListener", "OnJavaMessage", name + '@' + method.name() + '@' + parameters);
    }
}
