package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class k34 implements x34 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f7369a;

    /* renamed from: b, reason: collision with root package name */
    private final p34 f7370b;

    /* renamed from: c, reason: collision with root package name */
    private final n34 f7371c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7372d;

    /* renamed from: e, reason: collision with root package name */
    private int f7373e = 0;

    /* synthetic */ k34(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z6, j34 j34Var) {
        this.f7369a = mediaCodec;
        this.f7370b = new p34(handlerThread);
        this.f7371c = new n34(mediaCodec, handlerThread2);
    }

    static /* bridge */ /* synthetic */ void m(k34 k34Var, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i7, boolean z6) {
        k34Var.f7370b.e(k34Var.f7369a);
        lz2.a("configureCodec");
        k34Var.f7369a.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        lz2.b();
        k34Var.f7371c.f();
        lz2.a("startCodec");
        k34Var.f7369a.start();
        lz2.b();
        k34Var.f7373e = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String n(int i7, String str) {
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

    @Override // com.google.android.gms.internal.ads.x34
    public final ByteBuffer A(int i7) {
        return this.f7369a.getOutputBuffer(i7);
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final ByteBuffer E(int i7) {
        return this.f7369a.getInputBuffer(i7);
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final void S(Bundle bundle) {
        this.f7369a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final void a(int i7) {
        this.f7369a.setVideoScalingMode(i7);
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final void b(int i7, int i8, int i9, long j7, int i10) {
        this.f7371c.c(i7, 0, i9, j7, i10);
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final MediaFormat c() {
        return this.f7370b.c();
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final void d(int i7, boolean z6) {
        this.f7369a.releaseOutputBuffer(i7, z6);
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final void e(Surface surface) {
        this.f7369a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final void f(int i7, int i8, v21 v21Var, long j7, int i9) {
        this.f7371c.d(i7, 0, v21Var, j7, 0);
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final int g(MediaCodec.BufferInfo bufferInfo) {
        return this.f7370b.b(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final void h() {
        this.f7371c.b();
        this.f7369a.flush();
        p34 p34Var = this.f7370b;
        MediaCodec mediaCodec = this.f7369a;
        mediaCodec.getClass();
        p34Var.d(new f34(mediaCodec));
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final void i(int i7, long j7) {
        this.f7369a.releaseOutputBuffer(i7, j7);
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final void k() {
        try {
            if (this.f7373e == 1) {
                this.f7371c.e();
                this.f7370b.g();
            }
            this.f7373e = 2;
            if (this.f7372d) {
                return;
            }
            this.f7369a.release();
            this.f7372d = true;
        } catch (Throwable th) {
            if (!this.f7372d) {
                this.f7369a.release();
                this.f7372d = true;
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final boolean t() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.x34
    public final int zza() {
        return this.f7370b.a();
    }
}
