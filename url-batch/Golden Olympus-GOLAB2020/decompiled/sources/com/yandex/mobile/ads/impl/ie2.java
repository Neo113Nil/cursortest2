package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

/* loaded from: classes3.dex */
public final class ie2 {

    /* renamed from: a, reason: collision with root package name */
    private final ab0 f27165a = new ab0();

    /* renamed from: b, reason: collision with root package name */
    private final b f27166b;

    /* renamed from: c, reason: collision with root package name */
    private final e f27167c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f27168d;

    /* renamed from: e, reason: collision with root package name */
    private Surface f27169e;

    /* renamed from: f, reason: collision with root package name */
    private float f27170f;

    /* renamed from: g, reason: collision with root package name */
    private float f27171g;

    /* renamed from: h, reason: collision with root package name */
    private float f27172h;

    /* renamed from: i, reason: collision with root package name */
    private float f27173i;

    /* renamed from: j, reason: collision with root package name */
    private int f27174j;

    /* renamed from: k, reason: collision with root package name */
    private long f27175k;

    /* renamed from: l, reason: collision with root package name */
    private long f27176l;

    /* renamed from: m, reason: collision with root package name */
    private long f27177m;

    /* renamed from: n, reason: collision with root package name */
    private long f27178n;

    /* renamed from: o, reason: collision with root package name */
    private long f27179o;

    /* renamed from: p, reason: collision with root package name */
    private long f27180p;

    /* renamed from: q, reason: collision with root package name */
    private long f27181q;

    private static final class a {
        public static void a(Surface surface, float f4) {
            try {
                surface.setFrameRate(f4, f4 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e4) {
                ms0.a("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface b {

        public interface a {
            void a(Display display);
        }

        void a();

        void a(a aVar);
    }

    private static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final WindowManager f27182a;

        @Override // com.yandex.mobile.ads.impl.ie2.b
        public final void a() {
        }

        private c(WindowManager windowManager) {
            this.f27182a = windowManager;
        }

        @Override // com.yandex.mobile.ads.impl.ie2.b
        public final void a(b.a aVar) {
            aVar.a(this.f27182a.getDefaultDisplay());
        }
    }

    private static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: f, reason: collision with root package name */
        private static final e f27185f = new e();

        /* renamed from: b, reason: collision with root package name */
        public volatile long f27186b = -9223372036854775807L;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f27187c;

        /* renamed from: d, reason: collision with root package name */
        private Choreographer f27188d;

        /* renamed from: e, reason: collision with root package name */
        private int f27189e;

        private e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Handler a4 = u82.a(handlerThread.getLooper(), (Handler.Callback) this);
            this.f27187c = a4;
            a4.sendEmptyMessage(0);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j4) {
            this.f27186b = j4;
            Choreographer choreographer = this.f27188d;
            choreographer.getClass();
            choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 0) {
                try {
                    this.f27188d = Choreographer.getInstance();
                } catch (RuntimeException e4) {
                    ms0.b("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e4);
                }
                return true;
            }
            if (i4 == 1) {
                Choreographer choreographer = this.f27188d;
                if (choreographer != null) {
                    int i5 = this.f27189e + 1;
                    this.f27189e = i5;
                    if (i5 == 1) {
                        choreographer.postFrameCallback(this);
                    }
                }
                return true;
            }
            if (i4 != 2) {
                return false;
            }
            Choreographer choreographer2 = this.f27188d;
            if (choreographer2 != null) {
                int i6 = this.f27189e - 1;
                this.f27189e = i6;
                if (i6 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f27186b = -9223372036854775807L;
                }
            }
            return true;
        }

        public static e a() {
            return f27185f;
        }
    }

    public ie2(Context context) {
        b a4 = a(context);
        this.f27166b = a4;
        this.f27167c = a4 != null ? e.a() : null;
        this.f27175k = -9223372036854775807L;
        this.f27176l = -9223372036854775807L;
        this.f27170f = -1.0f;
        this.f27173i = 1.0f;
        this.f27174j = 0;
    }

