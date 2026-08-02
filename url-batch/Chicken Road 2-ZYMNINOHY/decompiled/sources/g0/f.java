package g0;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class f implements j0.k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8835a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8836b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8837c;

    @Override // j0.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public j0.c f(L1.h hVar) {
        MediaCodec mediaCodec;
        j0.m fVar;
        int i4;
        j0.c cVar;
        String str = ((j0.o) hVar.f1633a).f13766a;
        j0.c cVar2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                if (!this.f8835a || Build.VERSION.SDK_INT < 36) {
                    fVar = new j0.f(mediaCodec, (HandlerThread) ((j0.b) this.f8837c).get());
                    i4 = 0;
                } else {
                    fVar = new e0.t(mediaCodec);
                    i4 = 4;
                }
                cVar = new j0.c(mediaCodec, (HandlerThread) ((j0.b) this.f8836b).get(), fVar, (B1.j) hVar.f1638f);
            } catch (Exception e4) {
                e = e4;
            }
            try {
                Trace.endSection();
                Surface surface = (Surface) hVar.f1636d;
                if (surface == null && ((j0.o) hVar.f1633a).f13773h && Build.VERSION.SDK_INT >= 35) {
                    i4 |= 8;
                }
                j0.c.a(cVar, (MediaFormat) hVar.f1634b, surface, (MediaCrypto) hVar.f1637e, i4);
                return cVar;
            } catch (Exception e5) {
                e = e5;
                cVar2 = cVar;
                if (cVar2 != null) {
                    cVar2.release();
                } else if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (Exception e6) {
            e = e6;
            mediaCodec = null;
        }
    }

    public void b(t2.h hVar) {
        synchronized (this.f8836b) {
            try {
                if (((ArrayDeque) this.f8837c) == null) {
                    this.f8837c = new ArrayDeque();
                }
                ((ArrayDeque) this.f8837c).add(hVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(Task task) {
        t2.h hVar;
        synchronized (this.f8836b) {
            if (((ArrayDeque) this.f8837c) != null && !this.f8835a) {
                this.f8835a = true;
                while (true) {
                    synchronized (this.f8836b) {
                        try {
                            hVar = (t2.h) ((ArrayDeque) this.f8837c).poll();
                            if (hVar == null) {
                                this.f8835a = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    hVar.a(task);
                }
            }
        }
    }
}
