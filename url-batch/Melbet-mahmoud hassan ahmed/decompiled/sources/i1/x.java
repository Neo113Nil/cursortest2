package i1;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import i1.l;
import java.io.IOException;
import java.nio.ByteBuffer;
import o2.j0;
import o2.m0;

/* loaded from: classes.dex */
public final class x implements l {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f17015a;

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer[] f17016b;

    /* renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f17017c;

    public static class b implements l.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [i1.x$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // i1.l.b
        public l a(l.a aVar) {
            MediaCodec b7;
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                b7 = b(aVar);
            } catch (IOException e7) {
                e = e7;
            } catch (RuntimeException e8) {
                e = e8;
            }
            try {
                j0.a("configureCodec");
                b7.configure(aVar.f16942b, aVar.f16944d, aVar.f16945e, aVar.f16946f);
                j0.c();
                j0.a("startCodec");
                b7.start();
                j0.c();
                return new x(b7);
            } catch (IOException | RuntimeException e9) {
                e = e9;
                mediaCodec = b7;
                if (mediaCodec != 0) {
                    mediaCodec.release();
                }
                throw e;
            }
        }

        protected MediaCodec b(l.a aVar) {
            o2.a.e(aVar.f16941a);
            String str = aVar.f16941a.f16949a;
            j0.a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            j0.c();
            return createByCodecName;
        }
    }

    private x(MediaCodec mediaCodec) {
        this.f17015a = mediaCodec;
        if (m0.f19752a < 21) {
            this.f17016b = mediaCodec.getInputBuffers();
            this.f17017c = mediaCodec.getOutputBuffers();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(l.c cVar, MediaCodec mediaCodec, long j7, long j8) {
        cVar.a(this, j7, j8);
    }

    @Override // i1.l
    public void a() {
        this.f17016b = null;
        this.f17017c = null;
        this.f17015a.release();
    }

    @Override // i1.l
    public int b(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f17015a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && m0.f19752a < 21) {
                this.f17017c = this.f17015a.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // i1.l
    public boolean c() {
        return false;
    }

    @Override // i1.l
    public void d(int i7, boolean z6) {
        this.f17015a.releaseOutputBuffer(i7, z6);
    }

    @Override // i1.l
    public void e(int i7) {
        this.f17015a.setVideoScalingMode(i7);
    }

    @Override // i1.l
    public void f(int i7, int i8, u0.c cVar, long j7, int i9) {
        this.f17015a.queueSecureInputBuffer(i7, i8, cVar.a(), j7, i9);
    }

    @Override // i1.l
    public void flush() {
        this.f17015a.flush();
    }

    @Override // i1.l
    public void g(final l.c cVar, Handler handler) {
        this.f17015a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: i1.w
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j7, long j8) {
                x.this.q(cVar, mediaCodec, j7, j8);
            }
        }, handler);
    }

    @Override // i1.l
    public MediaFormat h() {
        return this.f17015a.getOutputFormat();
    }

    @Override // i1.l
    public ByteBuffer i(int i7) {
        return m0.f19752a >= 21 ? this.f17015a.getInputBuffer(i7) : ((ByteBuffer[]) m0.j(this.f17016b))[i7];
    }

    @Override // i1.l
    public void j(Surface surface) {
        this.f17015a.setOutputSurface(surface);
    }

    @Override // i1.l
    public void k(int i7, int i8, int i9, long j7, int i10) {
        this.f17015a.queueInputBuffer(i7, i8, i9, j7, i10);
    }

    @Override // i1.l
    public void l(Bundle bundle) {
        this.f17015a.setParameters(bundle);
    }

    @Override // i1.l
    public ByteBuffer m(int i7) {
        return m0.f19752a >= 21 ? this.f17015a.getOutputBuffer(i7) : ((ByteBuffer[]) m0.j(this.f17017c))[i7];
    }

    @Override // i1.l
    public void n(int i7, long j7) {
        this.f17015a.releaseOutputBuffer(i7, j7);
    }

    @Override // i1.l
    public int o() {
        return this.f17015a.dequeueInputBuffer(0L);
    }
}
