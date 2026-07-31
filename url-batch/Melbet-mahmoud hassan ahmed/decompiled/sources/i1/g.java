package i1;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import o2.m0;

/* loaded from: classes.dex */
final class g extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f16916b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f16917c;

    /* renamed from: h, reason: collision with root package name */
    private MediaFormat f16922h;

    /* renamed from: i, reason: collision with root package name */
    private MediaFormat f16923i;

    /* renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f16924j;

    /* renamed from: k, reason: collision with root package name */
    private long f16925k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f16926l;

    /* renamed from: m, reason: collision with root package name */
    private IllegalStateException f16927m;

    /* renamed from: a, reason: collision with root package name */
    private final Object f16915a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final k f16918d = new k();

    /* renamed from: e, reason: collision with root package name */
    private final k f16919e = new k();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<MediaCodec.BufferInfo> f16920f = new ArrayDeque<>();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque<MediaFormat> f16921g = new ArrayDeque<>();

    g(HandlerThread handlerThread) {
        this.f16916b = handlerThread;
    }

    private void b(MediaFormat mediaFormat) {
        this.f16919e.a(-2);
        this.f16921g.add(mediaFormat);
    }

    private void f() {
        if (!this.f16921g.isEmpty()) {
            this.f16923i = this.f16921g.getLast();
        }
        this.f16918d.b();
        this.f16919e.b();
        this.f16920f.clear();
        this.f16921g.clear();
        this.f16924j = null;
    }

    private boolean i() {
        return this.f16925k > 0 || this.f16926l;
    }

    private void j() {
        k();
        l();
    }

    private void k() {
        IllegalStateException illegalStateException = this.f16927m;
        if (illegalStateException == null) {
            return;
        }
        this.f16927m = null;
        throw illegalStateException;
    }

    private void l() {
        MediaCodec.CodecException codecException = this.f16924j;
        if (codecException == null) {
            return;
        }
        this.f16924j = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        synchronized (this.f16915a) {
            if (this.f16926l) {
                return;
            }
            long j7 = this.f16925k - 1;
            this.f16925k = j7;
            if (j7 > 0) {
                return;
            }
            if (j7 < 0) {
                n(new IllegalStateException());
            } else {
                f();
            }
        }
    }

    private void n(IllegalStateException illegalStateException) {
        synchronized (this.f16915a) {
            this.f16927m = illegalStateException;
        }
    }

    public int c() {
        synchronized (this.f16915a) {
            int i7 = -1;
            if (i()) {
                return -1;
            }
            j();
            if (!this.f16918d.d()) {
                i7 = this.f16918d.e();
            }
            return i7;
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f16915a) {
            if (i()) {
                return -1;
            }
            j();
            if (this.f16919e.d()) {
                return -1;
            }
            int e7 = this.f16919e.e();
            if (e7 >= 0) {
                o2.a.h(this.f16922h);
                MediaCodec.BufferInfo remove = this.f16920f.remove();
                bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
            } else if (e7 == -2) {
                this.f16922h = this.f16921g.remove();
            }
            return e7;
        }
    }

    public void e() {
        synchronized (this.f16915a) {
            this.f16925k++;
            ((Handler) m0.j(this.f16917c)).post(new Runnable() { // from class: i1.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.m();
                }
            });
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f16915a) {
            mediaFormat = this.f16922h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        o2.a.f(this.f16917c == null);
        this.f16916b.start();
        Handler handler = new Handler(this.f16916b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f16917c = handler;
    }

    public void o() {
        synchronized (this.f16915a) {
            this.f16926l = true;
            this.f16916b.quit();
            f();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f16915a) {
            this.f16924j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        synchronized (this.f16915a) {
            this.f16918d.a(i7);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f16915a) {
            MediaFormat mediaFormat = this.f16923i;
            if (mediaFormat != null) {
                b(mediaFormat);
                this.f16923i = null;
            }
            this.f16919e.a(i7);
            this.f16920f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f16915a) {
            b(mediaFormat);
            this.f16923i = null;
        }
    }
}
