package j0;

import a0.C0132H;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.datastore.preferences.protobuf.C0178k;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class g extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f13747b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f13748c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f13753h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f13754i;

    /* renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f13755j;

    /* renamed from: k, reason: collision with root package name */
    public MediaCodec.CryptoException f13756k;

    /* renamed from: l, reason: collision with root package name */
    public long f13757l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13758m;
    public IllegalStateException n;
    public e0.t o;

    /* renamed from: a, reason: collision with root package name */
    public final Object f13746a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final C0178k f13749d = new C0178k();

    /* renamed from: e, reason: collision with root package name */
    public final C0178k f13750e = new C0178k();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f13751f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f13752g = new ArrayDeque();

    public g(HandlerThread handlerThread) {
        this.f13747b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f13752g;
        if (!arrayDeque.isEmpty()) {
            this.f13754i = (MediaFormat) arrayDeque.getLast();
        }
        C0178k c0178k = this.f13749d;
        c0178k.f4666b = c0178k.f4665a;
        C0178k c0178k2 = this.f13750e;
        c0178k2.f4666b = c0178k2.f4665a;
        this.f13751f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.n;
        if (illegalStateException != null) {
            this.n = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.f13755j;
        if (codecException != null) {
            this.f13755j = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.f13756k;
        if (cryptoException == null) {
            return;
        }
        this.f13756k = null;
        throw cryptoException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f13746a) {
            this.f13756k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f13746a) {
            this.f13755j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i4) {
        C0132H c0132h;
        synchronized (this.f13746a) {
            this.f13749d.a(i4);
            e0.t tVar = this.o;
            if (tVar != null && (c0132h = ((r) tVar.f8416a).f13805I) != null) {
                c0132h.a();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i4, MediaCodec.BufferInfo bufferInfo) {
        C0132H c0132h;
        synchronized (this.f13746a) {
            try {
                MediaFormat mediaFormat = this.f13754i;
                if (mediaFormat != null) {
                    this.f13750e.a(-2);
                    this.f13752g.add(mediaFormat);
                    this.f13754i = null;
                }
                this.f13750e.a(i4);
                this.f13751f.add(bufferInfo);
                e0.t tVar = this.o;
                if (tVar != null && (c0132h = ((r) tVar.f8416a).f13805I) != null) {
                    c0132h.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f13746a) {
            this.f13750e.a(-2);
            this.f13752g.add(mediaFormat);
            this.f13754i = null;
        }
    }
}
