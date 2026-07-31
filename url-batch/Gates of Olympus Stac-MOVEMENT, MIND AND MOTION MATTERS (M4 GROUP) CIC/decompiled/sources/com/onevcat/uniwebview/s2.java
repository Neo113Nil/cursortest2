package com.onevcat.uniwebview;

import android.app.Activity;
import com.imaginationoverflow.unity.referrer.BuildConfig;
import com.unity3d.player.UnityPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class s2 extends Lambda implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(String str, String str2) {
        super(0);
        this.a = str;
        this.b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Activity activity = UnityPlayer.currentActivity;
        String str = this.a;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        Intrinsics.checkNotNullExpressionValue(activity, "activity");
        new f5(activity, this.b, str, new h());
        return Unit.INSTANCE;
    }
}
