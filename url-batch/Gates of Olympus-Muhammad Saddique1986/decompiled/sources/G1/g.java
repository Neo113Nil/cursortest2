package G1;

import B.C0022x;
import B.Y;
import C0.q;
import R1.y;
import S1.A;
import S1.v;
import a.AbstractC0235a;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Base64;
import com.gatesof.olympus.martu.marku.data.db.AppDatabase_Impl;
import h1.C0485c;
import h1.C0491i;
import h1.C0494l;
import h1.M;
import h1.Q;
import h1.W;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k2.C0571c;
import l.AbstractC0576b;
import l.J;
import l.K;
import m.InterfaceC0605A;
import m.InterfaceC0633s;
import m.r;
import m.x0;
import m.y0;
import m1.t;
import m1.u;
import n1.C0719a;
import n1.C0720b;
import p.C0758d0;
import q2.AbstractC0831s;
import q2.AbstractC0837y;
import q2.C0821h;
import q2.C0827n;
import q2.C0832t;
import q2.InterfaceC0835w;
import q2.S;
import q2.U;
import q2.X;
import q2.f0;
import t2.InterfaceC1053f;
import w1.AbstractC1176C;
import w1.C1174A;
import w1.C1182e;

/* loaded from: classes.dex */
public final class g implements b, x0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2092d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2093e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2094f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2095g;

    /* renamed from: h, reason: collision with root package name */
    public Object f2096h;

    public /* synthetic */ g(int i3, Object obj) {
        this.f2092d = i3;
        this.f2093e = obj;
    }

    public q b() {
        Map unmodifiableMap;
        G2.n nVar = (G2.n) this.f2093e;
        if (nVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f2094f;
        G2.l b3 = ((G2.k) this.f2095g).b();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f2096h;
        byte[] bArr = H2.b.f2632a;
        f2.j.f(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = v.f4321d;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            f2.j.e(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new q(nVar, str, b3, (AbstractC0235a) null, unmodifiableMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(X1.c cVar) {
        C0491i c0491i;
        int i3;
        g gVar;
        C0485c c0485c;
        if (cVar instanceof C0491i) {
            c0491i = (C0491i) cVar;
            int i4 = c0491i.f6156j;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0491i.f6156j = i4 - Integer.MIN_VALUE;
                Object obj = c0491i.f6154h;
                W1.a aVar = W1.a.f4608d;
                i3 = c0491i.f6156j;
                if (i3 != 0) {
                    R1.a.e(obj);
                    List list = (List) this.f2095g;
                    M m3 = (M) this.f2096h;
                    if (list == null || list.isEmpty()) {
                        c0491i.f6153g = this;
                        c0491i.f6156j = 1;
                        obj = M.e(m3, false, c0491i);
                        if (obj == aVar) {
                            return aVar;
                        }
                        gVar = this;
                        c0485c = (C0485c) obj;
                    } else {
                        W f3 = m3.f();
                        C0494l c0494l = new C0494l(m3, this, null);
                        c0491i.f6153g = this;
                        c0491i.f6156j = 2;
                        obj = f3.b(c0494l, c0491i);
                        if (obj == aVar) {
                            return aVar;
                        }
                        gVar = this;
                        c0485c = (C0485c) obj;
                    }
                } else if (i3 == 1) {
                    gVar = c0491i.f6153g;
                    R1.a.e(obj);
                    c0485c = (C0485c) obj;
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = c0491i.f6153g;
                    R1.a.e(obj);
                    c0485c = (C0485c) obj;
                }
                ((M) gVar.f2096h).f6098j.s(c0485c);
                return y.f4171a;
            }
        }
        c0491i = new C0491i(this, cVar);
        Object obj2 = c0491i.f6154h;
        W1.a aVar2 = W1.a.f4608d;
        i3 = c0491i.f6156j;
        if (i3 != 0) {
        }
        ((M) gVar.f2096h).f6098j.s(c0485c);
        return y.f4171a;
    }

    @Override // m.w0
    public r d(long j3, r rVar, r rVar2, r rVar3) {
        if (((r) this.f2095g) == null) {
            this.f2095g = rVar3.c();
        }
        r rVar4 = (r) this.f2095g;
        if (rVar4 == null) {
            f2.j.j("velocityVector");
            throw null;
        }
        int b3 = rVar4.b();
        for (int i3 = 0; i3 < b3; i3++) {
            r rVar5 = (r) this.f2095g;
            if (rVar5 == null) {
                f2.j.j("velocityVector");
                throw null;
            }
            rVar5.e(((InterfaceC0633s) this.f2093e).get(i3).c(j3, rVar.a(i3), rVar2.a(i3), rVar3.a(i3)), i3);
        }
        r rVar6 = (r) this.f2095g;
        if (rVar6 != null) {
            return rVar6;
        }
        f2.j.j("velocityVector");
        throw null;
    }

    @Override // G1.b
    public Object delete(h hVar, V1.d dVar) {
        return w1.h.a((AppDatabase_Impl) this.f2093e, new e(this, hVar, 1), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(K2.g gVar) {
        f2.j.f(gVar, "call");
        ArrayDeque arrayDeque = (ArrayDeque) this.f2096h;
        synchronized (this) {
            if (!arrayDeque.remove(gVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        byte[] bArr = H2.b.f2632a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f2094f).iterator();
                f2.j.e(it, "readyAsyncCalls.iterator()");
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    if (((ArrayDeque) this.f2095g).size() < 64) {
                        throw null;
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.f2095g).size();
                    ((ArrayDeque) this.f2096h).size();
                }
                if (arrayList.size() <= 0) {
                    if (arrayList.get(0) != null) {
                        throw new ClassCastException();
                    }
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f2093e) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = H2.b.f2638g + " Dispatcher";
                                f2.j.f(str, "name");
                                this.f2093e = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new H2.a(str, false));
                            }
                            f2.j.c((ThreadPoolExecutor) this.f2093e);
                        } finally {
                        }
                    }
                    throw null;
                }
                return;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList.size() <= 0) {
        }
    }

    @Override // m.w0
    public r f(long j3, r rVar, r rVar2, r rVar3) {
        if (((r) this.f2094f) == null) {
            this.f2094f = rVar.c();
        }
        r rVar4 = (r) this.f2094f;
        if (rVar4 == null) {
            f2.j.j("valueVector");
            throw null;
        }
        int b3 = rVar4.b();
        for (int i3 = 0; i3 < b3; i3++) {
            r rVar5 = (r) this.f2094f;
            if (rVar5 == null) {
                f2.j.j("valueVector");
                throw null;
            }
            rVar5.e(((InterfaceC0633s) this.f2093e).get(i3).b(j3, rVar.a(i3), rVar2.a(i3), rVar3.a(i3)), i3);
        }
        r rVar6 = (r) this.f2094f;
        if (rVar6 != null) {
            return rVar6;
        }
        f2.j.j("valueVector");
        throw null;
    }

    @Override // m.w0
    public long g(r rVar, r rVar2, r rVar3) {
        Iterator it = O2.d.g0(0, rVar.b()).iterator();
        long j3 = 0;
        while (((C0571c) it).f6424f) {
            int a3 = ((A) it).a();
            j3 = Math.max(j3, ((InterfaceC0633s) this.f2093e).get(a3).d(rVar.a(a3), rVar2.a(a3), rVar3.a(a3)));
        }
        return j3;
    }

    @Override // G1.b
    public Object getById(long j3, V1.d dVar) {
        C1174A b3 = C1174A.b("SELECT * FROM clients WHERE id = ? LIMIT 1", 1);
        b3.A(j3, 1);
        CancellationSignal cancellationSignal = new CancellationSignal();
        f fVar = new f(this, b3, 2);
        AppDatabase_Impl appDatabase_Impl = (AppDatabase_Impl) this.f2093e;
        if (appDatabase_Impl.j() && appDatabase_Impl.g().t().h()) {
            return fVar.call();
        }
        if (dVar.t().v(AbstractC1176C.f9850d) != null) {
            throw new ClassCastException();
        }
        AbstractC0831s b4 = w1.h.b(appDatabase_Impl);
        C0821h c0821h = new C0821h(1, l0.c.B(dVar));
        c0821h.r();
        c0821h.v(new C0758d0(cancellationSignal, 14, AbstractC0837y.r(S.f7870d, b4, null, new w1.g(fVar, c0821h, null), 2)));
        return c0821h.q();
    }

    @Override // m.w0
    public r h(r rVar, r rVar2, r rVar3) {
        if (((r) this.f2096h) == null) {
            this.f2096h = rVar3.c();
        }
        r rVar4 = (r) this.f2096h;
        if (rVar4 == null) {
            f2.j.j("endVelocityVector");
            throw null;
        }
        int b3 = rVar4.b();
        for (int i3 = 0; i3 < b3; i3++) {
            r rVar5 = (r) this.f2096h;
            if (rVar5 == null) {
                f2.j.j("endVelocityVector");
                throw null;
            }
            rVar5.e(((InterfaceC0633s) this.f2093e).get(i3).f(rVar.a(i3), rVar2.a(i3), rVar3.a(i3)), i3);
        }
        r rVar6 = (r) this.f2096h;
        if (rVar6 != null) {
            return rVar6;
        }
        f2.j.j("endVelocityVector");
        throw null;
    }

    public r i(long j3, r rVar, r rVar2) {
        if (((r) this.f2095g) == null) {
            this.f2095g = rVar.c();
        }
        r rVar3 = (r) this.f2095g;
        if (rVar3 == null) {
            f2.j.j("velocityVector");
            throw null;
        }
        int b3 = rVar3.b();
        for (int i3 = 0; i3 < b3; i3++) {
            r rVar4 = (r) this.f2095g;
            if (rVar4 == null) {
                f2.j.j("velocityVector");
                throw null;
            }
            rVar.getClass();
            long j4 = j3 / 1000000;
            J a3 = ((K) ((Y) this.f2093e).f334d).a(rVar2.a(i3));
            long j5 = a3.f6461c;
            rVar4.e((((Math.signum(a3.f6459a) * AbstractC0576b.a(j5 > 0 ? j4 / j5 : 1.0f).f6473b) * a3.f6460b) / j5) * 1000.0f, i3);
        }
        r rVar5 = (r) this.f2095g;
        if (rVar5 != null) {
            return rVar5;
        }
        f2.j.j("velocityVector");
        throw null;
    }

    @Override // G1.b
    public Object insert(h hVar, V1.d dVar) {
        return w1.h.a((AppDatabase_Impl) this.f2093e, new e(this, hVar, 0), dVar);
    }

    public void j(String str, String str2) {
        f2.j.f(str2, "value");
        G2.k kVar = (G2.k) this.f2095g;
        kVar.getClass();
        l0.c.l(str);
        l0.c.o(str2, str);
        kVar.j(str);
        kVar.a(str, str2);
    }

    public void k(String str, AbstractC0235a abstractC0235a) {
        f2.j.f(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (abstractC0235a == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
            }
        } else if (!l0.c.J(str)) {
            throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
        }
        this.f2094f = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083 A[Catch: all -> 0x00a2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00a2, blocks: (B:25:0x006c, B:29:0x0083), top: B:24:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v7, types: [y2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(X1.c cVar) {
        Q q3;
        int i3;
        y2.c cVar2;
        g gVar;
        y2.a aVar;
        Throwable th;
        C0827n c0827n;
        g gVar2;
        try {
            if (cVar instanceof Q) {
                q3 = (Q) cVar;
                int i4 = q3.f6113k;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    q3.f6113k = i4 - Integer.MIN_VALUE;
                    Object obj = q3.f6111i;
                    W1.a aVar2 = W1.a.f4608d;
                    i3 = q3.f6113k;
                    y yVar = y.f4171a;
                    if (i3 != 0) {
                        R1.a.e(obj);
                        C0827n c0827n2 = (C0827n) this.f2094f;
                        c0827n2.getClass();
                        if (!(f0.f7895d.get(c0827n2) instanceof U)) {
                            return yVar;
                        }
                        q3.f6109g = this;
                        cVar2 = (y2.c) this.f2093e;
                        q3.f6110h = cVar2;
                        q3.f6113k = 1;
                        if (cVar2.c(null, q3) == aVar2) {
                            return aVar2;
                        }
                        gVar = this;
                    } else {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = q3.f6110h;
                            gVar2 = q3.f6109g;
                            try {
                                R1.a.e(obj);
                                ((C0827n) gVar2.f2094f).V(yVar);
                                ((y2.c) aVar).e(null);
                                return yVar;
                            } catch (Throwable th2) {
                                th = th2;
                                ((y2.c) aVar).e(null);
                                throw th;
                            }
                        }
                        ?? r22 = q3.f6110h;
                        gVar = q3.f6109g;
                        R1.a.e(obj);
                        cVar2 = r22;
                    }
                    c0827n = (C0827n) gVar.f2094f;
                    c0827n.getClass();
                    if (f0.f7895d.get(c0827n) instanceof U) {
                        cVar2.e(null);
                        return yVar;
                    }
                    q3.f6109g = gVar;
                    q3.f6110h = cVar2;
                    q3.f6113k = 2;
                    if (gVar.c(q3) == aVar2) {
                        return aVar2;
                    }
                    aVar = cVar2;
                    gVar2 = gVar;
                    ((C0827n) gVar2.f2094f).V(yVar);
                    ((y2.c) aVar).e(null);
                    return yVar;
                }
            }
            c0827n = (C0827n) gVar.f2094f;
            c0827n.getClass();
            if (f0.f7895d.get(c0827n) instanceof U) {
            }
        } catch (Throwable th3) {
            aVar = cVar2;
            th = th3;
            ((y2.c) aVar).e(null);
            throw th;
        }
        q3 = new Q(this, cVar);
        Object obj2 = q3.f6111i;
        W1.a aVar22 = W1.a.f4608d;
        i3 = q3.f6113k;
        y yVar2 = y.f4171a;
        if (i3 != 0) {
        }
    }

    @Override // G1.b
    public InterfaceC1053f observeAll() {
        f fVar = new f(this, C1174A.b("SELECT * FROM clients ORDER BY name COLLATE NOCASE ASC", 0), 0);
        return new H1.c(new C1182e((AppDatabase_Impl) this.f2093e, new String[]{"clients"}, fVar, null));
    }

    @Override // G1.b
    public InterfaceC1053f observeStats() {
        f fVar = new f(this, C1174A.b("SELECT c.id AS id, c.name AS name, c.phone AS phone, c.note AS note, c.createdAt AS createdAt, COUNT(h.id) AS visitCount, COALESCE(SUM(h.price), 0) AS totalSpent FROM clients c LEFT JOIN haircuts h ON h.clientId = c.id GROUP BY c.id ORDER BY c.name COLLATE NOCASE ASC", 0), 1);
        return new H1.c(new C1182e((AppDatabase_Impl) this.f2093e, new String[]{"clients", "haircuts"}, fVar, null));
    }

    public String toString() {
        switch (this.f2092d) {
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f2093e) + ", mProviderPackage: " + ((String) this.f2094f) + ", mQuery: " + ((String) this.f2095g) + ", mCertificates:");
                int i3 = 0;
                while (true) {
                    List list = (List) this.f2096h;
                    if (i3 >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i3);
                    for (int i4 = 0; i4 < list2.size(); i4++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i4), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i3++;
                }
            default:
                return super.toString();
        }
    }

    @Override // G1.b
    public Object update(h hVar, V1.d dVar) {
        return w1.h.a((AppDatabase_Impl) this.f2093e, new e(this, hVar, 2), dVar);
    }

    public /* synthetic */ g(boolean z3) {
        this.f2092d = 2;
    }

    public g(InterfaceC0835w interfaceC0835w, A0.l lVar, h1.J j3) {
        this.f2092d = 5;
        this.f2093e = interfaceC0835w;
        this.f2094f = j3;
        this.f2095g = n.r.a(Integer.MAX_VALUE, 6, null);
        this.f2096h = new Y(25);
        X x3 = (X) interfaceC0835w.q().v(C0832t.f7929e);
        if (x3 != null) {
            x3.x(new C0022x(lVar, 18, this));
        }
    }

    public g(int i3) {
        this.f2092d = i3;
        switch (i3) {
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                this.f2096h = new LinkedHashMap();
                this.f2094f = "GET";
                this.f2095g = new G2.k(0);
                break;
            default:
                this.f2094f = new ArrayDeque();
                this.f2095g = new ArrayDeque();
                this.f2096h = new ArrayDeque();
                break;
        }
    }

    public g(AppDatabase_Impl appDatabase_Impl) {
        this.f2092d = 0;
        this.f2093e = appDatabase_Impl;
        this.f2094f = new c(appDatabase_Impl, 0);
        this.f2095g = new d(appDatabase_Impl, 0);
        this.f2096h = new d(appDatabase_Impl, 1);
    }

    public g(String str, String str2, String str3, List list) {
        this.f2092d = 3;
        str.getClass();
        this.f2093e = str;
        str2.getClass();
        this.f2094f = str2;
        this.f2095g = str3;
        list.getClass();
        this.f2096h = list;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
    }

    public g(Typeface typeface, C0720b c0720b) {
        int i3;
        int i4;
        this.f2092d = 8;
        this.f2096h = typeface;
        this.f2093e = c0720b;
        this.f2095g = new t(1024);
        int a3 = c0720b.a(6);
        if (a3 != 0) {
            int i5 = a3 + c0720b.f4350d;
            i3 = ((ByteBuffer) c0720b.f4353g).getInt(((ByteBuffer) c0720b.f4353g).getInt(i5) + i5);
        } else {
            i3 = 0;
        }
        this.f2094f = new char[i3 * 2];
        int a4 = c0720b.a(6);
        if (a4 != 0) {
            int i6 = a4 + c0720b.f4350d;
            i4 = ((ByteBuffer) c0720b.f4353g).getInt(((ByteBuffer) c0720b.f4353g).getInt(i6) + i6);
        } else {
            i4 = 0;
        }
        for (int i7 = 0; i7 < i4; i7++) {
            u uVar = new u(this, i7);
            C0719a c2 = uVar.c();
            int a5 = c2.a(4);
            Character.toChars(a5 != 0 ? ((ByteBuffer) c2.f4353g).getInt(a5 + c2.f4350d) : 0, (char[]) this.f2094f, i7 * 2);
            if (uVar.b() > 0) {
                ((t) this.f2095g).a(uVar, 0, uVar.b() - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public g(M m3, List list) {
        this.f2092d = 4;
        this.f2096h = m3;
        this.f2093e = y2.d.a();
        C0827n c0827n = new C0827n(true);
        c0827n.S(null);
        this.f2094f = c0827n;
        this.f2095g = S1.l.a1(list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(InterfaceC0605A interfaceC0605A) {
        this(6, new y0(interfaceC0605A));
        this.f2092d = 6;
    }
}
