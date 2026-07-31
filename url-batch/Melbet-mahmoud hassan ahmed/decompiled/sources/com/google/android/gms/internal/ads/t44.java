package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class t44 implements x34 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f12087a;

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer[] f12088b;

    /* renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f12089c;

    /* synthetic */ t44(MediaCodec mediaCodec, Surface surface, r44 r44Var) {
        this.f12087a = mediaCodec;
        if (n13.f8865a < 21) {
            this.f12088b = mediaCodec.getInputBuffers();
            this.f12089c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final ByteBuffer A(int i7) {
        return n13.f8865a >= 21 ? this.f12087a.getOutputBuffer(i7) : ((ByteBuffer[]) n13.c(this.f12089c))[i7];
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final ByteBuffer E(int i7) {
        return n13.f8865a >= 21 ? this.f12087a.getInputBuffer(i7) : ((ByteBuffer[]) n13.c(this.f12088b))[i7];
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final void S(Bundle bundle) {
        this.f12087a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final void a(int i7) {
        this.f12087a.setVideoScalingMode(i7);
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final void b(int i7, int i8, int i9, long j7, int i10) {
        this.f12087a.queueInputBuffer(i7, 0, i9, j7, i10);
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final MediaFormat c() {
        return this.f12087a.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final void d(int i7, boolean z6) {
        this.f12087a.releaseOutputBuffer(i7, z6);
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final void e(Surface surface) {
        this.f12087a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final void f(int i7, int i8, v21 v21Var, long j7, int i9) {
        this.f12087a.queueSecureInputBuffer(i7, 0, v21Var.a(), j7, 0);
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final int g(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f12087a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3) {
                if (n13.f8865a < 21) {
                    this.f12089c = this.f12087a.getOutputBuffers();
                }
                dequeueOutputBuffer = -3;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final void h() {
        this.f12087a.flush();
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final void i(int i7, long j7) {
        this.f12087a.releaseOutputBuffer(i7, j7);
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final void k() {
        this.f12088b = null;
        this.f12089c = null;
        this.f12087a.release();
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final boolean t() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final int zza() {
        return this.f12087a.dequeueInputBuffer(0L);
    }
}
