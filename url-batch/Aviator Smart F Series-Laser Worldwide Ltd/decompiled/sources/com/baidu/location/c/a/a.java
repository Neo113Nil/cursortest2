package com.baidu.location.c.a;

import android.annotation.SuppressLint;
import android.content.Context;
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
import android.telephony.CellLocation;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthTdscdma;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.util.Log;
import com.baidu.ar.util.SystemInfoUtil;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class a implements com.baidu.location.c.c.a {

    /* renamed from: c, reason: collision with root package name */
    private static Class<?> f4931c;

    /* renamed from: d, reason: collision with root package name */
    public static int f4932d;

    /* renamed from: t, reason: collision with root package name */
    private b f4948t;

    /* renamed from: u, reason: collision with root package name */
    private c f4949u;

    /* renamed from: v, reason: collision with root package name */
    private d f4950v;

    /* renamed from: w, reason: collision with root package name */
    private Context f4951w;

    /* renamed from: e, reason: collision with root package name */
    private int f4933e = 30;

    /* renamed from: f, reason: collision with root package name */
    private int f4934f = -1;

    /* renamed from: g, reason: collision with root package name */
    private AtomicInteger f4935g = new AtomicInteger(0);

    /* renamed from: h, reason: collision with root package name */
    private float f4936h = 0.2f;

    /* renamed from: i, reason: collision with root package name */
    private boolean f4937i = true;

    /* renamed from: j, reason: collision with root package name */
    private boolean f4938j = false;

    /* renamed from: k, reason: collision with root package name */
    private TelephonyManager f4939k = null;

    /* renamed from: l, reason: collision with root package name */
    private TelephonyManager f4940l = null;

    /* renamed from: m, reason: collision with root package name */
    private TelephonyManager f4941m = null;

    /* renamed from: n, reason: collision with root package name */
    private SubscriptionManager f4942n = null;

    /* renamed from: o, reason: collision with root package name */
    private com.baidu.location.c.b f4943o = new com.baidu.location.c.b();

    /* renamed from: p, reason: collision with root package name */
    private com.baidu.location.c.b f4944p = null;

    /* renamed from: q, reason: collision with root package name */
    private List<com.baidu.location.c.b> f4945q = null;

    /* renamed from: r, reason: collision with root package name */
    private Executor f4946r = null;

    /* renamed from: s, reason: collision with root package name */
    private e f4947s = null;

    /* renamed from: x, reason: collision with root package name */
    private boolean f4952x = false;

    /* renamed from: y, reason: collision with root package name */
    public int f4953y = 0;

    /* renamed from: z, reason: collision with root package name */
    private boolean f4954z = false;
    private long A = 0;
    private long B = 0;
    private boolean C = false;
    private boolean D = true;
    private boolean E = false;
    private Handler F = null;
    private int G = -1;
    private int H = -1;
    private final Object I = new Object();
    private long J = 0;
    private List<com.baidu.location.c.b> K = null;
    private List<CellInfo> L = null;
    private AtomicInteger M = new AtomicInteger(1000);

    /* renamed from: com.baidu.location.c.a.a$a, reason: collision with other inner class name */
    class RunnableC0049a implements Runnable {
        RunnableC0049a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a.this.g();
                synchronized (a.this.I) {
                    try {
                        a.this.I.notifyAll();
                        if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                            com.baidu.location.c.i.i().a("update mCellInfo completed");
                        }
                    } finally {
                    }
                }
            } catch (Exception e8) {
                if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                    com.baidu.location.c.i.i().a("handleCellInfo error = " + e8);
                }
            }
        }
    }

    private class b extends TelephonyManager.CellInfoCallback {
        private b() {
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public void onCellInfo(List<CellInfo> list) {
            if (list == null) {
                return;
            }
            if (!com.baidu.location.c.c.a.f5000b || com.baidu.location.c.i.i().a(list)) {
                a.this.j();
            }
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public void onError(int i8, Throwable th) {
            if (th != null) {
                th.printStackTrace();
            }
            if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                com.baidu.location.c.i.i().a("cell onError = " + i8);
            }
        }

        /* synthetic */ b(a aVar, RunnableC0049a runnableC0049a) {
            this();
        }
    }

    private class c extends TelephonyManager.CellInfoCallback {
        private c() {
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public void onCellInfo(List<CellInfo> list) {
            boolean z7 = com.baidu.location.c.c.a.f4999a;
            if (z7 && com.baidu.location.c.c.a.f5000b) {
                com.baidu.location.c.i.i().a("onCellInfo");
            }
            if (list == null) {
                return;
            }
            boolean z8 = com.baidu.location.c.c.a.f5000b;
            if (!z8 || com.baidu.location.c.i.i().a(list)) {
                if (z7 && z8) {
                    com.baidu.location.c.i.i().a("request sim1 cellInfo");
                }
                if (a.this.C) {
                    a.this.D = !r4.D;
                }
                if (!a.this.C || a.this.D) {
                    a.this.j();
                }
            }
        }

        /* synthetic */ c(a aVar, RunnableC0049a runnableC0049a) {
            this();
        }
    }

    private class d extends TelephonyManager.CellInfoCallback {
        private d() {
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public void onCellInfo(List<CellInfo> list) {
            if (list == null) {
                return;
            }
            boolean z7 = com.baidu.location.c.c.a.f5000b;
            if (!z7 || com.baidu.location.c.i.i().a(list)) {
                if (com.baidu.location.c.c.a.f4999a && z7) {
                    com.baidu.location.c.i.i().a("request sim2 cellInfo");
                }
                if (a.this.C) {
                    a.this.D = !r3.D;
                }
                if (!a.this.C || a.this.D) {
                    a.this.j();
                }
            }
        }

        /* synthetic */ d(a aVar, RunnableC0049a runnableC0049a) {
            this();
        }
    }

    private class e extends PhoneStateListener {

        /* renamed from: com.baidu.location.c.a.a$e$a, reason: collision with other inner class name */
        class RunnableC0050a implements Runnable {
            RunnableC0050a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                        com.baidu.location.c.i.i().a("cell received cellinfo change");
                    }
                    a.this.g();
                } catch (Exception e8) {
                    if (com.baidu.location.c.c.a.f4999a) {
                        e8.printStackTrace();
                    }
                }
            }
        }

        public e() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCellInfoChanged(List<CellInfo> list) {
            if (list == null) {
                return;
            }
            a.this.F.post(new RunnableC0050a());
        }

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            com.baidu.location.c.b bVar;
            int cdmaDbm;
            if (a.this.f4943o != null) {
                if (a.this.f4943o.f4990i != 'g') {
                    if (a.this.f4943o.f4990i == 'c') {
                        bVar = a.this.f4943o;
                        cdmaDbm = signalStrength.getCdmaDbm();
                    }
                    if (com.baidu.location.c.c.a.f4999a || !com.baidu.location.c.c.a.f5000b) {
                    }
                    com.baidu.location.c.i.i().a("cell strength===== cell singal strength changed : " + a.this.f4943o.f4989h);
                    return;
                }
                bVar = a.this.f4943o;
                cdmaDbm = signalStrength.getGsmSignalStrength();
                bVar.f4989h = cdmaDbm;
                if (com.baidu.location.c.c.a.f4999a) {
                }
            }
        }
    }

    private static class f {

        /* renamed from: a, reason: collision with root package name */
        private static a f4961a = new a();
    }

    private static int a(CellIdentityNr cellIdentityNr) {
        try {
            int a8 = com.baidu.location.c.c.b.a(cellIdentityNr, "getHwTac");
            if (!com.baidu.location.c.c.a.f4999a || !com.baidu.location.c.c.a.f5000b) {
                return a8;
            }
            com.baidu.location.c.i.i().a(" get hw tac = " + a8);
            return a8;
        } catch (Throwable th) {
            if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                com.baidu.location.c.i.i().a(" get hw tac exception !" + th);
            }
            return -1;
        }
    }

    private static int b(String str) {
        if (str == null || !str.contains("mNrTac")) {
            return -1;
        }
        Matcher matcher = Pattern.compile("mNrTac=(.+?)\\}").matcher(str.replace(cn.hutool.core.text.l.SPACE, ""));
        while (true) {
            int i8 = -1;
            while (matcher.find()) {
                if (matcher.groupCount() >= 1) {
                    String group = matcher.group(1);
                    if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                        com.baidu.location.c.i.i().a(" pasrse mnrtac = " + group);
                    }
                    try {
                        i8 = Integer.parseInt(group);
                    } catch (Throwable th) {
                        if (com.baidu.location.c.c.a.f4999a) {
                            th.printStackTrace();
                        }
                    }
                }
            }
            return i8;
        }
    }

    private static int e(int i8) {
        if (i8 == Integer.MAX_VALUE) {
            return -1;
        }
        return i8;
    }

    private void h() {
        char c8;
        long j8;
        com.baidu.location.c.g i8;
        String str;
        String a8 = com.baidu.location.c.c.b.a(this.f4951w);
        if (a8 == null) {
            return;
        }
        File file = new File(a8 + File.separator + "lcvif2.dat");
        if (file.exists()) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(0L);
                long readLong = randomAccessFile.readLong();
                if (System.currentTimeMillis() - readLong > 60000) {
                    if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                        com.baidu.location.c.i.i().a("cellbuffer System.currentTimeMillis() - time > 1 *60 *1000" + readLong);
                    }
                    randomAccessFile.close();
                    file.delete();
                    return;
                }
                randomAccessFile.readInt();
                for (int i9 = 0; i9 < 3; i9++) {
                    long readLong2 = randomAccessFile.readLong();
                    int readInt = randomAccessFile.readInt();
                    int readInt2 = randomAccessFile.readInt();
                    int readInt3 = randomAccessFile.readInt();
                    long readLong3 = randomAccessFile.readLong();
                    int readInt4 = randomAccessFile.readInt();
                    boolean z7 = com.baidu.location.c.c.a.f4999a;
                    if (z7 && com.baidu.location.c.c.a.f5000b) {
                        com.baidu.location.c.i.i().a("cellbuffer cell info = " + readLong2 + cn.hutool.core.text.l.SPACE + readInt + cn.hutool.core.text.l.SPACE + readInt2 + cn.hutool.core.text.l.SPACE + readInt3 + cn.hutool.core.text.l.SPACE + readLong3 + cn.hutool.core.text.l.SPACE + readInt4);
                    }
                    char c9 = readInt4 == 1 ? 'g' : (char) 0;
                    if (readInt4 == 2) {
                        j8 = 0;
                        c8 = 'c';
                    } else {
                        c8 = c9;
                        j8 = 0;
                    }
                    if (readLong2 == j8) {
                        if (z7 && com.baidu.location.c.c.a.f5000b) {
                            i8 = com.baidu.location.c.i.i();
                            str = "loc cell time1 == 0";
                            i8.a(str);
                        }
                    } else {
                        com.baidu.location.c.b bVar = new com.baidu.location.c.b(readInt3, readLong3, readInt, readInt2, 0, c8, -1);
                        bVar.f4988g = readLong2;
                        if (bVar.b()) {
                            this.E = true;
                            this.f4945q.add(bVar);
                        }
                        if (z7 && com.baidu.location.c.c.a.f5000b) {
                            i8 = com.baidu.location.c.i.i();
                            str = "loc cell " + b(bVar);
                            i8.a(str);
                        }
                    }
                }
                randomAccessFile.close();
            } catch (Exception e8) {
                if (com.baidu.location.c.c.a.f4999a) {
                    e8.printStackTrace();
                }
                file.delete();
            }
        }
    }

    private void i() {
        List<com.baidu.location.c.b> list = this.f4945q;
        if (list == null && this.f4944p == null) {
            if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                com.baidu.location.c.i.i().a("cellbuffer mTrackList == null");
                return;
            }
            return;
        }
        if (list == null && this.f4944p != null) {
            LinkedList linkedList = new LinkedList();
            this.f4945q = linkedList;
            linkedList.add(this.f4944p);
        }
        String a8 = com.baidu.location.c.c.b.a(this.f4951w);
        if (a8 == null || this.f4945q == null) {
            return;
        }
        File file = new File(a8 + File.separator + "lcvif2.dat");
        int size = this.f4945q.size();
        try {
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(0L);
            randomAccessFile.writeLong(this.f4945q.get(size - 1).f4988g);
            randomAccessFile.writeInt(size);
            for (int i8 = 0; i8 < 3 - size; i8++) {
                randomAccessFile.writeLong(0L);
                randomAccessFile.writeInt(-1);
                randomAccessFile.writeInt(-1);
                randomAccessFile.writeInt(-1);
                randomAccessFile.writeLong(-1L);
                randomAccessFile.writeInt(2);
            }
            for (int i9 = 0; i9 < size; i9++) {
                randomAccessFile.writeLong(this.f4945q.get(i9).f4988g);
                randomAccessFile.writeInt(this.f4945q.get(i9).f4984c);
                randomAccessFile.writeInt(this.f4945q.get(i9).f4985d);
                randomAccessFile.writeInt(this.f4945q.get(i9).f4982a);
                randomAccessFile.writeLong(this.f4945q.get(i9).f4983b);
                if (this.f4945q.get(i9).f4990i == 'g') {
                    randomAccessFile.writeInt(1);
                } else if (this.f4945q.get(i9).f4990i == 'c') {
                    randomAccessFile.writeInt(2);
                } else {
                    randomAccessFile.writeInt(3);
                }
            }
            randomAccessFile.close();
        } catch (Exception e8) {
            if (com.baidu.location.c.c.a.f4999a) {
                e8.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.F.post(new RunnableC0049a());
    }

    public HashSet<String> c(com.baidu.location.c.b bVar) {
        StringBuilder sb;
        HashSet<String> hashSet = new HashSet<>();
        try {
            List<com.baidu.location.c.b> a8 = a(this.f4939k, this.f4943o);
            if (a8 != null && !a8.isEmpty()) {
                for (com.baidu.location.c.b bVar2 : a8) {
                    if (!bVar2.f4992k) {
                        int i8 = bVar2.f4982a;
                        String str = "";
                        if (i8 != -1 && bVar2.f4983b != -1) {
                            if (bVar.f4982a != i8) {
                                sb = new StringBuilder();
                                sb.append(bVar2.f4982a);
                                sb.append(b5.b.VERTICAL);
                                sb.append(bVar2.f4983b);
                            } else {
                                sb = new StringBuilder();
                                sb.append(bVar2.f4983b);
                                sb.append("");
                            }
                            str = sb.toString();
                        }
                        hashSet.add(str);
                    }
                }
            } else if (com.baidu.location.c.c.a.f4999a) {
                Log.d("getAllCellInfo", "=null");
            }
        } catch (Exception e8) {
            e = e8;
            e.printStackTrace();
            return hashSet;
        } catch (NoSuchMethodError e9) {
            e = e9;
            e.printStackTrace();
            return hashSet;
        }
        return hashSet;
    }

    public com.baidu.location.c.b d(int i8) {
        com.baidu.location.c.g i9;
        String str;
        com.baidu.location.c.b bVar;
        if (this.f4939k != null) {
            try {
                g();
                boolean z7 = com.baidu.location.c.c.a.f4999a;
                if (z7 && com.baidu.location.c.c.a.f5000b) {
                    com.baidu.location.c.i.i().a(" lastDiffTime = " + this.B + ", diffTime = " + i8);
                }
                if (Build.VERSION.SDK_INT >= 29 && this.f4954z) {
                    if (i8 < Integer.MAX_VALUE) {
                        long j8 = i8;
                        if (j8 != this.B) {
                            if (z7 && com.baidu.location.c.c.a.f5000b) {
                                i9 = com.baidu.location.c.i.i();
                                str = "diff time is changed";
                                i9.a(str);
                            }
                            e();
                        } else if (System.currentTimeMillis() - this.A > j8) {
                            if (z7 && com.baidu.location.c.c.a.f5000b) {
                                i9 = com.baidu.location.c.i.i();
                                str = " over diff time";
                                i9.a(str);
                            }
                            e();
                        }
                    }
                    this.B = i8;
                }
            } catch (Exception e8) {
                if (com.baidu.location.c.c.a.f4999a) {
                    e8.printStackTrace();
                }
            }
        }
        com.baidu.location.c.b bVar2 = this.f4943o;
        if (bVar2 != null && bVar2.e()) {
            this.f4944p = null;
            this.f4944p = new com.baidu.location.c.b(this.f4943o);
        }
        com.baidu.location.c.b bVar3 = this.f4943o;
        if (bVar3 != null && bVar3.d() && (bVar = this.f4944p) != null) {
            com.baidu.location.c.b bVar4 = this.f4943o;
            if (bVar4.f4990i == 'g') {
                bVar4.f4985d = bVar.f4985d;
                bVar4.f4984c = bVar.f4984c;
            }
        }
        return this.f4943o;
    }

    private int a(String str) {
        if (str != null && str.contains("cl_s2")) {
            try {
                Matcher matcher = Pattern.compile("cl_s2=[0-9]{1,}").matcher(str);
                if (matcher.find()) {
                    String group = matcher.group();
                    return Integer.parseInt(group.substring(group.indexOf("cl_s2=") + 6, group.length()));
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0122  */
    @SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String d(com.baidu.location.c.b bVar) {
        StringBuilder sb;
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = null;
        if (Integer.valueOf(Build.VERSION.SDK_INT).intValue() >= 17) {
            try {
                List<com.baidu.location.c.b> a8 = a(this.f4939k, this.f4943o);
                if (a8 != null && !a8.isEmpty()) {
                    sb2.append("&nc=");
                    HashSet hashSet = new HashSet();
                    long j8 = bVar != null ? bVar.f4988g : 0L;
                    for (com.baidu.location.c.b bVar2 : a8) {
                        if (!bVar2.f4992k) {
                            if (bVar2.f4982a != -1 && bVar2.f4983b != -1) {
                                String str = bVar2.f4982a + b5.b.VERTICAL + bVar2.f4983b;
                                if (!hashSet.contains(str)) {
                                    hashSet.add(str);
                                    sb2.append(bVar2.f4984c);
                                    sb2.append(b5.b.VERTICAL);
                                    sb2.append(bVar2.f4985d);
                                    sb2.append(b5.b.VERTICAL);
                                    sb2.append(bVar2.f4982a);
                                    sb2.append(b5.b.VERTICAL);
                                    sb2.append(bVar2.f4983b);
                                    sb2.append(b5.b.VERTICAL);
                                    sb2.append(bVar2.f4989h);
                                    sb2.append(b5.b.VERTICAL);
                                    sb2.append(bVar2.f4988g - j8);
                                    sb2.append(";");
                                }
                            }
                            if (Build.VERSION.SDK_INT > 28 && bVar2.f4993l == 6 && bVar2.f4997p != null && bVar2.b()) {
                                if (sb3 == null) {
                                    sb = new StringBuilder();
                                    try {
                                        sb.append("&ncnr=");
                                        sb3 = sb;
                                    } catch (Throwable th) {
                                        th = th;
                                        sb3 = sb;
                                        if (com.baidu.location.c.c.a.f4999a) {
                                            th.printStackTrace();
                                        }
                                        if (sb3 == null) {
                                        }
                                    }
                                }
                                try {
                                    sb3.append(f(bVar2));
                                    sb3.append("_");
                                    sb3.append(bVar2.f4997p);
                                    sb3.append(";");
                                } catch (Throwable th2) {
                                    th = th2;
                                    sb = sb3;
                                    sb3 = sb;
                                    if (com.baidu.location.c.c.a.f4999a) {
                                    }
                                    if (sb3 == null) {
                                    }
                                }
                            }
                        }
                    }
                } else if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                    com.baidu.location.c.i.i().a("getAllCellInfo = null");
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        if (sb3 == null) {
            return sb2.toString();
        }
        return sb2.toString() + sb3.toString();
    }

    private String f(com.baidu.location.c.b bVar) {
        return String.format(Locale.CHINA, "%d|%d|%d|%d", Integer.valueOf(bVar.f4984c), Integer.valueOf(bVar.f4985d), Integer.valueOf(bVar.f4982a), Long.valueOf(bVar.f4983b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003e, code lost:
    
        if (android.os.Build.VERSION.SDK_INT <= r1) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void g() {
        CellLocation cellLocation;
        try {
            com.baidu.location.c.b a8 = a(this.f4943o, this.f4939k);
            if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b && a8 != null) {
                com.baidu.location.c.i.i().a("new cell api = " + f(a8));
            }
            if (a8 != null) {
                g(a8);
            }
            int i8 = this.f4934f;
            if (i8 >= 0) {
            }
            if (a8 == null || !a8.b()) {
                try {
                    cellLocation = this.f4939k.getCellLocation();
                } catch (Throwable unused) {
                    cellLocation = null;
                }
                com.baidu.location.c.b a9 = cellLocation != null ? a(cellLocation) : null;
                if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b && a9 != null) {
                    com.baidu.location.c.i.i().a(" old cell api = " + f(a9));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public com.baidu.location.c.b b(com.baidu.location.c.b bVar, TelephonyManager telephonyManager) {
        CellLocation cellLocation;
        com.baidu.location.c.b a8 = a(bVar, telephonyManager);
        if (Build.VERSION.SDK_INT <= 28 && (a8 == null || !a8.b())) {
            try {
                cellLocation = telephonyManager.getCellLocation();
            } catch (Throwable unused) {
                cellLocation = null;
            }
            if (cellLocation != null) {
                a8 = a(cellLocation);
            }
            if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b && a8 != null) {
                com.baidu.location.c.i.i().a("main process: old cell api = " + f(a8));
            }
        }
        return a8;
    }

    public void c(int i8) {
        this.M.set(i8);
    }

    public static a a() {
        return f.f4961a;
    }

    private String e(com.baidu.location.c.b bVar) {
        StringBuffer stringBuffer = new StringBuffer(128);
        stringBuffer.append("&nw2=");
        stringBuffer.append(bVar.f4990i);
        stringBuffer.append(String.format(Locale.CHINA, "&cl2=%d|%d|%d|%d&cl_s2=%d&clp2=%d&cl_t2=%d", Integer.valueOf(bVar.f4984c), Integer.valueOf(bVar.f4985d), Integer.valueOf(bVar.f4982a), Long.valueOf(bVar.f4983b), Integer.valueOf(bVar.f4989h), Integer.valueOf(bVar.f4993l), Long.valueOf(bVar.f4988g)));
        if (bVar.f4991j != Integer.MAX_VALUE) {
            stringBuffer.append("&cl_cs2=");
            stringBuffer.append(bVar.f4991j);
        }
        if (bVar.f4997p != null) {
            stringBuffer.append("&clnrs2=");
            stringBuffer.append(bVar.f4997p);
        }
        return stringBuffer.toString();
    }

    private void f() {
        if (this.f4948t == null) {
            this.f4948t = new b(this, null);
        }
        Executor executor = this.f4946r;
        if (executor != null) {
            this.f4939k.requestCellInfoUpdate(executor, this.f4948t);
        }
    }

    private void g(com.baidu.location.c.b bVar) {
        com.baidu.location.c.b bVar2;
        com.baidu.location.c.b bVar3 = this.f4943o;
        if (bVar.b() && ((bVar2 = this.f4943o) == null || !bVar2.a(bVar) || a(this.f4943o, bVar))) {
            this.f4943o = bVar;
        }
        if (bVar.b()) {
            if (bVar3 == null || !bVar3.a(bVar)) {
                if (!bVar.b()) {
                    List<com.baidu.location.c.b> list = this.f4945q;
                    if (list != null) {
                        list.clear();
                        return;
                    }
                    return;
                }
                int size = this.f4945q.size();
                com.baidu.location.c.b bVar4 = size == 0 ? null : this.f4945q.get(size - 1);
                if (bVar4 != null) {
                    long j8 = bVar4.f4983b;
                    com.baidu.location.c.b bVar5 = this.f4943o;
                    if (j8 == bVar5.f4983b && bVar4.f4982a == bVar5.f4982a) {
                        return;
                    }
                }
                this.f4945q.add(this.f4943o);
                if (this.f4945q.size() > 3) {
                    this.f4945q.remove(0);
                }
                if (this.f4938j) {
                    i();
                }
                this.E = false;
            }
        }
    }

    public String b(com.baidu.location.c.b bVar) {
        int i8;
        if (bVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer(128);
        stringBuffer.append("&nw=");
        stringBuffer.append(bVar.f4990i);
        Locale locale = Locale.CHINA;
        stringBuffer.append(String.format(locale, "&cl=%d|%d|%d|%d&cl_s=%d", Integer.valueOf(bVar.f4984c), Integer.valueOf(bVar.f4985d), Integer.valueOf(bVar.f4982a), Long.valueOf(bVar.f4983b), Integer.valueOf(bVar.f4989h)));
        if (bVar.f4986e < Integer.MAX_VALUE && (i8 = bVar.f4987f) < Integer.MAX_VALUE) {
            stringBuffer.append(String.format(locale, "&cdmall=%.6f|%.6f", Double.valueOf(i8 / 14400.0d), Double.valueOf(bVar.f4986e / 14400.0d)));
        }
        stringBuffer.append("&cl_t=");
        stringBuffer.append(bVar.f4988g);
        stringBuffer.append("&cl_api=");
        stringBuffer.append(bVar.f4994m);
        stringBuffer.append("&clp=");
        stringBuffer.append(bVar.f4993l);
        if (bVar.f4997p != null) {
            stringBuffer.append("&clnrs=");
            stringBuffer.append(bVar.f4997p);
        }
        if (Build.VERSION.SDK_INT >= 28 && bVar.f4991j != Integer.MAX_VALUE) {
            stringBuffer.append("&cl_cs=");
            stringBuffer.append(bVar.f4991j);
        }
        try {
            List<com.baidu.location.c.b> list = this.f4945q;
            if (list != null && list.size() > 0) {
                int size = this.f4945q.size();
                stringBuffer.append("&clt=");
                for (int i9 = 0; i9 < size; i9++) {
                    com.baidu.location.c.b bVar2 = this.f4945q.get(i9);
                    if (bVar2 != null) {
                        int i10 = bVar2.f4984c;
                        if (i10 != bVar.f4984c) {
                            stringBuffer.append(i10);
                        }
                        stringBuffer.append(b5.b.VERTICAL);
                        int i11 = bVar2.f4985d;
                        if (i11 != bVar.f4985d) {
                            stringBuffer.append(i11);
                        }
                        stringBuffer.append(b5.b.VERTICAL);
                        int i12 = bVar2.f4982a;
                        if (i12 != bVar.f4982a) {
                            stringBuffer.append(i12);
                        }
                        stringBuffer.append(b5.b.VERTICAL);
                        long j8 = bVar2.f4983b;
                        if (j8 != bVar.f4983b) {
                            stringBuffer.append(j8);
                        }
                        stringBuffer.append(b5.b.VERTICAL);
                        stringBuffer.append((System.currentTimeMillis() - bVar2.f4988g) / 1000);
                        stringBuffer.append(";");
                    }
                }
            }
        } catch (Exception e8) {
            if (com.baidu.location.c.c.a.f4999a) {
                e8.printStackTrace();
            }
        }
        if (this.f4953y > 100) {
            this.f4953y = 0;
        }
        int i13 = this.f4953y + (f4932d << 8);
        boolean z7 = com.baidu.location.c.c.a.f4999a;
        if (z7 && com.baidu.location.c.c.a.f5000b) {
            com.baidu.location.c.i.i().a("sim state:" + this.f4953y + SystemInfoUtil.COMMA + i13);
        }
        stringBuffer.append("&cs=" + i13);
        String str = bVar.f4995n;
        if (str != null) {
            stringBuffer.append(str);
        }
        if (z7 && com.baidu.location.c.c.a.f5000b) {
            com.baidu.location.c.i.i().a("cell sb.toString() = " + stringBuffer.toString());
        }
        return stringBuffer.toString();
    }

    public boolean c() {
        return this.E;
    }

    public synchronized List<CellInfo> d() {
        return this.L;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:189|(5:191|(1:195)|196|(1:198)|(5:208|209|(1:215)|224|(2:218|(2:222|207)))(2:202|(2:206|207)))(2:229|(3:231|(1:235)|236)(13:238|15|(4:18|19|(4:21|(1:25)|26|(1:28))(2:30|(6:32|(8:34|(1:38)|39|(2:53|54)|41|(2:46|47)|43|(1:45))(2:60|(7:62|63|(1:67)|69|70|(1:74)|(18:76|(2:135|136)|78|(2:128|129)|80|81|(4:115|116|(1:120)|121)|83|84|(4:102|103|(1:107)|108)|86|(1:90)|91|(1:93)|94|(1:96)|97|(3:99|100|101))))|144|145|146|(1:148)))|29)|149|(1:151)|152|153|(7:155|(1:159)|160|(1:162)|166|(1:170)|171)(7:172|(1:176)|177|(1:181)|166|(2:168|170)|171)|163|164|166|(0)|171))|14|15|(4:18|19|(0)(0)|29)|149|(0)|152|153|(0)(0)|163|164|166|(0)|171) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
    
        if (r2 >= 28) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0509, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x05b9, code lost:
    
        if (com.baidu.location.c.c.a.f4999a != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x05bb, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x05be, code lost:
    
        r4.f4988g = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x01d2, code lost:
    
        r0 = r18.getCellConnectionStatus();
        r4.f4991j = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0157, code lost:
    
        if (r0 < 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x01d0, code lost:
    
        if (r2 >= 28) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04a9 A[Catch: Error -> 0x0509, TRY_ENTER, TryCatch #6 {Error -> 0x0509, blocks: (B:155:0x04a9, B:157:0x04b6, B:159:0x04ba, B:160:0x050c, B:162:0x0515, B:163:0x0528, B:164:0x05b3, B:172:0x052e, B:174:0x053f, B:176:0x0543, B:177:0x0591, B:179:0x059a, B:181:0x059e), top: B:153:0x04a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x052e A[Catch: Error -> 0x0509, TryCatch #6 {Error -> 0x0509, blocks: (B:155:0x04a9, B:157:0x04b6, B:159:0x04ba, B:160:0x050c, B:162:0x0515, B:163:0x0528, B:164:0x05b3, B:172:0x052e, B:174:0x053f, B:176:0x0543, B:177:0x0591, B:179:0x059a, B:181:0x059e), top: B:153:0x04a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01e6 A[Catch: Exception -> 0x01ff, TryCatch #2 {Exception -> 0x01ff, blocks: (B:19:0x01e1, B:21:0x01e6, B:23:0x01f1, B:25:0x01f5, B:26:0x0202, B:28:0x0240, B:29:0x02d5, B:30:0x0246, B:32:0x024c, B:34:0x0253, B:36:0x025f, B:38:0x0263, B:39:0x026c, B:41:0x0289, B:43:0x02a6, B:45:0x02d1, B:50:0x029f, B:52:0x02a3, B:57:0x0282, B:59:0x0286, B:60:0x02d9, B:70:0x031a, B:72:0x031e, B:74:0x0322, B:76:0x032d, B:78:0x034a, B:80:0x0367, B:83:0x03a9, B:86:0x03e7, B:90:0x03f5, B:91:0x03f7, B:93:0x0404, B:94:0x040a, B:96:0x0413, B:97:0x0419, B:99:0x0431, B:101:0x0437, B:112:0x03e0, B:114:0x03e4, B:125:0x03a2, B:127:0x03a6, B:132:0x0360, B:134:0x0364, B:139:0x0343, B:141:0x0347, B:143:0x0315, B:63:0x02df, B:65:0x02ef, B:67:0x02f3, B:54:0x0272, B:136:0x0333, B:103:0x03ae, B:105:0x03ba, B:107:0x03be, B:108:0x03d9, B:116:0x0374, B:118:0x037c, B:120:0x0380, B:121:0x039b, B:47:0x028f, B:129:0x0350), top: B:18:0x01e1, inners: #0, #1, #3, #5, #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0246 A[Catch: Exception -> 0x01ff, TryCatch #2 {Exception -> 0x01ff, blocks: (B:19:0x01e1, B:21:0x01e6, B:23:0x01f1, B:25:0x01f5, B:26:0x0202, B:28:0x0240, B:29:0x02d5, B:30:0x0246, B:32:0x024c, B:34:0x0253, B:36:0x025f, B:38:0x0263, B:39:0x026c, B:41:0x0289, B:43:0x02a6, B:45:0x02d1, B:50:0x029f, B:52:0x02a3, B:57:0x0282, B:59:0x0286, B:60:0x02d9, B:70:0x031a, B:72:0x031e, B:74:0x0322, B:76:0x032d, B:78:0x034a, B:80:0x0367, B:83:0x03a9, B:86:0x03e7, B:90:0x03f5, B:91:0x03f7, B:93:0x0404, B:94:0x040a, B:96:0x0413, B:97:0x0419, B:99:0x0431, B:101:0x0437, B:112:0x03e0, B:114:0x03e4, B:125:0x03a2, B:127:0x03a6, B:132:0x0360, B:134:0x0364, B:139:0x0343, B:141:0x0347, B:143:0x0315, B:63:0x02df, B:65:0x02ef, B:67:0x02f3, B:54:0x0272, B:136:0x0333, B:103:0x03ae, B:105:0x03ba, B:107:0x03be, B:108:0x03d9, B:116:0x0374, B:118:0x037c, B:120:0x0380, B:121:0x039b, B:47:0x028f, B:129:0x0350), top: B:18:0x01e1, inners: #0, #1, #3, #5, #7, #8, #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.baidu.location.c.b a(CellInfo cellInfo, com.baidu.location.c.b bVar, TelephonyManager telephonyManager) {
        boolean z7;
        int i8;
        com.baidu.location.c.g i9;
        StringBuilder sb;
        String str;
        int i10;
        int cellConnectionStatus;
        com.baidu.location.c.g i11;
        StringBuilder sb2;
        long timestampMillis;
        long timestampMillis2;
        CellIdentityNr cellIdentityNr;
        String mccString;
        String mccString2;
        String mncString;
        String mncString2;
        int tac;
        String cellIdentityNr2;
        int tac2;
        long nci;
        CellSignalStrength cellSignalStrength;
        int asuLevel;
        int csiRsrp;
        int csiRsrq;
        int csiSinr;
        int dbm;
        int level;
        int ssRsrp;
        int ssRsrq;
        int ssSinr;
        int cellConnectionStatus2;
        long nci2;
        CellIdentity cellIdentity;
        String cellIdentityNr3;
        CellIdentityTdscdma cellIdentity2;
        String mccString3;
        String mccString4;
        String mncString3;
        String mncString4;
        int lac;
        int cid;
        CellSignalStrengthTdscdma cellSignalStrength2;
        int asuLevel2;
        int cellConnectionStatus3;
        int i12 = Build.VERSION.SDK_INT;
        int intValue = Integer.valueOf(i12).intValue();
        if (intValue < 17) {
            return null;
        }
        com.baidu.location.c.b bVar2 = new com.baidu.location.c.b();
        if (cellInfo instanceof CellInfoGsm) {
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            CellIdentityGsm cellIdentity3 = cellInfoGsm.getCellIdentity();
            if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                com.baidu.location.c.i.i().a("CellInfoGsm");
            }
            bVar2.f4984c = e(cellIdentity3.getMcc());
            bVar2.f4985d = e(cellIdentity3.getMnc());
            bVar2.f4982a = e(cellIdentity3.getLac());
            bVar2.f4983b = e(cellIdentity3.getCid());
            bVar2.f4990i = 'g';
            bVar2.f4989h = cellInfoGsm.getCellSignalStrength().getAsuLevel();
            bVar2.f4993l = 2;
        } else {
            if (cellInfo instanceof CellInfoCdma) {
                CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
                CellIdentityCdma cellIdentity4 = cellInfoCdma.getCellIdentity();
                boolean z8 = com.baidu.location.c.c.a.f4999a;
                if (z8 && com.baidu.location.c.c.a.f5000b) {
                    com.baidu.location.c.i.i().a("CellInfoCdma");
                    com.baidu.location.c.i.i().a("lat = " + cellIdentity4.getLatitude());
                    com.baidu.location.c.i.i().a("lon = " + cellIdentity4.getLongitude());
                }
                bVar2.f4986e = cellIdentity4.getLatitude();
                bVar2.f4987f = cellIdentity4.getLongitude();
                bVar2.f4985d = e(cellIdentity4.getSystemId());
                bVar2.f4982a = e(cellIdentity4.getNetworkId());
                bVar2.f4983b = e(cellIdentity4.getBasestationId());
                bVar2.f4990i = 'c';
                bVar2.f4989h = cellInfoCdma.getCellSignalStrength().getCdmaDbm();
                bVar2.f4993l = 1;
                if (i12 >= 28) {
                    cellConnectionStatus = cellInfo.getCellConnectionStatus();
                    bVar2.f4991j = cellConnectionStatus;
                }
                if (bVar == null || (i10 = bVar.f4984c) <= 0) {
                    try {
                        String networkOperator = telephonyManager.getNetworkOperator();
                        if (networkOperator != null && networkOperator.length() > 0 && networkOperator.length() >= 3) {
                            i8 = Integer.valueOf(networkOperator.substring(0, 3)).intValue();
                        }
                    } catch (Exception e8) {
                        if (com.baidu.location.c.c.a.f4999a) {
                            e8.printStackTrace();
                        }
                    }
                    i8 = -1;
                    if (i8 > 0) {
                        bVar2.f4984c = i8;
                        if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                            i9 = com.baidu.location.c.i.i();
                            sb = new StringBuilder();
                            str = "cdma set old mcc = ";
                            sb.append(str);
                            sb.append(bVar2.f4984c);
                            i9.a(sb.toString());
                        }
                    }
                } else {
                    bVar2.f4984c = i10;
                    if (z8 && com.baidu.location.c.c.a.f5000b) {
                        i9 = com.baidu.location.c.i.i();
                        sb = new StringBuilder();
                        str = "cdma set old cellinfo mcc = ";
                        sb.append(str);
                        sb.append(bVar2.f4984c);
                        i9.a(sb.toString());
                    }
                }
            } else {
                if (!(cellInfo instanceof CellInfoLte)) {
                    z7 = false;
                    if (intValue >= 18 && !z7) {
                        try {
                        } catch (Exception e9) {
                            if (com.baidu.location.c.c.a.f4999a) {
                            }
                        }
                        if (!(cellInfo instanceof CellInfoWcdma)) {
                            CellIdentityWcdma cellIdentity5 = ((CellInfoWcdma) cellInfo).getCellIdentity();
                            if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                                com.baidu.location.c.i.i().a("CellInfoWcdma");
                            }
                            bVar2.f4984c = e(cellIdentity5.getMcc());
                            bVar2.f4985d = e(cellIdentity5.getMnc());
                            bVar2.f4982a = e(cellIdentity5.getLac());
                            bVar2.f4983b = e(cellIdentity5.getCid());
                            bVar2.f4990i = 'g';
                            bVar2.f4989h = ((CellInfoWcdma) cellInfo).getCellSignalStrength().getAsuLevel();
                            bVar2.f4993l = 4;
                            if (Build.VERSION.SDK_INT >= 28) {
                                cellConnectionStatus3 = cellInfo.getCellConnectionStatus();
                            }
                        } else if (Build.VERSION.SDK_INT >= 29) {
                            if (w.a(cellInfo)) {
                                cellIdentity2 = l0.a(cellInfo).getCellIdentity();
                                if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                                    com.baidu.location.c.i.i().a("CellInfoTdscdma");
                                }
                                mccString3 = cellIdentity2.getMccString();
                                if (mccString3 != null) {
                                    try {
                                        mccString4 = cellIdentity2.getMccString();
                                        bVar2.f4984c = Integer.valueOf(mccString4).intValue();
                                    } catch (Throwable th) {
                                        if (com.baidu.location.c.c.a.f4999a) {
                                            th.printStackTrace();
                                        }
                                    }
                                }
                                mncString3 = cellIdentity2.getMncString();
                                if (mncString3 != null) {
                                    try {
                                        mncString4 = cellIdentity2.getMncString();
                                        bVar2.f4985d = Integer.valueOf(mncString4).intValue();
                                    } catch (Throwable th2) {
                                        if (com.baidu.location.c.c.a.f4999a) {
                                            th2.printStackTrace();
                                        }
                                    }
                                }
                                lac = cellIdentity2.getLac();
                                bVar2.f4982a = e(lac);
                                cid = cellIdentity2.getCid();
                                bVar2.f4983b = e(cid);
                                bVar2.f4990i = 'g';
                                cellSignalStrength2 = l0.a(cellInfo).getCellSignalStrength();
                                asuLevel2 = cellSignalStrength2.getAsuLevel();
                                bVar2.f4989h = asuLevel2;
                                bVar2.f4993l = 5;
                                if (Build.VERSION.SDK_INT >= 28) {
                                    cellConnectionStatus3 = cellInfo.getCellConnectionStatus();
                                }
                            } else if (com.baidu.location.c.a.e.a(cellInfo)) {
                                try {
                                    cellIdentity = com.baidu.location.c.a.f.a(cellInfo).getCellIdentity();
                                    CellIdentityNr a8 = h.a(cellIdentity);
                                    if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                                        com.baidu.location.c.g i13 = com.baidu.location.c.i.i();
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(" get cell nr = ");
                                        cellIdentityNr3 = a8.toString();
                                        sb3.append(cellIdentityNr3);
                                        i13.a(sb3.toString());
                                    }
                                    cellIdentityNr = a8;
                                } catch (Throwable th3) {
                                    th3.printStackTrace();
                                    cellIdentityNr = null;
                                }
                                if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                                    com.baidu.location.c.i.i().a("CellInfoNr");
                                }
                                if (cellIdentityNr != null) {
                                    mccString = cellIdentityNr.getMccString();
                                    if (mccString != null) {
                                        try {
                                            mccString2 = cellIdentityNr.getMccString();
                                            bVar2.f4984c = Integer.valueOf(mccString2).intValue();
                                        } catch (Throwable th4) {
                                            if (com.baidu.location.c.c.a.f4999a) {
                                                th4.printStackTrace();
                                            }
                                        }
                                    }
                                    mncString = cellIdentityNr.getMncString();
                                    if (mncString != null) {
                                        try {
                                            mncString2 = cellIdentityNr.getMncString();
                                            bVar2.f4985d = Integer.valueOf(mncString2).intValue();
                                        } catch (Throwable th5) {
                                            if (com.baidu.location.c.c.a.f4999a) {
                                                th5.printStackTrace();
                                            }
                                        }
                                    }
                                    tac = cellIdentityNr.getTac();
                                    int e10 = e(tac);
                                    bVar2.f4982a = e10;
                                    if (e10 == -1) {
                                        try {
                                            int a9 = a(cellIdentityNr);
                                            if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                                                com.baidu.location.c.i.i().a(" get nrtac for huawei = " + a9);
                                            }
                                            bVar2.f4982a = e(a9);
                                        } catch (Throwable th6) {
                                            if (com.baidu.location.c.c.a.f4999a) {
                                                th6.printStackTrace();
                                            }
                                        }
                                    }
                                    if (bVar2.f4982a == -1) {
                                        try {
                                            cellIdentityNr2 = cellIdentityNr.toString();
                                            int b8 = b(cellIdentityNr2);
                                            if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                                                com.baidu.location.c.i.i().a(" get nrtac for samsung = " + b8);
                                            }
                                            bVar2.f4982a = e(b8);
                                        } catch (Throwable th7) {
                                            if (com.baidu.location.c.c.a.f4999a) {
                                                th7.printStackTrace();
                                            }
                                        }
                                    }
                                    tac2 = cellIdentityNr.getTac();
                                    if (bVar2.f4982a == -1 && tac2 != Integer.MAX_VALUE) {
                                        bVar2.f4982a = tac2;
                                    }
                                    nci = cellIdentityNr.getNci();
                                    if (nci != Long.MAX_VALUE) {
                                        nci2 = cellIdentityNr.getNci();
                                        bVar2.f4983b = nci2;
                                    }
                                    bVar2.f4990i = 'g';
                                    bVar2.f4993l = 6;
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        cellConnectionStatus2 = cellInfo.getCellConnectionStatus();
                                        bVar2.f4991j = cellConnectionStatus2;
                                    }
                                    cellSignalStrength = com.baidu.location.c.a.f.a(cellInfo).getCellSignalStrength();
                                    CellSignalStrengthNr a10 = p.a(cellSignalStrength);
                                    asuLevel = a10.getAsuLevel();
                                    bVar2.f4989h = asuLevel;
                                    if (bVar2.b()) {
                                        Locale locale = Locale.US;
                                        csiRsrp = a10.getCsiRsrp();
                                        csiRsrq = a10.getCsiRsrq();
                                        csiSinr = a10.getCsiSinr();
                                        dbm = a10.getDbm();
                                        level = a10.getLevel();
                                        ssRsrp = a10.getSsRsrp();
                                        ssRsrq = a10.getSsRsrq();
                                        ssSinr = a10.getSsSinr();
                                        bVar2.f4997p = String.format(locale, "%d|%d|%d|%d|%d|%d|%d|%d", Integer.valueOf(csiRsrp), Integer.valueOf(csiRsrq), Integer.valueOf(csiSinr), Integer.valueOf(dbm), Integer.valueOf(level), Integer.valueOf(ssRsrp), Integer.valueOf(ssRsrq), Integer.valueOf(ssSinr));
                                    }
                                }
                            }
                            if (com.baidu.location.c.c.a.f4999a) {
                                e9.printStackTrace();
                            }
                        }
                        bVar2.f4991j = cellConnectionStatus3;
                    }
                    if (cellInfo.isRegistered()) {
                        bVar2.f4992k = true;
                    }
                    if (intValue >= 30) {
                        long elapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - cellInfo.getTimeStamp()) / 1000000;
                        boolean z9 = com.baidu.location.c.c.a.f4999a;
                        if (z9 && com.baidu.location.c.c.a.f5000b) {
                            com.baidu.location.c.i.i().a("new cell delta1 time(ns) = " + SystemClock.elapsedRealtimeNanos());
                            com.baidu.location.c.i.i().a("new cell delta2 time(ns) = " + cellInfo.getTimeStamp());
                            com.baidu.location.c.i.i().a("new cell delta3 time(ms) = " + elapsedRealtimeNanos);
                        }
                        bVar2.f4988g = System.currentTimeMillis() - elapsedRealtimeNanos;
                        if (z9 && com.baidu.location.c.c.a.f5000b) {
                            i11 = com.baidu.location.c.i.i();
                            sb2 = new StringBuilder();
                            sb2.append("new cell time(ms) = ");
                            sb2.append(bVar2.f4988g);
                        }
                        if (com.baidu.location.c.c.a.f4999a) {
                            com.baidu.location.c.i.i().a("mcc = " + bVar2.f4984c);
                            com.baidu.location.c.i.i().a("mnc = " + bVar2.f4985d);
                            com.baidu.location.c.i.i().a("lac = " + bVar2.f4982a);
                            com.baidu.location.c.i.i().a("cid = " + bVar2.f4983b);
                            com.baidu.location.c.i.i().a("cs = " + bVar2.f4991j);
                        }
                        return bVar2;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    timestampMillis = cellInfo.getTimestampMillis();
                    long j8 = elapsedRealtime - timestampMillis;
                    boolean z10 = com.baidu.location.c.c.a.f4999a;
                    if (z10 && com.baidu.location.c.c.a.f5000b) {
                        com.baidu.location.c.i.i().a("new cell delta1 time(ms) = " + SystemClock.elapsedRealtime());
                        com.baidu.location.c.g i14 = com.baidu.location.c.i.i();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("new cell delta2 time(ms) = ");
                        timestampMillis2 = cellInfo.getTimestampMillis();
                        sb4.append(timestampMillis2);
                        i14.a(sb4.toString());
                        com.baidu.location.c.i.i().a("new cell delta3 time(ms) = " + j8);
                    }
                    bVar2.f4988g = System.currentTimeMillis() - j8;
                    if (z10) {
                        i11 = com.baidu.location.c.i.i();
                        sb2 = new StringBuilder();
                        sb2.append("new cell time apilevel up 30 (ms) = ");
                        sb2.append(bVar2.f4988g);
                    }
                    if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                        com.baidu.location.c.i.i().a("mcc = " + bVar2.f4984c);
                        com.baidu.location.c.i.i().a("mnc = " + bVar2.f4985d);
                        com.baidu.location.c.i.i().a("lac = " + bVar2.f4982a);
                        com.baidu.location.c.i.i().a("cid = " + bVar2.f4983b);
                        com.baidu.location.c.i.i().a("cs = " + bVar2.f4991j);
                    }
                    return bVar2;
                    i11.a(sb2.toString());
                    if (com.baidu.location.c.c.a.f4999a) {
                    }
                    return bVar2;
                }
                CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                CellIdentityLte cellIdentity6 = cellInfoLte.getCellIdentity();
                if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                    com.baidu.location.c.i.i().a("CellInfoLte");
                }
                bVar2.f4984c = e(cellIdentity6.getMcc());
                bVar2.f4985d = e(cellIdentity6.getMnc());
                bVar2.f4982a = e(cellIdentity6.getTac());
                bVar2.f4983b = e(cellIdentity6.getCi());
                bVar2.f4990i = 'g';
                bVar2.f4989h = cellInfoLte.getCellSignalStrength().getAsuLevel();
                bVar2.f4993l = 3;
            }
            z7 = true;
            if (intValue >= 18) {
                if (!(cellInfo instanceof CellInfoWcdma)) {
                }
                bVar2.f4991j = cellConnectionStatus3;
            }
            if (cellInfo.isRegistered()) {
            }
            if (intValue >= 30) {
            }
            i11.a(sb2.toString());
            if (com.baidu.location.c.c.a.f4999a) {
            }
            return bVar2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0111, code lost:
    
        if (r0 != false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:5:0x000d, B:7:0x0011, B:8:0x0023, B:10:0x0033, B:12:0x0036, B:14:0x003c, B:16:0x003f, B:17:0x0041, B:19:0x0047, B:21:0x004d, B:22:0x0052, B:24:0x0056, B:26:0x005a, B:27:0x008e, B:29:0x0095, B:31:0x0099, B:32:0x00ac, B:33:0x00ae, B:35:0x00b2, B:36:0x00b9, B:38:0x00bd, B:40:0x00c1, B:41:0x00ca, B:43:0x00d0, B:45:0x00d4, B:46:0x00e7, B:47:0x00e9, B:49:0x00ed, B:50:0x00f4, B:52:0x00f8, B:54:0x00fc, B:55:0x0105, B:83:0x00db, B:85:0x00df, B:86:0x0103, B:87:0x00a0, B:89:0x00a4, B:90:0x00c8, B:91:0x0050), top: B:4:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:5:0x000d, B:7:0x0011, B:8:0x0023, B:10:0x0033, B:12:0x0036, B:14:0x003c, B:16:0x003f, B:17:0x0041, B:19:0x0047, B:21:0x004d, B:22:0x0052, B:24:0x0056, B:26:0x005a, B:27:0x008e, B:29:0x0095, B:31:0x0099, B:32:0x00ac, B:33:0x00ae, B:35:0x00b2, B:36:0x00b9, B:38:0x00bd, B:40:0x00c1, B:41:0x00ca, B:43:0x00d0, B:45:0x00d4, B:46:0x00e7, B:47:0x00e9, B:49:0x00ed, B:50:0x00f4, B:52:0x00f8, B:54:0x00fc, B:55:0x0105, B:83:0x00db, B:85:0x00df, B:86:0x0103, B:87:0x00a0, B:89:0x00a4, B:90:0x00c8, B:91:0x0050), top: B:4:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:5:0x000d, B:7:0x0011, B:8:0x0023, B:10:0x0033, B:12:0x0036, B:14:0x003c, B:16:0x003f, B:17:0x0041, B:19:0x0047, B:21:0x004d, B:22:0x0052, B:24:0x0056, B:26:0x005a, B:27:0x008e, B:29:0x0095, B:31:0x0099, B:32:0x00ac, B:33:0x00ae, B:35:0x00b2, B:36:0x00b9, B:38:0x00bd, B:40:0x00c1, B:41:0x00ca, B:43:0x00d0, B:45:0x00d4, B:46:0x00e7, B:47:0x00e9, B:49:0x00ed, B:50:0x00f4, B:52:0x00f8, B:54:0x00fc, B:55:0x0105, B:83:0x00db, B:85:0x00df, B:86:0x0103, B:87:0x00a0, B:89:0x00a4, B:90:0x00c8, B:91:0x0050), top: B:4:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:5:0x000d, B:7:0x0011, B:8:0x0023, B:10:0x0033, B:12:0x0036, B:14:0x003c, B:16:0x003f, B:17:0x0041, B:19:0x0047, B:21:0x004d, B:22:0x0052, B:24:0x0056, B:26:0x005a, B:27:0x008e, B:29:0x0095, B:31:0x0099, B:32:0x00ac, B:33:0x00ae, B:35:0x00b2, B:36:0x00b9, B:38:0x00bd, B:40:0x00c1, B:41:0x00ca, B:43:0x00d0, B:45:0x00d4, B:46:0x00e7, B:47:0x00e9, B:49:0x00ed, B:50:0x00f4, B:52:0x00f8, B:54:0x00fc, B:55:0x0105, B:83:0x00db, B:85:0x00df, B:86:0x0103, B:87:0x00a0, B:89:0x00a4, B:90:0x00c8, B:91:0x0050), top: B:4:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0103 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:5:0x000d, B:7:0x0011, B:8:0x0023, B:10:0x0033, B:12:0x0036, B:14:0x003c, B:16:0x003f, B:17:0x0041, B:19:0x0047, B:21:0x004d, B:22:0x0052, B:24:0x0056, B:26:0x005a, B:27:0x008e, B:29:0x0095, B:31:0x0099, B:32:0x00ac, B:33:0x00ae, B:35:0x00b2, B:36:0x00b9, B:38:0x00bd, B:40:0x00c1, B:41:0x00ca, B:43:0x00d0, B:45:0x00d4, B:46:0x00e7, B:47:0x00e9, B:49:0x00ed, B:50:0x00f4, B:52:0x00f8, B:54:0x00fc, B:55:0x0105, B:83:0x00db, B:85:0x00df, B:86:0x0103, B:87:0x00a0, B:89:0x00a4, B:90:0x00c8, B:91:0x0050), top: B:4:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00c8 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:5:0x000d, B:7:0x0011, B:8:0x0023, B:10:0x0033, B:12:0x0036, B:14:0x003c, B:16:0x003f, B:17:0x0041, B:19:0x0047, B:21:0x004d, B:22:0x0052, B:24:0x0056, B:26:0x005a, B:27:0x008e, B:29:0x0095, B:31:0x0099, B:32:0x00ac, B:33:0x00ae, B:35:0x00b2, B:36:0x00b9, B:38:0x00bd, B:40:0x00c1, B:41:0x00ca, B:43:0x00d0, B:45:0x00d4, B:46:0x00e7, B:47:0x00e9, B:49:0x00ed, B:50:0x00f4, B:52:0x00f8, B:54:0x00fc, B:55:0x0105, B:83:0x00db, B:85:0x00df, B:86:0x0103, B:87:0x00a0, B:89:0x00a4, B:90:0x00c8, B:91:0x0050), top: B:4:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void e() {
        int[] subscriptionIds;
        int[] subscriptionIds2;
        boolean isValidSubscriptionId;
        boolean isValidSubscriptionId2;
        boolean isValidSubscriptionId3;
        TelephonyManager createForSubscriptionId;
        TelephonyManager telephonyManager;
        Executor executor;
        TelephonyManager createForSubscriptionId2;
        TelephonyManager telephonyManager2;
        Executor executor2;
        boolean isValidSubscriptionId4;
        this.A = System.currentTimeMillis();
        if (this.f4937i) {
            boolean z7 = false;
            try {
                if (this.f4942n == null) {
                    this.f4942n = com.baidu.location.c.a.c.a(this.f4951w.getSystemService("telephony_subscription_service"));
                }
                subscriptionIds = this.f4942n.getSubscriptionIds(0);
                subscriptionIds2 = this.f4942n.getSubscriptionIds(1);
                int i8 = -1;
                int i9 = (subscriptionIds == null || subscriptionIds.length <= 0) ? -1 : subscriptionIds[0];
                if (subscriptionIds2 != null && subscriptionIds2.length > 0) {
                    i8 = subscriptionIds2[0];
                }
                isValidSubscriptionId = SubscriptionManager.isValidSubscriptionId(i9);
                if (isValidSubscriptionId) {
                    isValidSubscriptionId4 = SubscriptionManager.isValidSubscriptionId(i8);
                    if (isValidSubscriptionId4) {
                        this.C = true;
                        if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                            com.baidu.location.c.i.i().a("getCellInfo: subId0 = " + i9 + ", subId1 = " + i8 + ", mLastSubId0 = " + this.G + ", mLastSubId1 = " + this.H);
                        }
                        isValidSubscriptionId2 = SubscriptionManager.isValidSubscriptionId(i9);
                        RunnableC0049a runnableC0049a = null;
                        if (isValidSubscriptionId2) {
                            this.f4940l = null;
                        } else {
                            if (this.f4940l == null) {
                                createForSubscriptionId2 = this.f4939k.createForSubscriptionId(i9);
                            } else {
                                if (this.G != i9) {
                                    this.f4940l = null;
                                    createForSubscriptionId2 = this.f4939k.createForSubscriptionId(i9);
                                }
                                if (this.f4949u == null) {
                                    this.f4949u = new c(this, runnableC0049a);
                                }
                                telephonyManager2 = this.f4940l;
                                if (telephonyManager2 != null && (executor2 = this.f4946r) != null) {
                                    telephonyManager2.requestCellInfoUpdate(executor2, this.f4949u);
                                    z7 = true;
                                }
                            }
                            this.f4940l = createForSubscriptionId2;
                            if (this.f4949u == null) {
                            }
                            telephonyManager2 = this.f4940l;
                            if (telephonyManager2 != null) {
                                telephonyManager2.requestCellInfoUpdate(executor2, this.f4949u);
                                z7 = true;
                            }
                        }
                        isValidSubscriptionId3 = SubscriptionManager.isValidSubscriptionId(i8);
                        if (isValidSubscriptionId3) {
                            this.f4941m = null;
                        } else {
                            if (this.f4941m == null) {
                                createForSubscriptionId = this.f4939k.createForSubscriptionId(i8);
                            } else {
                                if (this.H != i8) {
                                    this.f4941m = null;
                                    createForSubscriptionId = this.f4939k.createForSubscriptionId(i8);
                                }
                                if (this.f4950v == null) {
                                    this.f4950v = new d(this, runnableC0049a);
                                }
                                telephonyManager = this.f4941m;
                                if (telephonyManager != null && (executor = this.f4946r) != null) {
                                    telephonyManager.requestCellInfoUpdate(executor, this.f4950v);
                                    z7 = true;
                                }
                            }
                            this.f4941m = createForSubscriptionId;
                            if (this.f4950v == null) {
                            }
                            telephonyManager = this.f4941m;
                            if (telephonyManager != null) {
                                telephonyManager.requestCellInfoUpdate(executor, this.f4950v);
                                z7 = true;
                            }
                        }
                        this.G = i9;
                        this.H = i8;
                    }
                }
                this.C = false;
                if (com.baidu.location.c.c.a.f4999a) {
                    com.baidu.location.c.i.i().a("getCellInfo: subId0 = " + i9 + ", subId1 = " + i8 + ", mLastSubId0 = " + this.G + ", mLastSubId1 = " + this.H);
                }
                isValidSubscriptionId2 = SubscriptionManager.isValidSubscriptionId(i9);
                RunnableC0049a runnableC0049a2 = null;
                if (isValidSubscriptionId2) {
                }
                isValidSubscriptionId3 = SubscriptionManager.isValidSubscriptionId(i8);
                if (isValidSubscriptionId3) {
                }
                this.G = i9;
                this.H = i8;
            } catch (Exception e8) {
                if (com.baidu.location.c.c.a.f4999a) {
                    e8.printStackTrace();
                }
            }
        }
        f();
        synchronized (this.I) {
            try {
                try {
                    if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                        com.baidu.location.c.i.i().a("start waiting update to finish");
                    }
                    int i10 = this.f4935g.get();
                    if (i10 != 0) {
                        this.I.wait(i10);
                    }
                } catch (InterruptedException e9) {
                    if (com.baidu.location.c.c.a.f4999a) {
                        e9.printStackTrace();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        TelephonyManager telephonyManager;
        if (this.f4952x) {
            try {
                e eVar = this.f4947s;
                if (eVar != null && (telephonyManager = this.f4939k) != null) {
                    telephonyManager.listen(eVar, 0);
                }
                this.f4947s = null;
                this.f4939k = null;
                this.f4940l = null;
                this.f4941m = null;
                List<com.baidu.location.c.b> list = this.f4945q;
                if (list != null) {
                    list.clear();
                    this.f4945q = null;
                }
                if (this.f4938j) {
                    i();
                }
            } catch (Exception e8) {
                if (com.baidu.location.c.c.a.f4999a) {
                    e8.printStackTrace();
                }
            }
            if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                com.baidu.location.c.i.i().a("cell manager stop ...");
            }
            this.f4952x = false;
        }
    }

    private com.baidu.location.c.b a(CellLocation cellLocation) {
        return a(cellLocation, false);
    }

    public void b(int i8) {
        this.f4933e = i8;
    }

    private com.baidu.location.c.b a(CellLocation cellLocation, boolean z7) {
        int i8;
        if (cellLocation == null || this.f4939k == null) {
            return null;
        }
        if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
            com.baidu.location.c.i.i().a("set cell info..");
        }
        com.baidu.location.c.b bVar = new com.baidu.location.c.b();
        bVar.f4994m = 1;
        if (z7) {
            bVar.f4998q = true;
        }
        bVar.f4988g = System.currentTimeMillis();
        try {
            String networkOperator = this.f4939k.getNetworkOperator();
            if (networkOperator != null && networkOperator.length() > 0) {
                if (networkOperator.length() >= 3) {
                    i8 = Integer.valueOf(networkOperator.substring(0, 3)).intValue();
                    bVar.f4984c = i8 < 0 ? this.f4943o.f4984c : i8;
                } else {
                    i8 = -1;
                }
                String substring = networkOperator.substring(3);
                if (substring != null) {
                    char[] charArray = substring.toCharArray();
                    int i9 = 0;
                    while (i9 < charArray.length && Character.isDigit(charArray[i9])) {
                        i9++;
                    }
                    i8 = Integer.valueOf(substring.substring(0, i9)).intValue();
                }
                if (i8 < 0) {
                    i8 = this.f4943o.f4985d;
                }
                bVar.f4985d = i8;
            }
            this.f4953y = this.f4939k.getSimState();
            if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                com.baidu.location.c.i.i().a("sim state:" + this.f4953y);
            }
        } catch (Exception e8) {
            if (com.baidu.location.c.c.a.f4999a) {
                e8.printStackTrace();
            }
            f4932d = 1;
        }
        if (cellLocation instanceof GsmCellLocation) {
            bVar.f4982a = ((GsmCellLocation) cellLocation).getLac();
            bVar.f4983b = r10.getCid();
            bVar.f4990i = 'g';
            if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                com.baidu.location.c.i.i().a("bslocation mNetworkType = 'g'");
            }
        } else if (cellLocation instanceof CdmaCellLocation) {
            bVar.f4990i = 'c';
            boolean z8 = com.baidu.location.c.c.a.f4999a;
            if (z8 && com.baidu.location.c.c.a.f5000b) {
                com.baidu.location.c.i.i().a("bslocation mNetworkType = 'c'");
            }
            if (f4931c == null) {
                try {
                    f4931c = Class.forName("android.telephony.cdma.CdmaCellLocation");
                } catch (Exception unused) {
                    f4931c = null;
                    return bVar;
                }
            }
            Class<?> cls = f4931c;
            if (cls != null && cls.isInstance(cellLocation)) {
                try {
                    int systemId = ((CdmaCellLocation) cellLocation).getSystemId();
                    if (systemId < 0) {
                        systemId = this.f4943o.f4985d;
                    }
                    bVar.f4985d = systemId;
                    bVar.f4983b = ((CdmaCellLocation) cellLocation).getBaseStationId();
                    bVar.f4982a = ((CdmaCellLocation) cellLocation).getNetworkId();
                    int baseStationLatitude = ((CdmaCellLocation) cellLocation).getBaseStationLatitude();
                    if (z8 && com.baidu.location.c.c.a.f5000b) {
                        com.baidu.location.c.i.i().a("bslocation lat " + (baseStationLatitude / 14400.0d));
                    }
                    if (baseStationLatitude < Integer.MAX_VALUE) {
                        bVar.f4986e = baseStationLatitude;
                    }
                    int baseStationLongitude = ((CdmaCellLocation) cellLocation).getBaseStationLongitude();
                    if (z8 && com.baidu.location.c.c.a.f5000b) {
                        com.baidu.location.c.i.i().a("bslocation lon" + (baseStationLongitude / 14400.0d));
                    }
                    if (baseStationLongitude < Integer.MAX_VALUE) {
                        bVar.f4987f = baseStationLongitude;
                    }
                } catch (Exception e9) {
                    if (com.baidu.location.c.c.a.f4999a) {
                        e9.printStackTrace();
                    }
                    f4932d = 3;
                    return bVar;
                }
            }
        }
        g(bVar);
        return bVar;
    }

    public void b(boolean z7) {
        this.f4938j = z7;
    }

    public com.baidu.location.c.b a(com.baidu.location.c.b bVar, TelephonyManager telephonyManager) {
        if (Integer.valueOf(Build.VERSION.SDK_INT).intValue() < 17) {
            return null;
        }
        try {
            List<com.baidu.location.c.b> a8 = a(telephonyManager, bVar);
            if (a8 == null || a8.isEmpty()) {
                if (!com.baidu.location.c.c.a.f4999a || !com.baidu.location.c.c.a.f5000b) {
                    return null;
                }
                com.baidu.location.c.i.i().a("getAllCellInfo=null");
                return null;
            }
            com.baidu.location.c.b bVar2 = null;
            for (com.baidu.location.c.b bVar3 : a8) {
                if (bVar3.f4992k) {
                    boolean z7 = bVar2 != null;
                    if (bVar3.b()) {
                        if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                            com.baidu.location.c.i.i().a(" cell res.isValid() = " + f(bVar3));
                        }
                        if (z7 && bVar2 != null) {
                            bVar2.f4995n = e(bVar3);
                            bVar2.f4996o = f(bVar3);
                        }
                    } else {
                        if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                            com.baidu.location.c.i.i().a("res.isValid()");
                        }
                        bVar3 = null;
                    }
                    if (bVar2 == null) {
                        bVar2 = bVar3;
                    }
                }
            }
            return bVar2;
        } catch (Throwable th) {
            if (!com.baidu.location.c.c.a.f4999a) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    public String a(com.baidu.location.c.b bVar) {
        String d8;
        int intValue;
        String str = "";
        try {
            d8 = d(bVar);
            intValue = Integer.valueOf(Build.VERSION.SDK_INT).intValue();
            if (d8 != null && !"".equals(d8)) {
                if (!"&nc=".equals(d8)) {
                    return d8;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (intValue >= 17) {
            return d8;
        }
        str = d8;
        if (str == null || !"&nc=".equals(str)) {
            return str;
        }
        return null;
    }

    private synchronized List<com.baidu.location.c.b> a(TelephonyManager telephonyManager, com.baidu.location.c.b bVar) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.J > this.M.get()) {
                ArrayList arrayList = new ArrayList();
                try {
                    this.f4953y = telephonyManager.getSimState();
                    List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
                    if (allCellInfo != null && !allCellInfo.isEmpty()) {
                        Iterator<CellInfo> it = allCellInfo.iterator();
                        while (it.hasNext()) {
                            com.baidu.location.c.b a8 = a(it.next(), bVar, telephonyManager);
                            if (a8 != null) {
                                arrayList.add(a8);
                            }
                        }
                    }
                    this.L = allCellInfo;
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                this.J = currentTimeMillis;
                this.K = arrayList;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.K;
    }

    public void a(int i8) {
        this.f4935g.set(i8);
    }

    public void a(Context context) {
        e eVar;
        Executor mainExecutor;
        if (this.f4952x) {
            return;
        }
        this.f4951w = context;
        this.f4939k = (TelephonyManager) context.getSystemService("phone");
        this.f4945q = new LinkedList();
        if (Looper.myLooper() != null) {
            this.f4947s = new e();
        }
        if (this.F == null) {
            this.F = new Handler(Looper.getMainLooper());
        }
        if (this.f4938j) {
            h();
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= this.f4933e) {
            if (this.f4946r == null) {
                mainExecutor = this.f4951w.getMainExecutor();
                this.f4946r = mainExecutor;
            }
            this.f4954z = com.baidu.location.c.c.b.a("android.telephony.TelephonyManager$CellInfoCallback");
            if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
                com.baidu.location.c.i.i().a("isCellinfoCallbackExist = " + this.f4954z);
            }
        }
        TelephonyManager telephonyManager = this.f4939k;
        if (telephonyManager == null || (eVar = this.f4947s) == null) {
            return;
        }
        if (i8 < this.f4933e || !this.f4954z) {
            try {
                telephonyManager.listen(eVar, 1280);
            } catch (Exception unused) {
            }
        }
        if (com.baidu.location.c.c.a.f4999a && com.baidu.location.c.c.a.f5000b) {
            com.baidu.location.c.i.i().a("cell manager start...");
        }
        this.f4952x = true;
    }

    public void a(boolean z7) {
        this.f4937i = z7;
    }

    public boolean a(com.baidu.location.c.b bVar, com.baidu.location.c.b bVar2) {
        boolean z7;
        if (bVar == null && bVar2 == null) {
            return false;
        }
        if (bVar == null || bVar2 == null) {
            return true;
        }
        float abs = Math.abs(bVar.f4989h - bVar2.f4989h);
        int i8 = bVar.f4989h;
        if (i8 == 0) {
            i8 = -1;
        }
        float f8 = abs / i8;
        boolean z8 = com.baidu.location.c.c.a.f4999a;
        if (z8 && com.baidu.location.c.c.a.f5000b) {
            com.baidu.location.c.i.i().a("cl-cache, str, old:" + bVar.f4989h + " new:" + bVar2.f4989h);
            com.baidu.location.c.g i9 = com.baidu.location.c.i.i();
            StringBuilder sb = new StringBuilder();
            sb.append("cl-cache, str, diffRate:");
            sb.append(f8);
            i9.a(sb.toString());
        }
        String str = bVar.f4995n;
        if (str != null && bVar2.f4995n != null) {
            if (Math.abs(Math.abs(r9 - a(bVar2.f4995n)) / (a(str) != 0 ? r9 : -1)) > this.f4936h) {
                z7 = true;
                if (z8 && com.baidu.location.c.c.a.f5000b) {
                    com.baidu.location.c.i.i().a("cl-cache, isStrengthChange2:" + z7);
                }
                return f8 <= this.f4936h || z7;
            }
        }
        z7 = false;
        if (z8) {
            com.baidu.location.c.i.i().a("cl-cache, isStrengthChange2:" + z7);
        }
        if (f8 <= this.f4936h) {
        }
    }
}
