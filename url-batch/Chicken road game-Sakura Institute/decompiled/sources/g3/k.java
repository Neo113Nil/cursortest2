package g3;

import android.graphics.Typeface;
import android.util.Base64;
import c7.f1;
import c7.u0;
import c7.x0;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l.a2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k implements a2, r5.c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4159f;

    /* renamed from: g, reason: collision with root package name */
    public Object f4160g;

    /* renamed from: h, reason: collision with root package name */
    public Object f4161h;

    /* renamed from: i, reason: collision with root package name */
    public Object f4162i;

    /* renamed from: j, reason: collision with root package name */
    public Object f4163j;

    public /* synthetic */ k(int i7, Object obj) {
        this.f4159f = i7;
        this.f4160g = obj;
    }

    public static i5.n o(List list, Map map, Comparator comparator) {
        k kVar = new k(list, map);
        Collections.sort(list, comparator);
        i5.m mVar = new i5.m(list.size());
        int i7 = mVar.f4952g - 1;
        int size = list.size();
        while (i7 >= 0) {
            boolean z8 = (((long) (1 << i7)) & mVar.f4951f) == 0;
            int pow = (int) Math.pow(2.0d, i7);
            i7--;
            size -= pow;
            if (z8) {
                kVar.p(2, pow, size);
            } else {
                kVar.p(2, pow, size);
                size -= pow;
                kVar.p(1, pow, size);
            }
        }
        i5.i iVar = (i5.k) kVar.f4161h;
        if (iVar == null) {
            iVar = i5.h.f4943a;
        }
        return new i5.n(iVar, comparator);
    }

    @Override // l.y1
    public long b(l.q qVar, l.q qVar2, l.q qVar3) {
        Iterator it = v1.g.o(0, qVar.b()).iterator();
        long j8 = 0;
        while (((w6.c) it).f9526h) {
            int nextInt = ((e6.b0) it).nextInt();
            j8 = Math.max(j8, ((l.r) this.f4160g).get(nextInt).d(qVar.a(nextInt), qVar2.a(nextInt), qVar3.a(nextInt)));
        }
        return j8;
    }

    @Override // l.y1
    public l.q c(l.q qVar, l.q qVar2, l.q qVar3) {
        if (((l.q) this.f4163j) == null) {
            this.f4163j = qVar3.c();
        }
        l.q qVar4 = (l.q) this.f4163j;
        if (qVar4 == null) {
            r6.k.j("endVelocityVector");
            throw null;
        }
        int b9 = qVar4.b();
        for (int i7 = 0; i7 < b9; i7++) {
            l.q qVar5 = (l.q) this.f4163j;
            if (qVar5 == null) {
                r6.k.j("endVelocityVector");
                throw null;
            }
            qVar5.e(((l.r) this.f4160g).get(i7).e(qVar.a(i7), qVar2.a(i7), qVar3.a(i7)), i7);
        }
        l.q qVar6 = (l.q) this.f4163j;
        if (qVar6 != null) {
            return qVar6;
        }
        r6.k.j("endVelocityVector");
        throw null;
    }

    @Override // r5.c
    public t5.m d(t5.m mVar, t5.c cVar, t5.s sVar, l5.f fVar, r5.b bVar, l5.a aVar) {
        if (!u(new t5.q(cVar, sVar))) {
            sVar = t5.k.f8908j;
        }
        return ((l1.x) this.f4160g).d(mVar, cVar, sVar, fVar, bVar, aVar);
    }

    @Override // l.y1
    public l.q e(long j8, l.q qVar, l.q qVar2, l.q qVar3) {
        if (((l.q) this.f4161h) == null) {
            this.f4161h = qVar.c();
        }
        l.q qVar4 = (l.q) this.f4161h;
        if (qVar4 == null) {
            r6.k.j("valueVector");
            throw null;
        }
        int b9 = qVar4.b();
        for (int i7 = 0; i7 < b9; i7++) {
            l.q qVar5 = (l.q) this.f4161h;
            if (qVar5 == null) {
                r6.k.j("valueVector");
                throw null;
            }
            qVar5.e(((l.r) this.f4160g).get(i7).b(j8, qVar.a(i7), qVar2.a(i7), qVar3.a(i7)), i7);
        }
        l.q qVar6 = (l.q) this.f4161h;
        if (qVar6 != null) {
            return qVar6;
        }
        r6.k.j("valueVector");
        throw null;
    }

    @Override // l.y1
    public l.q f(long j8, l.q qVar, l.q qVar2, l.q qVar3) {
        if (((l.q) this.f4162i) == null) {
            this.f4162i = qVar3.c();
        }
        l.q qVar4 = (l.q) this.f4162i;
        if (qVar4 == null) {
            r6.k.j("velocityVector");
            throw null;
        }
        int b9 = qVar4.b();
        for (int i7 = 0; i7 < b9; i7++) {
            l.q qVar5 = (l.q) this.f4162i;
            if (qVar5 == null) {
                r6.k.j("velocityVector");
                throw null;
            }
            qVar5.e(((l.r) this.f4160g).get(i7).c(j8, qVar.a(i7), qVar2.a(i7), qVar3.a(i7)), i7);
        }
        l.q qVar6 = (l.q) this.f4162i;
        if (qVar6 != null) {
            return qVar6;
        }
        r6.k.j("velocityVector");
        throw null;
    }

    @Override // r5.c
    public l1.x g() {
        return (l1.x) this.f4160g;
    }

    @Override // r5.c
    public t5.l getIndex() {
        return (t5.l) this.f4161h;
    }

    @Override // r5.c
    public boolean h() {
        return true;
    }

    @Override // r5.c
    public t5.m i(t5.m mVar, t5.m mVar2, l5.a aVar) {
        t5.m mVar3;
        if (mVar2.f8910f.i()) {
            mVar3 = new t5.m(t5.k.f8908j, (t5.l) this.f4161h);
        } else {
            mVar3 = new t5.m(mVar2.f8910f.n(t5.k.f8908j), mVar2.f8912h, mVar2.f8911g);
            Iterator it = mVar2.iterator();
            while (it.hasNext()) {
                t5.q qVar = (t5.q) it.next();
                if (!u(qVar)) {
                    mVar3 = mVar3.g(qVar.f8919a, t5.k.f8908j);
                }
            }
        }
        ((l1.x) this.f4160g).i(mVar, mVar3, aVar);
        return mVar3;
    }

    public a2.q m() {
        Map unmodifiableMap;
        s7.l lVar = (s7.l) this.f4160g;
        if (lVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f4161h;
        s7.k d8 = ((f1.g) this.f4162i).d();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f4163j;
        byte[] bArr = t7.b.f8932a;
        r6.k.f(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = e6.v.f2827f;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            r6.k.e(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new a2.q(lVar, str, d8, (r4.a) null, unmodifiableMap);
    }

    public i5.i n(int i7, int i8) {
        Map map = (Map) this.f4160g;
        List list = (List) this.f4162i;
        if (i8 == 0) {
            return i5.h.f4943a;
        }
        if (i8 == 1) {
            Object obj = list.get(i7);
            return new i5.g(obj, map.get(obj), null, null);
        }
        int i9 = i8 / 2;
        int i10 = i7 + i9;
        i5.i n8 = n(i7, i9);
        i5.i n9 = n(i10 + 1, i9);
        Object obj2 = list.get(i10);
        return new i5.g(obj2, map.get(obj2), n8, n9);
    }

    public void p(int i7, int i8, int i9) {
        Map map = (Map) this.f4160g;
        i5.i n8 = n(i9 + 1, i8 - 1);
        Object obj = ((List) this.f4162i).get(i9);
        i5.k jVar = i7 == 1 ? new i5.j(obj, map.get(obj), null, n8) : new i5.g(obj, map.get(obj), null, n8);
        if (((i5.k) this.f4161h) == null) {
            this.f4161h = jVar;
            this.f4163j = jVar;
        } else {
            ((i5.k) this.f4163j).j(jVar);
            this.f4163j = jVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q(j6.c cVar) {
        g gVar;
        int i7;
        k kVar;
        c cVar2;
        a0 a0Var = (a0) this.f4163j;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i8 = gVar.f4126i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                gVar.f4126i = i8 - Integer.MIN_VALUE;
                Object obj = gVar.f4124g;
                i7 = gVar.f4126i;
                if (i7 != 0) {
                    d6.a.e(obj);
                    List list = (List) this.f4162i;
                    i6.a aVar = i6.a.f4956f;
                    if (list == null || list.isEmpty()) {
                        gVar.f4123f = this;
                        gVar.f4126i = 1;
                        obj = a0.c(a0Var, false, gVar);
                        if (obj != aVar) {
                            kVar = this;
                            cVar2 = (c) obj;
                        }
                    } else {
                        h0 e9 = a0Var.e();
                        j jVar = new j(a0Var, this, null);
                        gVar.f4123f = this;
                        gVar.f4126i = 2;
                        obj = e9.b(jVar, gVar);
                        if (obj != aVar) {
                            kVar = this;
                            cVar2 = (c) obj;
                        }
                    }
                    return aVar;
                }
                if (i7 == 1) {
                    kVar = gVar.f4123f;
                    d6.a.e(obj);
                    cVar2 = (c) obj;
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kVar = gVar.f4123f;
                    d6.a.e(obj);
                    cVar2 = (c) obj;
                }
                ((a0) kVar.f4163j).f4095l.C(cVar2);
                return d6.z.f2639a;
            }
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.f4124g;
        i7 = gVar.f4126i;
        if (i7 != 0) {
        }
        ((a0) kVar.f4163j).f4095l.C(cVar2);
        return d6.z.f2639a;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r(w7.g gVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f4163j;
        synchronized (this) {
            if (!arrayDeque.remove(gVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        byte[] bArr = t7.b.f8932a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f4161h).iterator();
                r6.k.e(it, "readyAsyncCalls.iterator()");
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    if (((ArrayDeque) this.f4162i).size() < 64) {
                        throw null;
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.f4162i).size();
                    ((ArrayDeque) this.f4163j).size();
                }
                if (arrayList.size() <= 0) {
                    if (arrayList.get(0) != null) {
                        throw new ClassCastException();
                    }
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f4160g) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = t7.b.f8938g + " Dispatcher";
                                r6.k.f(str, "name");
                                this.f4160g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new t7.a(str, false));
                            }
                            r6.k.c((ThreadPoolExecutor) this.f4160g);
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

    public l.q s(long j8, l.q qVar, l.q qVar2) {
        if (((l.q) this.f4162i) == null) {
            this.f4162i = qVar.c();
        }
        l.q qVar3 = (l.q) this.f4162i;
        if (qVar3 == null) {
            r6.k.j("velocityVector");
            throw null;
        }
        int b9 = qVar3.b();
        for (int i7 = 0; i7 < b9; i7++) {
            l.q qVar4 = (l.q) this.f4162i;
            if (qVar4 == null) {
                r6.k.j("velocityVector");
                throw null;
            }
            b6.c cVar = (b6.c) this.f4160g;
            qVar.getClass();
            long j9 = j8 / 1000000;
            k.k0 a3 = ((k.l0) cVar.f1394g).a(qVar2.a(i7));
            long j10 = a3.f5233c;
            qVar4.e((((Math.signum(a3.f5231a) * k.b.a(j10 > 0 ? j9 / j10 : 1.0f).f5172b) * a3.f5232b) / j10) * 1000.0f, i7);
        }
        l.q qVar5 = (l.q) this.f4162i;
        if (qVar5 != null) {
            return qVar5;
        }
        r6.k.j("velocityVector");
        throw null;
    }

    public void t(String str, String str2) {
        r6.k.f(str2, "value");
        f1.g gVar = (f1.g) this.f4162i;
        gVar.getClass();
        a8.d.t(str);
        a8.d.u(str2, str);
        gVar.p(str);
        gVar.c(str, str2);
    }

    public String toString() {
        switch (this.f4159f) {
            case q.c.f7259c /* 9 */:
                List list = (List) this.f4162i;
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f4160g) + ", mProviderPackage: " + ((String) this.f4161h) + ", mQuery: " + ((String) this.f4163j) + ", mCertificates:");
                for (int i7 = 0; i7 < list.size(); i7++) {
                    sb.append(" [");
                    List list2 = (List) list.get(i7);
                    for (int i8 = 0; i8 < list2.size(); i8++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i8), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                }
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public boolean u(t5.q qVar) {
        t5.l lVar = (t5.l) this.f4161h;
        return lVar.compare((t5.q) this.f4162i, qVar) <= 0 && lVar.compare(qVar, (t5.q) this.f4163j) <= 0;
    }

    public void v(String str, r4.a aVar) {
        r6.k.f(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (aVar == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(a0.m.j("method ", str, " must have a request body.").toString());
            }
        } else if (!u3.q.i(str)) {
            throw new IllegalArgumentException(a0.m.j("method ", str, " must not have a request body.").toString());
        }
        this.f4161h = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:13:0x0090, B:21:0x006b, B:23:0x0082), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [k7.a] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object w(j6.c cVar) {
        e0 e0Var;
        ?? r12;
        k kVar;
        k7.c cVar2;
        c7.n nVar;
        k kVar2;
        k7.c cVar3;
        try {
            if (cVar instanceof e0) {
                e0Var = (e0) cVar;
                int i7 = e0Var.f4117j;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    e0Var.f4117j = i7 - Integer.MIN_VALUE;
                    Object obj = e0Var.f4115h;
                    r12 = e0Var.f4117j;
                    d6.z zVar = d6.z.f2639a;
                    i6.a aVar = i6.a.f4956f;
                    if (r12 != 0) {
                        d6.a.e(obj);
                        c7.n nVar2 = (c7.n) this.f4161h;
                        nVar2.getClass();
                        if (!(f1.f1692f.get(nVar2) instanceof u0)) {
                            return zVar;
                        }
                        k7.c cVar4 = (k7.c) this.f4160g;
                        e0Var.f4113f = this;
                        e0Var.f4114g = cVar4;
                        e0Var.f4117j = 1;
                        if (cVar4.c(e0Var) != aVar) {
                            kVar = this;
                            cVar2 = cVar4;
                        }
                        return aVar;
                    }
                    if (r12 != 1) {
                        if (r12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        k7.a aVar2 = e0Var.f4114g;
                        kVar2 = e0Var.f4113f;
                        d6.a.e(obj);
                        r12 = aVar2;
                        ((c7.n) kVar2.f4161h).O(zVar);
                        cVar3 = r12;
                        return zVar;
                    }
                    ?? r13 = e0Var.f4114g;
                    kVar = e0Var.f4113f;
                    d6.a.e(obj);
                    cVar2 = r13;
                    nVar = (c7.n) kVar.f4161h;
                    nVar.getClass();
                    cVar3 = cVar2;
                    if (f1.f1692f.get(nVar) instanceof u0) {
                        e0Var.f4113f = kVar;
                        e0Var.f4114g = cVar2;
                        e0Var.f4117j = 2;
                        if (kVar.q(e0Var) != aVar) {
                            kVar2 = kVar;
                            r12 = cVar2;
                            ((c7.n) kVar2.f4161h).O(zVar);
                            cVar3 = r12;
                        }
                        return aVar;
                    }
                    return zVar;
                }
            }
            if (r12 != 0) {
            }
            nVar = (c7.n) kVar.f4161h;
            nVar.getClass();
            cVar3 = cVar2;
            if (f1.f1692f.get(nVar) instanceof u0) {
            }
            return zVar;
        } finally {
            ((k7.c) r12).e(null);
        }
        e0Var = new e0(this, cVar);
        Object obj2 = e0Var.f4115h;
        r12 = e0Var.f4117j;
        d6.z zVar2 = d6.z.f2639a;
        i6.a aVar3 = i6.a.f4956f;
    }

    public /* synthetic */ k(boolean z8) {
        this.f4159f = 8;
    }

    public k(c7.x xVar, c1.a aVar, o oVar) {
        this.f4159f = 1;
        this.f4160g = xVar;
        this.f4161h = oVar;
        this.f4162i = j1.c.C(Integer.MAX_VALUE, 6, null);
        this.f4163j = new b6.c(17);
        x0 x0Var = (x0) xVar.k().u(c7.u.f1748g);
        if (x0Var != null) {
            x0Var.I(new a0.y(aVar, 11, this));
        }
    }

    public k(q5.h hVar) {
        t5.q qVar;
        t5.q d8;
        this.f4159f = 6;
        t5.l lVar = hVar.f7534e;
        this.f4160g = new l1.x(11, lVar);
        this.f4161h = lVar;
        if (hVar.b()) {
            if (hVar.b()) {
                t5.c cVar = hVar.f7531b;
                cVar = cVar == null ? t5.c.f8886g : cVar;
                t5.l lVar2 = hVar.f7534e;
                if (hVar.b()) {
                    qVar = lVar2.c(cVar, hVar.f7530a);
                } else {
                    throw new IllegalArgumentException("Cannot get index start value if start has not been set");
                }
            } else {
                throw new IllegalArgumentException("Cannot get index start name if start has not been set");
            }
        } else {
            qVar = t5.q.f8917c;
        }
        this.f4162i = qVar;
        t5.s sVar = hVar.f7532c;
        if (sVar == null) {
            d8 = hVar.f7534e.d();
        } else if (sVar != null) {
            t5.c cVar2 = hVar.f7533d;
            cVar2 = cVar2 == null ? t5.c.f8887h : cVar2;
            t5.l lVar3 = hVar.f7534e;
            if (sVar != null) {
                d8 = lVar3.c(cVar2, sVar);
            } else {
                throw new IllegalArgumentException("Cannot get index end value if start has not been set");
            }
        } else {
            throw new IllegalArgumentException("Cannot get index end name if start has not been set");
        }
        this.f4163j = d8;
    }

    public k(int i7) {
        this.f4159f = i7;
        switch (i7) {
            case 8:
                this.f4163j = new LinkedHashMap();
                this.f4161h = "GET";
                this.f4162i = new f1.g(6);
                break;
            default:
                this.f4161h = new ArrayDeque();
                this.f4162i = new ArrayDeque();
                this.f4163j = new ArrayDeque();
                break;
        }
    }

    public k(String str, String str2, String str3, List list) {
        this.f4159f = 9;
        str.getClass();
        this.f4160g = str;
        str2.getClass();
        this.f4161h = str2;
        this.f4163j = str3;
        list.getClass();
        this.f4162i = list;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
    }

    public k(Typeface typeface, m3.b bVar) {
        int i7;
        int i8;
        int i9;
        int i10;
        this.f4159f = 5;
        this.f4163j = typeface;
        this.f4160g = bVar;
        this.f4162i = new l3.u(1024);
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i11 = a3 + bVar.f3413f;
            i7 = ((ByteBuffer) bVar.f3416i).getInt(((ByteBuffer) bVar.f3416i).getInt(i11) + i11);
        } else {
            i7 = 0;
        }
        this.f4161h = new char[i7 * 2];
        int a9 = bVar.a(6);
        if (a9 != 0) {
            int i12 = a9 + bVar.f3413f;
            i8 = ((ByteBuffer) bVar.f3416i).getInt(((ByteBuffer) bVar.f3416i).getInt(i12) + i12);
        } else {
            i8 = 0;
        }
        for (int i13 = 0; i13 < i8; i13++) {
            l3.v vVar = new l3.v(this, i13);
            m3.a b9 = vVar.b();
            int a10 = b9.a(4);
            Character.toChars(a10 != 0 ? ((ByteBuffer) b9.f3416i).getInt(a10 + b9.f3413f) : 0, (char[]) this.f4161h, i13 * 2);
            m3.a b10 = vVar.b();
            int a11 = b10.a(16);
            if (a11 != 0) {
                int i14 = a11 + b10.f3413f;
                i9 = ((ByteBuffer) b10.f3416i).getInt(((ByteBuffer) b10.f3416i).getInt(i14) + i14);
            } else {
                i9 = 0;
            }
            if (i9 > 0) {
                l3.u uVar = (l3.u) this.f4162i;
                m3.a b11 = vVar.b();
                int a12 = b11.a(16);
                if (a12 != 0) {
                    int i15 = a12 + b11.f3413f;
                    i10 = ((ByteBuffer) b11.f3416i).getInt(((ByteBuffer) b11.f3416i).getInt(i15) + i15);
                } else {
                    i10 = 0;
                }
                uVar.a(vVar, 0, i10 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public k(List list, Map map) {
        this.f4159f = 2;
        this.f4162i = list;
        this.f4160g = map;
    }

    public k(a0 a0Var, List list) {
        this.f4159f = 0;
        this.f4163j = a0Var;
        this.f4160g = new k7.c();
        c7.n nVar = new c7.n(true);
        nVar.K(null);
        this.f4161h = nVar;
        this.f4162i = e6.l.w0(list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(l.b0 b0Var) {
        this(3, new b6.c(28, b0Var));
        this.f4159f = 3;
    }

    @Override // r5.c
    public t5.m l(t5.m mVar, t5.s sVar) {
        return mVar;
    }
}
