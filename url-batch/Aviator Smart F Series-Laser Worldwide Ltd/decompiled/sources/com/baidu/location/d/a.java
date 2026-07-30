package com.baidu.location.d;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.lbsapi.auth.LBSAuthManager;
import com.baidu.location.LLSInterface;
import com.baidu.location.b.b0;
import com.baidu.location.b.d;
import com.baidu.location.b.e;
import com.baidu.location.b.g;
import com.baidu.location.b.m;
import com.baidu.location.b.n;
import com.baidu.location.b.r;
import com.baidu.location.b.y;
import com.baidu.location.b.z;
import com.baidu.location.c.h;
import com.baidu.location.e.c;
import com.baidu.location.e.i;
import com.baidu.location.f;
import com.google.android.exoplayer2.offline.DownloadService;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class a extends Service implements LLSInterface {

    /* renamed from: a, reason: collision with root package name */
    static b f5145a;

    /* renamed from: b, reason: collision with root package name */
    private static long f5146b;

    /* renamed from: c, reason: collision with root package name */
    public static long f5147c;

    /* renamed from: d, reason: collision with root package name */
    Messenger f5148d = null;

    /* renamed from: e, reason: collision with root package name */
    private Looper f5149e = null;

    /* renamed from: f, reason: collision with root package name */
    private HandlerThread f5150f = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5151g = true;

    /* renamed from: h, reason: collision with root package name */
    private int f5152h = 0;

    /* renamed from: i, reason: collision with root package name */
    private boolean f5153i = true;

    /* renamed from: com.baidu.location.d.a$a, reason: collision with other inner class name */
    class RunnableC0053a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f5154a;

        RunnableC0053a(WeakReference weakReference) {
            this.f5154a = weakReference;
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = (a) this.f5154a.get();
            if (aVar == null || aVar.f5152h != 3) {
                return;
            }
            Log.d("baidu_location_service", "baidu location service force stopped ...");
            aVar.f5153i = false;
            aVar.b();
        }
    }

    public static class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<a> f5156a;

        public b(Looper looper, a aVar) {
            super(looper);
            this.f5156a = new WeakReference<>(aVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar = this.f5156a.get();
            if (aVar == null) {
                return;
            }
            if (f.isServing) {
                int i8 = message.what;
                if (i8 == 11) {
                    aVar.a(message);
                } else if (i8 == 12) {
                    aVar.b(message);
                } else if (i8 == 15) {
                    aVar.c(message);
                } else if (i8 == 22) {
                    r.c().b(message);
                } else if (i8 == 41) {
                    r.c().i();
                } else if (i8 == 401) {
                    try {
                        message.getData();
                    } catch (Exception unused) {
                    }
                } else if (i8 == 406) {
                    m.a().e();
                } else if (i8 == 705) {
                    d.a().a(message.getData().getBoolean(DownloadService.KEY_FOREGROUND));
                }
            }
            if (message.what == 1) {
                aVar.b();
            }
            if (message.what == 0) {
                aVar.a();
            }
            super.handleMessage(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        com.baidu.location.c.f.a().e();
        com.baidu.location.b.b.a().f();
        h.a().d();
        r.c().e();
        m.a().c();
        if (this.f5153i) {
            b0.d();
        }
        d.a().b();
        try {
            z.a().d();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        this.f5152h = 4;
        if (this.f5151g) {
            return;
        }
        Process.killProcess(Process.myPid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Message message) {
        d.a().c(message);
    }

    @Override // com.baidu.location.LLSInterface
    public double getVersion() {
        return 9.652999877929688d;
    }

    @Override // android.app.Service, com.baidu.location.LLSInterface
    public IBinder onBind(Intent intent) {
        String str;
        String str2;
        Bundle extras = intent.getExtras();
        if (extras != null) {
            c.f5167d = extras.getString("key");
            c.f5166c = extras.getString(HttpConstants.SIGN);
            this.f5151g = extras.getBoolean("kill_process");
            extras.getBoolean("cache_exception");
            str = extras.getString("auth_key");
            str2 = extras.getString("cuid");
            i.f5280m0 = extras.getString("proxyHost");
            i.f5282n0 = extras.getInt("proxyPort");
            i.f5284o0 = extras.getString("username");
            i.f5286p0 = extras.getString("password");
        } else {
            str = null;
            str2 = null;
        }
        if (str != null) {
            com.baidu.location.a.a.a().a(f.getServiceContext(), str);
        }
        if (!TextUtils.isEmpty(i.f5280m0) && i.f5282n0 != -1) {
            LBSAuthManager.getInstance(f.getServiceContext()).setProxy(i.f5280m0, i.f5282n0);
        }
        if (!TextUtils.isEmpty(i.f5284o0) && !TextUtils.isEmpty(i.f5286p0)) {
            LBSAuthManager.getInstance(f.getServiceContext()).setHttpProxyUsernameAndPassword(i.f5284o0, i.f5286p0);
        }
        com.baidu.location.a.a.a().a(f.getServiceContext());
        c.a().a(str2);
        return this.f5148d.getBinder();
    }

    @Override // com.baidu.location.LLSInterface
    public void onCreate(Context context) {
        com.baidu.location.b.c.a().a(context);
        LBSAuthManager.getInstance(f.getServiceContext()).setPrivacyMode(true);
        try {
            i.J = context.getPackageName();
        } catch (Exception unused) {
        }
        f5146b = System.currentTimeMillis();
        HandlerThread a8 = y.a();
        this.f5150f = a8;
        if (a8 != null) {
            this.f5149e = a8.getLooper();
        }
        f5145a = this.f5149e == null ? new b(Looper.getMainLooper(), this) : new b(this.f5149e, this);
        f5147c = System.currentTimeMillis();
        this.f5148d = new Messenger(f5145a);
        f5145a.sendEmptyMessage(0);
        this.f5152h = 1;
    }

    @Override // android.app.Service, com.baidu.location.LLSInterface
    public void onDestroy() {
        try {
            f5145a.sendEmptyMessage(1);
        } catch (Exception unused) {
            Log.d("baidu_location_service", "baidu location service stop exception...");
            this.f5153i = false;
            b();
            Process.killProcess(Process.myPid());
        }
        this.f5152h = 3;
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0053a(new WeakReference(this)), 1000L);
    }

    @Override // android.app.Service, com.baidu.location.LLSInterface
    public int onStartCommand(Intent intent, int i8, int i9) {
        return 2;
    }

    @Override // android.app.Service, com.baidu.location.LLSInterface
    public void onTaskRemoved(Intent intent) {
        Log.d("baidu_location_service", "baidu location service remove task...");
    }

    @Override // com.baidu.location.LLSInterface
    public boolean onUnBind(Intent intent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.baidu.location.e.a.a.a().b();
        c.a();
        g.a().a(f.getServiceContext());
        e.b().b(false);
        e.b().c();
        try {
            com.baidu.location.b.b.a().e();
        } catch (Exception unused) {
        }
        n.a().a(f.getServiceContext());
        m.a().b();
        com.baidu.location.c.f.a().b();
        h.a().b();
        h.a().a(f.getServiceContext());
        r.c().d();
        this.f5152h = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        d.a().b(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        d.a().a(message);
    }
}
