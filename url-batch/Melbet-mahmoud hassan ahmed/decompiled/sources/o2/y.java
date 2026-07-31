package o2;

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
import c4.w0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: e, reason: collision with root package name */
    private static y f19829e;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f19830a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<WeakReference<c>> f19831b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final Object f19832c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private int f19833d = 0;

    private static final class b {

        private static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a, reason: collision with root package name */
            private final y f19834a;

            public a(y yVar) {
                this.f19834a = yVar;
            }

            @Override // android.telephony.TelephonyCallback.DisplayInfoListener
            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f19834a.k(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void a(Context context, y yVar) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) o2.a.e((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(yVar);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                yVar.k(5);
            }
        }
    }

    public interface c {
        void a(int i7);
    }

    private final class d extends BroadcastReceiver {
        private d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int g7 = y.g(context);
            if (m0.f19752a < 31 || g7 != 5) {
                y.this.k(g7);
            } else {
                b.a(context, y.this);
            }
        }
    }

    private y(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(), intentFilter);
    }

    public static synchronized y d(Context context) {
        y yVar;
        synchronized (y.class) {
            if (f19829e == null) {
                f19829e = new y(context);
            }
            yVar = f19829e;
        }
        return yVar;
    }

    private static int e(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case w0.f2149o /* 7 */:
            case w0.f2150p /* 8 */:
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
                return m0.f19752a >= 29 ? 9 : 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i7 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i7 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return e(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(c cVar) {
        cVar.a(f());
    }

    private void j() {
        Iterator<WeakReference<c>> it = this.f19831b.iterator();
        while (it.hasNext()) {
            WeakReference<c> next = it.next();
            if (next.get() == null) {
                this.f19831b.remove(next);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(int i7) {
        synchronized (this.f19832c) {
            if (this.f19833d == i7) {
                return;
            }
            this.f19833d = i7;
            Iterator<WeakReference<c>> it = this.f19831b.iterator();
            while (it.hasNext()) {
                WeakReference<c> next = it.next();
                c cVar = next.get();
                if (cVar != null) {
                    cVar.a(i7);
                } else {
                    this.f19831b.remove(next);
                }
            }
        }
    }

    public int f() {
        int i7;
        synchronized (this.f19832c) {
            i7 = this.f19833d;
        }
        return i7;
    }

    public void i(final c cVar) {
        j();
        this.f19831b.add(new WeakReference<>(cVar));
        this.f19830a.post(new Runnable() { // from class: o2.x
            @Override // java.lang.Runnable
            public final void run() {
                y.this.h(cVar);
            }
        });
    }
}
