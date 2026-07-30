package com.baidu.bdhttpdns;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class BDNetworkStateChangeReceiver extends BroadcastReceiver {

    /* renamed from: f, reason: collision with root package name */
    private static boolean f4201f = true;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f4202g = true;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4204b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4205c = true;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4206d = true;

    /* renamed from: e, reason: collision with root package name */
    private String f4207e = "";

    /* renamed from: a, reason: collision with root package name */
    ExecutorService f4203a = Executors.newFixedThreadPool(1);

    class a implements Callable<Object> {
        a() {
        }

        /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:2|3)|(2:5|6)|(2:8|9)|13|14|15|16|(2:21|22)|18|19|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x003b, code lost:
        
            r5 = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x003c, code lost:
        
            r0 = com.baidu.bdhttpdns.BDNetworkStateChangeReceiver.f4201f = false;
            r1 = r5;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.util.concurrent.Callable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object call() {
            DatagramSocket datagramSocket;
            DatagramSocket datagramSocket2;
            InetSocketAddress inetSocketAddress = new InetSocketAddress("2001:4860:4860::8888", 443);
            InetSocketAddress inetSocketAddress2 = new InetSocketAddress("180.76.76.76", 80);
            try {
                datagramSocket = new DatagramSocket();
            } catch (SocketException unused) {
                datagramSocket = null;
            }
            try {
                datagramSocket.connect(inetSocketAddress2);
                boolean unused2 = BDNetworkStateChangeReceiver.f4202g = true;
            } catch (SocketException unused3) {
                boolean unused4 = BDNetworkStateChangeReceiver.f4202g = false;
                if (datagramSocket != null) {
                }
                datagramSocket2 = new DatagramSocket();
                datagramSocket2.connect(inetSocketAddress);
                boolean unused5 = BDNetworkStateChangeReceiver.f4201f = true;
                if (datagramSocket2 != null) {
                }
                l.a("isIPv4Reachable(%s), isIPv6Reachable(%s)", Boolean.valueOf(BDNetworkStateChangeReceiver.f4202g), Boolean.valueOf(BDNetworkStateChangeReceiver.f4201f));
                return null;
            }
            if (datagramSocket != null) {
                try {
                    datagramSocket.close();
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
            datagramSocket2 = new DatagramSocket();
            datagramSocket2.connect(inetSocketAddress);
            boolean unused52 = BDNetworkStateChangeReceiver.f4201f = true;
            if (datagramSocket2 != null) {
                try {
                    datagramSocket2.close();
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }
            l.a("isIPv4Reachable(%s), isIPv6Reachable(%s)", Boolean.valueOf(BDNetworkStateChangeReceiver.f4202g), Boolean.valueOf(BDNetworkStateChangeReceiver.f4201f));
            return null;
        }
    }

    private void a(Context context) {
        l.a("Network change, clearCache(%b) httpDnsPrefetch(%b)", Boolean.valueOf(this.f4205c), Boolean.valueOf(this.f4206d));
        i a8 = i.a();
        a8.b();
        BDHttpDns service = BDHttpDns.getService(context);
        refreshIpReachable();
        ArrayList<String> b8 = service.a().b();
        if (this.f4205c) {
            service.a().a();
            service.b().a();
        }
        if (!this.f4206d || b8 == null || b8.isEmpty()) {
            return;
        }
        a8.a(b8, new k(context));
    }

    public static boolean isIPv4Reachable() {
        return f4202g;
    }

    public static boolean isIPv6Reachable() {
        return f4201f;
    }

    void b(boolean z7) {
        this.f4206d = z7;
    }

    public boolean isIPv6Only() {
        return !f4202g && f4201f;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:11|(1:(6:39|17|18|(2:21|22)|24|25)(1:38))(1:15)|16|17|18|(2:21|22)|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        r6 = r0;
        r0 = r9;
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
    
        a(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        r0 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        r8.printStackTrace();
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceive(Context context, Intent intent) {
        String str;
        ConnectivityManager connectivityManager;
        String extraInfo;
        String str2 = "";
        if (!this.f4204b) {
            this.f4204b = true;
            return;
        }
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (RuntimeException e8) {
            e = e8;
        }
        if (connectivityManager == null) {
            a(context);
            return;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
        if (networkInfo != null && networkInfo.getState() == NetworkInfo.State.CONNECTED) {
            extraInfo = networkInfo.getExtraInfo();
        } else {
            if (networkInfo2 == null || networkInfo2.getState() != NetworkInfo.State.CONNECTED) {
                str = "";
                if (!this.f4207e.equals(str) && str != "") {
                    l.a("Current net type: %s.", str);
                    a(context);
                }
                this.f4207e = str;
            }
            extraInfo = networkInfo2.getExtraInfo();
        }
        str = extraInfo.toString();
        if (!this.f4207e.equals(str)) {
            l.a("Current net type: %s.", str);
            a(context);
        }
        this.f4207e = str;
    }

    public void refreshIpReachable() {
        this.f4203a.submit(new a());
    }

    void a(boolean z7) {
        this.f4205c = z7;
    }
}
