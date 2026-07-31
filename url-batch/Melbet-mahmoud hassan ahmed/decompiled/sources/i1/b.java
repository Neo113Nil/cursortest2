package i1;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import i1.b;
import i1.l;
import java.nio.ByteBuffer;
import o2.j0;

/* loaded from: classes.dex */
final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f16888a;

    /* renamed from: b, reason: collision with root package name */
    private final g f16889b;

    /* renamed from: c, reason: collision with root package name */
    private final e f16890c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f16891d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16892e;

    /* renamed from: f, reason: collision with root package name */
    private int f16893f;

    /* renamed from: i1.b$b, reason: collision with other inner class name */
    public static final class C0068b implements l.b {

        /* renamed from: a, reason: collision with root package name */
        private final l4.o<HandlerThread> f16894a;

        /* renamed from: b, reason: collision with root package name */
        private final l4.o<HandlerThread> f16895b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f16896c;

        public C0068b(final int i7, boolean z6) {
            this(new l4.o() { // from class: i1.c
                @Override // l4.o
                public final Object get() {
                    HandlerThread e7;
                    e7 = b.C0068b.e(i7);
                    return e7;
                }
            }, new l4.o() { // from class: i1.d
                @Override // l4.o
                public final Object get() {
                    HandlerThread f7;
                    f7 = b.C0068b.f(i7);
                    return f7;
                }
            }, z6);
        }

        C0068b(l4.o<HandlerThread> oVar, l4.o<HandlerThread> oVar2, boolean z6) {
            this.f16894a = oVar;
            this.f16895b = oVar2;
            this.f16896c = z6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread e(int i7) {
            return new HandlerThread(b.t(i7));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread f(int i7) {
            return new HandlerThread(b.u(i7));
        }

        @Override // i1.l.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a(l.a aVar) {
            MediaCodec mediaCodec;
            b bVar;
            String str = aVar.f16941a.f16949a;
            b bVar2 = null;
            try {
                j0.a("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    bVar = new b(mediaCodec, this.f16894a.get(), this.f16895b.get(), this.f16896c);
                } catch (Exception e7) {
                    e = e7;
                }
            } catch (Exception e8) {
                e = e8;
                mediaCodec = null;
            }
            try {
                j0.c();
                bVar.w(aVar.f16942b, aVar.f16944d, aVar.f16945e, aVar.f16946f);
                return bVar;
            } catch (Exception e9) {
                e = e9;
                bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a();
                } else if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        }
    }

    private b(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z6) {
        this.f16888a = mediaCodec;
        this.f16889b = new g(handlerThread);
        this.f16890c = new e(mediaCodec, handlerThread2);
        this.f16891d = z6;
        this.f16893f = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String t(int i7) {
        return v(i7, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String u(int i7) {
        return v(i7, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String v(int i7, String str) {
        String str2;
        StringBuilder sb = new StringBuilder(str);
        if (i7 == 1) {
            str2 = "Audio";
        } else if (i7 == 2) {
            str2 = "Video";
        } else {
            sb.append("Unknown(");
            sb.append(i7);
            str2 = ")";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i7) {
        this.f16889b.h(this.f16888a);
        j0.a("configureCodec");
        this.f16888a.configure(mediaFormat, surface, mediaCrypto, i7);
        j0.c();
        this.f16890c.q();
        j0.a("startCodec");
        this.f16888a.start();
        j0.c();
        this.f16893f = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(l.c cVar, MediaCodec mediaCodec, long j7, long j8) {
        cVar.a(this, j7, j8);
    }

    private void y() {
        if (this.f16891d) {
            try {
                this.f16890c.r();
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e7);
            }
        }
    }

    @Override // i1.l
    public void a() {
        try {
            if (this.f16893f == 1) {
                this.f16890c.p();
                this.f16889b.o();
            }
            this.f16893f = 2;
        } finally {
            if (!this.f16892e) {
                this.f16888a.release();
                this.f16892e = true;
            }
        }
    }

    @Override // i1.l
    public int b(MediaCodec.BufferInfo bufferInfo) {
        return this.f16889b.d(bufferInfo);
    }

    @Override // i1.l
    public boolean c() {
        return false;
    }

    @Override // i1.l
    public void d(int i7, boolean z6) {
        this.f16888a.releaseOutputBuffer(i7, z6);
    }

    @Override // i1.l
    public void e(int i7) {
        y();
        this.f16888a.setVideoScalingMode(i7);
    }

    @Override // i1.l
    public void f(int i7, int i8, u0.c cVar, long j7, int i9) {
        this.f16890c.n(i7, i8, cVar, j7, i9);
    }

    @Override // i1.l
    public void flush() {
        this.f16890c.i();
        this.f16888a.flush();
        this.f16889b.e();
        this.f16888a.start();
    }

    @Override // i1.l
    public void g(final l.c cVar, Handler handler) {
        y();
        this.f16888a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: i1.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j7, long j8) {
                b.this.x(cVar, mediaCodec, j7, j8);
            }
        }, handler);
    }

    @Override // i1.l
    public MediaFormat h() {
        return this.f16889b.g();
    }

    @Override // i1.l
    public ByteBuffer i(int i7) {
        return this.f16888a.getInputBuffer(i7);
    }

    @Override // i1.l
    public void j(Surface surface) {
        y();
        this.f16888a.setOutputSurface(surface);
    }

    @Override // i1.l
    public void k(int i7, int i8, int i9, long j7, int i10) {
        this.f16890c.m(i7, i8, i9, j7, i10);
    }

    @Override // i1.l
    public void l(Bundle bundle) {
        y();
        this.f16888a.setParameters(bundle);
    }

    @Override // i1.l
    public ByteBuffer m(int i7) {
        return this.f16888a.getOutputBuffer(i7);
    }

    @Override // i1.l
    public void n(int i7, long j7) {
        this.f16888a.releaseOutputBuffer(i7, j7);
    }

    @Override // i1.l
    public int o() {
        return this.f16889b.c();
    }
}
