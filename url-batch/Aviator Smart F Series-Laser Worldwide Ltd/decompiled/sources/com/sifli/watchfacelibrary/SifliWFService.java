package com.sifli.watchfacelibrary;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.crrepa.x1.e;
import com.crrepa.x1.f;
import com.crrepa.x1.i;
import com.crrepa.x1.j;
import com.sifli.serialtransport.serialTransService;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class SifliWFService extends Service {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 3;
    public static final int E = 4;
    public static final int F = 5;
    public static final int G = 6;
    private static final int H = 4096;
    private static final int I = 1024;
    private static final int J = 60000;
    private static final int K = 60000;
    private static final int L = 4;
    private static final int M = 4;
    public static final String N = "com.sifli.watchfacelibrary.broadcast.BROADCAST_WATCHFACE_STATE";
    public static final String O = "com.sifli.watchfacelibrary.broadcast.BROADCAST_PROGRESS";
    public static final String P = "com.sifli.watchfacelibrary.broadcast.BROADCAST_LOG";
    public static final String Q = "Sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_STATE";
    public static final String R = "Sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_PROGRESS";
    public static final String S = "Sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_RESPONSE";
    public static final String T = "com.sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_LOG";

    /* renamed from: u, reason: collision with root package name */
    private static final String f16534u = "wf-service";

    /* renamed from: v, reason: collision with root package name */
    private static int f16535v = 0;

    /* renamed from: w, reason: collision with root package name */
    private static int f16536w = 0;

    /* renamed from: x, reason: collision with root package name */
    private static int f16537x = 0;

    /* renamed from: y, reason: collision with root package name */
    private static int f16538y = 0;

    /* renamed from: z, reason: collision with root package name */
    private static boolean f16539z = false;

    /* renamed from: a, reason: collision with root package name */
    private c f16540a;

    /* renamed from: b, reason: collision with root package name */
    private serialTransService.g f16541b;

    /* renamed from: c, reason: collision with root package name */
    private e f16542c;

    /* renamed from: g, reason: collision with root package name */
    private int f16546g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16547h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16548i;

    /* renamed from: j, reason: collision with root package name */
    private int f16549j;

    /* renamed from: k, reason: collision with root package name */
    int f16550k;

    /* renamed from: l, reason: collision with root package name */
    long f16551l;

    /* renamed from: m, reason: collision with root package name */
    int f16552m;

    /* renamed from: p, reason: collision with root package name */
    private int f16555p;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16543d = false;

    /* renamed from: e, reason: collision with root package name */
    private Handler f16544e = new Handler();

    /* renamed from: f, reason: collision with root package name */
    private final Object f16545f = new Object();

    /* renamed from: n, reason: collision with root package name */
    ArrayList<String> f16553n = new ArrayList<>();

    /* renamed from: o, reason: collision with root package name */
    private boolean f16554o = false;

    /* renamed from: q, reason: collision with root package name */
    int f16556q = 0;

    /* renamed from: r, reason: collision with root package name */
    private int f16557r = 4096;

    /* renamed from: s, reason: collision with root package name */
    private final Runnable f16558s = new a();

    /* renamed from: t, reason: collision with root package name */
    private final ServiceConnection f16559t = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.e(SifliWFService.f16534u, "serial trans command overtime!");
            SifliWFService.this.f16546g = 3;
            synchronized (SifliWFService.this.f16545f) {
                SifliWFService.this.f16545f.notifyAll();
            }
        }
    }

    class b implements ServiceConnection {

        class a implements l4.a {
            a() {
            }

            @Override // l4.a
            public void a() {
                synchronized (SifliWFService.this.f16545f) {
                    SifliWFService.this.f16545f.notifyAll();
                }
            }

            @Override // l4.a
            public void b(int i8) {
            }

            @Override // l4.a
            public void c(int i8) {
                SifliWFService.a(i8);
                int i9 = (SifliWFService.f16536w * 100) / SifliWFService.f16537x;
                if (SifliWFService.f16539z) {
                    Log.d(SifliWFService.f16534u, "progress " + i9);
                    Log.d(SifliWFService.f16534u, "progress " + SifliWFService.f16536w + ", " + SifliWFService.f16537x);
                }
                SifliWFService.this.c(i9);
            }

            @Override // l4.a
            public void d(int i8) {
                if (i8 == 23) {
                    Log.d(SifliWFService.f16534u, "onSerialMTUChangeResult use short packet");
                }
            }

            @Override // l4.a
            public void e(int i8) {
                SifliWFService.c(SifliWFService.this);
                throw null;
            }

            @Override // l4.a
            public void a(int i8) {
                if (i8 != 0) {
                    return;
                }
                Log.d(SifliWFService.f16534u, "disconnect close");
                SifliWFService.this.f16540a.a();
                SifliWFService.this.f16546g = 6;
                SifliWFService.c(SifliWFService.this);
                throw null;
            }

            @Override // l4.a
            public void a(int i8, byte[] bArr) {
                if (i8 == 4) {
                    byte b8 = bArr[0];
                    if (b8 == 1) {
                        SifliWFService.this.a(bArr);
                        return;
                    }
                    if (b8 == 3) {
                        SifliWFService.this.f(bArr);
                        return;
                    }
                    if (b8 == 5) {
                        SifliWFService.this.b(bArr);
                        return;
                    }
                    if (b8 == 7) {
                        SifliWFService.this.c(bArr);
                        return;
                    }
                    if (b8 == 14) {
                        SifliWFService.this.d(bArr);
                    } else if (b8 == 9) {
                        SifliWFService.this.g(bArr);
                    } else {
                        if (b8 != 10) {
                            return;
                        }
                        SifliWFService.this.e(bArr);
                    }
                }
            }
        }

        b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d(SifliWFService.f16534u, "onServiceConnected, " + componentName.toString());
            SifliWFService.this.f16543d = true;
            SifliWFService.this.f16541b = (serialTransService.g) iBinder;
            serialTransService a8 = SifliWFService.this.f16541b.a();
            synchronized (SifliWFService.this.f16545f) {
                SifliWFService.this.f16545f.notifyAll();
            }
            a8.a(new a());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d(SifliWFService.f16534u, "onServiceDisconnected" + componentName.toString());
            SifliWFService.this.f16543d = false;
            synchronized (SifliWFService.this.f16545f) {
                SifliWFService.this.f16545f.notifyAll();
            }
        }
    }

    public class c extends Binder {
        public c() {
        }

        public void a() {
            if (SifliWFService.this.f16543d) {
                SifliWFService.this.f16543d = false;
                SifliWFService sifliWFService = SifliWFService.this;
                sifliWFService.unbindService(sifliWFService.f16559t);
                SifliWFService.this.stopService(new Intent(SifliWFService.this, (Class<?>) serialTransService.class));
            }
        }

        public SifliWFService b() {
            return SifliWFService.this;
        }

        public void a(String str) {
            Log.d(SifliWFService.f16534u, "connect device " + str);
            SifliWFService.this.b(str);
        }

        public void a(String str, Uri uri, int i8, int i9) {
            SifliWFService.this.a(str, uri, i8, i9);
        }
    }

    static /* synthetic */ e c(SifliWFService sifliWFService) {
        sifliWFService.getClass();
        return null;
    }

    private void e() {
        this.f16553n.clear();
        this.f16553n.add("LLD");
        this.f16553n.add("PRA");
        this.f16553n.add("VCE");
        this.f16553n.add("MAR");
        String str = Build.MODEL;
        if (str.length() > 3) {
            str = str.substring(0, 3);
        }
        Log.e(f16534u, "model " + str);
        if (this.f16553n.contains(str)) {
            Log.w(f16534u, "sendDfuBlankData");
            for (int i8 = 0; i8 < 5; i8++) {
                this.f16541b.e();
            }
        }
    }

    private void g() {
        Log.d(f16534u, "sendWatchfaceLoseCheckRsp");
        byte[] bArr = new byte[4];
        j.b(11, bArr, 0);
        j.b(0, bArr, 2);
        this.f16541b.a(bArr, 4);
    }

    private void h() {
        Log.d(f16534u, "sendWatchfaceTotalEnd");
        byte[] bArr = new byte[4];
        j.b(8, bArr, 0);
        j.b(0, bArr, 2);
        this.f16541b.a(bArr, 4);
        this.f16554o = false;
        this.f16544e.postDelayed(this.f16558s, 60000L);
        synchronized (this.f16545f) {
            while (!this.f16554o && this.f16546g == 0) {
                try {
                    this.f16545f.wait();
                } catch (InterruptedException e8) {
                    e8.printStackTrace();
                }
            }
        }
        this.f16544e.removeCallbacks(this.f16558s);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        c cVar = this.f16540a;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Log.d(f16534u, "version " + j.f14036a);
        this.f16552m = 0;
        this.f16540a = new c();
    }

    static /* synthetic */ int a(int i8) {
        int i9 = f16536w + i8;
        f16536w = i9;
        return i9;
    }

    private void e(int i8) {
        Log.d(f16534u, "sendWatchfaceTotalStart " + i8);
        byte[] bArr = new byte[11];
        j.b(0, bArr, 0);
        j.b(7, bArr, 2);
        j.b(i8, bArr, 4);
        bArr[6] = 2;
        j.a(f16537x, bArr, 7);
        a("sendWatchfaceTotalStart type " + i8 + ", file len " + f16537x);
        this.f16541b.a(bArr, 4);
        this.f16554o = false;
        this.f16544e.postDelayed(this.f16558s, 60000L);
        synchronized (this.f16545f) {
            while (!this.f16554o && this.f16546g == 0) {
                try {
                    this.f16545f.wait();
                } catch (InterruptedException e8) {
                    e8.printStackTrace();
                }
            }
        }
        this.f16544e.removeCallbacks(this.f16558s);
    }

    private void f() {
        Log.d(f16534u, "sendWatchfaceEnd");
        byte[] bArr = new byte[4];
        this.f16556q = 1;
        a("sendWatchfaceEnd");
        j.b(6, bArr, 0);
        j.b(0, bArr, 2);
        this.f16541b.a(bArr, 4);
        this.f16554o = false;
        this.f16544e.postDelayed(this.f16558s, 60000L);
        synchronized (this.f16545f) {
            while (!this.f16554o && this.f16546g == 0) {
                try {
                    this.f16545f.wait();
                } catch (InterruptedException e8) {
                    e8.printStackTrace();
                }
            }
        }
        this.f16544e.removeCallbacks(this.f16558s);
    }

    private void h(byte[] bArr) {
        Log.d(f16534u, "sendWatchfaceDataExt");
        Log.d(f16534u, "mMaxPartLen " + this.f16557r);
        com.crrepa.x1.b bVar = new com.crrepa.x1.b(bArr, this.f16557r);
        int a8 = bVar.a();
        int i8 = 0;
        int i9 = 0;
        while (i8 < a8) {
            int i10 = f16535v;
            for (int i11 = 0; i11 < i8; i11++) {
                i10 += bVar.a(i11).length;
            }
            if (f16539z) {
                Log.d(f16534u, "mAlreadySendLen " + i10);
            }
            f16536w = i10;
            int length = bVar.a(i8).length;
            byte[] bArr2 = new byte[length + 8];
            j.b(4, bArr2, 0);
            j.b(length + 4, bArr2, 2);
            j.a(i8 + 1, bArr2, 4);
            System.arraycopy(bArr, i9, bArr2, 8, length);
            i9 += length;
            this.f16541b.b(bArr2, 4);
            this.f16554o = false;
            synchronized (this.f16545f) {
                while (!this.f16554o && this.f16546g == 0) {
                    try {
                        this.f16545f.wait();
                    } catch (InterruptedException e8) {
                        e8.printStackTrace();
                    }
                }
            }
            int i12 = this.f16549j;
            if (i12 != 0) {
                if (i12 != 4 && i12 != 7) {
                    this.f16546g = 2;
                    return;
                }
                Log.w(f16534u, "index error, continue with " + this.f16555p);
                i9 -= length;
                i8 = this.f16555p - 2;
                this.f16546g = 0;
            }
            if (this.f16546g != 0) {
                Log.w(f16534u, "download interrupt with " + this.f16546g);
                return;
            }
            i8++;
        }
    }

    void c(int i8) {
        if (f16539z) {
            Log.d(f16534u, "sendWatchfaceProgress " + i8);
        }
        Intent intent = new Intent("com.sifli.watchfacelibrary.broadcast.BROADCAST_PROGRESS");
        intent.putExtra("Sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_PROGRESS", i8);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    void d() {
        this.f16549j = 0;
        f16535v = 0;
        f16536w = 0;
        f16537x = 0;
    }

    private void b(int i8) {
        Log.d(f16534u, "sendWatchfaceInfoReq");
        byte[] bArr = new byte[8];
        j.b(13, bArr, 0);
        j.b(2, bArr, 2);
        j.a(i8, bArr, 4);
        this.f16541b.a(bArr, 4);
        this.f16554o = false;
        this.f16544e.postDelayed(this.f16558s, 60000L);
        synchronized (this.f16545f) {
            while (!this.f16554o && this.f16546g == 0) {
                try {
                    this.f16545f.wait();
                } catch (InterruptedException e8) {
                    e8.printStackTrace();
                }
            }
        }
        this.f16544e.removeCallbacks(this.f16558s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(byte[] bArr) {
        Log.d(f16534u, "processWatchfaceTotalEndRsp");
        this.f16554o = true;
        this.f16549j = j.b(bArr, 2);
        synchronized (this.f16545f) {
            this.f16545f.notifyAll();
        }
    }

    void d(int i8) {
        Log.e(f16534u, "send result broadcast " + i8 + ", result " + this.f16549j);
        Intent intent = new Intent("com.sifli.watchfacelibrary.broadcast.BROADCAST_WATCHFACE_STATE");
        intent.putExtra("Sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_STATE", i8);
        intent.putExtra("Sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_RESPONSE", this.f16549j);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    private int a(ArrayList<i> arrayList) {
        Log.i(f16534u, "fileBlockCheck");
        Iterator<i> it = arrayList.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i next = it.next();
            int length = next.b().length % this.f16550k;
            byte[] b8 = next.b();
            i8 += length == 0 ? b8.length / this.f16550k : (b8.length / this.f16550k) + 1;
        }
        Log.i(f16534u, "total block use " + i8 + ", remote block left " + this.f16551l);
        a("total block use " + i8 + ", remote block left " + this.f16551l);
        return i8;
    }

    private void c(ArrayList<i> arrayList, int i8) {
        StringBuilder sb;
        String str;
        e(i8);
        if (this.f16546g != 0) {
            return;
        }
        if (this.f16549j != 0) {
            this.f16546g = 2;
            return;
        }
        if (this.f16552m >= 1) {
            b(a(arrayList));
            if (this.f16546g != 0) {
                return;
            }
            if (this.f16549j != 0) {
                this.f16546g = 2;
                return;
            }
        }
        e();
        if (f16539z) {
            Log.d(f16534u, "debug progress info");
            this.f16541b.d();
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            i iVar = arrayList.get(i9);
            String d8 = iVar.d();
            byte[] b8 = iVar.b();
            a(b8.length, d8);
            if (this.f16546g != 0) {
                break;
            }
            if (this.f16549j == 0) {
                a(arrayList, i9);
                if (f16539z) {
                    Log.d(f16534u, "calculateSendSize " + f16535v);
                }
                h(b8);
                f16538y += 100;
                if (this.f16546g != 0) {
                    sb = new StringBuilder();
                    str = "error before end ";
                } else {
                    f();
                    if (this.f16546g != 0) {
                        sb = new StringBuilder();
                        str = "error after end ";
                    } else if (this.f16549j == 0) {
                    }
                }
                sb.append(str);
                sb.append(this.f16546g);
                Log.d(f16534u, sb.toString());
                break;
            }
            this.f16546g = 2;
            break;
        }
        Log.d(f16534u, "end error " + this.f16546g);
        if (this.f16546g == 0) {
            h();
            Log.i(f16534u, "finish");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(byte[] bArr) {
        this.f16554o = true;
        this.f16549j = j.b(bArr, 2);
        this.f16555p = j.a(bArr, 4);
        Log.i(f16534u, "receive lose check + " + this.f16549j + ", index " + this.f16555p);
        if (this.f16549j != 8) {
            g();
            synchronized (this.f16545f) {
                this.f16545f.notifyAll();
            }
            return;
        }
        Log.e(f16534u, "remote abort");
        this.f16546g = 7;
        synchronized (this.f16545f) {
            this.f16545f.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(byte[] bArr) {
        this.f16549j = j.b(bArr, 2);
        Log.d(f16534u, "processWatchfaceStartRsp " + this.f16549j);
        a("processWatchfaceStartRsp: " + this.f16549j);
        this.f16554o = true;
        synchronized (this.f16545f) {
            this.f16545f.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        this.f16546g = 0;
        Intent intent = new Intent(this, (Class<?>) serialTransService.class);
        Log.d(f16534u, "startTransService " + str);
        intent.putExtra(serialTransService.f16495u0, str);
        this.f16543d = false;
        startService(intent);
        bindService(intent, this.f16559t, 1);
        synchronized (this.f16545f) {
            while (!this.f16543d && this.f16546g == 0) {
                try {
                    this.f16545f.wait();
                } catch (InterruptedException e8) {
                    e8.printStackTrace();
                }
            }
        }
        Log.d(f16534u, "start finish " + this.f16543d + ", error " + this.f16546g);
        if (this.f16543d && this.f16546g == 0) {
            this.f16548i = false;
            serialTransService.g gVar = this.f16541b;
            if (gVar == null) {
                this.f16546g = 1;
            } else {
                gVar.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(byte[] bArr) {
        this.f16549j = j.b(bArr, 2);
        Log.d(f16534u, "processWatchfaceEndRsp " + this.f16549j);
        a("processWatchfaceEndRsp " + this.f16549j);
        this.f16554o = true;
        this.f16556q = 0;
        synchronized (this.f16545f) {
            this.f16545f.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(byte[] bArr) {
        this.f16549j = j.b(bArr, 2);
        Log.d(f16534u, "processWatchfaceInfoCheck " + this.f16549j);
        a("processWatchfaceInfoCheck: " + this.f16549j);
        this.f16554o = true;
        synchronized (this.f16545f) {
            this.f16545f.notifyAll();
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
                Log.d(f16534u, "fileName:" + name);
                Log.d(f16534u, "filePath:" + substring);
                Log.d(f16534u, "data len:" + b8.length);
            } else if (file2.isDirectory()) {
                a(file2.getAbsolutePath(), arrayList);
            }
        }
        return arrayList;
    }

    private void b(ArrayList<i> arrayList, int i8) {
        Iterator<i> it = arrayList.iterator();
        while (it.hasNext()) {
            i next = it.next();
            next.a(i8);
            next.a();
        }
    }

    private void a(int i8, @NonNull String str) {
        Charset charset = StandardCharsets.UTF_8;
        int length = str.getBytes(charset).length;
        Log.d(f16534u, "sendWatchfaceStart " + i8 + ",name: " + str + ", " + length);
        byte[] bArr = new byte[length + 10];
        j.b(2, bArr, 0);
        j.b(length + 6, bArr, 2);
        j.a(i8, bArr, 4);
        j.a(length, bArr, 8);
        byte[] bytes = str.getBytes(charset);
        System.arraycopy(bytes, 0, bArr, 10, bytes.length);
        a("sendWatchfaceStart len: " + i8 + ",name: " + str);
        this.f16541b.a(bArr, 4);
        this.f16554o = false;
        this.f16544e.postDelayed(this.f16558s, 60000L);
        synchronized (this.f16545f) {
            while (!this.f16554o && this.f16546g == 0) {
                try {
                    this.f16545f.wait();
                } catch (InterruptedException e8) {
                    e8.printStackTrace();
                }
            }
        }
        this.f16544e.removeCallbacks(this.f16558s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(byte[] bArr) {
        if (this.f16556q == 1) {
            Log.w(f16534u, "processWatchfaceDataRsp: wait end rsp, ignore!");
            return;
        }
        this.f16554o = true;
        this.f16549j = j.b(bArr, 2);
        a("processWatchfaceDataRsp " + this.f16549j);
        this.f16555p = j.a(bArr, 4);
        if (this.f16549j != 0) {
            Log.e(f16534u, "processWatchfaceDataRsp " + this.f16549j + ", index " + this.f16555p);
        }
        synchronized (this.f16545f) {
            this.f16545f.notifyAll();
        }
    }

    public void a(e eVar) {
    }

    void a(String str) {
        Intent intent = new Intent("com.sifli.watchfacelibrary.broadcast.BROADCAST_LOG");
        intent.putExtra("com.sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_LOG", str);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Uri uri, int i8, int i9) {
        d();
        if (str != null) {
            Log.d(f16534u, "get path");
        } else {
            if (uri == null) {
                Log.e(f16534u, "uri, path and zip data are null");
                throw null;
            }
            Log.d(f16534u, "get uri");
            str = SifliWatchfaceService.a(this, uri);
        }
        str.getClass();
        String str2 = getCacheDir() + "/wf";
        Log.d(f16534u, "new path: " + str2);
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        com.crrepa.x1.c.a(str2, false);
        com.crrepa.x1.c.a(str, str2);
        ArrayList<i> a8 = a(str2, new ArrayList<>());
        a8.getClass();
        if (i8 == 3 || i8 == 4) {
            b(a8);
        } else if (i9 == 1) {
            b(a8, i8);
        }
        f16537x = 0;
        Iterator<i> it = a8.iterator();
        while (it.hasNext()) {
            f16537x += it.next().b().length;
        }
        Collections.sort(a8, new f());
        Log.d(f16534u, "watchfaceFile size " + a8.size() + ", all files len " + f16537x);
        if (f16537x == 0) {
            Log.e(f16534u, "file is null");
            throw null;
        }
        f16538y = 0;
        this.f16546g = 0;
        this.f16556q = 0;
        c(a8, i8);
        throw null;
    }

    private void a(ArrayList<i> arrayList, int i8) {
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            i9 += arrayList.get(i10).b().length;
        }
        f16535v = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(byte[] bArr) {
        this.f16549j = j.b(bArr, 2);
        Log.d(f16534u, "COMMAND_SEND_WATCHFACE_START_RSP " + this.f16549j);
        this.f16554o = true;
        Log.d(f16534u, "mMaxPartLen " + j.d(bArr, 4));
        if (bArr.length == 14) {
            this.f16552m = j.d(bArr, 6);
            this.f16550k = j.d(bArr, 8);
            this.f16551l = j.c(bArr, 10);
            Log.i(f16534u, "remote version " + this.f16552m + ", block length " + this.f16550k + ", remote block " + this.f16551l);
        }
        a("processTotalStartRsp " + this.f16549j + ", len " + this.f16557r);
        synchronized (this.f16545f) {
            this.f16545f.notifyAll();
        }
    }
}
