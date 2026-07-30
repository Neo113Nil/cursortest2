package com.chicken.road.kedbags.ui.splash;

import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: OfferTab.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"openOfferTab", "", "Landroid/content/Context;", ImagesContract.URL, "", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OfferTabKt {
    public static final void openOfferTab(Context context, String url) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        if (StringsKt.isBlank(url)) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            new CustomTabsIntent.Builder().setShowTitle(true).setUrlBarHidingEnabled(true).build().launchUrl(context, Uri.parse(url));
            Result.m6577constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m6577constructorimpl(ResultKt.createFailure(th));
        }
    }
}
