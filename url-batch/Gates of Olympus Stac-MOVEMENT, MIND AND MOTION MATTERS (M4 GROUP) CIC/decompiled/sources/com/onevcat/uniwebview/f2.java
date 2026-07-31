package com.onevcat.uniwebview;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import androidx.browser.customtabs.CustomTabsService;
import com.unity3d.player.UnityPlayer;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class f2 extends Lambda implements Function0 {
    public static final f2 a = new f2();

    public f2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Activity activity = UnityPlayer.currentActivity;
        Intrinsics.checkNotNullExpressionValue(activity, "currentActivity");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(activity, "activity");
        o oVar = o.b;
        oVar.getClass();
        Intrinsics.checkNotNullParameter("Checking CustomTabsService resolve info.", "message");
        n nVar = n.DEBUG;
        oVar.a(nVar, "Checking CustomTabsService resolve info.");
        List<ResolveInfo> queryIntentServices = activity.getPackageManager().queryIntentServices(new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentServices, "activity.packageManager.…ervices(serviceIntent, 0)");
        String message = "Resolved information: " + queryIntentServices;
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(nVar, message);
        return Boolean.valueOf(((ResolveInfo) CollectionsKt.firstOrNull((List) queryIntentServices)) != null);
    }
}
