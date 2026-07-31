package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.yandex.mobile.ads.impl.vg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2300vg {

    /* renamed from: g, reason: collision with root package name */
    private static final ArrayDeque<b> f33597g = new ArrayDeque<>();

    /* renamed from: h, reason: collision with root package name */
    private static final Object f33598h = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f33599a;

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f33600b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f33601c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference<RuntimeException> f33602d;

    /* renamed from: e, reason: collision with root package name */
    private final vq f33603e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f33604f;

    /* renamed from: com.yandex.mobile.ads.impl.vg$a */
    final class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C2300vg.this.a(message);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vg$b */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f33606a;

        /* renamed from: b, reason: collision with root package name */
        public int f33607b;

        /* renamed from: c, reason: collision with root package name */
        public int f33608c;

        /* renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f33609d = new MediaCodec.CryptoInfo();

        /* renamed from: e, reason: collision with root package name */
        public long f33610e;

        /* renamed from: f, reason: collision with root package name */
        public int f33611f;

        b() {
        }
    }

    public C2300vg(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new vq());
    }

    private static b b() {
        ArrayDeque<b> arrayDeque = f33597g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        if (this.f33604f) {
            a();
            this.f33600b.quit();
        }
        this.f33604f = false;
    }

    public final void d() {
        if (this.f33604f) {
            return;
        }
        this.f33600b.start();
        this.f33601c = new a(this.f33600b.getLooper());
        this.f33604f = true;
    }

    public final void e() {
        this.f33603e.c();
        Handler handler = this.f33601c;
        handler.getClass();
        handler.obtainMessage(2).sendToTarget();
        this.f33603e.a();
    }

    C2300vg(MediaCodec mediaCodec, HandlerThread handlerThread, vq vqVar) {
        this.f33599a = mediaCodec;
        this.f33600b = handlerThread;
        this.f33603e = vqVar;
        this.f33602d = new AtomicReference<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(Message message) {
        b bVar;
        int i4 = message.what;
        b bVar2 = null;
        if (i4 == 0) {
            bVar = (b) message.obj;
            try {
                this.f33599a.queueInputBuffer(bVar.f33606a, bVar.f33607b, bVar.f33608c, bVar.f33610e, bVar.f33611f);
            } catch (RuntimeException e4) {
                androidx.lifecycle.r.a(this.f33602d, null, e4);
            }
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    androidx.lifecycle.r.a(this.f33602d, null, new IllegalStateException(String.valueOf(message.what)));
                } else {
                    this.f33603e.e();
                }
                if (bVar2 == null) {
                    a(bVar2);
                    return;
                }
                return;
            }
            bVar = (b) message.obj;
            int i5 = bVar.f33606a;
            int i6 = bVar.f33607b;
            MediaCodec.CryptoInfo cryptoInfo = bVar.f33609d;
            long j4 = bVar.f33610e;
            int i7 = bVar.f33611f;
            try {
                synchronized (f33598h) {
                    this.f33599a.queueSecureInputBuffer(i5, i6, cryptoInfo, j4, i7);
                }
            } catch (RuntimeException e5) {
                androidx.lifecycle.r.a(this.f33602d, null, e5);
            }
        }
        bVar2 = bVar;
        if (bVar2 == null) {
        }
    }

    public final void a() {
        if (this.f33604f) {
            try {
                Handler handler = this.f33601c;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                this.f33603e.c();
                Handler handler2 = this.f33601c;
                handler2.getClass();
                handler2.obtainMessage(2).sendToTarget();
                this.f33603e.a();
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e4);
            }
        }
    }

    public final void a(int i4, int i5, long j4, int i6) {
        RuntimeException andSet = this.f33602d.getAndSet(null);
        if (andSet == null) {
            b b4 = b();
            b4.f33606a = i4;
            b4.f33607b = 0;
            b4.f33608c = i5;
            b4.f33610e = j4;
            b4.f33611f = i6;
            Handler handler = this.f33601c;
            int i7 = u82.f32873a;
            handler.obtainMessage(0, b4).sendToTarget();
            return;
        }
        throw andSet;
    }

    public final void a(int i4, tu tuVar, long j4) {
        RuntimeException andSet = this.f33602d.getAndSet(null);
        if (andSet == null) {
            b b4 = b();
            b4.f33606a = i4;
            b4.f33607b = 0;
            b4.f33608c = 0;
            b4.f33610e = j4;
            b4.f33611f = 0;
            MediaCodec.CryptoInfo cryptoInfo = b4.f33609d;
            cryptoInfo.numSubSamples = tuVar.f32695f;
            int[] iArr = tuVar.f32693d;
            int[] iArr2 = cryptoInfo.numBytesOfClearData;
            if (iArr != null) {
                if (iArr2 != null && iArr2.length >= iArr.length) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                } else {
                    iArr2 = Arrays.copyOf(iArr, iArr.length);
                }
            }
            cryptoInfo.numBytesOfClearData = iArr2;
            int[] iArr3 = tuVar.f32694e;
            int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr3 != null) {
                if (iArr4 != null && iArr4.length >= iArr3.length) {
                    System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
                } else {
                    iArr4 = Arrays.copyOf(iArr3, iArr3.length);
                }
            }
            cryptoInfo.numBytesOfEncryptedData = iArr4;
            byte[] bArr = tuVar.f32691b;
            byte[] bArr2 = cryptoInfo.key;
            if (bArr != null) {
                if (bArr2 != null && bArr2.length >= bArr.length) {
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                } else {
                    bArr2 = Arrays.copyOf(bArr, bArr.length);
                }
            }
            bArr2.getClass();
            cryptoInfo.key = bArr2;
            byte[] bArr3 = tuVar.f32690a;
            byte[] bArr4 = cryptoInfo.iv;
            if (bArr3 != null) {
                if (bArr4 != null && bArr4.length >= bArr3.length) {
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                } else {
                    bArr4 = Arrays.copyOf(bArr3, bArr3.length);
                }
            }
            bArr4.getClass();
            cryptoInfo.iv = bArr4;
            cryptoInfo.mode = tuVar.f32692c;
            if (u82.f32873a >= 24) {
                cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(tuVar.f32696g, tuVar.f32697h));
            }
            this.f33601c.obtainMessage(1, b4).sendToTarget();
            return;
        }
        throw andSet;
    }

    private static void a(b bVar) {
        ArrayDeque<b> arrayDeque = f33597g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }
}
