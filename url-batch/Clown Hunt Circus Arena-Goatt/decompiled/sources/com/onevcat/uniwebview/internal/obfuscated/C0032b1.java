package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.content.pm.ResolveInfo;
import com.unity3d.player.UnityPlayer;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032b1 extends Lambda implements Function0 {
    public static final C0032b1 a = new C0032b1();

    public C0032b1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list = B3.D;
        Activity activity = UnityPlayer.currentActivity;
        Intrinsics.checkNotNullExpressionValue(activity, "currentActivity");
        Intrinsics.checkNotNullParameter(activity, "activity");
        ResolveInfo a2 = A3.a(activity);
        if (a2 == null) {
            return null;
        }
        return a2.serviceInfo.packageName;
    }
}
