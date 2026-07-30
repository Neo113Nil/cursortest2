package com.baidu.ar;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class e1 {

    /* renamed from: i, reason: collision with root package name */
    public static final String f2122i = "e1";

    /* renamed from: c, reason: collision with root package name */
    public z8 f2125c;

    /* renamed from: d, reason: collision with root package name */
    public MediaCodec f2126d;

    /* renamed from: f, reason: collision with root package name */
    public p3 f2128f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2129g;

    /* renamed from: a, reason: collision with root package name */
    public int f2123a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2124b = false;

    /* renamed from: h, reason: collision with root package name */
    public long f2130h = 0;

    /* renamed from: e, reason: collision with root package name */
    public MediaCodec.BufferInfo f2127e = new MediaCodec.BufferInfo();

    public void a() {
        this.f2126d.release();
        this.f2126d = null;
        this.f2125c = null;
    }

    public void b() {
        boolean z7;
        h.a(f2122i, "startEncoder !!!");
        MediaCodec mediaCodec = this.f2126d;
        if (mediaCodec != null) {
            try {
                mediaCodec.start();
            } catch (Exception e8) {
                e8.printStackTrace();
                z7 = false;
            }
        }
        z7 = true;
        p3 p3Var = this.f2128f;
        if (p3Var != null) {
            p3Var.c(z7);
        }
    }

    public void c() {
        h.a(f2122i, "stopEncoder !!!");
        MediaCodec mediaCodec = this.f2126d;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public abstract void d();

    public void a(p3 p3Var) {
        this.f2128f = p3Var;
    }

    public void b(boolean z7) {
        h.a(f2122i, "drainSurface endOfStream = " + z7);
        if (z7) {
            z8 z8Var = this.f2125c;
            if (z8Var == null || !z8Var.a()) {
                p3 p3Var = this.f2128f;
                if (p3Var != null) {
                    p3Var.a(true);
                    return;
                }
                return;
            }
            this.f2126d.signalEndOfInputStream();
        }
        a(z7);
    }

    public final void a(boolean z7) {
        ByteBuffer[] byteBufferArr;
        int i8;
        String str;
        String str2;
        h.a(f2122i, "drainEncoder endOfStream = " + z7);
        try {
            byteBufferArr = this.f2126d.getOutputBuffers();
        } catch (Exception e8) {
            e8.printStackTrace();
            byteBufferArr = null;
        }
        if (byteBufferArr == null) {
            return;
        }
        while (true) {
            try {
                i8 = this.f2126d.dequeueOutputBuffer(this.f2127e, 10000L);
            } catch (Exception e9) {
                e9.printStackTrace();
                i8 = 0;
            }
            str = f2122i;
            h.a(str, "drainEncoder encoderStatus = " + i8);
            if (i8 == -1) {
                if (!z7) {
                    return;
                } else {
                    h.a(str, "no output available, spinning to await EOS");
                }
            } else if (i8 == -3) {
                byteBufferArr = this.f2126d.getOutputBuffers();
            } else if (i8 == -2) {
                if (this.f2125c.a()) {
                    str2 = "format changed twice!!!!";
                    break;
                }
                MediaFormat outputFormat = this.f2126d.getOutputFormat();
                h.a(str, "encoder output format changed: " + outputFormat);
                this.f2123a = this.f2125c.a(outputFormat);
                this.f2124b = true;
                p3 p3Var = this.f2128f;
                if (p3Var != null) {
                    p3Var.b(true);
                }
                if (this.f2129g) {
                    this.f2125c.c();
                }
            } else if (i8 < 0) {
                h.e(str, "unexpected result from encoder.dequeueOutputBuffer: " + i8);
            } else {
                ByteBuffer byteBuffer = byteBufferArr[i8];
                if (byteBuffer == null) {
                    throw new RuntimeException("encoderOutputBuffer " + i8 + " was null");
                }
                if ((this.f2127e.flags & 2) != 0) {
                    h.a(str, "ignoring BUFFER_FLAG_CODEC_CONFIG");
                    this.f2127e.size = 0;
                }
                if (this.f2127e.size != 0) {
                    if (this.f2125c.a()) {
                        byteBuffer.position(this.f2127e.offset);
                        MediaCodec.BufferInfo bufferInfo = this.f2127e;
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        d();
                        h.a(str, "drainEncoder writeSampleData mBufferInfo = " + this.f2127e.presentationTimeUs + "&& size = " + this.f2127e.size);
                        this.f2125c.a(this.f2123a, byteBuffer, this.f2127e);
                    } else {
                        h.a(str, "drainEncoder wait for mMuxer start !!!");
                    }
                }
                this.f2126d.releaseOutputBuffer(i8, false);
                if ((this.f2127e.flags & 4) != 0) {
                    if (z7) {
                        if (this.f2129g) {
                            this.f2125c.d();
                        }
                        p3 p3Var2 = this.f2128f;
                        if (p3Var2 != null) {
                            p3Var2.a(true);
                            return;
                        }
                        return;
                    }
                    str2 = "reached end of stream unexpectedly";
                }
            }
        }
        h.b(str, str2);
    }

    public void a(boolean z7, ByteBuffer byteBuffer, int i8, long j8) {
        MediaCodec mediaCodec;
        int i9;
        int i10;
        long j9;
        int i11;
        MediaCodec mediaCodec2 = this.f2126d;
        if (mediaCodec2 != null) {
            int i12 = -1;
            if (this.f2124b && this.f2123a == -1) {
                return;
            }
            try {
                i12 = mediaCodec2.dequeueInputBuffer(10000L);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            if (i12 >= 0) {
                if (z7) {
                    h.a(f2122i, "drainBuffer sending EOS to drainBufferEncoder");
                    mediaCodec = this.f2126d;
                    i9 = 0;
                    i10 = 0;
                    j9 = 0;
                    i11 = 4;
                } else {
                    if (!a(i12, byteBuffer, i8, j8)) {
                        return;
                    }
                    mediaCodec = this.f2126d;
                    MediaCodec.BufferInfo bufferInfo = this.f2127e;
                    i9 = bufferInfo.offset;
                    i10 = bufferInfo.size;
                    j9 = bufferInfo.presentationTimeUs;
                    i11 = 0;
                }
                mediaCodec.queueInputBuffer(i12, i9, i10, j9, i11);
            } else {
                h.a(f2122i, "drainBuffer encode input buffer not available");
            }
            a(z7);
        }
    }

    public final boolean a(int i8, ByteBuffer byteBuffer, int i9, long j8) {
        ByteBuffer byteBuffer2 = this.f2126d.getInputBuffers()[i8];
        if (byteBuffer2.capacity() < byteBuffer.capacity()) {
            return false;
        }
        byteBuffer2.position(0);
        byteBuffer2.put(byteBuffer);
        byteBuffer2.flip();
        MediaCodec.BufferInfo bufferInfo = this.f2127e;
        bufferInfo.offset = 0;
        bufferInfo.size = i9;
        bufferInfo.presentationTimeUs = j8 / 1000;
        return true;
    }
}