    private void d() {
        if (u82.f32873a < 30 || this.f27169e == null) {
            return;
        }
        float b4 = this.f27165a.e() ? this.f27165a.b() : this.f27170f;
        float f4 = this.f27171g;
        if (b4 == f4) {
            return;
        }
        if (b4 != -1.0f && f4 != -1.0f) {
            if (Math.abs(b4 - this.f27171g) < ((!this.f27165a.e() || this.f27165a.d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (b4 == -1.0f && this.f27165a.c() < 30) {
            return;
        }
        this.f27171g = b4;
        a(false);
    }

    public final void b(long j4) {
        long j5 = this.f27178n;
        if (j5 != -1) {
            this.f27180p = j5;
            this.f27181q = this.f27179o;
        }
        this.f27177m++;
        this.f27165a.a(j4 * 1000);
        d();
    }

    public final void c() {
        Surface surface;
        this.f27168d = false;
        b bVar = this.f27166b;
        if (bVar != null) {
            bVar.a();
            e eVar = this.f27167c;
            eVar.getClass();
            eVar.f27187c.sendEmptyMessage(2);
        }
        if (u82.f32873a < 30 || (surface = this.f27169e) == null || this.f27174j == Integer.MIN_VALUE || this.f27172h == 0.0f) {
            return;
        }
        this.f27172h = 0.0f;
        a.a(surface, 0.0f);
    }

    private static final class d implements b, DisplayManager.DisplayListener {

        /* renamed from: a, reason: collision with root package name */
        private final DisplayManager f27183a;

        /* renamed from: b, reason: collision with root package name */
        private b.a f27184b;

        private d(DisplayManager displayManager) {
            this.f27183a = displayManager;
        }

        public static d a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i4) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i4) {
            b.a aVar = this.f27184b;
            if (aVar == null || i4 != 0) {
                return;
            }
            aVar.a(this.f27183a.getDisplay(0));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i4) {
        }

        @Override // com.yandex.mobile.ads.impl.ie2.b
        public final void a(b.a aVar) {
            this.f27184b = aVar;
            this.f27183a.registerDisplayListener(this, u82.a((Handler.Callback) null));
            aVar.a(this.f27183a.getDisplay(0));
        }

        @Override // com.yandex.mobile.ads.impl.ie2.b
        public final void a() {
            this.f27183a.unregisterDisplayListener(this);
            this.f27184b = null;
        }
    }

    public final long a(long j4) {
        long j5;
        if (this.f27180p != -1 && this.f27165a.e()) {
            long a4 = this.f27181q + ((long) (((this.f27177m - this.f27180p) * this.f27165a.a()) / this.f27173i));
            if (Math.abs(j4 - a4) <= 20000000) {
                j4 = a4;
            } else {
                this.f27177m = 0L;
                this.f27180p = -1L;
                this.f27178n = -1L;
            }
        }
        this.f27178n = this.f27177m;
        this.f27179o = j4;
        e eVar = this.f27167c;
        if (eVar != null && this.f27175k != -9223372036854775807L) {
            long j6 = eVar.f27186b;
            if (j6 != -9223372036854775807L) {
                long j7 = this.f27175k;
                long j8 = (((j4 - j6) / j7) * j7) + j6;
                if (j4 <= j8) {
                    j5 = j8 - j7;
                } else {
                    j5 = j8;
                    j8 = j7 + j8;
                }
                if (j8 - j4 >= j4 - j5) {
                    j8 = j5;
                }
                return j8 - this.f27176l;
            }
        }
        return j4;
    }

    public final void b(float f4) {
        this.f27173i = f4;
        this.f27177m = 0L;
        this.f27180p = -1L;
        this.f27178n = -1L;
        a(false);
    }

    public final void b() {
        this.f27168d = true;
        this.f27177m = 0L;
        this.f27180p = -1L;
        this.f27178n = -1L;
        if (this.f27166b != null) {
            e eVar = this.f27167c;
            eVar.getClass();
            eVar.f27187c.sendEmptyMessage(1);
            this.f27166b.a(new b.a() { // from class: com.yandex.mobile.ads.impl.Y6
                @Override // com.yandex.mobile.ads.impl.ie2.b.a
                public final void a(Display display) {
                    ie2.this.a(display);
                }
            });
        }
        a(false);
    }

    private static b a(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        d a4 = u82.f32873a >= 17 ? d.a(applicationContext) : null;
        if (a4 != null) {
            return a4;
        }
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        if (windowManager != null) {
            return new c(windowManager);
        }
        return null;
    }

    public final void a(float f4) {
        this.f27170f = f4;
        this.f27165a.f();
        d();
    }

    public final void a() {
        this.f27177m = 0L;
        this.f27180p = -1L;
        this.f27178n = -1L;
    }

    public final void a(Surface surface) {
        if (surface instanceof gh1) {
            surface = null;
        }
        Surface surface2 = this.f27169e;
        if (surface2 == surface) {
            return;
        }
        if (u82.f32873a >= 30 && surface2 != null && this.f27174j != Integer.MIN_VALUE && this.f27172h != 0.0f) {
            this.f27172h = 0.0f;
            a.a(surface2, 0.0f);
        }
        this.f27169e = surface;
        a(true);
    }

    public final void a(int i4) {
        if (this.f27174j == i4) {
            return;
        }
        this.f27174j = i4;
        a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f27175k = refreshRate;
            this.f27176l = (refreshRate * 80) / 100;
        } else {
            ms0.d("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f27175k = -9223372036854775807L;
            this.f27176l = -9223372036854775807L;
        }
    }

    private void a(boolean z4) {
        Surface surface;
        float f4;
        if (u82.f32873a < 30 || (surface = this.f27169e) == null || this.f27174j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f27168d) {
            float f5 = this.f27171g;
            if (f5 != -1.0f) {
                f4 = f5 * this.f27173i;
                if (z4 && this.f27172h == f4) {
                    return;
                }
                this.f27172h = f4;
                a.a(surface, f4);
            }
        }
        f4 = 0.0f;
        if (z4) {
        }
        this.f27172h = f4;
        a.a(surface, f4);
    }
}
