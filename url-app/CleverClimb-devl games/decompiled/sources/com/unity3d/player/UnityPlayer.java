package com.unity3d.player;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.Process;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.InputEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.unity3d.player.j;
import com.unity3d.player.o;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class UnityPlayer extends FrameLayout implements com.unity3d.player.d {
    public static Activity currentActivity;
    private static boolean r;

    /* renamed from: a, reason: collision with root package name */
    e f9285a;

    /* renamed from: b, reason: collision with root package name */
    i f9286b;

    /* renamed from: c, reason: collision with root package name */
    private int f9287c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9288d;
    private boolean e;
    private l f;
    private final ConcurrentLinkedQueue g;
    private BroadcastReceiver h;
    private boolean i;
    private c j;
    private TelephonyManager k;
    private j l;
    private GoogleARProxy m;
    private GoogleARCoreApi n;
    private a o;
    private Context p;
    private SurfaceView q;
    private boolean s;
    private o t;

    /* renamed from: com.unity3d.player.UnityPlayer$3, reason: invalid class name */
    class AnonymousClass3 extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ UnityPlayer f9311a;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            this.f9311a.c();
        }
    }

    class a implements SensorEventListener {
        a() {
        }

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final int f9327a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f9328b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f9329c = 3;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ int[] f9330d = {f9327a, f9328b, f9329c};
    }

    private class c extends PhoneStateListener {
        private c() {
        }

        /* synthetic */ c(UnityPlayer unityPlayer, byte b2) {
            this();
        }

        @Override // android.telephony.PhoneStateListener
        public final void onCallStateChanged(int i, String str) {
            UnityPlayer.this.nativeMuteMasterAudio(i == 1);
        }
    }

    enum d {
        PAUSE,
        RESUME,
        QUIT,
        SURFACE_LOST,
        SURFACE_ACQUIRED,
        FOCUS_LOST,
        FOCUS_GAINED,
        NEXT_FRAME
    }

    private class e extends Thread {

        /* renamed from: a, reason: collision with root package name */
        Handler f9336a;

        /* renamed from: b, reason: collision with root package name */
        boolean f9337b;

        /* renamed from: c, reason: collision with root package name */
        boolean f9338c;

        /* renamed from: d, reason: collision with root package name */
        int f9339d;
        int e;

        private e() {
            this.f9337b = false;
            this.f9338c = false;
            this.f9339d = b.f9328b;
            this.e = 5;
        }

        /* synthetic */ e(UnityPlayer unityPlayer, byte b2) {
            this();
        }

        private void a(d dVar) {
            if (this.f9336a != null) {
                Message.obtain(this.f9336a, 2269, dVar).sendToTarget();
            }
        }

        public final void a() {
            a(d.QUIT);
        }

        public final void a(Runnable runnable) {
            if (this.f9336a == null) {
                return;
            }
            a(d.PAUSE);
            Message.obtain(this.f9336a, runnable).sendToTarget();
        }

        public final void b() {
            a(d.RESUME);
        }

        public final void b(Runnable runnable) {
            if (this.f9336a == null) {
                return;
            }
            a(d.SURFACE_LOST);
            Message.obtain(this.f9336a, runnable).sendToTarget();
        }

        public final void c() {
            a(d.FOCUS_GAINED);
        }

        public final void c(Runnable runnable) {
            if (this.f9336a == null) {
                return;
            }
            Message.obtain(this.f9336a, runnable).sendToTarget();
            a(d.SURFACE_ACQUIRED);
        }

        public final void d() {
            a(d.FOCUS_LOST);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            setName("UnityMain");
            Looper.prepare();
            this.f9336a = new Handler(new Handler.Callback() { // from class: com.unity3d.player.UnityPlayer.e.1
                private void a() {
                    if (e.this.f9339d == b.f9329c && e.this.f9338c) {
                        UnityPlayer.this.nativeFocusChanged(true);
                        e.this.f9339d = b.f9327a;
                    }
                }

                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    if (message.what != 2269) {
                        return false;
                    }
                    d dVar = (d) message.obj;
                    if (dVar == d.NEXT_FRAME) {
                        return true;
                    }
                    if (dVar == d.QUIT) {
                        Looper.myLooper().quit();
                    } else if (dVar == d.RESUME) {
                        e.this.f9337b = true;
                    } else if (dVar == d.PAUSE) {
                        e.this.f9337b = false;
                    } else if (dVar == d.SURFACE_LOST) {
                        e.this.f9338c = false;
                    } else {
                        if (dVar == d.SURFACE_ACQUIRED) {
                            e.this.f9338c = true;
                        } else if (dVar == d.FOCUS_LOST) {
                            if (e.this.f9339d == b.f9327a) {
                                UnityPlayer.this.nativeFocusChanged(false);
                            }
                            e.this.f9339d = b.f9328b;
                        } else if (dVar == d.FOCUS_GAINED) {
                            e.this.f9339d = b.f9329c;
                        }
                        a();
                    }
                    return true;
                }
            });
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.unity3d.player.UnityPlayer.e.2
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    UnityPlayer.this.executeGLThreadJobs();
                    if (!e.this.f9337b || !e.this.f9338c) {
                        return true;
                    }
                    if (e.this.e >= 0) {
                        if (e.this.e == 0 && UnityPlayer.this.i()) {
                            UnityPlayer.this.a();
                        }
                        e.this.e--;
                    }
                    if (!UnityPlayer.this.isFinishing() && !UnityPlayer.this.nativeRender()) {
                        UnityPlayer.this.c();
                    }
                    Message.obtain(e.this.f9336a, 2269, d.NEXT_FRAME).sendToTarget();
                    return true;
                }
            });
            Looper.loop();
        }
    }

    private abstract class f implements Runnable {
        private f() {
        }

        /* synthetic */ f(UnityPlayer unityPlayer, byte b2) {
            this();
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            if (UnityPlayer.this.isFinishing()) {
                return;
            }
            a();
        }
    }

    static {
        new k().a();
        r = false;
        r = loadLibraryStatic("main");
    }

    public UnityPlayer(Context context) {
        super(context);
        this.f9287c = -1;
        byte b2 = 0;
        this.f9288d = false;
        this.e = true;
        this.f = new l();
        this.g = new ConcurrentLinkedQueue();
        this.h = null;
        this.f9285a = new e(this, b2);
        this.i = false;
        this.j = new c(this, b2);
        this.m = null;
        this.n = null;
        this.o = new a();
        this.f9286b = null;
        if (context instanceof Activity) {
            currentActivity = (Activity) context;
            this.f9287c = currentActivity.getRequestedOrientation();
        }
        a(currentActivity);
        this.p = context;
        if (currentActivity != null && i()) {
            this.l = new j(this.p, j.a.a()[getSplashMode()]);
            addView(this.l);
        }
        if (h.f9362c) {
            if (currentActivity != null) {
                h.f9363d.a(currentActivity, new Runnable() { // from class: com.unity3d.player.UnityPlayer.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        UnityPlayer.this.a(new Runnable() { // from class: com.unity3d.player.UnityPlayer.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                UnityPlayer.this.f.d();
                                UnityPlayer.this.f();
                            }
                        });
                    }
                });
            } else {
                this.f.d();
            }
        }
        a(this.p.getApplicationInfo());
        if (!l.c()) {
            AlertDialog create = new AlertDialog.Builder(this.p).setTitle("Failure to initialize!").setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: com.unity3d.player.UnityPlayer.13
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    UnityPlayer.this.c();
                }
            }).setMessage("Your hardware does not support this application, sorry!").create();
            create.setCancelable(false);
            create.show();
            return;
        }
        initJni(context);
        this.q = b();
        addView(this.q);
        bringChildToFront(this.l);
        this.s = false;
        nativeInitWebRequest(UnityWebRequest.class);
        k();
        this.k = (TelephonyManager) this.p.getSystemService("phone");
        this.f9285a.start();
    }

    public static void UnitySendMessage(String str, String str2, String str3) {
        if (l.c()) {
            nativeUnitySendMessage(str, str2, str3);
            return;
        }
        com.unity3d.player.e.Log(5, "Native libraries not loaded - dropping message for " + str + "." + str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        a(new Runnable() { // from class: com.unity3d.player.UnityPlayer.15
            @Override // java.lang.Runnable
            public final void run() {
                UnityPlayer.this.removeView(UnityPlayer.this.l);
                UnityPlayer.h(UnityPlayer.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Surface surface) {
        if (this.f9288d) {
            return;
        }
        b(0, surface);
    }

    private static void a(Activity activity) {
        View decorView;
        if (activity == null || !activity.getIntent().getBooleanExtra("android.intent.extra.VR_LAUNCH", false) || activity.getWindow() == null || (decorView = activity.getWindow().getDecorView()) == null) {
            return;
        }
        decorView.setSystemUiVisibility(7);
    }

    private static void a(ApplicationInfo applicationInfo) {
        if (r && NativeLoader.load(applicationInfo.nativeLibraryDir)) {
            l.a();
        }
    }

    private void a(View view, View view2) {
        boolean z;
        if (this.f.e()) {
            z = false;
        } else {
            pause();
            z = true;
        }
        if (view != null) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof UnityPlayer) || ((UnityPlayer) parent) != this) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                }
                addView(view);
                bringChildToFront(view);
                view.setVisibility(0);
            }
        }
        if (view2 != null && view2.getParent() == this) {
            view2.setVisibility(8);
            removeView(view2);
        }
        if (z) {
            resume();
        }
    }

    private void a(f fVar) {
        if (isFinishing()) {
            return;
        }
        b(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SurfaceView b() {
        SurfaceView surfaceView = new SurfaceView(this.p);
        surfaceView.getHolder().setFormat(-3);
        surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() { // from class: com.unity3d.player.UnityPlayer.16
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                UnityPlayer.this.a(0, surfaceHolder.getSurface());
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                UnityPlayer.this.a(0, surfaceHolder.getSurface());
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                UnityPlayer.this.a(0, (Surface) null);
            }
        });
        surfaceView.setFocusable(true);
        surfaceView.setFocusableInTouchMode(true);
        return surfaceView;
    }

    private void b(Runnable runnable) {
        if (l.c()) {
            if (Thread.currentThread() == this.f9285a) {
                runnable.run();
            } else {
                this.g.add(runnable);
            }
        }
    }

    private boolean b(final int i, final Surface surface) {
        if (!l.c()) {
            return false;
        }
        final Semaphore semaphore = new Semaphore(0);
        Runnable runnable = new Runnable() { // from class: com.unity3d.player.UnityPlayer.17
            @Override // java.lang.Runnable
            public final void run() {
                UnityPlayer.this.nativeRecreateGfxState(i, surface);
                semaphore.release();
            }
        };
        if (i != 0) {
            runnable.run();
        } else if (surface == null) {
            this.f9285a.b(runnable);
        } else {
            this.f9285a.c(runnable);
        }
        if (surface != null || i != 0) {
            return true;
        }
        try {
            if (semaphore.tryAcquire(4L, TimeUnit.SECONDS)) {
                return true;
            }
            com.unity3d.player.e.Log(5, "Timeout while trying detaching primary window.");
            return true;
        } catch (InterruptedException unused) {
            com.unity3d.player.e.Log(5, "UI thread got interrupted while trying to detach the primary window from the Unity Engine.");
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (!(this.p instanceof Activity) || ((Activity) this.p).isFinishing()) {
            return;
        }
        ((Activity) this.p).finish();
    }

    private void d() {
        reportSoftInputStr(null, 1, true);
        if (this.f.g()) {
            if (l.c()) {
                final Semaphore semaphore = new Semaphore(0);
                this.f9285a.a(isFinishing() ? new Runnable() { // from class: com.unity3d.player.UnityPlayer.19
                    @Override // java.lang.Runnable
                    public final void run() {
                        UnityPlayer.this.e();
                        semaphore.release();
                    }
                } : new Runnable() { // from class: com.unity3d.player.UnityPlayer.20
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (!UnityPlayer.this.nativePause()) {
                            semaphore.release();
                            return;
                        }
                        UnityPlayer.m(UnityPlayer.this);
                        UnityPlayer.this.e();
                        semaphore.release(2);
                    }
                });
                try {
                    if (!semaphore.tryAcquire(4L, TimeUnit.SECONDS)) {
                        com.unity3d.player.e.Log(5, "Timeout while trying to pause the Unity Engine.");
                    }
                } catch (InterruptedException unused) {
                    com.unity3d.player.e.Log(5, "UI thread got interrupted while trying to pause the Unity Engine.");
                }
                if (semaphore.drainPermits() > 0) {
                    quit();
                }
            }
            this.f.c(false);
            this.f.b(true);
            if (this.i) {
                this.k.listen(this.j, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        nativeDone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f.f()) {
            this.f.c(true);
            b(new Runnable() { // from class: com.unity3d.player.UnityPlayer.4
                @Override // java.lang.Runnable
                public final void run() {
                    UnityPlayer.this.nativeResume();
                }
            });
            this.f9285a.b();
        }
    }

    private static void g() {
        if (l.c()) {
            if (!NativeLoader.unload()) {
                throw new UnsatisfiedLinkError("Unable to unload libraries from libmain.so");
            }
            l.b();
        }
    }

    private ApplicationInfo h() {
        return this.p.getPackageManager().getApplicationInfo(this.p.getPackageName(), 128);
    }

    static /* synthetic */ j h(UnityPlayer unityPlayer) {
        unityPlayer.l = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        try {
            return h().metaData.getBoolean("unity.splash-enable");
        } catch (Exception unused) {
            return false;
        }
    }

    private final native void initJni(Context context);

    private boolean j() {
        try {
            return h().metaData.getBoolean("unity.tango-enable");
        } catch (Exception unused) {
            return false;
        }
    }

    private void k() {
        if (this.p instanceof Activity) {
            ((Activity) this.p).getWindow().setFlags(1024, 1024);
        }
    }

    protected static boolean loadLibraryStatic(String str) {
        StringBuilder sb;
        try {
            System.loadLibrary(str);
            return true;
        } catch (Exception e2) {
            sb = new StringBuilder("Unknown error ");
            sb.append(e2);
            com.unity3d.player.e.Log(6, sb.toString());
            return false;
        } catch (UnsatisfiedLinkError unused) {
            sb = new StringBuilder("Unable to find ");
            sb.append(str);
            com.unity3d.player.e.Log(6, sb.toString());
            return false;
        }
    }

    static /* synthetic */ boolean m(UnityPlayer unityPlayer) {
        unityPlayer.s = true;
        return true;
    }

    private final native void nativeDone();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeFocusChanged(boolean z);

    private final native void nativeInitWebRequest(Class cls);

    private final native boolean nativeInjectEvent(InputEvent inputEvent);

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean nativeIsAutorotationOn();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeLowMemory();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeMuteMasterAudio(boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean nativePause();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeRecreateGfxState(int i, Surface surface);

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean nativeRender();

    private final native void nativeRestartActivityIndicator();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeResume();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetInputString(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputCanceled();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputClosed();

    private final native void nativeSoftInputLostFocus();

    private static native void nativeUnitySendMessage(String str, String str2, String str3);

    static /* synthetic */ o t(UnityPlayer unityPlayer) {
        unityPlayer.t = null;
        return null;
    }

    final void a(Runnable runnable) {
        if (this.p instanceof Activity) {
            ((Activity) this.p).runOnUiThread(runnable);
        } else {
            com.unity3d.player.e.Log(5, "Not running Unity from an Activity; ignored...");
        }
    }

    protected void addPhoneCallListener() {
        this.i = true;
        this.k.listen(this.j, 32);
    }

    @Override // com.unity3d.player.d
    public boolean addViewToPlayer(View view, boolean z) {
        a(view, z ? this.q : null);
        boolean z2 = false;
        boolean z3 = view.getParent() == this;
        boolean z4 = z && this.q.getParent() == null;
        boolean z5 = this.q.getParent() == this;
        if (z3 && (z4 || z5)) {
            z2 = true;
        }
        if (!z2) {
            if (!z3) {
                com.unity3d.player.e.Log(6, "addViewToPlayer: Failure adding view to hierarchy");
            }
            if (!z4 && !z5) {
                com.unity3d.player.e.Log(6, "addViewToPlayer: Failure removing old view from hierarchy");
            }
        }
        return z2;
    }

    public void configurationChanged(Configuration configuration) {
        if (this.q instanceof SurfaceView) {
            this.q.getHolder().setSizeFromLayout();
        }
        if (this.t != null) {
            this.t.c();
        }
        GoogleVrProxy b2 = GoogleVrApi.b();
        if (b2 != null) {
            b2.c();
        }
    }

    protected void disableLogger() {
        com.unity3d.player.e.f9358a = true;
    }

    public boolean displayChanged(int i, Surface surface) {
        if (i == 0) {
            this.f9288d = surface != null;
            a(new Runnable() { // from class: com.unity3d.player.UnityPlayer.18
                @Override // java.lang.Runnable
                public final void run() {
                    if (UnityPlayer.this.f9288d) {
                        UnityPlayer.this.removeView(UnityPlayer.this.q);
                    } else {
                        UnityPlayer.this.addView(UnityPlayer.this.q);
                    }
                }
            });
        }
        return b(i, surface);
    }

    protected void executeGLThreadJobs() {
        while (true) {
            Runnable runnable = (Runnable) this.g.poll();
            if (runnable == null) {
                return;
            } else {
                runnable.run();
            }
        }
    }

    public Bundle getSettings() {
        return Bundle.EMPTY;
    }

    protected int getSplashMode() {
        try {
            return h().metaData.getInt("unity.splash-mode");
        } catch (Exception unused) {
            return 0;
        }
    }

    public View getView() {
        return this;
    }

    protected void hideSoftInput() {
        final Runnable runnable = new Runnable() { // from class: com.unity3d.player.UnityPlayer.6
            @Override // java.lang.Runnable
            public final void run() {
                if (UnityPlayer.this.f9286b != null) {
                    UnityPlayer.this.f9286b.dismiss();
                    UnityPlayer.this.f9286b = null;
                }
            }
        };
        if (h.f9361b) {
            a(new f() { // from class: com.unity3d.player.UnityPlayer.7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(UnityPlayer.this, (byte) 0);
                }

                @Override // com.unity3d.player.UnityPlayer.f
                public final void a() {
                    UnityPlayer.this.a(runnable);
                }
            });
        } else {
            a(runnable);
        }
    }

    public void init(int i, boolean z) {
    }

    protected boolean initializeGoogleAr() {
        if (this.m != null || currentActivity == null || !j()) {
            return false;
        }
        if (GoogleARProxy.a()) {
            this.m = new GoogleARProxy(this);
            this.m.a(currentActivity, this.p);
            this.m.b();
            if (!this.f.e()) {
                this.m.d();
            }
            return this.m.e();
        }
        this.n = new GoogleARCoreApi();
        this.n.initializeARCore(currentActivity);
        if (this.f.e()) {
            return false;
        }
        this.n.resumeARCore();
        return false;
    }

    protected boolean initializeGoogleVr() {
        final GoogleVrProxy b2 = GoogleVrApi.b();
        if (b2 == null) {
            GoogleVrApi.a(this);
            b2 = GoogleVrApi.b();
            if (b2 == null) {
                com.unity3d.player.e.Log(6, "Unable to create Google VR subsystem.");
                return false;
            }
        }
        final Semaphore semaphore = new Semaphore(0);
        final Runnable runnable = new Runnable() { // from class: com.unity3d.player.UnityPlayer.10
            @Override // java.lang.Runnable
            public final void run() {
                UnityPlayer.this.injectEvent(new KeyEvent(0, 4));
                UnityPlayer.this.injectEvent(new KeyEvent(1, 4));
            }
        };
        a(new Runnable() { // from class: com.unity3d.player.UnityPlayer.11
            @Override // java.lang.Runnable
            public final void run() {
                if (!b2.a(UnityPlayer.currentActivity, UnityPlayer.this.p, UnityPlayer.this.b(), runnable)) {
                    com.unity3d.player.e.Log(6, "Unable to initialize Google VR subsystem.");
                }
                if (UnityPlayer.currentActivity != null) {
                    b2.a(UnityPlayer.currentActivity.getIntent());
                }
                semaphore.release();
            }
        });
        try {
            if (semaphore.tryAcquire(4L, TimeUnit.SECONDS)) {
                return b2.a();
            }
            com.unity3d.player.e.Log(5, "Timeout while trying to initialize Google VR.");
            return false;
        } catch (InterruptedException e2) {
            com.unity3d.player.e.Log(5, "UI thread was interrupted while initializing Google VR. " + e2.getLocalizedMessage());
            return false;
        }
    }

    public boolean injectEvent(InputEvent inputEvent) {
        return nativeInjectEvent(inputEvent);
    }

    protected boolean isFinishing() {
        if (!this.s) {
            boolean z = (this.p instanceof Activity) && ((Activity) this.p).isFinishing();
            this.s = z;
            if (!z) {
                return false;
            }
        }
        return true;
    }

    protected void kill() {
        Process.killProcess(Process.myPid());
    }

    protected boolean loadLibrary(String str) {
        return loadLibraryStatic(str);
    }

    public void lowMemory() {
        b(new Runnable() { // from class: com.unity3d.player.UnityPlayer.2
            @Override // java.lang.Runnable
            public final void run() {
                UnityPlayer.this.nativeLowMemory();
            }
        });
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        return injectEvent(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return injectEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return injectEvent(motionEvent);
    }

    public void pause() {
        if (this.m != null) {
            this.m.c();
        } else if (this.n != null) {
            this.n.pauseARCore();
        }
        if (this.t != null) {
            this.t.a();
        }
        GoogleVrProxy b2 = GoogleVrApi.b();
        if (b2 != null) {
            b2.pauseGvrLayout();
        }
        d();
    }

    public void quit() {
        if (GoogleVrApi.b() != null) {
            GoogleVrApi.a();
        }
        this.s = true;
        if (!this.f.e()) {
            pause();
        }
        this.f9285a.a();
        try {
            this.f9285a.join(4000L);
        } catch (InterruptedException unused) {
            this.f9285a.interrupt();
        }
        if (this.h != null) {
            this.p.unregisterReceiver(this.h);
        }
        this.h = null;
        if (l.c()) {
            removeAllViews();
        }
        kill();
        g();
    }

    @Override // com.unity3d.player.d
    public void removeViewFromPlayer(View view) {
        a(this.q, view);
        boolean z = false;
        boolean z2 = view.getParent() == null;
        boolean z3 = this.q.getParent() == this;
        if (z2 && z3) {
            z = true;
        }
        if (z) {
            return;
        }
        if (!z2) {
            com.unity3d.player.e.Log(6, "removeViewFromPlayer: Failure removing view from hierarchy");
        }
        if (z3) {
            return;
        }
        com.unity3d.player.e.Log(6, "removeVireFromPlayer: Failure agging old view to hierarchy");
    }

    @Override // com.unity3d.player.d
    public void reportError(String str, String str2) {
        com.unity3d.player.e.Log(6, str + ": " + str2);
    }

    protected void reportSoftInputStr(final String str, final int i, final boolean z) {
        if (i == 1) {
            hideSoftInput();
        }
        a(new f() { // from class: com.unity3d.player.UnityPlayer.9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(UnityPlayer.this, (byte) 0);
            }

            @Override // com.unity3d.player.UnityPlayer.f
            public final void a() {
                if (z) {
                    UnityPlayer.this.nativeSoftInputCanceled();
                } else if (str != null) {
                    UnityPlayer.this.nativeSetInputString(str);
                }
                if (i == 1) {
                    UnityPlayer.this.nativeSoftInputClosed();
                }
            }
        });
    }

    public void resume() {
        if (this.m != null) {
            this.m.d();
        } else if (this.n != null) {
            this.n.resumeARCore();
        }
        this.f.b(false);
        if (this.t != null) {
            this.t.b();
        }
        f();
        nativeRestartActivityIndicator();
        GoogleVrProxy b2 = GoogleVrApi.b();
        if (b2 != null) {
            b2.b();
        }
    }

    protected void setSoftInputStr(final String str) {
        a(new Runnable() { // from class: com.unity3d.player.UnityPlayer.8
            @Override // java.lang.Runnable
            public final void run() {
                if (UnityPlayer.this.f9286b == null || str == null) {
                    return;
                }
                UnityPlayer.this.f9286b.a(str);
            }
        });
    }

    protected void showSoftInput(final String str, final int i, final boolean z, final boolean z2, final boolean z3, final boolean z4, final String str2) {
        a(new Runnable() { // from class: com.unity3d.player.UnityPlayer.5
            @Override // java.lang.Runnable
            public final void run() {
                UnityPlayer.this.f9286b = new i(UnityPlayer.this.p, this, str, i, z, z2, z3, str2);
                UnityPlayer.this.f9286b.show();
            }
        });
    }

    protected boolean showVideoPlayer(String str, int i, int i2, int i3, boolean z, int i4, int i5) {
        if (this.t == null) {
            this.t = new o(this);
        }
        boolean a2 = this.t.a(this.p, str, i, i2, i3, z, i4, i5, new o.a() { // from class: com.unity3d.player.UnityPlayer.12
            @Override // com.unity3d.player.o.a
            public final void a() {
                UnityPlayer.t(UnityPlayer.this);
            }
        });
        if (a2) {
            a(new Runnable() { // from class: com.unity3d.player.UnityPlayer.14
                @Override // java.lang.Runnable
                public final void run() {
                    if (UnityPlayer.this.nativeIsAutorotationOn() && (UnityPlayer.this.p instanceof Activity)) {
                        ((Activity) UnityPlayer.this.p).setRequestedOrientation(UnityPlayer.this.f9287c);
                    }
                }
            });
        }
        return a2;
    }

    public void start() {
    }

    public void stop() {
    }

    protected void toggleGyroscopeSensor(boolean z) {
        SensorManager sensorManager = (SensorManager) this.p.getSystemService(com.umeng.commonsdk.proguard.d.aa);
        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        if (z) {
            sensorManager.registerListener(this.o, defaultSensor, 1);
        } else {
            sensorManager.unregisterListener(this.o);
        }
    }

    public void windowFocusChanged(boolean z) {
        this.f.a(z);
        if (z && this.f9286b != null) {
            nativeSoftInputLostFocus();
            reportSoftInputStr(null, 1, false);
        }
        if (z) {
            this.f9285a.c();
        } else {
            this.f9285a.d();
        }
        f();
    }
}
