package com.stripe.android.financialconnections.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.platform.UriHandler;
import com.stripe.attestation.RealStandardIntegrityManagerFactory;

/* loaded from: classes8.dex */
public final class CustomTabUriHandler implements UriHandler {
    public final RealStandardIntegrityManagerFactory browserManager;
    public final Context context;

    public CustomTabUriHandler(Context context, RealStandardIntegrityManagerFactory realStandardIntegrityManagerFactory) {
        context.getClass();
        this.context = context;
        this.browserManager = realStandardIntegrityManagerFactory;
    }

    @Override // androidx.compose.ui.platform.UriHandler
    public final void openUri(String str) {
        str.getClass();
        try {
            Context context = this.context;
            RealStandardIntegrityManagerFactory realStandardIntegrityManagerFactory = this.browserManager;
            Uri parse = Uri.parse(str);
            parse.getClass();
            context.startActivity(realStandardIntegrityManagerFactory.createBrowserIntentForUrl(parse));
        } catch (ActivityNotFoundException | SecurityException unused) {
        }
    }
}
