package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import b.C0261b;
import b.InterfaceC0263d;
import java.util.List;
import java.util.Map;
import q.a;
import q.f;
import q.g;
import q.i;
import q.k;
import q.n;
import r.C0840c;

/* loaded from: classes.dex */
public class CustomTabActivityHelper implements ServiceConnectionCallback {
    private g mClient;
    private k mConnection;
    private ConnectionCallback mConnectionCallback;
    private a mCustomTabsCallback;
    private n mCustomTabsSession;

    public interface ConnectionCallback {
        void onCustomTabsConnected();

        void onCustomTabsDisconnected();
    }

    public static boolean isAvailable(Activity activity) {
        return CustomTabsHelper.getPackageNameToUse(activity) != null;
    }

    public static void openCustomTab(Activity activity, Intent intent, Uri uri, Map<String, String> map, Uri uri2, int i2) {
        intent.setData(uri);
        if (map != null) {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            intent.putExtra("com.android.browser.headers", bundle);
        }
        if (uri2 != null) {
            intent.putExtra("android.intent.extra.REFERRER", uri2);
        }
        activity.startActivityForResult(intent, i2);
    }

    public static void openTrustedWebActivity(Activity activity, C0840c c0840c, Uri uri, Map<String, String> map, Uri uri2, int i2) {
        openCustomTab(activity, c0840c.f7428a, uri, map, uri2, i2);
    }

    public boolean bindCustomTabsService(Activity activity) {
        if (this.mClient != null) {
            return true;
        }
        String packageNameToUse = CustomTabsHelper.getPackageNameToUse(activity);
        if (packageNameToUse == null) {
            return false;
        }
        ServiceConnection serviceConnection = new ServiceConnection(this);
        this.mConnection = serviceConnection;
        return g.a(activity, packageNameToUse, serviceConnection);
    }

    public n getSession() {
        g gVar = this.mClient;
        n nVar = null;
        if (gVar == null) {
            this.mCustomTabsSession = null;
        } else if (this.mCustomTabsSession == null) {
            a aVar = this.mCustomTabsCallback;
            InterfaceC0263d interfaceC0263d = gVar.f7286a;
            f fVar = new f(aVar);
            try {
                if (((C0261b) interfaceC0263d).d(fVar)) {
                    nVar = new n(interfaceC0263d, fVar, gVar.f7287b);
                }
            } catch (RemoteException unused) {
            }
            this.mCustomTabsSession = nVar;
        }
        return this.mCustomTabsSession;
    }

    public boolean mayLaunchUrl(Uri uri, Bundle bundle, List<Bundle> list) {
        n session;
        if (this.mClient == null || (session = getSession()) == null) {
            return false;
        }
        try {
            return ((C0261b) session.f7304b).c(session.f7305c, uri, session.a(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ServiceConnectionCallback
    public void onServiceConnected(g gVar) {
        this.mClient = gVar;
        gVar.getClass();
        try {
            ((C0261b) gVar.f7286a).k();
        } catch (RemoteException unused) {
        }
        ConnectionCallback connectionCallback = this.mConnectionCallback;
        if (connectionCallback != null) {
            connectionCallback.onCustomTabsConnected();
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ServiceConnectionCallback
    public void onServiceDisconnected() {
        this.mClient = null;
        this.mCustomTabsSession = null;
        ConnectionCallback connectionCallback = this.mConnectionCallback;
        if (connectionCallback != null) {
            connectionCallback.onCustomTabsDisconnected();
        }
    }

    public void setConnectionCallback(ConnectionCallback connectionCallback) {
        this.mConnectionCallback = connectionCallback;
    }

    public void setCustomTabsCallback(a aVar) {
        this.mCustomTabsCallback = aVar;
    }

    public void unbindCustomTabsService(Activity activity) {
        k kVar = this.mConnection;
        if (kVar == null) {
            return;
        }
        activity.unbindService(kVar);
        this.mClient = null;
        this.mCustomTabsSession = null;
        this.mConnection = null;
    }

    public static void openCustomTab(Activity activity, i iVar, Uri uri, Map<String, String> map, Uri uri2, int i2) {
        openCustomTab(activity, iVar.f7295a, uri, map, uri2, i2);
    }
}
