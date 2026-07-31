package v0;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import m4.s0;
import r0.s1;
import s0.u1;
import v0.g;
import v0.g0;
import v0.h;
import v0.m;
import v0.o;
import v0.w;
import v0.y;

/* loaded from: classes.dex */
public class h implements y {

    /* renamed from: c, reason: collision with root package name */
    private final UUID f22616c;

    /* renamed from: d, reason: collision with root package name */
    private final g0.c f22617d;

    /* renamed from: e, reason: collision with root package name */
    private final n0 f22618e;

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<String, String> f22619f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f22620g;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f22621h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f22622i;

    /* renamed from: j, reason: collision with root package name */
    private final g f22623j;

    /* renamed from: k, reason: collision with root package name */
    private final n2.g0 f22624k;

    /* renamed from: l, reason: collision with root package name */
    private final C0144h f22625l;

    /* renamed from: m, reason: collision with root package name */
    private final long f22626m;

    /* renamed from: n, reason: collision with root package name */
    private final List<v0.g> f22627n;

    /* renamed from: o, reason: collision with root package name */
    private final Set<f> f22628o;

    /* renamed from: p, reason: collision with root package name */
    private final Set<v0.g> f22629p;

    /* renamed from: q, reason: collision with root package name */
    private int f22630q;

    /* renamed from: r, reason: collision with root package name */
    private g0 f22631r;

    /* renamed from: s, reason: collision with root package name */
    private v0.g f22632s;

    /* renamed from: t, reason: collision with root package name */
    private v0.g f22633t;

    /* renamed from: u, reason: collision with root package name */
    private Looper f22634u;

    /* renamed from: v, reason: collision with root package name */
    private Handler f22635v;

    /* renamed from: w, reason: collision with root package name */
    private int f22636w;

    /* renamed from: x, reason: collision with root package name */
    private byte[] f22637x;

    /* renamed from: y, reason: collision with root package name */
    private u1 f22638y;

    /* renamed from: z, reason: collision with root package name */
    volatile d f22639z;

    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        private boolean f22643d;

        /* renamed from: f, reason: collision with root package name */
        private boolean f22645f;

        /* renamed from: a, reason: collision with root package name */
        private final HashMap<String, String> f22640a = new HashMap<>();

        /* renamed from: b, reason: collision with root package name */
        private UUID f22641b = r0.j.f20686d;

        /* renamed from: c, reason: collision with root package name */
        private g0.c f22642c = k0.f22668d;

        /* renamed from: g, reason: collision with root package name */
        private n2.g0 f22646g = new n2.x();

        /* renamed from: e, reason: collision with root package name */
        private int[] f22644e = new int[0];

        /* renamed from: h, reason: collision with root package name */
        private long f22647h = 300000;

        public h a(n0 n0Var) {
            return new h(this.f22641b, this.f22642c, n0Var, this.f22640a, this.f22643d, this.f22644e, this.f22645f, this.f22646g, this.f22647h);
        }

        public b b(boolean z6) {
            this.f22643d = z6;
            return this;
        }

        public b c(boolean z6) {
            this.f22645f = z6;
            return this;
        }

        public b d(int... iArr) {
            for (int i7 : iArr) {
                boolean z6 = true;
                if (i7 != 2 && i7 != 1) {
                    z6 = false;
                }
                o2.a.a(z6);
            }
            this.f22644e = (int[]) iArr.clone();
            return this;
        }

