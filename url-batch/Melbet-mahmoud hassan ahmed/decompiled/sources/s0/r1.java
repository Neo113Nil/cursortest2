package s0;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import r0.r3;
import s0.c;
import s0.t1;
import t1.x;

/* loaded from: classes.dex */
public final class r1 implements t1 {

    /* renamed from: h, reason: collision with root package name */
    public static final l4.o<String> f21519h = new l4.o() { // from class: s0.q1
        @Override // l4.o
        public final Object get() {
            String k7;
            k7 = r1.k();
            return k7;
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private static final Random f21520i = new Random();

    /* renamed from: a, reason: collision with root package name */
    private final r3.d f21521a;

    /* renamed from: b, reason: collision with root package name */
    private final r3.b f21522b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, a> f21523c;

    /* renamed from: d, reason: collision with root package name */
    private final l4.o<String> f21524d;

    /* renamed from: e, reason: collision with root package name */
    private t1.a f21525e;

    /* renamed from: f, reason: collision with root package name */
    private r3 f21526f;

    /* renamed from: g, reason: collision with root package name */
    private String f21527g;

    private final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f21528a;

        /* renamed from: b, reason: collision with root package name */
        private int f21529b;

        /* renamed from: c, reason: collision with root package name */
        private long f21530c;

        /* renamed from: d, reason: collision with root package name */
        private x.b f21531d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f21532e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f21533f;

        public a(String str, int i7, x.b bVar) {
            this.f21528a = str;
            this.f21529b = i7;
            this.f21530c = bVar == null ? -1L : bVar.f22252d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.f21531d = bVar;
        }

        private int l(r3 r3Var, r3 r3Var2, int i7) {
            if (i7 >= r3Var.t()) {
                if (i7 < r3Var2.t()) {
                    return i7;
                }
                return -1;
            }
            r3Var.r(i7, r1.this.f21521a);
            for (int i8 = r1.this.f21521a.f20941t; i8 <= r1.this.f21521a.f20942u; i8++) {
                int f7 = r3Var2.f(r3Var.q(i8));
                if (f7 != -1) {
                    return r3Var2.j(f7, r1.this.f21522b).f20914h;
                }
            }
            return -1;
        }

        public boolean i(int i7, x.b bVar) {
            if (bVar == null) {
                return i7 == this.f21529b;
            }
            x.b bVar2 = this.f21531d;
            return bVar2 == null ? !bVar.b() && bVar.f22252d == this.f21530c : bVar.f22252d == bVar2.f22252d && bVar.f22250b == bVar2.f22250b && bVar.f22251c == bVar2.f22251c;
        }

        public boolean j(c.a aVar) {
            long j7 = this.f21530c;
            if (j7 == -1) {
                return false;
            }
            x.b bVar = aVar.f21395d;
            if (bVar == null) {
                return this.f21529b != aVar.f21394c;
            }
            if (bVar.f22252d > j7) {
                return true;
            }
            if (this.f21531d == null) {
                return false;
            }
            int f7 = aVar.f21393b.f(bVar.f22249a);
            int f8 = aVar.f21393b.f(this.f21531d.f22249a);
            x.b bVar2 = aVar.f21395d;
            if (bVar2.f22252d < this.f21531d.f22252d || f7 < f8) {
                return false;
            }
            if (f7 > f8) {
                return true;
            }
            boolean b7 = bVar2.b();
            x.b bVar3 = aVar.f21395d;
            if (!b7) {
                int i7 = bVar3.f22253e;
                return i7 == -1 || i7 > this.f21531d.f22250b;
            }
            int i8 = bVar3.f22250b;
            int i9 = bVar3.f22251c;
            x.b bVar4 = this.f21531d;
            int i10 = bVar4.f22250b;
            return i8 > i10 || (i8 == i10 && i9 > bVar4.f22251c);
        }

        public void k(int i7, x.b bVar) {
            if (this.f21530c == -1 && i7 == this.f21529b && bVar != null) {
                this.f21530c = bVar.f22252d;
            }
        }

        public boolean m(r3 r3Var, r3 r3Var2) {
            int l7 = l(r3Var, r3Var2, this.f21529b);
            this.f21529b = l7;
            if (l7 == -1) {
                return false;
            }
            x.b bVar = this.f21531d;
            return bVar == null || r3Var2.f(bVar.f22249a) != -1;
        }
    }

    public r1() {
        this(f21519h);
    }

    public r1(l4.o<String> oVar) {
        this.f21524d = oVar;
        this.f21521a = new r3.d();
        this.f21522b = new r3.b();
        this.f21523c = new HashMap<>();
        this.f21526f = r3.f20909f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String k() {
        byte[] bArr = new byte[12];
        f21520i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private a l(int i7, x.b bVar) {
        a aVar = null;
        long j7 = Long.MAX_VALUE;
        for (a aVar2 : this.f21523c.values()) {
            aVar2.k(i7, bVar);
            if (aVar2.i(i7, bVar)) {
                long j8 = aVar2.f21530c;
                if (j8 == -1 || j8 < j7) {
                    aVar = aVar2;
                    j7 = j8;
                } else if (j8 == j7 && ((a) o2.m0.j(aVar)).f21531d != null && aVar2.f21531d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = this.f21524d.get();
        a aVar3 = new a(str, i7, bVar);
        this.f21523c.put(str, aVar3);
        return aVar3;
    }

    private void m(c.a aVar) {
        if (aVar.f21393b.u()) {
            this.f21527g = null;
            return;
        }
        a aVar2 = this.f21523c.get(this.f21527g);
        a l7 = l(aVar.f21394c, aVar.f21395d);
        this.f21527g = l7.f21528a;
        d(aVar);
        x.b bVar = aVar.f21395d;
        if (bVar == null || !bVar.b()) {
            return;
        }
        if (aVar2 != null && aVar2.f21530c == aVar.f21395d.f22252d && aVar2.f21531d != null && aVar2.f21531d.f22250b == aVar.f21395d.f22250b && aVar2.f21531d.f22251c == aVar.f21395d.f22251c) {
            return;
        }
        x.b bVar2 = aVar.f21395d;
        this.f21525e.k0(aVar, l(aVar.f21394c, new x.b(bVar2.f22249a, bVar2.f22252d)).f21528a, l7.f21528a);
    }

    @Override // s0.t1
    public synchronized String a() {
        return this.f21527g;
    }

    @Override // s0.t1
    public void b(t1.a aVar) {
        this.f21525e = aVar;
    }

    @Override // s0.t1
    public synchronized void c(c.a aVar) {
        o2.a.e(this.f21525e);
        r3 r3Var = this.f21526f;
        this.f21526f = aVar.f21393b;
        Iterator<a> it = this.f21523c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!next.m(r3Var, this.f21526f) || next.j(aVar)) {
                it.remove();
                if (next.f21532e) {
                    if (next.f21528a.equals(this.f21527g)) {
                        this.f21527g = null;
                    }
                    this.f21525e.q0(aVar, next.f21528a, false);
                }
            }
        }
        m(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1 A[Catch: all -> 0x0118, TryCatch #0 {, blocks: (B:4:0x0005, B:9:0x0014, B:12:0x0025, B:14:0x0030, B:20:0x003a, B:23:0x004b, B:25:0x0057, B:26:0x005d, B:28:0x0061, B:30:0x0067, B:32:0x0080, B:33:0x00db, B:35:0x00e1, B:36:0x00f7, B:38:0x0103, B:40:0x0109), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    @Override // s0.t1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void d(c.a aVar) {
        a aVar2;
        c.a aVar3;
        a aVar4;
        o2.a.e(this.f21525e);
        if (aVar.f21393b.u()) {
            return;
        }
        a aVar5 = this.f21523c.get(this.f21527g);
        if (aVar.f21395d != null && aVar5 != null) {
            boolean z6 = false;
            if (aVar5.f21530c != -1 ? aVar.f21395d.f22252d < aVar5.f21530c : aVar5.f21529b != aVar.f21394c) {
                z6 = true;
            }
            if (z6) {
                return;
            }
        }
        a l7 = l(aVar.f21394c, aVar.f21395d);
        if (this.f21527g == null) {
            this.f21527g = l7.f21528a;
        }
        x.b bVar = aVar.f21395d;
        if (bVar != null && bVar.b()) {
            x.b bVar2 = aVar.f21395d;
            x.b bVar3 = new x.b(bVar2.f22249a, bVar2.f22252d, bVar2.f22250b);
            a l8 = l(aVar.f21394c, bVar3);
            if (!l8.f21532e) {
                l8.f21532e = true;
                aVar.f21393b.l(aVar.f21395d.f22249a, this.f21522b);
                aVar2 = l7;
                this.f21525e.u(new c.a(aVar.f21392a, aVar.f21393b, aVar.f21394c, bVar3, Math.max(0L, o2.m0.Y0(this.f21522b.i(aVar.f21395d.f22250b)) + this.f21522b.p()), aVar.f21397f, aVar.f21398g, aVar.f21399h, aVar.f21400i, aVar.f21401j), l8.f21528a);
                if (aVar2.f21532e) {
                    aVar4 = aVar2;
                    aVar4.f21532e = true;
                    aVar3 = aVar;
                    this.f21525e.u(aVar3, aVar4.f21528a);
                } else {
                    aVar3 = aVar;
                    aVar4 = aVar2;
                }
                if (aVar4.f21528a.equals(this.f21527g) && !aVar4.f21533f) {
                    aVar4.f21533f = true;
                    this.f21525e.r(aVar3, aVar4.f21528a);
                }
            }
        }
        aVar2 = l7;
        if (aVar2.f21532e) {
        }
        if (aVar4.f21528a.equals(this.f21527g)) {
            aVar4.f21533f = true;
            this.f21525e.r(aVar3, aVar4.f21528a);
        }
    }

    @Override // s0.t1
    public synchronized void e(c.a aVar) {
        t1.a aVar2;
        this.f21527g = null;
        Iterator<a> it = this.f21523c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            it.remove();
            if (next.f21532e && (aVar2 = this.f21525e) != null) {
                aVar2.q0(aVar, next.f21528a, false);
            }
        }
    }

    @Override // s0.t1
    public synchronized String f(r3 r3Var, x.b bVar) {
        return l(r3Var.l(bVar.f22249a, this.f21522b).f20914h, bVar).f21528a;
    }

    @Override // s0.t1
    public synchronized void g(c.a aVar, int i7) {
        o2.a.e(this.f21525e);
        boolean z6 = i7 == 0;
        Iterator<a> it = this.f21523c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.j(aVar)) {
                it.remove();
                if (next.f21532e) {
                    boolean equals = next.f21528a.equals(this.f21527g);
                    boolean z7 = z6 && equals && next.f21533f;
                    if (equals) {
                        this.f21527g = null;
                    }
                    this.f21525e.q0(aVar, next.f21528a, z7);
                }
            }
        }
        m(aVar);
    }
}
