package com.anythink.basead.exoplayer.l;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.WindowManager;
import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final long f8765a = 500;

    /* renamed from: b, reason: collision with root package name */
    private static final long f8766b = 20000000;

    /* renamed from: c, reason: collision with root package name */
    private static final long f8767c = 80;

    /* renamed from: d, reason: collision with root package name */
    private static final int f8768d = 6;

    /* renamed from: e, reason: collision with root package name */
    private final WindowManager f8769e;

    /* renamed from: f, reason: collision with root package name */
    private final b f8770f;

    /* renamed from: g, reason: collision with root package name */
    private final a f8771g;

    /* renamed from: h, reason: collision with root package name */
    private long f8772h;
    private long i;

    /* renamed from: j, reason: collision with root package name */
    private long f8773j;

    /* renamed from: k, reason: collision with root package name */
    private long f8774k;

    /* renamed from: l, reason: collision with root package name */
    private long f8775l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f8776m;

    /* renamed from: n, reason: collision with root package name */
    private long f8777n;

    /* renamed from: o, reason: collision with root package name */
    private long f8778o;

    /* renamed from: p, reason: collision with root package name */
    private long f8779p;

    public final class a implements DisplayManager.DisplayListener {

        /* renamed from: b, reason: collision with root package name */
        private final DisplayManager f8781b;

        public a(DisplayManager displayManager) {
            this.f8781b = displayManager;
        }

        public final void a() {
            this.f8781b.registerDisplayListener(this, null);
        }

        public final void b() {
            this.f8781b.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            if (i == 0) {
                f.this.c();
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }
    }

    public static final class b implements Handler.Callback, Choreographer.FrameCallback {

        /* renamed from: b, reason: collision with root package name */
        private static final int f8782b = 0;

        /* renamed from: c, reason: collision with root package name */
        private static final int f8783c = 1;

        /* renamed from: d, reason: collision with root package name */
        private static final int f8784d = 2;

        /* renamed from: e, reason: collision with root package name */
        private static final b f8785e = new b();

        /* renamed from: a, reason: collision with root package name */
        public volatile long f8786a = com.anythink.basead.exoplayer.b.f6539b;

        /* renamed from: f, reason: collision with root package name */
        private final Handler f8787f;

        /* renamed from: g, reason: collision with root package name */
        private final HandlerThread f8788g;

        /* renamed from: h, reason: collision with root package name */
        private Choreographer f8789h;
        private int i;

        private b() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            this.f8788g = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper(), this);
            this.f8787f = handler;
            handler.sendEmptyMessage(0);
        }

        public static b a() {
            return f8785e;
        }

        private void d() {
            this.f8789h = Choreographer.getInstance();
        }

        private void e() {
            Choreographer choreographer = this.f8789h;
            if (choreographer != null) {
                int i = this.i + 1;
                this.i = i;
                if (i == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void f() {
            Choreographer choreographer = this.f8789h;
            if (choreographer != null) {
                int i = this.i - 1;
                this.i = i;
                if (i == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f8786a = com.anythink.basead.exoplayer.b.f6539b;
                }
            }
        }

        public final void b() {
            this.f8787f.sendEmptyMessage(1);
        }

        public final void c() {
            this.f8787f.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j9) {
            if (this.f8789h != null) {
                this.f8786a = j9;
                this.f8789h.postFrameCallbackDelayed(this, 500L);
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                try {
                    this.f8789h = Choreographer.getInstance();
                } catch (Throwable unused) {
                }
                return true;
            }
            if (i == 1) {
                Choreographer choreographer = this.f8789h;
                if (choreographer != null) {
                    int i4 = this.i + 1;
                    this.i = i4;
                    if (i4 == 1) {
                        choreographer.postFrameCallback(this);
                    }
                }
                return true;
            }
            if (i != 2) {
                return false;
            }
            Choreographer choreographer2 = this.f8789h;
            if (choreographer2 != null) {
                int i9 = this.i - 1;
                this.i = i9;
                if (i9 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f8786a = com.anythink.basead.exoplayer.b.f6539b;
                }
            }
            return true;
        }
    }

    public f() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            if (this.f8769e.getDefaultDisplay() != null) {
                long refreshRate = (long) (1.0E9d / r0.getRefreshRate());
                this.f8772h = refreshRate;
                this.i = (refreshRate * f8767c) / 100;
            }
        } catch (Throwable unused) {
        }
    }

    public final void b() {
        if (this.f8769e != null) {
            a aVar = this.f8771g;
            if (aVar != null) {
                aVar.b();
            }
            this.f8770f.c();
        }
    }

    public f(Context context) {
        DisplayManager displayManager;
        a aVar = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.f8769e = (WindowManager) context.getSystemService("window");
        } else {
            this.f8769e = null;
        }
        if (this.f8769e != null) {
            if (af.f8503a >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
                aVar = new a(displayManager);
            }
            this.f8771g = aVar;
            this.f8770f = b.a();
        } else {
            this.f8771g = null;
            this.f8770f = null;
        }
        this.f8772h = com.anythink.basead.exoplayer.b.f6539b;
        this.i = com.anythink.basead.exoplayer.b.f6539b;
    }

    public final void a() {
        this.f8776m = false;
        if (this.f8769e != null) {
            this.f8770f.b();
            a aVar = this.f8771g;
            if (aVar != null) {
                aVar.a();
            }
            c();
        }
    }

    private boolean b(long j9, long j10) {
        return Math.abs((j10 - this.f8777n) - (j9 - this.f8778o)) > f8766b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j9, long j10) {
        long j11;
        long j12;
        b bVar;
        long j13;
        long j14;
        long j15 = 1000 * j9;
        if (this.f8776m) {
            if (j9 != this.f8773j) {
                this.f8779p++;
                this.f8774k = this.f8775l;
            }
            long j16 = this.f8779p;
            if (j16 >= 6) {
                j12 = this.f8774k + ((j15 - this.f8778o) / j16);
                if (b(j12, j10)) {
                    this.f8776m = false;
                } else {
                    j11 = (this.f8777n + j12) - this.f8778o;
                    if (!this.f8776m) {
                        this.f8778o = j15;
                        this.f8777n = j10;
                        this.f8779p = 0L;
                        this.f8776m = true;
                    }
                    this.f8773j = j9;
                    this.f8775l = j12;
                    bVar = this.f8770f;
                    if (bVar != null && this.f8772h != com.anythink.basead.exoplayer.b.f6539b) {
                        j13 = bVar.f8786a;
                        if (j13 != com.anythink.basead.exoplayer.b.f6539b) {
                            long j17 = this.f8772h;
                            long j18 = (((j11 - j13) / j17) * j17) + j13;
                            if (j11 <= j18) {
                                j14 = j18 - j17;
                            } else {
                                j14 = j18;
                                j18 = j17 + j18;
                            }
                            if (j18 - j11 >= j11 - j14) {
                                j18 = j14;
                            }
                            return j18 - this.i;
                        }
                    }
                    return j11;
                }
            } else if (b(j15, j10)) {
                this.f8776m = false;
            }
        }
        j11 = j10;
        j12 = j15;
        if (!this.f8776m) {
        }
        this.f8773j = j9;
        this.f8775l = j12;
        bVar = this.f8770f;
        if (bVar != null) {
            j13 = bVar.f8786a;
            if (j13 != com.anythink.basead.exoplayer.b.f6539b) {
            }
        }
        return j11;
    }

    private a a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return new a(displayManager);
    }

    private static long a(long j9, long j10, long j11) {
        long j12;
        long j13 = (((j9 - j10) / j11) * j11) + j10;
        if (j9 <= j13) {
            j12 = j13 - j11;
        } else {
            j12 = j13;
            j13 = j11 + j13;
        }
        return j13 - j9 < j9 - j12 ? j13 : j12;
    }
}
