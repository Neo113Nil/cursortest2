package com.cmplay.gppay.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.android.vending.licensing.ILicensingService;
import com.android.vending.licensing.a;
import com.tapjoy.TapjoyConstants;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes.dex */
public class c implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private static final SecureRandom f4121a = new SecureRandom();

    /* renamed from: b, reason: collision with root package name */
    private ILicensingService f4122b;

    /* renamed from: c, reason: collision with root package name */
    private PublicKey f4123c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f4124d;
    private final h e;
    private Handler f;
    private final String g;
    private final String h;
    private final Set<e> i = new HashSet();
    private final Queue<e> j = new LinkedList();

    private class a extends a.AbstractBinderC0295a {

        /* renamed from: b, reason: collision with root package name */
        private final e f4126b;

        /* renamed from: c, reason: collision with root package name */
        private Runnable f4127c;

        public a(e eVar) {
            this.f4126b = eVar;
            this.f4127c = new Runnable() { // from class: com.cmplay.gppay.b.c.a.1
                @Override // java.lang.Runnable
                public void run() {
                    Log.i("LicenseChecker", "Check timed out.");
                    c.this.b(a.this.f4126b);
                    c.this.a(a.this.f4126b);
                }
            };
            a();
        }

        private void a() {
            Log.i("LicenseChecker", "Start monitoring timeout.");
            c.this.f.postDelayed(this.f4127c, TapjoyConstants.TIMER_INCREMENT);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            Log.i("LicenseChecker", "Clearing timeout.");
            c.this.f.removeCallbacks(this.f4127c);
        }

        @Override // com.android.vending.licensing.a
        public void a(final int i, final String str, final String str2) {
            c.this.f.post(new Runnable() { // from class: com.cmplay.gppay.b.c.a.2
                @Override // java.lang.Runnable
                public void run() {
                    Log.i("LicenseChecker", "Received response.");
                    if (c.this.i.contains(a.this.f4126b)) {
                        a.this.b();
                        a.this.f4126b.a(c.this.f4123c, i, str, str2);
                        c.this.a(a.this.f4126b);
                    }
                }
            });
        }
    }

    public c(Context context, h hVar, String str) {
        this.f4124d = context;
        this.e = hVar;
        this.f4123c = a(str);
        this.g = this.f4124d.getPackageName();
        this.h = a(context, this.g);
        HandlerThread handlerThread = new HandlerThread("background thread");
        handlerThread.start();
        this.f = new Handler(handlerThread.getLooper());
    }

    private static String a(Context context, String str) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(str, 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("LicenseChecker", "Package not found. could not get version code.");
            return "";
        }
    }

    private static PublicKey a(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(com.cmplay.gppay.b.a.a.a(str)));
        } catch (com.cmplay.gppay.b.a.b e) {
            Log.e("LicenseChecker", "Could not decode from Base64.");
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        } catch (InvalidKeySpecException e3) {
            Log.e("LicenseChecker", "Invalid key specification.");
            throw new IllegalArgumentException(e3);
        }
    }

    private void a() {
        while (true) {
            e poll = this.j.poll();
            if (poll == null) {
                return;
            }
            try {
                Log.i("LicenseChecker", "Calling checkLicense on service for " + poll.c());
                this.f4122b.a((long) poll.b(), poll.c(), new a(poll));
                this.i.add(poll);
            } catch (RemoteException e) {
                Log.w("LicenseChecker", "RemoteException in checkLicense call.", e);
                b(poll);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(e eVar) {
        this.i.remove(eVar);
        if (this.i.isEmpty()) {
            b();
        }
    }

    private void b() {
        if (this.f4122b != null) {
            try {
                this.f4124d.unbindService(this);
            } catch (IllegalArgumentException unused) {
                Log.e("LicenseChecker", "Unable to unbind from licensing service (already unbound)");
            }
            this.f4122b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(e eVar) {
        this.e.a(291, null);
        if (this.e.a()) {
            eVar.a().a(291);
        } else {
            eVar.a().b(291);
        }
    }

    private int c() {
        return f4121a.nextInt();
    }

    public synchronized void a(d dVar) {
        if (this.e.a()) {
            Log.i("LicenseChecker", "Using cached license response");
            dVar.a(256);
        } else {
            e eVar = new e(this.e, new f(), dVar, c(), this.g, this.h);
            if (this.f4122b == null) {
                Log.i("LicenseChecker", "Binding to licensing service.");
                try {
                    if (this.f4124d.bindService(new Intent(new String(com.cmplay.gppay.b.a.a.a("Y29tLmFuZHJvaWQudmVuZGluZy5saWNlbnNpbmcuSUxpY2Vuc2luZ1NlcnZpY2U="))).setPackage(new String(com.cmplay.gppay.b.a.a.a("Y29tLmFuZHJvaWQudmVuZGluZw=="))), this, 1)) {
                        this.j.offer(eVar);
                    } else {
                        Log.e("LicenseChecker", "Could not bind to service.");
                        b(eVar);
                    }
                } catch (com.cmplay.gppay.b.a.b e) {
                    e.printStackTrace();
                } catch (SecurityException unused) {
                    dVar.c(6);
                }
            } else {
                this.j.offer(eVar);
                a();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f4122b = ILicensingService.a.a(iBinder);
        a();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceDisconnected(ComponentName componentName) {
        Log.w("LicenseChecker", "Service unexpectedly disconnected.");
        this.f4122b = null;
    }
}
