package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import com.unity3d.player.UnityPlayer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037c1 extends Lambda implements Function0 {
    public static final C0037c1 a = new C0037c1();

    public C0037c1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Activity currentActivity = UnityPlayer.currentActivity;
        Intrinsics.checkNotNullExpressionValue(currentActivity, "currentActivity");
        return Integer.valueOf(J.a(currentActivity));
    }
}
