package com.baidu.location.c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.CellIdentity;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.location.c.a.l0;
import com.baidu.location.c.i;
import com.baidu.location.pb.CellCommonValue;
import com.baidu.location.pb.CellValue;
import com.baidu.location.pb.CellValueList;
import com.baidu.location.pb.LteCellValue;
import com.baidu.location.pb.NrCellValue;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.protobuf.micro.ByteStringMicro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: e, reason: collision with root package name */
    private i f5079e;

    /* renamed from: f, reason: collision with root package name */
    private c f5080f;

    /* renamed from: g, reason: collision with root package name */
    private TelephonyManager f5081g;

    /* renamed from: a, reason: collision with root package name */
    private final String f5075a = "NetLocDataManager";

    /* renamed from: b, reason: collision with root package name */
    private final int f5076b = 2000;

    /* renamed from: c, reason: collision with root package name */
    private final int f5077c = 100;

    /* renamed from: d, reason: collision with root package name */
    private final int f5078d = 30000;

    /* renamed from: h, reason: collision with root package name */
    private ConnectivityManager f5082h = null;

    /* renamed from: i, reason: collision with root package name */
    private WifiManager f5083i = null;

    /* renamed from: j, reason: collision with root package name */
    private Handler f5084j = null;

    /* renamed from: k, reason: collision with root package name */
    private String f5085k = null;

    /* renamed from: l, reason: collision with root package name */
    private boolean f5086l = false;

    /* renamed from: m, reason: collision with root package name */
    private long f5087m = 0;

    /* renamed from: n, reason: collision with root package name */
    private long f5088n = 0;

    /* renamed from: o, reason: collision with root package name */
    private long f5089o = 0;

    /* renamed from: p, reason: collision with root package name */
    private long f5090p = 0;

    /* renamed from: q, reason: collision with root package name */
    private boolean f5091q = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f5092r = false;

    /* renamed from: s, reason: collision with root package name */
    private long f5093s = 0;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final h f5094a = new h();
    }

    public class c extends g {

        /* renamed from: a, reason: collision with root package name */
        private long f5095a = 0;

        /* renamed from: b, reason: collision with root package name */
        private boolean f5096b = false;

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f5098a;

            a(boolean z7) {
                this.f5098a = z7;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!h.this.f5086l) {
                    h.this.f5086l = this.f5098a;
                }
                com.baidu.location.b.r.c().i();
                if (System.currentTimeMillis() - com.baidu.location.b.x.b() <= 5000) {
                    com.baidu.location.b.b.a().c();
                }
            }
        }

        public c() {
        }

        @Override // com.baidu.location.c.g
        public void a(String str) {
        }

        @Override // com.baidu.location.c.g
        public boolean a(Intent intent) {
            String action = intent.getAction();
            if (action.equals("android.net.wifi.SCAN_RESULTS")) {
                boolean booleanExtra = intent.getBooleanExtra("resultsUpdated", true);
                h.this.f5088n = System.currentTimeMillis() / 1000;
                if (h.this.f5084j == null) {
                    return true;
                }
                h.this.f5084j.post(new a(booleanExtra));
            } else if (action.equals("android.net.wifi.STATE_CHANGE")) {
                if (!((NetworkInfo) intent.getParcelableExtra("networkInfo")).getState().equals(NetworkInfo.State.CONNECTED) || System.currentTimeMillis() - this.f5095a < 5000) {
                    return false;
                }
                this.f5095a = System.currentTimeMillis();
                if (!this.f5096b) {
                    this.f5096b = true;
                    return false;
                }
                if (h.this.f5084j == null) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.baidu.location.c.g
        public boolean a(List<CellInfo> list) {
            return true;
        }
    }

    static class d implements Comparator<ScanResult> {
        d() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ScanResult scanResult, ScanResult scanResult2) {
            return scanResult2.level - scanResult.level;
        }
    }

    private static class e implements Comparator<j> {
        private e() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(j jVar, j jVar2) {
            return jVar.f5116g - jVar2.f5116g;
        }
    }

    private synchronized String s() {
        String str;
        str = this.f5085k;
        return (str == null || str.length() == 0) ? null : this.f5085k.replace("\n", "");
    }

    private int t() {
        SignalStrength signalStrength;
        try {
            TelephonyManager telephonyManager = this.f5081g;
            if (telephonyManager != null) {
                signalStrength = telephonyManager.getSignalStrength();
                return com.baidu.location.e.i.a(signalStrength, "getLteRssnr");
            }
        } catch (Exception unused) {
        }
        return Integer.MAX_VALUE;
    }

    public int a(CellIdentityNr cellIdentityNr) {
        try {
            return com.baidu.location.e.i.a(cellIdentityNr, "getHwTac");
        } catch (Throwable unused) {
            return -1;
        }
    }

    @SuppressLint({"NewApi"})
    public long b(m mVar) {
        long j8;
        long j9;
        List<ScanResult> list = mVar.f5138a;
        if (list == null || list.size() == 0) {
            return 0L;
        }
        try {
            j8 = SystemClock.elapsedRealtimeNanos() / 1000;
        } catch (Error | Exception unused) {
            j8 = 0;
        }
        boolean z7 = j8 > 0;
        if (!z7) {
            return 0L;
        }
        int size = mVar.f5138a.size();
        if (size > 16) {
            size = 16;
        }
        long j10 = 2147483647L;
        for (int i8 = 0; i8 < size; i8++) {
            if (mVar.f5138a.get(i8) != null && mVar.f5138a.get(i8).level != 0 && z7) {
                try {
                    j9 = (j8 - mVar.f5138a.get(i8).timestamp) / 1000000;
                } catch (Error | Exception unused2) {
                    j9 = 0;
                }
                if (j9 < j10) {
                    j10 = j9;
                }
            }
        }
        if (!z7) {
            j10 = 0;
        }
        if (j10 < 0) {
            return 0L;
        }
        return j10;
    }

    public long c(m mVar) {
        long j8;
        long j9;
        if (mVar.a() == 0) {
            return 0L;
        }
        try {
            j8 = SystemClock.elapsedRealtimeNanos() / 1000;
        } catch (Error | Exception unused) {
            j8 = 0;
        }
        boolean z7 = j8 > 0;
        if (!z7) {
            return 0L;
        }
        int size = mVar.f5138a.size();
        if (size > 16) {
            size = 16;
        }
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            if (mVar.f5138a.get(i8) != null && mVar.f5138a.get(i8).level != 0 && z7) {
                try {
                    j9 = (j8 - mVar.f5138a.get(i8).timestamp) / 1000000;
                } catch (Error | Exception unused2) {
                    j9 = 0;
                }
                j11 += j9;
                j10++;
                if (j9 > j12) {
                    j12 = j9;
                }
            }
        }
        return j10 > 1 ? (j11 - j12) / (j10 - 1) : j12;
    }

    public synchronized void d() {
        c();
        this.f5081g = null;
        this.f5083i = null;
        this.f5080f = null;
    }

    public boolean e() {
        i iVar = this.f5079e;
        if (iVar != null) {
            return iVar.e();
        }
        return false;
    }

    public synchronized com.baidu.location.c.b f() {
        i iVar = this.f5079e;
        if (iVar == null) {
            return null;
        }
        iVar.b(1000);
        a(this.f5081g, com.baidu.location.e.i.W, com.baidu.location.e.i.X, com.baidu.location.e.i.Y, com.baidu.location.e.i.Z);
        com.baidu.location.c.b e8 = this.f5079e.e(30000);
        this.f5091q = a(e8, 30000, com.baidu.location.b.e.b().f4557d4);
        return e8;
    }

    public int g() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = this.f5082h;
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return 0;
            }
            return activeNetworkInfo.getSubtype();
        } catch (Exception unused) {
            return 0;
        }
    }

    public String h() {
        int i8 = -1;
        try {
            TelephonyManager telephonyManager = this.f5081g;
            if (telephonyManager != null) {
                i8 = telephonyManager.getSimState();
            }
        } catch (Exception unused) {
        }
        return "&sim=" + i8;
    }

    public void i() {
        this.f5093s = 0L;
    }

    public boolean j() {
        long currentTimeMillis = System.currentTimeMillis();
        long j8 = currentTimeMillis - this.f5087m;
        if (j8 > 0 && j8 <= 5000) {
            return false;
        }
        this.f5087m = currentTimeMillis;
        i();
        return k();
    }

    public boolean k() {
        long currentTimeMillis = System.currentTimeMillis();
        i iVar = this.f5079e;
        long c8 = iVar != null ? iVar.c() : 0L;
        long j8 = currentTimeMillis - c8;
        if (j8 > 0) {
            long j9 = this.f5093s + 5000;
            if (j8 <= j9 || currentTimeMillis - (this.f5088n * 1000) <= j9) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 28 && j8 < 25000) {
                return false;
            }
            if (l() && !m() && j8 <= this.f5093s + 10000) {
                return false;
            }
        }
        return a(c8);
    }

    public boolean l() {
        try {
            ConnectivityManager connectivityManager = this.f5082h;
            if (connectivityManager != null) {
                return connectivityManager.getNetworkInfo(1).isConnected();
            }
            return false;
        } catch (Error | Exception unused) {
            return false;
        }
    }

    public boolean m() {
        return false;
    }

    @SuppressLint({"NewApi"})
    public String n() {
        WifiManager wifiManager = this.f5083i;
        if (wifiManager == null) {
            return "";
        }
        try {
            if (!wifiManager.isWifiEnabled()) {
                if (!this.f5083i.isScanAlwaysAvailable()) {
                    return "";
                }
            }
            return "&wifio=1";
        } catch (Exception | NoSuchMethodError unused) {
            return "";
        }
    }

    public String o() {
        i iVar = this.f5079e;
        if (iVar == null || com.baidu.location.e.i.f5263e == 4) {
            return null;
        }
        return iVar.f();
    }

    public WifiInfo p() {
        i iVar;
        if (com.baidu.location.e.i.f5263e == 4 || (iVar = this.f5079e) == null) {
            return null;
        }
        return iVar.g();
    }

    public String q() {
        m r8;
        if (com.baidu.location.b.e.b().G3 == 0 || (r8 = r()) == null || r8.a() < 1) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ScanResult scanResult : r8.f5138a) {
            if (scanResult != null && scanResult.level != 0 && scanResult.BSSID != null) {
                arrayList.add(scanResult);
            }
        }
        Collections.sort(arrayList, new d());
        int min = Math.min(com.baidu.location.b.e.b().I3, arrayList.size());
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < min; i8++) {
            String replace = ((ScanResult) arrayList.get(i8)).BSSID.replace(":", "");
            String b8 = b(((ScanResult) arrayList.get(i8)).SSID);
            int i9 = ((ScanResult) arrayList.get(i8)).level;
            if (i9 < 0) {
                i9 = -i9;
            }
            sb.append(replace + SystemInfoUtil.COMMA + b8 + SystemInfoUtil.COMMA + i9);
            sb.append(";");
        }
        return sb.toString();
    }

    public m r() {
        i iVar = this.f5079e;
        return (iVar == null || com.baidu.location.e.i.f5263e == 4) ? new m(null, 0L) : iVar.h();
    }

    private String c(String str) {
        return str != null ? (str.contains("&") || str.contains(";")) ? str.replace("&", "_").replace(";", "_") : str : str;
    }

    public int a(m mVar) {
        int i8;
        for (int i9 = 0; i9 < mVar.a(); i9++) {
            if (mVar.f5138a.get(i9) != null && (i8 = -mVar.f5138a.get(i9).level) > 0) {
                return i8;
            }
        }
        return 0;
    }

    public String b(com.baidu.location.c.b bVar) {
        if (this.f5079e == null) {
            return null;
        }
        return this.f5079e.c(bVar) + "&cl_list=" + s();
    }

    private String b(String str) {
        if (str != null && str.length() > com.baidu.location.b.e.b().H3) {
            str = str.substring(0, com.baidu.location.b.e.b().H3);
        }
        return str != null ? (str.contains("&") || str.contains(";")) ? str.replace("&", "_").replace(";", "_") : str : str;
    }

    public int a(String str) {
        if (str == null || !str.contains("mNrTac")) {
            return -1;
        }
        Matcher matcher = Pattern.compile("mNrTac=(.+?)\\}").matcher(str.replace(cn.hutool.core.text.l.SPACE, ""));
        while (true) {
            int i8 = -1;
            while (matcher.find()) {
                if (matcher.groupCount() >= 1) {
                    try {
                        i8 = Integer.parseInt(matcher.group(1));
                    } catch (Throwable unused) {
                    }
                }
            }
            return i8;
        }
    }

    public HashSet<String> c(com.baidu.location.c.b bVar) {
        i iVar = this.f5079e;
        if (iVar != null) {
            return iVar.b(bVar);
        }
        return null;
    }

    public synchronized void b() {
        if (this.f5079e == null) {
            this.f5079e = new i();
        }
        try {
            c cVar = new c();
            this.f5080f = cVar;
            i iVar = this.f5079e;
            if (iVar != null) {
                iVar.a(cVar);
            }
        } catch (Exception unused) {
        }
    }

    public void c() {
        i iVar = this.f5079e;
        if (iVar != null) {
            iVar.b();
        }
    }

    @SuppressLint({"NewApi"})
    public boolean b(long j8) {
        m r8;
        try {
            if ((!this.f5083i.isWifiEnabled() && !this.f5083i.isScanAlwaysAvailable()) || l() || (r8 = r()) == null) {
                return false;
            }
            return a(r8, j8);
        } catch (Exception | NoSuchMethodError unused) {
            return false;
        }
    }

    public com.baidu.location.c.b a(com.baidu.location.c.b bVar, TelephonyManager telephonyManager) {
        i iVar = this.f5079e;
        if (iVar != null) {
            return iVar.a(bVar, telephonyManager);
        }
        return null;
    }

    public static h a() {
        return b.f5094a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.telephony.TelephonyManager] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v25, types: [com.baidu.location.c.j] */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29 */
    private j a(CellInfo cellInfo, TelephonyManager telephonyManager) {
        CellSignalStrength cellSignalStrength;
        int cellConnectionStatus;
        int ssRsrp;
        int ssRsrp2;
        int ssRsrq;
        int ssSinr;
        int csiRsrp;
        int csiRsrq;
        int csiSinr;
        long elapsedRealtimeNanos;
        long currentTimeMillis;
        long timestampMillis;
        String mccString;
        String mncString;
        long nci;
        int pci;
        int tac;
        String cellIdentityNr;
        int nrarfcn;
        CellIdentity cellIdentity;
        long elapsedRealtimeNanos2;
        long currentTimeMillis2;
        long timestampMillis2;
        int rsrp;
        int rsrp2;
        int rsrq;
        int rssnr;
        int cqi;
        int rssi;
        int earfcn;
        String mccString2;
        String mncString2;
        int cellConnectionStatus2;
        int bandwidth;
        CellIdentityTdscdma cellIdentity2;
        String mccString3;
        String mncString3;
        int cellConnectionStatus3;
        long timestampMillis3;
        long elapsedRealtimeNanos3;
        long timestampMillis4;
        String mccString4;
        String mncString4;
        int cellConnectionStatus4;
        long currentTimeMillis3;
        long timestampMillis5;
        int cellConnectionStatus5;
        long elapsedRealtimeNanos4;
        long timestampMillis6;
        String mccString5;
        String mncString5;
        int cellConnectionStatus6;
        int i8 = Build.VERSION.SDK_INT;
        j jVar = null;
        CellIdentityNr cellIdentityNr2 = null;
        try {
        } catch (Error unused) {
            jVar = telephonyManager;
        }
        if (!(cellInfo instanceof CellInfoGsm)) {
            if (cellInfo instanceof CellInfoCdma) {
                j jVar2 = new j();
                CellIdentityCdma cellIdentity3 = ((CellInfoCdma) cellInfo).getCellIdentity();
                jVar2.f5110a = 2;
                jVar2.f5112c = cellIdentity3.getSystemId() != Integer.MAX_VALUE ? String.valueOf(cellIdentity3.getSystemId()) : null;
                if (cellInfo.isRegistered()) {
                    jVar2.f5113d = 1;
                }
                if (i8 >= 28) {
                    cellConnectionStatus5 = cellInfo.getCellConnectionStatus();
                    jVar2.f5115f = cellConnectionStatus5;
                }
                try {
                    String networkOperator = telephonyManager.getNetworkOperator();
                    if (!TextUtils.isEmpty(networkOperator) && networkOperator.length() >= 3) {
                        jVar2.f5111b = networkOperator.substring(0, 3);
                    }
                } catch (Exception unused2) {
                }
                try {
                    if (i8 >= 30) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        timestampMillis5 = cellInfo.getTimestampMillis();
                        currentTimeMillis3 = System.currentTimeMillis() - (elapsedRealtime - timestampMillis5);
                    } else {
                        currentTimeMillis3 = System.currentTimeMillis() - ((SystemClock.elapsedRealtimeNanos() - cellInfo.getTimeStamp()) / 1000000);
                    }
                    jVar2.f5114e = currentTimeMillis3;
                    return jVar2;
                } catch (Error unused3) {
                    jVar = jVar2;
                }
            } else if (cellInfo instanceof CellInfoWcdma) {
                j jVar3 = new j();
                CellIdentityWcdma cellIdentity4 = ((CellInfoWcdma) cellInfo).getCellIdentity();
                jVar3.f5110a = 4;
                if (cellInfo.isRegistered()) {
                    jVar3.f5113d = 1;
                }
                if (i8 >= 28) {
                    mccString4 = cellIdentity4.getMccString();
                    jVar3.f5111b = mccString4;
                    mncString4 = cellIdentity4.getMncString();
                    jVar3.f5112c = mncString4;
                    cellConnectionStatus4 = cellInfo.getCellConnectionStatus();
                    jVar3.f5115f = cellConnectionStatus4;
                } else {
                    jVar3.f5111b = cellIdentity4.getMcc() == Integer.MAX_VALUE ? null : String.valueOf(cellIdentity4.getMcc());
                    jVar3.f5112c = cellIdentity4.getMnc() != Integer.MAX_VALUE ? String.valueOf(cellIdentity4.getMnc()) : null;
                }
                if (i8 >= 30) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    timestampMillis4 = cellInfo.getTimestampMillis();
                    elapsedRealtimeNanos3 = elapsedRealtime2 - timestampMillis4;
                } else {
                    elapsedRealtimeNanos3 = (SystemClock.elapsedRealtimeNanos() - cellInfo.getTimeStamp()) / 1000000;
                }
                currentTimeMillis = System.currentTimeMillis() - elapsedRealtimeNanos3;
                telephonyManager = jVar3;
            } else {
                try {
                    if (i8 >= 29 && com.baidu.location.c.a.w.a(cellInfo)) {
                        j jVar4 = new j();
                        cellIdentity2 = l0.a(cellInfo).getCellIdentity();
                        jVar4.f5110a = 5;
                        if (cellInfo.isRegistered()) {
                            jVar4.f5113d = 1;
                        }
                        mccString3 = cellIdentity2.getMccString();
                        jVar4.f5111b = mccString3;
                        mncString3 = cellIdentity2.getMncString();
                        jVar4.f5112c = mncString3;
                        cellConnectionStatus3 = cellInfo.getCellConnectionStatus();
                        jVar4.f5115f = cellConnectionStatus3;
                        if (i8 >= 30) {
                            long elapsedRealtime3 = SystemClock.elapsedRealtime();
                            timestampMillis3 = cellInfo.getTimestampMillis();
                            elapsedRealtimeNanos2 = elapsedRealtime3 - timestampMillis3;
                        } else {
                            elapsedRealtimeNanos2 = (SystemClock.elapsedRealtimeNanos() - cellInfo.getTimeStamp()) / 1000000;
                        }
                        currentTimeMillis2 = System.currentTimeMillis();
                        jVar = jVar4;
                    } else if (cellInfo instanceof CellInfoLte) {
                        k kVar = new k();
                        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                        CellIdentityLte cellIdentity5 = cellInfoLte.getCellIdentity();
                        CellSignalStrengthLte cellSignalStrength2 = cellInfoLte.getCellSignalStrength();
                        kVar.f5110a = 3;
                        if (cellInfo.isRegistered()) {
                            kVar.f5113d = 1;
                        }
                        kVar.f5117h = cellIdentity5.getCi();
                        kVar.f5118i = cellIdentity5.getPci();
                        kVar.f5119j = cellIdentity5.getTac();
                        kVar.f5127r = cellSignalStrength2.getTimingAdvance();
                        if (i8 >= 28) {
                            mccString2 = cellIdentity5.getMccString();
                            kVar.f5111b = mccString2;
                            mncString2 = cellIdentity5.getMncString();
                            kVar.f5112c = mncString2;
                            cellConnectionStatus2 = cellInfo.getCellConnectionStatus();
                            kVar.f5115f = cellConnectionStatus2;
                            bandwidth = cellIdentity5.getBandwidth();
                            kVar.f5121l = bandwidth;
                        } else {
                            if (cellIdentity5.getMcc() != Integer.MAX_VALUE) {
                                kVar.f5111b = String.valueOf(cellIdentity5.getMcc());
                            }
                            if (cellIdentity5.getMnc() != Integer.MAX_VALUE) {
                                kVar.f5112c = String.valueOf(cellIdentity5.getMnc());
                            }
                        }
                        if (i8 >= 24) {
                            earfcn = cellIdentity5.getEarfcn();
                            kVar.f5120k = earfcn;
                        }
                        if (i8 >= 29) {
                            rssi = cellSignalStrength2.getRssi();
                            kVar.f5122m = Math.abs(rssi);
                        }
                        if (i8 >= 26) {
                            rsrp = cellSignalStrength2.getRsrp();
                            kVar.f5123n = Math.abs(rsrp);
                            rsrp2 = cellSignalStrength2.getRsrp();
                            kVar.f5116g = Math.abs(rsrp2);
                            rsrq = cellSignalStrength2.getRsrq();
                            kVar.f5124o = rsrq;
                            rssnr = cellSignalStrength2.getRssnr();
                            if (rssnr == Integer.MAX_VALUE && cellInfo.isRegistered()) {
                                rssnr = t();
                            }
                            kVar.f5125p = rssnr;
                            cqi = cellSignalStrength2.getCqi();
                            kVar.f5126q = cqi;
                        }
                        if (i8 >= 30) {
                            long elapsedRealtime4 = SystemClock.elapsedRealtime();
                            timestampMillis2 = cellInfo.getTimestampMillis();
                            elapsedRealtimeNanos2 = elapsedRealtime4 - timestampMillis2;
                        } else {
                            elapsedRealtimeNanos2 = (SystemClock.elapsedRealtimeNanos() - cellInfo.getTimeStamp()) / 1000000;
                        }
                        currentTimeMillis2 = System.currentTimeMillis();
                        jVar = kVar;
                    } else {
                        if (i8 < 29 || !com.baidu.location.c.a.e.a(cellInfo)) {
                            return null;
                        }
                        l lVar = new l();
                        try {
                            cellIdentity = com.baidu.location.c.a.f.a(cellInfo).getCellIdentity();
                            cellIdentityNr2 = com.baidu.location.c.a.h.a(cellIdentity);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        cellSignalStrength = com.baidu.location.c.a.f.a(cellInfo).getCellSignalStrength();
                        CellSignalStrengthNr a8 = com.baidu.location.c.a.p.a(cellSignalStrength);
                        if (cellIdentityNr2 != null) {
                            lVar.f5110a = 6;
                            mccString = cellIdentityNr2.getMccString();
                            lVar.f5111b = mccString;
                            mncString = cellIdentityNr2.getMncString();
                            lVar.f5112c = mncString;
                            nci = cellIdentityNr2.getNci();
                            lVar.f5128h = nci;
                            pci = cellIdentityNr2.getPci();
                            lVar.f5129i = pci;
                            tac = cellIdentityNr2.getTac();
                            lVar.f5130j = tac;
                            if (tac == Integer.MAX_VALUE) {
                                try {
                                    lVar.f5130j = a(cellIdentityNr2);
                                } catch (Throwable unused4) {
                                }
                            }
                            if (lVar.f5130j == Integer.MAX_VALUE) {
                                try {
                                    cellIdentityNr = cellIdentityNr2.toString();
                                    lVar.f5130j = a(cellIdentityNr);
                                } catch (Throwable unused5) {
                                }
                            }
                            nrarfcn = cellIdentityNr2.getNrarfcn();
                            lVar.f5131k = nrarfcn;
                        }
                        if (cellInfo.isRegistered()) {
                            lVar.f5113d = 1;
                        }
                        cellConnectionStatus = cellInfo.getCellConnectionStatus();
                        lVar.f5115f = cellConnectionStatus;
                        ssRsrp = a8.getSsRsrp();
                        lVar.f5132l = Math.abs(ssRsrp);
                        ssRsrp2 = a8.getSsRsrp();
                        lVar.f5116g = Math.abs(ssRsrp2);
                        ssRsrq = a8.getSsRsrq();
                        lVar.f5133m = Math.abs(ssRsrq);
                        ssSinr = a8.getSsSinr();
                        lVar.f5134n = ssSinr;
                        csiRsrp = a8.getCsiRsrp();
                        lVar.f5135o = Math.abs(csiRsrp);
                        csiRsrq = a8.getCsiRsrq();
                        lVar.f5136p = Math.abs(csiRsrq);
                        csiSinr = a8.getCsiSinr();
                        lVar.f5137q = csiSinr;
                        if (i8 >= 30) {
                            long elapsedRealtime5 = SystemClock.elapsedRealtime();
                            timestampMillis = cellInfo.getTimestampMillis();
                            elapsedRealtimeNanos = elapsedRealtime5 - timestampMillis;
                        } else {
                            elapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - cellInfo.getTimeStamp()) / 1000000;
                        }
                        currentTimeMillis = System.currentTimeMillis() - elapsedRealtimeNanos;
                        telephonyManager = lVar;
                    }
                    jVar.f5114e = currentTimeMillis2 - elapsedRealtimeNanos2;
                    return jVar;
                } catch (Error unused6) {
                }
            }
            jVar.f5114e = System.currentTimeMillis();
            return jVar;
        }
        j jVar5 = new j();
        CellIdentityGsm cellIdentity6 = ((CellInfoGsm) cellInfo).getCellIdentity();
        jVar5.f5110a = 1;
        if (cellInfo.isRegistered()) {
            jVar5.f5113d = 1;
        }
        if (i8 >= 28) {
            mccString5 = cellIdentity6.getMccString();
            jVar5.f5111b = mccString5;
            mncString5 = cellIdentity6.getMncString();
            jVar5.f5112c = mncString5;
            cellConnectionStatus6 = cellInfo.getCellConnectionStatus();
            jVar5.f5115f = cellConnectionStatus6;
        } else {
            jVar5.f5111b = cellIdentity6.getMcc() == Integer.MAX_VALUE ? null : String.valueOf(cellIdentity6.getMcc());
            jVar5.f5112c = cellIdentity6.getMnc() != Integer.MAX_VALUE ? String.valueOf(cellIdentity6.getMnc()) : null;
        }
        if (i8 >= 30) {
            long elapsedRealtime6 = SystemClock.elapsedRealtime();
            timestampMillis6 = cellInfo.getTimestampMillis();
            elapsedRealtimeNanos4 = elapsedRealtime6 - timestampMillis6;
        } else {
            elapsedRealtimeNanos4 = (SystemClock.elapsedRealtimeNanos() - cellInfo.getTimeStamp()) / 1000000;
        }
        currentTimeMillis = System.currentTimeMillis() - elapsedRealtimeNanos4;
        telephonyManager = jVar5;
        telephonyManager.f5114e = currentTimeMillis;
        return telephonyManager;
    }

    public m a(int i8) {
        i iVar = this.f5079e;
        if (iVar != null) {
            return iVar.f(i8);
        }
        return null;
    }

    public String a(int i8, m mVar) {
        if (i8 == 0) {
            return null;
        }
        int i9 = 1;
        if (mVar.a() < 1) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer(256);
        int size = mVar.f5138a.size();
        int i10 = com.baidu.location.e.i.f5290t;
        if (size > i10) {
            size = i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            if (mVar.f5138a.get(i12) != null) {
                if ((i9 & i8) != 0 && mVar.f5138a.get(i12).BSSID != null) {
                    stringBuffer.append(i11 == 0 ? "&ssid=" : b5.b.VERTICAL);
                    stringBuffer.append(mVar.f5138a.get(i12).BSSID.replace(":", ""));
                    stringBuffer.append(";");
                    stringBuffer.append(c(mVar.f5138a.get(i12).SSID));
                    i11++;
                }
                i9 <<= 1;
            }
        }
        return stringBuffer.toString();
    }

    public String a(int i8, boolean z7, m mVar, int i9) {
        i iVar = this.f5079e;
        if (iVar != null) {
            return iVar.a(i8, z7, mVar, i9);
        }
        return null;
    }

    public String a(WifiInfo wifiInfo, String str) {
        i iVar = this.f5079e;
        if (iVar != null) {
            return iVar.a(wifiInfo, str);
        }
        return null;
    }

    public String a(com.baidu.location.c.b bVar) {
        i iVar = this.f5079e;
        if (iVar != null) {
            return iVar.a(bVar);
        }
        return null;
    }

    public String a(m mVar, int i8, String str, boolean z7, int i9) {
        i iVar = this.f5079e;
        if (iVar != null) {
            return iVar.a(mVar, i8, str, z7, i9);
        }
        return null;
    }

    private String a(List<CellInfo> list, TelephonyManager telephonyManager, int i8, int[] iArr, boolean z7, int i9) {
        ArrayList arrayList = new ArrayList();
        if (i8 != 1 && com.baidu.location.b.e.b().f4659w2 != 1) {
            return null;
        }
        boolean z8 = com.baidu.location.b.e.b().f4659w2 != 1 && z7;
        Iterator<CellInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next(), telephonyManager));
        }
        return a(a(arrayList, i9), iArr, z8);
    }

    private String a(List<j> list, int[] iArr, boolean z7) {
        if (list == null || list.size() == 0) {
            return null;
        }
        CellValueList cellValueList = new CellValueList();
        for (j jVar : list) {
            CellValue cellValue = new CellValue();
            CellCommonValue cellCommonValue = new CellCommonValue();
            cellCommonValue.setCellType(jVar.f5110a);
            String str = jVar.f5111b;
            if (str != null) {
                cellCommonValue.setMcc(ByteStringMicro.copyFromUtf8(str));
            }
            String str2 = jVar.f5112c;
            if (str2 != null) {
                cellCommonValue.setMnc(ByteStringMicro.copyFromUtf8(str2));
            }
            cellCommonValue.setRegistered(jVar.f5113d);
            cellCommonValue.setTimestamp(jVar.f5114e);
            int i8 = jVar.f5115f;
            if (i8 != Integer.MAX_VALUE) {
                cellCommonValue.setCellconnectionstatus(i8);
            }
            if (!z7) {
                cellValue.setCellCommonValue(cellCommonValue);
            }
            if (jVar instanceof k) {
                LteCellValue lteCellValue = new LteCellValue();
                k kVar = (k) jVar;
                int i9 = kVar.f5117h;
                if (i9 != Integer.MAX_VALUE && (!z7 || iArr[0] == 1)) {
                    lteCellValue.setCi(i9);
                }
                int i10 = kVar.f5118i;
                if (i10 != Integer.MAX_VALUE && (!z7 || iArr[1] == 1)) {
                    lteCellValue.setPci(i10);
                }
                int i11 = kVar.f5119j;
                if (i11 != Integer.MAX_VALUE && (!z7 || iArr[2] == 1)) {
                    lteCellValue.setTac(i11);
                }
                int i12 = kVar.f5120k;
                if (i12 != Integer.MAX_VALUE && (!z7 || iArr[3] == 1)) {
                    lteCellValue.setEarfcn(i12);
                }
                int i13 = kVar.f5121l;
                if (i13 != Integer.MAX_VALUE && (!z7 || iArr[4] == 1)) {
                    lteCellValue.setBandwidth(i13);
                }
                int i14 = kVar.f5122m;
                if (i14 != Integer.MAX_VALUE && (!z7 || iArr[5] == 1)) {
                    lteCellValue.setRssi(i14);
                }
                int i15 = kVar.f5123n;
                if (i15 != Integer.MAX_VALUE && (!z7 || iArr[6] == 1)) {
                    lteCellValue.setRsrp(i15);
                }
                int i16 = kVar.f5124o;
                if (i16 != Integer.MAX_VALUE && (!z7 || iArr[7] == 1)) {
                    lteCellValue.setRsrq(i16);
                }
                int i17 = kVar.f5125p;
                if (i17 != Integer.MAX_VALUE && (!z7 || iArr[8] == 1)) {
                    lteCellValue.setRssnr(i17);
                }
                int i18 = kVar.f5126q;
                if (i18 != Integer.MAX_VALUE && (!z7 || iArr[9] == 1)) {
                    lteCellValue.setCqi(i18);
                }
                int i19 = kVar.f5127r;
                if (i19 != Integer.MAX_VALUE && (!z7 || iArr[10] == 1)) {
                    lteCellValue.setTimingadvance(i19);
                }
                cellValue.setLteCellValue(lteCellValue);
            } else if (jVar instanceof l) {
                NrCellValue nrCellValue = new NrCellValue();
                l lVar = (l) jVar;
                long j8 = lVar.f5128h;
                if (j8 != Long.MAX_VALUE && (!z7 || iArr[0] == 1)) {
                    nrCellValue.setCi(j8);
                }
                int i20 = lVar.f5129i;
                if (i20 != Integer.MAX_VALUE && (!z7 || iArr[1] == 1)) {
                    nrCellValue.setPci(i20);
                }
                int i21 = lVar.f5130j;
                if (i21 != Integer.MAX_VALUE && (!z7 || iArr[2] == 1)) {
                    nrCellValue.setTac(i21);
                }
                int i22 = lVar.f5131k;
                if (i22 != Integer.MAX_VALUE && (!z7 || iArr[11] == 1)) {
                    nrCellValue.setNrarfcn(i22);
                }
                int i23 = lVar.f5132l;
                if (i23 != Integer.MAX_VALUE && (!z7 || iArr[12] == 1)) {
                    nrCellValue.setSsrsrp(i23);
                }
                int i24 = lVar.f5133m;
                if (i24 != Integer.MAX_VALUE && (!z7 || iArr[13] == 1)) {
                    nrCellValue.setSsrsrq(i24);
                }
                int i25 = lVar.f5134n;
                if (i25 != Integer.MAX_VALUE && (!z7 || iArr[14] == 1)) {
                    nrCellValue.setSssinr(i25);
                }
                int i26 = lVar.f5135o;
                if (i26 != Integer.MAX_VALUE && (!z7 || iArr[15] == 1)) {
                    nrCellValue.setCsirsrp(i26);
                }
                int i27 = lVar.f5136p;
                if (i27 != Integer.MAX_VALUE && (!z7 || iArr[16] == 1)) {
                    nrCellValue.setCsirsrq(i27);
                }
                int i28 = lVar.f5137q;
                if (i28 != Integer.MAX_VALUE && (!z7 || iArr[17] == 1)) {
                    nrCellValue.setCsisinr(i28);
                }
                cellValue.setNrCellValue(nrCellValue);
            }
            cellValueList.addCellValue(cellValue);
        }
        return Base64.encodeToString(cellValueList.toByteArray(), 0);
    }

    private static List<j> a(List<j> list, int i8) {
        if (list.size() == 0) {
            return null;
        }
        if (list.size() == 1) {
            return list;
        }
        Collections.sort(list.subList(1, list.size()), new e());
        list.size();
        return list.subList(0, Math.min(list.size(), i8));
    }

    public synchronized void a(Context context) {
        try {
            if (this.f5079e == null) {
                return;
            }
            try {
                this.f5081g = (TelephonyManager) context.getSystemService("phone");
                this.f5083i = (WifiManager) context.getSystemService("wifi");
                this.f5082h = (ConnectivityManager) context.getSystemService("connectivity");
                if (Looper.myLooper() != null) {
                    this.f5084j = new Handler();
                }
                this.f5079e.a(i.b.GET_ALL_DATA);
                a(true);
                this.f5079e.b(true);
                this.f5079e.d(30);
                this.f5079e.a(false);
                this.f5079e.a(context, new ArrayList());
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(TelephonyManager telephonyManager, int i8, int[] iArr, boolean z7, int i9) {
        if (telephonyManager != null) {
            try {
                this.f5085k = a(this.f5079e.d(), telephonyManager, i8, iArr, z7, i9);
            } catch (Throwable unused) {
            }
        }
    }

    public void a(boolean z7) {
        int i8;
        i iVar;
        i iVar2 = this.f5079e;
        if (iVar2 == null || this.f5092r == z7) {
            return;
        }
        if (z7) {
            iVar2.a(100);
            iVar = this.f5079e;
            i8 = 2000;
        } else {
            i8 = 0;
            iVar2.a(0);
            iVar = this.f5079e;
        }
        iVar.c(i8);
        this.f5092r = z7;
    }

    public boolean a(long j8) {
        long currentTimeMillis = System.currentTimeMillis() - this.f5089o;
        if (currentTimeMillis >= 0 && currentTimeMillis <= ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS) {
            return false;
        }
        this.f5089o = System.currentTimeMillis();
        if (com.baidu.location.e.i.f5263e != 4) {
            a(0);
        }
        i iVar = this.f5079e;
        return iVar != null && iVar.c() - j8 > 0;
    }

    private boolean a(com.baidu.location.c.b bVar, int i8, int i9) {
        return false;
    }

    public boolean a(com.baidu.location.c.b bVar, com.baidu.location.c.b bVar2) {
        i iVar = this.f5079e;
        if (iVar != null) {
            return iVar.a(bVar, bVar2);
        }
        return false;
    }

    private boolean a(m mVar, long j8) {
        long j9;
        List<ScanResult> list;
        long j10;
        try {
            j9 = SystemClock.elapsedRealtimeNanos() / 1000;
        } catch (Error | Exception unused) {
            j9 = 0;
        }
        boolean z7 = j9 > 0;
        if (!z7 || (list = mVar.f5138a) == null || list.size() == 0) {
            return false;
        }
        int size = mVar.f5138a.size();
        if (size > 16) {
            size = 16;
        }
        long j11 = 0;
        long j12 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            if (mVar.f5138a.get(i8) != null && mVar.f5138a.get(i8).level != 0 && z7) {
                try {
                    j10 = (j9 - mVar.f5138a.get(i8).timestamp) / 1000000;
                } catch (Error | Exception unused2) {
                    j10 = 0;
                }
                j12 += j10;
                if (j10 > j11) {
                    j11 = j10;
                }
            }
        }
        return j11 * 1000 > j8 || (j12 / ((long) size)) * 1000 > j8;
    }

    public boolean a(m mVar, m mVar2, float f8) {
        boolean a8 = mVar2.a(mVar, f8);
        long currentTimeMillis = System.currentTimeMillis() - com.baidu.location.b.d.f4511a;
        if (currentTimeMillis <= 0 || currentTimeMillis >= 30000 || !a8 || c(mVar2) - c(mVar) <= 30) {
            return a8;
        }
        return false;
    }
}
