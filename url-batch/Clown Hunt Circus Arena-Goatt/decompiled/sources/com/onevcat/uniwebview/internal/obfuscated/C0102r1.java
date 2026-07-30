package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.webkit.WebView;
import com.unity3d.player.UnityPlayer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102r1 extends Lambda implements Function0 {
    public static final C0102r1 a = new C0102r1();

    public C0102r1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        int i = com.onevcat.uniwebview.a.o;
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
