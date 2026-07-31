package r0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import i1.l;
import java.util.ArrayList;
import t0.z;

/* loaded from: classes.dex */
public class n implements i3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f20810a;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20814e;

    /* renamed from: g, reason: collision with root package name */
    private boolean f20816g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f20817h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20818i;

    /* renamed from: b, reason: collision with root package name */
    private final i1.j f20811b = new i1.j();

    /* renamed from: c, reason: collision with root package name */
    private int f20812c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f20813d = 5000;

    /* renamed from: f, reason: collision with root package name */
    private i1.q f20815f = i1.q.f17000a;

    public n(Context context) {
        this.f20810a = context;
    }

    @Override // r0.i3
    public e3[] a(Handler handler, p2.x xVar, t0.s sVar, c2.n nVar, j1.f fVar) {
        ArrayList<e3> arrayList = new ArrayList<>();
        h(this.f20810a, this.f20812c, this.f20815f, this.f20814e, handler, xVar, this.f20813d, arrayList);
        t0.t c7 = c(this.f20810a, this.f20816g, this.f20817h, this.f20818i);
        if (c7 != null) {
            b(this.f20810a, this.f20812c, this.f20815f, this.f20814e, c7, handler, sVar, arrayList);
        }
        g(this.f20810a, nVar, handler.getLooper(), this.f20812c, arrayList);
        e(this.f20810a, fVar, handler.getLooper(), this.f20812c, arrayList);
        d(this.f20810a, this.f20812c, arrayList);
        f(this.f20810a, handler, this.f20812c, arrayList);
        return (e3[]) arrayList.toArray(new e3[0]);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:5|(1:7)|8|9|10|11|(2:12|13)|14|15|16|17|18|19|(5:21|22|23|24|25)|(3:27|28|29)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:12|13)|15|16|17|18|19|(5:21|22|23|24|25)|(3:27|28|29)) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0089, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0094, code lost:
    
        r6 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void b(Context context, int i7, i1.q qVar, boolean z6, t0.t tVar, Handler handler, t0.s sVar, ArrayList<e3> arrayList) {
        int i8;
        int i9;
        arrayList.add(new t0.d0(context, i(), qVar, z6, handler, sVar, tVar));
        if (i7 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i7 == 2) {
            size--;
        }
        try {
            try {
                i8 = size + 1;
            } catch (Exception e7) {
                throw new RuntimeException("Error instantiating MIDI extension", e7);
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            try {
                arrayList.add(size, (e3) Class.forName("com.google.android.exoplayer2.decoder.midi.MidiRenderer").getConstructor(new Class[0]).newInstance(new Object[0]));
                o2.r.f("DefaultRenderersFactory", "Loaded MidiRenderer.");
            } catch (ClassNotFoundException unused2) {
                size = i8;
                i8 = size;
                i9 = i8 + 1;
                arrayList.add(i8, (e3) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, t0.s.class, t0.t.class).newInstance(handler, sVar, tVar));
                o2.r.f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                try {
                    int i10 = i9 + 1;
                    try {
                        arrayList.add(i9, (e3) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, t0.s.class, t0.t.class).newInstance(handler, sVar, tVar));
                        o2.r.f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i9 = i10;
                        i10 = i9;
                        arrayList.add(i10, (e3) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, t0.s.class, t0.t.class).newInstance(handler, sVar, tVar));
                        o2.r.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                    }
                    arrayList.add(i10, (e3) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, t0.s.class, t0.t.class).newInstance(handler, sVar, tVar));
                    o2.r.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                } catch (Exception e8) {
                    throw new RuntimeException("Error instantiating FLAC extension", e8);
                }
            }
            i9 = i8 + 1;
            arrayList.add(i8, (e3) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, t0.s.class, t0.t.class).newInstance(handler, sVar, tVar));
            o2.r.f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
            try {
                int i102 = i9 + 1;
                arrayList.add(i9, (e3) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, t0.s.class, t0.t.class).newInstance(handler, sVar, tVar));
                o2.r.f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
            } catch (ClassNotFoundException unused4) {
            }
            try {
                arrayList.add(i102, (e3) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, t0.s.class, t0.t.class).newInstance(handler, sVar, tVar));
                o2.r.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e9) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e9);
            }
        } catch (Exception e10) {
            throw new RuntimeException("Error instantiating Opus extension", e10);
        }
    }

    protected t0.t c(Context context, boolean z6, boolean z7, boolean z8) {
        return new z.e().g(t0.f.c(context)).i(z6).h(z7).j(z8 ? 1 : 0).f();
    }

    protected void d(Context context, int i7, ArrayList<e3> arrayList) {
        arrayList.add(new q2.b());
    }

    protected void e(Context context, j1.f fVar, Looper looper, int i7, ArrayList<e3> arrayList) {
        arrayList.add(new j1.g(fVar, looper));
    }

    protected void f(Context context, Handler handler, int i7, ArrayList<e3> arrayList) {
    }

    protected void g(Context context, c2.n nVar, Looper looper, int i7, ArrayList<e3> arrayList) {
        arrayList.add(new c2.o(nVar, looper));
    }

    protected void h(Context context, int i7, i1.q qVar, boolean z6, Handler handler, p2.x xVar, long j7, ArrayList<e3> arrayList) {
        int i8;
        arrayList.add(new p2.h(context, i(), qVar, j7, z6, handler, xVar, 50));
        if (i7 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i7 == 2) {
            size--;
        }
        try {
            try {
                i8 = size + 1;
                try {
                    arrayList.add(size, (e3) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, p2.x.class, Integer.TYPE).newInstance(Long.valueOf(j7), handler, xVar, 50));
                    o2.r.f("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i8;
                    i8 = size;
                    arrayList.add(i8, (e3) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, p2.x.class, Integer.TYPE).newInstance(Long.valueOf(j7), handler, xVar, 50));
                    o2.r.f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                }
            } catch (Exception e7) {
                throw new RuntimeException("Error instantiating VP9 extension", e7);
            }
        } catch (ClassNotFoundException unused2) {
        }
        try {
            arrayList.add(i8, (e3) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, p2.x.class, Integer.TYPE).newInstance(Long.valueOf(j7), handler, xVar, 50));
            o2.r.f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
        } catch (ClassNotFoundException unused3) {
        } catch (Exception e8) {
            throw new RuntimeException("Error instantiating AV1 extension", e8);
        }
    }

    protected l.b i() {
        return this.f20811b;
    }

    public n j(boolean z6) {
        this.f20818i = z6;
        return this;
    }
}
