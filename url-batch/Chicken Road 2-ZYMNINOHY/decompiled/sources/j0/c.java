package j0;

import W.J;
import a.AbstractC0124a;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import androidx.datastore.preferences.protobuf.C0178k;
import io.appmetrica.analytics.impl.ap;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class c implements l {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f13726a;

    /* renamed from: b, reason: collision with root package name */
    public final g f13727b;

    /* renamed from: c, reason: collision with root package name */
    public final m f13728c;

    /* renamed from: d, reason: collision with root package name */
    public final B1.j f13729d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13730e;

    /* renamed from: f, reason: collision with root package name */
    public int f13731f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, B1.j jVar) {
        this.f13726a = mediaCodec;
        this.f13727b = new g(handlerThread);
        this.f13728c = mVar;
        this.f13729d = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        if (r7 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i4) {
        B1.j jVar;
        boolean addMediaCodec;
        g gVar = cVar.f13727b;
        MediaCodec mediaCodec = cVar.f13726a;
        HandlerThread handlerThread = gVar.f13747b;
        AbstractC0124a.t(gVar.f13748c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(gVar, handler);
        gVar.f13748c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i4);
        Trace.endSection();
        cVar.f13728c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = cVar.f13729d) != null) {
            LoudnessCodecController loudnessCodecController = (LoudnessCodecController) jVar.f203d;
            if (loudnessCodecController != null) {
                addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            }
            AbstractC0124a.t(((HashSet) jVar.f201b).add(mediaCodec));
        }
        cVar.f13731f = 1;
    }

    public static String d(int i4, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i4 == 1) {
            sb.append("Audio");
        } else if (i4 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i4);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // j0.l
    public final void A(w0.j jVar, Handler handler) {
        this.f13726a.setOnFrameRenderedListener(new C1171a(this, jVar, 0), handler);
    }

    @Override // j0.l
    public final void B(ArrayList arrayList) {
        this.f13726a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override // j0.l
    public final void b(Bundle bundle) {
        this.f13728c.b(bundle);
    }

    @Override // j0.l
    public final void c(int i4, Z.b bVar, long j4, int i5) {
        this.f13728c.c(i4, bVar, j4, i5);
    }

    @Override // j0.l
    public final void e(int i4, int i5, long j4, int i6) {
        this.f13728c.e(i4, i5, j4, i6);
    }

    @Override // j0.l
    public final void f(int i4) {
        this.f13726a.releaseOutputBuffer(i4, false);
    }

    @Override // j0.l
    public final void flush() {
        this.f13728c.flush();
        this.f13726a.flush();
        g gVar = this.f13727b;
        synchronized (gVar.f13746a) {
            gVar.f13757l++;
            Handler handler = gVar.f13748c;
            String str = J.f3263a;
            handler.post(new ap(2, gVar));
        }
        this.f13726a.start();
    }

    @Override // j0.l
    public final MediaFormat g() {
        MediaFormat mediaFormat;
        g gVar = this.f13727b;
        synchronized (gVar.f13746a) {
            try {
                mediaFormat = gVar.f13753h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // j0.l
    public final void h() {
        this.f13726a.detachOutputSurface();
    }

    @Override // j0.l
    public final void k(int i4, long j4) {
        this.f13726a.releaseOutputBuffer(i4, j4);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0024, DONT_GENERATE, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0026, B:20:0x0040, B:23:0x0034, B:24:0x0042, B:25:0x0047), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0026, B:20:0x0040, B:23:0x0034, B:24:0x0042, B:25:0x0047), top: B:3:0x000a }] */
    @Override // j0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int l() {
        boolean z;
        this.f13728c.q();
        g gVar = this.f13727b;
        synchronized (gVar.f13746a) {
            try {
                gVar.b();
                if (gVar.f13757l <= 0 && !gVar.f13758m) {
                    z = false;
                    int i4 = -1;
                    if (!z) {
                        return -1;
                    }
                    C0178k c0178k = gVar.f13749d;
                    int i5 = c0178k.f4665a;
                    int i6 = c0178k.f4666b;
                    if (!(i5 == i6)) {
                        if (i5 == i6) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i4 = ((int[]) c0178k.f4668d)[i5];
                        c0178k.f4665a = (i5 + 1) & c0178k.f4667c;
                    }
                    return i4;
                }
                z = true;
                int i42 = -1;
                if (!z) {
                }
            } finally {
            }
        }
    }

    @Override // j0.l
    public final void m(g0.p pVar) {
        g gVar = this.f13727b;
        g0.p pVar2 = new g0.p(this, 7, pVar);
        synchronized (gVar.f13746a) {
            gVar.b();
            pVar2.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0024, DONT_GENERATE, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0027, B:19:0x0032, B:22:0x0036, B:24:0x0044, B:25:0x006b, B:29:0x0061, B:30:0x006d, B:31:0x0072), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0027, B:19:0x0032, B:22:0x0036, B:24:0x0044, B:25:0x006b, B:29:0x0061, B:30:0x006d, B:31:0x0072), top: B:3:0x000a }] */
    @Override // j0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int n(MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        this.f13728c.q();
        g gVar = this.f13727b;
        synchronized (gVar.f13746a) {
            try {
                gVar.b();
                if (gVar.f13757l <= 0 && !gVar.f13758m) {
                    z = false;
                    if (!z) {
                        return -1;
                    }
                    C0178k c0178k = gVar.f13750e;
                    int i4 = c0178k.f4665a;
                    int i5 = c0178k.f4666b;
                    if (i4 == i5) {
                        return -1;
                    }
                    if (i4 == i5) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    int i6 = ((int[]) c0178k.f4668d)[i4];
                    c0178k.f4665a = c0178k.f4667c & (i4 + 1);
                    if (i6 >= 0) {
                        gVar.f13753h.getClass();
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) gVar.f13751f.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (i6 == -2) {
                        gVar.f13753h = (MediaFormat) gVar.f13752g.remove();
                    }
                    return i6;
                }
                z = true;
                if (!z) {
                }
            } finally {
            }
        }
    }

    @Override // j0.l
    public final void o(int i4) {
        this.f13726a.setVideoScalingMode(i4);
    }

    @Override // j0.l
    public final boolean p(e0.t tVar) {
        g gVar = this.f13727b;
        synchronized (gVar.f13746a) {
            gVar.o = tVar;
        }
        return true;
    }

    @Override // j0.l
    public final ByteBuffer q(int i4) {
        return this.f13726a.getInputBuffer(i4);
    }

    @Override // j0.l
    public final void release() {
        B1.j jVar;
        B1.j jVar2;
        try {
            if (this.f13731f == 1) {
                this.f13728c.shutdown();
                g gVar = this.f13727b;
                synchronized (gVar.f13746a) {
                    gVar.f13758m = true;
                    gVar.f13747b.quit();
                    gVar.a();
                }
            }
            this.f13731f = 2;
            if (this.f13730e) {
                return;
            }
            try {
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 30 && i4 < 33) {
                    this.f13726a.stop();
                }
                if (i4 >= 35 && (jVar2 = this.f13729d) != null) {
                    jVar2.A(this.f13726a);
                }
                this.f13726a.release();
                this.f13730e = true;
            } finally {
            }
        } catch (Throwable th) {
            if (!this.f13730e) {
                try {
                    int i5 = Build.VERSION.SDK_INT;
                    if (i5 >= 30 && i5 < 33) {
                        this.f13726a.stop();
                    }
                    if (i5 >= 35 && (jVar = this.f13729d) != null) {
                        jVar.A(this.f13726a);
                    }
                    this.f13726a.release();
                    this.f13730e = true;
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // j0.l
    public final void s(Surface surface) {
        this.f13726a.setOutputSurface(surface);
    }

    @Override // j0.l
    public final ByteBuffer t(int i4) {
        return this.f13726a.getOutputBuffer(i4);
    }

    @Override // j0.l
    public final void w(ArrayList arrayList) {
        this.f13726a.subscribeToVendorParameters(arrayList);
    }
}
