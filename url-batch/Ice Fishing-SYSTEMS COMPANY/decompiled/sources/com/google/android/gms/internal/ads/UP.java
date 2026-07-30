package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class UP implements ZP {

    /* renamed from: n, reason: collision with root package name */
    public final MediaCodec f28000n;

    /* renamed from: u, reason: collision with root package name */
    public final HandlerThread f28001u;

    /* renamed from: v, reason: collision with root package name */
    public RP f28002v;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicReference f28003w;

    /* renamed from: x, reason: collision with root package name */
    public final C2865Xm f28004x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f28005y;

    /* renamed from: z, reason: collision with root package name */
    public static final ArrayDeque f27999z = new ArrayDeque();

    /* renamed from: A, reason: collision with root package name */
    public static final Object f27998A = new Object();

    public UP(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C2865Xm c2865Xm = new C2865Xm();
        this.f28000n = mediaCodec;
        this.f28001u = handlerThread;
        this.f28004x = c2865Xm;
        this.f28003w = new AtomicReference();
    }

    public static SP b() {
        ArrayDeque arrayDeque = f27999z;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new SP();
                }
                return (SP) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ZP
    /* renamed from: a */
    public final void mo3a() {
        if (this.f28005y) {
            return;
        }
        HandlerThread handlerThread = this.f28001u;
        handlerThread.start();
        this.f28002v = new RP(this, handlerThread.getLooper());
        this.f28005y = true;
    }

    @Override // com.google.android.gms.internal.ads.ZP
    public final void c() {
        if (this.f28005y) {
            try {
                RP rp = this.f28002v;
                if (rp == null) {
                    throw null;
                }
                rp.removeCallbacksAndMessages(null);
                C2865Xm c2865Xm = this.f28004x;
                synchronized (c2865Xm) {
                    c2865Xm.f28692a = false;
                }
                RP rp2 = this.f28002v;
                if (rp2 == null) {
                    throw null;
                }
                rp2.obtainMessage(3).sendToTarget();
                synchronized (c2865Xm) {
                    while (!c2865Xm.f28692a) {
                        c2865Xm.wait();
                    }
                }
            } catch (InterruptedException e6) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ZP
    public final void d(Bundle bundle) {
        e();
        RP rp = this.f28002v;
        String str = AbstractC3548lu.f32613a;
        rp.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.ZP
    public final void e() {
        RuntimeException runtimeException = (RuntimeException) this.f28003w.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // com.google.android.gms.internal.ads.ZP
    public final void f() {
        if (this.f28005y) {
            c();
            this.f28001u.quit();
        }
        this.f28005y = false;
    }

    @Override // com.google.android.gms.internal.ads.ZP
    public final void h(int i, FN fn, long j9, int i4) {
        int length;
        int length2;
        int length3;
        int length4;
        e();
        SP b9 = b();
        b9.f27561a = i;
        b9.f27562b = 0;
        b9.f27564d = j9;
        b9.f27565e = i4;
        int i9 = fn.f24956f;
        MediaCodec.CryptoInfo cryptoInfo = b9.f27563c;
        cryptoInfo.numSubSamples = i9;
        int[] iArr = fn.f24954d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < (length4 = iArr.length)) {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArr2, 0, length4);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = fn.f24955e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < (length3 = iArr3.length)) {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            } else {
                System.arraycopy(iArr3, 0, iArr4, 0, length3);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = fn.f24952b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < (length2 = bArr.length)) {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = fn.f24951a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 == null || bArr4.length < (length = bArr3.length)) {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            } else {
                System.arraycopy(bArr3, 0, bArr4, 0, length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = fn.f24953c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(fn.f24957g, fn.f24958h));
        RP rp = this.f28002v;
        String str = AbstractC3548lu.f32613a;
        rp.obtainMessage(2, b9).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.ZP
    public final void i(int i, int i4, int i9, long j9) {
        e();
        SP b9 = b();
        b9.f27561a = i;
        b9.f27562b = i4;
        b9.f27564d = j9;
        b9.f27565e = i9;
        RP rp = this.f28002v;
        String str = AbstractC3548lu.f32613a;
        rp.obtainMessage(1, b9).sendToTarget();
    }
}
