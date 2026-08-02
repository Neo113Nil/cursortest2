package io.flutter.plugins.videoplayer;

import B1.j;
import D0.d;
import E.AbstractC0005f;
import E0.e;
import T.A;
import T.C0086d;
import T.C0098p;
import T.C0107z;
import T.U;
import T.V;
import T.Z;
import W.AbstractC0108a;
import W.B;
import W.C0112e;
import W.C0120m;
import W.E;
import W.F;
import W.InterfaceC0118k;
import W.InterfaceC0119l;
import W.J;
import W.n;
import W.w;
import a0.C0127C;
import a0.C0128D;
import a0.C0130F;
import a0.C0133I;
import a0.C0155v;
import a0.InterfaceC0151q;
import a0.M;
import a0.e0;
import a0.g0;
import a0.l0;
import android.content.Context;
import android.os.Build;
import android.view.Surface;
import io.flutter.view.TextureRegistry;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import q0.AbstractC1359a;
import t0.C1436k;
import t0.l;
import t0.r;
import u0.g;
import v2.C1470q;
import v2.I;
import v2.a0;

/* loaded from: classes.dex */
public abstract class VideoPlayer implements VideoPlayerInstanceApi {
    private DisposeHandler disposeHandler;
    protected InterfaceC0151q exoPlayer;
    protected final TextureRegistry.SurfaceProducer surfaceProducer;
    protected r trackSelector;
    protected final VideoPlayerCallbacks videoPlayerEvents;

    public interface DisposeHandler {
        void onDispose();
    }

    public interface ExoPlayerProvider {
        InterfaceC0151q get();
    }

