package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;

/* loaded from: classes3.dex */
public final class gh1 extends Surface {

    /* renamed from: e, reason: collision with root package name */
    private static int f26149e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f26150f;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26151b;

    /* renamed from: c, reason: collision with root package name */
    private final a f26152c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f26153d;

    private static class a extends HandlerThread implements Handler.Callback {

        /* renamed from: b, reason: collision with root package name */
        private n40 f26154b;

        /* renamed from: c, reason: collision with root package name */
        private Handler f26155c;

        /* renamed from: d, reason: collision with root package name */
        private Error f26156d;

        /* renamed from: e, reason: collision with root package name */
        private RuntimeException f26157e;

        /* renamed from: f, reason: collision with root package name */
        private gh1 f26158f;

        public a() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i4) {
            this.f26154b.getClass();
            this.f26154b.a(i4);
            this.f26158f = new gh1(this, this.f26154b.a(), i4 != 0);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i4 = message.what;
            try {
                if (i4 != 1) {
                    if (i4 != 2) {
                        return true;
                    }
                    try {
                        this.f26154b.getClass();
                        this.f26154b.b();
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
                } catch (Error e4) {
                    ms0.a("PlaceholderSurface", "Failed to initialize placeholder surface", e4);
                    this.f26156d = e4;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e5) {
                    ms0.a("PlaceholderSurface", "Failed to initialize placeholder surface", e5);
                    this.f26157e = e5;
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

        public final gh1 a(int i4) {
            boolean z4;
            start();
            Handler handler = new Handler(getLooper(), this);
            this.f26155c = handler;
            this.f26154b = new n40(handler);
            synchronized (this) {
                z4 = false;
                this.f26155c.obtainMessage(1, i4, 0).sendToTarget();
                while (this.f26158f == null && this.f26157e == null && this.f26156d == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z4 = true;
                    }
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f26157e;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f26156d;
            if (error != null) {
                throw error;
            }
            gh1 gh1Var = this.f26158f;
            gh1Var.getClass();
            return gh1Var;
        }
    }

    public static gh1 a(Context context, boolean z4) {
        if (!z4 || a(context)) {
            return new a().a(z4 ? f26149e : 0);
        }
        throw new IllegalStateException();
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f26152c) {
            try {
                if (!this.f26153d) {
                    a aVar = this.f26152c;
                    aVar.f26155c.getClass();
                    aVar.f26155c.sendEmptyMessage(2);
                    this.f26153d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private gh1(a aVar, SurfaceTexture surfaceTexture, boolean z4) {
        super(surfaceTexture);
        this.f26152c = aVar;
        this.f26151b = z4;
    }

    public static synchronized boolean a(Context context) {
        boolean z4;
        int i4;
        synchronized (gh1.class) {
            try {
                if (!f26150f) {
                    if (fe0.a(context)) {
                        i4 = fe0.c() ? 1 : 2;
                    } else {
                        i4 = 0;
                    }
                    f26149e = i4;
                    f26150f = true;
                }
                z4 = f26149e != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }
}
