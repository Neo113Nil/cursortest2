package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* renamed from: com.yandex.mobile.ads.impl.wg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2323wg extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f34032b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f34033c;

    /* renamed from: h, reason: collision with root package name */
    private MediaFormat f34038h;

    /* renamed from: i, reason: collision with root package name */
    private MediaFormat f34039i;

    /* renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f34040j;

    /* renamed from: k, reason: collision with root package name */
    private long f34041k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f34042l;

    /* renamed from: m, reason: collision with root package name */
    private IllegalStateException f34043m;

    /* renamed from: a, reason: collision with root package name */
    private final Object f34031a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final ho0 f34034d = new ho0();

    /* renamed from: e, reason: collision with root package name */
    private final ho0 f34035e = new ho0();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<MediaCodec.BufferInfo> f34036f = new ArrayDeque<>();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque<MediaFormat> f34037g = new ArrayDeque<>();

    C2323wg(HandlerThread handlerThread) {
        this.f34032b = handlerThread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        synchronized (this.f34031a) {
            try {
                if (this.f34042l) {
                    return;
                }
                long j4 = this.f34041k - 1;
                this.f34041k = j4;
                if (j4 > 0) {
                    return;
                }
                if (j4 < 0) {
                    a(new IllegalStateException());
                    return;
                }
                if (!this.f34037g.isEmpty()) {
                    this.f34039i = this.f34037g.getLast();
                }
                this.f34034d.a();
                this.f34035e.a();
                this.f34036f.clear();
                this.f34037g.clear();
                this.f34040j = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f34031a) {
            this.f34041k++;
            Handler handler = this.f34033c;
            int i4 = u82.f32873a;
            handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.Hk
                @Override // java.lang.Runnable
                public final void run() {
                    C2323wg.this.d();
                }
            });
        }
    }

    public final MediaFormat c() {
        MediaFormat mediaFormat;
        synchronized (this.f34031a) {
            try {
                mediaFormat = this.f34038h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public final void e() {
        synchronized (this.f34031a) {
            try {
                this.f34042l = true;
                this.f34032b.quit();
                if (!this.f34037g.isEmpty()) {
                    this.f34039i = this.f34037g.getLast();
                }
                this.f34034d.a();
                this.f34035e.a();
                this.f34036f.clear();
                this.f34037g.clear();
                this.f34040j = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f34031a) {
            this.f34040j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i4) {
        synchronized (this.f34031a) {
            this.f34034d.a(i4);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i4, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f34031a) {
            try {
                MediaFormat mediaFormat = this.f34039i;
                if (mediaFormat != null) {
                    this.f34035e.a(-2);
                    this.f34037g.add(mediaFormat);
                    this.f34039i = null;
                }
                this.f34035e.a(i4);
                this.f34036f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f34031a) {
            this.f34035e.a(-2);
            this.f34037g.add(mediaFormat);
            this.f34039i = null;
        }
    }

    public final int a() {
        synchronized (this.f34031a) {
            try {
                int i4 = -1;
                if (this.f34041k <= 0 && !this.f34042l) {
                    IllegalStateException illegalStateException = this.f34043m;
                    if (illegalStateException != null) {
                        this.f34043m = null;
                        throw illegalStateException;
                    }
                    MediaCodec.CodecException codecException = this.f34040j;
                    if (codecException != null) {
                        this.f34040j = null;
                        throw codecException;
                    }
                    if (!this.f34034d.b()) {
                        i4 = this.f34034d.c();
                    }
                    return i4;
                }
                return -1;
            } finally {
            }
        }
    }

    public final int a(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f34031a) {
            try {
                if (this.f34041k <= 0 && !this.f34042l) {
                    IllegalStateException illegalStateException = this.f34043m;
                    if (illegalStateException == null) {
                        MediaCodec.CodecException codecException = this.f34040j;
                        if (codecException == null) {
                            if (this.f34035e.b()) {
                                return -1;
                            }
                            int c4 = this.f34035e.c();
                            if (c4 >= 0) {
                                if (this.f34038h != null) {
                                    MediaCodec.BufferInfo remove = this.f34036f.remove();
                                    bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
                                } else {
                                    throw new IllegalStateException();
                                }
                            } else if (c4 == -2) {
                                this.f34038h = this.f34037g.remove();
                            }
                            return c4;
                        }
                        this.f34040j = null;
                        throw codecException;
                    }
                    this.f34043m = null;
                    throw illegalStateException;
                }
                return -1;
            } finally {
            }
        }
    }

    public final void a(MediaCodec mediaCodec) {
        if (this.f34033c == null) {
            this.f34032b.start();
            Handler handler = new Handler(this.f34032b.getLooper());
            mediaCodec.setCallback(this, handler);
            this.f34033c = handler;
            return;
        }
        throw new IllegalStateException();
    }

    private void a(IllegalStateException illegalStateException) {
        synchronized (this.f34031a) {
            this.f34043m = illegalStateException;
        }
    }
}
