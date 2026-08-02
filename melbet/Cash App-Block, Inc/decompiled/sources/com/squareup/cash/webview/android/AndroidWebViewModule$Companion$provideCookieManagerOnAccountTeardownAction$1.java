package com.squareup.cash.webview.android;

import android.webkit.CookieManager;
import com.squareup.cash.attribution.DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0;
import com.squareup.cash.session.backend.OnAccountTeardownAction;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class AndroidWebViewModule$Companion$provideCookieManagerOnAccountTeardownAction$1 implements OnAccountTeardownAction {
    public final /* synthetic */ Object $cookieManager;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AndroidWebViewModule$Companion$provideCookieManagerOnAccountTeardownAction$1(Object obj, int i) {
        this.$r8$classId = i;
        this.$cookieManager = obj;
    }

    @Override // com.squareup.cash.session.backend.OnAccountTeardownAction
    public final Object clearData(ContinuationImpl continuationImpl) {
        int i = this.$r8$classId;
        Object obj = this.$cookieManager;
        switch (i) {
            case 0:
                CookieManager cookieManager = ((AndroidCookieManager) obj).cookieManager();
                if (cookieManager != null) {
                    cookieManager.removeAllCookies(null);
                }
                break;
            default:
                ((DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0) obj).defer(null);
                break;
        }
        return Unit.INSTANCE;
    }
}
