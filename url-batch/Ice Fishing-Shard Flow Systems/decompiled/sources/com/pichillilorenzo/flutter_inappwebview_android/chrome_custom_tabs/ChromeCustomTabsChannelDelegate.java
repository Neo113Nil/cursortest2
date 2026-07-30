package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import S.j;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import b.C0261b;
import b.InterfaceC0263d;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsSecondaryToolbar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import q.f;
import s4.n;
import s4.p;
import s4.q;

/* loaded from: classes.dex */
public class ChromeCustomTabsChannelDelegate extends ChannelDelegateImpl {
    private ChromeCustomTabsActivity chromeCustomTabsActivity;

    public ChromeCustomTabsChannelDelegate(ChromeCustomTabsActivity chromeCustomTabsActivity, q qVar) {
        super(qVar);
        this.chromeCustomTabsActivity = chromeCustomTabsActivity;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.chromeCustomTabsActivity = null;
    }

    public void onClosed() {
        q channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onClosed", new HashMap(), null);
    }

    public void onCompletedInitialLoad() {
        q channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onCompletedInitialLoad", new HashMap(), null);
    }

    public void onGreatestScrollPercentageIncreased(int i2) {
        q channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("scrollPercentage", Integer.valueOf(i2));
        channel.a("onGreatestScrollPercentageIncreased", hashMap, null);
    }

