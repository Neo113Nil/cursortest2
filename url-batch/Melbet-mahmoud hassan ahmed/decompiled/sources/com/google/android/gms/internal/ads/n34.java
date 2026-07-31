package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class n34 {

    /* renamed from: g, reason: collision with root package name */
    private static final ArrayDeque<m34> f8922g = new ArrayDeque<>();

    /* renamed from: h, reason: collision with root package name */
    private static final Object f8923h = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f8924a;

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f8925b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f8926c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference<RuntimeException> f8927d;

    /* renamed from: e, reason: collision with root package name */
    private final ay1 f8928e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8929f;

    public n34(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ay1 ay1Var = new ay1(xv1.f14362a);
        this.f8924a = mediaCodec;
        this.f8925b = handlerThread;
        this.f8928e = ay1Var;
        this.f8927d = new AtomicReference<>();
    }

    static /* bridge */ /* synthetic */ void a(n34 n34Var, Message message) {
        int i7 = message.what;
        m34 m34Var = null;
        try {
            if (i7 == 0) {
                m34Var = (m34) message.obj;
                n34Var.f8924a.queueInputBuffer(m34Var.f8394a, 0, m34Var.f8396c, m34Var.f8398e, m34Var.f8399f);
            } else if (i7 == 1) {
                m34Var = (m34) message.obj;
                int i8 = m34Var.f8394a;
                MediaCodec.CryptoInfo cryptoInfo = m34Var.f8397d;
                long j7 = m34Var.f8398e;
                int i9 = m34Var.f8399f;
                synchronized (f8923h) {
                    n34Var.f8924a.queueSecureInputBuffer(i8, 0, cryptoInfo, j7, i9);
                }
            } else if (i7 != 2) {
                n34Var.f8927d.set(new IllegalStateException(String.valueOf(message.what)));
            } else {
                n34Var.f8928e.e();
            }
        } catch (RuntimeException e7) {
            n34Var.f8927d.set(e7);
        }
        if (m34Var != null) {
            ArrayDeque<m34> arrayDeque = f8922g;
            synchronized (arrayDeque) {
                arrayDeque.add(m34Var);
            }
        }
    }

    private static m34 g() {
        ArrayDeque<m34> arrayDeque = f8922g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new m34();
            }
            return arrayDeque.removeFirst();
        }
    }

    private final void h() {
        RuntimeException andSet = this.f8927d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    private static byte[] i(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null) {
            int length = bArr2.length;
            int length2 = bArr.length;
            if (length >= length2) {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
                return bArr2;
            }
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    private static int[] j(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null) {
            int length = iArr2.length;
            int length2 = iArr.length;
            if (length >= length2) {
                System.arraycopy(iArr, 0, iArr2, 0, length2);
                return iArr2;
            }
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    public final void b() {
        if (this.f8929f) {
            try {
                Handler handler = this.f8926c;
                int i7 = n13.f8865a;
                handler.removeCallbacksAndMessages(null);
                this.f8928e.c();
                this.f8926c.obtainMessage(2).sendToTarget();
                this.f8928e.a();
                h();
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e7);
            }
        }
    }

    public final void c(int i7, int i8, int i9, long j7, int i10) {
        h();
        m34 g7 = g();
        g7.a(i7, 0, i9, j7, i10);
        Handler handler = this.f8926c;
        int i11 = n13.f8865a;
        handler.obtainMessage(0, g7).sendToTarget();
    }

    public final void d(int i7, int i8, v21 v21Var, long j7, int i9) {
        h();
        m34 g7 = g();
        g7.a(i7, 0, 0, j7, 0);
        MediaCodec.CryptoInfo cryptoInfo = g7.f8397d;
        cryptoInfo.numSubSamples = v21Var.f13086f;
        cryptoInfo.numBytesOfClearData = j(v21Var.f13084d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = j(v21Var.f13085e, cryptoInfo.numBytesOfEncryptedData);
        byte[] i10 = i(v21Var.f13082b, cryptoInfo.key);
        Objects.requireNonNull(i10);
        cryptoInfo.key = i10;
        byte[] i11 = i(v21Var.f13081a, cryptoInfo.iv);
        Objects.requireNonNull(i11);
        cryptoInfo.iv = i11;
        cryptoInfo.mode = v21Var.f13083c;
        if (n13.f8865a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(v21Var.f13087g, v21Var.f13088h));
        }
        this.f8926c.obtainMessage(1, g7).sendToTarget();
    }

    public final void e() {
        if (this.f8929f) {
            b();
            this.f8925b.quit();
        }
        this.f8929f = false;
    }

    public final void f() {
        if (this.f8929f) {
            return;
        }
        this.f8925b.start();
        this.f8926c = new l34(this, this.f8925b.getLooper());
        this.f8929f = true;
    }
}
