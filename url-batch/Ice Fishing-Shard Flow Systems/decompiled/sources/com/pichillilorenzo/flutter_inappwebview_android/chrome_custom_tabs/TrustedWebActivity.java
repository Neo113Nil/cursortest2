package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import q.f;
import q.h;
import q.n;
import r.C0840c;
import r.C0841d;
import r.InterfaceC0839b;

/* loaded from: classes.dex */
public class TrustedWebActivity extends ChromeCustomTabsActivity {
    protected static final String LOG_TAG = "TrustedWebActivity";
    public C0841d builder;

    private void prepareCustomTabs() {
        String str = this.customSettings.toolbarBackgroundColor;
        Integer num = null;
        Integer valueOf = (str == null || str.isEmpty()) ? null : Integer.valueOf(Color.parseColor(this.customSettings.toolbarBackgroundColor) | (-16777216));
        String str2 = this.customSettings.navigationBarColor;
        Integer valueOf2 = (str2 == null || str2.isEmpty()) ? null : Integer.valueOf((-16777216) | Color.parseColor(this.customSettings.navigationBarColor));
        String str3 = this.customSettings.navigationBarDividerColor;
        Integer valueOf3 = (str3 == null || str3.isEmpty()) ? null : Integer.valueOf(Color.parseColor(this.customSettings.navigationBarDividerColor));
        String str4 = this.customSettings.secondaryToolbarColor;
        if (str4 != null && !str4.isEmpty()) {
            num = Integer.valueOf(Color.parseColor(this.customSettings.secondaryToolbarColor));
        }
        h hVar = this.builder.f7430b;
        hVar.getClass();
        Bundle bundle = new Bundle();
        if (valueOf != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
        }
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num.intValue());
        }
        if (valueOf2 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", valueOf2.intValue());
        }
        if (valueOf3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", valueOf3.intValue());
        }
        hVar.f7292e = bundle;
        List<String> list = this.customSettings.additionalTrustedOrigins;
        if (list != null && !list.isEmpty()) {
            this.builder.f7431c = this.customSettings.additionalTrustedOrigins;
        }
        ChromeCustomTabsSettings chromeCustomTabsSettings = this.customSettings;
        InterfaceC0839b interfaceC0839b = chromeCustomTabsSettings.displayMode;
        if (interfaceC0839b != null) {
            this.builder.f7432d = interfaceC0839b;
        }
        this.builder.f7433e = chromeCustomTabsSettings.screenOrientation.intValue();
    }

    private void prepareCustomTabsIntent(C0840c c0840c) {
        Intent intent = c0840c.f7428a;
        String str = this.customSettings.packageName;
        if (str != null) {
            intent.setPackage(str);
        } else {
            intent.setPackage(CustomTabsHelper.getPackageNameToUse(this));
        }
        if (this.customSettings.keepAliveEnabled.booleanValue()) {
            CustomTabsHelper.addKeepAliveExtra(this, intent);
        }
        if (this.customSettings.alwaysUseBrowserUI.booleanValue()) {
            if (intent == null) {
                intent = new Intent("android.intent.action.VIEW");
            }
            intent.addFlags(268435456);
            intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity
    public void launchUrl(String str, Map<String, String> map, String str2, List<String> list) {
        if (this.customTabsSession == null) {
            return;
        }
        Uri parse = Uri.parse(str);
        mayLaunchUrl(str, list);
        this.builder = new C0841d(parse);
        prepareCustomTabs();
        C0841d c0841d = this.builder;
        n nVar = this.customTabsSession;
        h hVar = c0841d.f7430b;
        if (nVar == null) {
            throw new NullPointerException("CustomTabsSession is required for launching a TWA");
        }
        Intent intent = hVar.f7288a;
        intent.setPackage(nVar.f7306d.getPackageName());
        f fVar = nVar.f7305c;
        Bundle bundle = new Bundle();
        bundle.putBinder("android.support.customtabs.extra.SESSION", fVar);
        intent.putExtras(bundle);
        Intent intent2 = hVar.a().f7295a;
        intent2.setData(c0841d.f7429a);
        intent2.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
        if (c0841d.f7431c != null) {
            intent2.putExtra("android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS", new ArrayList(c0841d.f7431c));
        }
        List list2 = Collections.EMPTY_LIST;
        intent2.putExtra("androidx.browser.trusted.extra.DISPLAY_MODE", c0841d.f7432d.b());
        intent2.putExtra("androidx.browser.trusted.extra.SCREEN_ORIENTATION", c0841d.f7433e);
        intent2.putExtra("androidx.browser.trusted.extra.LAUNCH_HANDLER_CLIENT_MODE", 0);
        C0840c c0840c = new C0840c(intent2);
        prepareCustomTabsIntent(c0840c);
        CustomTabActivityHelper.openTrustedWebActivity(this, c0840c, parse, map, str2 != null ? Uri.parse(str2) : null, 100);
    }
}
