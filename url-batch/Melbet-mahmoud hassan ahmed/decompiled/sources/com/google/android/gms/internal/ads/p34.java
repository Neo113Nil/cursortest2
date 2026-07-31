package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
final class p34 extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f10064b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f10065c;

    /* renamed from: h, reason: collision with root package name */
    private MediaFormat f10070h;

    /* renamed from: i, reason: collision with root package name */
    private MediaFormat f10071i;

    /* renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f10072j;

    /* renamed from: k, reason: collision with root package name */
    private long f10073k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f10074l;

    /* renamed from: m, reason: collision with root package name */
    private IllegalStateException f10075m;

    /* renamed from: a, reason: collision with root package name */
    private final Object f10063a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final u34 f10066d = new u34();

    /* renamed from: e, reason: collision with root package name */
    private final u34 f10067e = new u34();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<MediaCodec.BufferInfo> f10068f = new ArrayDeque<>();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque<MediaFormat> f10069g = new ArrayDeque<>();

    p34(HandlerThread handlerThread) {
        this.f10064b = handlerThread;
    }

    private final void h(MediaFormat mediaFormat) {
        this.f10067e.b(-2);
        this.f10069g.add(mediaFormat);
    }

    private final void i() {
        if (!this.f10069g.isEmpty()) {
            this.f10071i = this.f10069g.getLast();
        }
        this.f10066d.c();
        this.f10067e.c();
        this.f10068f.clear();
        this.f10069g.clear();
        this.f10072j = null;
    }

    private final void j() {
        IllegalStateException illegalStateException = this.f10075m;
        if (illegalStateException == null) {
            return;
        }
        this.f10075m = null;
        throw illegalStateException;
    }

    private final void k() {
        MediaCodec.CodecException codecException = this.f10072j;
        if (codecException == null) {
            return;
        }
        this.f10072j = null;
        throw codecException;
    }

    private final void l(IllegalStateException illegalStateException) {
        synchronized (this.f10063a) {
            this.f10075m = illegalStateException;
        }
    }

    private final boolean m() {
        return this.f10073k > 0 || this.f10074l;
    }

    public final int a() {
        synchronized (this.f10063a) {
            int i7 = -1;
            if (m()) {
                return -1;
            }
            j();
            k();
            if (!this.f10066d.d()) {
                i7 = this.f10066d.a();
            }
            return i7;
        }
    }

    public final int b(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f10063a) {
            if (m()) {
                return -1;
            }
            j();
            k();
            if (this.f10067e.d()) {
                return -1;
            }
            int a7 = this.f10067e.a();
            if (a7 >= 0) {
                wu1.b(this.f10070h);
                MediaCodec.BufferInfo remove = this.f10068f.remove();
                bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
            } else if (a7 == -2) {
                this.f10070h = this.f10069g.remove();
                a7 = -2;
            }
            return a7;
        }
    }

    public final MediaFormat c() {
        MediaFormat mediaFormat;
        synchronized (this.f10063a) {
            mediaFormat = this.f10070h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public final void d(final Runnable runnable) {
        synchronized (this.f10063a) {
            this.f10073k++;
            Handler handler = this.f10065c;
            int i7 = n13.f8865a;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.o34
                @Override // java.lang.Runnable
                public final void run() {
                    p34.this.f(runnable);
                }
            });
        }
    }

    public final void e(MediaCodec mediaCodec) {
        wu1.f(this.f10065c == null);
        this.f10064b.start();
        Handler handler = new Handler(this.f10064b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f10065c = handler;
    }

    final /* synthetic */ void f(Runnable runnable) {
        synchronized (this.f10063a) {
            if (!this.f10074l) {
                long j7 = this.f10073k - 1;
                this.f10073k = j7;
                if (j7 <= 0) {
                    if (j7 < 0) {
                        e = new IllegalStateException();
                    } else {
                        i();
                        try {
                            ((f34) runnable).f4971f.start();
                        } catch (IllegalStateException e7) {
                            e = e7;
                        } catch (Exception e8) {
                            l(new IllegalStateException(e8));
                        }
                    }
                    l(e);
                }
            }
        }
    }

    public final void g() {
        synchronized (this.f10063a) {
            this.f10074l = true;
            this.f10064b.quit();
            i();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f10063a) {
            this.f10072j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        synchronized (this.f10063a) {
            this.f10066d.b(i7);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f10063a) {
            MediaFormat mediaFormat = this.f10071i;
            if (mediaFormat != null) {
                h(mediaFormat);
                this.f10071i = null;
            }
            this.f10067e.b(i7);
            this.f10068f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f10063a) {
            h(mediaFormat);
            this.f10071i = null;
        }
    }
}
