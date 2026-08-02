package b0;

import R1.k;
import T.C;
import T.C0086d;
import T.C0107z;
import T.E;
import T.K;
import T.L;
import T.M;
import T.N;
import T.Q;
import T.S;
import T.T;
import T.e0;
import W.D;
import W.F;
import W.InterfaceC0118k;
import W.J;
import W.n;
import a.AbstractC0124a;
import a0.C0130F;
import a0.C0146l;
import a0.C0155v;
import a0.C0158y;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.io.IOException;
import java.util.List;
import q0.C1353B;
import q0.C1377t;
import q0.H;
import v2.G;
import v2.I;
import v2.a0;
import v2.f0;

/* loaded from: classes.dex */
public final class d implements L, H, f0.f {

    /* renamed from: a, reason: collision with root package name */
    public final D f5269a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f5270b;

    /* renamed from: c, reason: collision with root package name */
    public final S f5271c;

    /* renamed from: d, reason: collision with root package name */
    public final L1.h f5272d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f5273e;

    /* renamed from: f, reason: collision with root package name */
    public n f5274f;

    /* renamed from: g, reason: collision with root package name */
    public N f5275g;

    /* renamed from: h, reason: collision with root package name */
    public F f5276h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5277i;

    public d(D d4) {
        d4.getClass();
        this.f5269a = d4;
        String str = J.f3263a;
        Looper myLooper = Looper.myLooper();
        this.f5274f = new n((myLooper == null ? Looper.getMainLooper() : myLooper).getThread());
        Q q4 = new Q();
        this.f5270b = q4;
        this.f5271c = new S();
        L1.h hVar = new L1.h();
        hVar.f1633a = q4;
        G g4 = I.f15571b;
        hVar.f1634b = a0.f15605e;
        hVar.f1635c = f0.f15629g;
        this.f5272d = hVar;
        this.f5273e = new SparseArray();
    }

    @Override // q0.H
    public final void a(int i4, C1353B c1353b, n0.g gVar) {
        l(j(i4, c1353b), 1005, new b(28));
    }

    @Override // q0.H
    public final void b(int i4, C1353B c1353b, n0.g gVar) {
        C0255a j4 = j(i4, c1353b);
        l(j4, 1004, new k(j4, 4, gVar));
    }

    @Override // q0.H
    public final void c(int i4, C1353B c1353b, C1377t c1377t, n0.g gVar, int i5) {
        l(j(i4, c1353b), AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, new b(13));
    }

    @Override // q0.H
    public final void d(int i4, C1353B c1353b, C1377t c1377t, n0.g gVar) {
        l(j(i4, c1353b), 1002, new b(19));
    }

    @Override // q0.H
    public final void e(int i4, C1353B c1353b, C1377t c1377t, n0.g gVar, IOException iOException, boolean z) {
        C0255a j4 = j(i4, c1353b);
        l(j4, 1003, new D0.a(j4, c1377t, gVar, iOException, z));
    }

    @Override // q0.H
    public final void f(int i4, C1353B c1353b, C1377t c1377t, n0.g gVar) {
        l(j(i4, c1353b), 1001, new b(21));
    }

    public final C0255a g() {
        return i((C1353B) this.f5272d.f1636d);
    }

    public final C0255a h(T t4, int i4, C1353B c1353b) {
        C1353B c1353b2 = t4.p() ? null : c1353b;
        this.f5269a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = t4.equals(((C0130F) this.f5275g).q()) && i4 == ((C0130F) this.f5275g).m();
        long j4 = 0;
        if (c1353b2 == null || !c1353b2.b()) {
            if (z) {
                C0130F c0130f = (C0130F) this.f5275g;
                c0130f.L();
                j4 = c0130f.j(c0130f.f3886i0);
            } else if (!t4.p()) {
                j4 = J.Z(t4.m(i4, this.f5271c, 0L).f2701l);
            }
        } else if (z && ((C0130F) this.f5275g).k() == c1353b2.f14813b && ((C0130F) this.f5275g).l() == c1353b2.f14814c) {
            j4 = ((C0130F) this.f5275g).o();
        }
        C1353B c1353b3 = (C1353B) this.f5272d.f1636d;
        T q4 = ((C0130F) this.f5275g).q();
        int m4 = ((C0130F) this.f5275g).m();
        long o = ((C0130F) this.f5275g).o();
        C0130F c0130f2 = (C0130F) this.f5275g;
        c0130f2.L();
        return new C0255a(elapsedRealtime, t4, i4, c1353b2, j4, q4, m4, c1353b3, o, J.Z(c0130f2.f3886i0.f4154r));
    }

    public final C0255a i(C1353B c1353b) {
        this.f5275g.getClass();
        T t4 = c1353b == null ? null : (T) ((f0) this.f5272d.f1635c).get(c1353b);
        if (c1353b != null && t4 != null) {
            return h(t4, t4.g(c1353b.f14812a, this.f5270b).f2683c, c1353b);
        }
        int m4 = ((C0130F) this.f5275g).m();
        T q4 = ((C0130F) this.f5275g).q();
        if (m4 >= q4.o()) {
            q4 = T.f2704a;
        }
        return h(q4, m4, null);
    }

    public final C0255a j(int i4, C1353B c1353b) {
        this.f5275g.getClass();
        if (c1353b != null) {
            return ((T) ((f0) this.f5272d.f1635c).get(c1353b)) != null ? i(c1353b) : h(T.f2704a, i4, c1353b);
        }
        T q4 = ((C0130F) this.f5275g).q();
        if (i4 >= q4.o()) {
            q4 = T.f2704a;
        }
        return h(q4, i4, null);
    }

