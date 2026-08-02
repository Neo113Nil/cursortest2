package com.withpersona.sdk2.inquiry.launchers;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.contract.ActivityResultContract;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"com/withpersona/sdk2/inquiry/launchers/CustomTabsLauncherModuleKt$createCustomTabsLauncher$1", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/withpersona/sdk2/inquiry/launchers/BrowserArguments;", "", "launchers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CustomTabsLauncherModuleKt$createCustomTabsLauncher$1 extends ActivityResultContract<BrowserArguments, Integer> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        BrowserArguments browserArguments = (BrowserArguments) obj;
        browserArguments.getClass();
        if (browserArguments instanceof CustomTabsArguments) {
            CustomTabsArguments customTabsArguments = (CustomTabsArguments) browserArguments;
            Intent intent = (Intent) customTabsArguments.intent.val$videoEncoderSession;
            intent.getClass();
            intent.setData(Uri.parse(customTabsArguments.url));
            return intent;
        }
        if (!(browserArguments instanceof AuthTabsArguments)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        AuthTabsArguments authTabsArguments = (AuthTabsArguments) browserArguments;
        Intent intent2 = (Intent) authTabsArguments.intent.this$0;
        intent2.setData(Uri.parse(authTabsArguments.url));
        intent2.putExtra("androidx.browser.auth.extra.HTTPS_REDIRECT_HOST", authTabsArguments.host);
        intent2.putExtra("androidx.browser.auth.extra.HTTPS_REDIRECT_PATH", authTabsArguments.path);
        return intent2;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int i, Intent intent) {
        return Integer.valueOf(i);
    }
}
