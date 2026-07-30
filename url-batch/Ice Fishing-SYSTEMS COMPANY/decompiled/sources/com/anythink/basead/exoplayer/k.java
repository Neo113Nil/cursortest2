package com.anythink.basead.exoplayer;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.anythink.basead.exoplayer.ae;
import com.anythink.basead.exoplayer.e;
import com.anythink.basead.exoplayer.h.af;
import com.anythink.basead.exoplayer.h.r;
import com.anythink.basead.exoplayer.h.s;
import com.anythink.basead.exoplayer.i.h;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
final class k implements Handler.Callback, e.a, r.a, s.b, h.a, x.a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8438a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8439b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8440c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final String f8441d = "ExoPlayerImplInternal";

    /* renamed from: e, reason: collision with root package name */
    private static final int f8442e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static final int f8443f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final int f8444g = 2;

    /* renamed from: h, reason: collision with root package name */
    private static final int f8445h = 3;
    private static final int i = 4;

    /* renamed from: j, reason: collision with root package name */
    private static final int f8446j = 5;

    /* renamed from: k, reason: collision with root package name */
    private static final int f8447k = 6;

    /* renamed from: l, reason: collision with root package name */
    private static final int f8448l = 7;

    /* renamed from: m, reason: collision with root package name */
    private static final int f8449m = 8;

    /* renamed from: n, reason: collision with root package name */
    private static final int f8450n = 9;

    /* renamed from: o, reason: collision with root package name */
    private static final int f8451o = 10;

    /* renamed from: p, reason: collision with root package name */
    private static final int f8452p = 11;

    /* renamed from: q, reason: collision with root package name */
    private static final int f8453q = 12;

    /* renamed from: r, reason: collision with root package name */
    private static final int f8454r = 13;

    /* renamed from: s, reason: collision with root package name */
    private static final int f8455s = 14;

    /* renamed from: t, reason: collision with root package name */
    private static final int f8456t = 15;

    /* renamed from: u, reason: collision with root package name */
    private static final int f8457u = 10;

    /* renamed from: v, reason: collision with root package name */
    private static final int f8458v = 10;

    /* renamed from: w, reason: collision with root package name */
    private static final int f8459w = 1000;

    /* renamed from: x, reason: collision with root package name */
    private static final long f8460x = 500;

    /* renamed from: A, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.i.h f8461A;

    /* renamed from: B, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.i.i f8462B;

    /* renamed from: C, reason: collision with root package name */
    private final p f8463C;

    /* renamed from: D, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.k f8464D;

    /* renamed from: E, reason: collision with root package name */
    private final HandlerThread f8465E;

    /* renamed from: F, reason: collision with root package name */
    private final Handler f8466F;

    /* renamed from: G, reason: collision with root package name */
    private final h f8467G;

    /* renamed from: H, reason: collision with root package name */
    private final ae.b f8468H;

    /* renamed from: I, reason: collision with root package name */
    private final ae.a f8469I;

    /* renamed from: L, reason: collision with root package name */
    private final e f8471L;

    /* renamed from: N, reason: collision with root package name */
    private final ArrayList<b> f8473N;

    /* renamed from: O, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.c f8474O;

    /* renamed from: R, reason: collision with root package name */
    private u f8477R;

    /* renamed from: S, reason: collision with root package name */
    private com.anythink.basead.exoplayer.h.s f8478S;

    /* renamed from: T, reason: collision with root package name */
    private y[] f8479T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f8480U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f8481V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f8482W;

    /* renamed from: X, reason: collision with root package name */
    private int f8483X;
    private boolean Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f8484Z;
    private d aa;
    private long ab;
    private int ac;

    /* renamed from: y, reason: collision with root package name */
    private final y[] f8485y;

    /* renamed from: z, reason: collision with root package name */
    private final z[] f8486z;

    /* renamed from: P, reason: collision with root package name */
    private final s f8475P = new s();
    private final long J = 0;

    /* renamed from: K, reason: collision with root package name */
    private final boolean f8470K = false;

    /* renamed from: Q, reason: collision with root package name */
    private ac f8476Q = ac.f6472e;

    /* renamed from: M, reason: collision with root package name */
    private final c f8472M = new c(0);

    /* renamed from: com.anythink.basead.exoplayer.k$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f8487a;

        public AnonymousClass1(x xVar) {
            this.f8487a = xVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                k.f(this.f8487a);
            } catch (g e6) {
                Log.e(k.f8441d, "Unexpected error delivering message on external thread.", e6);
                throw new RuntimeException(e6);
            }
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final com.anythink.basead.exoplayer.h.s f8489a;

        /* renamed from: b, reason: collision with root package name */
        public final ae f8490b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f8491c;

        public a(com.anythink.basead.exoplayer.h.s sVar, ae aeVar, Object obj) {
            this.f8489a = sVar;
            this.f8490b = aeVar;
            this.f8491c = obj;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private u f8523a;

        /* renamed from: b, reason: collision with root package name */
        private int f8524b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f8525c;

        /* renamed from: d, reason: collision with root package name */
        private int f8526d;

        private c() {
        }

        public /* synthetic */ c(byte b9) {
            this();
        }

        public final boolean a(u uVar) {
            return uVar != this.f8523a || this.f8524b > 0 || this.f8525c;
        }

        public final void b(u uVar) {
            this.f8523a = uVar;
            this.f8524b = 0;
            this.f8525c = false;
        }

        public final void a(int i) {
            this.f8524b += i;
        }

        public final void b(int i) {
            if (this.f8525c && this.f8526d != 4) {
                C0544a.a(i == 4);
            } else {
                this.f8525c = true;
                this.f8526d = i;
            }
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final ae f8536a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8537b;

        /* renamed from: c, reason: collision with root package name */
        public final long f8538c;

        public d(ae aeVar, int i, long j9) {
            this.f8536a = aeVar;
            this.f8537b = i;
            this.f8538c = j9;
        }
    }

    public k(y[] yVarArr, com.anythink.basead.exoplayer.i.h hVar, com.anythink.basead.exoplayer.i.i iVar, p pVar, boolean z8, int i4, boolean z9, Handler handler, h hVar2, com.anythink.basead.exoplayer.k.c cVar) {
        this.f8485y = yVarArr;
        this.f8461A = hVar;
        this.f8462B = iVar;
        this.f8463C = pVar;
        this.f8481V = z8;
        this.f8483X = i4;
        this.Y = z9;
        this.f8466F = handler;
        this.f8467G = hVar2;
        this.f8474O = cVar;
        this.f8477R = new u(ae.f6498a, com.anythink.basead.exoplayer.b.f6539b, af.f7672a, iVar);
        this.f8486z = new z[yVarArr.length];
        for (int i9 = 0; i9 < yVarArr.length; i9++) {
            yVarArr[i9].a(i9);
            this.f8486z[i9] = yVarArr[i9].b();
        }
        this.f8471L = new e(this, cVar);
        this.f8473N = new ArrayList<>();
        this.f8479T = new y[0];
        this.f8468H = new ae.b();
        this.f8469I = new ae.a();
        hVar.a((h.a) this);
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f8465E = handlerThread;
        handlerThread.start();
        this.f8464D = cVar.a(handlerThread.getLooper(), this);
    }

    private void d(boolean z8) {
        u uVar = this.f8477R;
        if (uVar.f8911g != z8) {
            this.f8477R = uVar.a(z8);
        }
    }

    private void e(boolean z8) {
        this.f8482W = false;
        this.f8481V = z8;
        if (!z8) {
            f();
            g();
            return;
        }
        int i4 = this.f8477R.f8910f;
        if (i4 == 3) {
            e();
            this.f8464D.b(2);
        } else if (i4 == 2) {
            this.f8464D.b(2);
        }
    }

    private void f(boolean z8) {
        this.Y = z8;
        if (this.f8475P.a(z8)) {
            return;
        }
        g(true);
    }

    private void g(boolean z8) {
        s.a aVar = this.f8475P.c().f8852h.f8859a;
        long a9 = a(aVar, this.f8477R.f8913j, true);
        if (a9 != this.f8477R.f8913j) {
            u uVar = this.f8477R;
            this.f8477R = uVar.a(aVar, a9, uVar.f8909e);
            if (z8) {
                this.f8472M.b(4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0296, code lost:
    
        if (r20.f8463C.a(r4 - (r20.ab - r3.f8849e), r20.f8471L.e().f8916b, r20.f8482W) == false) goto L147;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void h() {
        long j9;
        int i4;
        q qVar;
        long b9 = this.f8474O.b();
        com.anythink.basead.exoplayer.h.s sVar = this.f8478S;
        boolean z8 = false;
        boolean z9 = true;
        if (sVar != null) {
            if (this.f8484Z > 0) {
                sVar.b();
            } else {
                this.f8475P.a(this.ab);
                if (this.f8475P.a()) {
                    r a9 = this.f8475P.a(this.ab, this.f8477R);
                    if (a9 == null) {
                        this.f8478S.b();
                    } else {
                        this.f8475P.a(this.f8486z, this.f8461A, this.f8463C.d(), this.f8478S, this.f8477R.f8905a.a(a9.f8859a.f7924a, this.f8469I, true).f6500b, a9).a(this, a9.f8860b);
                        d(true);
                    }
                }
                q b10 = this.f8475P.b();
                if (b10 == null || b10.a()) {
                    d(false);
                } else if (!this.f8477R.f8911g) {
                    r();
                }
                if (this.f8475P.f()) {
                    q c4 = this.f8475P.c();
                    q d2 = this.f8475P.d();
                    boolean z10 = false;
                    while (this.f8481V && c4 != d2 && this.ab >= c4.i.f8849e) {
                        if (z10) {
                            d();
                        }
                        int i9 = c4.f8852h.f8864f ? 0 : 3;
                        q h9 = this.f8475P.h();
                        a(c4);
                        u uVar = this.f8477R;
                        r rVar = h9.f8852h;
                        this.f8477R = uVar.a(rVar.f8859a, rVar.f8860b, rVar.f8862d);
                        this.f8472M.b(i9);
                        g();
                        z10 = true;
                        c4 = h9;
                    }
                    j9 = com.anythink.basead.exoplayer.b.f6539b;
                    if (d2.f8852h.f8865g) {
                        int i10 = 0;
                        while (true) {
                            y[] yVarArr = this.f8485y;
                            if (i10 >= yVarArr.length) {
                                break;
                            }
                            y yVar = yVarArr[i10];
                            com.anythink.basead.exoplayer.h.y yVar2 = d2.f8847c[i10];
                            if (yVar2 != null && yVar.f() == yVar2 && yVar.g()) {
                                yVar.h();
                            }
                            i10++;
                        }
                    } else {
                        q qVar2 = d2.i;
                        if (qVar2 != null && qVar2.f8850f) {
                            int i11 = 0;
                            while (true) {
                                y[] yVarArr2 = this.f8485y;
                                if (i11 >= yVarArr2.length) {
                                    com.anythink.basead.exoplayer.i.i iVar = d2.f8854k;
                                    q g9 = this.f8475P.g();
                                    com.anythink.basead.exoplayer.i.i iVar2 = g9.f8854k;
                                    boolean z11 = g9.f8845a.c() != com.anythink.basead.exoplayer.b.f6539b;
                                    int i12 = 0;
                                    while (true) {
                                        y[] yVarArr3 = this.f8485y;
                                        if (i12 >= yVarArr3.length) {
                                            break;
                                        }
                                        y yVar3 = yVarArr3[i12];
                                        if (iVar.a(i12)) {
                                            if (!z11) {
                                                if (!yVar3.i()) {
                                                    com.anythink.basead.exoplayer.i.f a10 = iVar2.f8140c.a(i12);
                                                    boolean a11 = iVar2.a(i12);
                                                    boolean z12 = this.f8486z[i12].a() == 5 ? true : z8;
                                                    aa aaVar = iVar.f8139b[i12];
                                                    aa aaVar2 = iVar2.f8139b[i12];
                                                    if (a11 && aaVar2.equals(aaVar) && !z12) {
                                                        yVar3.a(a(a10), g9.f8847c[i12], g9.f8849e);
                                                    }
                                                }
                                            }
                                            yVar3.h();
                                        }
                                        i12++;
                                        z8 = false;
                                    }
                                } else {
                                    y yVar4 = yVarArr2[i11];
                                    com.anythink.basead.exoplayer.h.y yVar5 = d2.f8847c[i11];
                                    if (yVar4.f() != yVar5 || (yVar5 != null && !yVar4.g())) {
                                        break;
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                        }
                    }
                    if (this.f8475P.f()) {
                        n();
                        a(b9, 10L);
                        return;
                    }
                    q c9 = this.f8475P.c();
                    com.anythink.basead.exoplayer.k.ad.a("doSomeWork");
                    g();
                    long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                    c9.f8845a.a(this.f8477R.f8913j - this.J, this.f8470K);
                    boolean z13 = true;
                    boolean z14 = true;
                    for (y yVar6 : this.f8479T) {
                        yVar6.a(this.ab, elapsedRealtime);
                        z14 = z14 && yVar6.v();
                        boolean z15 = yVar6.u() || yVar6.v() || ((qVar = this.f8475P.d().i) != null && qVar.f8850f && yVar6.g());
                        if (!z15) {
                            yVar6.j();
                        }
                        z13 = z13 && z15;
                    }
                    if (!z13) {
                        n();
                    }
                    long j10 = c9.f8852h.f8863e;
                    if (!z14 || ((j10 != j9 && j10 > this.f8477R.f8913j) || !c9.f8852h.f8865g)) {
                        u uVar2 = this.f8477R;
                        if (uVar2.f8910f == 2) {
                            if (this.f8479T.length == 0) {
                                z9 = m();
                            } else {
                                if (z13) {
                                    if (uVar2.f8911g) {
                                        q b11 = this.f8475P.b();
                                        long a12 = b11.a(!b11.f8852h.f8865g);
                                        if (a12 != Long.MIN_VALUE) {
                                        }
                                    }
                                }
                                z9 = false;
                            }
                            if (z9) {
                                b(3);
                                if (this.f8481V) {
                                    e();
                                }
                            }
                        }
                        if (this.f8477R.f8910f == 3 && (this.f8479T.length != 0 ? !z13 : !m())) {
                            this.f8482W = this.f8481V;
                            b(2);
                            f();
                        }
                    } else {
                        b(4);
                        f();
                    }
                    if (this.f8477R.f8910f == 2) {
                        for (y yVar7 : this.f8479T) {
                            yVar7.j();
                        }
                    }
                    if ((this.f8481V && this.f8477R.f8910f == 3) || (i4 = this.f8477R.f8910f) == 2) {
                        a(b9, 10L);
                    } else if (this.f8479T.length == 0 || i4 == 4) {
                        this.f8464D.b();
                    } else {
                        a(b9, 1000L);
                    }
                    com.anythink.basead.exoplayer.k.ad.a();
                    return;
                }
            }
        }
        j9 = com.anythink.basead.exoplayer.b.f6539b;
        if (this.f8475P.f()) {
        }
    }

    private void i() {
        a(true, true, true);
        this.f8463C.c();
        b(1);
        this.f8465E.quitSafely();
        synchronized (this) {
            this.f8480U = true;
            notifyAll();
        }
    }

    private int j() {
        ae aeVar = this.f8477R.f8905a;
        if (aeVar.a()) {
            return 0;
        }
        return aeVar.a(aeVar.b(this.Y), this.f8468H, false).f6510f;
    }

    private void k() {
        for (int size = this.f8473N.size() - 1; size >= 0; size--) {
            if (!a(this.f8473N.get(size))) {
                this.f8473N.get(size).f8516a.a(false);
                this.f8473N.remove(size);
            }
        }
        Collections.sort(this.f8473N);
    }

    private void l() {
        if (this.f8475P.f()) {
            float f6 = this.f8471L.e().f8916b;
            q d2 = this.f8475P.d();
            boolean z8 = true;
            for (q c4 = this.f8475P.c(); c4 != null && c4.f8850f; c4 = c4.i) {
                if (c4.a(f6)) {
                    if (z8) {
                        q c9 = this.f8475P.c();
                        boolean a9 = this.f8475P.a(c9);
                        boolean[] zArr = new boolean[this.f8485y.length];
                        long a10 = c9.a(this.f8477R.f8913j, a9, zArr);
                        a(c9.f8854k);
                        u uVar = this.f8477R;
                        if (uVar.f8910f != 4 && a10 != uVar.f8913j) {
                            u uVar2 = this.f8477R;
                            this.f8477R = uVar2.a(uVar2.f8907c, a10, uVar2.f8909e);
                            this.f8472M.b(4);
                            a(a10);
                        }
                        boolean[] zArr2 = new boolean[this.f8485y.length];
                        int i4 = 0;
                        int i9 = 0;
                        while (true) {
                            y[] yVarArr = this.f8485y;
                            if (i4 >= yVarArr.length) {
                                break;
                            }
                            y yVar = yVarArr[i4];
                            boolean z9 = yVar.a_() != 0;
                            zArr2[i4] = z9;
                            com.anythink.basead.exoplayer.h.y yVar2 = c9.f8847c[i4];
                            if (yVar2 != null) {
                                i9++;
                            }
                            if (z9) {
                                if (yVar2 != yVar.f()) {
                                    b(yVar);
                                } else if (zArr[i4]) {
                                    yVar.a(this.ab);
                                }
                            }
                            i4++;
                        }
                        this.f8477R = this.f8477R.a(c9.f8853j, c9.f8854k);
                        a(zArr2, i9);
                    } else {
                        this.f8475P.a(c4);
                        if (c4.f8850f) {
                            c4.b(Math.max(c4.f8852h.f8860b, this.ab - c4.f8849e));
                            a(c4.f8854k);
                        }
                    }
                    if (this.f8477R.f8910f != 4) {
                        r();
                        g();
                        this.f8464D.b(2);
                        return;
                    }
                    return;
                }
                if (c4 == d2) {
                    z8 = false;
                }
            }
        }
    }

    private boolean m() {
        q c4 = this.f8475P.c();
        long j9 = c4.f8852h.f8863e;
        if (j9 == com.anythink.basead.exoplayer.b.f6539b || this.f8477R.f8913j < j9) {
            return true;
        }
        q qVar = c4.i;
        if (qVar != null) {
            return qVar.f8850f || qVar.f8852h.f8859a.a();
        }
        return false;
    }

    private void n() {
        q b9 = this.f8475P.b();
        q d2 = this.f8475P.d();
        if (b9 == null || b9.f8850f) {
            return;
        }
        if (d2 == null || d2.i == b9) {
            for (y yVar : this.f8479T) {
                if (!yVar.g()) {
                    return;
                }
            }
            b9.f8845a.a();
        }
    }

    private void o() {
        b(4);
        a(false, true, false);
    }

    private void p() {
        com.anythink.basead.exoplayer.h.s sVar = this.f8478S;
        if (sVar == null) {
            return;
        }
        if (this.f8484Z > 0) {
            sVar.b();
            return;
        }
        this.f8475P.a(this.ab);
        if (this.f8475P.a()) {
            r a9 = this.f8475P.a(this.ab, this.f8477R);
            if (a9 == null) {
                this.f8478S.b();
            } else {
                this.f8475P.a(this.f8486z, this.f8461A, this.f8463C.d(), this.f8478S, this.f8477R.f8905a.a(a9.f8859a.f7924a, this.f8469I, true).f6500b, a9).a(this, a9.f8860b);
                d(true);
            }
        }
        q b9 = this.f8475P.b();
        int i4 = 0;
        if (b9 == null || b9.a()) {
            d(false);
        } else if (!this.f8477R.f8911g) {
            r();
        }
        if (!this.f8475P.f()) {
            return;
        }
        q c4 = this.f8475P.c();
        q d2 = this.f8475P.d();
        boolean z8 = false;
        while (this.f8481V && c4 != d2 && this.ab >= c4.i.f8849e) {
            if (z8) {
                d();
            }
            int i9 = c4.f8852h.f8864f ? 0 : 3;
            q h9 = this.f8475P.h();
            a(c4);
            u uVar = this.f8477R;
            r rVar = h9.f8852h;
            this.f8477R = uVar.a(rVar.f8859a, rVar.f8860b, rVar.f8862d);
            this.f8472M.b(i9);
            g();
            z8 = true;
            c4 = h9;
        }
        if (d2.f8852h.f8865g) {
            while (true) {
                y[] yVarArr = this.f8485y;
                if (i4 >= yVarArr.length) {
                    return;
                }
                y yVar = yVarArr[i4];
                com.anythink.basead.exoplayer.h.y yVar2 = d2.f8847c[i4];
                if (yVar2 != null && yVar.f() == yVar2 && yVar.g()) {
                    yVar.h();
                }
                i4++;
            }
        } else {
            q qVar = d2.i;
            if (qVar == null || !qVar.f8850f) {
                return;
            }
            int i10 = 0;
            while (true) {
                y[] yVarArr2 = this.f8485y;
                if (i10 < yVarArr2.length) {
                    y yVar3 = yVarArr2[i10];
                    com.anythink.basead.exoplayer.h.y yVar4 = d2.f8847c[i10];
                    if (yVar3.f() != yVar4) {
                        return;
                    }
                    if (yVar4 != null && !yVar3.g()) {
                        return;
                    } else {
                        i10++;
                    }
                } else {
                    com.anythink.basead.exoplayer.i.i iVar = d2.f8854k;
                    q g9 = this.f8475P.g();
                    com.anythink.basead.exoplayer.i.i iVar2 = g9.f8854k;
                    boolean z9 = g9.f8845a.c() != com.anythink.basead.exoplayer.b.f6539b;
                    int i11 = 0;
                    while (true) {
                        y[] yVarArr3 = this.f8485y;
                        if (i11 >= yVarArr3.length) {
                            return;
                        }
                        y yVar5 = yVarArr3[i11];
                        if (iVar.a(i11)) {
                            if (!z9) {
                                if (!yVar5.i()) {
                                    com.anythink.basead.exoplayer.i.f a10 = iVar2.f8140c.a(i11);
                                    boolean a11 = iVar2.a(i11);
                                    boolean z10 = this.f8486z[i11].a() == 5;
                                    aa aaVar = iVar.f8139b[i11];
                                    aa aaVar2 = iVar2.f8139b[i11];
                                    if (a11 && aaVar2.equals(aaVar) && !z10) {
                                        yVar5.a(a(a10), g9.f8847c[i11], g9.f8849e);
                                    }
                                }
                            }
                            yVar5.h();
                        }
                        i11++;
                    }
                }
            }
        }
    }

    private void q() {
        this.f8475P.a(this.ab);
        if (this.f8475P.a()) {
            r a9 = this.f8475P.a(this.ab, this.f8477R);
            if (a9 == null) {
                this.f8478S.b();
                return;
            }
            this.f8475P.a(this.f8486z, this.f8461A, this.f8463C.d(), this.f8478S, this.f8477R.f8905a.a(a9.f8859a.f7924a, this.f8469I, true).f6500b, a9).a(this, a9.f8860b);
            d(true);
        }
    }

    private void r() {
        q b9 = this.f8475P.b();
        long b10 = b9.b();
        if (b10 == Long.MIN_VALUE) {
            d(false);
            return;
        }
        boolean a9 = this.f8463C.a(b10 - (this.ab - b9.f8849e), this.f8471L.e().f8916b);
        d(a9);
        if (a9) {
            b9.a(this.ab);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.z.a
    public final /* synthetic */ void a(com.anythink.basead.exoplayer.h.r rVar) {
        this.f8464D.a(10, rVar).sendToTarget();
    }

    public final void c(boolean z8) {
        this.f8464D.a(6, z8 ? 1 : 0).sendToTarget();
    }

    /* JADX WARN: Code restructure failed: missing block: B:387:0x07f2, code lost:
    
        if (r13 == false) goto L399;
     */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04b0 A[Catch: all -> 0x04b9, TryCatch #3 {all -> 0x04b9, blocks: (B:190:0x04a2, B:192:0x04a6, B:197:0x04b0, B:203:0x04bc, B:205:0x04c6, B:209:0x04d2, B:210:0x04dc, B:212:0x04ec, B:216:0x0505, B:219:0x0510, B:223:0x0514), top: B:189:0x04a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0522 A[Catch: RuntimeException -> 0x002a, IOException -> 0x0217, g -> 0x021c, TryCatch #6 {RuntimeException -> 0x002a, blocks: (B:3:0x0009, B:5:0x0014, B:8:0x0018, B:9:0x08a6, B:11:0x0035, B:13:0x0041, B:14:0x0046, B:16:0x004a, B:19:0x004f, B:21:0x005a, B:22:0x0066, B:23:0x006b, B:24:0x0077, B:27:0x007e, B:29:0x0088, B:31:0x008d, B:33:0x0099, B:34:0x009e, B:36:0x00a6, B:38:0x00bd, B:40:0x00c3, B:45:0x00cc, B:49:0x00d1, B:51:0x00f5, B:53:0x00fb, B:54:0x0111, B:55:0x0118, B:57:0x011d, B:60:0x0128, B:62:0x0130, B:64:0x0134, B:66:0x013a, B:69:0x013e, B:71:0x0142, B:68:0x0147, B:77:0x014a, B:78:0x0178, B:80:0x017e, B:81:0x015a, B:83:0x0163, B:87:0x018b, B:89:0x0197, B:470:0x01e8, B:472:0x0206, B:473:0x0221, B:90:0x0237, B:92:0x0243, B:94:0x0262, B:96:0x0270, B:98:0x0283, B:101:0x0286, B:103:0x028f, B:105:0x029b, B:107:0x02a5, B:108:0x02aa, B:111:0x02cb, B:113:0x02d3, B:115:0x02db, B:117:0x02e1, B:118:0x02e6, B:121:0x0311, B:123:0x0319, B:125:0x0327, B:127:0x032d, B:130:0x0342, B:132:0x034a, B:134:0x0352, B:135:0x035e, B:137:0x0365, B:139:0x036b, B:140:0x0370, B:142:0x039b, B:143:0x03a7, B:145:0x03ab, B:152:0x03b3, B:148:0x03be, B:155:0x03c7, B:158:0x03cf, B:161:0x03e1, B:162:0x03e9, B:164:0x03f3, B:166:0x03ff, B:169:0x0407, B:171:0x0417, B:173:0x0421, B:174:0x035c, B:175:0x0427, B:177:0x042d, B:181:0x0436, B:183:0x043b, B:184:0x0443, B:185:0x044e, B:187:0x045e, B:199:0x0518, B:201:0x0522, B:202:0x04ff, B:213:0x04f0, B:215:0x04fc, B:226:0x0526, B:228:0x0532, B:229:0x0538, B:230:0x046d, B:233:0x048e, B:239:0x0539, B:241:0x0543, B:243:0x0547, B:244:0x054e, B:246:0x055d, B:248:0x0569, B:249:0x056f, B:250:0x05a5, B:252:0x05ad, B:254:0x05b5, B:256:0x05bb, B:257:0x05c2, B:259:0x05ca, B:260:0x05d7, B:263:0x05dd, B:266:0x05e9, B:267:0x05ec, B:271:0x05f5, B:275:0x0621, B:278:0x062a, B:280:0x062f, B:282:0x0637, B:284:0x063d, B:286:0x0643, B:288:0x0646, B:293:0x06dd, B:295:0x06e7, B:296:0x06ef, B:298:0x071a, B:300:0x0723, B:303:0x072c, B:305:0x0732, B:307:0x0738, B:309:0x0742, B:311:0x0746, B:316:0x0752, B:321:0x075c, B:328:0x0763, B:329:0x0766, B:333:0x0770, B:335:0x0778, B:337:0x077e, B:338:0x07ff, B:340:0x0806, B:342:0x080c, B:344:0x0814, B:346:0x0818, B:350:0x082b, B:351:0x0841, B:352:0x0823, B:355:0x082f, B:358:0x0836, B:359:0x083c, B:360:0x0786, B:362:0x078d, B:364:0x0792, B:366:0x07d3, B:368:0x07db, B:370:0x0799, B:373:0x079f, B:375:0x07b7, B:379:0x07df, B:381:0x07e6, B:383:0x07eb, B:386:0x07f4, B:388:0x0649, B:390:0x064d, B:394:0x0654, B:396:0x0659, B:399:0x0667, B:404:0x066f, B:408:0x0672, B:412:0x068a, B:414:0x068f, B:417:0x0699, B:419:0x069f, B:422:0x06b7, B:424:0x06c1, B:427:0x06c9, B:432:0x06d7, B:429:0x06da, B:440:0x05bf, B:442:0x0845, B:446:0x084e, B:448:0x0854, B:449:0x085b, B:451:0x0862, B:454:0x086f, B:456:0x0875, B:459:0x0880, B:462:0x0887), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04bc A[Catch: all -> 0x04b9, TryCatch #3 {all -> 0x04b9, blocks: (B:190:0x04a2, B:192:0x04a6, B:197:0x04b0, B:203:0x04bc, B:205:0x04c6, B:209:0x04d2, B:210:0x04dc, B:212:0x04ec, B:216:0x0505, B:219:0x0510, B:223:0x0514), top: B:189:0x04a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x06e7 A[Catch: RuntimeException -> 0x002a, IOException -> 0x0217, g -> 0x021c, TryCatch #6 {RuntimeException -> 0x002a, blocks: (B:3:0x0009, B:5:0x0014, B:8:0x0018, B:9:0x08a6, B:11:0x0035, B:13:0x0041, B:14:0x0046, B:16:0x004a, B:19:0x004f, B:21:0x005a, B:22:0x0066, B:23:0x006b, B:24:0x0077, B:27:0x007e, B:29:0x0088, B:31:0x008d, B:33:0x0099, B:34:0x009e, B:36:0x00a6, B:38:0x00bd, B:40:0x00c3, B:45:0x00cc, B:49:0x00d1, B:51:0x00f5, B:53:0x00fb, B:54:0x0111, B:55:0x0118, B:57:0x011d, B:60:0x0128, B:62:0x0130, B:64:0x0134, B:66:0x013a, B:69:0x013e, B:71:0x0142, B:68:0x0147, B:77:0x014a, B:78:0x0178, B:80:0x017e, B:81:0x015a, B:83:0x0163, B:87:0x018b, B:89:0x0197, B:470:0x01e8, B:472:0x0206, B:473:0x0221, B:90:0x0237, B:92:0x0243, B:94:0x0262, B:96:0x0270, B:98:0x0283, B:101:0x0286, B:103:0x028f, B:105:0x029b, B:107:0x02a5, B:108:0x02aa, B:111:0x02cb, B:113:0x02d3, B:115:0x02db, B:117:0x02e1, B:118:0x02e6, B:121:0x0311, B:123:0x0319, B:125:0x0327, B:127:0x032d, B:130:0x0342, B:132:0x034a, B:134:0x0352, B:135:0x035e, B:137:0x0365, B:139:0x036b, B:140:0x0370, B:142:0x039b, B:143:0x03a7, B:145:0x03ab, B:152:0x03b3, B:148:0x03be, B:155:0x03c7, B:158:0x03cf, B:161:0x03e1, B:162:0x03e9, B:164:0x03f3, B:166:0x03ff, B:169:0x0407, B:171:0x0417, B:173:0x0421, B:174:0x035c, B:175:0x0427, B:177:0x042d, B:181:0x0436, B:183:0x043b, B:184:0x0443, B:185:0x044e, B:187:0x045e, B:199:0x0518, B:201:0x0522, B:202:0x04ff, B:213:0x04f0, B:215:0x04fc, B:226:0x0526, B:228:0x0532, B:229:0x0538, B:230:0x046d, B:233:0x048e, B:239:0x0539, B:241:0x0543, B:243:0x0547, B:244:0x054e, B:246:0x055d, B:248:0x0569, B:249:0x056f, B:250:0x05a5, B:252:0x05ad, B:254:0x05b5, B:256:0x05bb, B:257:0x05c2, B:259:0x05ca, B:260:0x05d7, B:263:0x05dd, B:266:0x05e9, B:267:0x05ec, B:271:0x05f5, B:275:0x0621, B:278:0x062a, B:280:0x062f, B:282:0x0637, B:284:0x063d, B:286:0x0643, B:288:0x0646, B:293:0x06dd, B:295:0x06e7, B:296:0x06ef, B:298:0x071a, B:300:0x0723, B:303:0x072c, B:305:0x0732, B:307:0x0738, B:309:0x0742, B:311:0x0746, B:316:0x0752, B:321:0x075c, B:328:0x0763, B:329:0x0766, B:333:0x0770, B:335:0x0778, B:337:0x077e, B:338:0x07ff, B:340:0x0806, B:342:0x080c, B:344:0x0814, B:346:0x0818, B:350:0x082b, B:351:0x0841, B:352:0x0823, B:355:0x082f, B:358:0x0836, B:359:0x083c, B:360:0x0786, B:362:0x078d, B:364:0x0792, B:366:0x07d3, B:368:0x07db, B:370:0x0799, B:373:0x079f, B:375:0x07b7, B:379:0x07df, B:381:0x07e6, B:383:0x07eb, B:386:0x07f4, B:388:0x0649, B:390:0x064d, B:394:0x0654, B:396:0x0659, B:399:0x0667, B:404:0x066f, B:408:0x0672, B:412:0x068a, B:414:0x068f, B:417:0x0699, B:419:0x069f, B:422:0x06b7, B:424:0x06c1, B:427:0x06c9, B:432:0x06d7, B:429:0x06da, B:440:0x05bf, B:442:0x0845, B:446:0x084e, B:448:0x0854, B:449:0x085b, B:451:0x0862, B:454:0x086f, B:456:0x0875, B:459:0x0880, B:462:0x0887), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x06ef A[Catch: RuntimeException -> 0x002a, IOException -> 0x0217, g -> 0x021c, TryCatch #6 {RuntimeException -> 0x002a, blocks: (B:3:0x0009, B:5:0x0014, B:8:0x0018, B:9:0x08a6, B:11:0x0035, B:13:0x0041, B:14:0x0046, B:16:0x004a, B:19:0x004f, B:21:0x005a, B:22:0x0066, B:23:0x006b, B:24:0x0077, B:27:0x007e, B:29:0x0088, B:31:0x008d, B:33:0x0099, B:34:0x009e, B:36:0x00a6, B:38:0x00bd, B:40:0x00c3, B:45:0x00cc, B:49:0x00d1, B:51:0x00f5, B:53:0x00fb, B:54:0x0111, B:55:0x0118, B:57:0x011d, B:60:0x0128, B:62:0x0130, B:64:0x0134, B:66:0x013a, B:69:0x013e, B:71:0x0142, B:68:0x0147, B:77:0x014a, B:78:0x0178, B:80:0x017e, B:81:0x015a, B:83:0x0163, B:87:0x018b, B:89:0x0197, B:470:0x01e8, B:472:0x0206, B:473:0x0221, B:90:0x0237, B:92:0x0243, B:94:0x0262, B:96:0x0270, B:98:0x0283, B:101:0x0286, B:103:0x028f, B:105:0x029b, B:107:0x02a5, B:108:0x02aa, B:111:0x02cb, B:113:0x02d3, B:115:0x02db, B:117:0x02e1, B:118:0x02e6, B:121:0x0311, B:123:0x0319, B:125:0x0327, B:127:0x032d, B:130:0x0342, B:132:0x034a, B:134:0x0352, B:135:0x035e, B:137:0x0365, B:139:0x036b, B:140:0x0370, B:142:0x039b, B:143:0x03a7, B:145:0x03ab, B:152:0x03b3, B:148:0x03be, B:155:0x03c7, B:158:0x03cf, B:161:0x03e1, B:162:0x03e9, B:164:0x03f3, B:166:0x03ff, B:169:0x0407, B:171:0x0417, B:173:0x0421, B:174:0x035c, B:175:0x0427, B:177:0x042d, B:181:0x0436, B:183:0x043b, B:184:0x0443, B:185:0x044e, B:187:0x045e, B:199:0x0518, B:201:0x0522, B:202:0x04ff, B:213:0x04f0, B:215:0x04fc, B:226:0x0526, B:228:0x0532, B:229:0x0538, B:230:0x046d, B:233:0x048e, B:239:0x0539, B:241:0x0543, B:243:0x0547, B:244:0x054e, B:246:0x055d, B:248:0x0569, B:249:0x056f, B:250:0x05a5, B:252:0x05ad, B:254:0x05b5, B:256:0x05bb, B:257:0x05c2, B:259:0x05ca, B:260:0x05d7, B:263:0x05dd, B:266:0x05e9, B:267:0x05ec, B:271:0x05f5, B:275:0x0621, B:278:0x062a, B:280:0x062f, B:282:0x0637, B:284:0x063d, B:286:0x0643, B:288:0x0646, B:293:0x06dd, B:295:0x06e7, B:296:0x06ef, B:298:0x071a, B:300:0x0723, B:303:0x072c, B:305:0x0732, B:307:0x0738, B:309:0x0742, B:311:0x0746, B:316:0x0752, B:321:0x075c, B:328:0x0763, B:329:0x0766, B:333:0x0770, B:335:0x0778, B:337:0x077e, B:338:0x07ff, B:340:0x0806, B:342:0x080c, B:344:0x0814, B:346:0x0818, B:350:0x082b, B:351:0x0841, B:352:0x0823, B:355:0x082f, B:358:0x0836, B:359:0x083c, B:360:0x0786, B:362:0x078d, B:364:0x0792, B:366:0x07d3, B:368:0x07db, B:370:0x0799, B:373:0x079f, B:375:0x07b7, B:379:0x07df, B:381:0x07e6, B:383:0x07eb, B:386:0x07f4, B:388:0x0649, B:390:0x064d, B:394:0x0654, B:396:0x0659, B:399:0x0667, B:404:0x066f, B:408:0x0672, B:412:0x068a, B:414:0x068f, B:417:0x0699, B:419:0x069f, B:422:0x06b7, B:424:0x06c1, B:427:0x06c9, B:432:0x06d7, B:429:0x06da, B:440:0x05bf, B:442:0x0845, B:446:0x084e, B:448:0x0854, B:449:0x085b, B:451:0x0862, B:454:0x086f, B:456:0x0875, B:459:0x0880, B:462:0x0887), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0752 A[Catch: RuntimeException -> 0x002a, IOException -> 0x0217, g -> 0x021c, TryCatch #6 {RuntimeException -> 0x002a, blocks: (B:3:0x0009, B:5:0x0014, B:8:0x0018, B:9:0x08a6, B:11:0x0035, B:13:0x0041, B:14:0x0046, B:16:0x004a, B:19:0x004f, B:21:0x005a, B:22:0x0066, B:23:0x006b, B:24:0x0077, B:27:0x007e, B:29:0x0088, B:31:0x008d, B:33:0x0099, B:34:0x009e, B:36:0x00a6, B:38:0x00bd, B:40:0x00c3, B:45:0x00cc, B:49:0x00d1, B:51:0x00f5, B:53:0x00fb, B:54:0x0111, B:55:0x0118, B:57:0x011d, B:60:0x0128, B:62:0x0130, B:64:0x0134, B:66:0x013a, B:69:0x013e, B:71:0x0142, B:68:0x0147, B:77:0x014a, B:78:0x0178, B:80:0x017e, B:81:0x015a, B:83:0x0163, B:87:0x018b, B:89:0x0197, B:470:0x01e8, B:472:0x0206, B:473:0x0221, B:90:0x0237, B:92:0x0243, B:94:0x0262, B:96:0x0270, B:98:0x0283, B:101:0x0286, B:103:0x028f, B:105:0x029b, B:107:0x02a5, B:108:0x02aa, B:111:0x02cb, B:113:0x02d3, B:115:0x02db, B:117:0x02e1, B:118:0x02e6, B:121:0x0311, B:123:0x0319, B:125:0x0327, B:127:0x032d, B:130:0x0342, B:132:0x034a, B:134:0x0352, B:135:0x035e, B:137:0x0365, B:139:0x036b, B:140:0x0370, B:142:0x039b, B:143:0x03a7, B:145:0x03ab, B:152:0x03b3, B:148:0x03be, B:155:0x03c7, B:158:0x03cf, B:161:0x03e1, B:162:0x03e9, B:164:0x03f3, B:166:0x03ff, B:169:0x0407, B:171:0x0417, B:173:0x0421, B:174:0x035c, B:175:0x0427, B:177:0x042d, B:181:0x0436, B:183:0x043b, B:184:0x0443, B:185:0x044e, B:187:0x045e, B:199:0x0518, B:201:0x0522, B:202:0x04ff, B:213:0x04f0, B:215:0x04fc, B:226:0x0526, B:228:0x0532, B:229:0x0538, B:230:0x046d, B:233:0x048e, B:239:0x0539, B:241:0x0543, B:243:0x0547, B:244:0x054e, B:246:0x055d, B:248:0x0569, B:249:0x056f, B:250:0x05a5, B:252:0x05ad, B:254:0x05b5, B:256:0x05bb, B:257:0x05c2, B:259:0x05ca, B:260:0x05d7, B:263:0x05dd, B:266:0x05e9, B:267:0x05ec, B:271:0x05f5, B:275:0x0621, B:278:0x062a, B:280:0x062f, B:282:0x0637, B:284:0x063d, B:286:0x0643, B:288:0x0646, B:293:0x06dd, B:295:0x06e7, B:296:0x06ef, B:298:0x071a, B:300:0x0723, B:303:0x072c, B:305:0x0732, B:307:0x0738, B:309:0x0742, B:311:0x0746, B:316:0x0752, B:321:0x075c, B:328:0x0763, B:329:0x0766, B:333:0x0770, B:335:0x0778, B:337:0x077e, B:338:0x07ff, B:340:0x0806, B:342:0x080c, B:344:0x0814, B:346:0x0818, B:350:0x082b, B:351:0x0841, B:352:0x0823, B:355:0x082f, B:358:0x0836, B:359:0x083c, B:360:0x0786, B:362:0x078d, B:364:0x0792, B:366:0x07d3, B:368:0x07db, B:370:0x0799, B:373:0x079f, B:375:0x07b7, B:379:0x07df, B:381:0x07e6, B:383:0x07eb, B:386:0x07f4, B:388:0x0649, B:390:0x064d, B:394:0x0654, B:396:0x0659, B:399:0x0667, B:404:0x066f, B:408:0x0672, B:412:0x068a, B:414:0x068f, B:417:0x0699, B:419:0x069f, B:422:0x06b7, B:424:0x06c1, B:427:0x06c9, B:432:0x06d7, B:429:0x06da, B:440:0x05bf, B:442:0x0845, B:446:0x084e, B:448:0x0854, B:449:0x085b, B:451:0x0862, B:454:0x086f, B:456:0x0875, B:459:0x0880, B:462:0x0887), top: B:2:0x0009 }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        boolean z8;
        boolean z9;
        long j9;
        boolean z10;
        boolean z11;
        q qVar;
        int i4;
        long longValue;
        boolean z12;
        s.a aVar;
        long j10;
        int i9;
        c cVar;
        long j11;
        long j12;
        long j13;
        long j14;
        int i10 = 2;
        try {
            try {
                int i11 = message.what;
                long j15 = 0;
                long j16 = com.anythink.basead.exoplayer.b.f6539b;
                try {
                    switch (i11) {
                        case 0:
                            com.anythink.basead.exoplayer.h.s sVar = (com.anythink.basead.exoplayer.h.s) message.obj;
                            boolean z13 = message.arg1 != 0;
                            boolean z14 = message.arg2 != 0;
                            this.f8484Z++;
                            a(true, z13, z14);
                            this.f8463C.a();
                            this.f8478S = sVar;
                            b(2);
                            sVar.a(this.f8467G, true, this);
                            this.f8464D.b(2);
                            d();
                            return true;
                        case 1:
                            boolean z15 = message.arg1 != 0;
                            this.f8482W = false;
                            this.f8481V = z15;
                            if (z15) {
                                int i12 = this.f8477R.f8910f;
                                if (i12 == 3) {
                                    e();
                                    this.f8464D.b(2);
                                } else if (i12 == 2) {
                                    this.f8464D.b(2);
                                }
                            } else {
                                f();
                                g();
                            }
                            d();
                            return true;
                        case 2:
                            long b9 = this.f8474O.b();
                            com.anythink.basead.exoplayer.h.s sVar2 = this.f8478S;
                            if (sVar2 != null) {
                                if (this.f8484Z > 0) {
                                    sVar2.b();
                                } else {
                                    this.f8475P.a(this.ab);
                                    if (this.f8475P.a()) {
                                        r a9 = this.f8475P.a(this.ab, this.f8477R);
                                        if (a9 == null) {
                                            this.f8478S.b();
                                        } else {
                                            this.f8475P.a(this.f8486z, this.f8461A, this.f8463C.d(), this.f8478S, this.f8477R.f8905a.a(a9.f8859a.f7924a, this.f8469I, true).f6500b, a9).a(this, a9.f8860b);
                                            d(true);
                                        }
                                    }
                                    q b10 = this.f8475P.b();
                                    if (b10 == null || b10.a()) {
                                        d(false);
                                    } else if (!this.f8477R.f8911g) {
                                        r();
                                    }
                                    if (this.f8475P.f()) {
                                        q c4 = this.f8475P.c();
                                        q d2 = this.f8475P.d();
                                        boolean z16 = false;
                                        while (this.f8481V && c4 != d2 && this.ab >= c4.i.f8849e) {
                                            if (z16) {
                                                d();
                                            }
                                            int i13 = c4.f8852h.f8864f ? 0 : 3;
                                            q h9 = this.f8475P.h();
                                            a(c4);
                                            u uVar = this.f8477R;
                                            r rVar = h9.f8852h;
                                            this.f8477R = uVar.a(rVar.f8859a, rVar.f8860b, rVar.f8862d);
                                            this.f8472M.b(i13);
                                            g();
                                            c4 = h9;
                                            j16 = j16;
                                            z16 = true;
                                        }
                                        j9 = j16;
                                        if (d2.f8852h.f8865g) {
                                            int i14 = 0;
                                            while (true) {
                                                y[] yVarArr = this.f8485y;
                                                if (i14 < yVarArr.length) {
                                                    y yVar = yVarArr[i14];
                                                    com.anythink.basead.exoplayer.h.y yVar2 = d2.f8847c[i14];
                                                    if (yVar2 != null && yVar.f() == yVar2 && yVar.g()) {
                                                        yVar.h();
                                                    }
                                                    i14++;
                                                }
                                            }
                                        } else {
                                            q qVar2 = d2.i;
                                            if (qVar2 != null && qVar2.f8850f) {
                                                while (true) {
                                                    y[] yVarArr2 = this.f8485y;
                                                    if (i4 < yVarArr2.length) {
                                                        y yVar3 = yVarArr2[i4];
                                                        com.anythink.basead.exoplayer.h.y yVar4 = d2.f8847c[i4];
                                                        i4 = (yVar3.f() == yVar4 && (yVar4 == null || yVar3.g())) ? i4 + 1 : 0;
                                                    } else {
                                                        com.anythink.basead.exoplayer.i.i iVar = d2.f8854k;
                                                        q g9 = this.f8475P.g();
                                                        com.anythink.basead.exoplayer.i.i iVar2 = g9.f8854k;
                                                        boolean z17 = g9.f8845a.c() != j9;
                                                        int i15 = 0;
                                                        while (true) {
                                                            y[] yVarArr3 = this.f8485y;
                                                            if (i15 < yVarArr3.length) {
                                                                y yVar5 = yVarArr3[i15];
                                                                if (iVar.a(i15)) {
                                                                    if (!z17) {
                                                                        if (!yVar5.i()) {
                                                                            com.anythink.basead.exoplayer.i.f a10 = iVar2.f8140c.a(i15);
                                                                            boolean a11 = iVar2.a(i15);
                                                                            boolean z18 = this.f8486z[i15].a() == 5;
                                                                            aa aaVar = iVar.f8139b[i15];
                                                                            aa aaVar2 = iVar2.f8139b[i15];
                                                                            if (a11 && aaVar2.equals(aaVar) && !z18) {
                                                                                yVar5.a(a(a10), g9.f8847c[i15], g9.f8849e);
                                                                            }
                                                                        }
                                                                    }
                                                                    yVar5.h();
                                                                }
                                                                i15++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (this.f8475P.f()) {
                                            n();
                                            a(b9, 10L);
                                        } else {
                                            q c9 = this.f8475P.c();
                                            com.anythink.basead.exoplayer.k.ad.a("doSomeWork");
                                            g();
                                            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                                            c9.f8845a.a(this.f8477R.f8913j - this.J, this.f8470K);
                                            boolean z19 = true;
                                            boolean z20 = true;
                                            for (y yVar6 : this.f8479T) {
                                                yVar6.a(this.ab, elapsedRealtime);
                                                z20 = z20 && yVar6.v();
                                                if (!yVar6.u() && !yVar6.v() && ((qVar = this.f8475P.d().i) == null || !qVar.f8850f || !yVar6.g())) {
                                                    z11 = false;
                                                    if (!z11) {
                                                        yVar6.j();
                                                    }
                                                    z19 = !z19 && z11;
                                                }
                                                z11 = true;
                                                if (!z11) {
                                                }
                                                if (z19) {
                                                }
                                            }
                                            if (!z19) {
                                                n();
                                            }
                                            long j17 = c9.f8852h.f8863e;
                                            if (!z20 || ((j17 != j9 && j17 > this.f8477R.f8913j) || !c9.f8852h.f8865g)) {
                                                u uVar2 = this.f8477R;
                                                if (uVar2.f8910f == 2) {
                                                    if (this.f8479T.length == 0) {
                                                        z10 = m();
                                                    } else {
                                                        if (z19) {
                                                            if (uVar2.f8911g) {
                                                                q b11 = this.f8475P.b();
                                                                long a12 = b11.a(!b11.f8852h.f8865g);
                                                                if (a12 != Long.MIN_VALUE) {
                                                                    if (this.f8463C.a(a12 - (this.ab - b11.f8849e), this.f8471L.e().f8916b, this.f8482W)) {
                                                                    }
                                                                }
                                                            }
                                                            z10 = true;
                                                        }
                                                        z10 = false;
                                                    }
                                                    if (z10) {
                                                        b(3);
                                                        if (this.f8481V) {
                                                            e();
                                                        }
                                                    }
                                                }
                                                if (this.f8477R.f8910f == 3) {
                                                    if (this.f8479T.length == 0) {
                                                        if (m()) {
                                                        }
                                                        this.f8482W = this.f8481V;
                                                        b(2);
                                                        f();
                                                    }
                                                }
                                            } else {
                                                b(4);
                                                f();
                                            }
                                            if (this.f8477R.f8910f == 2) {
                                                for (y yVar7 : this.f8479T) {
                                                    yVar7.j();
                                                }
                                            }
                                            if (this.f8481V) {
                                                if (this.f8477R.f8910f != 3) {
                                                }
                                                a(b9, 10L);
                                                com.anythink.basead.exoplayer.k.ad.a();
                                            }
                                            int i16 = this.f8477R.f8910f;
                                            if (i16 == 2) {
                                                a(b9, 10L);
                                                com.anythink.basead.exoplayer.k.ad.a();
                                            } else {
                                                if (this.f8479T.length == 0 || i16 == 4) {
                                                    this.f8464D.b();
                                                } else {
                                                    a(b9, 1000L);
                                                }
                                                com.anythink.basead.exoplayer.k.ad.a();
                                            }
                                        }
                                        d();
                                        return true;
                                    }
                                }
                            }
                            j9 = -9223372036854775807L;
                            if (this.f8475P.f()) {
                            }
                            d();
                            return true;
                        case 3:
                            d dVar = (d) message.obj;
                            this.f8472M.a(1);
                            Pair<Integer, Long> a13 = a(dVar, true);
                            try {
                                if (a13 == null) {
                                    aVar = new s.a(j());
                                    longValue = -9223372036854775807L;
                                    j10 = -9223372036854775807L;
                                } else {
                                    int intValue = ((Integer) a13.first).intValue();
                                    long longValue2 = ((Long) a13.second).longValue();
                                    s.a a14 = this.f8475P.a(intValue, longValue2);
                                    if (!a14.a()) {
                                        longValue = ((Long) a13.second).longValue();
                                        z12 = dVar.f8538c == com.anythink.basead.exoplayer.b.f6539b;
                                        aVar = a14;
                                        j10 = longValue2;
                                        if (this.f8478S != null && this.f8484Z <= 0) {
                                            if (longValue != com.anythink.basead.exoplayer.b.f6539b) {
                                                b(4);
                                                a(false, true, false);
                                                j11 = longValue;
                                                this.f8477R = this.f8477R.a(aVar, j11, j10);
                                                if (z12) {
                                                    cVar = this.f8472M;
                                                    i9 = 2;
                                                    cVar.b(i9);
                                                }
                                                d();
                                                return true;
                                            }
                                            if (aVar.equals(this.f8477R.f8907c)) {
                                                q c10 = this.f8475P.c();
                                                j12 = (c10 == null || longValue == 0) ? longValue : c10.f8845a.a(longValue, this.f8476Q);
                                                if (com.anythink.basead.exoplayer.b.a(j12) == com.anythink.basead.exoplayer.b.a(this.f8477R.f8913j)) {
                                                    this.f8477R = this.f8477R.a(aVar, this.f8477R.f8913j, j10);
                                                    if (z12) {
                                                        cVar = this.f8472M;
                                                        i9 = 2;
                                                        cVar.b(i9);
                                                    }
                                                    d();
                                                    return true;
                                                }
                                            } else {
                                                j12 = longValue;
                                            }
                                            long a15 = a(aVar, j12);
                                            z12 |= longValue != a15;
                                            j11 = a15;
                                            this.f8477R = this.f8477R.a(aVar, j11, j10);
                                            if (z12) {
                                            }
                                            d();
                                            return true;
                                        }
                                        this.aa = dVar;
                                        j11 = longValue;
                                        this.f8477R = this.f8477R.a(aVar, j11, j10);
                                        if (z12) {
                                        }
                                        d();
                                        return true;
                                    }
                                    aVar = a14;
                                    j10 = longValue2;
                                    longValue = 0;
                                }
                                if (this.f8478S != null) {
                                    if (longValue != com.anythink.basead.exoplayer.b.f6539b) {
                                    }
                                }
                                this.aa = dVar;
                                j11 = longValue;
                                this.f8477R = this.f8477R.a(aVar, j11, j10);
                                if (z12) {
                                }
                                d();
                                return true;
                            } finally {
                                this.f8477R = this.f8477R.a(aVar, longValue, j10);
                                if (z12) {
                                    this.f8472M.b(2);
                                }
                            }
                            z12 = true;
                            break;
                        case 4:
                            this.f8471L.a((v) message.obj);
                            d();
                            return true;
                        case 5:
                            this.f8476Q = (ac) message.obj;
                            d();
                            return true;
                        case 6:
                            a(message.arg1 != 0, true);
                            d();
                            return true;
                        case 7:
                            i();
                            return true;
                        case 8:
                            a aVar2 = (a) message.obj;
                            if (aVar2.f8489a == this.f8478S) {
                                ae aeVar = this.f8477R.f8905a;
                                ae aeVar2 = aVar2.f8490b;
                                Object obj = aVar2.f8491c;
                                this.f8475P.a(aeVar2);
                                this.f8477R = this.f8477R.a(aeVar2, obj);
                                for (int size = this.f8473N.size() - 1; size >= 0; size--) {
                                    if (!a(this.f8473N.get(size))) {
                                        this.f8473N.get(size).f8516a.a(false);
                                        this.f8473N.remove(size);
                                    }
                                }
                                Collections.sort(this.f8473N);
                                int i17 = this.f8484Z;
                                if (i17 > 0) {
                                    this.f8472M.a(i17);
                                    this.f8484Z = 0;
                                    d dVar2 = this.aa;
                                    if (dVar2 != null) {
                                        Pair<Integer, Long> a16 = a(dVar2, true);
                                        this.aa = null;
                                        if (a16 == null) {
                                            o();
                                        } else {
                                            int intValue2 = ((Integer) a16.first).intValue();
                                            long longValue3 = ((Long) a16.second).longValue();
                                            s.a a17 = this.f8475P.a(intValue2, longValue3);
                                            this.f8477R = this.f8477R.a(a17, a17.a() ? 0L : longValue3, longValue3);
                                        }
                                    } else if (this.f8477R.f8908d == com.anythink.basead.exoplayer.b.f6539b) {
                                        if (aeVar2.a()) {
                                            o();
                                        } else {
                                            Pair<Integer, Long> a18 = a(aeVar2, aeVar2.b(this.Y));
                                            int intValue3 = ((Integer) a18.first).intValue();
                                            long longValue4 = ((Long) a18.second).longValue();
                                            s.a a19 = this.f8475P.a(intValue3, longValue4);
                                            this.f8477R = this.f8477R.a(a19, a19.a() ? 0L : longValue4, longValue4);
                                        }
                                    }
                                } else {
                                    u uVar3 = this.f8477R;
                                    int i18 = uVar3.f8907c.f7924a;
                                    long j18 = uVar3.f8909e;
                                    if (!aeVar.a()) {
                                        q e6 = this.f8475P.e();
                                        int a20 = aeVar2.a(e6 == null ? aeVar.a(i18, this.f8469I, true).f6500b : e6.f8846b);
                                        if (a20 == -1) {
                                            int a21 = a(i18, aeVar, aeVar2);
                                            if (a21 == -1) {
                                                o();
                                            } else {
                                                Pair<Integer, Long> a22 = a(aeVar2, aeVar2.a(a21, this.f8469I, false).f6501c);
                                                int intValue4 = ((Integer) a22.first).intValue();
                                                long longValue5 = ((Long) a22.second).longValue();
                                                s.a a23 = this.f8475P.a(intValue4, longValue5);
                                                aeVar2.a(intValue4, this.f8469I, true);
                                                if (e6 != null) {
                                                    Object obj2 = this.f8469I.f6500b;
                                                    e6.f8852h = e6.f8852h.a();
                                                    while (true) {
                                                        e6 = e6.i;
                                                        if (e6 != null) {
                                                            if (e6.f8846b.equals(obj2)) {
                                                                e6.f8852h = this.f8475P.a(e6.f8852h, intValue4);
                                                            } else {
                                                                e6.f8852h = e6.f8852h.a();
                                                            }
                                                        }
                                                    }
                                                }
                                                if (!a23.a()) {
                                                    j15 = longValue5;
                                                }
                                                this.f8477R = this.f8477R.a(a23, a(a23, j15), longValue5);
                                            }
                                        } else {
                                            if (a20 != i18) {
                                                this.f8477R = this.f8477R.a(a20);
                                            }
                                            s.a aVar3 = this.f8477R.f8907c;
                                            if (aVar3.a()) {
                                                s.a a24 = this.f8475P.a(a20, j18);
                                                if (!a24.equals(aVar3)) {
                                                    if (!a24.a()) {
                                                        j15 = j18;
                                                    }
                                                    this.f8477R = this.f8477R.a(a24, a(a24, j15), j18);
                                                }
                                            }
                                            if (!this.f8475P.a(aVar3, this.ab)) {
                                                g(false);
                                            }
                                        }
                                    } else if (!aeVar2.a()) {
                                        s.a a25 = this.f8475P.a(i18, j18);
                                        u uVar4 = this.f8477R;
                                        if (a25.a()) {
                                            j14 = j18;
                                            j13 = 0;
                                        } else {
                                            j13 = j18;
                                            j14 = j13;
                                        }
                                        this.f8477R = uVar4.a(a25, j13, j14);
                                    }
                                }
                            }
                            d();
                            return true;
                        case 9:
                            try {
                                if (this.f8475P.a((com.anythink.basead.exoplayer.h.r) message.obj)) {
                                    q b12 = this.f8475P.b();
                                    float f6 = this.f8471L.e().f8916b;
                                    b12.f8850f = true;
                                    b12.f8853j = b12.f8845a.b();
                                    b12.a(f6);
                                    long b13 = b12.b(b12.f8852h.f8860b);
                                    long j19 = b12.f8849e;
                                    r rVar2 = b12.f8852h;
                                    b12.f8849e = (rVar2.f8860b - b13) + j19;
                                    b12.f8852h = new r(rVar2.f8859a, b13, rVar2.f8861c, rVar2.f8862d, rVar2.f8863e, rVar2.f8864f, rVar2.f8865g);
                                    a(b12.f8854k);
                                    if (!this.f8475P.f()) {
                                        a(this.f8475P.h().f8852h.f8860b);
                                        a((q) null);
                                    }
                                    r();
                                }
                                d();
                                return true;
                            } catch (g e9) {
                                e = e9;
                                i10 = 2;
                                z9 = false;
                                Log.e(f8441d, "Playback error.", e);
                                a(z9, z9);
                                this.f8466F.obtainMessage(i10, e).sendToTarget();
                                d();
                                return true;
                            } catch (IOException e10) {
                                e = e10;
                                i10 = 2;
                                z8 = false;
                                Log.e(f8441d, "Source error.", e);
                                a(z8, z8);
                                this.f8466F.obtainMessage(i10, g.a(e)).sendToTarget();
                                d();
                                return true;
                            } catch (RuntimeException e11) {
                                e = e11;
                                Log.e(f8441d, "Internal runtime error.", e);
                                a(false, false);
                                this.f8466F.obtainMessage(2, g.a(e)).sendToTarget();
                                d();
                                return true;
                            }
                        case 10:
                            if (this.f8475P.a((com.anythink.basead.exoplayer.h.r) message.obj)) {
                                this.f8475P.a(this.ab);
                                r();
                            }
                            d();
                            return true;
                        case 11:
                            if (this.f8475P.f()) {
                                float f9 = this.f8471L.e().f8916b;
                                q c11 = this.f8475P.c();
                                q d3 = this.f8475P.d();
                                boolean z21 = true;
                                while (true) {
                                    if (c11 != null && c11.f8850f) {
                                        if (c11.a(f9)) {
                                            if (z21) {
                                                q c12 = this.f8475P.c();
                                                boolean a26 = this.f8475P.a(c12);
                                                boolean[] zArr = new boolean[this.f8485y.length];
                                                long a27 = c12.a(this.f8477R.f8913j, a26, zArr);
                                                a(c12.f8854k);
                                                u uVar5 = this.f8477R;
                                                if (uVar5.f8910f != 4 && a27 != uVar5.f8913j) {
                                                    u uVar6 = this.f8477R;
                                                    this.f8477R = uVar6.a(uVar6.f8907c, a27, uVar6.f8909e);
                                                    this.f8472M.b(4);
                                                    a(a27);
                                                }
                                                boolean[] zArr2 = new boolean[this.f8485y.length];
                                                int i19 = 0;
                                                int i20 = 0;
                                                while (true) {
                                                    y[] yVarArr4 = this.f8485y;
                                                    if (i19 < yVarArr4.length) {
                                                        y yVar8 = yVarArr4[i19];
                                                        boolean z22 = yVar8.a_() != 0;
                                                        zArr2[i19] = z22;
                                                        com.anythink.basead.exoplayer.h.y yVar9 = c12.f8847c[i19];
                                                        if (yVar9 != null) {
                                                            i20++;
                                                        }
                                                        if (z22) {
                                                            if (yVar9 != yVar8.f()) {
                                                                b(yVar8);
                                                            } else if (zArr[i19]) {
                                                                yVar8.a(this.ab);
                                                            }
                                                        }
                                                        i19++;
                                                    } else {
                                                        this.f8477R = this.f8477R.a(c12.f8853j, c12.f8854k);
                                                        a(zArr2, i20);
                                                    }
                                                }
                                            } else {
                                                this.f8475P.a(c11);
                                                if (c11.f8850f) {
                                                    c11.b(Math.max(c11.f8852h.f8860b, this.ab - c11.f8849e));
                                                    a(c11.f8854k);
                                                }
                                            }
                                            if (this.f8477R.f8910f != 4) {
                                                r();
                                                g();
                                                this.f8464D.b(2);
                                            }
                                        } else {
                                            if (c11 == d3) {
                                                z21 = false;
                                            }
                                            c11 = c11.i;
                                        }
                                    }
                                }
                            }
                            d();
                            return true;
                        case 12:
                            int i21 = message.arg1;
                            this.f8483X = i21;
                            if (!this.f8475P.a(i21)) {
                                g(true);
                            }
                            d();
                            return true;
                        case 13:
                            boolean z23 = message.arg1 != 0;
                            this.Y = z23;
                            if (!this.f8475P.a(z23)) {
                                g(true);
                            }
                            d();
                            return true;
                        case 14:
                            x xVar = (x) message.obj;
                            if (xVar.f() == com.anythink.basead.exoplayer.b.f6539b) {
                                d(xVar);
                            } else {
                                if (this.f8478S != null && this.f8484Z <= 0) {
                                    b bVar = new b(xVar);
                                    if (a(bVar)) {
                                        this.f8473N.add(bVar);
                                        Collections.sort(this.f8473N);
                                    } else {
                                        xVar.a(false);
                                    }
                                }
                                this.f8473N.add(new b(xVar));
                            }
                            d();
                            return true;
                        case 15:
                            x xVar2 = (x) message.obj;
                            xVar2.e().post(new AnonymousClass1(xVar2));
                            d();
                            return true;
                        default:
                            return false;
                    }
                } catch (g e12) {
                    e = e12;
                } catch (IOException e13) {
                    e = e13;
                }
            } catch (RuntimeException e14) {
                e = e14;
            }
        } catch (g e15) {
            e = e15;
            z9 = false;
        } catch (IOException e16) {
            e = e16;
            z8 = false;
        }
    }

    public final void b(boolean z8) {
        this.f8464D.a(13, z8 ? 1 : 0).sendToTarget();
    }

    @Override // com.anythink.basead.exoplayer.i.h.a
    public final void c() {
        this.f8464D.b(11);
    }

    public static final class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        public final x f8516a;

        /* renamed from: b, reason: collision with root package name */
        public int f8517b;

        /* renamed from: c, reason: collision with root package name */
        public long f8518c;

        /* renamed from: d, reason: collision with root package name */
        public Object f8519d;

        public b(x xVar) {
            this.f8516a = xVar;
        }

        public final void a(int i, long j9, Object obj) {
            this.f8517b = i;
            this.f8518c = j9;
            this.f8519d = obj;
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(b bVar) {
            b bVar2 = bVar;
            Object obj = this.f8519d;
            if ((obj == null) != (bVar2.f8519d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.f8517b - bVar2.f8517b;
            return i != 0 ? i : com.anythink.basead.exoplayer.k.af.b(this.f8518c, bVar2.f8518c);
        }

        private int a(b bVar) {
            Object obj = this.f8519d;
            if ((obj == null) != (bVar.f8519d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.f8517b - bVar.f8517b;
            return i != 0 ? i : com.anythink.basead.exoplayer.k.af.b(this.f8518c, bVar.f8518c);
        }
    }

    private void c(int i4) {
        this.f8483X = i4;
        if (this.f8475P.a(i4)) {
            return;
        }
        g(true);
    }

    private void d() {
        if (this.f8472M.a(this.f8477R)) {
            this.f8466F.obtainMessage(0, this.f8472M.f8524b, this.f8472M.f8525c ? this.f8472M.f8526d : -1, this.f8477R).sendToTarget();
            this.f8472M.b(this.f8477R);
        }
    }

    public final void a(com.anythink.basead.exoplayer.h.s sVar, boolean z8, boolean z9) {
        this.f8464D.a(z8 ? 1 : 0, z9 ? 1 : 0, sVar).sendToTarget();
    }

    public final void b(v vVar) {
        this.f8464D.a(4, vVar).sendToTarget();
    }

    private void f() {
        this.f8471L.b();
        for (y yVar : this.f8479T) {
            a(yVar);
        }
    }

    public final Looper b() {
        return this.f8465E.getLooper();
    }

    private void b(com.anythink.basead.exoplayer.h.r rVar) {
        this.f8464D.a(10, rVar).sendToTarget();
    }

    private void b(int i4) {
        u uVar = this.f8477R;
        if (uVar.f8910f != i4) {
            this.f8477R = uVar.b(i4);
        }
    }

    private void c(v vVar) {
        this.f8471L.a(vVar);
    }

    public final void a(boolean z8) {
        this.f8464D.a(1, z8 ? 1 : 0).sendToTarget();
    }

    private void c(x xVar) {
        if (xVar.f() == com.anythink.basead.exoplayer.b.f6539b) {
            d(xVar);
            return;
        }
        if (this.f8478S != null && this.f8484Z <= 0) {
            b bVar = new b(xVar);
            if (a(bVar)) {
                this.f8473N.add(bVar);
                Collections.sort(this.f8473N);
                return;
            } else {
                xVar.a(false);
                return;
            }
        }
        this.f8473N.add(new b(xVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(x xVar) {
        if (xVar.j()) {
            return;
        }
        try {
            xVar.b().a(xVar.c(), xVar.d());
        } finally {
            xVar.a(true);
        }
    }

    public final void a(int i4) {
        this.f8464D.a(12, i4).sendToTarget();
    }

    private void b(com.anythink.basead.exoplayer.h.s sVar, boolean z8, boolean z9) {
        this.f8484Z++;
        a(true, z8, z9);
        this.f8463C.a();
        this.f8478S = sVar;
        b(2);
        sVar.a(this.f8467G, true, this);
        this.f8464D.b(2);
    }

    private void g() {
        long a9;
        if (this.f8475P.f()) {
            q c4 = this.f8475P.c();
            long c9 = c4.f8845a.c();
            if (c9 != com.anythink.basead.exoplayer.b.f6539b) {
                a(c9);
                if (c9 != this.f8477R.f8913j) {
                    u uVar = this.f8477R;
                    this.f8477R = uVar.a(uVar.f8907c, c9, uVar.f8909e);
                    this.f8472M.b(4);
                }
            } else {
                long c10 = this.f8471L.c();
                this.ab = c10;
                long j9 = c10 - c4.f8849e;
                b(this.f8477R.f8913j, j9);
                this.f8477R.f8913j = j9;
            }
            u uVar2 = this.f8477R;
            if (this.f8479T.length == 0) {
                a9 = c4.f8852h.f8863e;
            } else {
                a9 = c4.a(true);
            }
            uVar2.f8914k = a9;
        }
    }

    public final void a(ae aeVar, int i4, long j9) {
        this.f8464D.a(3, new d(aeVar, i4, j9)).sendToTarget();
    }

    private void e() {
        this.f8482W = false;
        this.f8471L.a();
        for (y yVar : this.f8479T) {
            yVar.b_();
        }
    }

    public final void a(ac acVar) {
        this.f8464D.a(5, acVar).sendToTarget();
    }

    @Override // com.anythink.basead.exoplayer.x.a
    public final synchronized void a(x xVar) {
        if (this.f8480U) {
            Log.w(f8441d, "Ignoring messages sent after release.");
            xVar.a(false);
        } else {
            this.f8464D.a(14, xVar).sendToTarget();
        }
    }

    private void d(x xVar) {
        if (xVar.e().getLooper() == this.f8464D.a()) {
            f(xVar);
            int i4 = this.f8477R.f8910f;
            if (i4 == 3 || i4 == 2) {
                this.f8464D.b(2);
                return;
            }
            return;
        }
        this.f8464D.a(15, xVar).sendToTarget();
    }

    private void e(x xVar) {
        xVar.e().post(new AnonymousClass1(xVar));
    }

    private void b(ac acVar) {
        this.f8476Q = acVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x006b, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0034, code lost:
    
        r1 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b(long j9, long j10) {
        b bVar;
        b bVar2;
        if (this.f8473N.isEmpty() || this.f8477R.f8907c.a()) {
            return;
        }
        u uVar = this.f8477R;
        if (uVar.f8908d == j9) {
            j9--;
        }
        int i4 = uVar.f8907c.f7924a;
        int i9 = this.ac;
        if (i9 > 0) {
            bVar = this.f8473N.get(i9 - 1);
            while (bVar != null) {
                int i10 = bVar.f8517b;
                if (i10 <= i4 && (i10 != i4 || bVar.f8518c <= j9)) {
                    break;
                }
                int i11 = this.ac;
                int i12 = i11 - 1;
                this.ac = i12;
                if (i12 > 0) {
                    bVar = this.f8473N.get(i11 - 2);
                }
            }
            if (this.ac < this.f8473N.size()) {
                bVar2 = this.f8473N.get(this.ac);
                while (bVar2 != null && bVar2.f8519d != null) {
                    int i13 = bVar2.f8517b;
                    if (i13 >= i4 && (i13 != i4 || bVar2.f8518c > j9)) {
                        break;
                    }
                    int i14 = this.ac + 1;
                    this.ac = i14;
                    if (i14 < this.f8473N.size()) {
                        bVar2 = this.f8473N.get(this.ac);
                    }
                }
                while (bVar2 != null && bVar2.f8519d != null && bVar2.f8517b == i4) {
                    long j11 = bVar2.f8518c;
                    if (j11 <= j9 || j11 > j10) {
                        return;
                    }
                    d(bVar2.f8516a);
                    if (!bVar2.f8516a.h() && !bVar2.f8516a.j()) {
                        this.ac++;
                    } else {
                        this.f8473N.remove(this.ac);
                    }
                    bVar2 = this.ac < this.f8473N.size() ? this.f8473N.get(this.ac) : null;
                }
                return;
            }
            bVar2 = null;
        }
        bVar = null;
    }

    private void c(com.anythink.basead.exoplayer.h.r rVar) {
        if (this.f8475P.a(rVar)) {
            q b9 = this.f8475P.b();
            float f6 = this.f8471L.e().f8916b;
            b9.f8850f = true;
            b9.f8853j = b9.f8845a.b();
            b9.a(f6);
            long b10 = b9.b(b9.f8852h.f8860b);
            long j9 = b9.f8849e;
            r rVar2 = b9.f8852h;
            b9.f8849e = (rVar2.f8860b - b10) + j9;
            b9.f8852h = new r(rVar2.f8859a, b10, rVar2.f8861c, rVar2.f8862d, rVar2.f8863e, rVar2.f8864f, rVar2.f8865g);
            a(b9.f8854k);
            if (!this.f8475P.f()) {
                a(this.f8475P.h().f8852h.f8860b);
                a((q) null);
            }
            r();
        }
    }

    private void d(com.anythink.basead.exoplayer.h.r rVar) {
        if (this.f8475P.a(rVar)) {
            this.f8475P.a(this.ab);
            r();
        }
    }

    public final synchronized void a() {
        if (!this.f8480U && this.f8465E.isAlive()) {
            this.f8464D.b(7);
            long j9 = 500;
            long a9 = this.f8474O.a() + 500;
            boolean z8 = false;
            while (!this.f8480U && j9 > 0) {
                try {
                    wait(j9);
                } catch (InterruptedException unused) {
                    z8 = true;
                }
                j9 = a9 - this.f8474O.a();
            }
            if (z8) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.h.s.b
    public final void a(com.anythink.basead.exoplayer.h.s sVar, ae aeVar, Object obj) {
        this.f8464D.a(8, new a(sVar, aeVar, obj)).sendToTarget();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.anythink.basead.exoplayer.h.r.a
    public final void a(com.anythink.basead.exoplayer.h.r rVar) {
        this.f8464D.a(9, rVar).sendToTarget();
    }

    @Override // com.anythink.basead.exoplayer.e.a
    public final void a(v vVar) {
        this.f8466F.obtainMessage(1, vVar).sendToTarget();
        float f6 = vVar.f8916b;
        for (q e6 = this.f8475P.e(); e6 != null; e6 = e6.i) {
            com.anythink.basead.exoplayer.i.i iVar = e6.f8854k;
            if (iVar != null) {
                for (com.anythink.basead.exoplayer.i.f fVar : iVar.f8140c.a()) {
                    if (fVar != null) {
                        fVar.a(f6);
                    }
                }
            }
        }
    }

    private boolean c(y yVar) {
        q qVar = this.f8475P.d().i;
        return qVar != null && qVar.f8850f && yVar.g();
    }

    private void b(y yVar) {
        this.f8471L.b(yVar);
        a(yVar);
        yVar.l();
    }

    private void a(long j9, long j10) {
        this.f8464D.b();
        this.f8464D.a(j9 + j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(d dVar) {
        long longValue;
        boolean z8;
        s.a aVar;
        long j9;
        long j10;
        long j11;
        boolean z9 = true;
        this.f8472M.a(1);
        Pair<Integer, Long> a9 = a(dVar, true);
        if (a9 == null) {
            aVar = new s.a(j());
            z8 = true;
            longValue = -9223372036854775807L;
            j9 = -9223372036854775807L;
        } else {
            int intValue = ((Integer) a9.first).intValue();
            long longValue2 = ((Long) a9.second).longValue();
            s.a a10 = this.f8475P.a(intValue, longValue2);
            if (a10.a()) {
                z8 = true;
                longValue = 0;
            } else {
                longValue = ((Long) a9.second).longValue();
                z8 = dVar.f8538c == com.anythink.basead.exoplayer.b.f6539b;
            }
            aVar = a10;
            j9 = longValue2;
        }
        try {
            if (this.f8478S != null && this.f8484Z <= 0) {
                if (longValue == com.anythink.basead.exoplayer.b.f6539b) {
                    b(4);
                    a(false, true, false);
                    j10 = longValue;
                    this.f8477R = this.f8477R.a(aVar, j10, j9);
                    if (!z8) {
                        return;
                    }
                    this.f8472M.b(2);
                }
                if (aVar.equals(this.f8477R.f8907c)) {
                    q c4 = this.f8475P.c();
                    j11 = (c4 == null || longValue == 0) ? longValue : c4.f8845a.a(longValue, this.f8476Q);
                    if (com.anythink.basead.exoplayer.b.a(j11) == com.anythink.basead.exoplayer.b.a(this.f8477R.f8913j)) {
                        this.f8477R = this.f8477R.a(aVar, this.f8477R.f8913j, j9);
                        if (!z8) {
                            return;
                        }
                        this.f8472M.b(2);
                    }
                } else {
                    j11 = longValue;
                }
                long a11 = a(aVar, j11);
                if (longValue == a11) {
                    z9 = false;
                }
                z8 |= z9;
                j10 = a11;
                this.f8477R = this.f8477R.a(aVar, j10, j9);
                if (!z8) {
                }
                this.f8472M.b(2);
            }
            this.aa = dVar;
            j10 = longValue;
            this.f8477R = this.f8477R.a(aVar, j10, j9);
            if (!z8) {
            }
            this.f8472M.b(2);
        } catch (Throwable th) {
            this.f8477R = this.f8477R.a(aVar, longValue, j9);
            if (z8) {
                this.f8472M.b(2);
            }
            throw th;
        }
    }

    private long a(s.a aVar, long j9) {
        return a(aVar, j9, this.f8475P.c() != this.f8475P.d());
    }

    private long a(s.a aVar, long j9, boolean z8) {
        f();
        this.f8482W = false;
        b(2);
        q c4 = this.f8475P.c();
        q qVar = c4;
        while (true) {
            if (qVar == null) {
                break;
            }
            if (a(aVar, j9, qVar)) {
                this.f8475P.a(qVar);
                break;
            }
            qVar = this.f8475P.h();
        }
        if (c4 != qVar || z8) {
            for (y yVar : this.f8479T) {
                b(yVar);
            }
            this.f8479T = new y[0];
            c4 = null;
        }
        if (qVar != null) {
            a(c4);
            if (qVar.f8851g) {
                j9 = qVar.f8845a.b(j9);
                qVar.f8845a.a(j9 - this.J, this.f8470K);
            }
            a(j9);
            r();
        } else {
            this.f8475P.b(true);
            a(j9);
        }
        this.f8464D.b(2);
        return j9;
    }

    private boolean a(s.a aVar, long j9, q qVar) {
        if (aVar.equals(qVar.f8852h.f8859a) && qVar.f8850f) {
            this.f8477R.f8905a.a(qVar.f8852h.f8859a.f7924a, this.f8469I, false);
            int b9 = this.f8469I.b(j9);
            if (b9 == -1 || this.f8469I.a(b9) == qVar.f8852h.f8861c) {
                return true;
            }
        }
        return false;
    }

    private void a(long j9) {
        if (this.f8475P.f()) {
            j9 += this.f8475P.c().f8849e;
        }
        this.ab = j9;
        this.f8471L.a(j9);
        for (y yVar : this.f8479T) {
            yVar.a(this.ab);
        }
    }

    private void a(boolean z8, boolean z9) {
        a(true, z8, z8);
        this.f8472M.a(this.f8484Z + (z9 ? 1 : 0));
        this.f8484Z = 0;
        this.f8463C.b();
        b(1);
    }

    private void a(boolean z8, boolean z9, boolean z10) {
        com.anythink.basead.exoplayer.h.s sVar;
        this.f8464D.b();
        this.f8482W = false;
        this.f8471L.b();
        this.ab = 0L;
        for (y yVar : this.f8479T) {
            try {
                b(yVar);
            } catch (g | RuntimeException e6) {
                Log.e(f8441d, "Stop failed.", e6);
            }
        }
        this.f8479T = new y[0];
        this.f8475P.b(!z9);
        d(false);
        if (z9) {
            this.aa = null;
        }
        if (z10) {
            this.f8475P.a(ae.f6498a);
            Iterator<b> it = this.f8473N.iterator();
            while (it.hasNext()) {
                it.next().f8516a.a(false);
            }
            this.f8473N.clear();
            this.ac = 0;
        }
        ae aeVar = z10 ? ae.f6498a : this.f8477R.f8905a;
        Object obj = z10 ? null : this.f8477R.f8906b;
        s.a aVar = z9 ? new s.a(j()) : this.f8477R.f8907c;
        long j9 = com.anythink.basead.exoplayer.b.f6539b;
        long j10 = z9 ? -9223372036854775807L : this.f8477R.f8913j;
        if (!z9) {
            j9 = this.f8477R.f8909e;
        }
        long j11 = j9;
        u uVar = this.f8477R;
        this.f8477R = new u(aeVar, obj, aVar, j10, j11, uVar.f8910f, false, z10 ? af.f7672a : uVar.f8912h, z10 ? this.f8462B : uVar.i);
        if (!z8 || (sVar = this.f8478S) == null) {
            return;
        }
        sVar.a(this);
        this.f8478S = null;
    }

    private boolean h(boolean z8) {
        if (this.f8479T.length == 0) {
            return m();
        }
        if (!z8) {
            return false;
        }
        if (!this.f8477R.f8911g) {
            return true;
        }
        q b9 = this.f8475P.b();
        long a9 = b9.a(!b9.f8852h.f8865g);
        return a9 == Long.MIN_VALUE || this.f8463C.a(a9 - (this.ab - b9.f8849e), this.f8471L.e().f8916b, this.f8482W);
    }

    private boolean a(b bVar) {
        Object obj = bVar.f8519d;
        if (obj == null) {
            Pair<Integer, Long> a9 = a(new d(bVar.f8516a.a(), bVar.f8516a.g(), com.anythink.basead.exoplayer.b.b(bVar.f8516a.f())), false);
            if (a9 == null) {
                return false;
            }
            bVar.a(((Integer) a9.first).intValue(), ((Long) a9.second).longValue(), this.f8477R.f8905a.a(((Integer) a9.first).intValue(), this.f8469I, true).f6500b);
        } else {
            int a10 = this.f8477R.f8905a.a(obj);
            if (a10 == -1) {
                return false;
            }
            bVar.f8517b = a10;
        }
        return true;
    }

    private static void a(y yVar) {
        if (yVar.a_() == 2) {
            yVar.k();
        }
    }

    private void a(com.anythink.basead.exoplayer.i.i iVar) {
        this.f8463C.a(this.f8485y, iVar.f8140c);
    }

    private void a(float f6) {
        for (q e6 = this.f8475P.e(); e6 != null; e6 = e6.i) {
            com.anythink.basead.exoplayer.i.i iVar = e6.f8854k;
            if (iVar != null) {
                for (com.anythink.basead.exoplayer.i.f fVar : iVar.f8140c.a()) {
                    if (fVar != null) {
                        fVar.a(f6);
                    }
                }
            }
        }
    }

    private void a(a aVar) {
        if (aVar.f8489a != this.f8478S) {
            return;
        }
        ae aeVar = this.f8477R.f8905a;
        ae aeVar2 = aVar.f8490b;
        Object obj = aVar.f8491c;
        this.f8475P.a(aeVar2);
        this.f8477R = this.f8477R.a(aeVar2, obj);
        for (int size = this.f8473N.size() - 1; size >= 0; size--) {
            if (!a(this.f8473N.get(size))) {
                this.f8473N.get(size).f8516a.a(false);
                this.f8473N.remove(size);
            }
        }
        Collections.sort(this.f8473N);
        int i4 = this.f8484Z;
        if (i4 > 0) {
            this.f8472M.a(i4);
            this.f8484Z = 0;
            d dVar = this.aa;
            if (dVar != null) {
                Pair<Integer, Long> a9 = a(dVar, true);
                this.aa = null;
                if (a9 == null) {
                    o();
                    return;
                }
                int intValue = ((Integer) a9.first).intValue();
                long longValue = ((Long) a9.second).longValue();
                s.a a10 = this.f8475P.a(intValue, longValue);
                this.f8477R = this.f8477R.a(a10, a10.a() ? 0L : longValue, longValue);
                return;
            }
            if (this.f8477R.f8908d == com.anythink.basead.exoplayer.b.f6539b) {
                if (aeVar2.a()) {
                    o();
                    return;
                }
                Pair<Integer, Long> a11 = a(aeVar2, aeVar2.b(this.Y));
                int intValue2 = ((Integer) a11.first).intValue();
                long longValue2 = ((Long) a11.second).longValue();
                s.a a12 = this.f8475P.a(intValue2, longValue2);
                this.f8477R = this.f8477R.a(a12, a12.a() ? 0L : longValue2, longValue2);
                return;
            }
            return;
        }
        u uVar = this.f8477R;
        int i9 = uVar.f8907c.f7924a;
        long j9 = uVar.f8909e;
        if (aeVar.a()) {
            if (aeVar2.a()) {
                return;
            }
            s.a a13 = this.f8475P.a(i9, j9);
            this.f8477R = this.f8477R.a(a13, a13.a() ? 0L : j9, j9);
            return;
        }
        q e6 = this.f8475P.e();
        int a14 = aeVar2.a(e6 == null ? aeVar.a(i9, this.f8469I, true).f6500b : e6.f8846b);
        if (a14 == -1) {
            int a15 = a(i9, aeVar, aeVar2);
            if (a15 == -1) {
                o();
                return;
            }
            Pair<Integer, Long> a16 = a(aeVar2, aeVar2.a(a15, this.f8469I, false).f6501c);
            int intValue3 = ((Integer) a16.first).intValue();
            long longValue3 = ((Long) a16.second).longValue();
            s.a a17 = this.f8475P.a(intValue3, longValue3);
            aeVar2.a(intValue3, this.f8469I, true);
            if (e6 != null) {
                Object obj2 = this.f8469I.f6500b;
                e6.f8852h = e6.f8852h.a();
                while (true) {
                    e6 = e6.i;
                    if (e6 == null) {
                        break;
                    } else if (e6.f8846b.equals(obj2)) {
                        e6.f8852h = this.f8475P.a(e6.f8852h, intValue3);
                    } else {
                        e6.f8852h = e6.f8852h.a();
                    }
                }
            }
            this.f8477R = this.f8477R.a(a17, a(a17, a17.a() ? 0L : longValue3), longValue3);
            return;
        }
        if (a14 != i9) {
            this.f8477R = this.f8477R.a(a14);
        }
        s.a aVar2 = this.f8477R.f8907c;
        if (aVar2.a()) {
            s.a a18 = this.f8475P.a(a14, j9);
            if (!a18.equals(aVar2)) {
                this.f8477R = this.f8477R.a(a18, a(a18, a18.a() ? 0L : j9), j9);
                return;
            }
        }
        if (this.f8475P.a(aVar2, this.ab)) {
            return;
        }
        g(false);
    }

    private int a(int i4, ae aeVar, ae aeVar2) {
        int c4 = aeVar.c();
        int i9 = 0;
        int i10 = i4;
        int i11 = -1;
        while (i9 < c4 && i11 == -1) {
            ae aeVar3 = aeVar;
            i10 = aeVar3.a(i10, this.f8469I, this.f8468H, this.f8483X, this.Y);
            if (i10 == -1) {
                break;
            }
            i11 = aeVar2.a(aeVar3.a(i10, this.f8469I, true).f6500b);
            i9++;
            aeVar = aeVar3;
        }
        return i11;
    }

    private Pair<Integer, Long> a(d dVar, boolean z8) {
        int a9;
        ae aeVar = this.f8477R.f8905a;
        ae aeVar2 = dVar.f8536a;
        if (aeVar.a()) {
            return null;
        }
        ae aeVar3 = aeVar2.a() ? aeVar : aeVar2;
        try {
            Pair<Integer, Long> a10 = aeVar3.a(this.f8468H, this.f8469I, dVar.f8537b, dVar.f8538c);
            if (aeVar == aeVar3) {
                return a10;
            }
            int a11 = aeVar.a(aeVar3.a(((Integer) a10.first).intValue(), this.f8469I, true).f6500b);
            if (a11 != -1) {
                return Pair.create(Integer.valueOf(a11), (Long) a10.second);
            }
            if (!z8 || (a9 = a(((Integer) a10.first).intValue(), aeVar3, aeVar)) == -1) {
                return null;
            }
            return a(aeVar, aeVar.a(a9, this.f8469I, false).f6501c);
        } catch (IndexOutOfBoundsException unused) {
            throw new o(aeVar, dVar.f8537b, dVar.f8538c);
        }
    }

    private Pair<Integer, Long> a(ae aeVar, int i4) {
        return aeVar.a(this.f8468H, this.f8469I, i4, com.anythink.basead.exoplayer.b.f6539b);
    }

    private void a(q qVar) {
        q c4 = this.f8475P.c();
        if (c4 == null || qVar == c4) {
            return;
        }
        boolean[] zArr = new boolean[this.f8485y.length];
        int i4 = 0;
        int i9 = 0;
        while (true) {
            y[] yVarArr = this.f8485y;
            if (i4 < yVarArr.length) {
                y yVar = yVarArr[i4];
                zArr[i4] = yVar.a_() != 0;
                if (c4.f8854k.a(i4)) {
                    i9++;
                }
                if (zArr[i4] && (!c4.f8854k.a(i4) || (yVar.i() && yVar.f() == qVar.f8847c[i4]))) {
                    b(yVar);
                }
                i4++;
            } else {
                this.f8477R = this.f8477R.a(c4.f8853j, c4.f8854k);
                a(zArr, i9);
                return;
            }
        }
    }

    private void a(boolean[] zArr, int i4) {
        this.f8479T = new y[i4];
        q c4 = this.f8475P.c();
        int i9 = 0;
        for (int i10 = 0; i10 < this.f8485y.length; i10++) {
            if (c4.f8854k.a(i10)) {
                a(i10, zArr[i10], i9);
                i9++;
            }
        }
    }

    private void a(int i4, boolean z8, int i9) {
        q c4 = this.f8475P.c();
        y yVar = this.f8485y[i4];
        this.f8479T[i9] = yVar;
        if (yVar.a_() == 0) {
            com.anythink.basead.exoplayer.i.i iVar = c4.f8854k;
            aa aaVar = iVar.f8139b[i4];
            m[] a9 = a(iVar.f8140c.a(i4));
            boolean z9 = this.f8481V && this.f8477R.f8910f == 3;
            yVar.a(aaVar, a9, c4.f8847c[i4], this.ab, !z8 && z9, c4.f8849e);
            this.f8471L.a(yVar);
            if (z9) {
                yVar.b_();
            }
        }
    }

    private static m[] a(com.anythink.basead.exoplayer.i.f fVar) {
        int g9 = fVar != null ? fVar.g() : 0;
        m[] mVarArr = new m[g9];
        for (int i4 = 0; i4 < g9; i4++) {
            mVarArr[i4] = fVar.a(i4);
        }
        return mVarArr;
    }
}
