package com.onevcat.uniwebview;

import com.unity3d.player.UnityPlayer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h implements g5 {
    @Override // com.onevcat.uniwebview.g5
    public final void a(String name, h5 method, c5 payload) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(payload, "payload");
        a(name, method, payload.a());
    }

    @Override // com.onevcat.uniwebview.g5
    public final void a(String name, h5 method, String parameters) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        UnityPlayer.UnitySendMessage("UniWebViewAndroidStaticListener", "OnJavaMessage", name + '@' + method.name() + '@' + parameters);
    }
}
