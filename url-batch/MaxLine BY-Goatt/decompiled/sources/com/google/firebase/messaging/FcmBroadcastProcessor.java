package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import defpackage.ey;
import defpackage.jt2;
import defpackage.kk0;
import defpackage.mi2;
import defpackage.p30;
import defpackage.s03;
import defpackage.th;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class FcmBroadcastProcessor {
    private static final String EXTRA_BINARY_DATA = "rawData";
    private static final String EXTRA_BINARY_DATA_BASE_64 = "gcm.rawData64";
    private static WithinAppServiceConnection fcmServiceConn;
    private static final Object lock = new Object();
    private final Context context;
    private final Executor executor;

    public FcmBroadcastProcessor(Context context) {
        this.context = context;
        this.executor = new th(1);
    }

    private static jt2 bindToMessagingService(Context context, Intent intent, boolean z) {
        if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "Binding to service");
        }
        WithinAppServiceConnection serviceConnection = getServiceConnection(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z) {
            return serviceConnection.sendIntent(intent).f(new th(1), new ey(27));
        }
        if (ServiceStarter.getInstance().hasWakeLockPermission(context)) {
            WakeLockHolder.sendWakefulServiceIntent(context, serviceConnection, intent);
        } else {
            serviceConnection.sendIntent(intent);
        }
        return mi2.j(-1);
    }

    private static WithinAppServiceConnection getServiceConnection(Context context, String str) {
        WithinAppServiceConnection withinAppServiceConnection;
        synchronized (lock) {
            try {
                if (fcmServiceConn == null) {
                    fcmServiceConn = new WithinAppServiceConnection(context, str);
                }
                withinAppServiceConnection = fcmServiceConn;
            } catch (Throwable th) {
                throw th;
            }
        }
        return withinAppServiceConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$bindToMessagingService$3(jt2 jt2Var) {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$startMessagingService$0(Context context, Intent intent) {
        return Integer.valueOf(ServiceStarter.getInstance().startMessagingService(context, intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$startMessagingService$1(jt2 jt2Var) {
        return 403;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ jt2 lambda$startMessagingService$2(Context context, Intent intent, boolean z, jt2 jt2Var) {
        return (s03.A() && ((Integer) jt2Var.i()).intValue() == 402) ? bindToMessagingService(context, intent, z).f(new th(1), new ey(26)) : jt2Var;
    }

    public static void reset() {
        synchronized (lock) {
            fcmServiceConn = null;
        }
    }

    public static void setServiceConnection(WithinAppServiceConnection withinAppServiceConnection) {
        synchronized (lock) {
            fcmServiceConn = withinAppServiceConnection;
        }
    }

    public jt2 process(Intent intent) {
        String stringExtra = intent.getStringExtra(EXTRA_BINARY_DATA_BASE_64);
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra(EXTRA_BINARY_DATA_BASE_64);
        }
        return startMessagingService(this.context, intent);
    }

    public jt2 startMessagingService(final Context context, final Intent intent) {
        int i = 0;
        boolean z = s03.A() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        if (!z || z2) {
            return mi2.f(new kk0(i, context, intent), this.executor).g(this.executor, new p30() { // from class: lk0
                @Override // defpackage.p30
                public final Object g(jt2 jt2Var) {
                    jt2 lambda$startMessagingService$2;
                    lambda$startMessagingService$2 = FcmBroadcastProcessor.lambda$startMessagingService$2(context, intent, z2, jt2Var);
                    return lambda$startMessagingService$2;
                }
            });
        }
        return bindToMessagingService(context, intent, z2);
    }

    public FcmBroadcastProcessor(Context context, ExecutorService executorService) {
        this.context = context;
        this.executor = executorService;
    }
}
