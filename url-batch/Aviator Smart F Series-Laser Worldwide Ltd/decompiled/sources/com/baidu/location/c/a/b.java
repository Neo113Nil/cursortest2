package com.baidu.location.c.a;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.DhcpInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class b implements com.baidu.location.c.c.a {

    /* renamed from: g, reason: collision with root package name */
    private Context f4966g;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4962c = false;

    /* renamed from: d, reason: collision with root package name */
    private WifiManager f4963d = null;

    /* renamed from: e, reason: collision with root package name */
    private c f4964e = null;

    /* renamed from: f, reason: collision with root package name */
    private com.baidu.location.c.m f4965f = null;

    /* renamed from: h, reason: collision with root package name */
    private AtomicInteger f4967h = new AtomicInteger(0);

    /* renamed from: i, reason: collision with root package name */
    public long f4968i = 0;

    /* renamed from: j, reason: collision with root package name */
    private long f4969j = 0;

    /* renamed from: k, reason: collision with root package name */
    private long f4970k = 0;

    /* renamed from: l, reason: collision with root package name */
    private long f4971l = 0;

    /* renamed from: m, reason: collision with root package name */
    private long f4972m = 0;

    /* renamed from: n, reason: collision with root package name */
    private WifiInfo f4973n = null;

    /* renamed from: o, reason: collision with root package name */
    private String f4974o = null;

    /* renamed from: p, reason: collision with root package name */
    private final Object f4975p = new Object();

    /* renamed from: q, reason: collision with root package name */
    private final Object f4976q = new Object();

    /* renamed from: r, reason: collision with root package name */
    private Handler f4977r = null;

    /* renamed from: s, reason: collision with root package name */
    private String f4978s = null;

    /* renamed from: com.baidu.location.c.a.b$b, reason: collision with other inner class name */
    private static class C0051b {

        /* renamed from: a, reason: collision with root package name */
        private static b f4979a = new b();
    }

    private class c extends BroadcastReceiver {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.j();
                synchronized (b.this.f4975p) {
                    try {
                        b.this.f4975p.notifyAll();
                        if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                            com.baidu.location.c.i.i().a("WifiScan finished, in callback.");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (context == null) {
                return;
            }
            if ((!com.baidu.location.c.c.a.f5000b || com.baidu.location.c.i.i().a(intent)) && intent.getAction().equals("android.net.wifi.SCAN_RESULTS")) {
                b.this.f4968i = System.currentTimeMillis() / 1000;
                b.this.f4977r.post(new a());
            }
        }
    }

    public static b a() {
        return C0051b.f4979a;
    }

    private synchronized WifiInfo g() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f4971l > 5000) {
                WifiManager wifiManager = this.f4963d;
                if (wifiManager != null) {
                    this.f4973n = wifiManager.getConnectionInfo();
                }
                this.f4971l = currentTimeMillis;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f4973n;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void h() {
        try {
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        if (!this.f4963d.isWifiEnabled()) {
            if (this.f4963d.isScanAlwaysAvailable()) {
            }
            this.f4969j = System.currentTimeMillis();
            synchronized (this.f4975p) {
                try {
                    int i8 = this.f4967h.get();
                    if (i8 != 0) {
                        this.f4975p.wait(i8);
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }
            return;
        }
        this.f4963d.startScan();
        if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
            com.baidu.location.c.i.i().a("wifimanager start scan ...");
        }
        this.f4969j = System.currentTimeMillis();
        synchronized (this.f4975p) {
        }
    }

    private String i() {
        DhcpInfo dhcpInfo;
        WifiManager wifiManager = this.f4963d;
        if (wifiManager == null || (dhcpInfo = wifiManager.getDhcpInfo()) == null) {
            return null;
        }
        return b(dhcpInfo.gateway);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        WifiManager wifiManager = this.f4963d;
        if (wifiManager == null) {
            return;
        }
        try {
            List<ScanResult> scanResults = wifiManager.getScanResults();
            if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(cn.hutool.core.date.d.NORM_DATETIME_PATTERN);
                long currentTimeMillis = System.currentTimeMillis();
                if (scanResults != null && scanResults.size() > 0) {
                    StringBuilder sb = new StringBuilder();
                    long j8 = 0;
                    for (int i8 = 0; i8 < scanResults.size(); i8++) {
                        if (i8 == 0) {
                            try {
                                j8 = (currentTimeMillis - scanResults.get(0).timestamp) / 1000000;
                            } catch (Exception e8) {
                                e8.printStackTrace();
                                j8 = 0;
                            }
                            sb.append(scanResults.get(0).BSSID + ";" + Math.abs(scanResults.get(0).level) + ";" + scanResults.get(0).SSID.trim() + ";" + scanResults.get(0).frequency + ";" + j8 + b5.b.VERTICAL);
                        }
                        sb.append(scanResults.get(i8).BSSID + ";" + Math.abs(scanResults.get(i8).level) + ";" + scanResults.get(i8).SSID.trim() + ";" + scanResults.get(i8).frequency + ";" + (((currentTimeMillis - scanResults.get(i8).timestamp) / 1000000) - j8) + b5.b.VERTICAL);
                    }
                    sb.append("\t");
                    sb.append(simpleDateFormat.format(new Date(currentTimeMillis)));
                    sb.append("\t");
                    sb.append(currentTimeMillis);
                    sb.append("\tnull\n");
                    com.baidu.location.c.i.i().a(sb.toString());
                }
            }
            if (scanResults != null) {
                com.baidu.location.c.m mVar = new com.baidu.location.c.m(scanResults, System.currentTimeMillis());
                synchronized (this.f4976q) {
                    try {
                        com.baidu.location.c.m mVar2 = this.f4965f;
                        if (mVar2 != null) {
                            if (!a(mVar, mVar2)) {
                            }
                        }
                        this.f4965f = mVar;
                    } finally {
                    }
                }
            }
        } catch (Exception e9) {
            if (com.baidu.location.c.c.a.f4999a) {
                e9.printStackTrace();
            }
        }
    }

    public long c() {
        return this.f4969j;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0031 -> B:15:0x0036). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0033 -> B:15:0x0036). Please report as a decompilation issue!!! */
    public com.baidu.location.c.m d() {
        com.baidu.location.c.m a8;
        synchronized (this.f4976q) {
            a8 = a(this.f4965f);
        }
        if (a8 == null || !a8.b()) {
            try {
                WifiManager wifiManager = this.f4963d;
                a8 = wifiManager != null ? new com.baidu.location.c.m(wifiManager.getScanResults(), this.f4969j) : new com.baidu.location.c.m(null, 0L);
            } catch (Exception e8) {
                if (com.baidu.location.c.c.a.f4999a) {
                    e8.printStackTrace();
                }
            }
        }
        return a8;
    }

    public String e() {
        StringBuffer stringBuffer = new StringBuffer();
        WifiInfo f8 = a().f();
        String a8 = a(f8, (String) null);
        if (f8 == null || a8 == null) {
            return null;
        }
        String replace = a8.replace(":", "");
        int rssi = f8.getRssi();
        String i8 = a().i();
        if (rssi < 0) {
            rssi = -rssi;
        }
        if (replace == null || rssi >= 100 || "020000000000".equals(replace)) {
            return null;
        }
        stringBuffer.append("&wf=");
        stringBuffer.append(replace);
        stringBuffer.append(";");
        stringBuffer.append("" + rssi + ";");
        String ssid = f8.getSSID();
        if (ssid != null && (ssid.contains("&") || ssid.contains(";"))) {
            ssid = ssid.replace("&", "_");
        }
        stringBuffer.append(ssid);
        stringBuffer.append("&wf_n=1");
        if (i8 != null) {
            stringBuffer.append("&wf_gw=");
            stringBuffer.append(i8);
        }
        return stringBuffer.toString();
    }

    public WifiInfo f() {
        try {
            WifiInfo g8 = g();
            String a8 = a(g8, (String) null);
            if (g8 != null && a8 != null && g8.getRssi() > -100) {
                String replace = a8.replace(":", "");
                if (!"000000000000".equals(replace) && !"".equals(replace)) {
                    if (!"020000000000".equals(replace)) {
                        return g8;
                    }
                }
            }
        } catch (Error | Exception unused) {
        }
        return null;
    }

    private String b(long j8) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(String.valueOf((int) (j8 & 255)));
        stringBuffer.append('.');
        stringBuffer.append(String.valueOf((int) ((j8 >> 8) & 255)));
        stringBuffer.append('.');
        stringBuffer.append(String.valueOf((int) ((j8 >> 16) & 255)));
        stringBuffer.append('.');
        stringBuffer.append(String.valueOf((int) ((j8 >> 24) & 255)));
        return stringBuffer.toString();
    }

    public com.baidu.location.c.m a(long j8) {
        com.baidu.location.c.g i8;
        String str;
        if (this.f4963d != null && j8 < 2147483647L) {
            boolean z7 = com.baidu.location.c.c.a.f4999a;
            if (z7 && com.baidu.location.c.c.a.f5000b) {
                com.baidu.location.c.i.i().a("Wi-Fi diffTime = " + j8 + "mLastDiffTime = " + this.f4970k);
            }
            if (j8 == this.f4970k) {
                if (z7 && com.baidu.location.c.c.a.f5000b) {
                    com.baidu.location.c.i.i().a("System.currentTimeMillis() = " + System.currentTimeMillis() + "wifi diffTime = " + j8 + ", mScanTime = " + this.f4969j);
                }
                if (System.currentTimeMillis() - this.f4969j > j8) {
                    if (z7 && com.baidu.location.c.c.a.f5000b) {
                        i8 = com.baidu.location.c.i.i();
                        str = "time is over";
                        i8.a(str);
                    }
                    h();
                }
            } else {
                if (z7 && com.baidu.location.c.c.a.f5000b) {
                    i8 = com.baidu.location.c.i.i();
                    str = "diffTime is changed";
                    i8.a(str);
                }
                h();
            }
        }
        this.f4970k = j8;
        return this.f4965f;
    }

    private com.baidu.location.c.m a(com.baidu.location.c.m mVar) {
        if (mVar != null) {
            return new com.baidu.location.c.m(mVar.f5138a, mVar.f5139b);
        }
        return null;
    }

    private String b(String str) {
        return str != null ? (str.contains("&") || str.contains(";")) ? str.replace("&", "_").replace(";", "_") : str : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01bd A[Catch: Error -> 0x0112, Exception -> 0x011e, TryCatch #0 {Exception -> 0x011e, blocks: (B:145:0x0125, B:147:0x0129, B:149:0x012d, B:150:0x0153, B:153:0x0160, B:44:0x0182, B:137:0x01b0, B:48:0x01b5, B:49:0x01c3, B:51:0x01cf, B:54:0x01e6, B:56:0x0200, B:58:0x0206, B:125:0x01bd, B:162:0x0116, B:164:0x011a), top: B:144:0x0125 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0339 A[EDGE_INSN: B:170:0x0339->B:171:0x0339 BREAK  A[LOOP:0: B:35:0x00d7->B:77:0x032d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03e1 A[Catch: Exception -> 0x021c, Error -> 0x021f, TryCatch #1 {Error -> 0x021f, blocks: (B:61:0x0212, B:68:0x0230, B:70:0x0236, B:72:0x0242, B:74:0x0252, B:77:0x032d, B:83:0x02cd, B:85:0x02d1, B:92:0x0285, B:94:0x028b, B:96:0x0297, B:98:0x02a7, B:108:0x02d5, B:110:0x02dd, B:112:0x02e1, B:113:0x0304, B:171:0x0339, B:173:0x0346, B:175:0x034a, B:178:0x0369, B:180:0x0371, B:182:0x037c, B:185:0x038e, B:186:0x0398, B:188:0x03a4, B:191:0x03b8, B:196:0x03d9, B:200:0x0395, B:205:0x03e1, B:207:0x03f9, B:211:0x040c, B:214:0x0426, B:216:0x042c, B:218:0x043b, B:219:0x0453, B:221:0x0459, B:223:0x0461, B:225:0x047d, B:226:0x046a, B:228:0x0477, B:232:0x0481, B:234:0x0485, B:236:0x0489, B:237:0x04a6, B:238:0x04ad, B:240:0x04cd, B:242:0x04dc, B:243:0x04e6), top: B:60:0x0212 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b5 A[Catch: Error -> 0x0112, Exception -> 0x011e, TryCatch #0 {Exception -> 0x011e, blocks: (B:145:0x0125, B:147:0x0129, B:149:0x012d, B:150:0x0153, B:153:0x0160, B:44:0x0182, B:137:0x01b0, B:48:0x01b5, B:49:0x01c3, B:51:0x01cf, B:54:0x01e6, B:56:0x0200, B:58:0x0206, B:125:0x01bd, B:162:0x0116, B:164:0x011a), top: B:144:0x0125 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01cf A[Catch: Error -> 0x0112, Exception -> 0x011e, TryCatch #0 {Exception -> 0x011e, blocks: (B:145:0x0125, B:147:0x0129, B:149:0x012d, B:150:0x0153, B:153:0x0160, B:44:0x0182, B:137:0x01b0, B:48:0x01b5, B:49:0x01c3, B:51:0x01cf, B:54:0x01e6, B:56:0x0200, B:58:0x0206, B:125:0x01bd, B:162:0x0116, B:164:0x011a), top: B:144:0x0125 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d1 A[Catch: Exception -> 0x021c, Error -> 0x021f, TryCatch #1 {Error -> 0x021f, blocks: (B:61:0x0212, B:68:0x0230, B:70:0x0236, B:72:0x0242, B:74:0x0252, B:77:0x032d, B:83:0x02cd, B:85:0x02d1, B:92:0x0285, B:94:0x028b, B:96:0x0297, B:98:0x02a7, B:108:0x02d5, B:110:0x02dd, B:112:0x02e1, B:113:0x0304, B:171:0x0339, B:173:0x0346, B:175:0x034a, B:178:0x0369, B:180:0x0371, B:182:0x037c, B:185:0x038e, B:186:0x0398, B:188:0x03a4, B:191:0x03b8, B:196:0x03d9, B:200:0x0395, B:205:0x03e1, B:207:0x03f9, B:211:0x040c, B:214:0x0426, B:216:0x042c, B:218:0x043b, B:219:0x0453, B:221:0x0459, B:223:0x0461, B:225:0x047d, B:226:0x046a, B:228:0x0477, B:232:0x0481, B:234:0x0485, B:236:0x0489, B:237:0x04a6, B:238:0x04ad, B:240:0x04cd, B:242:0x04dc, B:243:0x04e6), top: B:60:0x0212 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x032d A[SYNTHETIC] */
    @SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String a(int i8, boolean z7, com.baidu.location.c.m mVar, int i9) {
        String str;
        int i10;
        String str2;
        long j8;
        boolean z8;
        int i11;
        boolean z9;
        String str3;
        boolean z10;
        b bVar;
        String str4;
        boolean z11;
        b bVar2;
        Random random;
        boolean z12;
        long j9;
        Random random2;
        char c8;
        Throwable th;
        boolean is80211mcResponder;
        String str5;
        boolean z13;
        Exception exc;
        b bVar3 = this;
        int i12 = i8;
        if (mVar == null || mVar.a() < 1) {
            return null;
        }
        try {
            try {
                Random random3 = new Random();
                StringBuffer stringBuffer = new StringBuffer(512);
                StringBuilder sb = new StringBuilder();
                ArrayList<Long> arrayList = new ArrayList();
                WifiInfo f8 = f();
                String a8 = bVar3.a(f8, (String) null);
                if (f8 == null || a8 == null) {
                    str = null;
                    i10 = -1;
                    str2 = null;
                } else {
                    str2 = a8.replace(":", "");
                    i10 = f8.getRssi();
                    String i13 = a().i();
                    if (i10 < 0) {
                        i10 = -i10;
                    }
                    if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                        com.baidu.location.c.i.i().a("wifi connected mac = " + str2);
                        com.baidu.location.c.i.i().a("wifi connected mac rssi= " + i10);
                    }
                    str = i13;
                }
                try {
                    j8 = SystemClock.elapsedRealtimeNanos() / 1000;
                } catch (Error unused) {
                    j8 = 0;
                }
                boolean z14 = j8 > 0;
                if (z14) {
                    z14 = z14 && z7;
                }
                int size = mVar.f5138a.size();
                if (size <= i12) {
                    i12 = size;
                } else if (i12 < i9) {
                    z8 = true;
                    String str6 = str;
                    int i14 = i10;
                    long j10 = 0;
                    i11 = 0;
                    char c9 = 0;
                    int i15 = 0;
                    int i16 = 0;
                    StringBuffer stringBuffer2 = null;
                    int i17 = 0;
                    z9 = true;
                    while (true) {
                        str3 = ";%d;";
                        z10 = z8;
                        if (i11 < i12) {
                            break;
                        }
                        i15++;
                        int i18 = i12;
                        if (mVar.f5138a.get(i11) == null || mVar.f5138a.get(i11).level == 0) {
                            bVar2 = bVar3;
                            random = random3;
                            z12 = z14;
                        } else {
                            if (z14) {
                                try {
                                    try {
                                        j9 = (j8 - mVar.f5138a.get(i11).timestamp) / 1000000;
                                    } catch (Exception e8) {
                                        if (com.baidu.location.c.c.a.f4999a) {
                                            e8.printStackTrace();
                                        }
                                        j9 = 0;
                                    }
                                    try {
                                        boolean z15 = com.baidu.location.c.c.a.f4999a;
                                        if (z15 && com.baidu.location.c.c.a.f5000b) {
                                            z12 = z14;
                                            com.baidu.location.c.g i19 = com.baidu.location.c.i.i();
                                            random2 = random3;
                                            StringBuilder sb2 = new StringBuilder();
                                            c8 = c9;
                                            sb2.append("wifi noUpdateTime = ");
                                            sb2.append(j9);
                                            i19.a(sb2.toString());
                                        } else {
                                            random2 = random3;
                                            c8 = c9;
                                            z12 = z14;
                                        }
                                        arrayList.add(Long.valueOf(j9));
                                        if (j9 > j10) {
                                            if (z15) {
                                                com.baidu.location.c.i.i().a("wifi maxScanTime = " + j9);
                                            }
                                            j10 = j9;
                                        }
                                    } catch (Exception e9) {
                                        e = e9;
                                        Throwable th2 = e;
                                        if (com.baidu.location.c.c.a.f4999a) {
                                            th2.printStackTrace();
                                        }
                                        return null;
                                    }
                                } catch (Error e10) {
                                    e = e10;
                                    Throwable th22 = e;
                                    if (com.baidu.location.c.c.a.f4999a) {
                                    }
                                    return null;
                                }
                            } else {
                                random2 = random3;
                                c8 = c9;
                                z12 = z14;
                            }
                            if (Build.VERSION.SDK_INT >= 23) {
                                try {
                                    is80211mcResponder = mVar.f5138a.get(i11).is80211mcResponder();
                                    if (is80211mcResponder) {
                                        StringBuffer stringBuffer3 = stringBuffer2 == null ? new StringBuffer() : stringBuffer2;
                                        try {
                                            stringBuffer3.append(i11);
                                            stringBuffer3.append(b5.b.VERTICAL);
                                            stringBuffer2 = stringBuffer3;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            stringBuffer2 = stringBuffer3;
                                            th.printStackTrace();
                                            if (z9) {
                                            }
                                            str5 = mVar.f5138a.get(i11).BSSID;
                                            if (str5 == null) {
                                            }
                                            c9 = c8;
                                            i11++;
                                            bVar3 = bVar2;
                                            random3 = random;
                                            z14 = z12;
                                            z8 = z10;
                                            i12 = i18;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                            if (z9) {
                                stringBuffer.append(b5.b.VERTICAL);
                                sb.append(b5.b.VERTICAL);
                            } else {
                                stringBuffer.append("&wf=");
                                z9 = false;
                            }
                            str5 = mVar.f5138a.get(i11).BSSID;
                            if (str5 == null) {
                                String replace = str5.replace(":", "");
                                stringBuffer.append(replace);
                                sb.append(replace);
                                int i20 = mVar.f5138a.get(i11).level;
                                if (i20 < 0) {
                                    i20 = -i20;
                                }
                                String format = String.format(Locale.CHINA, ";%d;", Integer.valueOf(i20));
                                stringBuffer.append(format);
                                sb.append(format);
                                i16++;
                                if (str2 == null || !str2.equals(replace)) {
                                    bVar2 = this;
                                    z13 = false;
                                } else {
                                    bVar2 = this;
                                    try {
                                        try {
                                            mVar.f5142e = bVar2.a(mVar.f5138a.get(i11).capabilities);
                                            i17 = i16;
                                            z13 = true;
                                        } catch (Error e11) {
                                            e = e11;
                                            Throwable th222 = e;
                                            if (com.baidu.location.c.c.a.f4999a) {
                                            }
                                            return null;
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                        Throwable th2222 = e;
                                        if (com.baidu.location.c.c.a.f4999a) {
                                        }
                                        return null;
                                    }
                                }
                                if (z13) {
                                    random = random2;
                                    c9 = c8;
                                    if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                                        com.baidu.location.c.i.i().a("wifi str add connected ssid = " + mVar.f5138a.get(i11).SSID);
                                    }
                                    stringBuffer.append(bVar2.b(mVar.f5138a.get(i11).SSID));
                                    sb.append(bVar2.b(mVar.f5138a.get(i11).SSID));
                                } else if (c8 == 0) {
                                    random = random2;
                                    try {
                                        if (random.nextInt(10) == 2 && mVar.f5138a.get(i11).SSID != null && mVar.f5138a.get(i11).SSID.length() < 30) {
                                            stringBuffer.append(bVar2.b(mVar.f5138a.get(i11).SSID));
                                            sb.append(bVar2.b(mVar.f5138a.get(i11).SSID));
                                            c9 = 1;
                                        }
                                    } catch (Exception e13) {
                                        exc = e13;
                                        c9 = c8;
                                        if (!com.baidu.location.c.c.a.f4999a) {
                                        }
                                        i11++;
                                        bVar3 = bVar2;
                                        random3 = random;
                                        z14 = z12;
                                        z8 = z10;
                                        i12 = i18;
                                    }
                                } else {
                                    random = random2;
                                    c9 = c8;
                                    if (c9 == 1) {
                                        try {
                                            if (random.nextInt(20) == 1 && mVar.f5138a.get(i11).SSID != null && mVar.f5138a.get(i11).SSID.length() < 30) {
                                                stringBuffer.append(bVar2.b(mVar.f5138a.get(i11).SSID));
                                                sb.append(bVar2.b(mVar.f5138a.get(i11).SSID));
                                                c9 = 2;
                                            }
                                        } catch (Exception e14) {
                                            exc = e14;
                                            if (!com.baidu.location.c.c.a.f4999a) {
                                                exc.printStackTrace();
                                            }
                                            i11++;
                                            bVar3 = bVar2;
                                            random3 = random;
                                            z14 = z12;
                                            z8 = z10;
                                            i12 = i18;
                                        }
                                    }
                                }
                            } else {
                                bVar2 = this;
                                random = random2;
                            }
                            c9 = c8;
                        }
                        i11++;
                        bVar3 = bVar2;
                        random3 = random;
                        z14 = z12;
                        z8 = z10;
                        i12 = i18;
                    }
                    int i21 = i12;
                    bVar = bVar3;
                    bVar.f4978s = sb.toString();
                    if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                        com.baidu.location.c.i.i().a("last wifi str = " + bVar.f4978s);
                    }
                    if (z10) {
                        int i22 = i21;
                        boolean z16 = true;
                        while (i22 < mVar.f5138a.size()) {
                            int i23 = i15 + 1;
                            if (mVar.f5138a.get(i22) == null || mVar.f5138a.get(i22).level == 0) {
                                str4 = str3;
                            } else {
                                if (z16) {
                                    stringBuffer.append("&wf2=");
                                    z16 = false;
                                } else {
                                    stringBuffer.append(b5.b.VERTICAL);
                                }
                                String str7 = mVar.f5138a.get(i22).BSSID;
                                if (str7 != null) {
                                    stringBuffer.append(str7.replace(":", ""));
                                    int i24 = mVar.f5138a.get(i22).level;
                                    if (i24 < 0) {
                                        i24 = -i24;
                                    }
                                    z11 = z16;
                                    stringBuffer.append(String.format(Locale.CHINA, str3, Integer.valueOf(i24)));
                                } else {
                                    z11 = z16;
                                }
                                str4 = str3;
                                if (i23 >= i9) {
                                    break;
                                }
                                z16 = z11;
                            }
                            i22++;
                            str3 = str4;
                            i15 = i23;
                        }
                    }
                    if (!z9) {
                        return null;
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("&wf_n=");
                    int i25 = i17;
                    sb3.append(i25);
                    stringBuffer.append(sb3.toString());
                    if (stringBuffer2 != null) {
                        stringBuffer.append("&wf_mc=");
                        stringBuffer.append(stringBuffer2.toString());
                    }
                    if (str2 != null && i14 != -1) {
                        stringBuffer.append("&wf_rs=" + i14);
                    }
                    if (j10 > 10 && arrayList.size() > 0 && ((Long) arrayList.get(0)).longValue() > 0) {
                        StringBuffer stringBuffer4 = new StringBuffer(128);
                        stringBuffer4.append("&wf_ut=");
                        Long l8 = (Long) arrayList.get(0);
                        boolean z17 = true;
                        for (Long l9 : arrayList) {
                            if (z17) {
                                stringBuffer4.append(l9.longValue());
                                z17 = false;
                            } else {
                                long longValue = l9.longValue() - l8.longValue();
                                if (longValue != 0) {
                                    stringBuffer4.append("");
                                    stringBuffer4.append(longValue);
                                }
                            }
                            stringBuffer4.append(b5.b.VERTICAL);
                        }
                        if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                            com.baidu.location.c.i.i().a("wifi scantime list str = " + stringBuffer4.toString());
                        }
                        stringBuffer.append(stringBuffer4.toString());
                    }
                    stringBuffer.append("&wf_st=");
                    stringBuffer.append(mVar.f5139b);
                    stringBuffer.append("&wf_et=");
                    stringBuffer.append(mVar.f5140c);
                    stringBuffer.append("&wf_vt=");
                    stringBuffer.append(bVar.f4968i);
                    if (i25 > 0) {
                        mVar.f5141d = true;
                        stringBuffer.append("&wf_en=");
                        stringBuffer.append(mVar.f5142e ? 1 : 0);
                    }
                    if (str6 != null) {
                        stringBuffer.append("&wf_gw=");
                        stringBuffer.append(str6);
                    }
                    return stringBuffer.toString();
                }
                z8 = false;
                String str62 = str;
                int i142 = i10;
                long j102 = 0;
                i11 = 0;
                char c92 = 0;
                int i152 = 0;
                int i162 = 0;
                StringBuffer stringBuffer22 = null;
                int i172 = 0;
                z9 = true;
                while (true) {
                    str3 = ";%d;";
                    z10 = z8;
                    if (i11 < i12) {
                    }
                    i11++;
                    bVar3 = bVar2;
                    random3 = random;
                    z14 = z12;
                    z8 = z10;
                    i12 = i18;
                }
                int i212 = i12;
                bVar = bVar3;
                bVar.f4978s = sb.toString();
                if (com.baidu.location.c.c.a.f4999a) {
                    com.baidu.location.c.i.i().a("last wifi str = " + bVar.f4978s);
                }
                if (z10) {
                }
                if (!z9) {
                }
            } catch (Error e15) {
                e = e15;
                Throwable th22222 = e;
                if (com.baidu.location.c.c.a.f4999a) {
                }
                return null;
            }
        } catch (Exception e16) {
            e = e16;
            Throwable th222222 = e;
            if (com.baidu.location.c.c.a.f4999a) {
            }
            return null;
        }
    }

    public void b() {
        if (this.f4962c) {
            try {
                this.f4966g.unregisterReceiver(this.f4964e);
                this.f4968i = 0L;
            } catch (Exception e8) {
                if (com.baidu.location.c.c.a.f4999a) {
                    e8.printStackTrace();
                }
            }
            this.f4964e = null;
            this.f4963d = null;
            this.f4962c = false;
            if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                com.baidu.location.c.i.i().a("wifimanager stop ...");
            }
        }
    }

    public synchronized String a(WifiInfo wifiInfo, String str) {
        if (wifiInfo == null && str == null) {
            return null;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f4972m > 1000) {
                if (wifiInfo != null) {
                    this.f4974o = wifiInfo.getBSSID();
                } else {
                    this.f4974o = str;
                }
                this.f4972m = currentTimeMillis;
            }
            return this.f4974o;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0131 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String a(com.baidu.location.c.m mVar, int i8, String str, boolean z7, int i9) {
        long j8;
        String str2;
        String str3;
        int i10;
        int i11;
        String str4;
        boolean z8;
        long j9;
        boolean z9;
        long j10;
        boolean z10;
        String str5 = str;
        if (mVar.a() < 1) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            j8 = SystemClock.elapsedRealtimeNanos() / 1000;
        } catch (Error unused) {
            j8 = 0;
        }
        boolean z11 = j8 > 0;
        StringBuffer stringBuffer = new StringBuffer(512);
        int size = mVar.f5138a.size();
        long j11 = 0;
        boolean z12 = true;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i12 >= size) {
                str2 = b5.b.VERTICAL;
                str3 = ";%d;";
                i10 = size;
                i11 = i14;
                break;
            }
            i10 = size;
            if (mVar.f5138a.get(i12) == null || mVar.f5138a.get(i12).level == 0) {
                j9 = j8;
            } else {
                int i16 = i13 + 1;
                if (z12) {
                    stringBuffer.append("&wf=");
                    z9 = false;
                } else {
                    stringBuffer.append(b5.b.VERTICAL);
                    z9 = z12;
                }
                String replace = mVar.f5138a.get(i12).BSSID.replace(":", "");
                stringBuffer.append(replace);
                if (str5 != null && replace.equals(str5)) {
                    i15 = i16;
                }
                int i17 = mVar.f5138a.get(i12).level;
                if (i17 < 0) {
                    i17 = -i17;
                }
                Locale locale = Locale.CHINA;
                str2 = b5.b.VERTICAL;
                stringBuffer.append(String.format(locale, ";%d;", Integer.valueOf(i17)));
                i11 = i14 + 1;
                if (z11) {
                    try {
                        str3 = ";%d;";
                        try {
                            j10 = (j8 - mVar.f5138a.get(i12).timestamp) / 1000000;
                        } catch (Throwable th) {
                            th = th;
                            if (com.baidu.location.c.c.a.f4999a) {
                                th.printStackTrace();
                            }
                            j10 = 0;
                            z10 = com.baidu.location.c.c.a.f4999a;
                            if (z10) {
                            }
                            j9 = j8;
                            arrayList.add(Long.valueOf(j10));
                            if (j10 > j11) {
                            }
                            if (i11 <= i8) {
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str3 = ";%d;";
                    }
                    z10 = com.baidu.location.c.c.a.f4999a;
                    if (z10 || !com.baidu.location.c.c.a.f5000b) {
                        j9 = j8;
                    } else {
                        j9 = j8;
                        com.baidu.location.c.i.i().a("wifi noUpdateTime = " + j10);
                    }
                    arrayList.add(Long.valueOf(j10));
                    if (j10 > j11) {
                        if (z10 && com.baidu.location.c.c.a.f5000b) {
                            com.baidu.location.c.i.i().a("wifi maxScanTime = " + j10);
                        }
                        j11 = j10;
                    }
                } else {
                    str3 = ";%d;";
                    j9 = j8;
                }
                if (i11 <= i8) {
                    z12 = z9;
                    break;
                }
                i14 = i11;
                z12 = z9;
                i13 = i16;
            }
            i12++;
            str5 = str;
            size = i10;
            j8 = j9;
        }
        int i18 = i15;
        if (z7) {
            return stringBuffer.toString();
        }
        if (i18 > 0) {
            stringBuffer.append("&wf_n=");
            stringBuffer.append(i18);
        }
        if (i11 > i8) {
            str4 = str2;
            if (i9 > i8 + 1) {
                int i19 = i11;
                int i20 = i10;
                while (i19 < i20) {
                    if (i19 == i11) {
                        stringBuffer.append("&wf2=");
                    } else {
                        stringBuffer.append(str4);
                    }
                    stringBuffer.append(mVar.f5138a.get(i19).BSSID.replace(":", ""));
                    int i21 = mVar.f5138a.get(i19).level;
                    if (i21 < 0) {
                        i21 = -i21;
                    }
                    Locale locale2 = Locale.CHINA;
                    z8 = true;
                    Object[] objArr = {Integer.valueOf(i21)};
                    String str6 = str3;
                    stringBuffer.append(String.format(locale2, str6, objArr));
                    if (i19 >= i9) {
                        break;
                    }
                    i19++;
                    str3 = str6;
                }
            }
        } else {
            str4 = str2;
        }
        z8 = true;
        if (z12) {
            return null;
        }
        if (j11 > 10 && arrayList.size() > 0 && ((Long) arrayList.get(0)).longValue() > 0) {
            StringBuffer stringBuffer2 = new StringBuffer(128);
            stringBuffer2.append("&wf_ut=");
            Long l8 = (Long) arrayList.get(0);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                if (z8) {
                    stringBuffer2.append(longValue);
                    z8 = false;
                } else {
                    long longValue2 = longValue - l8.longValue();
                    if (longValue2 != 0) {
                        stringBuffer2.append("" + longValue2);
                    }
                }
                stringBuffer2.append(str4);
            }
            if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                com.baidu.location.c.i.i().a("wifi scantime list str = " + stringBuffer2.toString());
            }
            stringBuffer.append(stringBuffer2.toString());
        }
        return stringBuffer.toString();
    }

    public void a(int i8) {
        this.f4967h.set(i8);
    }

    public void a(Context context, List<String> list) {
        if (this.f4962c) {
            return;
        }
        this.f4966g = context;
        this.f4963d = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        this.f4964e = new c();
        if (this.f4977r == null) {
            this.f4977r = new Handler(Looper.getMainLooper());
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        if (!list.contains("android.net.wifi.SCAN_RESULTS")) {
            list.add("android.net.wifi.SCAN_RESULTS");
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f4966g.registerReceiver(this.f4964e, new IntentFilter(it.next()));
            }
        } catch (Exception e8) {
            if (com.baidu.location.c.c.a.f4999a) {
                e8.printStackTrace();
            }
        }
        this.f4962c = true;
        if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
            com.baidu.location.c.i.i().a("wifimanager start ...");
        }
    }

    public boolean a(com.baidu.location.c.m mVar, com.baidu.location.c.m mVar2) {
        List<ScanResult> list = mVar.f5138a;
        if (list == null || mVar2 == null || mVar2.f5138a == null) {
            return false;
        }
        int min = Math.min(list.size(), mVar2.f5138a.size());
        for (int i8 = 0; i8 < min; i8++) {
            try {
                if (mVar.f5138a.get(i8) != null) {
                    String str = mVar.f5138a.get(i8).BSSID;
                    String str2 = mVar2.f5138a.get(i8).BSSID;
                    if (!TextUtils.isEmpty(str) && !str.equals(str2)) {
                        return false;
                    }
                }
            } catch (Exception e8) {
                if (com.baidu.location.c.c.a.f4999a) {
                    e8.printStackTrace();
                }
                return false;
            }
        }
        return true;
    }

    public static boolean a(com.baidu.location.c.m mVar, com.baidu.location.c.m mVar2, float f8) {
        if (mVar != null && mVar2 != null) {
            List<ScanResult> list = mVar.f5138a;
            List<ScanResult> list2 = mVar2.f5138a;
            if (list == list2) {
                return true;
            }
            if (list != null && list2 != null) {
                int size = list.size();
                int size2 = list2.size();
                if (size == 0 && size2 == 0) {
                    return true;
                }
                if (size != 0 && size2 != 0) {
                    int i8 = 0;
                    for (int i9 = 0; i9 < size; i9++) {
                        String str = list.get(i9) != null ? list.get(i9).BSSID : null;
                        if (str != null) {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= size2) {
                                    break;
                                }
                                String str2 = list2.get(i10) != null ? list2.get(i10).BSSID : null;
                                if (str2 != null && str.equals(str2)) {
                                    i8++;
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                    if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                        com.baidu.location.c.i.i().a("wifi same!" + (i8 / size));
                    }
                    if (i8 >= size * f8) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("wpa|wep", 2).matcher(str).find();
    }
}
