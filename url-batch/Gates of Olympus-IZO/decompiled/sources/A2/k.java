package A2;

import F.C0047j0;
import F.D0;
import android.graphics.Typeface;
import android.util.Base64;
import e1.C0348K;
import e1.C0351N;
import e1.C0354c;
import e1.C0360i;
import e1.C0363l;
import e1.S;
import e1.X;
import e2.AbstractC0381e;
import e2.C0379c;
import h1.C0438i;
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
import k1.C0526a;
import k1.C0527b;
import k2.C0542n;
import k2.C0547t;
import k2.InterfaceC0550w;
import k2.U;
import k2.f0;
import l.AbstractC0557b;
import l.I;
import l.J;
import m.B0;
import m.InterfaceC0576A;
import m.InterfaceC0608s;

/* loaded from: classes.dex */
public final class k implements B0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107a;

    /* renamed from: b, reason: collision with root package name */
    public Object f108b;

    /* renamed from: c, reason: collision with root package name */
    public Object f109c;

    /* renamed from: d, reason: collision with root package name */
    public Object f110d;

    /* renamed from: e, reason: collision with root package name */
    public Object f111e;

    public /* synthetic */ k(int i3, Object obj) {
        this.f107a = i3;
        this.f108b = obj;
    }

    @Override // m.A0
    public m.r b(long j3, m.r rVar, m.r rVar2, m.r rVar3) {
        if (((m.r) this.f110d) == null) {
            this.f110d = rVar3.c();
        }
        m.r rVar4 = (m.r) this.f110d;
        if (rVar4 == null) {
            Z1.i.j("velocityVector");
            throw null;
        }
        int b2 = rVar4.b();
        for (int i3 = 0; i3 < b2; i3++) {
            m.r rVar5 = (m.r) this.f110d;
            if (rVar5 == null) {
                Z1.i.j("velocityVector");
                throw null;
            }
            rVar5.e(((InterfaceC0608s) this.f108b).get(i3).c(j3, rVar.a(i3), rVar2.a(i3), rVar3.a(i3)), i3);
        }
        m.r rVar6 = (m.r) this.f110d;
        if (rVar6 != null) {
            return rVar6;
        }
        Z1.i.j("velocityVector");
        throw null;
    }

    @Override // m.A0
    public m.r c(long j3, m.r rVar, m.r rVar2, m.r rVar3) {
        if (((m.r) this.f109c) == null) {
            this.f109c = rVar.c();
        }
        m.r rVar4 = (m.r) this.f109c;
        if (rVar4 == null) {
            Z1.i.j("valueVector");
            throw null;
        }
        int b2 = rVar4.b();
        for (int i3 = 0; i3 < b2; i3++) {
            m.r rVar5 = (m.r) this.f109c;
            if (rVar5 == null) {
                Z1.i.j("valueVector");
                throw null;
            }
            rVar5.e(((InterfaceC0608s) this.f108b).get(i3).b(j3, rVar.a(i3), rVar2.a(i3), rVar3.a(i3)), i3);
        }
        m.r rVar6 = (m.r) this.f109c;
        if (rVar6 != null) {
            return rVar6;
        }
        Z1.i.j("valueVector");
        throw null;
    }

    @Override // m.A0
    public long d(m.r rVar, m.r rVar2, m.r rVar3) {
        Iterator it = AbstractC0381e.Q(0, rVar.b()).iterator();
        long j3 = 0;
        while (((C0379c) it).f4773f) {
            int a3 = ((M1.A) it).a();
            j3 = Math.max(j3, ((InterfaceC0608s) this.f108b).get(a3).d(rVar.a(a3), rVar2.a(a3), rVar3.a(a3)));
        }
        return j3;
    }

    @Override // m.A0
    public m.r e(m.r rVar, m.r rVar2, m.r rVar3) {
        if (((m.r) this.f111e) == null) {
            this.f111e = rVar3.c();
        }
        m.r rVar4 = (m.r) this.f111e;
        if (rVar4 == null) {
            Z1.i.j("endVelocityVector");
            throw null;
        }
        int b2 = rVar4.b();
        for (int i3 = 0; i3 < b2; i3++) {
            m.r rVar5 = (m.r) this.f111e;
            if (rVar5 == null) {
                Z1.i.j("endVelocityVector");
                throw null;
            }
            rVar5.e(((InterfaceC0608s) this.f108b).get(i3).f(rVar.a(i3), rVar2.a(i3), rVar3.a(i3)), i3);
        }
        m.r rVar6 = (m.r) this.f111e;
        if (rVar6 != null) {
            return rVar6;
        }
        Z1.i.j("endVelocityVector");
        throw null;
    }

    public w f() {
        Map unmodifiableMap;
        q qVar = (q) this.f108b;
        if (qVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f109c;
        o b2 = ((n) this.f110d).b();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f111e;
        byte[] bArr = B2.c.f415a;
        Z1.i.f(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = M1.v.f2804d;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            Z1.i.e(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new w(qVar, str, b2, (M1.B) null, unmodifiableMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(R1.c cVar) {
        C0360i c0360i;
        int i3;
        k kVar;
        C0354c c0354c;
        if (cVar instanceof C0360i) {
            c0360i = (C0360i) cVar;
            int i4 = c0360i.f4703g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0360i.f4703g = i4 - Integer.MIN_VALUE;
                Object obj = c0360i.f4701e;
                Q1.a aVar = Q1.a.f3113d;
                i3 = c0360i.f4703g;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    List list = (List) this.f110d;
                    C0351N c0351n = (C0351N) this.f111e;
                    if (list == null || list.isEmpty()) {
                        c0360i.f4700d = this;
                        c0360i.f4703g = 1;
                        obj = C0351N.c(c0351n, false, c0360i);
                        if (obj == aVar) {
                            return aVar;
                        }
                        kVar = this;
                        c0354c = (C0354c) obj;
                    } else {
                        X d3 = c0351n.d();
                        C0363l c0363l = new C0363l(c0351n, this, null);
                        c0360i.f4700d = this;
                        c0360i.f4703g = 2;
                        obj = d3.b(c0363l, c0360i);
                        if (obj == aVar) {
                            return aVar;
                        }
                        kVar = this;
                        c0354c = (C0354c) obj;
                    }
                } else if (i3 == 1) {
                    kVar = c0360i.f4700d;
                    I2.l.Q(obj);
                    c0354c = (C0354c) obj;
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kVar = c0360i.f4700d;
                    I2.l.Q(obj);
                    c0354c = (C0354c) obj;
                }
                ((C0351N) kVar.f111e).f4645g.v(c0354c);
                return L1.z.f2729a;
            }
        }
        c0360i = new C0360i(this, cVar);
        Object obj2 = c0360i.f4701e;
        Q1.a aVar2 = Q1.a.f3113d;
        i3 = c0360i.f4703g;
        if (i3 != 0) {
        }
        ((C0351N) kVar.f111e).f4645g.v(c0354c);
        return L1.z.f2729a;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(E2.h hVar) {
        Z1.i.f(hVar, "call");
        ArrayDeque arrayDeque = (ArrayDeque) this.f111e;
        synchronized (this) {
            if (!arrayDeque.remove(hVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        byte[] bArr = B2.c.f415a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f109c).iterator();
                Z1.i.e(it, "readyAsyncCalls.iterator()");
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    if (((ArrayDeque) this.f110d).size() < 64) {
                        throw null;
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.f110d).size();
                    ((ArrayDeque) this.f111e).size();
                }
                if (arrayList.size() <= 0) {
                    if (arrayList.get(0) != null) {
                        throw new ClassCastException();
                    }
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f108b) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = B2.c.f421g + " Dispatcher";
                                Z1.i.f(str, "name");
                                this.f108b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new B2.b(str, false));
                            }
                            Z1.i.c((ThreadPoolExecutor) this.f108b);
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

    public m.r i(long j3, m.r rVar, m.r rVar2) {
        if (((m.r) this.f110d) == null) {
            this.f110d = rVar.c();
        }
        m.r rVar3 = (m.r) this.f110d;
        if (rVar3 == null) {
            Z1.i.j("velocityVector");
            throw null;
        }
        int b2 = rVar3.b();
        for (int i3 = 0; i3 < b2; i3++) {
            m.r rVar4 = (m.r) this.f110d;
            if (rVar4 == null) {
                Z1.i.j("velocityVector");
                throw null;
            }
            rVar.getClass();
            long j4 = j3 / 1000000;
            I a3 = ((J) ((g) this.f108b).f83b).a(rVar2.a(i3));
            long j5 = a3.f5440c;
            rVar4.e((((Math.signum(a3.f5438a) * AbstractC0557b.a(j5 > 0 ? j4 / j5 : 1.0f).f5452b) * a3.f5439b) / j5) * 1000.0f, i3);
        }
        m.r rVar5 = (m.r) this.f110d;
        if (rVar5 != null) {
            return rVar5;
        }
        Z1.i.j("velocityVector");
        throw null;
    }

    public void j(String str, String str2) {
        Z1.i.f(str2, "value");
        n nVar = (n) this.f110d;
        nVar.getClass();
        I2.d.p(str);
        I2.d.t(str2, str);
        nVar.k(str);
        nVar.a(str, str2);
    }

    public void k(String str, M1.B b2) {
        Z1.i.f(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (!str.equals("POST") && !str.equals("PUT") && !str.equals("PATCH") && !str.equals("PROPPATCH") && !str.equals("REPORT")) {
            this.f109c = str;
            return;
        }
        throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083 A[Catch: all -> 0x00a2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00a2, blocks: (B:25:0x006c, B:29:0x0083), top: B:24:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v7, types: [s2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(R1.c cVar) {
        S s3;
        int i3;
        s2.c cVar2;
        k kVar;
        s2.a aVar;
        Throwable th;
        C0542n c0542n;
        k kVar2;
        try {
            if (cVar instanceof S) {
                s3 = (S) cVar;
                int i4 = s3.f4660h;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    s3.f4660h = i4 - Integer.MIN_VALUE;
                    Object obj = s3.f4658f;
                    Q1.a aVar2 = Q1.a.f3113d;
                    i3 = s3.f4660h;
                    L1.z zVar = L1.z.f2729a;
                    if (i3 != 0) {
                        I2.l.Q(obj);
                        C0542n c0542n2 = (C0542n) this.f109c;
                        c0542n2.getClass();
                        if (!(f0.f5356d.get(c0542n2) instanceof U)) {
                            return zVar;
                        }
                        s3.f4656d = this;
                        cVar2 = (s2.c) this.f108b;
                        s3.f4657e = cVar2;
                        s3.f4660h = 1;
                        if (cVar2.c(null, s3) == aVar2) {
                            return aVar2;
                        }
                        kVar = this;
                    } else {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = s3.f4657e;
                            kVar2 = s3.f4656d;
                            try {
                                I2.l.Q(obj);
                                ((C0542n) kVar2.f109c).R(zVar);
                                ((s2.c) aVar).e(null);
                                return zVar;
                            } catch (Throwable th2) {
                                th = th2;
                                ((s2.c) aVar).e(null);
                                throw th;
                            }
                        }
                        ?? r22 = s3.f4657e;
                        kVar = s3.f4656d;
                        I2.l.Q(obj);
                        cVar2 = r22;
                    }
                    c0542n = (C0542n) kVar.f109c;
                    c0542n.getClass();
                    if (f0.f5356d.get(c0542n) instanceof U) {
                        cVar2.e(null);
                        return zVar;
                    }
                    s3.f4656d = kVar;
                    s3.f4657e = cVar2;
                    s3.f4660h = 2;
                    if (kVar.g(s3) == aVar2) {
                        return aVar2;
                    }
                    aVar = cVar2;
                    kVar2 = kVar;
                    ((C0542n) kVar2.f109c).R(zVar);
                    ((s2.c) aVar).e(null);
                    return zVar;
                }
            }
            c0542n = (C0542n) kVar.f109c;
            c0542n.getClass();
            if (f0.f5356d.get(c0542n) instanceof U) {
            }
        } catch (Throwable th3) {
            aVar = cVar2;
            th = th3;
            ((s2.c) aVar).e(null);
            throw th;
        }
        s3 = new S(this, cVar);
        Object obj2 = s3.f4658f;
        Q1.a aVar22 = Q1.a.f3113d;
        i3 = s3.f4660h;
        L1.z zVar2 = L1.z.f2729a;
        if (i3 != 0) {
        }
    }

    public String toString() {
        switch (this.f107a) {
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f108b) + ", mProviderPackage: " + ((String) this.f109c) + ", mQuery: " + ((String) this.f110d) + ", mCertificates:");
                int i3 = 0;
                while (true) {
                    List list = (List) this.f111e;
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

    public /* synthetic */ k(boolean z3) {
        this.f107a = 1;
    }

    public k(InterfaceC0550w interfaceC0550w, C0047j0 c0047j0, C0348K c0348k) {
        this.f107a = 4;
        this.f108b = interfaceC0550w;
        this.f109c = c0348k;
        this.f110d = m2.l.a(Integer.MAX_VALUE, 6, null);
        this.f111e = new g(21);
        k2.X x3 = (k2.X) interfaceC0550w.u().k(C0547t.f5390e);
        if (x3 != null) {
            x3.L(new D0(c0047j0, 11, this));
        }
    }

    public k(int i3) {
        this.f107a = i3;
        switch (i3) {
            case 1:
                this.f111e = new LinkedHashMap();
                this.f109c = "GET";
                this.f110d = new n(0);
                break;
            default:
                this.f109c = new ArrayDeque();
                this.f110d = new ArrayDeque();
                this.f111e = new ArrayDeque();
                break;
        }
    }

    public k(String str, String str2, String str3, List list) {
        this.f107a = 2;
        str.getClass();
        this.f108b = str;
        str2.getClass();
        this.f109c = str2;
        this.f110d = str3;
        list.getClass();
        this.f111e = list;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
    }

    public k(Typeface typeface, C0527b c0527b) {
        int i3;
        int i4;
        this.f107a = 5;
        this.f111e = typeface;
        this.f108b = c0527b;
        this.f110d = new j1.s(1024);
        int a3 = c0527b.a(6);
        if (a3 != 0) {
            int i5 = a3 + c0527b.f2871d;
            i3 = ((ByteBuffer) c0527b.f2874g).getInt(((ByteBuffer) c0527b.f2874g).getInt(i5) + i5);
        } else {
            i3 = 0;
        }
        this.f109c = new char[i3 * 2];
        int a4 = c0527b.a(6);
        if (a4 != 0) {
            int i6 = a4 + c0527b.f2871d;
            i4 = ((ByteBuffer) c0527b.f2874g).getInt(((ByteBuffer) c0527b.f2874g).getInt(i6) + i6);
        } else {
            i4 = 0;
        }
        for (int i7 = 0; i7 < i4; i7++) {
            j1.t tVar = new j1.t(this, i7);
            C0526a c3 = tVar.c();
            int a5 = c3.a(4);
            Character.toChars(a5 != 0 ? ((ByteBuffer) c3.f2874g).getInt(a5 + c3.f2871d) : 0, (char[]) this.f109c, i7 * 2);
            if (tVar.b() > 0) {
                ((j1.s) this.f110d).a(tVar, 0, tVar.b() - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public k(C0351N c0351n, List list) {
        this.f107a = 3;
        this.f111e = c0351n;
        this.f108b = s2.d.a();
        C0542n c0542n = new C0542n(true);
        c0542n.N(null);
        this.f109c = c0542n;
        this.f110d = M1.l.C0(list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(InterfaceC0576A interfaceC0576A) {
        this(6, new g(28, interfaceC0576A));
        this.f107a = 6;
    }
}
