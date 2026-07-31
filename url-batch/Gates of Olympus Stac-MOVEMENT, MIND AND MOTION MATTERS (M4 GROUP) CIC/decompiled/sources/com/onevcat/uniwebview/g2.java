package com.onevcat.uniwebview;

import android.app.Activity;
import android.webkit.WebView;
import com.unity3d.player.UnityPlayer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class g2 extends Lambda implements Function0 {
    public static final g2 a = new g2();

    public g2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        int i = b0.i;
        Activity activity = UnityPlayer.currentActivity;
        Intrinsics.checkNotNullExpressionValue(activity, "currentActivity");
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            new WebView(activity).destroy();
            z = true;
        } catch (Exception unused) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