    public VideoPlayer(VideoPlayerCallbacks videoPlayerCallbacks, C0107z c0107z, VideoPlayerOptions videoPlayerOptions, TextureRegistry.SurfaceProducer surfaceProducer, ExoPlayerProvider exoPlayerProvider) {
        this.videoPlayerEvents = videoPlayerCallbacks;
        this.surfaceProducer = surfaceProducer;
        InterfaceC0151q interfaceC0151q = exoPlayerProvider.get();
        this.exoPlayer = interfaceC0151q;
        C0130F c0130f = (C0130F) interfaceC0151q;
        c0130f.L();
        if (c0130f.f3887j instanceof r) {
            C0130F c0130f2 = (C0130F) this.exoPlayer;
            c0130f2.L();
            this.trackSelector = (r) c0130f2.f3887j;
        }
        e eVar = (e) this.exoPlayer;
        eVar.getClass();
        a0 o = I.o(c0107z);
        C0130F c0130f3 = (C0130F) eVar;
        c0130f3.L();
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < o.f15607d; i4++) {
            arrayList.add(c0130f3.f3896s.a((C0107z) o.get(i4)));
        }
        c0130f3.L();
        c0130f3.r(c0130f3.f3886i0);
        c0130f3.o();
        c0130f3.f3855J++;
        ArrayList arrayList2 = c0130f3.f3894q;
        arrayList2.clear();
        ArrayList arrayList3 = new ArrayList();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            e0 e0Var = new e0((AbstractC1359a) arrayList.get(i5), c0130f3.f3895r);
            arrayList3.add(e0Var);
            arrayList2.add(i5, new C0127C(e0Var.f4102b, e0Var.f4101a));
        }
        q0.e0 e0Var2 = c0130f3.f3859O;
        int size = arrayList3.size();
        e0Var2.getClass();
        c0130f3.f3859O = new q0.e0(new Random(e0Var2.f14996a.nextLong())).a(size);
        l0 l0Var = new l0(arrayList2, c0130f3.f3859O);
        boolean p2 = l0Var.p();
        int i6 = l0Var.f4185d;
        if (!p2 && -1 >= i6) {
            throw new C0098p();
        }
        int a3 = l0Var.a(false);
        g0 y4 = c0130f3.y(c0130f3.f3886i0, l0Var, c0130f3.z(l0Var, a3, -9223372036854775807L));
        int i7 = y4.f4143e;
        if (i7 == 1) {
            i7 = 1;
        } else {
            if (!l0Var.p()) {
                if (a3 != -1) {
                    if (a3 < i6) {
                        i7 = 2;
                    }
                }
            }
            i7 = 4;
        }
        g0 x4 = C0130F.x(y4, i7);
        c0130f3.f3892m.f3962h.a(17, new C0133I(arrayList3, c0130f3.f3859O, a3, J.M(-9223372036854775807L))).b();
        c0130f3.J(x4, 0, (c0130f3.f3886i0.f4140b.f14812a.equals(x4.f4140b.f14812a) || c0130f3.f3886i0.f4139a.p()) ? false : true, 4, c0130f3.p(x4), -1);
        ((C0130F) this.exoPlayer).B();
        InterfaceC0151q interfaceC0151q2 = this.exoPlayer;
        ExoPlayerEventListener createExoPlayerEventListener = createExoPlayerEventListener(interfaceC0151q2, surfaceProducer);
        n nVar = ((C0130F) interfaceC0151q2).n;
        createExoPlayerEventListener.getClass();
        nVar.a(createExoPlayerEventListener);
        setAudioAttributes(this.exoPlayer, videoPlayerOptions.mixWithOthers);
    }

    private static void setAudioAttributes(InterfaceC0151q interfaceC0151q, boolean z) {
        C0086d c0086d = new C0086d(3);
        int i4 = !z ? 1 : 0;
        C0130F c0130f = (C0130F) interfaceC0151q;
        n nVar = c0130f.n;
        c0130f.L();
        if (c0130f.f3880f0) {
            return;
        }
        if (!Objects.equals(c0130f.f3870Z, c0086d)) {
            c0130f.f3870Z = c0086d;
            c0130f.D(1, 3, c0086d);
            nVar.c(20, new D0.a(11, c0086d));
        }
        M m4 = c0130f.f3892m;
        C0086d c0086d2 = c0130f.f3870Z;
        F f4 = m4.f3962h;
        f4.getClass();
        E b4 = F.b();
        b4.f3255a = f4.f3257a.obtainMessage(31, i4, 0, c0086d2);
        b4.b();
        nVar.b();
    }

    public abstract ExoPlayerEventListener createExoPlayerEventListener(InterfaceC0151q interfaceC0151q, TextureRegistry.SurfaceProducer surfaceProducer);

    public void dispose() {
        String str;
        boolean z;
        Context context;
        DisposeHandler disposeHandler = this.disposeHandler;
        if (disposeHandler != null) {
            disposeHandler.onDispose();
        }
        C0130F c0130f = (C0130F) this.exoPlayer;
        c0130f.getClass();
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(c0130f)));
        sb.append(" [AndroidXMedia3/1.9.2] [");
        sb.append(J.f3263a);
        sb.append("] [");
        HashSet hashSet = A.f2607a;
        synchronized (A.class) {
            str = A.f2608b;
        }
        sb.append(str);
        sb.append("]");
        AbstractC0108a.j("ExoPlayerImpl", sb.toString());
        c0130f.L();
        c0130f.z.a();
        c0130f.f3846A.c(false);
        c0130f.f3847B.c(false);
        j jVar = c0130f.f3851F;
        if (jVar != null && Build.VERSION.SDK_INT >= 34 && (context = (Context) ((WeakReference) jVar.f201b).get()) != null) {
            context.unregisterDeviceIdChangeListener((C0128D) jVar.f202c);
        }
        B b4 = c0130f.f3850E;
        b4.f3247f.f3257a.removeCallbacksAndMessages(null);
        C0130F c0130f2 = b4.f3242a;
        w wVar = b4.f3243b;
        c0130f2.L();
        n nVar = c0130f2.n;
        wVar.getClass();
        nVar.f();
        CopyOnWriteArraySet copyOnWriteArraySet = nVar.f3324d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            C0120m c0120m = (C0120m) it.next();
            if (c0120m.f3317a.equals(wVar)) {
                InterfaceC0119l interfaceC0119l = nVar.f3323c;
                c0120m.f3320d = true;
                if (interfaceC0119l != null && c0120m.f3319c) {
                    c0120m.f3319c = false;
                    interfaceC0119l.b(c0120m.f3317a, c0120m.f3318b.b());
                }
                copyOnWriteArraySet.remove(c0120m);
            }
        }
        M m4 = c0130f.f3892m;
        if (m4.f3933J || !m4.f3964j.getThread().isAlive()) {
            z = true;
        } else {
            m4.f3933J = true;
            C0112e c0112e = new C0112e(m4.f3968p);
            m4.f3962h.a(7, c0112e).b();
            z = c0112e.b(m4.f3973u);
        }
        if (!z) {
            c0130f.n.e(10, new d(18));
        }
        c0130f.n.d();
        c0130f.f3889k.f3257a.removeCallbacksAndMessages(null);
        u0.d dVar = c0130f.v;
        b0.d dVar2 = c0130f.f3897t;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((g) dVar).f15456c.f8416a;
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            u0.c cVar = (u0.c) it2.next();
            if (cVar.f15439b == dVar2) {
                cVar.f15440c = true;
                copyOnWriteArrayList.remove(cVar);
            }
        }
        g0 g0Var = c0130f.f3886i0;
        if (g0Var.f4152p) {
            c0130f.f3886i0 = g0Var.a();
        }
        g0 x4 = C0130F.x(c0130f.f3886i0, 1);
        c0130f.f3886i0 = x4;
        g0 c4 = x4.c(x4.f4140b);
        c0130f.f3886i0 = c4;
        c4.f4153q = c4.f4155s;
        c0130f.f3886i0.f4154r = 0L;
        b0.d dVar3 = c0130f.f3897t;
        F f4 = dVar3.f5276h;
        f4.getClass();
        f4.c(new R1.n(10, dVar3));
        c0130f.C();
        Surface surface = c0130f.f3865U;
        if (surface != null) {
            surface.release();
            c0130f.f3865U = null;
        }
        C1470q c1470q = V.c.f3163b;
        c0130f.f3880f0 = true;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    @Override // io.flutter.plugins.videoplayer.VideoPlayerInstanceApi
    public io.flutter.plugins.videoplayer.NativeAudioTrackData getAudioTracks() {
        /*
            r22 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r22
            a0.q r2 = r1.exoPlayer
            a0.F r2 = (a0.C0130F) r2
            r2.L()
            a0.g0 r2 = r2.f3886i0
            t0.x r2 = r2.f4147i
            T.a0 r2 = r2.f15387d
            r4 = 0
        L15:
            v2.I r5 = r2.f2765a
            int r5 = r5.size()
            if (r4 >= r5) goto L97
            v2.I r5 = r2.f2765a
            java.lang.Object r5 = r5.get(r4)
            T.Z r5 = (T.Z) r5
            T.U r6 = r5.f2752b
            int r6 = r6.f2707c
            r7 = 1
            if (r6 != r7) goto L91
            r6 = 0
        L2d:
            int r7 = r5.f2751a
            if (r6 >= r7) goto L91
            T.U r7 = r5.f2752b
            T.o[] r7 = r7.f2708d
            r7 = r7[r6]
            boolean[] r8 = r5.f2755e
            boolean r16 = r8[r6]
            io.flutter.plugins.videoplayer.ExoPlayerAudioTrackData r9 = new io.flutter.plugins.videoplayer.ExoPlayerAudioTrackData
            long r10 = (long) r4
            long r12 = (long) r6
            java.lang.String r14 = r7.f2857b
            java.lang.String r15 = r7.f2859d
            int r8 = r7.f2865j
            r3 = -1
            r17 = 0
            r21 = r4
            if (r8 == r3) goto L52
            long r3 = (long) r8
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L54
        L52:
            r3 = r17
        L54:
            int r4 = r7.f2847G
            r8 = -1
            r18 = r9
            if (r4 == r8) goto L61
            long r8 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            goto L63
        L61:
            r4 = r17
        L63:
            int r8 = r7.f2846F
            r9 = -1
            if (r8 == r9) goto L70
            long r8 = (long) r8
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r19 = r8
            goto L72
        L70:
            r19 = r17
        L72:
            java.lang.String r7 = r7.f2866k
            if (r7 == 0) goto L7f
            r20 = r7
            r17 = r3
            r9 = r18
        L7c:
            r18 = r4
            goto L86
        L7f:
            r20 = r17
            r9 = r18
            r17 = r3
            goto L7c
        L86:
            r9.<init>(r10, r12, r14, r15, r16, r17, r18, r19, r20)
            r0.add(r9)
            int r6 = r6 + 1
            r4 = r21
            goto L2d
        L91:
            r21 = r4
            int r4 = r21 + 1
            goto L15
        L97:
            io.flutter.plugins.videoplayer.NativeAudioTrackData r2 = new io.flutter.plugins.videoplayer.NativeAudioTrackData
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.videoplayer.VideoPlayer.getAudioTracks():io.flutter.plugins.videoplayer.NativeAudioTrackData");
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerInstanceApi
    public long getBufferedPosition() {
        return ((C0130F) this.exoPlayer).i();
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerInstanceApi
    public long getCurrentPosition() {
        return ((C0130F) this.exoPlayer).o();
    }

    public InterfaceC0151q getExoPlayer() {
        return this.exoPlayer;
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerInstanceApi
    public void pause() {
        e eVar = (e) this.exoPlayer;
        eVar.getClass();
        C0130F c0130f = (C0130F) eVar;
        c0130f.L();
        c0130f.I(1, false);
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerInstanceApi
    public void play() {
        e eVar = (e) this.exoPlayer;
        eVar.getClass();
        C0130F c0130f = (C0130F) eVar;
        c0130f.L();
        c0130f.I(1, true);
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerInstanceApi
    public void seekTo(long j4) {
        e eVar = (e) this.exoPlayer;
        eVar.getClass();
        eVar.g(((C0130F) eVar).m(), j4);
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerInstanceApi
    public void selectAudioTrack(long j4, long j5) {
        int i4;
        l lVar;
        l lVar2;
        if (this.trackSelector == null) {
            throw new IllegalStateException("Cannot select audio track: track selector is null");
        }
        C0130F c0130f = (C0130F) this.exoPlayer;
        c0130f.L();
        T.a0 a0Var = c0130f.f3886i0.f4147i.f15387d;
        if (j4 < 0 || j4 >= a0Var.f2765a.size()) {
            throw new IllegalArgumentException("Cannot select audio track: groupIndex " + j4 + " is out of bounds (available groups: " + a0Var.f2765a.size() + ")");
        }
        Z z = (Z) a0Var.f2765a.get((int) j4);
        U u4 = z.f2752b;
        int i5 = z.f2751a;
        if (u4.f2707c != 1) {
            StringBuilder sb = new StringBuilder("Cannot select audio track: group at index ");
            sb.append(j4);
            sb.append(" is not an audio track (type: ");
            throw new IllegalArgumentException(AbstractC0005f.o(sb, z.f2752b.f2707c, ")"));
        }
        if (j5 < 0 || (i4 = (int) j5) >= i5) {
            throw new IllegalArgumentException("Cannot select audio track: trackIndex " + j5 + " is out of bounds (available tracks in group: " + i5 + ")");
        }
        V v = new V(u4, i4);
        U u5 = v.f2710a;
        r rVar = this.trackSelector;
        synchronized (rVar.f15366c) {
            lVar = rVar.f15369f;
        }
        lVar.getClass();
        C1436k c1436k = new C1436k(lVar);
        int i6 = u5.f2707c;
        Iterator it = c1436k.f2731u.values().iterator();
        while (it.hasNext()) {
            if (((V) it.next()).f2710a.f2707c == i6) {
                it.remove();
            }
        }
        c1436k.f2731u.put(u5, v);
        l lVar3 = new l(c1436k);
        rVar.h(lVar3);
        synchronized (rVar.f15366c) {
            lVar2 = rVar.f15369f;
        }
        C1436k c1436k2 = new C1436k(lVar2);
        c1436k2.a(lVar3);
        rVar.h(new l(c1436k2));
    }

    public void setDisposeHandler(DisposeHandler disposeHandler) {
        this.disposeHandler = disposeHandler;
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerInstanceApi
    public void setLooping(boolean z) {
        InterfaceC0151q interfaceC0151q = this.exoPlayer;
        int i4 = z ? 2 : 0;
        C0130F c0130f = (C0130F) interfaceC0151q;
        n nVar = c0130f.n;
        c0130f.L();
        if (c0130f.f3854I != i4) {
            c0130f.f3854I = i4;
            F f4 = c0130f.f3892m.f3962h;
            f4.getClass();
            E b4 = F.b();
            b4.f3255a = f4.f3257a.obtainMessage(11, i4, 0);
            b4.b();
            nVar.c(8, new C0155v(i4, 0));
            c0130f.H();
            nVar.b();
        }
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerInstanceApi
    public void setPlaybackSpeed(double d4) {
        T.I i4 = new T.I((float) d4);
        C0130F c0130f = (C0130F) this.exoPlayer;
        c0130f.L();
        if (c0130f.f3886i0.o.equals(i4)) {
            return;
        }
        g0 g4 = c0130f.f3886i0.g(i4);
        c0130f.f3855J++;
        c0130f.f3892m.f3962h.a(4, i4).b();
        c0130f.J(g4, 0, false, 5, -9223372036854775807L, -1);
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerInstanceApi
    public void setVolume(double d4) {
        float max = (float) Math.max(0.0d, Math.min(1.0d, d4));
        C0130F c0130f = (C0130F) this.exoPlayer;
        c0130f.L();
        final float i4 = J.i(max, 0.0f, 1.0f);
        if (c0130f.f3871a0 == i4) {
            return;
        }
        c0130f.f3871a0 = i4;
        c0130f.f3892m.f3962h.a(32, Float.valueOf(i4)).b();
        c0130f.n.e(22, new InterfaceC0118k() { // from class: a0.t
            @Override // W.InterfaceC0118k
            public final void invoke(Object obj) {
                ((T.L) obj).onVolumeChanged(i4);
            }
        });
    }
}
