package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class z3 extends Lambda implements Function0 {
    public final /* synthetic */ Activity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(Activity activity) {
        super(0);
        this.a = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ActivityInfo activityInfo;
        ResolveInfo resolveActivity = this.a.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null) {
            return null;
        }
        return activityInfo.packageName;
    }
}
