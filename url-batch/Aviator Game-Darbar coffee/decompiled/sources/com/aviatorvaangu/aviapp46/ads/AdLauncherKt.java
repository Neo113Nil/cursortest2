package com.aviatorvaangu.aviapp46.ads;

import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import com.aviatorvaangu.aviapp46.components.AppColorsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdLauncher.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"AdUrl", "", "openAdTab", "", "context", "Landroid/content/Context;", "app"}, k = 2, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class AdLauncherKt {
    public static final String AdUrl = "https://1242.mark.qureka.com/intro/question";

    public static final void openAdTab(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        CustomTabColorSchemeParams build = new CustomTabColorSchemeParams.Builder().setToolbarColor(ColorKt.m4793toArgb8_81llA(AppColorsKt.getSkyBlue())).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        new CustomTabsIntent.Builder().setShowTitle(true).setDefaultColorSchemeParams(build).build().launchUrl(context, Uri.parse(AdUrl));
    }
}
