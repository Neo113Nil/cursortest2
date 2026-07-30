package com.baidu.ar.arplay.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import com.baidu.ar.arplay.util.c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f1726a = false;

    /* renamed from: b, reason: collision with root package name */
    public static c.a f1727b;

    /* renamed from: c, reason: collision with root package name */
    public static ArrayList<a> f1728c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public static volatile BroadcastReceiver f1729d;

    public static BroadcastReceiver a() {
        if (f1729d == null) {
            synchronized (b.class) {
                try {
                    if (f1729d == null) {
                        f1729d = new b();
                    }
                } finally {
                }
            }
        }
        return f1729d;
    }

    public static void b(a aVar) {
        ArrayList<a> arrayList = f1728c;
        if (arrayList == null || !arrayList.contains(aVar)) {
            return;
        }
        f1728c.remove(aVar);
    }

    public final void c() {
        if (f1728c.isEmpty()) {
            return;
        }
        int size = f1728c.size();
        for (int i8 = 0; i8 < size; i8++) {
            a aVar = f1728c.get(i8);
            if (aVar != null) {
                if (b()) {
                    aVar.a(f1727b);
                } else {
                    aVar.a();
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        f1729d = this;
        if ("android.net.conn.CONNECTIVITY_CHANGE".equalsIgnoreCase(intent.getAction()) || "com.baidu.ar.baiduarsdk.CONNECTIVITY_CHANGE".equalsIgnoreCase(intent.getAction())) {
            if (c.b(context)) {
                Log.e(b.class.getName(), "<--- network connected --->");
                f1726a = true;
                f1727b = c.a(context);
            } else {
                Log.e(b.class.getName(), "<--- network disconnected --->");
                f1726a = false;
            }
            c();
        }
    }

    public static void a(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.baidu.ar.baiduarsdk.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        int i8 = Build.VERSION.SDK_INT;
        Context applicationContext = context.getApplicationContext();
        if (i8 >= 26) {
            applicationContext.registerReceiver(a(), intentFilter, 2);
        } else {
            applicationContext.registerReceiver(a(), intentFilter);
        }
    }

    public static boolean b() {
        return f1726a;
    }

    public static void a(a aVar) {
        if (f1728c == null) {
            f1728c = new ArrayList<>();
        }
        f1728c.add(aVar);
    }
}
