package Y0;

import A.AbstractC0017m;
import A.C0028y;
import A.g0;
import A0.q;
import G.W0;
import W2.C0292n;
import W2.C0299v;
import W2.InterfaceC0280c0;
import W2.InterfaceC0302y;
import W2.Z;
import W2.k0;
import android.graphics.Typeface;
import android.util.Base64;
import d2.g;
import d2.h;
import d2.i;
import d2.j;
import d2.k;
import d2.m;
import d2.n;
import e3.d;
import f1.C0607a;
import f1.C0610d;
import f1.C0616j;
import f1.C0619m;
import f1.J;
import f1.K;
import f1.N;
import f1.S;
import f1.X;
import g2.C0638a;
import g2.e;
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
import k.AbstractC0736b;
import k.C0733I;
import k.C0734J;
import k1.p;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0792s;
import l.InterfaceC0756A;
import l.InterfaceC0793t;
import l.z0;
import l1.C0820a;
import m2.InterfaceC0860b;
import m2.InterfaceC0861c;
import m3.l;
import m3.u;
import o2.C0924c;
import o2.s;
import q.AbstractC1024c;
import y2.AbstractC1343r;
import z2.C1403G;
import z2.C1412P;

/* loaded from: classes.dex */
public final class b implements z0, InterfaceC0861c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4388d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4389e;

    /* renamed from: i, reason: collision with root package name */
    public Object f4390i;

    /* renamed from: j, reason: collision with root package name */
    public Object f4391j;

    /* renamed from: k, reason: collision with root package name */
    public Object f4392k;

    public /* synthetic */ b(int i2, Object obj) {
        this.f4388d = i2;
        this.f4390i = obj;
    }

    public static n h(List list, Map map, Comparator comparator) {
        b bVar = new b(map, list);
        Collections.sort(list, comparator);
        m mVar = new m(list.size());
        int i2 = mVar.f6086e - 1;
        int size = list.size();
        while (i2 >= 0) {
            boolean z4 = (mVar.f6085d & ((long) (1 << i2))) == 0;
            int pow = (int) Math.pow(2.0d, i2);
            i2--;
            size -= pow;
            if (z4) {
                bVar.k(2, pow, size);
            } else {
                bVar.k(2, pow, size);
                size -= pow;
                bVar.k(1, pow, size);
            }
        }
        i iVar = (k) bVar.f4391j;
        if (iVar == null) {
            iVar = h.f6077a;
        }
        return new n(iVar, comparator);
    }

    @Override // l.x0
    public long b(AbstractC0792s abstractC0792s, AbstractC0792s abstractC0792s2, AbstractC0792s abstractC0792s3) {
        R2.b it = kotlin.ranges.b.h(0, abstractC0792s.b()).iterator();
        long j4 = 0;
        while (it.f3947i) {
            int b4 = it.b();
            j4 = Math.max(j4, ((InterfaceC0793t) this.f4390i).get(b4).d(abstractC0792s.a(b4), abstractC0792s2.a(b4), abstractC0792s3.a(b4)));
        }
        return j4;
    }

    @Override // l.x0
    public AbstractC0792s c(AbstractC0792s abstractC0792s, AbstractC0792s abstractC0792s2, AbstractC0792s abstractC0792s3) {
        if (((AbstractC0792s) this.f4389e) == null) {
            this.f4389e = abstractC0792s3.c();
        }
        AbstractC0792s abstractC0792s4 = (AbstractC0792s) this.f4389e;
        if (abstractC0792s4 == null) {
            Intrinsics.g("endVelocityVector");
            throw null;
        }
        int b4 = abstractC0792s4.b();
        for (int i2 = 0; i2 < b4; i2++) {
            AbstractC0792s abstractC0792s5 = (AbstractC0792s) this.f4389e;
            if (abstractC0792s5 == null) {
                Intrinsics.g("endVelocityVector");
                throw null;
            }
            abstractC0792s5.e(((InterfaceC0793t) this.f4390i).get(i2).f(abstractC0792s.a(i2), abstractC0792s2.a(i2), abstractC0792s3.a(i2)), i2);
        }
        AbstractC0792s abstractC0792s6 = (AbstractC0792s) this.f4389e;
        if (abstractC0792s6 != null) {
            return abstractC0792s6;
        }
        Intrinsics.g("endVelocityVector");
        throw null;
    }

    public q d() {
        Map unmodifiableMap;
        m3.m mVar = (m3.m) this.f4391j;
        if (mVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f4390i;
        l b4 = ((W0) this.f4392k).b();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f4389e;
        byte[] bArr = n3.b.f8558a;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = C1412P.c();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new q(mVar, str, b4, (u) null, unmodifiableMap);
    }

    public i e(int i2, int i4) {
        if (i4 == 0) {
            return h.f6077a;
        }
        Map map = (Map) this.f4390i;
        List list = (List) this.f4389e;
        if (i4 == 1) {
            Object obj = list.get(i2);
            return new g(obj, map.get(obj), null, null);
        }
        int i5 = i4 / 2;
        int i6 = i2 + i5;
        i e4 = e(i2, i5);
        i e5 = e(i6 + 1, i5);
        Object obj2 = list.get(i6);
        return new g(obj2, map.get(obj2), e4, e5);
    }

    @Override // l.x0
    public AbstractC0792s f(long j4, AbstractC0792s abstractC0792s, AbstractC0792s abstractC0792s2, AbstractC0792s abstractC0792s3) {
        if (((AbstractC0792s) this.f4391j) == null) {
            this.f4391j = abstractC0792s.c();
        }
        AbstractC0792s abstractC0792s4 = (AbstractC0792s) this.f4391j;
        if (abstractC0792s4 == null) {
            Intrinsics.g("valueVector");
            throw null;
        }
        int b4 = abstractC0792s4.b();
        for (int i2 = 0; i2 < b4; i2++) {
            AbstractC0792s abstractC0792s5 = (AbstractC0792s) this.f4391j;
            if (abstractC0792s5 == null) {
                Intrinsics.g("valueVector");
                throw null;
            }
            abstractC0792s5.e(((InterfaceC0793t) this.f4390i).get(i2).b(j4, abstractC0792s.a(i2), abstractC0792s2.a(i2), abstractC0792s3.a(i2)), i2);
        }
        AbstractC0792s abstractC0792s6 = (AbstractC0792s) this.f4391j;
        if (abstractC0792s6 != null) {
            return abstractC0792s6;
        }
        Intrinsics.g("valueVector");
        throw null;
    }

    @Override // l.x0
    public AbstractC0792s g(long j4, AbstractC0792s abstractC0792s, AbstractC0792s abstractC0792s2, AbstractC0792s abstractC0792s3) {
        if (((AbstractC0792s) this.f4392k) == null) {
            this.f4392k = abstractC0792s3.c();
        }
        AbstractC0792s abstractC0792s4 = (AbstractC0792s) this.f4392k;
        if (abstractC0792s4 == null) {
            Intrinsics.g("velocityVector");
            throw null;
        }
        int b4 = abstractC0792s4.b();
        for (int i2 = 0; i2 < b4; i2++) {
            AbstractC0792s abstractC0792s5 = (AbstractC0792s) this.f4392k;
            if (abstractC0792s5 == null) {
                Intrinsics.g("velocityVector");
                throw null;
            }
            abstractC0792s5.e(((InterfaceC0793t) this.f4390i).get(i2).c(j4, abstractC0792s.a(i2), abstractC0792s2.a(i2), abstractC0792s3.a(i2)), i2);
        }
        AbstractC0792s abstractC0792s6 = (AbstractC0792s) this.f4392k;
        if (abstractC0792s6 != null) {
            return abstractC0792s6;
        }
        Intrinsics.g("velocityVector");
        throw null;
    }

    @Override // m2.InterfaceC0861c
    public o2.l getIndex() {
        return (o2.l) this.f4391j;
    }

    @Override // m2.InterfaceC0861c
    public C0607a j() {
        return (C0607a) this.f4390i;
    }

    public void k(int i2, int i4, int i5) {
        i e4 = e(i5 + 1, i4 - 1);
        Object obj = ((List) this.f4389e).get(i5);
        Map map = (Map) this.f4390i;
        k jVar = i2 == 1 ? new j(obj, map.get(obj), null, e4) : new g(obj, map.get(obj), null, e4);
        if (((k) this.f4391j) == null) {
            this.f4391j = jVar;
            this.f4392k = jVar;
        } else {
            ((k) this.f4392k).r(jVar);
            this.f4392k = jVar;
        }
    }

    @Override // m2.InterfaceC0861c
    public o2.m l(o2.m mVar, C0924c c0924c, s sVar, e eVar, InterfaceC0860b interfaceC0860b, C0638a c0638a) {
        if (!u(new o2.q(c0924c, sVar))) {
            sVar = o2.k.f8939k;
        }
        return ((C0607a) this.f4390i).l(mVar, c0924c, sVar, eVar, interfaceC0860b, c0638a);
    }

    @Override // m2.InterfaceC0861c
    public o2.m m(o2.m mVar, o2.m mVar2, C0638a c0638a) {
        o2.m mVar3;
        if (mVar2.f8941d.y()) {
            mVar3 = new o2.m(o2.k.f8939k, (o2.l) this.f4391j);
        } else {
            o2.m mVar4 = new o2.m(mVar2.f8941d.f(o2.k.f8939k), mVar2.f8943i, mVar2.f8942e);
            Iterator it = mVar2.iterator();
            mVar3 = mVar4;
            while (it.hasNext()) {
                o2.q qVar = (o2.q) it.next();
                if (!u(qVar)) {
                    mVar3 = mVar3.h(qVar.f8950a, o2.k.f8939k);
                }
            }
        }
        ((C0607a) this.f4390i).m(mVar, mVar3, c0638a);
        return mVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(E2.c cVar) {
        C0616j c0616j;
        int i2;
        b bVar;
        C0610d c0610d;
        if (cVar instanceof C0616j) {
            c0616j = (C0616j) cVar;
            int i4 = c0616j.f6585m;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0616j.f6585m = i4 - Integer.MIN_VALUE;
                Object obj = c0616j.f6583k;
                D2.a aVar = D2.a.f2163d;
                i2 = c0616j.f6585m;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    List list = (List) this.f4389e;
                    N n2 = (N) this.f4392k;
                    if (list == null || list.isEmpty()) {
                        c0616j.f6582j = this;
                        c0616j.f6585m = 1;
                        obj = N.c(n2, false, c0616j);
                        if (obj == aVar) {
                            return aVar;
                        }
                        bVar = this;
                        c0610d = (C0610d) obj;
                    } else {
                        X e4 = n2.e();
                        C0619m c0619m = new C0619m(n2, this, null);
                        c0616j.f6582j = this;
                        c0616j.f6585m = 2;
                        obj = e4.b(c0619m, c0616j);
                        if (obj == aVar) {
                            return aVar;
                        }
                        bVar = this;
                        c0610d = (C0610d) obj;
                    }
                } else if (i2 == 1) {
                    bVar = c0616j.f6582j;
                    AbstractC1343r.b(obj);
                    c0610d = (C0610d) obj;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = c0616j.f6582j;
                    AbstractC1343r.b(obj);
                    c0610d = (C0610d) obj;
                }
                ((N) bVar.f4392k).f6525m.y(c0610d);
                return Unit.f7487a;
            }
        }
        c0616j = new C0616j(this, cVar);
        Object obj2 = c0616j.f6583k;
        D2.a aVar2 = D2.a.f2163d;
        i2 = c0616j.f6585m;
        if (i2 != 0) {
        }
        ((N) bVar.f4392k).f6525m.y(c0610d);
        return Unit.f7487a;
    }

    @Override // m2.InterfaceC0861c
    public o2.m o(o2.m mVar, s sVar) {
        return mVar;
    }

    @Override // m2.InterfaceC0861c
    public boolean p() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b7 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r(q3.g call) {
        Intrinsics.checkNotNullParameter(call, "call");
        ArrayDeque arrayDeque = (ArrayDeque) this.f4389e;
        synchronized (this) {
            if (!arrayDeque.remove(call)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            Unit unit = Unit.f7487a;
        }
        byte[] bArr = n3.b.f8558a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f4391j).iterator();
                Intrinsics.checkNotNullExpressionValue(it, "readyAsyncCalls.iterator()");
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    if (((ArrayDeque) this.f4392k).size() < 64) {
                        throw null;
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.f4392k).size();
                    ((ArrayDeque) this.f4389e).size();
                }
                if (arrayList.size() <= 0) {
                    if (arrayList.get(0) != null) {
                        throw new ClassCastException();
                    }
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f4390i) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String name = n3.b.f8564g + " Dispatcher";
                                Intrinsics.checkNotNullParameter(name, "name");
                                this.f4390i = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new n3.a(name, false));
                            }
                            Intrinsics.c((ThreadPoolExecutor) this.f4390i);
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

    public AbstractC0792s s(long j4, AbstractC0792s abstractC0792s, AbstractC0792s abstractC0792s2) {
        if (((AbstractC0792s) this.f4392k) == null) {
            this.f4392k = abstractC0792s.c();
        }
        AbstractC0792s abstractC0792s3 = (AbstractC0792s) this.f4392k;
        if (abstractC0792s3 == null) {
            Intrinsics.g("velocityVector");
            throw null;
        }
        int b4 = abstractC0792s3.b();
        for (int i2 = 0; i2 < b4; i2++) {
            AbstractC0792s abstractC0792s4 = (AbstractC0792s) this.f4392k;
            if (abstractC0792s4 == null) {
                Intrinsics.g("velocityVector");
                throw null;
            }
            abstractC0792s.getClass();
            long j5 = j4 / 1000000;
            C0733I a4 = ((C0734J) ((C0607a) this.f4390i).f6561e).a(abstractC0792s2.a(i2));
            long j6 = a4.f7261c;
            abstractC0792s4.e((((Math.signum(a4.f7259a) * AbstractC0736b.a(j6 > 0 ? j5 / j6 : 1.0f).f7273b) * a4.f7260b) / j6) * 1000.0f, i2);
        }
        AbstractC0792s abstractC0792s5 = (AbstractC0792s) this.f4392k;
        if (abstractC0792s5 != null) {
            return abstractC0792s5;
        }
        Intrinsics.g("velocityVector");
        throw null;
    }

    public void t(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        W0 w02 = (W0) this.f4392k;
        w02.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        u3.l.R(name);
        u3.l.T(value, name);
        w02.m(name);
        w02.a(name, value);
    }

    public String toString() {
        switch (this.f4388d) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f4390i) + ", mProviderPackage: " + ((String) this.f4391j) + ", mQuery: " + ((String) this.f4392k) + ", mCertificates:");
                int i2 = 0;
                while (true) {
                    List list = (List) this.f4389e;
                    if (i2 >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i2);
                    for (int i4 = 0; i4 < list2.size(); i4++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i4), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i2++;
                }
            default:
                return super.toString();
        }
    }

    public boolean u(o2.q qVar) {
        o2.l lVar = (o2.l) this.f4391j;
        return lVar.compare((o2.q) this.f4392k, qVar) <= 0 && lVar.compare(qVar, (o2.q) this.f4389e) <= 0;
    }

    public void v(String method, u uVar) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (method.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        Intrinsics.checkNotNullParameter(method, "method");
        if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT")) {
            throw new IllegalArgumentException(AbstractC0017m.j("method ", method, " must have a request body.").toString());
        }
        this.f4390i = method;
    }

    public void w(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        ((W0) this.f4392k).m(name);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e A[Catch: all -> 0x0086, TRY_LEAVE, TryCatch #1 {all -> 0x0086, blocks: (B:25:0x006d, B:27:0x007e, B:30:0x008a), top: B:24:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a A[Catch: all -> 0x0086, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0086, blocks: (B:25:0x006d, B:27:0x007e, B:30:0x008a), top: B:24:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v7, types: [e3.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object x(E2.c cVar) {
        S s4;
        int i2;
        e3.c cVar2;
        b bVar;
        e3.a aVar;
        Throwable th;
        C0292n c0292n;
        b bVar2;
        try {
            if (cVar instanceof S) {
                s4 = (S) cVar;
                int i4 = s4.f6540n;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    s4.f6540n = i4 - Integer.MIN_VALUE;
                    Object obj = s4.f6538l;
                    D2.a aVar2 = D2.a.f2163d;
                    i2 = s4.f6540n;
                    if (i2 != 0) {
                        AbstractC1343r.b(obj);
                        C0292n c0292n2 = (C0292n) this.f4391j;
                        c0292n2.getClass();
                        if (!(k0.f4279d.get(c0292n2) instanceof Z)) {
                            return Unit.f7487a;
                        }
                        s4.f6536j = this;
                        cVar2 = (e3.c) this.f4390i;
                        s4.f6537k = cVar2;
                        s4.f6540n = 1;
                        if (cVar2.c(null, s4) == aVar2) {
                            return aVar2;
                        }
                        bVar = this;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = s4.f6537k;
                            bVar2 = s4.f6536j;
                            try {
                                AbstractC1343r.b(obj);
                                C0292n c0292n3 = (C0292n) bVar2.f4391j;
                                Unit unit = Unit.f7487a;
                                c0292n3.U(unit);
                                ((e3.c) aVar).e(null);
                                return unit;
                            } catch (Throwable th2) {
                                th = th2;
                                ((e3.c) aVar).e(null);
                                throw th;
                            }
                        }
                        ?? r2 = s4.f6537k;
                        bVar = s4.f6536j;
                        AbstractC1343r.b(obj);
                        cVar2 = r2;
                    }
                    c0292n = (C0292n) bVar.f4391j;
                    c0292n.getClass();
                    if (k0.f4279d.get(c0292n) instanceof Z) {
                        Unit unit2 = Unit.f7487a;
                        cVar2.e(null);
                        return unit2;
                    }
                    s4.f6536j = bVar;
                    s4.f6537k = cVar2;
                    s4.f6540n = 2;
                    if (bVar.n(s4) == aVar2) {
                        return aVar2;
                    }
                    aVar = cVar2;
                    bVar2 = bVar;
                    C0292n c0292n32 = (C0292n) bVar2.f4391j;
                    Unit unit3 = Unit.f7487a;
                    c0292n32.U(unit3);
                    ((e3.c) aVar).e(null);
                    return unit3;
                }
            }
            c0292n = (C0292n) bVar.f4391j;
            c0292n.getClass();
            if (k0.f4279d.get(c0292n) instanceof Z) {
            }
        } catch (Throwable th3) {
            aVar = cVar2;
            th = th3;
            ((e3.c) aVar).e(null);
            throw th;
        }
        s4 = new S(this, cVar);
        Object obj2 = s4.f6538l;
        D2.a aVar22 = D2.a.f2163d;
        i2 = s4.f6540n;
        if (i2 != 0) {
        }
    }

    public /* synthetic */ b(boolean z4) {
        this.f4388d = 9;
    }

    public b(InterfaceC0302y scope, g0 onComplete, K consumeMessage) {
        this.f4388d = 3;
        J onUndeliveredElement = J.f6504d;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        this.f4390i = scope;
        this.f4391j = consumeMessage;
        this.f4392k = Y2.l.a(Integer.MAX_VALUE, 6, null);
        this.f4389e = new C0607a(0);
        InterfaceC0280c0 interfaceC0280c0 = (InterfaceC0280c0) scope.q().k(C0299v.f4296e);
        if (interfaceC0280c0 != null) {
            interfaceC0280c0.r(new C0028y(onComplete, 16, this));
        }
    }

    public b(l2.h hVar) {
        o2.q qVar;
        o2.q d4;
        this.f4388d = 7;
        o2.l lVar = hVar.f7983e;
        this.f4390i = new C0607a(12, lVar);
        this.f4391j = lVar;
        if (hVar.b()) {
            if (hVar.b()) {
                C0924c c0924c = hVar.f7980b;
                c0924c = c0924c == null ? C0924c.f8917e : c0924c;
                o2.l lVar2 = hVar.f7983e;
                if (hVar.b()) {
                    qVar = lVar2.c(c0924c, hVar.f7979a);
                } else {
                    throw new IllegalArgumentException("Cannot get index start value if start has not been set");
                }
            } else {
                throw new IllegalArgumentException("Cannot get index start name if start has not been set");
            }
        } else {
            qVar = o2.q.f8948c;
        }
        this.f4392k = qVar;
        s sVar = hVar.f7981c;
        if (sVar == null) {
            d4 = hVar.f7983e.d();
        } else if (sVar != null) {
            C0924c c0924c2 = hVar.f7982d;
            c0924c2 = c0924c2 == null ? C0924c.f8918i : c0924c2;
            o2.l lVar3 = hVar.f7983e;
            if (sVar != null) {
                d4 = lVar3.c(c0924c2, sVar);
            } else {
                throw new IllegalArgumentException("Cannot get index end value if start has not been set");
            }
        } else {
            throw new IllegalArgumentException("Cannot get index end name if start has not been set");
        }
        this.f4389e = d4;
    }

    public b(int i2) {
        this.f4388d = i2;
        switch (i2) {
            case AbstractC1024c.f9242c /* 9 */:
                this.f4389e = new LinkedHashMap();
                this.f4390i = "GET";
                this.f4392k = new W0(4);
                break;
            default:
                this.f4391j = new ArrayDeque();
                this.f4392k = new ArrayDeque();
                this.f4389e = new ArrayDeque();
                break;
        }
    }

    public b(String str, String str2, String str3, List list) {
        this.f4388d = 0;
        str.getClass();
        this.f4390i = str;
        str2.getClass();
        this.f4391j = str2;
        this.f4392k = str3;
        list.getClass();
        this.f4389e = list;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
    }

    public b(Typeface typeface, l1.b bVar) {
        int i2;
        int i4;
        this.f4388d = 4;
        this.f4389e = typeface;
        this.f4390i = bVar;
        this.f4392k = new p(1024);
        int b4 = bVar.b(6);
        if (b4 != 0) {
            int i5 = b4 + bVar.f835d;
            i2 = ((ByteBuffer) bVar.f838j).getInt(((ByteBuffer) bVar.f838j).getInt(i5) + i5);
        } else {
            i2 = 0;
        }
        this.f4391j = new char[i2 * 2];
        int b5 = bVar.b(6);
        if (b5 != 0) {
            int i6 = b5 + bVar.f835d;
            i4 = ((ByteBuffer) bVar.f838j).getInt(((ByteBuffer) bVar.f838j).getInt(i6) + i6);
        } else {
            i4 = 0;
        }
        for (int i7 = 0; i7 < i4; i7++) {
            k1.q qVar = new k1.q(this, i7);
            C0820a c4 = qVar.c();
            int b6 = c4.b(4);
            Character.toChars(b6 != 0 ? ((ByteBuffer) c4.f838j).getInt(b6 + c4.f835d) : 0, (char[]) this.f4391j, i7 * 2);
            if (qVar.b() > 0) {
                ((p) this.f4392k).a(qVar, 0, qVar.b() - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public b(Map map, List list) {
        this.f4388d = 1;
        this.f4389e = list;
        this.f4390i = map;
    }

    public b(N n2, List initTasksList) {
        this.f4388d = 2;
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        this.f4392k = n2;
        this.f4390i = d.a();
        C0292n c0292n = new C0292n(true);
        c0292n.R(null);
        this.f4391j = c0292n;
        this.f4389e = C1403G.H(initTasksList);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC0756A interfaceC0756A) {
        this(5, new C0607a(9, interfaceC0756A));
        this.f4388d = 5;
    }
}
