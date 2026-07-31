package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.yandex.mobile.ads.impl.ou0;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class m32 implements ou0 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f28841a;

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer[] f28842b;

    /* renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f28843c;

    public static class a implements ou0.b {
        protected static MediaCodec b(ou0.a aVar) {
            aVar.f30201a.getClass();
            String str = aVar.f30201a.f31947a;
            j52.a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            j52.a();
            return createByCodecName;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.mobile.ads.impl.U9] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // com.yandex.mobile.ads.impl.ou0.b
        public final ou0 a(ou0.a aVar) {
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                MediaCodec b4 = b(aVar);
                try {
                    j52.a("configureCodec");
                    b4.configure(aVar.f30202b, aVar.f30204d, aVar.f30205e, 0);
                    j52.a();
                    j52.a("startCodec");
                    b4.start();
                    j52.a();
                    return new m32(b4);
                } catch (IOException | RuntimeException e4) {
                    e = e4;
                    mediaCodec = b4;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e5) {
                e = e5;
            } catch (RuntimeException e6) {
                e = e6;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final int b() {
        return this.f28841a.dequeueInputBuffer(0L);
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final ByteBuffer c(int i4) {
        return u82.f32873a >= 21 ? this.f28841a.getOutputBuffer(i4) : this.f28843c[i4];
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final void flush() {
        this.f28841a.flush();
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final void release() {
        this.f28842b = null;
        this.f28843c = null;
        this.f28841a.release();
    }

    private m32(MediaCodec mediaCodec) {
        this.f28841a = mediaCodec;
        if (u82.f32873a < 21) {
            this.f28842b = mediaCodec.getInputBuffers();
            this.f28843c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final int a(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f28841a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && u82.f32873a < 21) {
                this.f28843c = this.f28841a.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final ByteBuffer b(int i4) {
        return u82.f32873a >= 21 ? this.f28841a.getInputBuffer(i4) : this.f28842b[i4];
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final MediaFormat a() {
        return this.f28841a.getOutputFormat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ou0.c cVar, MediaCodec mediaCodec, long j4, long j5) {
        cVar.a(j4);
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final void a(int i4, int i5, long j4, int i6) {
        this.f28841a.queueInputBuffer(i4, 0, i5, j4, i6);
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final void a(int i4, tu tuVar, long j4) {
        this.f28841a.queueSecureInputBuffer(i4, 0, tuVar.a(), j4, 0);
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final void a(int i4, long j4) {
        this.f28841a.releaseOutputBuffer(i4, j4);
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final void a(boolean z4, int i4) {
        this.f28841a.releaseOutputBuffer(i4, z4);
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final void a(final ou0.c cVar, Handler handler) {
        this.f28841a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.yandex.mobile.ads.impl.T9
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j4, long j5) {
                m32.this.a(cVar, mediaCodec, j4, j5);
            }
        }, handler);
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final void a(Surface surface) {
        this.f28841a.setOutputSurface(surface);
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final void a(Bundle bundle) {
        this.f28841a.setParameters(bundle);
    }

    @Override // com.yandex.mobile.ads.impl.ou0
    public final void a(int i4) {
        this.f28841a.setVideoScalingMode(i4);
    }
}