        public b e(UUID uuid, g0.c cVar) {
            this.f22641b = (UUID) o2.a.e(uuid);
            this.f22642c = (g0.c) o2.a.e(cVar);
            return this;
        }
    }

    private class c implements g0.b {
        private c() {
        }

        @Override // v0.g0.b
        public void a(g0 g0Var, byte[] bArr, int i7, int i8, byte[] bArr2) {
            ((d) o2.a.e(h.this.f22639z)).obtainMessage(i7, bArr).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    private class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (v0.g gVar : h.this.f22627n) {
                if (gVar.q(bArr)) {
                    gVar.y(message.what);
                    return;
                }
            }
        }
    }

    public static final class e extends Exception {
        private e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class f implements y.b {

        /* renamed from: b, reason: collision with root package name */
        private final w.a f22650b;

        /* renamed from: c, reason: collision with root package name */
        private o f22651c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f22652d;

        public f(w.a aVar) {
            this.f22650b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(s1 s1Var) {
            if (h.this.f22630q == 0 || this.f22652d) {
                return;
            }
            h hVar = h.this;
            this.f22651c = hVar.t((Looper) o2.a.e(hVar.f22634u), this.f22650b, s1Var, false);
            h.this.f22628o.add(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            if (this.f22652d) {
                return;
            }
            o oVar = this.f22651c;
            if (oVar != null) {
                oVar.c(this.f22650b);
            }
            h.this.f22628o.remove(this);
            this.f22652d = true;
        }

        @Override // v0.y.b
        public void a() {
            o2.m0.K0((Handler) o2.a.e(h.this.f22635v), new Runnable() { // from class: v0.i
                @Override // java.lang.Runnable
                public final void run() {
                    h.f.this.f();
                }
            });
        }

        public void d(final s1 s1Var) {
            ((Handler) o2.a.e(h.this.f22635v)).post(new Runnable() { // from class: v0.j
                @Override // java.lang.Runnable
                public final void run() {
                    h.f.this.e(s1Var);
                }
            });
        }
    }

    private class g implements g.a {

        /* renamed from: a, reason: collision with root package name */
        private final Set<v0.g> f22654a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        private v0.g f22655b;

        public g(h hVar) {
        }

        @Override // v0.g.a
        public void a(v0.g gVar) {
            this.f22654a.add(gVar);
            if (this.f22655b != null) {
                return;
            }
            this.f22655b = gVar;
            gVar.E();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v0.g.a
        public void b() {
            this.f22655b = null;
            m4.q t6 = m4.q.t(this.f22654a);
            this.f22654a.clear();
            s0 it = t6.iterator();
            while (it.hasNext()) {
                ((v0.g) it.next()).z();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v0.g.a
        public void c(Exception exc, boolean z6) {
            this.f22655b = null;
            m4.q t6 = m4.q.t(this.f22654a);
            this.f22654a.clear();
            s0 it = t6.iterator();
            while (it.hasNext()) {
                ((v0.g) it.next()).A(exc, z6);
            }
        }

        public void d(v0.g gVar) {
            this.f22654a.remove(gVar);
            if (this.f22655b == gVar) {
                this.f22655b = null;
                if (this.f22654a.isEmpty()) {
                    return;
                }
                v0.g next = this.f22654a.iterator().next();
                this.f22655b = next;
                next.E();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0.h$h, reason: collision with other inner class name */
    class C0144h implements g.b {
        private C0144h() {
        }

        @Override // v0.g.b
        public void a(final v0.g gVar, int i7) {
            if (i7 == 1 && h.this.f22630q > 0 && h.this.f22626m != -9223372036854775807L) {
                h.this.f22629p.add(gVar);
                ((Handler) o2.a.e(h.this.f22635v)).postAtTime(new Runnable() { // from class: v0.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.this.c(null);
                    }
                }, gVar, SystemClock.uptimeMillis() + h.this.f22626m);
            } else if (i7 == 0) {
                h.this.f22627n.remove(gVar);
                if (h.this.f22632s == gVar) {
                    h.this.f22632s = null;
                }
                if (h.this.f22633t == gVar) {
                    h.this.f22633t = null;
                }
                h.this.f22623j.d(gVar);
                if (h.this.f22626m != -9223372036854775807L) {
                    ((Handler) o2.a.e(h.this.f22635v)).removeCallbacksAndMessages(gVar);
                    h.this.f22629p.remove(gVar);
                }
            }
            h.this.C();
        }

        @Override // v0.g.b
        public void b(v0.g gVar, int i7) {
            if (h.this.f22626m != -9223372036854775807L) {
                h.this.f22629p.remove(gVar);
                ((Handler) o2.a.e(h.this.f22635v)).removeCallbacksAndMessages(gVar);
            }
        }
    }

    private h(UUID uuid, g0.c cVar, n0 n0Var, HashMap<String, String> hashMap, boolean z6, int[] iArr, boolean z7, n2.g0 g0Var, long j7) {
        o2.a.e(uuid);
        o2.a.b(!r0.j.f20684b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f22616c = uuid;
        this.f22617d = cVar;
        this.f22618e = n0Var;
        this.f22619f = hashMap;
        this.f22620g = z6;
        this.f22621h = iArr;
        this.f22622i = z7;
        this.f22624k = g0Var;
        this.f22623j = new g(this);
        this.f22625l = new C0144h();
        this.f22636w = 0;
        this.f22627n = new ArrayList();
        this.f22628o = m4.p0.h();
        this.f22629p = m4.p0.h();
        this.f22626m = j7;
    }

    private o A(int i7, boolean z6) {
        g0 g0Var = (g0) o2.a.e(this.f22631r);
        if ((g0Var.l() == 2 && h0.f22657d) || o2.m0.y0(this.f22621h, i7) == -1 || g0Var.l() == 1) {
            return null;
        }
        v0.g gVar = this.f22632s;
        if (gVar == null) {
            v0.g x6 = x(m4.q.x(), true, null, z6);
            this.f22627n.add(x6);
            this.f22632s = x6;
        } else {
            gVar.e(null);
        }
        return this.f22632s;
    }

    private void B(Looper looper) {
        if (this.f22639z == null) {
            this.f22639z = new d(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        if (this.f22631r != null && this.f22630q == 0 && this.f22627n.isEmpty() && this.f22628o.isEmpty()) {
            ((g0) o2.a.e(this.f22631r)).a();
            this.f22631r = null;
        }
    }

    private void D() {
        s0 it = m4.s.r(this.f22629p).iterator();
        while (it.hasNext()) {
            ((o) it.next()).c(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void E() {
        s0 it = m4.s.r(this.f22628o).iterator();
        while (it.hasNext()) {
            ((f) it.next()).a();
        }
    }

    private void G(o oVar, w.a aVar) {
        oVar.c(aVar);
        if (this.f22626m != -9223372036854775807L) {
            oVar.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public o t(Looper looper, w.a aVar, s1 s1Var, boolean z6) {
        List<m.b> list;
        B(looper);
        m mVar = s1Var.f20959t;
        if (mVar == null) {
            return A(o2.v.k(s1Var.f20956q), z6);
        }
        v0.g gVar = null;
        Object[] objArr = 0;
        if (this.f22637x == null) {
            list = y((m) o2.a.e(mVar), this.f22616c, false);
            if (list.isEmpty()) {
                e eVar = new e(this.f22616c);
                o2.r.d("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.l(eVar);
                }
                return new e0(new o.a(eVar, 6003));
            }
        } else {
            list = null;
        }
        if (this.f22620g) {
            Iterator<v0.g> it = this.f22627n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                v0.g next = it.next();
                if (o2.m0.c(next.f22579a, list)) {
                    gVar = next;
                    break;
                }
            }
        } else {
            gVar = this.f22633t;
        }
        if (gVar == null) {
            gVar = x(list, false, aVar, z6);
            if (!this.f22620g) {
                this.f22633t = gVar;
            }
            this.f22627n.add(gVar);
        } else {
            gVar.e(aVar);
        }
        return gVar;
    }

    private static boolean u(o oVar) {
        return oVar.getState() == 1 && (o2.m0.f19752a < 19 || (((o.a) o2.a.e(oVar.g())).getCause() instanceof ResourceBusyException));
    }

    private boolean v(m mVar) {
        if (this.f22637x != null) {
            return true;
        }
        if (y(mVar, this.f22616c, true).isEmpty()) {
            if (mVar.f22684i != 1 || !mVar.i(0).h(r0.j.f20684b)) {
                return false;
            }
            o2.r.i("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f22616c);
        }
        String str = mVar.f22683h;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? o2.m0.f19752a >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    private v0.g w(List<m.b> list, boolean z6, w.a aVar) {
        o2.a.e(this.f22631r);
        v0.g gVar = new v0.g(this.f22616c, this.f22631r, this.f22623j, this.f22625l, list, this.f22636w, this.f22622i | z6, z6, this.f22637x, this.f22619f, this.f22618e, (Looper) o2.a.e(this.f22634u), this.f22624k, (u1) o2.a.e(this.f22638y));
        gVar.e(aVar);
        if (this.f22626m != -9223372036854775807L) {
            gVar.e(null);
        }
        return gVar;
    }

    private v0.g x(List<m.b> list, boolean z6, w.a aVar, boolean z7) {
        v0.g w6 = w(list, z6, aVar);
        if (u(w6) && !this.f22629p.isEmpty()) {
            D();
            G(w6, aVar);
            w6 = w(list, z6, aVar);
        }
        if (!u(w6) || !z7 || this.f22628o.isEmpty()) {
            return w6;
        }
        E();
        if (!this.f22629p.isEmpty()) {
            D();
        }
        G(w6, aVar);
        return w(list, z6, aVar);
    }

    private static List<m.b> y(m mVar, UUID uuid, boolean z6) {
        ArrayList arrayList = new ArrayList(mVar.f22684i);
        for (int i7 = 0; i7 < mVar.f22684i; i7++) {
            m.b i8 = mVar.i(i7);
            if ((i8.h(uuid) || (r0.j.f20685c.equals(uuid) && i8.h(r0.j.f20684b))) && (i8.f22689j != null || z6)) {
                arrayList.add(i8);
            }
        }
        return arrayList;
    }

    private synchronized void z(Looper looper) {
        Looper looper2 = this.f22634u;
        if (looper2 == null) {
            this.f22634u = looper;
            this.f22635v = new Handler(looper);
        } else {
            o2.a.f(looper2 == looper);
            o2.a.e(this.f22635v);
        }
    }

    public void F(int i7, byte[] bArr) {
        o2.a.f(this.f22627n.isEmpty());
        if (i7 == 1 || i7 == 3) {
            o2.a.e(bArr);
        }
        this.f22636w = i7;
        this.f22637x = bArr;
    }

    @Override // v0.y
    public final void W() {
        int i7 = this.f22630q;
        this.f22630q = i7 + 1;
        if (i7 != 0) {
            return;
        }
        if (this.f22631r == null) {
            g0 a7 = this.f22617d.a(this.f22616c);
            this.f22631r = a7;
            a7.c(new c());
        } else if (this.f22626m != -9223372036854775807L) {
            for (int i8 = 0; i8 < this.f22627n.size(); i8++) {
                this.f22627n.get(i8).e(null);
            }
        }
    }

    @Override // v0.y
    public final void a() {
        int i7 = this.f22630q - 1;
        this.f22630q = i7;
        if (i7 != 0) {
            return;
        }
        if (this.f22626m != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f22627n);
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                ((v0.g) arrayList.get(i8)).c(null);
            }
        }
        E();
        C();
    }

    @Override // v0.y
    public y.b b(w.a aVar, s1 s1Var) {
        o2.a.f(this.f22630q > 0);
        o2.a.h(this.f22634u);
        f fVar = new f(aVar);
        fVar.d(s1Var);
        return fVar;
    }

    @Override // v0.y
    public void c(Looper looper, u1 u1Var) {
        z(looper);
        this.f22638y = u1Var;
    }

    @Override // v0.y
    public o d(w.a aVar, s1 s1Var) {
        o2.a.f(this.f22630q > 0);
        o2.a.h(this.f22634u);
        return t(this.f22634u, aVar, s1Var, true);
    }

    @Override // v0.y
    public int e(s1 s1Var) {
        int l7 = ((g0) o2.a.e(this.f22631r)).l();
        m mVar = s1Var.f20959t;
        if (mVar != null) {
            if (v(mVar)) {
                return l7;
            }
            return 1;
        }
        if (o2.m0.y0(this.f22621h, o2.v.k(s1Var.f20956q)) != -1) {
            return l7;
        }
        return 0;
    }
}
