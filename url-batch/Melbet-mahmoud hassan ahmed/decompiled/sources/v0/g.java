package v0;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import n2.g0;
import s0.u1;
import v0.g0;
import v0.m;
import v0.o;
import v0.w;

/* loaded from: classes.dex */
class g implements o {

    /* renamed from: a, reason: collision with root package name */
    public final List<m.b> f22579a;

    /* renamed from: b, reason: collision with root package name */
    private final g0 f22580b;

    /* renamed from: c, reason: collision with root package name */
    private final a f22581c;

    /* renamed from: d, reason: collision with root package name */
    private final b f22582d;

    /* renamed from: e, reason: collision with root package name */
    private final int f22583e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f22584f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f22585g;

    /* renamed from: h, reason: collision with root package name */
    private final HashMap<String, String> f22586h;

    /* renamed from: i, reason: collision with root package name */
    private final o2.i<w.a> f22587i;

    /* renamed from: j, reason: collision with root package name */
    private final n2.g0 f22588j;

    /* renamed from: k, reason: collision with root package name */
    private final u1 f22589k;

    /* renamed from: l, reason: collision with root package name */
    final n0 f22590l;

    /* renamed from: m, reason: collision with root package name */
    final UUID f22591m;

    /* renamed from: n, reason: collision with root package name */
    final e f22592n;

    /* renamed from: o, reason: collision with root package name */
    private int f22593o;

    /* renamed from: p, reason: collision with root package name */
    private int f22594p;

    /* renamed from: q, reason: collision with root package name */
    private HandlerThread f22595q;

    /* renamed from: r, reason: collision with root package name */
    private c f22596r;

    /* renamed from: s, reason: collision with root package name */
    private u0.b f22597s;

    /* renamed from: t, reason: collision with root package name */
    private o.a f22598t;

    /* renamed from: u, reason: collision with root package name */
    private byte[] f22599u;

    /* renamed from: v, reason: collision with root package name */
    private byte[] f22600v;

    /* renamed from: w, reason: collision with root package name */
    private g0.a f22601w;

    /* renamed from: x, reason: collision with root package name */
    private g0.d f22602x;

    public interface a {
        void a(g gVar);

        void b();

        void c(Exception exc, boolean z6);
    }

    public interface b {
        void a(g gVar, int i7);

        void b(g gVar, int i7);
    }

