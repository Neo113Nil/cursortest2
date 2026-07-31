package com.onevcat.uniwebview;

import android.content.ComponentName;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d5 extends CustomTabsServiceConnection {
    public final /* synthetic */ f5 a;

    public d5(f5 f5Var) {
        this.a = f5Var;
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName name, CustomTabsClient client) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(client, "client");
        f5 f5Var = this.a;
        f5Var.e = client;
        if (f5Var.h) {
            if (client == null) {
                f5Var.h = true;
                return;
            }
            if (f5Var.f == null) {
                f5Var.f = client.newSession(new e5(f5Var));
            }
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(f5Var.f);
            Integer num = f5Var.g;
            if (num != null) {
                builder.setToolbarColor(num.intValue());
            }
            builder.build().launchUrl(f5Var.a, Uri.parse(f5Var.c));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.e = null;
    }
}
