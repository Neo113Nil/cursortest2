package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.CBError;
import com.mopub.common.Constants;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class ak {

    /* renamed from: a, reason: collision with root package name */
    final ai f3719a;

    /* renamed from: b, reason: collision with root package name */
    final Handler f3720b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f3721c;

    /* renamed from: d, reason: collision with root package name */
    private final ah f3722d;

    public ak(Executor executor, ah ahVar, ai aiVar, Handler handler) {
        this.f3721c = executor;
        this.f3722d = ahVar;
        this.f3719a = aiVar;
        this.f3720b = handler;
    }

    public void a(com.chartboost.sdk.Model.c cVar, boolean z, String str, CBError.CBClickError cBClickError, aj ajVar) {
        if (cVar != null) {
            cVar.x = false;
            if (cVar.b()) {
                cVar.l = 4;
            }
        }
        if (!z) {
            if (com.chartboost.sdk.i.f3679c != null) {
                com.chartboost.sdk.i.f3679c.didFailToRecordClick(str, cBClickError);
            }
        } else if (cVar != null && cVar.w != null) {
            this.f3722d.a(cVar.w);
        } else if (ajVar != null) {
            this.f3722d.a(ajVar);
        }
    }

    public void a(final com.chartboost.sdk.Model.c cVar, final String str, final Activity activity, final aj ajVar) {
        try {
            String scheme = new URI(str).getScheme();
            if (scheme == null) {
                a(cVar, false, str, CBError.CBClickError.URI_INVALID, ajVar);
            } else if (!scheme.equals(Constants.HTTP) && !scheme.equals(Constants.HTTPS)) {
                a(cVar, str, (Context) activity, ajVar);
            } else {
                this.f3721c.execute(new Runnable() { // from class: com.chartboost.sdk.impl.ak.1
                    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
                    
                        if (r2 != null) goto L11;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
                    
                        r2.disconnect();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
                    
                        if (r2 == null) goto L26;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x004b A[Catch: Exception -> 0x0053, TRY_ENTER, TryCatch #4 {Exception -> 0x0053, blocks: (B:2:0x0000, B:13:0x0031, B:21:0x004b, B:22:0x004e, B:28:0x004f), top: B:1:0x0000 }] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public void run() {
                        HttpURLConnection httpURLConnection;
                        Exception e;
                        try {
                            String str2 = str;
                            if (ak.this.f3719a.b()) {
                                HttpURLConnection httpURLConnection2 = null;
                                try {
                                    try {
                                        httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                                        try {
                                            httpURLConnection.setInstanceFollowRedirects(false);
                                            httpURLConnection.setConnectTimeout(10000);
                                            httpURLConnection.setReadTimeout(10000);
                                            String headerField = httpURLConnection.getHeaderField(com.aiming.mdt.utils.Constants.KEY_LOCATION);
                                            if (headerField != null) {
                                                str2 = headerField;
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            CBLogging.a("CBURLOpener", "Exception raised while opening a HTTP Conection", e);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        if (0 != 0) {
                                            httpURLConnection2.disconnect();
                                        }
                                        throw th;
                                    }
                                } catch (Exception e3) {
                                    httpURLConnection = null;
                                    e = e3;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (0 != 0) {
                                    }
                                    throw th;
                                }
                            }
                            a(str2);
                        } catch (Exception e4) {
                            com.chartboost.sdk.Tracking.a.a(ak.class, "open followTask", e4);
                        }
                    }

                    private void a(final String str2) {
                        Runnable runnable = new Runnable() { // from class: com.chartboost.sdk.impl.ak.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    ak.this.a(cVar, str2, (Context) activity, ajVar);
                                } catch (Exception e) {
                                    com.chartboost.sdk.Tracking.a.a(ak.class, "open openOnUiThread Runnable.run", e);
                                }
                            }
                        };
                        if (activity != null) {
                            activity.runOnUiThread(runnable);
                        } else {
                            ak.this.f3720b.post(runnable);
                        }
                    }
                });
            }
        } catch (URISyntaxException unused) {
            a(cVar, false, str, CBError.CBClickError.URI_INVALID, ajVar);
        }
    }

    void a(com.chartboost.sdk.Model.c cVar, String str, Context context, aj ajVar) {
        String str2;
        Exception e;
        String str3;
        if (cVar != null && cVar.b()) {
            cVar.l = 5;
        }
        if (context == null) {
            context = com.chartboost.sdk.i.m;
        }
        if (context == null) {
            a(cVar, false, str, CBError.CBClickError.NO_HOST_ACTIVITY, ajVar);
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.setData(Uri.parse(str));
            context.startActivity(intent);
        } catch (Exception unused) {
            if (str.startsWith("market://")) {
                try {
                    String str4 = "http://market.android.com/" + str.substring(9);
                    try {
                        Intent intent2 = new Intent("android.intent.action.VIEW");
                        if (!(context instanceof Activity)) {
                            intent2.addFlags(268435456);
                        }
                        intent2.setData(Uri.parse(str4));
                        context.startActivity(intent2);
                        str3 = str4;
                    } catch (Exception e2) {
                        e = e2;
                        str2 = str4;
                        CBLogging.a("CBURLOpener", "Exception raised openeing an inavld playstore URL", e);
                        a(cVar, false, str2, CBError.CBClickError.URI_UNRECOGNIZED, ajVar);
                        return;
                    }
                } catch (Exception e3) {
                    str2 = str;
                    e = e3;
                }
            } else {
                a(cVar, false, str, CBError.CBClickError.URI_UNRECOGNIZED, ajVar);
            }
        }
        str3 = str;
        a(cVar, true, str3, null, ajVar);
    }

    public boolean a(String str) {
        try {
            Context context = com.chartboost.sdk.i.m;
            Intent intent = new Intent("android.intent.action.VIEW");
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.setData(Uri.parse(str));
            return context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
        } catch (Exception e) {
            CBLogging.a("CBURLOpener", "Cannot open URL", e);
            com.chartboost.sdk.Tracking.a.a(ak.class, "canOpenURL", e);
            return false;
        }
    }

    public void a(com.chartboost.sdk.Model.c cVar, String str, aj ajVar) {
        a(cVar, str, cVar != null ? cVar.g.a() : null, ajVar);
    }
}
