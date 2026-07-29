package com.umeng.commonsdk.framework;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.android.gms.games.GamesStatusCodes;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.noise.ImLatent;
import java.io.File;

/* compiled from: UMNetWorkSender.java */
/* loaded from: classes2.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private static HandlerThread f8974a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Handler f8975b = null;

    /* renamed from: c, reason: collision with root package name */
    private static Handler f8976c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final int f8977d = 273;
    private static final int e = 512;
    private static final int f = 769;
    private static a g;
    private static ConnectivityManager h;
    private static NetworkInfo i;
    private static IntentFilter j;
    private static StatTracer k;
    private static ImLatent l;
    private static boolean m;
    private static BroadcastReceiver n = new BroadcastReceiver() { // from class: com.umeng.commonsdk.framework.c.1
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r4v8 */
        /* JADX WARN: Type inference failed for: r4v9 */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                Context appContext = UMModuleRegister.getAppContext();
                ConnectivityManager unused = c.h = (ConnectivityManager) appContext.getSystemService("connectivity");
                try {
                    NetworkInfo unused2 = c.i = c.h.getActiveNetworkInfo();
                    if (c.i != null && c.i.isAvailable()) {
                        boolean unused3 = c.m = true;
                        c.c(273);
                        appContext = appContext;
                        appContext = appContext;
                        if (c.i.getType() == 1 && context != null) {
                            appContext = 32774;
                            appContext = 32774;
                            try {
                                if (!UMWorkDispatch.eventHasExist(com.umeng.commonsdk.internal.a.j)) {
                                    UMWorkDispatch.sendEvent(context, com.umeng.commonsdk.internal.a.j, com.umeng.commonsdk.internal.b.a(context).a(), null);
                                }
                            } catch (Throwable unused4) {
                            }
                        }
                    } else {
                        com.umeng.commonsdk.statistics.common.d.c("--->>> network disconnected.");
                        boolean unused5 = c.m = false;
                        appContext = appContext;
                    }
                } catch (Throwable th) {
                    com.umeng.commonsdk.proguard.b.a(appContext, th);
                }
            }
        }
    };

    public c(Context context, Handler handler) {
        f8976c = handler;
        try {
            if (f8974a == null) {
                f8974a = new HandlerThread("NetWorkSender");
                f8974a.start();
                if (g == null) {
                    g = new a(b.h(context));
                    g.startWatching();
                    com.umeng.commonsdk.statistics.common.d.b("--->>> FileMonitor has already started!");
                }
                Context appContext = UMModuleRegister.getAppContext();
                if (DeviceConfig.checkPermission(appContext, "android.permission.ACCESS_NETWORK_STATE") && j == null) {
                    j = new IntentFilter();
                    j.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    if (n != null) {
                        appContext.registerReceiver(n, j);
                    }
                }
                if (k == null) {
                    k = StatTracer.getInstance(context);
                    l = ImLatent.getService(context, k);
                }
                if (f8975b == null) {
                    f8975b = new Handler(f8974a.getLooper()) { // from class: com.umeng.commonsdk.framework.c.2
                        @Override // android.os.Handler
                        public void handleMessage(Message message) {
                            int i2 = message.what;
                            if (i2 == 273) {
                                com.umeng.commonsdk.statistics.common.d.b("--->>> handleMessage: recv MSG_PROCESS_NEXT msg.");
                                c.j();
                            } else {
                                if (i2 != 512) {
                                    return;
                                }
                                c.i();
                            }
                        }
                    };
                }
            }
        } catch (Throwable th) {
            com.umeng.commonsdk.proguard.b.a(context, th);
        }
    }

    private static void h() {
        if (f8974a != null) {
            f8974a = null;
        }
        if (f8975b != null) {
            f8975b = null;
        }
        if (f8976c != null) {
            f8976c = null;
        }
        if (l != null) {
            l = null;
        }
        if (k != null) {
            k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i() {
        if (g != null) {
            g.stopWatching();
            g = null;
        }
        if (j != null) {
            if (n != null) {
                UMModuleRegister.getAppContext().unregisterReceiver(n);
                n = null;
            }
            j = null;
        }
        com.umeng.commonsdk.statistics.common.d.b("--->>> handleQuit: Quit sender thread.");
        if (f8974a != null) {
            f8974a.quit();
            h();
        }
    }

    public static void a() {
        c(512);
    }

    private static void b(int i2) {
        if (!m || f8975b == null || f8975b.hasMessages(i2)) {
            return;
        }
        Message obtainMessage = f8975b.obtainMessage();
        obtainMessage.what = i2;
        f8975b.sendMessage(obtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(int i2) {
        if (!m || f8975b == null) {
            return;
        }
        Message obtainMessage = f8975b.obtainMessage();
        obtainMessage.what = i2;
        f8975b.sendMessage(obtainMessage);
    }

    private static void a(int i2, long j2) {
        if (!m || f8975b == null) {
            return;
        }
        Message obtainMessage = f8975b.obtainMessage();
        obtainMessage.what = i2;
        f8975b.sendMessageDelayed(obtainMessage, j2);
    }

    public static void b() {
        b(273);
    }

    private static void a(int i2, int i3) {
        if (!m || f8976c == null) {
            return;
        }
        f8976c.removeMessages(i2);
        Message obtainMessage = f8976c.obtainMessage();
        obtainMessage.what = i2;
        f8976c.sendMessageDelayed(obtainMessage, i3);
    }

    public static void c() {
        a(f, GamesStatusCodes.STATUS_ACHIEVEMENT_UNLOCK_FAILURE);
    }

    /* compiled from: UMNetWorkSender.java */
    static class a extends FileObserver {
        public a(String str) {
            super(str);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i, String str) {
            if ((i & 8) != 8) {
                return;
            }
            com.umeng.commonsdk.statistics.common.d.b("--->>> envelope file created >>> " + str);
            UMRTLog.i(UMRTLog.RTLOG_TAG, "File: " + str + " created.");
            c.c(273);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j() {
        com.umeng.commonsdk.statistics.common.d.b("--->>> handleProcessNext: Enter...");
        if (m) {
            Context appContext = UMModuleRegister.getAppContext();
            try {
                if (b.c(appContext) > 0) {
                    com.umeng.commonsdk.statistics.common.d.b("--->>> The envelope file exists.");
                    if (b.c(appContext) > 100) {
                        com.umeng.commonsdk.statistics.common.d.b("--->>> Number of envelope files is greater than 100, remove old files first.");
                        b.d(appContext);
                    }
                    File e2 = b.e(appContext);
                    if (e2 != null) {
                        com.umeng.commonsdk.statistics.common.d.b("--->>> Ready to send envelope file [" + e2.getPath() + "].");
                        com.umeng.commonsdk.statistics.c cVar = new com.umeng.commonsdk.statistics.c(appContext);
                        if (l != null && l.isLatentActivite()) {
                            l.latentDeactivite();
                            long delayTime = l.getDelayTime();
                            if (delayTime > 0) {
                                com.umeng.commonsdk.statistics.common.d.c("start lacency policy, wait [" + delayTime + "] milliseconds .");
                                try {
                                    Thread.sleep(delayTime * 1000);
                                } catch (Throwable th) {
                                    com.umeng.commonsdk.proguard.b.a(appContext, th);
                                }
                            }
                        }
                        if (cVar.a(e2)) {
                            com.umeng.commonsdk.statistics.common.d.b("--->>> Send envelope file success, delete it.");
                            if (!b.a(e2)) {
                                com.umeng.commonsdk.statistics.common.d.b("--->>> Failed to delete already processed file. We try again after delete failed.");
                                b.a(e2);
                            }
                            c(273);
                            return;
                        }
                        com.umeng.commonsdk.statistics.common.d.b("--->>> Send envelope file failed, abandon and wait next trigger!");
                        return;
                    }
                }
                com.umeng.commonsdk.statistics.common.d.b("--->>> The envelope file not exists, start auto process for module cache data.");
                c();
            } catch (Throwable th2) {
                com.umeng.commonsdk.proguard.b.a(appContext, th2);
            }
        }
    }
}