    @SuppressLint({"HandlerLeak"})
    private class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private boolean f22603a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, o0 o0Var) {
            d dVar = (d) message.obj;
            if (!dVar.f22606b) {
                return false;
            }
            int i7 = dVar.f22609e + 1;
            dVar.f22609e = i7;
            if (i7 > g.this.f22588j.d(3)) {
                return false;
            }
            long c7 = g.this.f22588j.c(new g0.c(new t1.q(dVar.f22605a, o0Var.f22691f, o0Var.f22692g, o0Var.f22693h, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f22607c, o0Var.f22694i), new t1.t(3), o0Var.getCause() instanceof IOException ? (IOException) o0Var.getCause() : new f(o0Var.getCause()), dVar.f22609e));
            if (c7 == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.f22603a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), c7);
                return true;
            }
        }

        void b(int i7, Object obj, boolean z6) {
            obtainMessage(i7, new d(t1.q.a(), z6, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f22603a = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Throwable th;
            d dVar = (d) message.obj;
            try {
                int i7 = message.what;
                if (i7 == 0) {
                    g gVar = g.this;
                    th = gVar.f22590l.a(gVar.f22591m, (g0.d) dVar.f22608d);
                } else {
                    if (i7 != 1) {
                        throw new RuntimeException();
                    }
                    g gVar2 = g.this;
                    th = gVar2.f22590l.b(gVar2.f22591m, (g0.a) dVar.f22608d);
                }
            } catch (o0 e7) {
                boolean a7 = a(message, e7);
                th = e7;
                if (a7) {
                    return;
                }
            } catch (Exception e8) {
                o2.r.j("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e8);
                th = e8;
            }
            g.this.f22588j.a(dVar.f22605a);
            synchronized (this) {
                if (!this.f22603a) {
                    g.this.f22592n.obtainMessage(message.what, Pair.create(dVar.f22608d, th)).sendToTarget();
                }
            }
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final long f22605a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f22606b;

        /* renamed from: c, reason: collision with root package name */
        public final long f22607c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f22608d;

        /* renamed from: e, reason: collision with root package name */
        public int f22609e;

        public d(long j7, boolean z6, long j8, Object obj) {
            this.f22605a = j7;
            this.f22606b = z6;
            this.f22607c = j8;
            this.f22608d = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i7 = message.what;
            if (i7 == 0) {
                g.this.B(obj, obj2);
            } else {
                if (i7 != 1) {
                    return;
                }
                g.this.v(obj, obj2);
            }
        }
    }

    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public g(UUID uuid, g0 g0Var, a aVar, b bVar, List<m.b> list, int i7, boolean z6, boolean z7, byte[] bArr, HashMap<String, String> hashMap, n0 n0Var, Looper looper, n2.g0 g0Var2, u1 u1Var) {
        List<m.b> unmodifiableList;
        if (i7 == 1 || i7 == 3) {
            o2.a.e(bArr);
        }
        this.f22591m = uuid;
        this.f22581c = aVar;
        this.f22582d = bVar;
        this.f22580b = g0Var;
        this.f22583e = i7;
        this.f22584f = z6;
        this.f22585g = z7;
        if (bArr != null) {
            this.f22600v = bArr;
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList((List) o2.a.e(list));
        }
        this.f22579a = unmodifiableList;
        this.f22586h = hashMap;
        this.f22590l = n0Var;
        this.f22587i = new o2.i<>();
        this.f22588j = g0Var2;
        this.f22589k = u1Var;
        this.f22593o = 2;
        this.f22592n = new e(looper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(Object obj, Object obj2) {
        if (obj == this.f22602x) {
            if (this.f22593o == 2 || r()) {
                this.f22602x = null;
                if (obj2 instanceof Exception) {
                    this.f22581c.c((Exception) obj2, false);
                    return;
                }
                try {
                    this.f22580b.j((byte[]) obj2);
                    this.f22581c.b();
                } catch (Exception e7) {
                    this.f22581c.c(e7, true);
                }
            }
        }
    }

    private boolean C() {
        if (r()) {
            return true;
        }
        try {
            byte[] n7 = this.f22580b.n();
            this.f22599u = n7;
            this.f22580b.b(n7, this.f22589k);
            this.f22597s = this.f22580b.m(this.f22599u);
            final int i7 = 3;
            this.f22593o = 3;
            n(new o2.h() { // from class: v0.b
                @Override // o2.h
                public final void accept(Object obj) {
                    ((w.a) obj).k(i7);
                }
            });
            o2.a.e(this.f22599u);
            return true;
        } catch (NotProvisionedException unused) {
            this.f22581c.a(this);
            return false;
        } catch (Exception e7) {
            u(e7, 1);
            return false;
        }
    }

    private void D(byte[] bArr, int i7, boolean z6) {
        try {
            this.f22601w = this.f22580b.k(bArr, this.f22579a, i7, this.f22586h);
            ((c) o2.m0.j(this.f22596r)).b(1, o2.a.e(this.f22601w), z6);
        } catch (Exception e7) {
            w(e7, true);
        }
    }

    private boolean F() {
        try {
            this.f22580b.e(this.f22599u, this.f22600v);
            return true;
        } catch (Exception e7) {
            u(e7, 1);
            return false;
        }
    }

    private void n(o2.h<w.a> hVar) {
        Iterator<w.a> it = this.f22587i.g().iterator();
        while (it.hasNext()) {
            hVar.accept(it.next());
        }
    }

    private void o(boolean z6) {
        if (this.f22585g) {
            return;
        }
        byte[] bArr = (byte[]) o2.m0.j(this.f22599u);
        int i7 = this.f22583e;
        if (i7 == 0 || i7 == 1) {
            if (this.f22600v == null) {
                D(bArr, 1, z6);
                return;
            }
            if (this.f22593o != 4 && !F()) {
                return;
            }
            long p7 = p();
            if (this.f22583e != 0 || p7 > 60) {
                if (p7 <= 0) {
                    u(new m0(), 2);
                    return;
                } else {
                    this.f22593o = 4;
                    n(new o2.h() { // from class: v0.f
                        @Override // o2.h
                        public final void accept(Object obj) {
                            ((w.a) obj).j();
                        }
                    });
                    return;
                }
            }
            o2.r.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + p7);
        } else {
            if (i7 != 2) {
                if (i7 != 3) {
                    return;
                }
                o2.a.e(this.f22600v);
                o2.a.e(this.f22599u);
                D(this.f22600v, 3, z6);
                return;
            }
            if (this.f22600v != null && !F()) {
                return;
            }
        }
        D(bArr, 2, z6);
    }

    private long p() {
        if (!r0.j.f20686d.equals(this.f22591m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) o2.a.e(q0.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private boolean r() {
        int i7 = this.f22593o;
        return i7 == 3 || i7 == 4;
    }

    private void u(final Exception exc, int i7) {
        this.f22598t = new o.a(exc, c0.a(exc, i7));
        o2.r.d("DefaultDrmSession", "DRM session error", exc);
        n(new o2.h() { // from class: v0.c
            @Override // o2.h
            public final void accept(Object obj) {
                ((w.a) obj).l(exc);
            }
        });
        if (this.f22593o != 4) {
            this.f22593o = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(Object obj, Object obj2) {
        o2.h<w.a> hVar;
        if (obj == this.f22601w && r()) {
            this.f22601w = null;
            if (obj2 instanceof Exception) {
                w((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f22583e == 3) {
                    this.f22580b.h((byte[]) o2.m0.j(this.f22600v), bArr);
                    hVar = new o2.h() { // from class: v0.e
                        @Override // o2.h
                        public final void accept(Object obj3) {
                            ((w.a) obj3).i();
                        }
                    };
                } else {
                    byte[] h7 = this.f22580b.h(this.f22599u, bArr);
                    int i7 = this.f22583e;
                    if ((i7 == 2 || (i7 == 0 && this.f22600v != null)) && h7 != null && h7.length != 0) {
                        this.f22600v = h7;
                    }
                    this.f22593o = 4;
                    hVar = new o2.h() { // from class: v0.d
                        @Override // o2.h
                        public final void accept(Object obj3) {
                            ((w.a) obj3).h();
                        }
                    };
                }
                n(hVar);
            } catch (Exception e7) {
                w(e7, true);
            }
        }
    }

    private void w(Exception exc, boolean z6) {
        if (exc instanceof NotProvisionedException) {
            this.f22581c.a(this);
        } else {
            u(exc, z6 ? 1 : 2);
        }
    }

    private void x() {
        if (this.f22583e == 0 && this.f22593o == 4) {
            o2.m0.j(this.f22599u);
            o(false);
        }
    }

    public void A(Exception exc, boolean z6) {
        u(exc, z6 ? 1 : 3);
    }

    public void E() {
        this.f22602x = this.f22580b.i();
        ((c) o2.m0.j(this.f22596r)).b(0, o2.a.e(this.f22602x), true);
    }

    @Override // v0.o
    public boolean a() {
        return this.f22584f;
    }

    @Override // v0.o
    public Map<String, String> b() {
        byte[] bArr = this.f22599u;
        if (bArr == null) {
            return null;
        }
        return this.f22580b.f(bArr);
    }

    @Override // v0.o
    public void c(w.a aVar) {
        int i7 = this.f22594p;
        if (i7 <= 0) {
            o2.r.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i8 = i7 - 1;
        this.f22594p = i8;
        if (i8 == 0) {
            this.f22593o = 0;
            ((e) o2.m0.j(this.f22592n)).removeCallbacksAndMessages(null);
            ((c) o2.m0.j(this.f22596r)).c();
            this.f22596r = null;
            ((HandlerThread) o2.m0.j(this.f22595q)).quit();
            this.f22595q = null;
            this.f22597s = null;
            this.f22598t = null;
            this.f22601w = null;
            this.f22602x = null;
            byte[] bArr = this.f22599u;
            if (bArr != null) {
                this.f22580b.g(bArr);
                this.f22599u = null;
            }
        }
        if (aVar != null) {
            this.f22587i.k(aVar);
            if (this.f22587i.j(aVar) == 0) {
                aVar.m();
            }
        }
        this.f22582d.a(this, this.f22594p);
    }

    @Override // v0.o
    public final UUID d() {
        return this.f22591m;
    }

    @Override // v0.o
    public void e(w.a aVar) {
        if (this.f22594p < 0) {
            o2.r.c("DefaultDrmSession", "Session reference count less than zero: " + this.f22594p);
            this.f22594p = 0;
        }
        if (aVar != null) {
            this.f22587i.i(aVar);
        }
        int i7 = this.f22594p + 1;
        this.f22594p = i7;
        if (i7 == 1) {
            o2.a.f(this.f22593o == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f22595q = handlerThread;
            handlerThread.start();
            this.f22596r = new c(this.f22595q.getLooper());
            if (C()) {
                o(true);
            }
        } else if (aVar != null && r() && this.f22587i.j(aVar) == 1) {
            aVar.k(this.f22593o);
        }
        this.f22582d.b(this, this.f22594p);
    }

    @Override // v0.o
    public boolean f(String str) {
        return this.f22580b.d((byte[]) o2.a.h(this.f22599u), str);
    }

    @Override // v0.o
    public final o.a g() {
        if (this.f22593o == 1) {
            return this.f22598t;
        }
        return null;
    }

    @Override // v0.o
    public final int getState() {
        return this.f22593o;
    }

    @Override // v0.o
    public final u0.b h() {
        return this.f22597s;
    }

    public boolean q(byte[] bArr) {
        return Arrays.equals(this.f22599u, bArr);
    }

    public void y(int i7) {
        if (i7 != 2) {
            return;
        }
        x();
    }

    public void z() {
        if (C()) {
            o(true);
        }
    }
}
