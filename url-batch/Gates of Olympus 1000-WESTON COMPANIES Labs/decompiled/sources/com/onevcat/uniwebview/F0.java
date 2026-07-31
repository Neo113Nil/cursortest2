package com.onevcat.uniwebview;

import android.webkit.WebSettings;
import com.unity3d.player.UnityPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class F0 extends Lambda implements Function0 {
    public static final F0 a = new F0();

    public F0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            int i = C0093w.i;
            WebSettings.getDefaultUserAgent(UnityPlayer.currentActivity);
        } catch (Exception e) {
            C0060l c0060l = C0060l.b;
            String message = "Exception when preparing web view. This usually means there is no web view on the device and the whole UniWebView won't work. " + e.getMessage();
            c0060l.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            c0060l.a(EnumC0057k.CRITICAL, message);
        }
        return Unit.INSTANCE;
    }
}
