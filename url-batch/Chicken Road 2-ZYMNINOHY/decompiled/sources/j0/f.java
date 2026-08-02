package j0;

import W.C0112e;
import W.J;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class f implements m {

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f13738g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f13739h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f13740a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f13741b;

    /* renamed from: c, reason: collision with root package name */
    public d f13742c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f13743d;

    /* renamed from: e, reason: collision with root package name */
    public final C0112e f13744e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13745f;

    public f(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C0112e c0112e = new C0112e();
        this.f13740a = mediaCodec;
        this.f13741b = handlerThread;
        this.f13744e = c0112e;
        this.f13743d = new AtomicReference();
    }

    public static e a() {
        ArrayDeque arrayDeque = f13738g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new e();
                }
                return (e) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // j0.m
    public final void b(Bundle bundle) {
        q();
        d dVar = this.f13742c;
        String str = J.f3263a;
        dVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // j0.m
    public final void c(int i4, Z.b bVar, long j4, int i5) {
        q();
        e a3 = a();
        a3.f13733a = i4;
        a3.f13734b = 0;
        a3.f13736d = j4;
        a3.f13737e = i5;
        MediaCodec.CryptoInfo cryptoInfo = a3.f13735c;
        cryptoInfo.numSubSamples = bVar.f3774f;
        int[] iArr = bVar.f3772d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < iArr.length) {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = bVar.f3773e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < iArr3.length) {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            } else {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = bVar.f3770b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < bArr.length) {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = bVar.f3769a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 == null || bArr4.length < bArr3.length) {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            } else {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = bVar.f3771c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(bVar.f3775g, bVar.f3776h));
        d dVar = this.f13742c;
        String str = J.f3263a;
        dVar.obtainMessage(2, a3).sendToTarget();
    }

    @Override // j0.m
    public final void e(int i4, int i5, long j4, int i6) {
        q();
        e a3 = a();
        a3.f13733a = i4;
        a3.f13734b = i5;
        a3.f13736d = j4;
        a3.f13737e = i6;
        d dVar = this.f13742c;
        String str = J.f3263a;
        dVar.obtainMessage(1, a3).sendToTarget();
    }

    @Override // j0.m
    public final void flush() {
        if (this.f13745f) {
            try {
                d dVar = this.f13742c;
                dVar.getClass();
                dVar.removeCallbacksAndMessages(null);
                C0112e c0112e = this.f13744e;
                synchronized (c0112e) {
                    c0112e.f3303b = false;
                }
                d dVar2 = this.f13742c;
                dVar2.getClass();
                dVar2.obtainMessage(3).sendToTarget();
                synchronized (c0112e) {
                    while (!c0112e.f3303b) {
                        c0112e.f3302a.getClass();
                        c0112e.wait();
                    }
                }
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e4);
            }
        }
    }

    @Override // j0.m
    public final void q() {
        RuntimeException runtimeException = (RuntimeException) this.f13743d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // j0.m
    public final void shutdown() {
        if (this.f13745f) {
            flush();
            this.f13741b.quit();
        }
        this.f13745f = false;
    }

    @Override // j0.m
    public final void start() {
        if (this.f13745f) {
            return;
        }
        HandlerThread handlerThread = this.f13741b;
        handlerThread.start();
        this.f13742c = new d(this, handlerThread.getLooper());
        this.f13745f = true;
    }
}
