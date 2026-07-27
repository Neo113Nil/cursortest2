package com.onesignal.inAppMessages.internal.common;

import B0.e;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import b.C0257b;
import kotlin.jvm.internal.i;
import o.AbstractC1347b;
import o.AbstractServiceConnectionC1353h;
import o.C1351f;

/* loaded from: classes.dex */
public final class OneSignalChromeTab {
    public static final OneSignalChromeTab INSTANCE = new OneSignalChromeTab();

    public static final class OneSignalCustomTabsServiceConnection extends AbstractServiceConnectionC1353h {
        private final Context context;
        private final boolean openActivity;
        private final String url;

        public OneSignalCustomTabsServiceConnection(String url, boolean z, Context context) {
            i.e(url, "url");
            i.e(context, "context");
            this.url = url;
            this.openActivity = z;
            this.context = context;
        }

        @Override // o.AbstractServiceConnectionC1353h
        public void onCustomTabsServiceConnected(ComponentName componentName, AbstractC1347b customTabsClient) {
            i.e(componentName, "componentName");
            i.e(customTabsClient, "customTabsClient");
            try {
                ((C0257b) customTabsClient.f11474a).d();
            } catch (RemoteException unused) {
            }
            B4.i a6 = customTabsClient.a();
            if (a6 == null) {
                return;
            }
            Uri parse = Uri.parse(this.url);
            a6.L(parse, null);
            if (this.openActivity) {
                e a7 = new C1351f(a6).a();
                Intent intent = (Intent) a7.f146b;
                intent.setData(parse);
                intent.addFlags(268435456);
                this.context.startActivity(intent, (Bundle) a7.f147c);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            i.e(name, "name");
        }
    }

    private OneSignalChromeTab() {
    }

    private final boolean hasChromeTabLibrary() {
        return true;
    }

    public final boolean open$com_onesignal_inAppMessages(String url, boolean z, Context context) {
        i.e(url, "url");
        i.e(context, "context");
        if (!hasChromeTabLibrary()) {
            return false;
        }
        OneSignalCustomTabsServiceConnection oneSignalCustomTabsServiceConnection = new OneSignalCustomTabsServiceConnection(url, z, context);
        oneSignalCustomTabsServiceConnection.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty("com.android.chrome")) {
            intent.setPackage("com.android.chrome");
        }
        return context.bindService(intent, oneSignalCustomTabsServiceConnection, 33);
    }
}