    public final C0255a k() {
        return i((C1353B) this.f5272d.f1638f);
    }

    public final void l(C0255a c0255a, int i4, InterfaceC0118k interfaceC0118k) {
        this.f5273e.put(i4, c0255a);
        this.f5274f.e(i4, interfaceC0118k);
    }

    public final void m(C0130F c0130f, Looper looper) {
        AbstractC0124a.t(this.f5275g == null || ((I) this.f5272d.f1634b).isEmpty());
        c0130f.getClass();
        this.f5275g = c0130f;
        this.f5276h = this.f5269a.a(looper, null);
        n nVar = this.f5274f;
        k kVar = new k(this, 3, c0130f);
        nVar.getClass();
        D d4 = this.f5269a;
        AbstractC0124a.t(d4 != null);
        this.f5274f = new n(nVar.f3324d, looper, looper.getThread(), d4, kVar, nVar.f3329i);
    }

    @Override // T.L
    public final void onAudioAttributesChanged(C0086d c0086d) {
        l(k(), 20, new D0.d(24));
    }

    @Override // T.L
    public final void onAudioSessionIdChanged(int i4) {
        l(k(), 21, new b(24));
    }

    @Override // T.L
    public final void onAvailableCommandsChanged(T.J j4) {
        l(g(), 13, new c(5));
    }

    @Override // T.L
    public final void onCues(List list) {
        l(g(), 27, new b(4));
    }

    @Override // T.L
    public final void onIsLoadingChanged(boolean z) {
        l(g(), 3, new b(27));
    }

    @Override // T.L
    public final void onIsPlayingChanged(boolean z) {
        l(g(), 7, new D0.d(26));
    }

    @Override // T.L
    public final void onMediaItemTransition(C0107z c0107z, int i4) {
        l(g(), 1, new c(7));
    }

    @Override // T.L
    public final void onMediaMetadataChanged(C c4) {
        l(g(), 14, new b(17));
    }

    @Override // T.L
    public final void onMetadata(E e4) {
        l(g(), 28, new D0.d(25));
    }

    @Override // T.L
    public final void onPlayWhenReadyChanged(boolean z, int i4) {
        l(g(), 5, new b(2));
    }

    @Override // T.L
    public final void onPlaybackParametersChanged(T.I i4) {
        l(g(), 12, new D0.d(21));
    }

    @Override // T.L
    public final void onPlaybackStateChanged(int i4) {
        l(g(), 4, new b(6));
    }

    @Override // T.L
    public final void onPlaybackSuppressionReasonChanged(int i4) {
        l(g(), 6, new D0.d(28));
    }

    @Override // T.L
    public final void onPlayerError(T.H h2) {
        C1353B c1353b;
        C0255a g4 = (!(h2 instanceof C0146l) || (c1353b = ((C0146l) h2).f4180h) == null) ? g() : i(c1353b);
        l(g4, 10, new D0.a(g4, (Object) h2, 18));
    }

    @Override // T.L
    public final void onPlayerErrorChanged(T.H h2) {
        C1353B c1353b;
        l((!(h2 instanceof C0146l) || (c1353b = ((C0146l) h2).f4180h) == null) ? g() : i(c1353b), 10, new b(0));
    }

    @Override // T.L
    public final void onPlayerStateChanged(boolean z, int i4) {
        l(g(), -1, new D0.d(23));
    }

    @Override // T.L
    public final void onPositionDiscontinuity(int i4) {
    }

    @Override // T.L
    public final void onRepeatModeChanged(int i4) {
        l(g(), 8, new b(8));
    }

    @Override // T.L
    public final void onSkipSilenceEnabledChanged(boolean z) {
        l(k(), 23, new c(0));
    }

    @Override // T.L
    public final void onSurfaceSizeChanged(int i4, int i5) {
        l(k(), 24, new b(12));
    }

    @Override // T.L
    public final void onTimelineChanged(T t4, int i4) {
        N n = this.f5275g;
        n.getClass();
        L1.h hVar = this.f5272d;
        hVar.f1636d = L1.h.f(n, (I) hVar.f1634b, (C1353B) hVar.f1637e, (Q) hVar.f1633a);
        hVar.j(((C0130F) n).q());
        l(g(), 0, new c(6));
    }

    @Override // T.L
    public final void onTracksChanged(T.a0 a0Var) {
        l(g(), 2, new b(1));
    }

    @Override // T.L
    public final void onVideoSizeChanged(e0 e0Var) {
        C0255a k4 = k();
        l(k4, 25, new C0158y(k4, e0Var));
    }

    @Override // T.L
    public final void onVolumeChanged(float f4) {
        l(k(), 22, new c(8));
    }

    @Override // T.L
    public final void onPositionDiscontinuity(M m4, M m5, int i4) {
        if (i4 == 1) {
            this.f5277i = false;
        }
        N n = this.f5275g;
        n.getClass();
        L1.h hVar = this.f5272d;
        hVar.f1636d = L1.h.f(n, (I) hVar.f1634b, (C1353B) hVar.f1637e, (Q) hVar.f1633a);
        C0255a g4 = g();
        l(g4, 11, new C0155v(g4, i4, m4, m5));
    }

    @Override // T.L
    public final void onCues(V.c cVar) {
        l(g(), 27, new b(9));
    }

    @Override // T.L
    public final void onRenderedFirstFrame() {
    }

    @Override // T.L
    public final void onLoadingChanged(boolean z) {
    }

    @Override // T.L
    public final void onEvents(N n, K k4) {
    }
}
