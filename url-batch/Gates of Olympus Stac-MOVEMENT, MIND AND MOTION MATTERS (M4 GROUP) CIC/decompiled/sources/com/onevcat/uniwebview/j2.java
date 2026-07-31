package com.onevcat.uniwebview;

import android.webkit.WebSettings;
import com.unity3d.player.UnityPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class j2 extends Lambda implements Function0 {
    public static final j2 a = new j2();

    public j2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            int i = b0.i;
            WebSettings.getDefaultUserAgent(UnityPlayer.currentActivity);
        } catch (Exception e) {
            o oVar = o.b;
            String message = "Exception when preparing web view. This usually means there is no web view on the device and the whole UniWebView won't work. " + e.getMessage();
            oVar.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            oVar.a(n.CRITICAL, message);
        }
        return Unit.INSTANCE;
    }
}
