package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class sc1 {

    /* renamed from: e, reason: collision with root package name */
    private static sc1 f31679e;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f31680a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<WeakReference<b>> f31681b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final Object f31682c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private int f31683d = 0;

    private static final class a {

        /* renamed from: com.yandex.mobile.ads.impl.sc1$a$a, reason: collision with other inner class name */
        private static final class C0202a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a, reason: collision with root package name */
            private final sc1 f31684a;

            public C0202a(sc1 sc1Var) {
                this.f31684a = sc1Var;
            }

            public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType;
                overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f31684a.a(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void a(Context context, sc1 sc1Var) {
            Executor mainExecutor;
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                telephonyManager.getClass();
                C0202a c0202a = new C0202a(sc1Var);
                mainExecutor = context.getMainExecutor();
                telephonyManager.registerTelephonyCallback(mainExecutor, c0202a);
                telephonyManager.unregisterTelephonyCallback(c0202a);
            } catch (RuntimeException unused) {
                sc1Var.a(5);
            }
        }
    }

    public interface b {
        void a(int i4);
    }

    private final class c extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int b4 = sc1.b(context);
            if (u82.f32873a < 31 || b4 != 5) {
                sc1.this.a(b4);
            } else {
                a.a(context, sc1.this);
            }
        }

        private c() {
        }
    }

    private sc1(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new c(), intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return 1;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    return 2;
                }
                if (type == 9) {
                    return 7;
                }
                if (type != 4 && type != 5) {
                    return type != 6 ? 8 : 5;
                }
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                    return 3;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 14:
                case 15:
                case 17:
                    return 4;
                case 13:
                    return 5;
                case 16:
                case 19:
                default:
                    return 6;
                case 18:
                    return 2;
                case 20:
                    return u82.f32873a >= 29 ? 9 : 0;
            }
        } catch (SecurityException unused) {
            return 0;
        }
    }

    public final int a() {
        int i4;
        synchronized (this.f31682c) {
            i4 = this.f31683d;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        bVar.a(a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i4) {
        synchronized (this.f31682c) {
            try {
                if (this.f31683d == i4) {
                    return;
                }
                this.f31683d = i4;
                Iterator<WeakReference<b>> it = this.f31681b.iterator();
                while (it.hasNext()) {
                    WeakReference<b> next = it.next();
                    b bVar = next.get();
                    if (bVar != null) {
                        bVar.a(i4);
                    } else {
                        this.f31681b.remove(next);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(final b bVar) {
        Iterator<WeakReference<b>> it = this.f31681b.iterator();
        while (it.hasNext()) {
            WeakReference<b> next = it.next();
            if (next.get() == null) {
                this.f31681b.remove(next);
            }
        }
        this.f31681b.add(new WeakReference<>(bVar));
        this.f31680a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.Gd
            @Override // java.lang.Runnable
            public final void run() {
                sc1.this.a(bVar);
            }
        });
    }

    public static synchronized sc1 a(Context context) {
        sc1 sc1Var;
        synchronized (sc1.class) {
            try {
                if (f31679e == null) {
                    f31679e = new sc1(context);
                }
                sc1Var = f31679e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sc1Var;
    }
}
