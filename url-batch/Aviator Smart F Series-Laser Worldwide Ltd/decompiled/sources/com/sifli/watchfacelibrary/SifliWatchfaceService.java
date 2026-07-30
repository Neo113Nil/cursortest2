package com.sifli.watchfacelibrary;

import android.app.IntentService;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.crrepa.x1.f;
import com.crrepa.x1.g;
import com.crrepa.x1.i;
import com.crrepa.x1.j;
import com.sifli.serialtransport.serialTransService;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class SifliWatchfaceService extends IntentService implements com.crrepa.x1.d {
    private static final String C = "com.sifli.watchfacelibrary.action.WATCHFACE";
    private static final String D = "com.sifli.watchfacelibrary.action.WATCHFACE.MKII";
    private static final String E = "com.sifli.watchfacelibrary.extra.DATA";
    private static final String F = "com.sifli.watchfacelibrary.extra.TYPE";
    private static final String G = "com.sifli.watchfacelibrary.extra.ADDRESS";
    private static final String H = "com.sifli.watchfacelibrary.extra.URI";
    private static final String I = "com.sifli.watchfacelibrary.extra.PATH";
    private static final String J = "com.sifli.watchfacelibrary.extra.ADD_ALIGN";
    public static final String K = "com.sifli.watchfacelibrary.broadcast.BROADCAST_WATCHFACE_STATE";
    public static final String L = "com.sifli.watchfacelibrary.broadcast.BROADCAST_PROGRESS";
    public static final String M = "com.sifli.watchfacelibrary.broadcast.BROADCAST_LOG";
    public static final String N = "Sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_STATE";
    public static final String O = "Sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_PROGRESS";
    public static final String P = "Sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_RESPONSE";
    public static final String Q = "com.sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_LOG";
    private static final String R = "watchfaceService";
    private static final int S = 4;
    private static final int T = 4;
    public static final int U = 0;
    public static final int V = 1;
    public static final int W = 2;
    public static final int X = 3;
    public static final int Y = 4;
    public static final int Z = 5;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f16564a0 = 6;

    /* renamed from: b0, reason: collision with root package name */
    private static final int f16565b0 = 60000;

    /* renamed from: c0, reason: collision with root package name */
    private static final int f16566c0 = 60000;

    /* renamed from: d0, reason: collision with root package name */
    private static final int f16567d0 = 4096;

    /* renamed from: e0, reason: collision with root package name */
    private static final int f16568e0 = 1024;

    /* renamed from: f0, reason: collision with root package name */
    private static int f16569f0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    private static int f16570g0 = 0;

    /* renamed from: h0, reason: collision with root package name */
    private static final int f16571h0 = 0;

    /* renamed from: i0, reason: collision with root package name */
    private static final int f16572i0 = 1;

    /* renamed from: j0, reason: collision with root package name */
    private static int f16573j0 = 0;

    /* renamed from: k0, reason: collision with root package name */
    private static int f16574k0 = 0;

    /* renamed from: l0, reason: collision with root package name */
    private static int f16575l0 = 0;

    /* renamed from: m0, reason: collision with root package name */
    private static int f16576m0 = 0;

    /* renamed from: n0, reason: collision with root package name */
    private static long f16577n0 = 0;

    /* renamed from: o0, reason: collision with root package name */
    private static long f16578o0 = 0;

    /* renamed from: p0, reason: collision with root package name */
    private static Intent f16579p0 = null;

    /* renamed from: q0, reason: collision with root package name */
    private static WatchfaceView f16580q0 = null;

    /* renamed from: r0, reason: collision with root package name */
    private static com.crrepa.x1.d f16581r0 = null;

    /* renamed from: s0, reason: collision with root package name */
    static boolean f16582s0 = false;

    /* renamed from: t0, reason: collision with root package name */
    private static boolean f16583t0 = false;

    /* renamed from: u0, reason: collision with root package name */
    private static int f16584u0;
    private final Runnable A;
    private BroadcastReceiver B;

    /* renamed from: a, reason: collision with root package name */
    private serialTransService.g f16585a;

    /* renamed from: b, reason: collision with root package name */
    private int f16586b;

    /* renamed from: c, reason: collision with root package name */
    private int f16587c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16588d;

    /* renamed from: e, reason: collision with root package name */
    private int f16589e;

    /* renamed from: f, reason: collision with root package name */
    private int f16590f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16591g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16592h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f16593i;

    /* renamed from: j, reason: collision with root package name */
    private int f16594j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16595k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f16596l;

    /* renamed from: m, reason: collision with root package name */
    ArrayList<String> f16597m;

    /* renamed from: n, reason: collision with root package name */
    ArrayList<String> f16598n;

    /* renamed from: o, reason: collision with root package name */
    private Handler f16599o;

    /* renamed from: p, reason: collision with root package name */
    int f16600p;

    /* renamed from: q, reason: collision with root package name */
    long f16601q;

    /* renamed from: r, reason: collision with root package name */
    int f16602r;

    /* renamed from: s, reason: collision with root package name */
    int f16603s;

    /* renamed from: t, reason: collision with root package name */
    String f16604t;

    /* renamed from: u, reason: collision with root package name */
    int f16605u;

    /* renamed from: v, reason: collision with root package name */
    int f16606v;

    /* renamed from: w, reason: collision with root package name */
    boolean f16607w;

    /* renamed from: x, reason: collision with root package name */
    private final Runnable f16608x;

    /* renamed from: y, reason: collision with root package name */
    private final ServiceConnection f16609y;

    /* renamed from: z, reason: collision with root package name */
    private final Runnable f16610z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.d(SifliWatchfaceService.R, "wait abort send");
            SifliWatchfaceService sifliWatchfaceService = SifliWatchfaceService.this;
            sifliWatchfaceService.f16607w = true;
            synchronized (sifliWatchfaceService.f16593i) {
                SifliWatchfaceService.this.f16593i.notifyAll();
            }
        }
    }

    class b implements ServiceConnection {

        class a implements l4.a {
            a() {
            }

            @Override // l4.a
            public void a() {
                synchronized (SifliWatchfaceService.this.f16593i) {
                    SifliWatchfaceService.this.f16593i.notifyAll();
                }
            }

            @Override // l4.a
            public void b(int i8) {
                if (i8 == 0 && !SifliWatchfaceService.this.f16591g) {
                    SifliWatchfaceService.this.f16591g = true;
                    synchronized (SifliWatchfaceService.this.f16593i) {
                        SifliWatchfaceService.this.f16593i.notifyAll();
                    }
                }
            }

            @Override // l4.a
            public void c(int i8) {
                SifliWatchfaceService.a(i8);
                int i9 = (int) ((SifliWatchfaceService.f16577n0 * 100) / SifliWatchfaceService.f16578o0);
                if (SifliWatchfaceService.f16583t0) {
                    Log.d(SifliWatchfaceService.R, "progress " + i9);
                    Log.d(SifliWatchfaceService.R, "progress " + SifliWatchfaceService.f16577n0 + ", " + SifliWatchfaceService.f16578o0);
                }
                if (i9 == SifliWatchfaceService.f16584u0) {
                    return;
                }
                int unused = SifliWatchfaceService.f16584u0 = i9;
                SifliWatchfaceService.this.d(i9);
            }

            @Override // l4.a
            public void d(int i8) {
                if (i8 == 23) {
                    Log.d(SifliWatchfaceService.R, "onSerialMTUChangeResult use short packet");
                    SifliWatchfaceService.this.f16586b = 1024;
                }
                SifliWatchfaceService.this.f16598n.clear();
                SifliWatchfaceService.this.f16598n.add("V23");
                String str = Build.MODEL;
                if (str.length() > 3) {
                    str = str.substring(0, 3);
                }
                if (SifliWatchfaceService.this.f16598n.contains(str)) {
                    Log.w(SifliWatchfaceService.R, "use short packet for issue list");
                    SifliWatchfaceService.this.f16586b = 1024;
                }
                Log.i(SifliWatchfaceService.R, "packet len final " + SifliWatchfaceService.this.f16586b);
            }

            @Override // l4.a
            public void e(int i8) {
                SifliWatchfaceService.this.f16592h = true;
                if (i8 == 132) {
                    SifliWatchfaceService.this.f16594j = i8;
                }
                synchronized (SifliWatchfaceService.this.f16593i) {
                    SifliWatchfaceService.this.f16593i.notifyAll();
                }
            }

            @Override // l4.a
            public void a(int i8) {
                if (i8 == 0) {
                    SifliWatchfaceService.this.f();
                    SifliWatchfaceService.this.f16594j = 6;
                    synchronized (SifliWatchfaceService.this.f16593i) {
                        SifliWatchfaceService.this.f16593i.notifyAll();
                    }
                }
            }

            @Override // l4.a
            public void a(int i8, byte[] bArr) {
                if (i8 == 4) {
                    byte b8 = bArr[0];
                    if (b8 == 1) {
                        SifliWatchfaceService.this.a(bArr);
                        return;
                    }
                    if (b8 == 3) {
                        SifliWatchfaceService.this.f(bArr);
                        return;
                    }
                    if (b8 == 5) {
                        SifliWatchfaceService.this.b(bArr);
                        return;
                    }
                    if (b8 == 7) {
                        SifliWatchfaceService.this.c(bArr);
                        return;
                    }
                    if (b8 == 14) {
                        SifliWatchfaceService.this.d(bArr);
                    } else if (b8 == 9) {
                        SifliWatchfaceService.this.g(bArr);
                    } else {
                        if (b8 != 10) {
                            return;
                        }
                        SifliWatchfaceService.this.e(bArr);
                    }
                }
            }
        }

        b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d(SifliWatchfaceService.R, "onServiceConnected, " + componentName.toString());
            SifliWatchfaceService.this.f16585a = (serialTransService.g) iBinder;
            serialTransService a8 = SifliWatchfaceService.this.f16585a.a();
            SifliWatchfaceService.this.f16596l = true;
            synchronized (SifliWatchfaceService.this.f16593i) {
                SifliWatchfaceService.this.f16593i.notifyAll();
            }
            a8.a(new a());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d(SifliWatchfaceService.R, "onServiceDisconnected" + componentName.toString());
            SifliWatchfaceService.this.f16596l = false;
            SifliWatchfaceService.this.f16594j = 4;
            synchronized (SifliWatchfaceService.this.f16593i) {
                SifliWatchfaceService.this.f16593i.notifyAll();
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.e(SifliWatchfaceService.R, "start serial trans overtime!");
            SifliWatchfaceService.this.f16594j = 1;
            synchronized (SifliWatchfaceService.this.f16593i) {
                SifliWatchfaceService.this.f16593i.notifyAll();
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.e(SifliWatchfaceService.R, "serial trans command overtime!");
            SifliWatchfaceService.this.f16594j = 3;
            synchronized (SifliWatchfaceService.this.f16593i) {
                SifliWatchfaceService.this.f16593i.notifyAll();
            }
        }
    }

    class e extends BroadcastReceiver {
        e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE) != 10) {
                return;
            }
            Log.e(SifliWatchfaceService.R, "Bluetooth off");
            SifliWatchfaceService.this.f16594j = 5;
            synchronized (SifliWatchfaceService.this.f16593i) {
                SifliWatchfaceService.this.f16593i.notifyAll();
            }
        }
    }

    public SifliWatchfaceService() {
        super("SifliWatchfaceService");
        this.f16586b = 4096;
        this.f16588d = false;
        this.f16593i = new Object();
        this.f16596l = false;
        this.f16597m = new ArrayList<>();
        this.f16598n = new ArrayList<>();
        this.f16599o = new Handler();
        this.f16603s = 0;
        this.f16607w = false;
        this.f16608x = new a();
        this.f16609y = new b();
        this.f16610z = new c();
        this.A = new d();
        this.B = new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f16596l) {
            this.f16596l = false;
            unbindService(this.f16609y);
            stopService(new Intent(this, (Class<?>) serialTransService.class));
        }
    }

    public static com.crrepa.x1.d g() {
        return f16581r0;
    }

    private String h(byte[] bArr) {
        String str = getCacheDir() + "/zip";
        File file = new File(str);
        com.crrepa.x1.c.a(str, false);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str + "/wf.zip");
        Log.d(R, "ss " + (str + "/wf.zip"));
        try {
            file2.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e8) {
            e8.printStackTrace();
        }
        String str2 = getCacheDir() + "/zip/wf.zip";
        if (new File(str2).exists()) {
            Log.d(R, "save file success");
            return str2;
        }
        Log.d(R, "not exits");
        return null;
    }

    private void i() {
        this.f16597m.clear();
        this.f16597m.add("LLD");
        this.f16597m.add("PRA");
        this.f16597m.add("VCE");
        this.f16597m.add("MAR");
        String str = Build.MODEL;
        if (str.length() > 3) {
            str = str.substring(0, 3);
        }
        Log.e(R, "model " + str);
        if (this.f16597m.contains(str)) {
            Log.w(R, "sendDfuBlankData");
            for (int i8 = 0; i8 < 5; i8++) {
                this.f16585a.e();
            }
        }
    }

    private void j() {
        Log.d(R, "sendWatchfaceEnd");
        byte[] bArr = new byte[4];
        this.f16603s = 1;
        a("sendWatchfaceEnd");
        j.b(6, bArr, 0);
        j.b(0, bArr, 2);
        this.f16585a.a(bArr, 4);
        this.f16588d = false;
        this.f16599o.postDelayed(this.A, 60000L);
        synchronized (this.f16593i) {
            while (!this.f16588d && this.f16594j == 0) {
                try {
                    this.f16593i.wait();
                } catch (InterruptedException e8) {
                    e8.printStackTrace();
                }
            }
        }
        this.f16599o.removeCallbacks(this.A);
    }

    private void k() {
        Log.d(R, "sendWatchfaceLoseCheckRsp");
        byte[] bArr = new byte[4];
        j.b(11, bArr, 0);
        j.b(0, bArr, 2);
        this.f16585a.a(bArr, 4);
    }

    private void l() {
        Log.d(R, "sendWatchfaceTotalEnd");
        byte[] bArr = new byte[4];
        j.b(8, bArr, 0);
        j.b(0, bArr, 2);
        this.f16585a.a(bArr, 4);
        this.f16588d = false;
        this.f16599o.postDelayed(this.A, 60000L);
        synchronized (this.f16593i) {
            while (!this.f16588d && this.f16594j == 0) {
                try {
                    this.f16593i.wait();
                } catch (InterruptedException e8) {
                    e8.printStackTrace();
                }
            }
        }
        this.f16599o.removeCallbacks(this.A);
    }

    private void m() {
        if (this.f16595k) {
            this.f16595k = false;
            unregisterReceiver(this.B);
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        Log.d(R, "version " + j.f14036a);
        this.f16602r = 0;
        f16581r0 = this;
        this.f16594j = 0;
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        Log.e(R, "onDestroy");
        super.onDestroy();
        f16581r0 = null;
        this.f16594j = 101;
        synchronized (this.f16593i) {
            this.f16593i.notifyAll();
        }
        f16580q0 = null;
        m();
        f();
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (C.equals(action)) {
                Log.d(R, "watchface");
                h();
                a(intent.getStringExtra(G), intent.getParcelableArrayListExtra(E), intent.getIntExtra(F, 0));
                return;
            }
            if (D.equals(action)) {
                h();
                String stringExtra = intent.getStringExtra(G);
                int intExtra = intent.getIntExtra(F, 0);
                Uri uri = (Uri) intent.getParcelableExtra(H);
                String stringExtra2 = intent.getStringExtra(I);
                byte[] byteArrayExtra = intent.getByteArrayExtra(E);
                int intExtra2 = intent.getIntExtra(J, 0);
                Log.i(R, "type " + intExtra + ", addAlignAndCRC " + intExtra2);
                if (stringExtra2 != null) {
                    Log.d(R, "get path");
                } else if (uri != null) {
                    Log.d(R, "get uri");
                    stringExtra2 = a(this, uri);
                } else if (byteArrayExtra == null) {
                    Log.e(R, "uri, path and zip data are null");
                    e(8);
                    return;
                } else {
                    Log.d(R, "get zip data");
                    stringExtra2 = h(byteArrayExtra);
                }
                Log.d(R, "zip path: " + stringExtra2);
                if (stringExtra2 == null) {
                    e(8);
                    return;
                }
                String str = getCacheDir() + "/wf";
                Log.d(R, "new path: " + str);
                File file = new File(str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                com.crrepa.x1.c.a(str, false);
                this.f16604t = com.crrepa.x1.c.a(stringExtra2);
                Log.i(R, "wf md5 " + this.f16604t);
                com.crrepa.x1.c.a(stringExtra2, str);
                ArrayList<i> a8 = a(str, new ArrayList<>());
                if (a8 == null) {
                    e(8);
                    return;
                }
                if (intExtra == 3 || intExtra == 4) {
                    b(a8);
                } else if (intExtra2 == 1) {
                    b(a8, intExtra);
                }
                f16578o0 = 0L;
                Iterator<i> it = a8.iterator();
                while (it.hasNext()) {
                    f16578o0 += it.next().b().length;
                }
                Collections.sort(a8, new f());
                Log.d(R, "watchfaceFile size " + a8.size() + ", all files len " + f16578o0);
                if (f16578o0 == 0) {
                    Log.e(R, "file is null");
                    e(9);
                } else {
                    f16570g0 = 0;
                    a(stringExtra, a8, intExtra);
                }
            }
        }
    }

    private void c(int i8) {
        Log.d(R, "sendWatchfaceInfoReq");
        byte[] bArr = new byte[8];
        j.b(13, bArr, 0);
        j.b(4, bArr, 2);
        j.a(i8, bArr, 4);
        this.f16585a.a(bArr, 4);
        this.f16588d = false;
        this.f16599o.postDelayed(this.A, 60000L);
        synchronized (this.f16593i) {
            while (!this.f16588d && this.f16594j == 0) {
                try {
                    this.f16593i.wait();
                } catch (InterruptedException e8) {
                    e8.printStackTrace();
                }
            }
        }
        this.f16599o.removeCallbacks(this.A);
    }

    private void f(int i8) {
        byte[] bArr = new byte[11];
        j.b(0, bArr, 0);
        j.b(7, bArr, 2);
        j.b(i8, bArr, 4);
        bArr[6] = 2;
        j.a((int) f16578o0, bArr, 7);
        Log.d(R, "sendWatchfaceTotalStart " + i8 + ", file len " + f16578o0);
        a("sendWatchfaceTotalStart type " + i8 + ", file len " + f16578o0);
        this.f16585a.a(bArr, 4);
        this.f16588d = false;
        this.f16599o.postDelayed(this.A, 60000L);
        synchronized (this.f16593i) {
            while (!this.f16588d && this.f16594j == 0) {
                try {
                    this.f16593i.wait();
                } catch (InterruptedException e8) {
                    e8.printStackTrace();
                }
            }
        }
        this.f16599o.removeCallbacks(this.A);
    }

    private void h() {
        registerReceiver(this.B, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        this.f16595k = true;
    }

    private void i(byte[] bArr) {
        Log.d(R, "sendWatchfaceData");
        if (bArr.length > this.f16586b) {
            f16573j0 = 0;
            f16575l0 = 0;
            this.f16587c = 1;
            f16574k0 = bArr.length;
            int i8 = 0;
            int i9 = 0;
            while (i8 != bArr.length) {
                i9++;
                int min = Math.min(bArr.length - i8, this.f16586b);
                byte[] bArr2 = new byte[min + 8];
                j.b(4, bArr2, 0);
                j.b(min + 4, bArr2, 2);
                j.a(i9, bArr2, 4);
                System.arraycopy(bArr, i8, bArr2, 8, min);
                i8 += min;
                f16575l0 = min;
                this.f16585a.a(bArr2, 4);
                this.f16588d = false;
                synchronized (this.f16593i) {
                    while (!this.f16588d && this.f16594j == 0) {
                        try {
                            this.f16593i.wait();
                        } catch (InterruptedException e8) {
                            e8.printStackTrace();
                        }
                    }
                }
                f16573j0 = i8;
                if (this.f16589e != 0) {
                    if (this.f16590f == 4) {
                        this.f16594j = 0;
                    }
                }
            }
            return;
        }
        this.f16587c = 0;
        byte[] bArr3 = new byte[bArr.length + 8];
        j.b(4, bArr3, 0);
        j.b(bArr.length + 4, bArr3, 2);
        j.a(0, bArr3, 4);
        System.arraycopy(bArr, 0, bArr3, 8, bArr.length);
        this.f16585a.a(bArr3, 4);
        this.f16588d = false;
        synchronized (this.f16593i) {
            while (!this.f16588d && this.f16594j == 0) {
                try {
                    this.f16593i.wait();
                } catch (InterruptedException e9) {
                    e9.printStackTrace();
                }
            }
        }
        if (this.f16589e == 0) {
            return;
        }
        this.f16594j = 2;
    }

    private void j(byte[] bArr) {
        Log.d(R, "sendWatchfaceDataExt");
        f16574k0 = bArr.length;
        f16573j0 = 0;
        Log.d(R, "mMaxPartLen " + this.f16586b);
        com.crrepa.x1.b bVar = new com.crrepa.x1.b(bArr, this.f16586b);
        int a8 = bVar.a();
        int i8 = 0;
        int i9 = 0;
        while (i8 < a8) {
            if (a8 == 1) {
                this.f16587c = 0;
            } else {
                this.f16587c = 1;
            }
            int i10 = f16576m0;
            for (int i11 = 0; i11 < i8; i11++) {
                i10 += bVar.a(i11).length;
            }
            if (f16583t0) {
                Log.d(R, "mAlreadySendLen " + i10);
            }
            f16577n0 = i10;
            int length = bVar.a(i8).length;
            byte[] bArr2 = new byte[length + 8];
            j.b(4, bArr2, 0);
            j.b(length + 4, bArr2, 2);
            j.a(i8 + 1, bArr2, 4);
            System.arraycopy(bArr, i9, bArr2, 8, length);
            i9 += length;
            this.f16585a.b(bArr2, 4);
            this.f16588d = false;
            synchronized (this.f16593i) {
                while (!this.f16588d && this.f16594j == 0) {
                    try {
                        this.f16593i.wait();
                    } catch (InterruptedException e8) {
                        e8.printStackTrace();
                    }
                }
            }
            int i12 = this.f16589e;
            if (i12 == 0) {
                f16573j0 = i9;
            } else {
                if (i12 != 4 && i12 != 7) {
                    this.f16594j = 2;
                    return;
                }
                Log.w(R, "index error, continue with " + this.f16590f);
                i9 -= length;
                i8 = this.f16590f - 2;
                this.f16594j = 0;
            }
            if (this.f16594j != 0) {
                Log.w(R, "download interrupt with " + this.f16594j);
                return;
            }
            i8++;
        }
    }

    void d(int i8) {
        if (f16583t0) {
            Log.d(R, "sendWatchfaceProgress " + i8);
        }
        if (f16580q0 != null) {
            f16580q0.a().postValue(new g(0, 0, i8, null));
        } else {
            Intent intent = new Intent("com.sifli.watchfacelibrary.broadcast.BROADCAST_PROGRESS");
            intent.putExtra("Sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_PROGRESS", i8);
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        }
    }

    void e(int i8) {
        Log.e(R, "send result broadcast " + i8 + ", result " + this.f16589e);
        if (f16580q0 != null) {
            f16580q0.a().postValue(new g(1, i8, this.f16589e, null));
        } else {
            Intent intent = new Intent("com.sifli.watchfacelibrary.broadcast.BROADCAST_WATCHFACE_STATE");
            intent.putExtra("Sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_STATE", i8);
            intent.putExtra("Sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_RESPONSE", this.f16589e);
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        }
    }

    public static int a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[2048];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 2048);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream, 2048);
        int i8 = 0;
        while (true) {
            try {
                int read = bufferedInputStream.read(bArr, 0, 2048);
                if (read == -1) {
                    break;
                }
                bufferedOutputStream.write(bArr, 0, read);
                i8 += read;
            } finally {
            }
        }
        bufferedOutputStream.flush();
        try {
            bufferedOutputStream.close();
        } catch (IOException e8) {
            Log.e(R, "out close error", e8);
        }
        try {
            bufferedInputStream.close();
        } catch (IOException e9) {
            Log.e(R, "in close error", e9);
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(byte[] bArr) {
        Log.d(R, "processWatchfaceTotalEndRsp");
        this.f16588d = true;
        this.f16589e = j.b(bArr, 2);
        synchronized (this.f16593i) {
            this.f16593i.notifyAll();
        }
    }

    private int a(ArrayList<i> arrayList) {
        Log.i(R, "fileBlockCheck");
        Iterator<i> it = arrayList.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i next = it.next();
            int length = next.b().length % this.f16600p;
            byte[] b8 = next.b();
            i8 += length == 0 ? b8.length / this.f16600p : (b8.length / this.f16600p) + 1;
        }
        Log.i(R, "total block use " + i8 + ", remote block left " + this.f16601q);
        a("total block use " + i8 + ", remote block left " + this.f16601q);
        return i8;
    }

    private void b(int i8) {
        Log.d(R, "sendWatchfaceAbortCmd");
        byte[] bArr = new byte[5];
        j.b(12, bArr, 0);
        j.b(1, bArr, 2);
        bArr[4] = (byte) i8;
        this.f16585a.a(bArr, 4);
        this.f16607w = false;
        this.f16599o.postDelayed(this.f16608x, 1000L);
        synchronized (this.f16593i) {
            while (!this.f16607w) {
                try {
                    this.f16593i.wait();
                } catch (InterruptedException e8) {
                    e8.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(byte[] bArr) {
        this.f16589e = j.b(bArr, 2);
        Log.d(R, "processWatchfaceInfoCheck " + this.f16589e);
        a("processWatchfaceInfoCheck: " + this.f16589e);
        this.f16588d = true;
        if (this.f16602r < 3 || bArr.length <= 4) {
            this.f16605u = 0;
        } else {
            this.f16605u = j.d(bArr, 4);
            this.f16606v = j.d(bArr, 6);
            Log.d(R, "info rsp resume state " + this.f16605u + ", resume count " + this.f16606v);
        }
        synchronized (this.f16593i) {
            this.f16593i.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(byte[] bArr) {
        this.f16588d = true;
        this.f16589e = j.b(bArr, 2);
        this.f16590f = j.a(bArr, 4);
        Log.i(R, "receive lose check + " + this.f16589e + ", index " + this.f16590f);
        if (this.f16589e != 8) {
            k();
            synchronized (this.f16593i) {
                this.f16593i.notifyAll();
            }
            return;
        }
        Log.e(R, "remote abort");
        this.f16594j = 7;
        synchronized (this.f16593i) {
            this.f16593i.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(byte[] bArr) {
        this.f16589e = j.b(bArr, 2);
        Log.d(R, "processWatchfaceStartRsp " + this.f16589e);
        a("processWatchfaceStartRsp: " + this.f16589e);
        this.f16588d = true;
        synchronized (this.f16593i) {
            this.f16593i.notifyAll();
        }
    }

    static /* synthetic */ long a(long j8) {
        long j9 = f16577n0 + j8;
        f16577n0 = j9;
        return j9;
    }

    private void b(int i8, @NonNull String str) {
        Charset charset = StandardCharsets.UTF_8;
        int length = str.getBytes(charset).length;
        Log.d(R, "sendWatchfaceStart " + i8 + ",name: " + str + ", " + length);
        byte[] bArr = new byte[length + 10];
        j.b(2, bArr, 0);
        j.b(length + 6, bArr, 2);
        j.a(i8, bArr, 4);
        j.a(length, bArr, 8);
        byte[] bytes = str.getBytes(charset);
        System.arraycopy(bytes, 0, bArr, 10, bytes.length);
        a("sendWatchfaceStart len: " + i8 + ",name: " + str);
        this.f16585a.a(bArr, 4);
        this.f16588d = false;
        this.f16599o.postDelayed(this.A, 60000L);
        synchronized (this.f16593i) {
            while (!this.f16588d && this.f16594j == 0) {
                try {
                    this.f16593i.wait();
                } catch (InterruptedException e8) {
                    e8.printStackTrace();
                }
            }
        }
        this.f16599o.removeCallbacks(this.A);
    }

    private void c(ArrayList<i> arrayList, int i8) {
        StringBuilder sb;
        String str;
        f(i8);
        if (this.f16594j != 0) {
            return;
        }
        if (this.f16589e != 0) {
            this.f16594j = 2;
            return;
        }
        if (this.f16602r >= 1) {
            int a8 = a(arrayList);
            if (this.f16602r >= 3) {
                a(a8, this.f16604t);
            } else {
                c(a8);
            }
            if (this.f16594j != 0) {
                return;
            }
            if (this.f16589e != 0) {
                this.f16594j = 2;
                return;
            }
        }
        i();
        if (f16583t0) {
            Log.d(R, "debug progress info");
            this.f16585a.d();
        }
        int i9 = 0;
        f16575l0 = 0;
        f16584u0 = 0;
        int i10 = this.f16605u;
        if (i10 != 0 && i10 == 1) {
            i9 = this.f16606v - 1;
            Log.i(R, "enable resume, send from " + this.f16606v);
        }
        while (i9 < arrayList.size()) {
            i iVar = arrayList.get(i9);
            String d8 = iVar.d();
            byte[] b8 = iVar.b();
            b(b8.length, d8);
            if (this.f16594j != 0) {
                break;
            }
            if (this.f16589e == 0) {
                a(arrayList, i9);
                if (f16583t0) {
                    Log.d(R, "calculateSendSize " + f16576m0);
                }
                j(b8);
                f16570g0 += 100;
                if (this.f16594j != 0) {
                    sb = new StringBuilder();
                    str = "error before end ";
                } else {
                    j();
                    if (this.f16594j != 0) {
                        sb = new StringBuilder();
                        str = "error after end ";
                    } else if (this.f16589e == 0) {
                        i9++;
                    }
                }
                sb.append(str);
                sb.append(this.f16594j);
                Log.d(R, sb.toString());
                break;
            }
            this.f16594j = 2;
            break;
        }
        Log.d(R, "end error " + this.f16594j);
        if (this.f16594j == 0) {
            l();
            Log.i(R, "finish");
        }
    }

    public static Intent a(Context context, Uri uri, String str, int i8) {
        Intent intent = new Intent(context, (Class<?>) SifliWatchfaceService.class);
        intent.setAction(D);
        intent.putExtra(F, i8);
        intent.putExtra(H, uri);
        intent.putExtra(G, str);
        context.startService(intent);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(byte[] bArr) {
        this.f16589e = j.b(bArr, 2);
        Log.d(R, "processWatchfaceEndRsp " + this.f16589e);
        a("processWatchfaceEndRsp " + this.f16589e);
        this.f16588d = true;
        this.f16603s = 0;
        synchronized (this.f16593i) {
            this.f16593i.notifyAll();
        }
    }

    protected void b(long j8) {
        synchronized (this.f16593i) {
            try {
                this.f16593i.wait(j8);
            } catch (InterruptedException unused) {
                Log.e(R, "Sleeping interrupted");
            }
        }
    }

    public static Intent a(Context context, Uri uri, String str, int i8, int i9) {
        Intent intent = new Intent(context, (Class<?>) SifliWatchfaceService.class);
        intent.setAction(D);
        intent.putExtra(F, i8);
        intent.putExtra(H, uri);
        intent.putExtra(G, str);
        intent.putExtra(J, i9);
        context.startService(intent);
        return intent;
    }

    private void b(String str) {
        Intent intent = new Intent(this, (Class<?>) serialTransService.class);
        Log.d(R, "startTransService " + str);
        intent.putExtra(serialTransService.f16495u0, str);
        this.f16596l = false;
        startService(intent);
        bindService(intent, this.f16609y, 1);
        this.f16599o.postDelayed(this.f16610z, 60000L);
        synchronized (this.f16593i) {
            while (!this.f16596l && this.f16594j == 0) {
                try {
                    this.f16593i.wait();
                } catch (InterruptedException e8) {
                    e8.printStackTrace();
                }
            }
        }
        Log.d(R, "start finish " + this.f16596l + ", error " + this.f16594j);
        this.f16599o.removeCallbacks(this.f16610z);
        if (this.f16596l && this.f16594j == 0) {
            this.f16599o.postDelayed(this.f16610z, 60000L);
            this.f16592h = false;
            serialTransService.g gVar = this.f16585a;
            if (gVar == null) {
                this.f16594j = 1;
                return;
            }
            gVar.a(Boolean.valueOf(f16582s0));
            synchronized (this.f16593i) {
                while (!this.f16592h && this.f16594j == 0) {
                    try {
                        this.f16593i.wait();
                    } catch (InterruptedException e9) {
                        e9.printStackTrace();
                    }
                }
            }
            this.f16599o.removeCallbacks(this.f16610z);
        }
    }

    private void b(ArrayList<i> arrayList) {
        Iterator<i> it = arrayList.iterator();
        while (it.hasNext()) {
            i next = it.next();
            next.e();
            next.a();
        }
    }

    public static String a(Context context, Uri uri) {
        File externalFilesDir = context.getExternalFilesDir(null);
        String a8 = a(uri);
        if (TextUtils.isEmpty(a8)) {
            return null;
        }
        File file = new File(externalFilesDir + File.separator + a8);
        a(context, uri, file);
        return file.getAbsolutePath();
    }

    private void b(ArrayList<i> arrayList, int i8) {
        Iterator<i> it = arrayList.iterator();
        while (it.hasNext()) {
            i next = it.next();
            next.a(i8);
            next.a();
        }
    }

    public static String a(Uri uri) {
        String path;
        int lastIndexOf;
        if (uri == null || (lastIndexOf = (path = uri.getPath()).lastIndexOf(47)) == -1) {
            return null;
        }
        return path.substring(lastIndexOf + 1);
    }

    public static void b(boolean z7) {
        f16582s0 = z7;
    }

    private ArrayList<i> a(String str, ArrayList<i> arrayList) {
        File[] listFiles;
        String str2 = getCacheDir() + "/wf";
        File file = new File(str);
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return null;
        }
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                String absolutePath = file2.getAbsolutePath();
                String name = file2.getName();
                byte[] b8 = com.crrepa.x1.c.b(absolutePath);
                String substring = absolutePath.substring(str2.length());
                arrayList.add(new i(substring, b8, name));
                Log.d(R, "fileName:" + name);
                Log.d(R, "filePath:" + substring);
                Log.d(R, "data len:" + b8.length);
            } else if (file2.isDirectory()) {
                a(file2.getAbsolutePath(), arrayList);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(byte[] bArr) {
        if (this.f16603s == 1) {
            Log.w(R, "processWatchfaceDataRsp: wait end rsp, ignore!");
            return;
        }
        this.f16588d = true;
        this.f16589e = j.b(bArr, 2);
        a("processWatchfaceDataRsp " + this.f16589e);
        this.f16590f = j.a(bArr, 4);
        if (this.f16589e != 0) {
            Log.e(R, "processWatchfaceDataRsp " + this.f16589e + ", index " + this.f16590f);
        }
        synchronized (this.f16593i) {
            this.f16593i.notifyAll();
        }
    }

    @Override // com.crrepa.x1.d
    public void a() {
        Log.d(R, "stopSend");
        this.f16594j = 100;
        synchronized (this.f16593i) {
            this.f16593i.notifyAll();
        }
    }

    private void a(int i8, String str) {
        Log.d(R, "sendWatchfaceInfoReq md5 " + str);
        byte[] bArr = new byte[40];
        j.b(13, bArr, 0);
        j.b(36, bArr, 2);
        j.a(i8, bArr, 4);
        System.arraycopy(str.getBytes(StandardCharsets.UTF_8), 0, bArr, 8, 32);
        this.f16585a.a(bArr, 4);
        this.f16588d = false;
        this.f16599o.postDelayed(this.A, 60000L);
        synchronized (this.f16593i) {
            while (!this.f16588d && this.f16594j == 0) {
                try {
                    this.f16593i.wait();
                } catch (InterruptedException e8) {
                    e8.printStackTrace();
                }
            }
        }
        this.f16599o.removeCallbacks(this.A);
    }

    public static void a(Context context) {
        com.crrepa.x1.d g8 = g();
        if (g8 != null) {
            g8.a();
        }
    }

    public static void a(Context context, Uri uri, File file) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            a(openInputStream, fileOutputStream);
            openInputStream.close();
            fileOutputStream.close();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public static void a(Context context, String str, String str2, int i8) {
        Intent intent = new Intent(context, (Class<?>) SifliWatchfaceService.class);
        intent.setAction(D);
        intent.putExtra(F, i8);
        intent.putExtra(I, str);
        intent.putExtra(G, str2);
        context.startService(intent);
    }

    public static void a(Context context, String str, String str2, int i8, int i9) {
        Intent intent = new Intent(context, (Class<?>) SifliWatchfaceService.class);
        intent.setAction(D);
        intent.putExtra(F, i8);
        intent.putExtra(I, str);
        intent.putExtra(G, str2);
        intent.putExtra(J, i9);
        context.startService(intent);
    }

    public static void a(Context context, ArrayList<i> arrayList, String str, int i8) {
        Intent intent = new Intent(context, (Class<?>) SifliWatchfaceService.class);
        f16579p0 = intent;
        intent.setAction(C);
        intent.putExtra(F, i8);
        intent.putExtra(E, arrayList);
        intent.putExtra(G, str);
        f16570g0 = 0;
        context.startService(intent);
    }

    public static void a(Context context, byte[] bArr, String str, int i8) {
        Intent intent = new Intent(context, (Class<?>) SifliWatchfaceService.class);
        intent.setAction(D);
        intent.putExtra(F, i8);
        intent.putExtra(E, bArr);
        intent.putExtra(G, str);
        context.startService(intent);
    }

    public static void a(WatchfaceView watchfaceView) {
        Log.d(R, "setView");
        f16580q0 = watchfaceView;
    }

    void a(String str) {
        if (f16580q0 != null) {
            f16580q0.a().postValue(new g(2, 0, 0, str));
        } else {
            Intent intent = new Intent("com.sifli.watchfacelibrary.broadcast.BROADCAST_LOG");
            intent.putExtra("com.sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_LOG", str);
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        }
    }

    private void a(String str, ArrayList<i> arrayList, int i8) {
        StringBuilder sb;
        String str2;
        Log.d(R, "send type " + i8);
        if (this.f16594j != 0) {
            sb = new StringBuilder();
            str2 = "exit before start ";
        } else {
            this.f16603s = 0;
            b(str);
            if (this.f16594j == 0) {
                c(arrayList, i8);
                if (this.f16594j == 100) {
                    b(10);
                }
                e(this.f16594j);
                f();
            }
            sb = new StringBuilder();
            str2 = "exit ";
        }
        sb.append(str2);
        sb.append(this.f16594j);
        Log.e(R, sb.toString());
        e(this.f16594j);
        f();
    }

    private void a(ArrayList<i> arrayList, int i8) {
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            i9 += arrayList.get(i10).b().length;
        }
        f16576m0 = i9;
    }

    public static void a(boolean z7) {
        f16583t0 = z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(byte[] bArr) {
        this.f16589e = j.b(bArr, 2);
        Log.d(R, "COMMAND_SEND_WATCHFACE_START_RSP " + this.f16589e);
        this.f16588d = true;
        Log.d(R, "mMaxPartLen " + j.d(bArr, 4));
        if (bArr.length == 14) {
            this.f16602r = j.d(bArr, 6);
            this.f16600p = j.d(bArr, 8);
            this.f16601q = j.c(bArr, 10);
            Log.i(R, "remote version " + this.f16602r + ", block length " + this.f16600p + ", remote block " + this.f16601q);
        }
        a("processTotalStartRsp " + this.f16589e + ", len " + this.f16586b);
        synchronized (this.f16593i) {
            this.f16593i.notifyAll();
        }
    }
}
