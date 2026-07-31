package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.yandex.mobile.ads.impl.C2277ug;
import com.yandex.mobile.ads.impl.ou0;
import java.nio.ByteBuffer;

/* renamed from: com.yandex.mobile.ads.impl.ug, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2277ug implements ou0 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f33090a;

    /* renamed from: b, reason: collision with root package name */
    private final C2323wg f33091b;

    /* renamed from: c, reason: collision with root package name */
    private final C2300vg f33092c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f33093d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f33094e;

    /* renamed from: f, reason: collision with root package name */
    private int f33095f;

    /* renamed from: com.yandex.mobile.ads.impl.ug$a */
    public static final class a implements ou0.b {

        /* renamed from: a, reason: collision with root package name */
        private final i32<HandlerThread> f33096a;

        /* renamed from: b, reason: collision with root package name */
        private final i32<HandlerThread> f33097b;

        public a(final int i4) {
            this(new i32() { // from class: com.yandex.mobile.ads.impl.Eh
                @Override // com.yandex.mobile.ads.impl.i32
                public final Object get() {
                    HandlerThread a4;
                    a4 = C2277ug.a.a(i4);
                    return a4;
                }
            }, new i32() { // from class: com.yandex.mobile.ads.impl.Fh
                @Override // com.yandex.mobile.ads.impl.i32
                public final Object get() {
                    HandlerThread b4;
                    b4 = C2277ug.a.b(i4);
                    return b4;
                }
            });
        }

        @Override // com.yandex.mobile.ads.impl.ou0.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2277ug a(ou0.a aVar) {
            Exception exc;
            MediaCodec mediaCodec;
            String str = aVar.f30201a.f31947a;
            C2277ug c2277ug = null;
            try {
                j52.a("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    C2277ug c2277ug2 = new C2277ug(mediaCodec, this.f33096a.get(), this.f33097b.get(), false);
                    try {
                        j52.a();
                        c2277ug2.a(aVar.f30202b, aVar.f30204d, aVar.f30205e);
                        return c2277ug2;
                    } catch (Exception e4) {
                        exc = e4;
                        c2277ug = c2277ug2;
                        if (c2277ug != null) {
                            c2277ug.release();
                            throw exc;
                        }
                        if (mediaCodec == null) {
                            throw exc;
                        }
                        mediaCodec.release();
                        throw exc;
                    }
                } catch (Exception e5) {
                    exc = e5;
                }
            } catch (Exception e6) {
                exc = e6;
                mediaCodec = null;
            }
        }

        a(i32 i32Var, i32 i32Var2) {
            this.f33096a = i32Var;
            this.f33097b = i32Var2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static HandlerThread a(int i4) {
            StringBuilder sb = new StringBuilder("ExoPlayer:MediaCodecAsyncAdapter:");
            if (i4 == 1) {
                sb.append("Audio");
            } else if (i4 == 2) {
                sb.append("Video");
            } else {
                sb.append("Unknown(");
                sb.append(i4);
                sb.append(")");
            }
            return new HandlerThread(sb.toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static HandlerThread b(int i4) {
            StringBuilder sb = new StringBuilder("ExoPlayer:MediaCodecQueueingThread:");
            if (i4 == 1) {
                sb.append("Audio");
            } else if (i4 == 2) {
                sb.append("Video");
            } else {
                sb.append("Unknown(");
                sb.append(i4);
                sb.append(")");
            }
            return new HandlerThread(sb.toString());
        }
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final ByteBuffer c(int i4) {
        return this.f33090a.getOutputBuffer(i4);
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final void flush() {
        this.f33092c.a();
        this.f33090a.flush();
        this.f33091b.b();
        this.f33090a.start();
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final void release() {
        try {
            if (this.f33095f == 1) {
                this.f33092c.c();
                this.f33091b.e();
            }
            this.f33095f = 2;
            if (this.f33094e) {
                return;
            }
            this.f33090a.release();
            this.f33094e = true;
        } catch (Throwable th) {
            if (!this.f33094e) {
                this.f33090a.release();
                this.f33094e = true;
            }
            throw th;
        }
    }

    private C2277ug(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z4) {
        this.f33090a = mediaCodec;
        this.f33091b = new C2323wg(handlerThread);
        this.f33092c = new C2300vg(mediaCodec, handlerThread2);
        this.f33093d = z4;
        this.f33095f = 0;
    }

    private void c() {
        if (this.f33093d) {
            try {
                this.f33092c.e();
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e4);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final int a(MediaCodec.BufferInfo bufferInfo) {
        return this.f33091b.a(bufferInfo);
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final int b() {
        return this.f33091b.a();
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final MediaFormat a() {
        return this.f33091b.c();
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final ByteBuffer b(int i4) {
        return this.f33090a.getInputBuffer(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        this.f33091b.a(this.f33090a);
        j52.a("configureCodec");
        this.f33090a.configure(mediaFormat, surface, mediaCrypto, 0);
        j52.a();
        this.f33092c.d();
        j52.a("startCodec");
        this.f33090a.start();
        j52.a();
        this.f33095f = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ou0.c cVar, MediaCodec mediaCodec, long j4, long j5) {
        cVar.a(j4);
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final void a(int i4, int i5, long j4, int i6) {
        this.f33092c.a(i4, i5, j4, i6);
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final void a(int i4, tu tuVar, long j4) {
        this.f33092c.a(i4, tuVar, j4);
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final void a(int i4, long j4) {
        this.f33090a.releaseOutputBuffer(i4, j4);
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final void a(boolean z4, int i4) {
        this.f33090a.releaseOutputBuffer(i4, z4);
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final void a(final ou0.c cVar, Handler handler) {
        c();
        this.f33090a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.yandex.mobile.ads.impl.Dh
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j4, long j5) {
                C2277ug.this.a(cVar, mediaCodec, j4, j5);
            }
        }, handler);
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final void a(Surface surface) {
        c();
        this.f33090a.setOutputSurface(surface);
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final void a(Bundle bundle) {
        c();
        this.f33090a.setParameters(bundle);
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final void a(int i4) {
        c();
        this.f33090a.setVideoScalingMode(i4);
    }
}
