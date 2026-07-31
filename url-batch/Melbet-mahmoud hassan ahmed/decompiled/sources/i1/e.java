package i1;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import o2.m0;

/* loaded from: classes.dex */
class e {

    /* renamed from: g, reason: collision with root package name */
    private static final ArrayDeque<b> f16899g = new ArrayDeque<>();

    /* renamed from: h, reason: collision with root package name */
    private static final Object f16900h = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f16901a;

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f16902b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f16903c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference<RuntimeException> f16904d;

    /* renamed from: e, reason: collision with root package name */
    private final o2.g f16905e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16906f;

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e.this.f(message);
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f16908a;

        /* renamed from: b, reason: collision with root package name */
        public int f16909b;

        /* renamed from: c, reason: collision with root package name */
        public int f16910c;

        /* renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f16911d = new MediaCodec.CryptoInfo();

        /* renamed from: e, reason: collision with root package name */
        public long f16912e;

        /* renamed from: f, reason: collision with root package name */
        public int f16913f;

        b() {
        }

        public void a(int i7, int i8, int i9, long j7, int i10) {
            this.f16908a = i7;
            this.f16909b = i8;
            this.f16910c = i9;
            this.f16912e = j7;
            this.f16913f = i10;
        }
    }

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new o2.g());
    }

    e(MediaCodec mediaCodec, HandlerThread handlerThread, o2.g gVar) {
        this.f16901a = mediaCodec;
        this.f16902b = handlerThread;
        this.f16905e = gVar;
        this.f16904d = new AtomicReference<>();
    }

    private void b() {
        this.f16905e.c();
        ((Handler) o2.a.e(this.f16903c)).obtainMessage(2).sendToTarget();
        this.f16905e.a();
    }

    private static void c(u0.c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f22391f;
        cryptoInfo.numBytesOfClearData = e(cVar.f22389d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = e(cVar.f22390e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) o2.a.e(d(cVar.f22387b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) o2.a.e(d(cVar.f22386a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f22388c;
        if (m0.f19752a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f22392g, cVar.f22393h));
        }
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int[] e(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Message message) {
        int i7 = message.what;
        b bVar = null;
        if (i7 == 0) {
            bVar = (b) message.obj;
            g(bVar.f16908a, bVar.f16909b, bVar.f16910c, bVar.f16912e, bVar.f16913f);
        } else if (i7 == 1) {
            bVar = (b) message.obj;
            h(bVar.f16908a, bVar.f16909b, bVar.f16911d, bVar.f16912e, bVar.f16913f);
        } else if (i7 != 2) {
            this.f16904d.compareAndSet(null, new IllegalStateException(String.valueOf(message.what)));
        } else {
            this.f16905e.e();
        }
        if (bVar != null) {
            o(bVar);
        }
    }

    private void g(int i7, int i8, int i9, long j7, int i10) {
        try {
            this.f16901a.queueInputBuffer(i7, i8, i9, j7, i10);
        } catch (RuntimeException e7) {
            this.f16904d.compareAndSet(null, e7);
        }
    }

    private void h(int i7, int i8, MediaCodec.CryptoInfo cryptoInfo, long j7, int i9) {
        try {
            synchronized (f16900h) {
                this.f16901a.queueSecureInputBuffer(i7, i8, cryptoInfo, j7, i9);
            }
        } catch (RuntimeException e7) {
            this.f16904d.compareAndSet(null, e7);
        }
    }

    private void j() {
        ((Handler) o2.a.e(this.f16903c)).removeCallbacksAndMessages(null);
        b();
    }

    private static b k() {
        ArrayDeque<b> arrayDeque = f16899g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new b();
            }
            return arrayDeque.removeFirst();
        }
    }

    private void l() {
        RuntimeException andSet = this.f16904d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    private static void o(b bVar) {
        ArrayDeque<b> arrayDeque = f16899g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    public void i() {
        if (this.f16906f) {
            try {
                j();
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e7);
            }
        }
    }

    public void m(int i7, int i8, int i9, long j7, int i10) {
        l();
        b k7 = k();
        k7.a(i7, i8, i9, j7, i10);
        ((Handler) m0.j(this.f16903c)).obtainMessage(0, k7).sendToTarget();
    }

    public void n(int i7, int i8, u0.c cVar, long j7, int i9) {
        l();
        b k7 = k();
        k7.a(i7, i8, 0, j7, i9);
        c(cVar, k7.f16911d);
        ((Handler) m0.j(this.f16903c)).obtainMessage(1, k7).sendToTarget();
    }

    public void p() {
        if (this.f16906f) {
            i();
            this.f16902b.quit();
        }
        this.f16906f = false;
    }

    public void q() {
        if (this.f16906f) {
            return;
        }
        this.f16902b.start();
        this.f16903c = new a(this.f16902b.getLooper());
        this.f16906f = true;
    }

    public void r() {
        b();
    }
}
