package com.huawei.hms.ads.installreferrer.api;

import D0.b;
import D0.c;
import D0.d;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.ads.installreferrer.commons.LogUtil;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class DeeplinkClient {
    private static final int BLOCKING_QUEUE_CAPACITY = 2048;
    private static final int KEEP_ALIVE_TIME = 60;
    private static final String TAG = "DeeplinkClient";
    private static final ThreadPoolExecutor THREAD_POOL_EXECUTOR = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(2048), new b("Deeplink"));
    private Context context;
    private OnDeeplinkAcquiredListener deepLinkListener;
    private Uri deeplinkUrl;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c a4 = d.a(DeeplinkClient.this.context);
            if (a4.a()) {
                LogUtil.logInfo(DeeplinkClient.TAG, "deeplink has request");
                return;
            }
            a4.a(true);
            String b4 = D0.a.b(DeeplinkClient.this.context);
            DeeplinkClient.this.deeplinkUrl = D0.a.a(b4);
            if (DeeplinkClient.this.deeplinkUrl == null) {
                LogUtil.logInfo(DeeplinkClient.TAG, "deeplink Url is empty");
            } else {
                if (DeeplinkClient.this.deepLinkListener == null || DeeplinkClient.this.deepLinkListener.launchDeeplink(DeeplinkClient.this.deeplinkUrl)) {
                    return;
                }
                LogUtil.logInfo(DeeplinkClient.TAG, "start deeplink activity");
                DeeplinkClient deeplinkClient = DeeplinkClient.this;
                deeplinkClient.launchDeeplink(deeplinkClient.deeplinkUrl);
            }
        }
    }

    public DeeplinkClient(Context context, OnDeeplinkAcquiredListener onDeeplinkAcquiredListener) {
        this.deepLinkListener = onDeeplinkAcquiredListener;
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchDeeplink(Uri uri) {
        try {
            Intent parseAndCheckIntent = parseAndCheckIntent(this.context, uri.toString(), this.context.getPackageName());
            if (parseAndCheckIntent == null) {
                LogUtil.logWarn(TAG, "cannot find target activity");
                return;
            }
            if (!(this.context instanceof Activity)) {
                parseAndCheckIntent.addFlags(268435456);
            }
            parseAndCheckIntent.setClipData(ClipData.newPlainText("l", "t"));
            this.context.startActivity(parseAndCheckIntent);
        } catch (Throwable unused) {
            LogUtil.logWarn(TAG, "handle intent url fail");
        }
    }

    private Intent parseAndCheckIntent(Context context, String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && context.getPackageManager() != null) {
                Intent parseUri = Intent.parseUri(Uri.decode(str), 1);
                if (!TextUtils.isEmpty(str2)) {
                    parseUri.setPackage(str2);
                }
                return parseUri.getData() != null ? parseUri.setDataAndTypeAndNormalize(parseUri.getData(), parseUri.getType()) : parseUri;
            }
        } catch (Throwable th) {
            LogUtil.logWarn(TAG, "handle intent url fail! Exception is: " + th.getClass().getSimpleName());
        }
        return null;
    }

    public void request() {
        try {
            THREAD_POOL_EXECUTOR.execute(new a());
        } catch (Throwable unused) {
            LogUtil.logError(TAG, "request deeplink exception");
        }
    }
}
