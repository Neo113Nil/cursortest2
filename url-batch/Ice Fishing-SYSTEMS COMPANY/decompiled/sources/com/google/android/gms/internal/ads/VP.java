package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public final class VP extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f28248b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f28249c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f28254h;
    public MediaFormat i;

    /* renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f28255j;

    /* renamed from: k, reason: collision with root package name */
    public MediaCodec.CryptoException f28256k;

    /* renamed from: l, reason: collision with root package name */
    public long f28257l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f28258m;

    /* renamed from: n, reason: collision with root package name */
    public IllegalStateException f28259n;

    /* renamed from: o, reason: collision with root package name */
    public C4086vt f28260o;

    /* renamed from: a, reason: collision with root package name */
    public final Object f28247a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final C2830Vl f28250d = new C2830Vl();

    /* renamed from: e, reason: collision with root package name */
    public final C2830Vl f28251e = new C2830Vl();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f28252f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f28253g = new ArrayDeque();

    public VP(HandlerThread handlerThread) {
        this.f28248b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f28253g;
        if (!arrayDeque.isEmpty()) {
            this.i = (MediaFormat) arrayDeque.getLast();
        }
        C2830Vl c2830Vl = this.f28250d;
        c2830Vl.f28295b = c2830Vl.f28294a;
        C2830Vl c2830Vl2 = this.f28251e;
        c2830Vl2.f28295b = c2830Vl2.f28294a;
        this.f28252f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f28259n;
        if (illegalStateException != null) {
            this.f28259n = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.f28255j;
        if (codecException != null) {
            this.f28255j = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.f28256k;
        if (cryptoException == null) {
            return;
        }
        this.f28256k = null;
        throw cryptoException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f28247a) {
            this.f28256k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f28247a) {
            this.f28255j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        C3147eO c3147eO;
        synchronized (this.f28247a) {
            try {
                this.f28250d.c(i);
                C4086vt c4086vt = this.f28260o;
                if (c4086vt != null && (c3147eO = ((AbstractC3149eQ) c4086vt.f34886u).f30417p0) != null) {
                    c3147eO.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        C3147eO c3147eO;
        synchronized (this.f28247a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    this.f28251e.c(-2);
                    this.f28253g.add(mediaFormat);
                    this.i = null;
                }
                this.f28251e.c(i);
                this.f28252f.add(bufferInfo);
                C4086vt c4086vt = this.f28260o;
                if (c4086vt != null && (c3147eO = ((AbstractC3149eQ) c4086vt.f34886u).f30417p0) != null) {
                    c3147eO.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f28247a) {
            this.f28251e.c(-2);
            this.f28253g.add(mediaFormat);
            this.i = null;
        }
    }
}