    public void onItemActionPerform(int i2, String str, String str2) {
        q channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i2));
        hashMap.put("url", str);
        hashMap.put("title", str2);
        channel.a("onItemActionPerform", hashMap, null);
    }

    public void onMessageChannelReady() {
        q channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onMessageChannelReady", new HashMap(), null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, s4.o
    public void onMethodCall(n nVar, p pVar) {
        q.n nVar2;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        Activity activity;
        int i2;
        String str = nVar.f7767a;
        str.getClass();
        boolean z7 = false;
        char c7 = 65535;
        switch (str.hashCode()) {
            case -1526944655:
                if (str.equals("isEngagementSignalsApiAvailable")) {
                    c7 = 0;
                    break;
                }
                break;
            case -675108676:
                if (str.equals("launchUrl")) {
                    c7 = 1;
                    break;
                }
                break;
            case -334843312:
                if (str.equals("updateSecondaryToolbar")) {
                    c7 = 2;
                    break;
                }
                break;
            case 50870385:
                if (str.equals("updateActionButton")) {
                    c7 = 3;
                    break;
                }
                break;
            case 94756344:
                if (str.equals("close")) {
                    c7 = 4;
                    break;
                }
                break;
            case 1256059502:
                if (str.equals("validateRelationship")) {
                    c7 = 5;
                    break;
                }
                break;
            case 1392239787:
                if (str.equals("requestPostMessageChannel")) {
                    c7 = 6;
                    break;
                }
                break;
            case 1490029383:
                if (str.equals("postMessage")) {
                    c7 = 7;
                    break;
                }
                break;
            case 2000053463:
                if (str.equals("mayLaunchUrl")) {
                    c7 = '\b';
                    break;
                }
                break;
        }
        Bundle bundle = null;
        switch (c7) {
            case 0:
                ChromeCustomTabsActivity chromeCustomTabsActivity = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity == null || (nVar2 = chromeCustomTabsActivity.customTabsSession) == null) {
                    pVar.success(Boolean.FALSE);
                    return;
                }
                try {
                    pVar.success(Boolean.valueOf(nVar2.b(new Bundle())));
                    return;
                } catch (Throwable unused) {
                    pVar.success(Boolean.FALSE);
                    return;
                }
            case 1:
                if (this.chromeCustomTabsActivity == null) {
                    pVar.success(Boolean.FALSE);
                    return;
                }
                String str2 = (String) nVar.a("url");
                if (str2 == null) {
                    pVar.success(Boolean.FALSE);
                    return;
                } else {
                    this.chromeCustomTabsActivity.launchUrl(str2, (Map) nVar.a("headers"), (String) nVar.a("referrer"), (List) nVar.a("otherLikelyURLs"));
                    pVar.success(Boolean.TRUE);
                    return;
                }
            case 2:
                if (this.chromeCustomTabsActivity == null) {
                    pVar.success(Boolean.FALSE);
                    return;
                } else {
                    this.chromeCustomTabsActivity.updateSecondaryToolbar(CustomTabsSecondaryToolbar.fromMap((Map) nVar.a("secondaryToolbar")));
                    pVar.success(Boolean.TRUE);
                    return;
                }
            case 3:
                if (this.chromeCustomTabsActivity == null) {
                    pVar.success(Boolean.FALSE);
                    return;
                } else {
                    this.chromeCustomTabsActivity.updateActionButton((byte[]) nVar.a("icon"), (String) nVar.a("description"));
                    pVar.success(Boolean.TRUE);
                    return;
                }
            case 4:
                ChromeCustomTabsActivity chromeCustomTabsActivity2 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity2 == null) {
                    pVar.success(Boolean.FALSE);
                    return;
                }
                chromeCustomTabsActivity2.onStop();
                this.chromeCustomTabsActivity.onDestroy();
                this.chromeCustomTabsActivity.close();
                ChromeSafariBrowserManager chromeSafariBrowserManager = this.chromeCustomTabsActivity.manager;
                if (chromeSafariBrowserManager != null && (inAppWebViewFlutterPlugin = chromeSafariBrowserManager.plugin) != null && (activity = inAppWebViewFlutterPlugin.activity) != null) {
                    Intent intent = new Intent(activity, activity.getClass());
                    intent.addFlags(67108864);
                    intent.addFlags(536870912);
                    activity.startActivity(intent);
                }
                this.chromeCustomTabsActivity.dispose();
                pVar.success(Boolean.TRUE);
                return;
            case 5:
                ChromeCustomTabsActivity chromeCustomTabsActivity3 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity3 == null || chromeCustomTabsActivity3.customTabsSession == null) {
                    pVar.success(Boolean.FALSE);
                    return;
                }
                Integer num = (Integer) nVar.a("relation");
                String str3 = (String) nVar.a("origin");
                q.n nVar3 = this.chromeCustomTabsActivity.customTabsSession;
                int intValue = num.intValue();
                Uri parse = Uri.parse(str3);
                nVar3.getClass();
                if (intValue >= 1 && intValue <= 2) {
                    try {
                        z7 = ((C0261b) nVar3.f7304b).j(nVar3.f7305c, intValue, parse, nVar3.a(null));
                    } catch (RemoteException unused2) {
                    }
                }
                pVar.success(Boolean.valueOf(z7));
                return;
            case 6:
                ChromeCustomTabsActivity chromeCustomTabsActivity4 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity4 == null || chromeCustomTabsActivity4.customTabsSession == null) {
                    pVar.success(Boolean.FALSE);
                    return;
                }
                String str4 = (String) nVar.a("sourceOrigin");
                String str5 = (String) nVar.a("targetOrigin");
                q.n nVar4 = this.chromeCustomTabsActivity.customTabsSession;
                Uri parse2 = Uri.parse(str4);
                Uri parse3 = str5 != null ? Uri.parse(str5) : null;
                Bundle bundle2 = new Bundle();
                f fVar = nVar4.f7305c;
                InterfaceC0263d interfaceC0263d = nVar4.f7304b;
                try {
                    Bundle bundle3 = new Bundle();
                    if (parse3 != null) {
                        bundle3.putParcelable("target_origin", parse3);
                    }
                    if (!bundle3.isEmpty()) {
                        bundle = bundle3;
                    }
                    if (bundle != null) {
                        bundle2.putAll(bundle);
                        z7 = ((C0261b) interfaceC0263d).g(fVar, parse2, bundle2);
                    } else {
                        z7 = ((C0261b) interfaceC0263d).f(fVar, parse2);
                    }
                } catch (RemoteException unused3) {
                }
                pVar.success(Boolean.valueOf(z7));
                return;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                ChromeCustomTabsActivity chromeCustomTabsActivity5 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity5 == null || chromeCustomTabsActivity5.customTabsSession == null) {
                    pVar.success(-3);
                    return;
                }
                String str6 = (String) nVar.a("message");
                q.n nVar5 = this.chromeCustomTabsActivity.customTabsSession;
                Bundle a7 = nVar5.a(new Bundle());
                synchronized (nVar5.f7303a) {
                    try {
                        try {
                            i2 = ((C0261b) nVar5.f7304b).e(nVar5.f7305c, str6, a7);
                        } finally {
                        }
                    } catch (RemoteException unused4) {
                        i2 = -2;
                    }
                }
                pVar.success(Integer.valueOf(i2));
                return;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                if (this.chromeCustomTabsActivity != null) {
                    pVar.success(Boolean.valueOf(this.chromeCustomTabsActivity.mayLaunchUrl((String) nVar.a("url"), (List) nVar.a("otherLikelyURLs"))));
                    return;
                } else {
                    pVar.success(Boolean.FALSE);
                    return;
                }
            default:
                pVar.notImplemented();
                return;
        }
    }

    public void onNavigationEvent(int i2) {
        q channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("navigationEvent", Integer.valueOf(i2));
        channel.a("onNavigationEvent", hashMap, null);
    }

    public void onOpened() {
        q channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onOpened", new HashMap(), null);
    }

    public void onPostMessage(String str) {
        q channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("message", str);
        channel.a("onPostMessage", hashMap, null);
    }

    public void onRelationshipValidationResult(int i2, Uri uri, boolean z7) {
        q channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("relation", Integer.valueOf(i2));
        hashMap.put("requestedOrigin", uri.toString());
        hashMap.put("result", Boolean.valueOf(z7));
        channel.a("onRelationshipValidationResult", hashMap, null);
    }

    public void onSecondaryItemActionPerform(String str, String str2) {
        q channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("name", str);
        hashMap.put("url", str2);
        channel.a("onSecondaryItemActionPerform", hashMap, null);
    }

    public void onServiceConnected() {
        q channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onServiceConnected", new HashMap(), null);
    }

    public void onSessionEnded(boolean z7) {
        q channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("didUserInteract", Boolean.valueOf(z7));
        channel.a("onSessionEnded", hashMap, null);
    }

    public void onVerticalScrollEvent(boolean z7) {
        q channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isDirectionUp", Boolean.valueOf(z7));
        channel.a("onVerticalScrollEvent", hashMap, null);
    }
}
