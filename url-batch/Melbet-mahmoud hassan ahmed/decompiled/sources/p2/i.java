package p2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;

/* loaded from: classes.dex */
public final class i extends Surface {

    /* renamed from: i, reason: collision with root package name */
    private static int f20038i;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f20039j;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f20040f;

    /* renamed from: g, reason: collision with root package name */
    private final b f20041g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f20042h;

    private static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: f, reason: collision with root package name */
        private o2.j f20043f;

        /* renamed from: g, reason: collision with root package name */
        private Handler f20044g;

        /* renamed from: h, reason: collision with root package name */
        private Error f20045h;

        /* renamed from: i, reason: collision with root package name */
        private RuntimeException f20046i;

        /* renamed from: j, reason: collision with root package name */
        private i f20047j;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i7) {
            o2.a.e(this.f20043f);
            this.f20043f.h(i7);
            this.f20047j = new i(this, this.f20043f.g(), i7 != 0);
        }

        private void d() {
            o2.a.e(this.f20043f);
            this.f20043f.i();
        }

        public i a(int i7) {
            boolean z6;
            start();
            this.f20044g = new Handler(getLooper(), this);
            this.f20043f = new o2.j(this.f20044g);
            synchronized (this) {
                z6 = false;
                this.f20044g.obtainMessage(1, i7, 0).sendToTarget();
                while (this.f20047j == null && this.f20046i == null && this.f20045h == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z6 = true;
                    }
                }
            }
            if (z6) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f20046i;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f20045h;
            if (error == null) {
                return (i) o2.a.e(this.f20047j);
            }
            throw error;
        }

        public void c() {
            o2.a.e(this.f20044g);
            this.f20044g.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i7 = message.what;
            try {
                if (i7 != 1) {
                    if (i7 != 2) {
                        return true;
                    }
                    try {
                        d();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e7) {
                    o2.r.d("PlaceholderSurface", "Failed to initialize placeholder surface", e7);
                    this.f20045h = e7;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e8) {
                    o2.r.d("PlaceholderSurface", "Failed to initialize placeholder surface", e8);
                    this.f20046i = e8;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }
    }

    private i(b bVar, SurfaceTexture surfaceTexture, boolean z6) {
        super(surfaceTexture);
        this.f20041g = bVar;
        this.f20040f = z6;
    }

    private static int a(Context context) {
        if (o2.m.b(context)) {
            return o2.m.c() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean c(Context context) {
        boolean z6;
        synchronized (i.class) {
            if (!f20039j) {
                f20038i = a(context);
                f20039j = true;
            }
            z6 = f20038i != 0;
        }
        return z6;
    }

    public static i g(Context context, boolean z6) {
        o2.a.f(!z6 || c(context));
        return new b().a(z6 ? f20038i : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f20041g) {
            if (!this.f20042h) {
                this.f20041g.c();
                this.f20042h = true;
            }
        }
    }
}
