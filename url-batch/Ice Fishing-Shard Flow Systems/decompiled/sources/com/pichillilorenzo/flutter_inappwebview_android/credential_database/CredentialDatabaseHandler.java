package com.pichillilorenzo.flutter_inappwebview_android.credential_database;

import android.content.Context;
import android.webkit.WebViewDatabase;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLProtectionSpace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import s4.n;
import s4.p;
import s4.q;

/* loaded from: classes.dex */
public class CredentialDatabaseHandler extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "CredentialDatabaseHandler";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_credential_database";
    public static CredentialDatabase credentialDatabase;
    public InAppWebViewFlutterPlugin plugin;

    public CredentialDatabaseHandler(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new q(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public static void init(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        if (credentialDatabase == null) {
            credentialDatabase = CredentialDatabase.getInstance(inAppWebViewFlutterPlugin.applicationContext);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.plugin = null;
        credentialDatabase = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, s4.o
    public void onMethodCall(n nVar, p pVar) {
        Context context;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            init(inAppWebViewFlutterPlugin);
        }
        String str = nVar.f7767a;
        str.getClass();
        switch (str) {
            case "clearAllAuthCredentials":
                CredentialDatabase credentialDatabase2 = credentialDatabase;
                if (credentialDatabase2 != null) {
                    credentialDatabase2.clearAllAuthCredentials();
                    InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
                    if (inAppWebViewFlutterPlugin2 != null && (context = inAppWebViewFlutterPlugin2.applicationContext) != null) {
                        WebViewDatabase.getInstance(context).clearHttpAuthUsernamePassword();
                    }
                    pVar.success(Boolean.TRUE);
                    break;
                } else {
                    pVar.success(Boolean.FALSE);
                    break;
                }
                break;
            case "getHttpAuthCredentials":
                ArrayList arrayList = new ArrayList();
                if (credentialDatabase != null) {
                    Iterator<URLCredential> it = credentialDatabase.getHttpAuthCredentials((String) nVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) nVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) nVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) nVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT)).iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().toMap());
                    }
                }
                pVar.success(arrayList);
                break;
            case "removeHttpAuthCredential":
                if (credentialDatabase != null) {
                    credentialDatabase.removeHttpAuthCredential((String) nVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) nVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) nVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) nVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT), (String) nVar.a(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME), (String) nVar.a(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD));
                    pVar.success(Boolean.TRUE);
                    break;
                } else {
                    pVar.success(Boolean.FALSE);
                    break;
                }
            case "setHttpAuthCredential":
                if (credentialDatabase != null) {
                    credentialDatabase.setHttpAuthCredential((String) nVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) nVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) nVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) nVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT), (String) nVar.a(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME), (String) nVar.a(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD));
                    pVar.success(Boolean.TRUE);
                    break;
                } else {
                    pVar.success(Boolean.FALSE);
                    break;
                }
            case "removeHttpAuthCredentials":
                if (credentialDatabase != null) {
                    credentialDatabase.removeHttpAuthCredentials((String) nVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) nVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) nVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) nVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT));
                    pVar.success(Boolean.TRUE);
                    break;
                } else {
                    pVar.success(Boolean.FALSE);
                    break;
                }
            case "getAllAuthCredentials":
                ArrayList arrayList2 = new ArrayList();
                CredentialDatabase credentialDatabase3 = credentialDatabase;
                if (credentialDatabase3 != null) {
                    for (URLProtectionSpace uRLProtectionSpace : credentialDatabase3.protectionSpaceDao.getAll()) {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator<URLCredential> it2 = credentialDatabase.credentialDao.getAllByProtectionSpaceId(uRLProtectionSpace.getId()).iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(it2.next().toMap());
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("protectionSpace", uRLProtectionSpace.toMap());
                        hashMap.put("credentials", arrayList3);
                        arrayList2.add(hashMap);
                    }
                }
                pVar.success(arrayList2);
                break;
            default:
                pVar.notImplemented();
                break;
        }
    }
}
