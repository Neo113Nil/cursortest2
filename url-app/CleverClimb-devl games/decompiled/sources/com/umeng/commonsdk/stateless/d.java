package com.umeng.commonsdk.stateless;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import java.io.File;

/* compiled from: UMSLNetWorkSender.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f9112a = 273;

    /* renamed from: b, reason: collision with root package name */
    private static Context f9113b = null;

    /* renamed from: c, reason: collision with root package name */
    private static HandlerThread f9114c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Handler f9115d = null;
    private static final int f = 512;
    private static IntentFilter g;
    private static Object e = new Object();
    private static boolean h = false;
    private static BroadcastReceiver i = new BroadcastReceiver() { // from class: com.umeng.commonsdk.stateless.d.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ConnectivityManager connectivityManager;
            if (context == null || intent == null) {
                return;
            }
            try {
                if (intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    Context unused = d.f9113b = context.getApplicationContext();
                    if (d.f9113b != null && (connectivityManager = (ConnectivityManager) d.f9113b.getSystemService("connectivity")) != null) {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                            boolean unused2 = d.h = true;
                            com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] net reveiver ok --->>>");
                            d.b(d.f9112a);
                        } else {
                            com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] net reveiver disconnected --->>>");
                            boolean unused3 = d.h = false;
                        }
                    }
                }
            } catch (Throwable th) {
                com.umeng.commonsdk.proguard.b.a(context, th);
            }
        }
    };

    public d(Context context) {
        synchronized (e) {
            if (context != null) {
                try {
                    f9113b = context.getApplicationContext();
                    if (f9113b != null && f9114c == null) {
                        f9114c = new HandlerThread("SL-NetWorkSender");
                        f9114c.start();
                        if (f9115d == null) {
                            f9115d = new Handler(f9114c.getLooper()) { // from class: com.umeng.commonsdk.stateless.d.2
                                @Override // android.os.Handler
                                public void handleMessage(Message message) {
                                    int i2 = message.what;
                                    if (i2 == 273) {
                                        d.e();
                                    } else {
                                        if (i2 != 512) {
                                            return;
                                        }
                                        d.f();
                                    }
                                }
                            };
                        }
                        if (DeviceConfig.checkPermission(f9113b, "android.permission.ACCESS_NETWORK_STATE")) {
                            com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] begin register receiver");
                            if (g == null) {
                                g = new IntentFilter();
                                g.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                                if (i != null) {
                                    com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] register receiver ok");
                                    f9113b.registerReceiver(i, g);
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    com.umeng.commonsdk.proguard.b.a(context, th);
                }
            }
        }
    }

    public static void a(int i2) {
        if (!h || f9115d == null) {
            return;
        }
        Message obtainMessage = f9115d.obtainMessage();
        obtainMessage.what = i2;
        f9115d.sendMessage(obtainMessage);
    }

    public static void b(int i2) {
        try {
            if (!h || f9115d == null || f9115d.hasMessages(i2)) {
                return;
            }
            com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] sendMsgOnce !!!!");
            Message obtainMessage = f9115d.obtainMessage();
            obtainMessage.what = i2;
            f9115d.sendMessage(obtainMessage);
        } catch (Throwable th) {
            com.umeng.commonsdk.proguard.b.a(f9113b, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e() {
        if (!h || f9113b == null) {
            return;
        }
        try {
            File a2 = f.a(f9113b);
            if (a2 == null || a2.getParentFile() == null || TextUtils.isEmpty(a2.getParentFile().getName())) {
                return;
            }
            e eVar = new e(f9113b);
            String str = new String(Base64.decode(a2.getParentFile().getName(), 0));
            com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] handleProcessNext, pathUrl is " + str);
            byte[] bArr = null;
            try {
                bArr = f.a(a2.getAbsolutePath());
            } catch (Exception unused) {
            }
            if (eVar.a(bArr, str)) {
                com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] Send envelope file success, delete it.");
                File file = new File(a2.getAbsolutePath());
                if (!file.delete()) {
                    com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] Failed to delete already processed file. We try again after delete failed.");
                    file.delete();
                }
                b(f9112a);
                return;
            }
            com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] Send envelope file failed, abandon and wait next trigger!");
        } catch (Throwable th) {
            com.umeng.commonsdk.proguard.b.a(f9113b, th);
        }
    }

    public static void a() {
        b(512);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f() {
        if (g != null) {
            if (i != null) {
                if (f9113b != null) {
                    f9113b.unregisterReceiver(i);
                }
                i = null;
            }
            g = null;
        }
        if (f9114c != null) {
            f9114c.quit();
            if (f9114c != null) {
                f9114c = null;
            }
            if (f9115d != null) {
                f9115d = null;
            }
        }
    }
}
